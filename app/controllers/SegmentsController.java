package controllers;

import javax.inject.Inject;

import db.MySQLCon;
import play.data.DynamicForm;
import play.data.FormFactory;
import play.mvc.*;
import play.twirl.api.Content;
import views.html.*;

public class SegmentsController extends Controller
{
	@Inject FormFactory formFactory;
	
	public Result backToSamples()
	{
		DynamicForm requestData = formFactory.form().bindFromRequest();
		String userId = requestData.get("backUserId");
		
		//render samples view
        MySQLCon db = new MySQLCon();
        Content html = samples.render(userId, db.getUserName(userId), db.getSamples(userId));
		return ok(html);
	}
}
