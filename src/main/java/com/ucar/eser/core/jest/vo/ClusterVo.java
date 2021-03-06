package com.ucar.eser.core.jest.vo;

import java.io.Serializable;

/**
 *  cluster 集群vo
 * <br/> Created on 2016-6-25 下午5:42:10
 * @since 4.1
 */
public class ClusterVo extends VoItf implements Serializable {

    private String messageType ;

    public ClusterVo() {}

    public ClusterVo(String clusterName) {
        super.clusterName = clusterName;
    }

    public String getMessageType() {
        return messageType;
    }

    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }

    @Override
    public String getUrl() {

        return "http://"+host + "/" + messageType;
    }


}
