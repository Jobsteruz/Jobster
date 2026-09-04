package com.smartbox.jobster.security;

import io.jmix.security.model.EntityAttributePolicyAction;
import io.jmix.security.model.EntityPolicyAction;
import io.jmix.security.role.annotation.EntityAttributePolicy;
import io.jmix.security.role.annotation.EntityPolicy;
import io.jmix.security.role.annotation.ResourceRole;
import io.jmix.security.role.annotation.SpecificPolicy;

@ResourceRole(name = "Write entities", code = WriteEntityRole.CODE)
public interface WriteEntityRole extends ReadEntityRole {
    String CODE = "write-entity-role";

    @SpecificPolicy(resources = {"datatools.showEntityInfo", "rest.enabled", "rest.fileDownload.enabled", "rest.fileUpload.enabled"})
    void entitySpecific();

    @EntityPolicy(entityName = "*", actions = {EntityPolicyAction.ALL})
    @EntityAttributePolicy(entityName = "*", attributes = "*", action = EntityAttributePolicyAction.MODIFY)
    void writeEntities();
}