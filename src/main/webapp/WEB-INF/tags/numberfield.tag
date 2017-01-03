<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ attribute name="name" %>
<%@ attribute name="label" %>
<%@ attribute name="required" %>

<label>
    ${label} <c:if test="${required}">*</c:if>
    <input type="text" pattern="[0-9]+" title="Positive Number" name="${name}" <c:if test="${required}">required</c:if>>
</label>
