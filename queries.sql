-- Part 1: Test it with SQL
       id
       int PK
       name
       varchar(75)
       employer_id
       int
       jobs_id
       int


-- Part 2: Test it with SQL
SELECT name
FROM employer
WHERE location = "St. Louis"

-- Part 3: Test it with SQL
DROP TABLE job;


-- Part 4: Test it with SQL
SELECT * FROM skill
INNER JOIN job_skills ON skill.id=job_skills.skills_id
WHERE job_skills.jobs_id is not null
ORDER BY skill.name ASC