CREATE USER TRAINING_USER IDENTIFIED BY TRAINING_USER DEFAULT TABLESPACE TBS_DATA TEMPORARY TABLESPACE temp;
GRANT CONNECT TO TRAINING_USER;
GRANT RESOURCE TO TRAINING_USER;
GRANT CREATE SESSION TO TRAINING_USER;