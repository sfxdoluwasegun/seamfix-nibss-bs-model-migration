package com.sf.biocapture.entity.audit;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.sf.biocapture.entity.Node;
import com.sf.biocapture.entity.enums.VersionType;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import nw.orm.core.IEntity;

/**
 *
 * @author Nnanna
 * @since v1.5.37
 *
 */
@Entity
@Table(name = "VERSION_LOG")
public class VersionLog extends IEntity {

    private static final long serialVersionUID = 3733222892765503526L;

    @ManyToOne(optional = false)
    @JoinColumn(name = "NODE_FK", nullable = false)
    private Node node;

    @Column(name = "TYPE_", nullable = true)
    private VersionType type;

    @Column(name = "VERSION_TYPE", nullable = true)
    private String versionType;

    @Column(name = "VERSION_", nullable = false)
    private String version;

    public Node getNode() {
        return node;
    }

    public void setNode(Node node) {
        this.node = node;
    }

    public VersionType getVersionType() {
        return versionType == null ? null : VersionType.valueOf(versionType);
    }

    public void setVersionType(VersionType versionType) {
        this.versionType = versionType == null ? null : versionType.name();
    }

    public VersionType getType() {
        return type;
    }

    public void setType(VersionType type) {
        this.type = type;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
