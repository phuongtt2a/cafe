Café Sample Application - Traditional programming model
================================================
	                                                              _____________ 
	                                                     -{ice}->| Iced Drink  |
	                         -> Item 1 -{check ice/hot}-         |             |
	Order -> Items -{split}-                             -{hot}->| Hot Drink   |-{aggregate}-> List of ordered drinks -{deliver by a water}->.  
	                         -> ...                              |             | 
	                                                             |             |
	                                                             |_____________| 
	                                                             
1. The drawback of this model is that the process typically works sequentially

2. The component is tightly coupled to a business workflow. 
If we have to add another workflow, then we have to write more if-else statements (or something like that)