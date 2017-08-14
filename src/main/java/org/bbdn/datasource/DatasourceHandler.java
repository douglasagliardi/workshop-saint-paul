// package org.bbdn.datasource;
//
// import org.bbdn.rest.RestConstants;
// import org.bbdn.rest.RestHandler;
// import org.bbdn.rest.RestRequest;
// import org.slf4j.Logger;
// import org.slf4j.LoggerFactory;
// import org.springframework.http.HttpMethod;
//
// import com.fasterxml.jackson.core.JsonProcessingException;
// import com.fasterxml.jackson.databind.JsonNode;
// import com.fasterxml.jackson.databind.ObjectMapper;
// import com.fasterxml.jackson.databind.node.ObjectNode;
//
// public class DatasourceHandler implements RestHandler {
//
// private Logger log = null;
//
// public DatasourceHandler() {
//
// log = LoggerFactory.getLogger(DatasourceHandler.class);
// }
//
// @Override
// public String createObject(String access_token) {
// log.info("CREATE");
// return (RestRequest.sendRequest(RestConstants.DATASOURCE_PATH,
// HttpMethod.POST, access_token, getBody()));
// }
//
// @Override
// public String readObject(String access_token) {
// log.info("READ");
// return (RestRequest.sendRequest(RestConstants.DATASOURCE_PATH +
// "/externalId:" + RestConstants.DATASOURCE_ID,
// HttpMethod.GET, access_token, ""));
// }
//
// @Override
// public String updateObject(String access_token) {
// log.info("UPDATE");
// return (RestRequest.sendRequest(RestConstants.DATASOURCE_PATH +
// "/externalId:" + RestConstants.DATASOURCE_ID,
// HttpMethod.PATCH, access_token, getBody()));
// }
//
// @Override
// public String deleteObject(String access_token) {
// log.info("DELETE");
// return (RestRequest.sendRequest(RestConstants.DATASOURCE_PATH +
// "/externalId:" + RestConstants.DATASOURCE_ID,
// HttpMethod.DELETE, access_token, ""));
// }
//
// private String getBody() {
//
// ObjectMapper objMapper = new ObjectMapper();
// JsonNode datasource = objMapper.createObjectNode();
// ((ObjectNode) datasource).put("externalId", RestConstants.DATASOURCE_ID);
// ((ObjectNode) datasource).put("description",
// RestConstants.DATASOURCE_DESCRIPTION);
//
// String body = "";
// try {
// body = objMapper.writeValueAsString(datasource);
// } catch (JsonProcessingException e) {
// // TODO Auto-generated catch block
// e.printStackTrace();
// }
//
// log.info(body);
//
// return (body);
// }
// }
