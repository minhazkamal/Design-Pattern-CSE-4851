# Design Pattern-CSE 4851-Assignment 1

Imagine working for a travel agency that specializes in adventure tours. The agency offers a variety of packages, including hiking trips, rock climbing excursions, and whitewater rafting adventures. To help customers customize their trips to their liking, the agency uses the Decorator pattern to allow them to add additional activities or services to their packages.

For example, a customer might start with a basic hiking trip package that includes transportation to the trailhead, a guide, and camping equipment. But then they might want to add on a helicopter tour of the surrounding area or a massage at a local spa after their trek. To accommodate these requests, the agency has created a set of decorator classes that can be added onto the base package. These decorators include things like "helicopter tour," "spa service," and so on. Each decorator adds a specific activity or service to the package and increases the price accordingly.

To make things more efficient, the agency also uses the Factory pattern to create the packages themselves. When a customer requests a certain type of trip, the factory creates a new instance of the appropriate package class, which contains all the basic components of the trip (such as transportation, lodging, and equipment). The customer can then add on decorators to this base package to customize it to their liking.

For example, if a customer requests a whitewater rafting trip, the factory creates an instance of the WhitewaterRaftingPackage class, which includes things like transportation to the river, a guide, and all necessary rafting equipment. The customer can then add on decorators like "riverside camping" or "private photography session" to personalize their trip.

By using both the Decorator and Factory patterns, the agency can offer highly customizable adventure tours that meet the specific needs and desires of each customer.
