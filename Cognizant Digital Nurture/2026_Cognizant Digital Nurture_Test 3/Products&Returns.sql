-- Problem Statement
-- Alex, a data analyst at an electronics retailer, has been assigned the task of analyzing product return data to help the company better understand customer return patterns. To perform this analysis, Alex needs to join data from two tables: PRODUCTS and RETURNS.  


SELECT 
    P.PRODUCT_ID,
    P.PRODUCT_NAME,
    MAX(R.RETURN_AMOUNT) AS MAX_RETURN_AMOUNT,
    R.RETURN_DATE
FROM 
    PRODUCTS P
LEFT OUTER JOIN 
    RETURNS R ON P.PRODUCT_ID = R.PRODUCT_ID
GROUP BY 
    P.PRODUCT_ID, P.PRODUCT_NAME, R.RETURN_DATE;


SELECT 
    R.RETURN_ID,
    R.PRODUCT_ID,
    R.RETURN_AMOUNT,
    R.RETURN_DATE,
    P.PRODUCT_NAME,
    P.CATEGORY
FROM 
    RETURNS R
LEFT OUTER JOIN 
    PRODUCTS P ON R.PRODUCT_ID = P.PRODUCT_ID
WHERE 
    R.RETURN_AMOUNT > (SELECT AVG(RETURN_AMOUNT) FROM RETURNS);


SELECT 
    P.PRODUCT_ID,
    P.PRODUCT_NAME,
    R.RETURN_DATE
FROM 
    PRODUCTS P
LEFT OUTER JOIN 
    RETURNS R ON P.PRODUCT_ID = R.PRODUCT_ID;
