package models;

import java.util.*;

public class TreeItem {

    public String id;
	public List<TreeItem> children;
	
	public TreeItem(String id)
	{
		this.id = id;
		this.children = new ArrayList<TreeItem>();
	}

}