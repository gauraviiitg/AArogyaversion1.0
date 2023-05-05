project description abstract

Aarogya : DBMS BASED patient registration system which helps to create, update and modify patient database for mirza health Centre.

PROJECT DESCRIPTION: A DBMS needs to be implemented for a small community-based hospital that mainly serves within mirza or in some sense kamrup. The hospital broadly needs to store a lot of data specifically --
registration id – unique number provided to each patient. 
patient name – name provided by the patient.
Guardian name – name of the guardian accompanying
DOB_year – age(will be calculated) provided by the patient. 
sex – of the patient 
phone number – provided by the patient.
address – provided by the patient. 
date – current date 
amount – paid amount  
visit – to be filled in case visited for more than one time in month.

FIRST EDIT (20/03/2023): 
Pre-determined values for sex and amount.
Registration id and date(dd/mm/yy) should be self-generated.
Registration id format: ddmmyyxxxx, where xxxx will be generated from 0001 at the start of the day.
// find out how does date works in SQL (does it coordinates with the system timing)

Regular Amount to be paid = 10/-
Concession for (1<= age>80, not able to pay (borne by Hospital), ANC cases (parental care)): Amount = 0
No amount charged if the patient comes for next visit within 1 month.
// re-consultation needed to determine whether separate attribute needed or if necessary to be included. 

Level of access:
Level 1: accessed by receptionist. (Access search queries, change them)
Level 2: accessed by office administrator. (Add level1 and 2 users, delete queries or change them)

Queries: (try to generate all weather filter, number of tuples also shown) --------- followed by delete or change queries in the result query.

Separate tab for frequent queries: Total patient (at the end of day, paid – not paid (anc, age, borne), sex, 
Search by (case insensitive): registration id, name, age, sex, phone, address, date, amount.

THE PROBLEM SOLVING (faced till now): 

TECHNICAL IMPAIREDNESS: the user is to be considered technical impaired and since there is not IT department in the hospital.
Solution: 
Code should be clean appropriate comments.
Tight bounds in case of accepting attribute values.
A user manual will be printed for the facilitation of office staff.
user with low access should not be able to change much or given any option that puts data at risk.  

DATA SECURITY: each year more than 1 lakh people register at the hospital with their basic data consisting of age, mobile, age and address which makes it outmost importance for the data to be secured. 
Solution: 
Migration feature: Export button, that exports data within a particular time frame to the computer in excel ( to be accessed by the administrator)
Will not be connected to the internet nor will we be working with web-based front- end.
Code should be reconstructed to provide safety. 
LOW QUALITY HARDWARE AND SOFTWARE: it is to be assumed that the computer hosting the application will be working at minimum settings
 Solution: 
Try to avoid using any third party software prone to bugs ( use the stable update ). Basic MySQL is to be used with java.
Data needed to be entered by the receptionist every day. regarding time (working on) since the computer may start time from 00:00 every day and getting input of time every time someone registers is hugely time wasting



