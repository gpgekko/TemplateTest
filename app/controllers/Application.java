package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class Application extends Controller {

    public static void index() {
        render();
    }
	
	public static void cases(String id, boolean noIncludes) {
		TreeItem test2 = new TreeItem("Parent");
		test2.children.add(new TreeItem("Child"));
		if(id.equals("A"))
		{
			TreeItem[] test = new TreeItem[1];
			test[0] = test2;
			renderTemplate("Application/templateA.json", test, id, noIncludes);
		}
		else if(id.equals("B"))
		{
			TreeItem test = test2;
			renderTemplate("Application/templateB.json", test, id, noIncludes);
		}
		else if(id.equals("C"))
		{
			TreeItem[] test = new TreeItem[1];
			test[0] = test2;
			renderTemplate("Application/templateA2.json", test, id, noIncludes);
		}
		else if(id.equals("D"))
		{
			TreeItem test = test2;
			renderTemplate("Application/templateB2.json", test, id, noIncludes);
		}
	}

}