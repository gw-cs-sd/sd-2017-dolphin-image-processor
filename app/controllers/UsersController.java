package controllers;

import javax.inject.Inject;

import db.MySQLCon;
import play.data.*;
import play.mvc.*;
import play.twirl.api.Content;
import views.html.*;

public class UsersController extends Controller
{
	@Inject FormFactory formFactory; //this literally took years
	
	public Result addNewUser()
	{
		//needs to handle case where Add New User button is clicked with empty text field
		
		//secret way to get form data in Play framework
		DynamicForm requestData = formFactory.form().bindFromRequest();
		System.out.println("requestData.get().toString():"+requestData.get().toString());

        String newUserName = requestData.get("newUserName");//works
        System.out.println("newUserName:"+newUserName);
        String userId = requestData.get("userId");//works
        System.out.println("userId:"+userId);
        
        MySQLCon db = new MySQLCon();
        
        //if userId value is 0
        if(userId.equals("0") && (newUserName != null))
        {
        	//System.out.println("1 of X: Add New User");
        	
        	int output = db.addUser(newUserName);
        	//output is greater than 0 if successful
        	if (output != 0) {
        		userId = ((Integer)output).toString();
        	}
        	else
        	{
        		System.out.println("User " + newUserName + " already exists");
        	}
        	System.out.println("database assigned userId "+userId);
        }
        
        //this is temporary.
        //Should render the samples page for the user added
		Content html = users.render("Dolphin Image Processor", db.getUsers());
		return ok(html);
	}
	
	public Result requestDeleteUser()
	{
		DynamicForm requestData = formFactory.form().bindFromRequest();
		String userId = requestData.get("userId");
		MySQLCon db = new MySQLCon();
		
		//go to confirmUserDelete view
		Content html = confirmUserDelete.render(userId, db.getUserName(userId));
		return ok(html);
	}
	
	public Result loginUser()
	{
		DynamicForm requestData = formFactory.form().bindFromRequest();
		String userId = requestData.get("userId");
		MySQLCon db = new MySQLCon();
		
		//go to samples view for this user
		Content html = samples.render(userId, db.getUserName(userId), db.getSamples(userId));
		return ok(html);
	}
}
