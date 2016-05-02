package com.phuongtt2a.cafe;

import java.util.ArrayList;
import java.util.List;

import org.springframework.util.Assert;

import com.phuongtt2a.cafe.beans.Delivery;
import com.phuongtt2a.cafe.beans.Drink;
import com.phuongtt2a.cafe.beans.DrinkType;
import com.phuongtt2a.cafe.beans.Order;
import com.phuongtt2a.cafe.beans.OrderItem;

public class CafeDemoApp {

	public static void main(String[] args) {
		for (int i = 0; i <= 100; i++) {
			Order order = new Order();
			order.addItem(DrinkType.LATTE, 2, false);
			order.addItem(DrinkType.MOCHA, 3, true);
			placeOrder(order);
		}
	}
	
	private static Delivery placeOrder(final Order order) {
		Assert.notNull(order);
		
		List<OrderItem> orderItems = order.getItems();
		Assert.notNull(orderItems);
		
		// prepare drinks
		final List<Drink> drinks = prepareDrinks(orderItems);
		
		// prepare delivery
		return prepareDelivery(drinks);
	}
	
	private static List<Drink> prepareDrinks(final List<OrderItem> orderItems) {
		final List<Drink> drinks = new ArrayList<Drink>();
		for (final OrderItem orderItem : orderItems) {
			Assert.notNull(orderItem);
			final Drink drink = prepareDrink(orderItem);
			drinks.add(drink);
		}
		return drinks;
	}
	
	private static Drink prepareDrink(final OrderItem orderItem) {
		final Barista barista = new Barista();
		if (orderItem.isIced()) {
			//cold drink
			return barista.prepareColdDrink(orderItem);
		} 
		// hot drink
		return barista.prepareHotDrink(orderItem);	
	
	}
	
	private static Delivery prepareDelivery(final List<Drink> drinks) {
		final Waiter waiter = new Waiter();
		return waiter.prepareDelivery(drinks);
	}
}
