/**
 * 
 */
package com.cognizant.truyum.dao;

import java.util.List;

import com.cognizant.truyum.model.MenuItem;

/**
 * @ created by madhangi 761100
 *
 */
public interface MenuItemDao {

	
	List<MenuItem> getMenuItemListAdmin();
	
	List<MenuItem> getMenuItemListCustomer();
	
	void modifyMenuItem(MenuItem menuItem);
	MenuItem getMenuItem(long menuItemId);
}
