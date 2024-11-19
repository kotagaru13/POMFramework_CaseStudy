Feature: Conduit CRUD Functions

Background: Login into App
Given  User is on Login Page
When User provide "username" and "password"
Then User should be on Home Page

Scenario: Create new Article
Given  User should on New Article Page
When User enters Article details
 | title | Desc | Content | tag |
Then  Article must be created

Scenario: View Article
Given  User should on Global Feed Page
When User select an "Article Title"
Then Article detail page must be displayed

Scenario: Update an Article
Given Article detail Page must be displayed
When User update article detail
Then Article detail must be updated

Scenario: Delete an Article
Given Article detail Page must be displayed 
When User delete article
Then Article must be deleted