/*

                            

                                      INTERFACE
                                              
WHY DO WE NEED INTERFACE ?
    1) FOR FULLY ABSTRACTION(100%)
    2) IT SUPPORTS MULTIPLE INHERITANCE


DECLARING AN INTERFACE:
    INTERFACE KEYWORD IS USED TO DECLARE INTERFACE.abstract 
    EXAMPLE :
                 INTERFACE ANIMAL
                             {




                             }


INTERFACE IS A COLLECTION OF ABSTRACT METHOD .
POINT TO BE NOTICED:
            THE JAVA COMPILER ADDS PUBLIC AND ABSTRACT KEYWORD BBFORE THE INTERFACE METHOD
            JAVA COMPILER ALSO ADDS PUBLIC ,STATIC AND FINAL KEYWORD BEFORE THE INTERFACE VARIABLE
            SO WE CAN SAY THAT ALL VARIABLES ARE CONSTANT, NO INSTANCE VARIABLES.




CLASS TO CLASS -----------------------------EXTENDS
INTERFACE TO INTERFACE ---------------------EXTENDS
CLASS TO INTERFACE -------------------------IMPLEMENTS

                INTERFACE ANIMAL{
                  ------------------------
                  ------------------------
                  ------------------------



                }


                INTERFACE DOG EXTENDS ANIMAL{
                  ------------------------
                  ------------------------
                  ------------------------



                }





                INTERFACE ANIMAL{
                  ------------------------
                  ------------------------
                  ------------------------



                }


                CLASS DOG IMPLEMENTS ANIMAL{
                  ------------------------
                  ------------------------
                  ------------------------



                }



*****INTERFACE SUPPORTS MULTIPLE INHERITANCE BUT JAVA DOESN'T SUPPORT MULTIPLE INHERITANCE******

HOW INTERFACE IS SIMILAR TO A CLASS?
        1) INTERFACE CAN HAVE ANY NUMBER OF METHODS
        2) IT HAS SAME FILE EXTENSION AS CLASS(.JAVA)

HOW INTERFACE IS DIFFERENT FROM CLASS?

        1) YOU CAN'T INSTANTIATE AN INTERFACE
        2) INTERFACE DOESN'T CONTAIN CONSTRUCTOR
        3) ALL THE METHODS IN THE INTERFACE ARE ABSTRACT
        4) AN INTERFACE CAN'T HAVE INSTANCE VARIABLES
        5) AN INTERFACE CAN'T EXTEND MULTIPLE INTERFCE






INTERFACE VS ABSTRACT CLASS:
              INTERFACE                                               ABSTRACT CLASS
1) CAN ONLY HAVE ABSTRACT METHODS                               1) CAN HAVE ABSTRACT AND NON ABSTRACT METHOD
2) IT SUPPORTS MULTIPLE INHERITANCE                             2) IT DOESN'T SUPPORT MULTIPLE INHERITANCE
3) CAN ONLY HAVE STATIC AND FINAL VARIABLE                      3) CAN HAVE STATIC, NON STATIC, FINAL  AND
                                                                   NON FINAL VARIABLE
4)FULLY ABSTRACT                                                4) PARTIALLY ABSTRACT


5)EXAMPLE :                                                     5)EXAMPLE :         
        INTERFACE ANIMAL{                                             ABSTRACT CLASS ANIMAL{
         
                  VOID EAT();                                                  ABSTRACT VOID EAT();
 
        }                                                              }
















*/ 

