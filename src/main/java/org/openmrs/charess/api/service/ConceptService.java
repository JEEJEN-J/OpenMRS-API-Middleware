package org.openmrs.charess.api.service;

import org.openmrs.charess.api.configuration.Http;
import org.openmrs.charess.api.utils.AppLink;
import org.springframework.stereotype.Component;

import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
public class ConceptService {

    private String baseLink = AppLink.API_URI;

    public List<?> createConcept(String concept) {
        List<?> objects = null;
        try {
            HttpURLConnection httpURLConnection = Http.getHttpConnection(baseLink + "/concept", "POST");
            objects = Http.postObject(httpURLConnection, concept);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return objects;
    }

    public List<?> createConceptSource(String conceptSource) {
        List<?> objects = null;
        try {
            HttpURLConnection httpURLConnection = Http.getHttpConnection(baseLink + "/conceptsource/", "POST");
            objects = Http.postObject(httpURLConnection, conceptSource);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return objects;
    }

    public List<?> createConceptAttributeType(String conceptAttributeType) {
        List<?> objects = null;
        try {
            HttpURLConnection httpURLConnection = Http.getHttpConnection(baseLink + "/conceptattributetype", "POST");
            objects = Http.postObject(httpURLConnection, conceptAttributeType);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return objects;
    }

    public List<?> createConceptMapType(String conceptmaptype) {
        List<?> objects = null;
        try {
            HttpURLConnection httpURLConnection = Http.getHttpConnection(baseLink + "/conceptmaptype", "POST");
            objects = Http.postObject(httpURLConnection, conceptmaptype);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return objects;
    }

    public List<?> createConceptReferenceTerm(String conceptreferenceterm) {
        List<?> objects = null;
        try {
            HttpURLConnection httpURLConnection = Http.getHttpConnection(baseLink + "/conceptreferenceterm", "POST");
            objects = Http.postObject(httpURLConnection, conceptreferenceterm);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return objects;
    }

    public List<?> createConceptClass(String conceptclass) {
        List<?> objects = null;
        try {
            HttpURLConnection httpURLConnection = Http.getHttpConnection(baseLink + "/conceptclass/", "POST");
            objects = Http.postObject(httpURLConnection, conceptclass);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return objects;
    }

    public List<?> createConceptProposal(String conceptproposal) {
        List<?> objects = null;
        try {
            HttpURLConnection httpURLConnection = Http.getHttpConnection(baseLink + "/conceptproposal", "POST");
            objects = Http.postObject(httpURLConnection, conceptproposal);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return objects;
    }

    public List<?> createConceptStopWord(String conceptstopword) {
        List<?> objects = null;
        try {
            HttpURLConnection httpURLConnection = Http.getHttpConnection(baseLink + "/conceptstopword", "POST");
            objects = Http.postObject(httpURLConnection, conceptstopword);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return objects;
    }



    /*
     * Find concept by uuid
     * */

    public List<?> getConceptAttributeType(String uuid) {
        List<?> conceptattributetype = new ArrayList<>();
        try {
            HttpURLConnection httpURLConnection = Http.getHttpConnection(baseLink + "/conceptattributetype/" + uuid, "GET");
            if (httpURLConnection.getResponseCode() != 200)
                return Collections.singletonList(httpURLConnection.getResponseCode());
            conceptattributetype = Http.getObject(httpURLConnection);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conceptattributetype;
    }

    public List<?> getConceptDataType(String uuid) {
        List<?> conceptdatatypes = new ArrayList<>();
        try {
            HttpURLConnection httpURLConnection = Http.getHttpConnection(baseLink + "/conceptdatatype/" + uuid, "GET");
            if (httpURLConnection.getResponseCode() != 200)
                return Collections.singletonList(httpURLConnection.getResponseCode());
            conceptdatatypes = Http.getObject(httpURLConnection);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conceptdatatypes;
    }

    public List<?> getConceptMapType(String uuid) {
        List<?> conceptmaptypes = new ArrayList<>();
        try {
            HttpURLConnection httpURLConnection = Http.getHttpConnection(baseLink + "/conceptmaptype/" + uuid, "GET");
            if (httpURLConnection.getResponseCode() != 200)
                return Collections.singletonList(httpURLConnection.getResponseCode());
            conceptmaptypes = Http.getObject(httpURLConnection);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conceptmaptypes;
    }

    public List<?> getConceptReferenceTerm(String uuid) {
        List<?> conceptreferenceterms = new ArrayList<>();
        try {
            HttpURLConnection httpURLConnection = Http.getHttpConnection(baseLink + "/conceptreferenceterm/" + uuid, "GET");
            if (httpURLConnection.getResponseCode() != 200)
                return Collections.singletonList(httpURLConnection.getResponseCode());
            conceptreferenceterms = Http.getObject(httpURLConnection);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conceptreferenceterms;
    }

    public List<?> findConceptReferenceTerm(String codeOrName) {
        List<?> conceptreferenceterms = new ArrayList<>();
        try {
            HttpURLConnection httpURLConnection = Http.getHttpConnection(baseLink + "/conceptreferenceterm?codeOrName=" + codeOrName + "/", "GET");
            if (httpURLConnection.getResponseCode() != 200)
                return Collections.singletonList(httpURLConnection.getResponseCode());
            conceptreferenceterms = Http.getObject(httpURLConnection);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conceptreferenceterms;
    }

    public List<?> getConceptClass(String uuid) {
        List<?> conceptclass = new ArrayList<>();
        try {
            HttpURLConnection httpURLConnection = Http.getHttpConnection(baseLink + "/conceptclass/" + uuid, "GET");
            if (httpURLConnection.getResponseCode() != 200)
                return Collections.singletonList(httpURLConnection.getResponseCode());
            conceptclass = Http.getObject(httpURLConnection);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conceptclass;
    }

    public List<?> getConceptProposal(String uuid) {
        List<?> conceptproposal = new ArrayList<>();
        try {
            HttpURLConnection httpURLConnection = Http.getHttpConnection(baseLink + "/conceptproposal/" + uuid, "GET");
            if (httpURLConnection.getResponseCode() != 200)
                return Collections.singletonList(httpURLConnection.getResponseCode());
            conceptproposal = Http.getObject(httpURLConnection);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conceptproposal;
    }

    public List<?> getConceptStopWord(String uuid) {
        List<?> conceptstopword = new ArrayList<>();
        try {
            HttpURLConnection httpURLConnection = Http.getHttpConnection(baseLink + "/conceptstopword/" + uuid, "GET");
            if (httpURLConnection.getResponseCode() != 200)
                return Collections.singletonList(httpURLConnection.getResponseCode());
            conceptstopword = Http.getObject(httpURLConnection);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conceptstopword;
    }



    /*
     * List all concept
     */

    public List<?> listConceptClass(Integer limit) {
        List<?> conceptclass = new ArrayList<>();
        try {
            HttpURLConnection httpURLConnection = Http.getHttpConnection(baseLink + "/conceptclass?limit=" + limit, "GET");
            if (httpURLConnection.getResponseCode() != 200)
                return Collections.singletonList(httpURLConnection.getResponseCode());
            conceptclass = Http.getObject(httpURLConnection);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conceptclass;
    }

    public List<?> listConceptProposal() {
        List<?> conceptproposals = new ArrayList<>();
        try {
            HttpURLConnection httpURLConnection = Http.getHttpConnection(baseLink + "/conceptproposa", "GET");
            if (httpURLConnection.getResponseCode() != 200)
                return Collections.singletonList(httpURLConnection.getResponseCode());
            conceptproposals = Http.getObject(httpURLConnection);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conceptproposals;
    }

    public List<?> listConceptStopWord() {
        List<?> conceptstopwords = new ArrayList<>();
        try {
            HttpURLConnection httpURLConnection = Http.getHttpConnection(baseLink + "/conceptstopword", "GET");
            if (httpURLConnection.getResponseCode() != 200)
                return Collections.singletonList(httpURLConnection.getResponseCode());
            conceptstopwords = Http.getObject(httpURLConnection);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conceptstopwords;
    }

}