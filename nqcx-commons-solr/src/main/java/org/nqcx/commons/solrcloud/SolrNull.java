/*
 * Copyright 2017 nqcx.org All right reserved. This software is the
 * confidential and proprietary information of nqcx.org ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with nqcx.org.
 */

package org.nqcx.commons.solrcloud;

import org.nqcx.commons.lang.o.EntityBO;

/**
 * @Author Jiangsiqi on 2017/8/17 14:44.
 */
public class SolrNull extends EntityBO {

    private boolean isNull = true;

    public SolrNull(boolean value) {
        isNull = value;
    }

    public boolean isTrue(){
        return isNull;
    }


}
