# Write your MySQL query statement below
select p.project_id ,Round(sum(experience_years)/count(project_id),2) as average_years from Project p left join Employee e using (employee_id) group by project_id;

