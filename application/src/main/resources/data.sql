INSERT INTO USERS (USERNAME, PASSWORD, USER_TYPE) VALUES ('arman', '12345', 0);
INSERT INTO USERS (USERNAME, PASSWORD, USER_TYPE) VALUES ('ali', '12345', 1);

INSERT INTO CUSTOMERS (ADDRESS, FIRST_NAME, LAST_NAME) VALUES ( 'Moadares Streat', 'Arman', 'Hasanpour');

INSERT INTO ACCOUNTS (ACCOUNT_TYPE, BALANCE, CURRENCY, CUSTOMER_ID) VALUES (1, 1000000, 0, null);
INSERT INTO ACCOUNTS (ACCOUNT_TYPE, BALANCE, CURRENCY, CUSTOMER_ID) VALUES (1, 100, 1, null);
INSERT INTO ACCOUNTS (ACCOUNT_TYPE, BALANCE, CURRENCY, CUSTOMER_ID) VALUES (0, 1000000, 0, 1);