package controllers;

import java.util.ArrayList;

import javax.inject.Inject;

import db.MySQLCon;
import models.DBSample;
import play.data.DynamicForm;
import play.data.FormFactory;
import play.mvc.*;
import play.twirl.api.Content;
import views.html.samples;

public class ConfirmSampleDeleteController extends Controller
{
@Inject FormFactory formFactory;
	
	public Result confirmSampleDelete()
	{
		DynamicForm requestData = formFactory.form().bindFromRequest();
        String deleteSampleId = requestData.get("deleteSampleId");
        System.out.println("deleteSampleId:"+deleteSampleId);
        
        String sampleId = requestData.get("sampleId");
        System.out.println("sampleId:"+sampleId);
		
		MySQLCon db = new MySQLCon();
		
		String userId;
		if(deleteSampleId == null || deleteSampleId.equals(""))
		{
			//deleteSampleId is null or empty --> cancel button was pressed
			userId = db.getSample(sampleId).getUserId();
		}
		else
		{
			//deleteSampleId is not empty or null --> confirm delete button was pressed
			userId = db.getSample(deleteSampleId).getUserId();
			db.deleteSample(deleteSampleId);
		}
		
		String userName = db.getUserName(userId);
		ArrayList<DBSample> arr = db.getSamples(userId);
		
		//go back to samples view
		//Content html = samples.render(userId, userName, samples);
		Content html = samples.render(userId, userName, arr);
		return ok(html);
	}
}
