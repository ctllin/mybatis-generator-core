package com.hanshow.wise.base.member.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MemberExtraExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbg.generated
     */
    public MemberExtraExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     *
     * @mbg.generated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *
     * @mbg.generated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *
     * @mbg.generated
     */
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNull() {
            addCriterion("member_id is null");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNotNull() {
            addCriterion("member_id is not null");
            return (Criteria) this;
        }

        public Criteria andMemberIdEqualTo(String value) {
            addCriterion("member_id =", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotEqualTo(String value) {
            addCriterion("member_id <>", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThan(String value) {
            addCriterion("member_id >", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThanOrEqualTo(String value) {
            addCriterion("member_id >=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThan(String value) {
            addCriterion("member_id <", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThanOrEqualTo(String value) {
            addCriterion("member_id <=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLike(String value) {
            addCriterion("member_id like", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotLike(String value) {
            addCriterion("member_id not like", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdIn(List<String> values) {
            addCriterion("member_id in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotIn(List<String> values) {
            addCriterion("member_id not in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdBetween(String value1, String value2) {
            addCriterion("member_id between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotBetween(String value1, String value2) {
            addCriterion("member_id not between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andPreMemberIdIsNull() {
            addCriterion("pre_member_id is null");
            return (Criteria) this;
        }

        public Criteria andPreMemberIdIsNotNull() {
            addCriterion("pre_member_id is not null");
            return (Criteria) this;
        }

        public Criteria andPreMemberIdEqualTo(String value) {
            addCriterion("pre_member_id =", value, "preMemberId");
            return (Criteria) this;
        }

        public Criteria andPreMemberIdNotEqualTo(String value) {
            addCriterion("pre_member_id <>", value, "preMemberId");
            return (Criteria) this;
        }

        public Criteria andPreMemberIdGreaterThan(String value) {
            addCriterion("pre_member_id >", value, "preMemberId");
            return (Criteria) this;
        }

        public Criteria andPreMemberIdGreaterThanOrEqualTo(String value) {
            addCriterion("pre_member_id >=", value, "preMemberId");
            return (Criteria) this;
        }

        public Criteria andPreMemberIdLessThan(String value) {
            addCriterion("pre_member_id <", value, "preMemberId");
            return (Criteria) this;
        }

        public Criteria andPreMemberIdLessThanOrEqualTo(String value) {
            addCriterion("pre_member_id <=", value, "preMemberId");
            return (Criteria) this;
        }

        public Criteria andPreMemberIdLike(String value) {
            addCriterion("pre_member_id like", value, "preMemberId");
            return (Criteria) this;
        }

        public Criteria andPreMemberIdNotLike(String value) {
            addCriterion("pre_member_id not like", value, "preMemberId");
            return (Criteria) this;
        }

        public Criteria andPreMemberIdIn(List<String> values) {
            addCriterion("pre_member_id in", values, "preMemberId");
            return (Criteria) this;
        }

        public Criteria andPreMemberIdNotIn(List<String> values) {
            addCriterion("pre_member_id not in", values, "preMemberId");
            return (Criteria) this;
        }

        public Criteria andPreMemberIdBetween(String value1, String value2) {
            addCriterion("pre_member_id between", value1, value2, "preMemberId");
            return (Criteria) this;
        }

        public Criteria andPreMemberIdNotBetween(String value1, String value2) {
            addCriterion("pre_member_id not between", value1, value2, "preMemberId");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNickNameIsNull() {
            addCriterion("nick_name is null");
            return (Criteria) this;
        }

        public Criteria andNickNameIsNotNull() {
            addCriterion("nick_name is not null");
            return (Criteria) this;
        }

        public Criteria andNickNameEqualTo(String value) {
            addCriterion("nick_name =", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotEqualTo(String value) {
            addCriterion("nick_name <>", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameGreaterThan(String value) {
            addCriterion("nick_name >", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameGreaterThanOrEqualTo(String value) {
            addCriterion("nick_name >=", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLessThan(String value) {
            addCriterion("nick_name <", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLessThanOrEqualTo(String value) {
            addCriterion("nick_name <=", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLike(String value) {
            addCriterion("nick_name like", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotLike(String value) {
            addCriterion("nick_name not like", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameIn(List<String> values) {
            addCriterion("nick_name in", values, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotIn(List<String> values) {
            addCriterion("nick_name not in", values, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameBetween(String value1, String value2) {
            addCriterion("nick_name between", value1, value2, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotBetween(String value1, String value2) {
            addCriterion("nick_name not between", value1, value2, "nickName");
            return (Criteria) this;
        }

        public Criteria andFamilyNameIsNull() {
            addCriterion("family_name is null");
            return (Criteria) this;
        }

        public Criteria andFamilyNameIsNotNull() {
            addCriterion("family_name is not null");
            return (Criteria) this;
        }

        public Criteria andFamilyNameEqualTo(String value) {
            addCriterion("family_name =", value, "familyName");
            return (Criteria) this;
        }

        public Criteria andFamilyNameNotEqualTo(String value) {
            addCriterion("family_name <>", value, "familyName");
            return (Criteria) this;
        }

        public Criteria andFamilyNameGreaterThan(String value) {
            addCriterion("family_name >", value, "familyName");
            return (Criteria) this;
        }

        public Criteria andFamilyNameGreaterThanOrEqualTo(String value) {
            addCriterion("family_name >=", value, "familyName");
            return (Criteria) this;
        }

        public Criteria andFamilyNameLessThan(String value) {
            addCriterion("family_name <", value, "familyName");
            return (Criteria) this;
        }

        public Criteria andFamilyNameLessThanOrEqualTo(String value) {
            addCriterion("family_name <=", value, "familyName");
            return (Criteria) this;
        }

        public Criteria andFamilyNameLike(String value) {
            addCriterion("family_name like", value, "familyName");
            return (Criteria) this;
        }

        public Criteria andFamilyNameNotLike(String value) {
            addCriterion("family_name not like", value, "familyName");
            return (Criteria) this;
        }

        public Criteria andFamilyNameIn(List<String> values) {
            addCriterion("family_name in", values, "familyName");
            return (Criteria) this;
        }

        public Criteria andFamilyNameNotIn(List<String> values) {
            addCriterion("family_name not in", values, "familyName");
            return (Criteria) this;
        }

        public Criteria andFamilyNameBetween(String value1, String value2) {
            addCriterion("family_name between", value1, value2, "familyName");
            return (Criteria) this;
        }

        public Criteria andFamilyNameNotBetween(String value1, String value2) {
            addCriterion("family_name not between", value1, value2, "familyName");
            return (Criteria) this;
        }

        public Criteria andGivenNameIsNull() {
            addCriterion("given_name is null");
            return (Criteria) this;
        }

        public Criteria andGivenNameIsNotNull() {
            addCriterion("given_name is not null");
            return (Criteria) this;
        }

        public Criteria andGivenNameEqualTo(String value) {
            addCriterion("given_name =", value, "givenName");
            return (Criteria) this;
        }

        public Criteria andGivenNameNotEqualTo(String value) {
            addCriterion("given_name <>", value, "givenName");
            return (Criteria) this;
        }

        public Criteria andGivenNameGreaterThan(String value) {
            addCriterion("given_name >", value, "givenName");
            return (Criteria) this;
        }

        public Criteria andGivenNameGreaterThanOrEqualTo(String value) {
            addCriterion("given_name >=", value, "givenName");
            return (Criteria) this;
        }

        public Criteria andGivenNameLessThan(String value) {
            addCriterion("given_name <", value, "givenName");
            return (Criteria) this;
        }

        public Criteria andGivenNameLessThanOrEqualTo(String value) {
            addCriterion("given_name <=", value, "givenName");
            return (Criteria) this;
        }

        public Criteria andGivenNameLike(String value) {
            addCriterion("given_name like", value, "givenName");
            return (Criteria) this;
        }

        public Criteria andGivenNameNotLike(String value) {
            addCriterion("given_name not like", value, "givenName");
            return (Criteria) this;
        }

        public Criteria andGivenNameIn(List<String> values) {
            addCriterion("given_name in", values, "givenName");
            return (Criteria) this;
        }

        public Criteria andGivenNameNotIn(List<String> values) {
            addCriterion("given_name not in", values, "givenName");
            return (Criteria) this;
        }

        public Criteria andGivenNameBetween(String value1, String value2) {
            addCriterion("given_name between", value1, value2, "givenName");
            return (Criteria) this;
        }

        public Criteria andGivenNameNotBetween(String value1, String value2) {
            addCriterion("given_name not between", value1, value2, "givenName");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andIdentityCardIsNull() {
            addCriterion("identity_card is null");
            return (Criteria) this;
        }

        public Criteria andIdentityCardIsNotNull() {
            addCriterion("identity_card is not null");
            return (Criteria) this;
        }

        public Criteria andIdentityCardEqualTo(String value) {
            addCriterion("identity_card =", value, "identityCard");
            return (Criteria) this;
        }

        public Criteria andIdentityCardNotEqualTo(String value) {
            addCriterion("identity_card <>", value, "identityCard");
            return (Criteria) this;
        }

        public Criteria andIdentityCardGreaterThan(String value) {
            addCriterion("identity_card >", value, "identityCard");
            return (Criteria) this;
        }

        public Criteria andIdentityCardGreaterThanOrEqualTo(String value) {
            addCriterion("identity_card >=", value, "identityCard");
            return (Criteria) this;
        }

        public Criteria andIdentityCardLessThan(String value) {
            addCriterion("identity_card <", value, "identityCard");
            return (Criteria) this;
        }

        public Criteria andIdentityCardLessThanOrEqualTo(String value) {
            addCriterion("identity_card <=", value, "identityCard");
            return (Criteria) this;
        }

        public Criteria andIdentityCardLike(String value) {
            addCriterion("identity_card like", value, "identityCard");
            return (Criteria) this;
        }

        public Criteria andIdentityCardNotLike(String value) {
            addCriterion("identity_card not like", value, "identityCard");
            return (Criteria) this;
        }

        public Criteria andIdentityCardIn(List<String> values) {
            addCriterion("identity_card in", values, "identityCard");
            return (Criteria) this;
        }

        public Criteria andIdentityCardNotIn(List<String> values) {
            addCriterion("identity_card not in", values, "identityCard");
            return (Criteria) this;
        }

        public Criteria andIdentityCardBetween(String value1, String value2) {
            addCriterion("identity_card between", value1, value2, "identityCard");
            return (Criteria) this;
        }

        public Criteria andIdentityCardNotBetween(String value1, String value2) {
            addCriterion("identity_card not between", value1, value2, "identityCard");
            return (Criteria) this;
        }

        public Criteria andPassPortIsNull() {
            addCriterion("pass_port is null");
            return (Criteria) this;
        }

        public Criteria andPassPortIsNotNull() {
            addCriterion("pass_port is not null");
            return (Criteria) this;
        }

        public Criteria andPassPortEqualTo(String value) {
            addCriterion("pass_port =", value, "passPort");
            return (Criteria) this;
        }

        public Criteria andPassPortNotEqualTo(String value) {
            addCriterion("pass_port <>", value, "passPort");
            return (Criteria) this;
        }

        public Criteria andPassPortGreaterThan(String value) {
            addCriterion("pass_port >", value, "passPort");
            return (Criteria) this;
        }

        public Criteria andPassPortGreaterThanOrEqualTo(String value) {
            addCriterion("pass_port >=", value, "passPort");
            return (Criteria) this;
        }

        public Criteria andPassPortLessThan(String value) {
            addCriterion("pass_port <", value, "passPort");
            return (Criteria) this;
        }

        public Criteria andPassPortLessThanOrEqualTo(String value) {
            addCriterion("pass_port <=", value, "passPort");
            return (Criteria) this;
        }

        public Criteria andPassPortLike(String value) {
            addCriterion("pass_port like", value, "passPort");
            return (Criteria) this;
        }

        public Criteria andPassPortNotLike(String value) {
            addCriterion("pass_port not like", value, "passPort");
            return (Criteria) this;
        }

        public Criteria andPassPortIn(List<String> values) {
            addCriterion("pass_port in", values, "passPort");
            return (Criteria) this;
        }

        public Criteria andPassPortNotIn(List<String> values) {
            addCriterion("pass_port not in", values, "passPort");
            return (Criteria) this;
        }

        public Criteria andPassPortBetween(String value1, String value2) {
            addCriterion("pass_port between", value1, value2, "passPort");
            return (Criteria) this;
        }

        public Criteria andPassPortNotBetween(String value1, String value2) {
            addCriterion("pass_port not between", value1, value2, "passPort");
            return (Criteria) this;
        }

        public Criteria andPapersPypeIsNull() {
            addCriterion("papers_pype is null");
            return (Criteria) this;
        }

        public Criteria andPapersPypeIsNotNull() {
            addCriterion("papers_pype is not null");
            return (Criteria) this;
        }

        public Criteria andPapersPypeEqualTo(Byte value) {
            addCriterion("papers_pype =", value, "papersPype");
            return (Criteria) this;
        }

        public Criteria andPapersPypeNotEqualTo(Byte value) {
            addCriterion("papers_pype <>", value, "papersPype");
            return (Criteria) this;
        }

        public Criteria andPapersPypeGreaterThan(Byte value) {
            addCriterion("papers_pype >", value, "papersPype");
            return (Criteria) this;
        }

        public Criteria andPapersPypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("papers_pype >=", value, "papersPype");
            return (Criteria) this;
        }

        public Criteria andPapersPypeLessThan(Byte value) {
            addCriterion("papers_pype <", value, "papersPype");
            return (Criteria) this;
        }

        public Criteria andPapersPypeLessThanOrEqualTo(Byte value) {
            addCriterion("papers_pype <=", value, "papersPype");
            return (Criteria) this;
        }

        public Criteria andPapersPypeIn(List<Byte> values) {
            addCriterion("papers_pype in", values, "papersPype");
            return (Criteria) this;
        }

        public Criteria andPapersPypeNotIn(List<Byte> values) {
            addCriterion("papers_pype not in", values, "papersPype");
            return (Criteria) this;
        }

        public Criteria andPapersPypeBetween(Byte value1, Byte value2) {
            addCriterion("papers_pype between", value1, value2, "papersPype");
            return (Criteria) this;
        }

        public Criteria andPapersPypeNotBetween(Byte value1, Byte value2) {
            addCriterion("papers_pype not between", value1, value2, "papersPype");
            return (Criteria) this;
        }

        public Criteria andPapersNumberIsNull() {
            addCriterion("papers_number is null");
            return (Criteria) this;
        }

        public Criteria andPapersNumberIsNotNull() {
            addCriterion("papers_number is not null");
            return (Criteria) this;
        }

        public Criteria andPapersNumberEqualTo(String value) {
            addCriterion("papers_number =", value, "papersNumber");
            return (Criteria) this;
        }

        public Criteria andPapersNumberNotEqualTo(String value) {
            addCriterion("papers_number <>", value, "papersNumber");
            return (Criteria) this;
        }

        public Criteria andPapersNumberGreaterThan(String value) {
            addCriterion("papers_number >", value, "papersNumber");
            return (Criteria) this;
        }

        public Criteria andPapersNumberGreaterThanOrEqualTo(String value) {
            addCriterion("papers_number >=", value, "papersNumber");
            return (Criteria) this;
        }

        public Criteria andPapersNumberLessThan(String value) {
            addCriterion("papers_number <", value, "papersNumber");
            return (Criteria) this;
        }

        public Criteria andPapersNumberLessThanOrEqualTo(String value) {
            addCriterion("papers_number <=", value, "papersNumber");
            return (Criteria) this;
        }

        public Criteria andPapersNumberLike(String value) {
            addCriterion("papers_number like", value, "papersNumber");
            return (Criteria) this;
        }

        public Criteria andPapersNumberNotLike(String value) {
            addCriterion("papers_number not like", value, "papersNumber");
            return (Criteria) this;
        }

        public Criteria andPapersNumberIn(List<String> values) {
            addCriterion("papers_number in", values, "papersNumber");
            return (Criteria) this;
        }

        public Criteria andPapersNumberNotIn(List<String> values) {
            addCriterion("papers_number not in", values, "papersNumber");
            return (Criteria) this;
        }

        public Criteria andPapersNumberBetween(String value1, String value2) {
            addCriterion("papers_number between", value1, value2, "papersNumber");
            return (Criteria) this;
        }

        public Criteria andPapersNumberNotBetween(String value1, String value2) {
            addCriterion("papers_number not between", value1, value2, "papersNumber");
            return (Criteria) this;
        }

        public Criteria andCarNumberIsNull() {
            addCriterion("car_number is null");
            return (Criteria) this;
        }

        public Criteria andCarNumberIsNotNull() {
            addCriterion("car_number is not null");
            return (Criteria) this;
        }

        public Criteria andCarNumberEqualTo(String value) {
            addCriterion("car_number =", value, "carNumber");
            return (Criteria) this;
        }

        public Criteria andCarNumberNotEqualTo(String value) {
            addCriterion("car_number <>", value, "carNumber");
            return (Criteria) this;
        }

        public Criteria andCarNumberGreaterThan(String value) {
            addCriterion("car_number >", value, "carNumber");
            return (Criteria) this;
        }

        public Criteria andCarNumberGreaterThanOrEqualTo(String value) {
            addCriterion("car_number >=", value, "carNumber");
            return (Criteria) this;
        }

        public Criteria andCarNumberLessThan(String value) {
            addCriterion("car_number <", value, "carNumber");
            return (Criteria) this;
        }

        public Criteria andCarNumberLessThanOrEqualTo(String value) {
            addCriterion("car_number <=", value, "carNumber");
            return (Criteria) this;
        }

        public Criteria andCarNumberLike(String value) {
            addCriterion("car_number like", value, "carNumber");
            return (Criteria) this;
        }

        public Criteria andCarNumberNotLike(String value) {
            addCriterion("car_number not like", value, "carNumber");
            return (Criteria) this;
        }

        public Criteria andCarNumberIn(List<String> values) {
            addCriterion("car_number in", values, "carNumber");
            return (Criteria) this;
        }

        public Criteria andCarNumberNotIn(List<String> values) {
            addCriterion("car_number not in", values, "carNumber");
            return (Criteria) this;
        }

        public Criteria andCarNumberBetween(String value1, String value2) {
            addCriterion("car_number between", value1, value2, "carNumber");
            return (Criteria) this;
        }

        public Criteria andCarNumberNotBetween(String value1, String value2) {
            addCriterion("car_number not between", value1, value2, "carNumber");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("birthday is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("birthday is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(Date value) {
            addCriterionForJDBCDate("birthday =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("birthday <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("birthday >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("birthday >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(Date value) {
            addCriterionForJDBCDate("birthday <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("birthday <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("birthday in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("birthday not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("birthday not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andShortBirthdayIsNull() {
            addCriterion("short_birthday is null");
            return (Criteria) this;
        }

        public Criteria andShortBirthdayIsNotNull() {
            addCriterion("short_birthday is not null");
            return (Criteria) this;
        }

        public Criteria andShortBirthdayEqualTo(String value) {
            addCriterion("short_birthday =", value, "shortBirthday");
            return (Criteria) this;
        }

        public Criteria andShortBirthdayNotEqualTo(String value) {
            addCriterion("short_birthday <>", value, "shortBirthday");
            return (Criteria) this;
        }

        public Criteria andShortBirthdayGreaterThan(String value) {
            addCriterion("short_birthday >", value, "shortBirthday");
            return (Criteria) this;
        }

        public Criteria andShortBirthdayGreaterThanOrEqualTo(String value) {
            addCriterion("short_birthday >=", value, "shortBirthday");
            return (Criteria) this;
        }

        public Criteria andShortBirthdayLessThan(String value) {
            addCriterion("short_birthday <", value, "shortBirthday");
            return (Criteria) this;
        }

        public Criteria andShortBirthdayLessThanOrEqualTo(String value) {
            addCriterion("short_birthday <=", value, "shortBirthday");
            return (Criteria) this;
        }

        public Criteria andShortBirthdayLike(String value) {
            addCriterion("short_birthday like", value, "shortBirthday");
            return (Criteria) this;
        }

        public Criteria andShortBirthdayNotLike(String value) {
            addCriterion("short_birthday not like", value, "shortBirthday");
            return (Criteria) this;
        }

        public Criteria andShortBirthdayIn(List<String> values) {
            addCriterion("short_birthday in", values, "shortBirthday");
            return (Criteria) this;
        }

        public Criteria andShortBirthdayNotIn(List<String> values) {
            addCriterion("short_birthday not in", values, "shortBirthday");
            return (Criteria) this;
        }

        public Criteria andShortBirthdayBetween(String value1, String value2) {
            addCriterion("short_birthday between", value1, value2, "shortBirthday");
            return (Criteria) this;
        }

        public Criteria andShortBirthdayNotBetween(String value1, String value2) {
            addCriterion("short_birthday not between", value1, value2, "shortBirthday");
            return (Criteria) this;
        }

        public Criteria andChineseBirthdayIsNull() {
            addCriterion("chinese_birthday is null");
            return (Criteria) this;
        }

        public Criteria andChineseBirthdayIsNotNull() {
            addCriterion("chinese_birthday is not null");
            return (Criteria) this;
        }

        public Criteria andChineseBirthdayEqualTo(Date value) {
            addCriterionForJDBCDate("chinese_birthday =", value, "chineseBirthday");
            return (Criteria) this;
        }

        public Criteria andChineseBirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("chinese_birthday <>", value, "chineseBirthday");
            return (Criteria) this;
        }

        public Criteria andChineseBirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("chinese_birthday >", value, "chineseBirthday");
            return (Criteria) this;
        }

        public Criteria andChineseBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("chinese_birthday >=", value, "chineseBirthday");
            return (Criteria) this;
        }

        public Criteria andChineseBirthdayLessThan(Date value) {
            addCriterionForJDBCDate("chinese_birthday <", value, "chineseBirthday");
            return (Criteria) this;
        }

        public Criteria andChineseBirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("chinese_birthday <=", value, "chineseBirthday");
            return (Criteria) this;
        }

        public Criteria andChineseBirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("chinese_birthday in", values, "chineseBirthday");
            return (Criteria) this;
        }

        public Criteria andChineseBirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("chinese_birthday not in", values, "chineseBirthday");
            return (Criteria) this;
        }

        public Criteria andChineseBirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("chinese_birthday between", value1, value2, "chineseBirthday");
            return (Criteria) this;
        }

        public Criteria andChineseBirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("chinese_birthday not between", value1, value2, "chineseBirthday");
            return (Criteria) this;
        }

        public Criteria andLocationIsNull() {
            addCriterion("location is null");
            return (Criteria) this;
        }

        public Criteria andLocationIsNotNull() {
            addCriterion("location is not null");
            return (Criteria) this;
        }

        public Criteria andLocationEqualTo(String value) {
            addCriterion("location =", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotEqualTo(String value) {
            addCriterion("location <>", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThan(String value) {
            addCriterion("location >", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThanOrEqualTo(String value) {
            addCriterion("location >=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThan(String value) {
            addCriterion("location <", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThanOrEqualTo(String value) {
            addCriterion("location <=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLike(String value) {
            addCriterion("location like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotLike(String value) {
            addCriterion("location not like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationIn(List<String> values) {
            addCriterion("location in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotIn(List<String> values) {
            addCriterion("location not in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationBetween(String value1, String value2) {
            addCriterion("location between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotBetween(String value1, String value2) {
            addCriterion("location not between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andPhotoUrlIsNull() {
            addCriterion("photo_url is null");
            return (Criteria) this;
        }

        public Criteria andPhotoUrlIsNotNull() {
            addCriterion("photo_url is not null");
            return (Criteria) this;
        }

        public Criteria andPhotoUrlEqualTo(String value) {
            addCriterion("photo_url =", value, "photoUrl");
            return (Criteria) this;
        }

        public Criteria andPhotoUrlNotEqualTo(String value) {
            addCriterion("photo_url <>", value, "photoUrl");
            return (Criteria) this;
        }

        public Criteria andPhotoUrlGreaterThan(String value) {
            addCriterion("photo_url >", value, "photoUrl");
            return (Criteria) this;
        }

        public Criteria andPhotoUrlGreaterThanOrEqualTo(String value) {
            addCriterion("photo_url >=", value, "photoUrl");
            return (Criteria) this;
        }

        public Criteria andPhotoUrlLessThan(String value) {
            addCriterion("photo_url <", value, "photoUrl");
            return (Criteria) this;
        }

        public Criteria andPhotoUrlLessThanOrEqualTo(String value) {
            addCriterion("photo_url <=", value, "photoUrl");
            return (Criteria) this;
        }

        public Criteria andPhotoUrlLike(String value) {
            addCriterion("photo_url like", value, "photoUrl");
            return (Criteria) this;
        }

        public Criteria andPhotoUrlNotLike(String value) {
            addCriterion("photo_url not like", value, "photoUrl");
            return (Criteria) this;
        }

        public Criteria andPhotoUrlIn(List<String> values) {
            addCriterion("photo_url in", values, "photoUrl");
            return (Criteria) this;
        }

        public Criteria andPhotoUrlNotIn(List<String> values) {
            addCriterion("photo_url not in", values, "photoUrl");
            return (Criteria) this;
        }

        public Criteria andPhotoUrlBetween(String value1, String value2) {
            addCriterion("photo_url between", value1, value2, "photoUrl");
            return (Criteria) this;
        }

        public Criteria andPhotoUrlNotBetween(String value1, String value2) {
            addCriterion("photo_url not between", value1, value2, "photoUrl");
            return (Criteria) this;
        }

        public Criteria andQqAccountIsNull() {
            addCriterion("qq_account is null");
            return (Criteria) this;
        }

        public Criteria andQqAccountIsNotNull() {
            addCriterion("qq_account is not null");
            return (Criteria) this;
        }

        public Criteria andQqAccountEqualTo(String value) {
            addCriterion("qq_account =", value, "qqAccount");
            return (Criteria) this;
        }

        public Criteria andQqAccountNotEqualTo(String value) {
            addCriterion("qq_account <>", value, "qqAccount");
            return (Criteria) this;
        }

        public Criteria andQqAccountGreaterThan(String value) {
            addCriterion("qq_account >", value, "qqAccount");
            return (Criteria) this;
        }

        public Criteria andQqAccountGreaterThanOrEqualTo(String value) {
            addCriterion("qq_account >=", value, "qqAccount");
            return (Criteria) this;
        }

        public Criteria andQqAccountLessThan(String value) {
            addCriterion("qq_account <", value, "qqAccount");
            return (Criteria) this;
        }

        public Criteria andQqAccountLessThanOrEqualTo(String value) {
            addCriterion("qq_account <=", value, "qqAccount");
            return (Criteria) this;
        }

        public Criteria andQqAccountLike(String value) {
            addCriterion("qq_account like", value, "qqAccount");
            return (Criteria) this;
        }

        public Criteria andQqAccountNotLike(String value) {
            addCriterion("qq_account not like", value, "qqAccount");
            return (Criteria) this;
        }

        public Criteria andQqAccountIn(List<String> values) {
            addCriterion("qq_account in", values, "qqAccount");
            return (Criteria) this;
        }

        public Criteria andQqAccountNotIn(List<String> values) {
            addCriterion("qq_account not in", values, "qqAccount");
            return (Criteria) this;
        }

        public Criteria andQqAccountBetween(String value1, String value2) {
            addCriterion("qq_account between", value1, value2, "qqAccount");
            return (Criteria) this;
        }

        public Criteria andQqAccountNotBetween(String value1, String value2) {
            addCriterion("qq_account not between", value1, value2, "qqAccount");
            return (Criteria) this;
        }

        public Criteria andWeiboAccountIsNull() {
            addCriterion("weibo_account is null");
            return (Criteria) this;
        }

        public Criteria andWeiboAccountIsNotNull() {
            addCriterion("weibo_account is not null");
            return (Criteria) this;
        }

        public Criteria andWeiboAccountEqualTo(String value) {
            addCriterion("weibo_account =", value, "weiboAccount");
            return (Criteria) this;
        }

        public Criteria andWeiboAccountNotEqualTo(String value) {
            addCriterion("weibo_account <>", value, "weiboAccount");
            return (Criteria) this;
        }

        public Criteria andWeiboAccountGreaterThan(String value) {
            addCriterion("weibo_account >", value, "weiboAccount");
            return (Criteria) this;
        }

        public Criteria andWeiboAccountGreaterThanOrEqualTo(String value) {
            addCriterion("weibo_account >=", value, "weiboAccount");
            return (Criteria) this;
        }

        public Criteria andWeiboAccountLessThan(String value) {
            addCriterion("weibo_account <", value, "weiboAccount");
            return (Criteria) this;
        }

        public Criteria andWeiboAccountLessThanOrEqualTo(String value) {
            addCriterion("weibo_account <=", value, "weiboAccount");
            return (Criteria) this;
        }

        public Criteria andWeiboAccountLike(String value) {
            addCriterion("weibo_account like", value, "weiboAccount");
            return (Criteria) this;
        }

        public Criteria andWeiboAccountNotLike(String value) {
            addCriterion("weibo_account not like", value, "weiboAccount");
            return (Criteria) this;
        }

        public Criteria andWeiboAccountIn(List<String> values) {
            addCriterion("weibo_account in", values, "weiboAccount");
            return (Criteria) this;
        }

        public Criteria andWeiboAccountNotIn(List<String> values) {
            addCriterion("weibo_account not in", values, "weiboAccount");
            return (Criteria) this;
        }

        public Criteria andWeiboAccountBetween(String value1, String value2) {
            addCriterion("weibo_account between", value1, value2, "weiboAccount");
            return (Criteria) this;
        }

        public Criteria andWeiboAccountNotBetween(String value1, String value2) {
            addCriterion("weibo_account not between", value1, value2, "weiboAccount");
            return (Criteria) this;
        }

        public Criteria andWeixinAccountIsNull() {
            addCriterion("weixin_account is null");
            return (Criteria) this;
        }

        public Criteria andWeixinAccountIsNotNull() {
            addCriterion("weixin_account is not null");
            return (Criteria) this;
        }

        public Criteria andWeixinAccountEqualTo(String value) {
            addCriterion("weixin_account =", value, "weixinAccount");
            return (Criteria) this;
        }

        public Criteria andWeixinAccountNotEqualTo(String value) {
            addCriterion("weixin_account <>", value, "weixinAccount");
            return (Criteria) this;
        }

        public Criteria andWeixinAccountGreaterThan(String value) {
            addCriterion("weixin_account >", value, "weixinAccount");
            return (Criteria) this;
        }

        public Criteria andWeixinAccountGreaterThanOrEqualTo(String value) {
            addCriterion("weixin_account >=", value, "weixinAccount");
            return (Criteria) this;
        }

        public Criteria andWeixinAccountLessThan(String value) {
            addCriterion("weixin_account <", value, "weixinAccount");
            return (Criteria) this;
        }

        public Criteria andWeixinAccountLessThanOrEqualTo(String value) {
            addCriterion("weixin_account <=", value, "weixinAccount");
            return (Criteria) this;
        }

        public Criteria andWeixinAccountLike(String value) {
            addCriterion("weixin_account like", value, "weixinAccount");
            return (Criteria) this;
        }

        public Criteria andWeixinAccountNotLike(String value) {
            addCriterion("weixin_account not like", value, "weixinAccount");
            return (Criteria) this;
        }

        public Criteria andWeixinAccountIn(List<String> values) {
            addCriterion("weixin_account in", values, "weixinAccount");
            return (Criteria) this;
        }

        public Criteria andWeixinAccountNotIn(List<String> values) {
            addCriterion("weixin_account not in", values, "weixinAccount");
            return (Criteria) this;
        }

        public Criteria andWeixinAccountBetween(String value1, String value2) {
            addCriterion("weixin_account between", value1, value2, "weixinAccount");
            return (Criteria) this;
        }

        public Criteria andWeixinAccountNotBetween(String value1, String value2) {
            addCriterion("weixin_account not between", value1, value2, "weixinAccount");
            return (Criteria) this;
        }

        public Criteria andBaiduAccountIsNull() {
            addCriterion("baidu_account is null");
            return (Criteria) this;
        }

        public Criteria andBaiduAccountIsNotNull() {
            addCriterion("baidu_account is not null");
            return (Criteria) this;
        }

        public Criteria andBaiduAccountEqualTo(String value) {
            addCriterion("baidu_account =", value, "baiduAccount");
            return (Criteria) this;
        }

        public Criteria andBaiduAccountNotEqualTo(String value) {
            addCriterion("baidu_account <>", value, "baiduAccount");
            return (Criteria) this;
        }

        public Criteria andBaiduAccountGreaterThan(String value) {
            addCriterion("baidu_account >", value, "baiduAccount");
            return (Criteria) this;
        }

        public Criteria andBaiduAccountGreaterThanOrEqualTo(String value) {
            addCriterion("baidu_account >=", value, "baiduAccount");
            return (Criteria) this;
        }

        public Criteria andBaiduAccountLessThan(String value) {
            addCriterion("baidu_account <", value, "baiduAccount");
            return (Criteria) this;
        }

        public Criteria andBaiduAccountLessThanOrEqualTo(String value) {
            addCriterion("baidu_account <=", value, "baiduAccount");
            return (Criteria) this;
        }

        public Criteria andBaiduAccountLike(String value) {
            addCriterion("baidu_account like", value, "baiduAccount");
            return (Criteria) this;
        }

        public Criteria andBaiduAccountNotLike(String value) {
            addCriterion("baidu_account not like", value, "baiduAccount");
            return (Criteria) this;
        }

        public Criteria andBaiduAccountIn(List<String> values) {
            addCriterion("baidu_account in", values, "baiduAccount");
            return (Criteria) this;
        }

        public Criteria andBaiduAccountNotIn(List<String> values) {
            addCriterion("baidu_account not in", values, "baiduAccount");
            return (Criteria) this;
        }

        public Criteria andBaiduAccountBetween(String value1, String value2) {
            addCriterion("baidu_account between", value1, value2, "baiduAccount");
            return (Criteria) this;
        }

        public Criteria andBaiduAccountNotBetween(String value1, String value2) {
            addCriterion("baidu_account not between", value1, value2, "baiduAccount");
            return (Criteria) this;
        }

        public Criteria andAlipayAccountIsNull() {
            addCriterion("alipay_account is null");
            return (Criteria) this;
        }

        public Criteria andAlipayAccountIsNotNull() {
            addCriterion("alipay_account is not null");
            return (Criteria) this;
        }

        public Criteria andAlipayAccountEqualTo(String value) {
            addCriterion("alipay_account =", value, "alipayAccount");
            return (Criteria) this;
        }

        public Criteria andAlipayAccountNotEqualTo(String value) {
            addCriterion("alipay_account <>", value, "alipayAccount");
            return (Criteria) this;
        }

        public Criteria andAlipayAccountGreaterThan(String value) {
            addCriterion("alipay_account >", value, "alipayAccount");
            return (Criteria) this;
        }

        public Criteria andAlipayAccountGreaterThanOrEqualTo(String value) {
            addCriterion("alipay_account >=", value, "alipayAccount");
            return (Criteria) this;
        }

        public Criteria andAlipayAccountLessThan(String value) {
            addCriterion("alipay_account <", value, "alipayAccount");
            return (Criteria) this;
        }

        public Criteria andAlipayAccountLessThanOrEqualTo(String value) {
            addCriterion("alipay_account <=", value, "alipayAccount");
            return (Criteria) this;
        }

        public Criteria andAlipayAccountLike(String value) {
            addCriterion("alipay_account like", value, "alipayAccount");
            return (Criteria) this;
        }

        public Criteria andAlipayAccountNotLike(String value) {
            addCriterion("alipay_account not like", value, "alipayAccount");
            return (Criteria) this;
        }

        public Criteria andAlipayAccountIn(List<String> values) {
            addCriterion("alipay_account in", values, "alipayAccount");
            return (Criteria) this;
        }

        public Criteria andAlipayAccountNotIn(List<String> values) {
            addCriterion("alipay_account not in", values, "alipayAccount");
            return (Criteria) this;
        }

        public Criteria andAlipayAccountBetween(String value1, String value2) {
            addCriterion("alipay_account between", value1, value2, "alipayAccount");
            return (Criteria) this;
        }

        public Criteria andAlipayAccountNotBetween(String value1, String value2) {
            addCriterion("alipay_account not between", value1, value2, "alipayAccount");
            return (Criteria) this;
        }

        public Criteria andDoubanAccountIsNull() {
            addCriterion("douban_account is null");
            return (Criteria) this;
        }

        public Criteria andDoubanAccountIsNotNull() {
            addCriterion("douban_account is not null");
            return (Criteria) this;
        }

        public Criteria andDoubanAccountEqualTo(String value) {
            addCriterion("douban_account =", value, "doubanAccount");
            return (Criteria) this;
        }

        public Criteria andDoubanAccountNotEqualTo(String value) {
            addCriterion("douban_account <>", value, "doubanAccount");
            return (Criteria) this;
        }

        public Criteria andDoubanAccountGreaterThan(String value) {
            addCriterion("douban_account >", value, "doubanAccount");
            return (Criteria) this;
        }

        public Criteria andDoubanAccountGreaterThanOrEqualTo(String value) {
            addCriterion("douban_account >=", value, "doubanAccount");
            return (Criteria) this;
        }

        public Criteria andDoubanAccountLessThan(String value) {
            addCriterion("douban_account <", value, "doubanAccount");
            return (Criteria) this;
        }

        public Criteria andDoubanAccountLessThanOrEqualTo(String value) {
            addCriterion("douban_account <=", value, "doubanAccount");
            return (Criteria) this;
        }

        public Criteria andDoubanAccountLike(String value) {
            addCriterion("douban_account like", value, "doubanAccount");
            return (Criteria) this;
        }

        public Criteria andDoubanAccountNotLike(String value) {
            addCriterion("douban_account not like", value, "doubanAccount");
            return (Criteria) this;
        }

        public Criteria andDoubanAccountIn(List<String> values) {
            addCriterion("douban_account in", values, "doubanAccount");
            return (Criteria) this;
        }

        public Criteria andDoubanAccountNotIn(List<String> values) {
            addCriterion("douban_account not in", values, "doubanAccount");
            return (Criteria) this;
        }

        public Criteria andDoubanAccountBetween(String value1, String value2) {
            addCriterion("douban_account between", value1, value2, "doubanAccount");
            return (Criteria) this;
        }

        public Criteria andDoubanAccountNotBetween(String value1, String value2) {
            addCriterion("douban_account not between", value1, value2, "doubanAccount");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNull() {
            addCriterion("telephone is null");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNotNull() {
            addCriterion("telephone is not null");
            return (Criteria) this;
        }

        public Criteria andTelephoneEqualTo(String value) {
            addCriterion("telephone =", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotEqualTo(String value) {
            addCriterion("telephone <>", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThan(String value) {
            addCriterion("telephone >", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("telephone >=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThan(String value) {
            addCriterion("telephone <", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThanOrEqualTo(String value) {
            addCriterion("telephone <=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLike(String value) {
            addCriterion("telephone like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotLike(String value) {
            addCriterion("telephone not like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneIn(List<String> values) {
            addCriterion("telephone in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotIn(List<String> values) {
            addCriterion("telephone not in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneBetween(String value1, String value2) {
            addCriterion("telephone between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotBetween(String value1, String value2) {
            addCriterion("telephone not between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andWorkAddressIsNull() {
            addCriterion("work_address is null");
            return (Criteria) this;
        }

        public Criteria andWorkAddressIsNotNull() {
            addCriterion("work_address is not null");
            return (Criteria) this;
        }

        public Criteria andWorkAddressEqualTo(String value) {
            addCriterion("work_address =", value, "workAddress");
            return (Criteria) this;
        }

        public Criteria andWorkAddressNotEqualTo(String value) {
            addCriterion("work_address <>", value, "workAddress");
            return (Criteria) this;
        }

        public Criteria andWorkAddressGreaterThan(String value) {
            addCriterion("work_address >", value, "workAddress");
            return (Criteria) this;
        }

        public Criteria andWorkAddressGreaterThanOrEqualTo(String value) {
            addCriterion("work_address >=", value, "workAddress");
            return (Criteria) this;
        }

        public Criteria andWorkAddressLessThan(String value) {
            addCriterion("work_address <", value, "workAddress");
            return (Criteria) this;
        }

        public Criteria andWorkAddressLessThanOrEqualTo(String value) {
            addCriterion("work_address <=", value, "workAddress");
            return (Criteria) this;
        }

        public Criteria andWorkAddressLike(String value) {
            addCriterion("work_address like", value, "workAddress");
            return (Criteria) this;
        }

        public Criteria andWorkAddressNotLike(String value) {
            addCriterion("work_address not like", value, "workAddress");
            return (Criteria) this;
        }

        public Criteria andWorkAddressIn(List<String> values) {
            addCriterion("work_address in", values, "workAddress");
            return (Criteria) this;
        }

        public Criteria andWorkAddressNotIn(List<String> values) {
            addCriterion("work_address not in", values, "workAddress");
            return (Criteria) this;
        }

        public Criteria andWorkAddressBetween(String value1, String value2) {
            addCriterion("work_address between", value1, value2, "workAddress");
            return (Criteria) this;
        }

        public Criteria andWorkAddressNotBetween(String value1, String value2) {
            addCriterion("work_address not between", value1, value2, "workAddress");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andPostCodeIsNull() {
            addCriterion("post_code is null");
            return (Criteria) this;
        }

        public Criteria andPostCodeIsNotNull() {
            addCriterion("post_code is not null");
            return (Criteria) this;
        }

        public Criteria andPostCodeEqualTo(String value) {
            addCriterion("post_code =", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeNotEqualTo(String value) {
            addCriterion("post_code <>", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeGreaterThan(String value) {
            addCriterion("post_code >", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeGreaterThanOrEqualTo(String value) {
            addCriterion("post_code >=", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeLessThan(String value) {
            addCriterion("post_code <", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeLessThanOrEqualTo(String value) {
            addCriterion("post_code <=", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeLike(String value) {
            addCriterion("post_code like", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeNotLike(String value) {
            addCriterion("post_code not like", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeIn(List<String> values) {
            addCriterion("post_code in", values, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeNotIn(List<String> values) {
            addCriterion("post_code not in", values, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeBetween(String value1, String value2) {
            addCriterion("post_code between", value1, value2, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeNotBetween(String value1, String value2) {
            addCriterion("post_code not between", value1, value2, "postCode");
            return (Criteria) this;
        }

        public Criteria andEducationIdIsNull() {
            addCriterion("education_id is null");
            return (Criteria) this;
        }

        public Criteria andEducationIdIsNotNull() {
            addCriterion("education_id is not null");
            return (Criteria) this;
        }

        public Criteria andEducationIdEqualTo(Byte value) {
            addCriterion("education_id =", value, "educationId");
            return (Criteria) this;
        }

        public Criteria andEducationIdNotEqualTo(Byte value) {
            addCriterion("education_id <>", value, "educationId");
            return (Criteria) this;
        }

        public Criteria andEducationIdGreaterThan(Byte value) {
            addCriterion("education_id >", value, "educationId");
            return (Criteria) this;
        }

        public Criteria andEducationIdGreaterThanOrEqualTo(Byte value) {
            addCriterion("education_id >=", value, "educationId");
            return (Criteria) this;
        }

        public Criteria andEducationIdLessThan(Byte value) {
            addCriterion("education_id <", value, "educationId");
            return (Criteria) this;
        }

        public Criteria andEducationIdLessThanOrEqualTo(Byte value) {
            addCriterion("education_id <=", value, "educationId");
            return (Criteria) this;
        }

        public Criteria andEducationIdIn(List<Byte> values) {
            addCriterion("education_id in", values, "educationId");
            return (Criteria) this;
        }

        public Criteria andEducationIdNotIn(List<Byte> values) {
            addCriterion("education_id not in", values, "educationId");
            return (Criteria) this;
        }

        public Criteria andEducationIdBetween(Byte value1, Byte value2) {
            addCriterion("education_id between", value1, value2, "educationId");
            return (Criteria) this;
        }

        public Criteria andEducationIdNotBetween(Byte value1, Byte value2) {
            addCriterion("education_id not between", value1, value2, "educationId");
            return (Criteria) this;
        }

        public Criteria andVocationIdIsNull() {
            addCriterion("vocation_id is null");
            return (Criteria) this;
        }

        public Criteria andVocationIdIsNotNull() {
            addCriterion("vocation_id is not null");
            return (Criteria) this;
        }

        public Criteria andVocationIdEqualTo(Byte value) {
            addCriterion("vocation_id =", value, "vocationId");
            return (Criteria) this;
        }

        public Criteria andVocationIdNotEqualTo(Byte value) {
            addCriterion("vocation_id <>", value, "vocationId");
            return (Criteria) this;
        }

        public Criteria andVocationIdGreaterThan(Byte value) {
            addCriterion("vocation_id >", value, "vocationId");
            return (Criteria) this;
        }

        public Criteria andVocationIdGreaterThanOrEqualTo(Byte value) {
            addCriterion("vocation_id >=", value, "vocationId");
            return (Criteria) this;
        }

        public Criteria andVocationIdLessThan(Byte value) {
            addCriterion("vocation_id <", value, "vocationId");
            return (Criteria) this;
        }

        public Criteria andVocationIdLessThanOrEqualTo(Byte value) {
            addCriterion("vocation_id <=", value, "vocationId");
            return (Criteria) this;
        }

        public Criteria andVocationIdIn(List<Byte> values) {
            addCriterion("vocation_id in", values, "vocationId");
            return (Criteria) this;
        }

        public Criteria andVocationIdNotIn(List<Byte> values) {
            addCriterion("vocation_id not in", values, "vocationId");
            return (Criteria) this;
        }

        public Criteria andVocationIdBetween(Byte value1, Byte value2) {
            addCriterion("vocation_id between", value1, value2, "vocationId");
            return (Criteria) this;
        }

        public Criteria andVocationIdNotBetween(Byte value1, Byte value2) {
            addCriterion("vocation_id not between", value1, value2, "vocationId");
            return (Criteria) this;
        }

        public Criteria andIncomeIdIsNull() {
            addCriterion("income_id is null");
            return (Criteria) this;
        }

        public Criteria andIncomeIdIsNotNull() {
            addCriterion("income_id is not null");
            return (Criteria) this;
        }

        public Criteria andIncomeIdEqualTo(Byte value) {
            addCriterion("income_id =", value, "incomeId");
            return (Criteria) this;
        }

        public Criteria andIncomeIdNotEqualTo(Byte value) {
            addCriterion("income_id <>", value, "incomeId");
            return (Criteria) this;
        }

        public Criteria andIncomeIdGreaterThan(Byte value) {
            addCriterion("income_id >", value, "incomeId");
            return (Criteria) this;
        }

        public Criteria andIncomeIdGreaterThanOrEqualTo(Byte value) {
            addCriterion("income_id >=", value, "incomeId");
            return (Criteria) this;
        }

        public Criteria andIncomeIdLessThan(Byte value) {
            addCriterion("income_id <", value, "incomeId");
            return (Criteria) this;
        }

        public Criteria andIncomeIdLessThanOrEqualTo(Byte value) {
            addCriterion("income_id <=", value, "incomeId");
            return (Criteria) this;
        }

        public Criteria andIncomeIdIn(List<Byte> values) {
            addCriterion("income_id in", values, "incomeId");
            return (Criteria) this;
        }

        public Criteria andIncomeIdNotIn(List<Byte> values) {
            addCriterion("income_id not in", values, "incomeId");
            return (Criteria) this;
        }

        public Criteria andIncomeIdBetween(Byte value1, Byte value2) {
            addCriterion("income_id between", value1, value2, "incomeId");
            return (Criteria) this;
        }

        public Criteria andIncomeIdNotBetween(Byte value1, Byte value2) {
            addCriterion("income_id not between", value1, value2, "incomeId");
            return (Criteria) this;
        }

        public Criteria andCityWideidIsNull() {
            addCriterion("city_wideId is null");
            return (Criteria) this;
        }

        public Criteria andCityWideidIsNotNull() {
            addCriterion("city_wideId is not null");
            return (Criteria) this;
        }

        public Criteria andCityWideidEqualTo(Byte value) {
            addCriterion("city_wideId =", value, "cityWideid");
            return (Criteria) this;
        }

        public Criteria andCityWideidNotEqualTo(Byte value) {
            addCriterion("city_wideId <>", value, "cityWideid");
            return (Criteria) this;
        }

        public Criteria andCityWideidGreaterThan(Byte value) {
            addCriterion("city_wideId >", value, "cityWideid");
            return (Criteria) this;
        }

        public Criteria andCityWideidGreaterThanOrEqualTo(Byte value) {
            addCriterion("city_wideId >=", value, "cityWideid");
            return (Criteria) this;
        }

        public Criteria andCityWideidLessThan(Byte value) {
            addCriterion("city_wideId <", value, "cityWideid");
            return (Criteria) this;
        }

        public Criteria andCityWideidLessThanOrEqualTo(Byte value) {
            addCriterion("city_wideId <=", value, "cityWideid");
            return (Criteria) this;
        }

        public Criteria andCityWideidIn(List<Byte> values) {
            addCriterion("city_wideId in", values, "cityWideid");
            return (Criteria) this;
        }

        public Criteria andCityWideidNotIn(List<Byte> values) {
            addCriterion("city_wideId not in", values, "cityWideid");
            return (Criteria) this;
        }

        public Criteria andCityWideidBetween(Byte value1, Byte value2) {
            addCriterion("city_wideId between", value1, value2, "cityWideid");
            return (Criteria) this;
        }

        public Criteria andCityWideidNotBetween(Byte value1, Byte value2) {
            addCriterion("city_wideId not between", value1, value2, "cityWideid");
            return (Criteria) this;
        }

        public Criteria andDegreeIdIsNull() {
            addCriterion("degree_id is null");
            return (Criteria) this;
        }

        public Criteria andDegreeIdIsNotNull() {
            addCriterion("degree_id is not null");
            return (Criteria) this;
        }

        public Criteria andDegreeIdEqualTo(Byte value) {
            addCriterion("degree_id =", value, "degreeId");
            return (Criteria) this;
        }

        public Criteria andDegreeIdNotEqualTo(Byte value) {
            addCriterion("degree_id <>", value, "degreeId");
            return (Criteria) this;
        }

        public Criteria andDegreeIdGreaterThan(Byte value) {
            addCriterion("degree_id >", value, "degreeId");
            return (Criteria) this;
        }

        public Criteria andDegreeIdGreaterThanOrEqualTo(Byte value) {
            addCriterion("degree_id >=", value, "degreeId");
            return (Criteria) this;
        }

        public Criteria andDegreeIdLessThan(Byte value) {
            addCriterion("degree_id <", value, "degreeId");
            return (Criteria) this;
        }

        public Criteria andDegreeIdLessThanOrEqualTo(Byte value) {
            addCriterion("degree_id <=", value, "degreeId");
            return (Criteria) this;
        }

        public Criteria andDegreeIdIn(List<Byte> values) {
            addCriterion("degree_id in", values, "degreeId");
            return (Criteria) this;
        }

        public Criteria andDegreeIdNotIn(List<Byte> values) {
            addCriterion("degree_id not in", values, "degreeId");
            return (Criteria) this;
        }

        public Criteria andDegreeIdBetween(Byte value1, Byte value2) {
            addCriterion("degree_id between", value1, value2, "degreeId");
            return (Criteria) this;
        }

        public Criteria andDegreeIdNotBetween(Byte value1, Byte value2) {
            addCriterion("degree_id not between", value1, value2, "degreeId");
            return (Criteria) this;
        }

        public Criteria andNationIdIsNull() {
            addCriterion("nation_id is null");
            return (Criteria) this;
        }

        public Criteria andNationIdIsNotNull() {
            addCriterion("nation_id is not null");
            return (Criteria) this;
        }

        public Criteria andNationIdEqualTo(Byte value) {
            addCriterion("nation_id =", value, "nationId");
            return (Criteria) this;
        }

        public Criteria andNationIdNotEqualTo(Byte value) {
            addCriterion("nation_id <>", value, "nationId");
            return (Criteria) this;
        }

        public Criteria andNationIdGreaterThan(Byte value) {
            addCriterion("nation_id >", value, "nationId");
            return (Criteria) this;
        }

        public Criteria andNationIdGreaterThanOrEqualTo(Byte value) {
            addCriterion("nation_id >=", value, "nationId");
            return (Criteria) this;
        }

        public Criteria andNationIdLessThan(Byte value) {
            addCriterion("nation_id <", value, "nationId");
            return (Criteria) this;
        }

        public Criteria andNationIdLessThanOrEqualTo(Byte value) {
            addCriterion("nation_id <=", value, "nationId");
            return (Criteria) this;
        }

        public Criteria andNationIdIn(List<Byte> values) {
            addCriterion("nation_id in", values, "nationId");
            return (Criteria) this;
        }

        public Criteria andNationIdNotIn(List<Byte> values) {
            addCriterion("nation_id not in", values, "nationId");
            return (Criteria) this;
        }

        public Criteria andNationIdBetween(Byte value1, Byte value2) {
            addCriterion("nation_id between", value1, value2, "nationId");
            return (Criteria) this;
        }

        public Criteria andNationIdNotBetween(Byte value1, Byte value2) {
            addCriterion("nation_id not between", value1, value2, "nationId");
            return (Criteria) this;
        }

        public Criteria andVehicleIdIsNull() {
            addCriterion("vehicle_id is null");
            return (Criteria) this;
        }

        public Criteria andVehicleIdIsNotNull() {
            addCriterion("vehicle_id is not null");
            return (Criteria) this;
        }

        public Criteria andVehicleIdEqualTo(Byte value) {
            addCriterion("vehicle_id =", value, "vehicleId");
            return (Criteria) this;
        }

        public Criteria andVehicleIdNotEqualTo(Byte value) {
            addCriterion("vehicle_id <>", value, "vehicleId");
            return (Criteria) this;
        }

        public Criteria andVehicleIdGreaterThan(Byte value) {
            addCriterion("vehicle_id >", value, "vehicleId");
            return (Criteria) this;
        }

        public Criteria andVehicleIdGreaterThanOrEqualTo(Byte value) {
            addCriterion("vehicle_id >=", value, "vehicleId");
            return (Criteria) this;
        }

        public Criteria andVehicleIdLessThan(Byte value) {
            addCriterion("vehicle_id <", value, "vehicleId");
            return (Criteria) this;
        }

        public Criteria andVehicleIdLessThanOrEqualTo(Byte value) {
            addCriterion("vehicle_id <=", value, "vehicleId");
            return (Criteria) this;
        }

        public Criteria andVehicleIdIn(List<Byte> values) {
            addCriterion("vehicle_id in", values, "vehicleId");
            return (Criteria) this;
        }

        public Criteria andVehicleIdNotIn(List<Byte> values) {
            addCriterion("vehicle_id not in", values, "vehicleId");
            return (Criteria) this;
        }

        public Criteria andVehicleIdBetween(Byte value1, Byte value2) {
            addCriterion("vehicle_id between", value1, value2, "vehicleId");
            return (Criteria) this;
        }

        public Criteria andVehicleIdNotBetween(Byte value1, Byte value2) {
            addCriterion("vehicle_id not between", value1, value2, "vehicleId");
            return (Criteria) this;
        }

        public Criteria andNationIsNull() {
            addCriterion("nation is null");
            return (Criteria) this;
        }

        public Criteria andNationIsNotNull() {
            addCriterion("nation is not null");
            return (Criteria) this;
        }

        public Criteria andNationEqualTo(String value) {
            addCriterion("nation =", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotEqualTo(String value) {
            addCriterion("nation <>", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThan(String value) {
            addCriterion("nation >", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThanOrEqualTo(String value) {
            addCriterion("nation >=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThan(String value) {
            addCriterion("nation <", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThanOrEqualTo(String value) {
            addCriterion("nation <=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLike(String value) {
            addCriterion("nation like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotLike(String value) {
            addCriterion("nation not like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationIn(List<String> values) {
            addCriterion("nation in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotIn(List<String> values) {
            addCriterion("nation not in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationBetween(String value1, String value2) {
            addCriterion("nation between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotBetween(String value1, String value2) {
            addCriterion("nation not between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andReasonIdIsNull() {
            addCriterion("reason_id is null");
            return (Criteria) this;
        }

        public Criteria andReasonIdIsNotNull() {
            addCriterion("reason_id is not null");
            return (Criteria) this;
        }

        public Criteria andReasonIdEqualTo(Byte value) {
            addCriterion("reason_id =", value, "reasonId");
            return (Criteria) this;
        }

        public Criteria andReasonIdNotEqualTo(Byte value) {
            addCriterion("reason_id <>", value, "reasonId");
            return (Criteria) this;
        }

        public Criteria andReasonIdGreaterThan(Byte value) {
            addCriterion("reason_id >", value, "reasonId");
            return (Criteria) this;
        }

        public Criteria andReasonIdGreaterThanOrEqualTo(Byte value) {
            addCriterion("reason_id >=", value, "reasonId");
            return (Criteria) this;
        }

        public Criteria andReasonIdLessThan(Byte value) {
            addCriterion("reason_id <", value, "reasonId");
            return (Criteria) this;
        }

        public Criteria andReasonIdLessThanOrEqualTo(Byte value) {
            addCriterion("reason_id <=", value, "reasonId");
            return (Criteria) this;
        }

        public Criteria andReasonIdIn(List<Byte> values) {
            addCriterion("reason_id in", values, "reasonId");
            return (Criteria) this;
        }

        public Criteria andReasonIdNotIn(List<Byte> values) {
            addCriterion("reason_id not in", values, "reasonId");
            return (Criteria) this;
        }

        public Criteria andReasonIdBetween(Byte value1, Byte value2) {
            addCriterion("reason_id between", value1, value2, "reasonId");
            return (Criteria) this;
        }

        public Criteria andReasonIdNotBetween(Byte value1, Byte value2) {
            addCriterion("reason_id not between", value1, value2, "reasonId");
            return (Criteria) this;
        }

        public Criteria andFrozenEditorIdIsNull() {
            addCriterion("frozen_editor_id is null");
            return (Criteria) this;
        }

        public Criteria andFrozenEditorIdIsNotNull() {
            addCriterion("frozen_editor_id is not null");
            return (Criteria) this;
        }

        public Criteria andFrozenEditorIdEqualTo(Integer value) {
            addCriterion("frozen_editor_id =", value, "frozenEditorId");
            return (Criteria) this;
        }

        public Criteria andFrozenEditorIdNotEqualTo(Integer value) {
            addCriterion("frozen_editor_id <>", value, "frozenEditorId");
            return (Criteria) this;
        }

        public Criteria andFrozenEditorIdGreaterThan(Integer value) {
            addCriterion("frozen_editor_id >", value, "frozenEditorId");
            return (Criteria) this;
        }

        public Criteria andFrozenEditorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("frozen_editor_id >=", value, "frozenEditorId");
            return (Criteria) this;
        }

        public Criteria andFrozenEditorIdLessThan(Integer value) {
            addCriterion("frozen_editor_id <", value, "frozenEditorId");
            return (Criteria) this;
        }

        public Criteria andFrozenEditorIdLessThanOrEqualTo(Integer value) {
            addCriterion("frozen_editor_id <=", value, "frozenEditorId");
            return (Criteria) this;
        }

        public Criteria andFrozenEditorIdIn(List<Integer> values) {
            addCriterion("frozen_editor_id in", values, "frozenEditorId");
            return (Criteria) this;
        }

        public Criteria andFrozenEditorIdNotIn(List<Integer> values) {
            addCriterion("frozen_editor_id not in", values, "frozenEditorId");
            return (Criteria) this;
        }

        public Criteria andFrozenEditorIdBetween(Integer value1, Integer value2) {
            addCriterion("frozen_editor_id between", value1, value2, "frozenEditorId");
            return (Criteria) this;
        }

        public Criteria andFrozenEditorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("frozen_editor_id not between", value1, value2, "frozenEditorId");
            return (Criteria) this;
        }

        public Criteria andFrozenTimeIsNull() {
            addCriterion("frozen_time is null");
            return (Criteria) this;
        }

        public Criteria andFrozenTimeIsNotNull() {
            addCriterion("frozen_time is not null");
            return (Criteria) this;
        }

        public Criteria andFrozenTimeEqualTo(Date value) {
            addCriterion("frozen_time =", value, "frozenTime");
            return (Criteria) this;
        }

        public Criteria andFrozenTimeNotEqualTo(Date value) {
            addCriterion("frozen_time <>", value, "frozenTime");
            return (Criteria) this;
        }

        public Criteria andFrozenTimeGreaterThan(Date value) {
            addCriterion("frozen_time >", value, "frozenTime");
            return (Criteria) this;
        }

        public Criteria andFrozenTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("frozen_time >=", value, "frozenTime");
            return (Criteria) this;
        }

        public Criteria andFrozenTimeLessThan(Date value) {
            addCriterion("frozen_time <", value, "frozenTime");
            return (Criteria) this;
        }

        public Criteria andFrozenTimeLessThanOrEqualTo(Date value) {
            addCriterion("frozen_time <=", value, "frozenTime");
            return (Criteria) this;
        }

        public Criteria andFrozenTimeIn(List<Date> values) {
            addCriterion("frozen_time in", values, "frozenTime");
            return (Criteria) this;
        }

        public Criteria andFrozenTimeNotIn(List<Date> values) {
            addCriterion("frozen_time not in", values, "frozenTime");
            return (Criteria) this;
        }

        public Criteria andFrozenTimeBetween(Date value1, Date value2) {
            addCriterion("frozen_time between", value1, value2, "frozenTime");
            return (Criteria) this;
        }

        public Criteria andFrozenTimeNotBetween(Date value1, Date value2) {
            addCriterion("frozen_time not between", value1, value2, "frozenTime");
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

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andDelFlagIsNull() {
            addCriterion("del_flag is null");
            return (Criteria) this;
        }

        public Criteria andDelFlagIsNotNull() {
            addCriterion("del_flag is not null");
            return (Criteria) this;
        }

        public Criteria andDelFlagEqualTo(Byte value) {
            addCriterion("del_flag =", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotEqualTo(Byte value) {
            addCriterion("del_flag <>", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagGreaterThan(Byte value) {
            addCriterion("del_flag >", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagGreaterThanOrEqualTo(Byte value) {
            addCriterion("del_flag >=", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLessThan(Byte value) {
            addCriterion("del_flag <", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLessThanOrEqualTo(Byte value) {
            addCriterion("del_flag <=", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagIn(List<Byte> values) {
            addCriterion("del_flag in", values, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotIn(List<Byte> values) {
            addCriterion("del_flag not in", values, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagBetween(Byte value1, Byte value2) {
            addCriterion("del_flag between", value1, value2, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotBetween(Byte value1, Byte value2) {
            addCriterion("del_flag not between", value1, value2, "delFlag");
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