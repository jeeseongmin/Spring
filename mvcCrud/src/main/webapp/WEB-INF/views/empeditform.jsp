<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
  
        <h1>Edit Employee</h1>  
       <form:form method="POST" action="/mvcCrud/editsave">    
        <table >    
        <tr>  
        <td></td>    
         <td><form:hidden  path="ID" /></td>  
         </tr>   
         <tr>    
          <td>Name : </td>   
          <td><form:input path="NAME"  /></td>  
         </tr>    
         <tr>    
          <td>Salary :</td>    
          <td><form:input path="SALARY" /></td>  
         </tr>   
         <tr>    
          <td>Designation :</td>    
          <td><form:input path="DESIGNATION" /></td>  
         </tr>   
           
         <tr>    
          <td> </td>    
          <td><input type="submit" value="Edit Save" /></td>    
         </tr>    
        </table>    
       </form:form>    