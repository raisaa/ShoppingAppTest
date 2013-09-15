package com.example.shoppingapp.test;

/**This is a simple test foe layout*/

import com.example.shoppingapp.EditItemList;
import com.example.shoppingapp.R;
import android.test.ActivityInstrumentationTestCase2;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class LayoutTest extends ActivityInstrumentationTestCase2<EditItemList> {

	
	 private TextView editNewItemsTittle;  
	 private TextView itemTextView; 
	 private EditText textItem ; 
	 private Button editbutton; 
	 private Button deletebutton;
	 
	 
	public LayoutTest() {
		super("com.example.shoppingapp", EditItemList.class);
	}

	// The items that we want to test. They are some of the layout items in edititemlist.xml
	protected void setUp() throws Exception {
		super.setUp();
		
		EditItemList startTest = getActivity();  
		
		
		editNewItemsTittle = (TextView) startTest.findViewById(R.id.editNewItemsTittle);
		itemTextView = (TextView) startTest.findViewById(R.id.itemTextView);
		textItem = (EditText) startTest.findViewById(R.id.textItem );
		editbutton = (Button) startTest.findViewById(R.id.editbutton);
		deletebutton= (Button) startTest.findViewById(R.id.deletebutton);
		
		
	}
	
	//This method test if this items(button, TextFiled, TextView) are null or not
	public void testButton() { 
		
		    assertNotNull(getActivity());
	    	assertNotNull(editNewItemsTittle);
			assertNotNull(itemTextView);
			assertNotNull(textItem);
			assertNotNull(editbutton);
			assertNotNull(deletebutton);
			
			
		}  
	
		//This method test the value of TextField
	
	public void testText() {
		
	    assertEquals("",textItem.getText());
	}
	
		
	}

