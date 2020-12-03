package com.zh.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CourseTopicExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CourseTopicExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andIconUrlIsNull() {
            addCriterion("icon_url is null");
            return (Criteria) this;
        }

        public Criteria andIconUrlIsNotNull() {
            addCriterion("icon_url is not null");
            return (Criteria) this;
        }

        public Criteria andIconUrlEqualTo(String value) {
            addCriterion("icon_url =", value, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlNotEqualTo(String value) {
            addCriterion("icon_url <>", value, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlGreaterThan(String value) {
            addCriterion("icon_url >", value, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlGreaterThanOrEqualTo(String value) {
            addCriterion("icon_url >=", value, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlLessThan(String value) {
            addCriterion("icon_url <", value, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlLessThanOrEqualTo(String value) {
            addCriterion("icon_url <=", value, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlLike(String value) {
            addCriterion("icon_url like", value, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlNotLike(String value) {
            addCriterion("icon_url not like", value, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlIn(List<String> values) {
            addCriterion("icon_url in", values, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlNotIn(List<String> values) {
            addCriterion("icon_url not in", values, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlBetween(String value1, String value2) {
            addCriterion("icon_url between", value1, value2, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlNotBetween(String value1, String value2) {
            addCriterion("icon_url not between", value1, value2, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIntroUrlIsNull() {
            addCriterion("intro_url is null");
            return (Criteria) this;
        }

        public Criteria andIntroUrlIsNotNull() {
            addCriterion("intro_url is not null");
            return (Criteria) this;
        }

        public Criteria andIntroUrlEqualTo(String value) {
            addCriterion("intro_url =", value, "introUrl");
            return (Criteria) this;
        }

        public Criteria andIntroUrlNotEqualTo(String value) {
            addCriterion("intro_url <>", value, "introUrl");
            return (Criteria) this;
        }

        public Criteria andIntroUrlGreaterThan(String value) {
            addCriterion("intro_url >", value, "introUrl");
            return (Criteria) this;
        }

        public Criteria andIntroUrlGreaterThanOrEqualTo(String value) {
            addCriterion("intro_url >=", value, "introUrl");
            return (Criteria) this;
        }

        public Criteria andIntroUrlLessThan(String value) {
            addCriterion("intro_url <", value, "introUrl");
            return (Criteria) this;
        }

        public Criteria andIntroUrlLessThanOrEqualTo(String value) {
            addCriterion("intro_url <=", value, "introUrl");
            return (Criteria) this;
        }

        public Criteria andIntroUrlLike(String value) {
            addCriterion("intro_url like", value, "introUrl");
            return (Criteria) this;
        }

        public Criteria andIntroUrlNotLike(String value) {
            addCriterion("intro_url not like", value, "introUrl");
            return (Criteria) this;
        }

        public Criteria andIntroUrlIn(List<String> values) {
            addCriterion("intro_url in", values, "introUrl");
            return (Criteria) this;
        }

        public Criteria andIntroUrlNotIn(List<String> values) {
            addCriterion("intro_url not in", values, "introUrl");
            return (Criteria) this;
        }

        public Criteria andIntroUrlBetween(String value1, String value2) {
            addCriterion("intro_url between", value1, value2, "introUrl");
            return (Criteria) this;
        }

        public Criteria andIntroUrlNotBetween(String value1, String value2) {
            addCriterion("intro_url not between", value1, value2, "introUrl");
            return (Criteria) this;
        }

        public Criteria andTopicIntroIsNull() {
            addCriterion("topic_intro is null");
            return (Criteria) this;
        }

        public Criteria andTopicIntroIsNotNull() {
            addCriterion("topic_intro is not null");
            return (Criteria) this;
        }

        public Criteria andTopicIntroEqualTo(String value) {
            addCriterion("topic_intro =", value, "topicIntro");
            return (Criteria) this;
        }

        public Criteria andTopicIntroNotEqualTo(String value) {
            addCriterion("topic_intro <>", value, "topicIntro");
            return (Criteria) this;
        }

        public Criteria andTopicIntroGreaterThan(String value) {
            addCriterion("topic_intro >", value, "topicIntro");
            return (Criteria) this;
        }

        public Criteria andTopicIntroGreaterThanOrEqualTo(String value) {
            addCriterion("topic_intro >=", value, "topicIntro");
            return (Criteria) this;
        }

        public Criteria andTopicIntroLessThan(String value) {
            addCriterion("topic_intro <", value, "topicIntro");
            return (Criteria) this;
        }

        public Criteria andTopicIntroLessThanOrEqualTo(String value) {
            addCriterion("topic_intro <=", value, "topicIntro");
            return (Criteria) this;
        }

        public Criteria andTopicIntroLike(String value) {
            addCriterion("topic_intro like", value, "topicIntro");
            return (Criteria) this;
        }

        public Criteria andTopicIntroNotLike(String value) {
            addCriterion("topic_intro not like", value, "topicIntro");
            return (Criteria) this;
        }

        public Criteria andTopicIntroIn(List<String> values) {
            addCriterion("topic_intro in", values, "topicIntro");
            return (Criteria) this;
        }

        public Criteria andTopicIntroNotIn(List<String> values) {
            addCriterion("topic_intro not in", values, "topicIntro");
            return (Criteria) this;
        }

        public Criteria andTopicIntroBetween(String value1, String value2) {
            addCriterion("topic_intro between", value1, value2, "topicIntro");
            return (Criteria) this;
        }

        public Criteria andTopicIntroNotBetween(String value1, String value2) {
            addCriterion("topic_intro not between", value1, value2, "topicIntro");
            return (Criteria) this;
        }

        public Criteria andViewsIsNull() {
            addCriterion("views is null");
            return (Criteria) this;
        }

        public Criteria andViewsIsNotNull() {
            addCriterion("views is not null");
            return (Criteria) this;
        }

        public Criteria andViewsEqualTo(Integer value) {
            addCriterion("views =", value, "views");
            return (Criteria) this;
        }

        public Criteria andViewsNotEqualTo(Integer value) {
            addCriterion("views <>", value, "views");
            return (Criteria) this;
        }

        public Criteria andViewsGreaterThan(Integer value) {
            addCriterion("views >", value, "views");
            return (Criteria) this;
        }

        public Criteria andViewsGreaterThanOrEqualTo(Integer value) {
            addCriterion("views >=", value, "views");
            return (Criteria) this;
        }

        public Criteria andViewsLessThan(Integer value) {
            addCriterion("views <", value, "views");
            return (Criteria) this;
        }

        public Criteria andViewsLessThanOrEqualTo(Integer value) {
            addCriterion("views <=", value, "views");
            return (Criteria) this;
        }

        public Criteria andViewsIn(List<Integer> values) {
            addCriterion("views in", values, "views");
            return (Criteria) this;
        }

        public Criteria andViewsNotIn(List<Integer> values) {
            addCriterion("views not in", values, "views");
            return (Criteria) this;
        }

        public Criteria andViewsBetween(Integer value1, Integer value2) {
            addCriterion("views between", value1, value2, "views");
            return (Criteria) this;
        }

        public Criteria andViewsNotBetween(Integer value1, Integer value2) {
            addCriterion("views not between", value1, value2, "views");
            return (Criteria) this;
        }

        public Criteria andFlagIsNull() {
            addCriterion("flag is null");
            return (Criteria) this;
        }

        public Criteria andFlagIsNotNull() {
            addCriterion("flag is not null");
            return (Criteria) this;
        }

        public Criteria andFlagEqualTo(Byte value) {
            addCriterion("flag =", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotEqualTo(Byte value) {
            addCriterion("flag <>", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThan(Byte value) {
            addCriterion("flag >", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThanOrEqualTo(Byte value) {
            addCriterion("flag >=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThan(Byte value) {
            addCriterion("flag <", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThanOrEqualTo(Byte value) {
            addCriterion("flag <=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagIn(List<Byte> values) {
            addCriterion("flag in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotIn(List<Byte> values) {
            addCriterion("flag not in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagBetween(Byte value1, Byte value2) {
            addCriterion("flag between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotBetween(Byte value1, Byte value2) {
            addCriterion("flag not between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andTypeIdIsNull() {
            addCriterion("type_id is null");
            return (Criteria) this;
        }

        public Criteria andTypeIdIsNotNull() {
            addCriterion("type_id is not null");
            return (Criteria) this;
        }

        public Criteria andTypeIdEqualTo(Integer value) {
            addCriterion("type_id =", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotEqualTo(Integer value) {
            addCriterion("type_id <>", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThan(Integer value) {
            addCriterion("type_id >", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("type_id >=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThan(Integer value) {
            addCriterion("type_id <", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("type_id <=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdIn(List<Integer> values) {
            addCriterion("type_id in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotIn(List<Integer> values) {
            addCriterion("type_id not in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("type_id between", value1, value2, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("type_id not between", value1, value2, "typeId");
            return (Criteria) this;
        }

        public Criteria andVipFlagIsNull() {
            addCriterion("vip_flag is null");
            return (Criteria) this;
        }

        public Criteria andVipFlagIsNotNull() {
            addCriterion("vip_flag is not null");
            return (Criteria) this;
        }

        public Criteria andVipFlagEqualTo(Integer value) {
            addCriterion("vip_flag =", value, "vipFlag");
            return (Criteria) this;
        }

        public Criteria andVipFlagNotEqualTo(Integer value) {
            addCriterion("vip_flag <>", value, "vipFlag");
            return (Criteria) this;
        }

        public Criteria andVipFlagGreaterThan(Integer value) {
            addCriterion("vip_flag >", value, "vipFlag");
            return (Criteria) this;
        }

        public Criteria andVipFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("vip_flag >=", value, "vipFlag");
            return (Criteria) this;
        }

        public Criteria andVipFlagLessThan(Integer value) {
            addCriterion("vip_flag <", value, "vipFlag");
            return (Criteria) this;
        }

        public Criteria andVipFlagLessThanOrEqualTo(Integer value) {
            addCriterion("vip_flag <=", value, "vipFlag");
            return (Criteria) this;
        }

        public Criteria andVipFlagIn(List<Integer> values) {
            addCriterion("vip_flag in", values, "vipFlag");
            return (Criteria) this;
        }

        public Criteria andVipFlagNotIn(List<Integer> values) {
            addCriterion("vip_flag not in", values, "vipFlag");
            return (Criteria) this;
        }

        public Criteria andVipFlagBetween(Integer value1, Integer value2) {
            addCriterion("vip_flag between", value1, value2, "vipFlag");
            return (Criteria) this;
        }

        public Criteria andVipFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("vip_flag not between", value1, value2, "vipFlag");
            return (Criteria) this;
        }

        public Criteria andCoursewareUrlIsNull() {
            addCriterion("courseware_url is null");
            return (Criteria) this;
        }

        public Criteria andCoursewareUrlIsNotNull() {
            addCriterion("courseware_url is not null");
            return (Criteria) this;
        }

        public Criteria andCoursewareUrlEqualTo(String value) {
            addCriterion("courseware_url =", value, "coursewareUrl");
            return (Criteria) this;
        }

        public Criteria andCoursewareUrlNotEqualTo(String value) {
            addCriterion("courseware_url <>", value, "coursewareUrl");
            return (Criteria) this;
        }

        public Criteria andCoursewareUrlGreaterThan(String value) {
            addCriterion("courseware_url >", value, "coursewareUrl");
            return (Criteria) this;
        }

        public Criteria andCoursewareUrlGreaterThanOrEqualTo(String value) {
            addCriterion("courseware_url >=", value, "coursewareUrl");
            return (Criteria) this;
        }

        public Criteria andCoursewareUrlLessThan(String value) {
            addCriterion("courseware_url <", value, "coursewareUrl");
            return (Criteria) this;
        }

        public Criteria andCoursewareUrlLessThanOrEqualTo(String value) {
            addCriterion("courseware_url <=", value, "coursewareUrl");
            return (Criteria) this;
        }

        public Criteria andCoursewareUrlLike(String value) {
            addCriterion("courseware_url like", value, "coursewareUrl");
            return (Criteria) this;
        }

        public Criteria andCoursewareUrlNotLike(String value) {
            addCriterion("courseware_url not like", value, "coursewareUrl");
            return (Criteria) this;
        }

        public Criteria andCoursewareUrlIn(List<String> values) {
            addCriterion("courseware_url in", values, "coursewareUrl");
            return (Criteria) this;
        }

        public Criteria andCoursewareUrlNotIn(List<String> values) {
            addCriterion("courseware_url not in", values, "coursewareUrl");
            return (Criteria) this;
        }

        public Criteria andCoursewareUrlBetween(String value1, String value2) {
            addCriterion("courseware_url between", value1, value2, "coursewareUrl");
            return (Criteria) this;
        }

        public Criteria andCoursewareUrlNotBetween(String value1, String value2) {
            addCriterion("courseware_url not between", value1, value2, "coursewareUrl");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}