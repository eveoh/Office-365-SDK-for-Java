/*******************************************************************************
 Copyright (c) Microsoft Open Technologies, Inc. All Rights Reserved.
 Licensed under the MIT or Apache License; see LICENSE in the source repository
 root for authoritative license information.﻿

 **NOTE** This code was generated by a tool and will occasionally be
 overwritten. We welcome comments and issues regarding this code; they will be
 addressed in the generation tool. If you wish to submit pull requests, please
 do so for the templates in that tool.

 This code was generated by Vipr (https://github.com/microsoft/vipr) using
 the T4TemplateWriter (https://github.com/msopentech/vipr-t4templatewriter).
 ******************************************************************************/
package com.microsoft.services.graph;

import com.microsoft.services.orc.core.ODataBaseEntity;


/**
 * The type Attachment.
*/
public class Attachment extends ODataBaseEntity {

    public Attachment(){
        setODataType("#Microsoft.Graph.Attachment");
    }
            
    private String Id;
     
    /**
    * Gets the Id.
    *
    * @return the String
    */
    public String getId() {
        return this.Id; 
    }

    /**
    * Sets the Id.
    *
    * @param value the String
    */
    public void setId(String value) { 
        this.Id = value; 
        valueChanged("Id", value);

    }
            
    private String Name;
     
    /**
    * Gets the Name.
    *
    * @return the String
    */
    public String getName() {
        return this.Name; 
    }

    /**
    * Sets the Name.
    *
    * @param value the String
    */
    public void setName(String value) { 
        this.Name = value; 
        valueChanged("Name", value);

    }
            
    private String ContentType;
     
    /**
    * Gets the Content Type.
    *
    * @return the String
    */
    public String getContentType() {
        return this.ContentType; 
    }

    /**
    * Sets the Content Type.
    *
    * @param value the String
    */
    public void setContentType(String value) { 
        this.ContentType = value; 
        valueChanged("ContentType", value);

    }
            
    private Integer Size;
     
    /**
    * Gets the Size.
    *
    * @return the Integer
    */
    public Integer getSize() {
        return this.Size; 
    }

    /**
    * Sets the Size.
    *
    * @param value the Integer
    */
    public void setSize(Integer value) { 
        this.Size = value; 
        valueChanged("Size", value);

    }
            
    private Boolean IsInline;
     
    /**
    * Gets the Is Inline.
    *
    * @return the Boolean
    */
    public Boolean getIsInline() {
        return this.IsInline; 
    }

    /**
    * Sets the Is Inline.
    *
    * @param value the Boolean
    */
    public void setIsInline(Boolean value) { 
        this.IsInline = value; 
        valueChanged("IsInline", value);

    }
            
    private java.util.Calendar DateTimeLastModified;
     
    /**
    * Gets the Date Time Last Modified.
    *
    * @return the java.util.Calendar
    */
    public java.util.Calendar getDateTimeLastModified() {
        return this.DateTimeLastModified; 
    }

    /**
    * Sets the Date Time Last Modified.
    *
    * @param value the java.util.Calendar
    */
    public void setDateTimeLastModified(java.util.Calendar value) { 
        this.DateTimeLastModified = value; 
        valueChanged("DateTimeLastModified", value);

    }
}

