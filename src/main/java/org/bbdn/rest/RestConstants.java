package org.bbdn.rest;

public abstract class RestConstants {

	public final static String HOSTNAME = "<server_url>";
	public final static String KEY = "<api_key_from_developer_blackboard>";
	public final static String SECRET = "<api_secrete_from_developer_blackboard>";

	public final static String AUTH_PATH = "/learn/api/public/v1/oauth2/token";

	public final static String DATASOURCE_PATH = "/learn/api/public/v1/dataSources";
	public final static String DATASOURCE_ID = "<datasource_from_blackboard_learn>";
	public final static String DATASOURCE_DESCRIPTION = "Example of datasource";

	public final static String TERM_PATH = "/learn/api/public/v1/terms";
	public final static String TERM_ID = "<BBDN-Example-Term>";
	public final static String TERM_NAME = "REST Demo Term - Java";
	public final static String TERM_RAW = "Term Used For REST Demo - Java";
	public final static String TERM_DISPLAY = "Term Used For REST Demo - Java";

	public final static String COURSE_PATH = "/learn/api/public/v1/courses";
	public final static String COURSE_ID = "<course_id_from_Blackboard_learn>";
	public final static String COURSE_NAME = "<course_name>";
	public final static String COURSE_DESCRIPTION = "Course Used For REST Demo - Workshop Saint Paul";

	public final static String USER_PATH = "/learn/api/public/v1/users";
	public final static String USER_ID = "<user_id_from_blackboard_learn>";
	public final static String USER_NAME = "<username_from_blackboard_learn>";
	public final static String USER_PASS = "<user_password_from_blackboard_learn>";
	public final static String USER_FIRST = "Some User";
	public final static String USER_LAST = "Other User";
	public final static String USER_EMAIL = "<email_from_blackboard_learn>";

	public final static String ALL_USERS_PATH = "/learn/api/public/v1/users";
	public final static String ALL_COURSES_PATH = "/learn/api/public/v1/courses";

}
