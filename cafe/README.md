Café Sample Application - Traditional programming model
================================================

The purpose of the Café sample application is to demonstrate the order-delivery scenario in a real life cafe. With this application, we handle several drink orders - hot and iced. After running the application we can see in the standard output (console) how cold drinks and hot drinks are prepared (cold drinks are prepared quicker
than hot). However the delivery for the whole order is postponed until the hot drink is ready.

	                                                              _____________ 
	                                                     -{ice}->| Iced Drink  |
	                         -> Item 1 -{check ice/hot}-         |             |
	Order -> Items -{split}-                             -{hot}->| Hot Drink   |-{aggregate}-> List of ordered drinks -{delivered by a water}-> customer  
	                         -> ...                              |             | 
	                                                             |             |
	                                                             |_____________| 
	                                                             
1. The drawback of this model is that the process typically works sequentially

2. The component is tightly coupled to a business workflow. 
If we have to add another workflow, then we have to write more if-else statements (or something like that)