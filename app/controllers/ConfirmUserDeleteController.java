package controllers;

import javax.inject.Inject;

import db.MySQLCon;
import play.data.*;
import play.mvc.*;
import play.twirl.api.Content;
import views.html.*;

public class ConfirmUserDeleteController extends Controller
{
	@Inject FormFactory formFactory;
	
	public Result confirm()
	{
		DynamicForm requestData = formFactory.form().bindFromRequest();
        String deleteUserId = requestData.get("deleteUserId");
        System.out.println("deleteUserId:"+deleteUserId);
        
        String userId = requestData.get("userId");
        System.out.println("userId:"+userId);
		
		MySQLCon db = new MySQLCon();
		db.test();
		
		if(deleteUserId == null || deleteUserId.equals(""))
		{
			//deleteUserId is null or empty --> cancel button was pressed
		}
		else
		{
			//deleteUserId is not empty or null --> confirm delete button was pressed
			db.deleteUser(deleteUserId);
		}
		
		//go back to users view
		Content html = users.render("Dolphin Image Processor", db.getUsers());
		return ok(html);
	}
}
