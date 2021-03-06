package edu.scu.hereis.entity;

public class CourseKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course.course_id
     *
     * @mbg.generated Fri Apr 20 16:26:09 CST 2018
     */
    private String courseId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course.course_no
     *
     * @mbg.generated Fri Apr 20 16:26:09 CST 2018
     */
    private String courseNo;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course.course_id
     *
     * @return the value of course.course_id
     *
     * @mbg.generated Fri Apr 20 16:26:09 CST 2018
     */
    public String getCourseId() {
        return courseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course.course_id
     *
     * @param courseId the value for course.course_id
     *
     * @mbg.generated Fri Apr 20 16:26:09 CST 2018
     */
    public void setCourseId(String courseId) {
        this.courseId = courseId == null ? null : courseId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course.course_no
     *
     * @return the value of course.course_no
     *
     * @mbg.generated Fri Apr 20 16:26:09 CST 2018
     */
    public String getCourseNo() {
        return courseNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course.course_no
     *
     * @param courseNo the value for course.course_no
     *
     * @mbg.generated Fri Apr 20 16:26:09 CST 2018
     */
    public void setCourseNo(String courseNo) {
        this.courseNo = courseNo == null ? null : courseNo.trim();
    }

    /**
     * This method was written by Vicent_Chen.
     */
    public CourseKey() {
    }

    /**
     * This method was written by Vicent_Chen.
     * This method sets the value of the database column course.course_id and course.course_no
     *
     * @param courseId the value for course.course_id
     * @param courseNo the value for course.course_no
     */
    public CourseKey(String courseId, String courseNo) {
        this.courseId = courseId;
        this.courseNo = courseNo;
    }
}