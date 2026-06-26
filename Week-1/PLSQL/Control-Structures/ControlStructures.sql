DECLARE
    v_age NUMBER := 65;
BEGIN
    IF v_age > 60 THEN
        DBMS_OUTPUT.PUT_LINE('Customer is eligible for 1% loan discount');
    ELSE
        DBMS_OUTPUT.PUT_LINE('Customer is not eligible');
    END IF;
END;
/

DECLARE
    v_balance NUMBER := 5000;
BEGIN
    IF v_balance < 10000 THEN
        DBMS_OUTPUT.PUT_LINE('Low Balance Alert');
    END IF;
END;
/

DECLARE
    v_amount NUMBER := 12000;
BEGIN
    IF v_amount > 10000 THEN
        DBMS_OUTPUT.PUT_LINE('Transaction requires manual review');
    ELSE
        DBMS_OUTPUT.PUT_LINE('Transaction approved');
    END IF;
END;
/