<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>

<t:layout title="Find User">
    <t:errorMessage message="${errorMessage}"/>

    <t:form action="findUser">
        <t:numberfield name="id" label="Enter ID" required="true"/>
        <t:submit/>
    </t:form>
</t:layout>
