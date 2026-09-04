package com.smartbox.jobster.pojo.hh;

import java.util.ArrayList;
import java.util.List;

public class SimpleDepartmentDTO {
    private String id;
    private String name;
    private String parentId;
    private List<SimpleDepartmentDTO> children = new ArrayList<>();

    public SimpleDepartmentDTO() {}

    public SimpleDepartmentDTO(String id, String name, String parentId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getParentId() { return parentId; }
    public void setParentId(String parentId) { this.parentId = parentId; }

    public List<SimpleDepartmentDTO> getChildren() { return children; }
    public void setChildren(List<SimpleDepartmentDTO> children) { this.children = children; }
}
