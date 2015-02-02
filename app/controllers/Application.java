package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class Application extends Controller {

    public static void index() {
        render();
    }
	
	public static void cases(String id) {
		TreeItem[] test = new TreeItem[1];
		TreeItem test2 = new TreeItem("Parent");
		test2.children.add(new TreeItem("Child"));
		test[0] = test2;
		if(id.equals("A"))
		{
			renderTemplate("Application/templateA.json", test, id);
		}
		else if(id.equals("B"))
		{
			renderTemplate("Application/templateB.json", test, id);
		}
		else if(id.equals("C"))
		{
			renderTemplate("Application/templateA2.json", test, id);
		}
		else if(id.equals("D"))
		{
			renderTemplate("Application/templateB2.json", test, id);
		}
	}

}