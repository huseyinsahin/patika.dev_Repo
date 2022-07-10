# Student Information System

**Course Class Features:**

- Attributes : name,code,prefix,note,Teacher
- Methods : Course(), addTeacher(), printTeacher()

**Teacher Class Features:**

- Attributes : name,mpno,branch
- Methods : Teacher()

**Student Class Features:**

- Attributes : name,stuNo,classes,course1,course2,course3,avarage,isPass
- Methods : Student(), addBulkExamNote(), isPass(), calcAvarage(), printNote()

Enter the verbal grade part of the course in the Course class and specify the effect on the average for each course separately. Include their oral grades in the average with the percentage of impact.

**Example:** If the effect of the oral grade of the physics course is 20% on the average, the effect of the exam grade is 80%.

If the student got 90 from the oral and 60 from the exam, the effect of that course on the overall average is calculated as follows:

Physics Average: (90 * 0.20) + (60 * 0.80);