<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ attribute name="message" %>

<c:if test="${not empty message}">
    <p class="error-message">${message}</p>
</c:if>
