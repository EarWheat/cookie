package com.tencent.wxcloudrun.model;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
/**
*
*  @author author
*/
public class TaskDAO implements Serializable {

    private static final long serialVersionUID = 1668766941859L;


    /**
    * 主键
    * 自增id
    * isNullAble:0
    */
    private Integer id;

    /**
    * 任务id
    * isNullAble:0
    */
    private Integer taskId;

    /**
    * 任务名称
    * isNullAble:0,defaultVal:
    */
    private String taskTitle;

    /**
    * 任务图标
    * isNullAble:0,defaultVal:
    */
    private String taskIcon;

    /**
    * 任务完成最大次数
    * isNullAble:0,defaultVal:1
    */
    private Integer taskMaxTime;

    /**
    * 任务状态
    * isNullAble:0,defaultVal:INITIAL
    */
    private String taskStatus;

    /**
    * 任务奖励
    * isNullAble:0,defaultVal:0
    */
    private Integer taskAwardPoint;

    /**
    * 任务创建时间
    * isNullAble:0,defaultVal:CURRENT_TIMESTAMP
    */
    private java.time.LocalDateTime createTime;

    /**
    * 任务更新时间
    * isNullAble:0,defaultVal:CURRENT_TIMESTAMP
    */
    private java.time.LocalDateTime updateTime;


    public void setId(Integer id){this.id = id;}

    public Integer getId(){return this.id;}

    public void setTaskId(Integer taskId){this.taskId = taskId;}

    public Integer getTaskId(){return this.taskId;}

    public void setTaskTitle(String taskTitle){this.taskTitle = taskTitle;}

    public String getTaskTitle(){return this.taskTitle;}

    public void setTaskIcon(String taskIcon){this.taskIcon = taskIcon;}

    public String getTaskIcon(){return this.taskIcon;}

    public void setTaskMaxTime(Integer taskMaxTime){this.taskMaxTime = taskMaxTime;}

    public Integer getTaskMaxTime(){return this.taskMaxTime;}

    public void setTaskStatus(String taskStatus){this.taskStatus = taskStatus;}

    public String getTaskStatus(){return this.taskStatus;}

    public void setTaskAwardPoint(Integer taskAwardPoint){this.taskAwardPoint = taskAwardPoint;}

    public Integer getTaskAwardPoint(){return this.taskAwardPoint;}

    public void setCreateTime(java.time.LocalDateTime createTime){this.createTime = createTime;}

    public java.time.LocalDateTime getCreateTime(){return this.createTime;}

    public void setUpdateTime(java.time.LocalDateTime updateTime){this.updateTime = updateTime;}

    public java.time.LocalDateTime getUpdateTime(){return this.updateTime;}
    @Override
    public String toString() {
        return "TaskDAO{" +
                "id='" + id + '\'' +
                "taskId='" + taskId + '\'' +
                "taskTitle='" + taskTitle + '\'' +
                "taskIcon='" + taskIcon + '\'' +
                "taskMaxTime='" + taskMaxTime + '\'' +
                "taskStatus='" + taskStatus + '\'' +
                "taskAwardPoint='" + taskAwardPoint + '\'' +
                "createTime='" + createTime + '\'' +
                "updateTime='" + updateTime + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private TaskDAO set;

        private ConditionBuilder where;

        public UpdateBuilder set(TaskDAO set){
            this.set = set;
            return this;
        }

        public TaskDAO getSet(){
            return this.set;
        }

        public UpdateBuilder where(ConditionBuilder where){
            this.where = where;
            return this;
        }

        public ConditionBuilder getWhere(){
            return this.where;
        }

        public UpdateBuilder build(){
            return this;
        }
    }

    public static class QueryBuilder extends TaskDAO{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<Integer> idList;

        public List<Integer> getIdList(){return this.idList;}

        private Integer idSt;

        private Integer idEd;

        public Integer getIdSt(){return this.idSt;}

        public Integer getIdEd(){return this.idEd;}

        private List<Integer> taskIdList;

        public List<Integer> getTaskIdList(){return this.taskIdList;}

        private Integer taskIdSt;

        private Integer taskIdEd;

        public Integer getTaskIdSt(){return this.taskIdSt;}

        public Integer getTaskIdEd(){return this.taskIdEd;}

        private List<String> taskTitleList;

        public List<String> getTaskTitleList(){return this.taskTitleList;}


        private List<String> fuzzyTaskTitle;

        public List<String> getFuzzyTaskTitle(){return this.fuzzyTaskTitle;}

        private List<String> rightFuzzyTaskTitle;

        public List<String> getRightFuzzyTaskTitle(){return this.rightFuzzyTaskTitle;}
        private List<String> taskIconList;

        public List<String> getTaskIconList(){return this.taskIconList;}


        private List<String> fuzzyTaskIcon;

        public List<String> getFuzzyTaskIcon(){return this.fuzzyTaskIcon;}

        private List<String> rightFuzzyTaskIcon;

        public List<String> getRightFuzzyTaskIcon(){return this.rightFuzzyTaskIcon;}
        private List<Integer> taskMaxTimeList;

        public List<Integer> getTaskMaxTimeList(){return this.taskMaxTimeList;}

        private Integer taskMaxTimeSt;

        private Integer taskMaxTimeEd;

        public Integer getTaskMaxTimeSt(){return this.taskMaxTimeSt;}

        public Integer getTaskMaxTimeEd(){return this.taskMaxTimeEd;}

        private List<String> taskStatusList;

        public List<String> getTaskStatusList(){return this.taskStatusList;}


        private List<String> fuzzyTaskStatus;

        public List<String> getFuzzyTaskStatus(){return this.fuzzyTaskStatus;}

        private List<String> rightFuzzyTaskStatus;

        public List<String> getRightFuzzyTaskStatus(){return this.rightFuzzyTaskStatus;}
        private List<Integer> taskAwardPointList;

        public List<Integer> getTaskAwardPointList(){return this.taskAwardPointList;}

        private Integer taskAwardPointSt;

        private Integer taskAwardPointEd;

        public Integer getTaskAwardPointSt(){return this.taskAwardPointSt;}

        public Integer getTaskAwardPointEd(){return this.taskAwardPointEd;}

        private List<java.time.LocalDateTime> createTimeList;

        public List<java.time.LocalDateTime> getCreateTimeList(){return this.createTimeList;}

        private java.time.LocalDateTime createTimeSt;

        private java.time.LocalDateTime createTimeEd;

        public java.time.LocalDateTime getCreateTimeSt(){return this.createTimeSt;}

        public java.time.LocalDateTime getCreateTimeEd(){return this.createTimeEd;}

        private List<java.time.LocalDateTime> updateTimeList;

        public List<java.time.LocalDateTime> getUpdateTimeList(){return this.updateTimeList;}

        private java.time.LocalDateTime updateTimeSt;

        private java.time.LocalDateTime updateTimeEd;

        public java.time.LocalDateTime getUpdateTimeSt(){return this.updateTimeSt;}

        public java.time.LocalDateTime getUpdateTimeEd(){return this.updateTimeEd;}

        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }

        public QueryBuilder idBetWeen(Integer idSt,Integer idEd){
            this.idSt = idSt;
            this.idEd = idEd;
            return this;
        }

        public QueryBuilder idGreaterEqThan(Integer idSt){
            this.idSt = idSt;
            return this;
        }
        public QueryBuilder idLessEqThan(Integer idEd){
            this.idEd = idEd;
            return this;
        }


        public QueryBuilder id(Integer id){
            setId(id);
            return this;
        }

        public QueryBuilder idList(Integer ... id){
            this.idList = solveNullList(id);
            return this;
        }

        public QueryBuilder idList(List<Integer> id){
            this.idList = id;
            return this;
        }

        public QueryBuilder fetchId(){
            setFetchFields("fetchFields","id");
            return this;
        }

        public QueryBuilder excludeId(){
            setFetchFields("excludeFields","id");
            return this;
        }

        public QueryBuilder taskIdBetWeen(Integer taskIdSt,Integer taskIdEd){
            this.taskIdSt = taskIdSt;
            this.taskIdEd = taskIdEd;
            return this;
        }

        public QueryBuilder taskIdGreaterEqThan(Integer taskIdSt){
            this.taskIdSt = taskIdSt;
            return this;
        }
        public QueryBuilder taskIdLessEqThan(Integer taskIdEd){
            this.taskIdEd = taskIdEd;
            return this;
        }


        public QueryBuilder taskId(Integer taskId){
            setTaskId(taskId);
            return this;
        }

        public QueryBuilder taskIdList(Integer ... taskId){
            this.taskIdList = solveNullList(taskId);
            return this;
        }

        public QueryBuilder taskIdList(List<Integer> taskId){
            this.taskIdList = taskId;
            return this;
        }

        public QueryBuilder fetchTaskId(){
            setFetchFields("fetchFields","taskId");
            return this;
        }

        public QueryBuilder excludeTaskId(){
            setFetchFields("excludeFields","taskId");
            return this;
        }

        public QueryBuilder fuzzyTaskTitle (List<String> fuzzyTaskTitle){
            this.fuzzyTaskTitle = fuzzyTaskTitle;
            return this;
        }

        public QueryBuilder fuzzyTaskTitle (String ... fuzzyTaskTitle){
            this.fuzzyTaskTitle = solveNullList(fuzzyTaskTitle);
            return this;
        }

        public QueryBuilder rightFuzzyTaskTitle (List<String> rightFuzzyTaskTitle){
            this.rightFuzzyTaskTitle = rightFuzzyTaskTitle;
            return this;
        }

        public QueryBuilder rightFuzzyTaskTitle (String ... rightFuzzyTaskTitle){
            this.rightFuzzyTaskTitle = solveNullList(rightFuzzyTaskTitle);
            return this;
        }

        public QueryBuilder taskTitle(String taskTitle){
            setTaskTitle(taskTitle);
            return this;
        }

        public QueryBuilder taskTitleList(String ... taskTitle){
            this.taskTitleList = solveNullList(taskTitle);
            return this;
        }

        public QueryBuilder taskTitleList(List<String> taskTitle){
            this.taskTitleList = taskTitle;
            return this;
        }

        public QueryBuilder fetchTaskTitle(){
            setFetchFields("fetchFields","taskTitle");
            return this;
        }

        public QueryBuilder excludeTaskTitle(){
            setFetchFields("excludeFields","taskTitle");
            return this;
        }

        public QueryBuilder fuzzyTaskIcon (List<String> fuzzyTaskIcon){
            this.fuzzyTaskIcon = fuzzyTaskIcon;
            return this;
        }

        public QueryBuilder fuzzyTaskIcon (String ... fuzzyTaskIcon){
            this.fuzzyTaskIcon = solveNullList(fuzzyTaskIcon);
            return this;
        }

        public QueryBuilder rightFuzzyTaskIcon (List<String> rightFuzzyTaskIcon){
            this.rightFuzzyTaskIcon = rightFuzzyTaskIcon;
            return this;
        }

        public QueryBuilder rightFuzzyTaskIcon (String ... rightFuzzyTaskIcon){
            this.rightFuzzyTaskIcon = solveNullList(rightFuzzyTaskIcon);
            return this;
        }

        public QueryBuilder taskIcon(String taskIcon){
            setTaskIcon(taskIcon);
            return this;
        }

        public QueryBuilder taskIconList(String ... taskIcon){
            this.taskIconList = solveNullList(taskIcon);
            return this;
        }

        public QueryBuilder taskIconList(List<String> taskIcon){
            this.taskIconList = taskIcon;
            return this;
        }

        public QueryBuilder fetchTaskIcon(){
            setFetchFields("fetchFields","taskIcon");
            return this;
        }

        public QueryBuilder excludeTaskIcon(){
            setFetchFields("excludeFields","taskIcon");
            return this;
        }

        public QueryBuilder taskMaxTimeBetWeen(Integer taskMaxTimeSt,Integer taskMaxTimeEd){
            this.taskMaxTimeSt = taskMaxTimeSt;
            this.taskMaxTimeEd = taskMaxTimeEd;
            return this;
        }

        public QueryBuilder taskMaxTimeGreaterEqThan(Integer taskMaxTimeSt){
            this.taskMaxTimeSt = taskMaxTimeSt;
            return this;
        }
        public QueryBuilder taskMaxTimeLessEqThan(Integer taskMaxTimeEd){
            this.taskMaxTimeEd = taskMaxTimeEd;
            return this;
        }


        public QueryBuilder taskMaxTime(Integer taskMaxTime){
            setTaskMaxTime(taskMaxTime);
            return this;
        }

        public QueryBuilder taskMaxTimeList(Integer ... taskMaxTime){
            this.taskMaxTimeList = solveNullList(taskMaxTime);
            return this;
        }

        public QueryBuilder taskMaxTimeList(List<Integer> taskMaxTime){
            this.taskMaxTimeList = taskMaxTime;
            return this;
        }

        public QueryBuilder fetchTaskMaxTime(){
            setFetchFields("fetchFields","taskMaxTime");
            return this;
        }

        public QueryBuilder excludeTaskMaxTime(){
            setFetchFields("excludeFields","taskMaxTime");
            return this;
        }

        public QueryBuilder fuzzyTaskStatus (List<String> fuzzyTaskStatus){
            this.fuzzyTaskStatus = fuzzyTaskStatus;
            return this;
        }

        public QueryBuilder fuzzyTaskStatus (String ... fuzzyTaskStatus){
            this.fuzzyTaskStatus = solveNullList(fuzzyTaskStatus);
            return this;
        }

        public QueryBuilder rightFuzzyTaskStatus (List<String> rightFuzzyTaskStatus){
            this.rightFuzzyTaskStatus = rightFuzzyTaskStatus;
            return this;
        }

        public QueryBuilder rightFuzzyTaskStatus (String ... rightFuzzyTaskStatus){
            this.rightFuzzyTaskStatus = solveNullList(rightFuzzyTaskStatus);
            return this;
        }

        public QueryBuilder taskStatus(String taskStatus){
            setTaskStatus(taskStatus);
            return this;
        }

        public QueryBuilder taskStatusList(String ... taskStatus){
            this.taskStatusList = solveNullList(taskStatus);
            return this;
        }

        public QueryBuilder taskStatusList(List<String> taskStatus){
            this.taskStatusList = taskStatus;
            return this;
        }

        public QueryBuilder fetchTaskStatus(){
            setFetchFields("fetchFields","taskStatus");
            return this;
        }

        public QueryBuilder excludeTaskStatus(){
            setFetchFields("excludeFields","taskStatus");
            return this;
        }

        public QueryBuilder taskAwardPointBetWeen(Integer taskAwardPointSt,Integer taskAwardPointEd){
            this.taskAwardPointSt = taskAwardPointSt;
            this.taskAwardPointEd = taskAwardPointEd;
            return this;
        }

        public QueryBuilder taskAwardPointGreaterEqThan(Integer taskAwardPointSt){
            this.taskAwardPointSt = taskAwardPointSt;
            return this;
        }
        public QueryBuilder taskAwardPointLessEqThan(Integer taskAwardPointEd){
            this.taskAwardPointEd = taskAwardPointEd;
            return this;
        }


        public QueryBuilder taskAwardPoint(Integer taskAwardPoint){
            setTaskAwardPoint(taskAwardPoint);
            return this;
        }

        public QueryBuilder taskAwardPointList(Integer ... taskAwardPoint){
            this.taskAwardPointList = solveNullList(taskAwardPoint);
            return this;
        }

        public QueryBuilder taskAwardPointList(List<Integer> taskAwardPoint){
            this.taskAwardPointList = taskAwardPoint;
            return this;
        }

        public QueryBuilder fetchTaskAwardPoint(){
            setFetchFields("fetchFields","taskAwardPoint");
            return this;
        }

        public QueryBuilder excludeTaskAwardPoint(){
            setFetchFields("excludeFields","taskAwardPoint");
            return this;
        }

        public QueryBuilder createTimeBetWeen(java.time.LocalDateTime createTimeSt,java.time.LocalDateTime createTimeEd){
            this.createTimeSt = createTimeSt;
            this.createTimeEd = createTimeEd;
            return this;
        }

        public QueryBuilder createTimeGreaterEqThan(java.time.LocalDateTime createTimeSt){
            this.createTimeSt = createTimeSt;
            return this;
        }
        public QueryBuilder createTimeLessEqThan(java.time.LocalDateTime createTimeEd){
            this.createTimeEd = createTimeEd;
            return this;
        }


        public QueryBuilder createTime(java.time.LocalDateTime createTime){
            setCreateTime(createTime);
            return this;
        }

        public QueryBuilder createTimeList(java.time.LocalDateTime ... createTime){
            this.createTimeList = solveNullList(createTime);
            return this;
        }

        public QueryBuilder createTimeList(List<java.time.LocalDateTime> createTime){
            this.createTimeList = createTime;
            return this;
        }

        public QueryBuilder fetchCreateTime(){
            setFetchFields("fetchFields","createTime");
            return this;
        }

        public QueryBuilder excludeCreateTime(){
            setFetchFields("excludeFields","createTime");
            return this;
        }

        public QueryBuilder updateTimeBetWeen(java.time.LocalDateTime updateTimeSt,java.time.LocalDateTime updateTimeEd){
            this.updateTimeSt = updateTimeSt;
            this.updateTimeEd = updateTimeEd;
            return this;
        }

        public QueryBuilder updateTimeGreaterEqThan(java.time.LocalDateTime updateTimeSt){
            this.updateTimeSt = updateTimeSt;
            return this;
        }
        public QueryBuilder updateTimeLessEqThan(java.time.LocalDateTime updateTimeEd){
            this.updateTimeEd = updateTimeEd;
            return this;
        }


        public QueryBuilder updateTime(java.time.LocalDateTime updateTime){
            setUpdateTime(updateTime);
            return this;
        }

        public QueryBuilder updateTimeList(java.time.LocalDateTime ... updateTime){
            this.updateTimeList = solveNullList(updateTime);
            return this;
        }

        public QueryBuilder updateTimeList(List<java.time.LocalDateTime> updateTime){
            this.updateTimeList = updateTime;
            return this;
        }

        public QueryBuilder fetchUpdateTime(){
            setFetchFields("fetchFields","updateTime");
            return this;
        }

        public QueryBuilder excludeUpdateTime(){
            setFetchFields("excludeFields","updateTime");
            return this;
        }
        private <T>List<T> solveNullList(T ... objs){
            if (objs != null){
            List<T> list = new ArrayList<>();
                for (T item : objs){
                    if (item != null){
                        list.add(item);
                    }
                }
                return list;
            }
            return null;
        }

        public QueryBuilder fetchAll(){
            this.fetchFields.put("AllFields",true);
            return this;
        }

        public QueryBuilder addField(String ... fields){
            List<String> list = new ArrayList<>();
            if (fields != null){
                for (String field : fields){
                    list.add(field);
                }
            }
            this.fetchFields.put("otherFields",list);
            return this;
        }
        @SuppressWarnings("unchecked")
        private void setFetchFields(String key,String val){
            Map<String,Boolean> fields= (Map<String, Boolean>) this.fetchFields.get(key);
            if (fields == null){
                fields = new HashMap<>();
            }
            fields.put(val,true);
            this.fetchFields.put(key,fields);
        }

        public TaskDAO build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Integer> idList;

        public List<Integer> getIdList(){return this.idList;}

        private Integer idSt;

        private Integer idEd;

        public Integer getIdSt(){return this.idSt;}

        public Integer getIdEd(){return this.idEd;}

        private List<Integer> taskIdList;

        public List<Integer> getTaskIdList(){return this.taskIdList;}

        private Integer taskIdSt;

        private Integer taskIdEd;

        public Integer getTaskIdSt(){return this.taskIdSt;}

        public Integer getTaskIdEd(){return this.taskIdEd;}

        private List<String> taskTitleList;

        public List<String> getTaskTitleList(){return this.taskTitleList;}


        private List<String> fuzzyTaskTitle;

        public List<String> getFuzzyTaskTitle(){return this.fuzzyTaskTitle;}

        private List<String> rightFuzzyTaskTitle;

        public List<String> getRightFuzzyTaskTitle(){return this.rightFuzzyTaskTitle;}
        private List<String> taskIconList;

        public List<String> getTaskIconList(){return this.taskIconList;}


        private List<String> fuzzyTaskIcon;

        public List<String> getFuzzyTaskIcon(){return this.fuzzyTaskIcon;}

        private List<String> rightFuzzyTaskIcon;

        public List<String> getRightFuzzyTaskIcon(){return this.rightFuzzyTaskIcon;}
        private List<Integer> taskMaxTimeList;

        public List<Integer> getTaskMaxTimeList(){return this.taskMaxTimeList;}

        private Integer taskMaxTimeSt;

        private Integer taskMaxTimeEd;

        public Integer getTaskMaxTimeSt(){return this.taskMaxTimeSt;}

        public Integer getTaskMaxTimeEd(){return this.taskMaxTimeEd;}

        private List<String> taskStatusList;

        public List<String> getTaskStatusList(){return this.taskStatusList;}


        private List<String> fuzzyTaskStatus;

        public List<String> getFuzzyTaskStatus(){return this.fuzzyTaskStatus;}

        private List<String> rightFuzzyTaskStatus;

        public List<String> getRightFuzzyTaskStatus(){return this.rightFuzzyTaskStatus;}
        private List<Integer> taskAwardPointList;

        public List<Integer> getTaskAwardPointList(){return this.taskAwardPointList;}

        private Integer taskAwardPointSt;

        private Integer taskAwardPointEd;

        public Integer getTaskAwardPointSt(){return this.taskAwardPointSt;}

        public Integer getTaskAwardPointEd(){return this.taskAwardPointEd;}

        private List<java.time.LocalDateTime> createTimeList;

        public List<java.time.LocalDateTime> getCreateTimeList(){return this.createTimeList;}

        private java.time.LocalDateTime createTimeSt;

        private java.time.LocalDateTime createTimeEd;

        public java.time.LocalDateTime getCreateTimeSt(){return this.createTimeSt;}

        public java.time.LocalDateTime getCreateTimeEd(){return this.createTimeEd;}

        private List<java.time.LocalDateTime> updateTimeList;

        public List<java.time.LocalDateTime> getUpdateTimeList(){return this.updateTimeList;}

        private java.time.LocalDateTime updateTimeSt;

        private java.time.LocalDateTime updateTimeEd;

        public java.time.LocalDateTime getUpdateTimeSt(){return this.updateTimeSt;}

        public java.time.LocalDateTime getUpdateTimeEd(){return this.updateTimeEd;}


        public ConditionBuilder idBetWeen(Integer idSt,Integer idEd){
            this.idSt = idSt;
            this.idEd = idEd;
            return this;
        }

        public ConditionBuilder idGreaterEqThan(Integer idSt){
            this.idSt = idSt;
            return this;
        }
        public ConditionBuilder idLessEqThan(Integer idEd){
            this.idEd = idEd;
            return this;
        }


        public ConditionBuilder idList(Integer ... id){
            this.idList = solveNullList(id);
            return this;
        }

        public ConditionBuilder idList(List<Integer> id){
            this.idList = id;
            return this;
        }

        public ConditionBuilder taskIdBetWeen(Integer taskIdSt,Integer taskIdEd){
            this.taskIdSt = taskIdSt;
            this.taskIdEd = taskIdEd;
            return this;
        }

        public ConditionBuilder taskIdGreaterEqThan(Integer taskIdSt){
            this.taskIdSt = taskIdSt;
            return this;
        }
        public ConditionBuilder taskIdLessEqThan(Integer taskIdEd){
            this.taskIdEd = taskIdEd;
            return this;
        }


        public ConditionBuilder taskIdList(Integer ... taskId){
            this.taskIdList = solveNullList(taskId);
            return this;
        }

        public ConditionBuilder taskIdList(List<Integer> taskId){
            this.taskIdList = taskId;
            return this;
        }

        public ConditionBuilder fuzzyTaskTitle (List<String> fuzzyTaskTitle){
            this.fuzzyTaskTitle = fuzzyTaskTitle;
            return this;
        }

        public ConditionBuilder fuzzyTaskTitle (String ... fuzzyTaskTitle){
            this.fuzzyTaskTitle = solveNullList(fuzzyTaskTitle);
            return this;
        }

        public ConditionBuilder rightFuzzyTaskTitle (List<String> rightFuzzyTaskTitle){
            this.rightFuzzyTaskTitle = rightFuzzyTaskTitle;
            return this;
        }

        public ConditionBuilder rightFuzzyTaskTitle (String ... rightFuzzyTaskTitle){
            this.rightFuzzyTaskTitle = solveNullList(rightFuzzyTaskTitle);
            return this;
        }

        public ConditionBuilder taskTitleList(String ... taskTitle){
            this.taskTitleList = solveNullList(taskTitle);
            return this;
        }

        public ConditionBuilder taskTitleList(List<String> taskTitle){
            this.taskTitleList = taskTitle;
            return this;
        }

        public ConditionBuilder fuzzyTaskIcon (List<String> fuzzyTaskIcon){
            this.fuzzyTaskIcon = fuzzyTaskIcon;
            return this;
        }

        public ConditionBuilder fuzzyTaskIcon (String ... fuzzyTaskIcon){
            this.fuzzyTaskIcon = solveNullList(fuzzyTaskIcon);
            return this;
        }

        public ConditionBuilder rightFuzzyTaskIcon (List<String> rightFuzzyTaskIcon){
            this.rightFuzzyTaskIcon = rightFuzzyTaskIcon;
            return this;
        }

        public ConditionBuilder rightFuzzyTaskIcon (String ... rightFuzzyTaskIcon){
            this.rightFuzzyTaskIcon = solveNullList(rightFuzzyTaskIcon);
            return this;
        }

        public ConditionBuilder taskIconList(String ... taskIcon){
            this.taskIconList = solveNullList(taskIcon);
            return this;
        }

        public ConditionBuilder taskIconList(List<String> taskIcon){
            this.taskIconList = taskIcon;
            return this;
        }

        public ConditionBuilder taskMaxTimeBetWeen(Integer taskMaxTimeSt,Integer taskMaxTimeEd){
            this.taskMaxTimeSt = taskMaxTimeSt;
            this.taskMaxTimeEd = taskMaxTimeEd;
            return this;
        }

        public ConditionBuilder taskMaxTimeGreaterEqThan(Integer taskMaxTimeSt){
            this.taskMaxTimeSt = taskMaxTimeSt;
            return this;
        }
        public ConditionBuilder taskMaxTimeLessEqThan(Integer taskMaxTimeEd){
            this.taskMaxTimeEd = taskMaxTimeEd;
            return this;
        }


        public ConditionBuilder taskMaxTimeList(Integer ... taskMaxTime){
            this.taskMaxTimeList = solveNullList(taskMaxTime);
            return this;
        }

        public ConditionBuilder taskMaxTimeList(List<Integer> taskMaxTime){
            this.taskMaxTimeList = taskMaxTime;
            return this;
        }

        public ConditionBuilder fuzzyTaskStatus (List<String> fuzzyTaskStatus){
            this.fuzzyTaskStatus = fuzzyTaskStatus;
            return this;
        }

        public ConditionBuilder fuzzyTaskStatus (String ... fuzzyTaskStatus){
            this.fuzzyTaskStatus = solveNullList(fuzzyTaskStatus);
            return this;
        }

        public ConditionBuilder rightFuzzyTaskStatus (List<String> rightFuzzyTaskStatus){
            this.rightFuzzyTaskStatus = rightFuzzyTaskStatus;
            return this;
        }

        public ConditionBuilder rightFuzzyTaskStatus (String ... rightFuzzyTaskStatus){
            this.rightFuzzyTaskStatus = solveNullList(rightFuzzyTaskStatus);
            return this;
        }

        public ConditionBuilder taskStatusList(String ... taskStatus){
            this.taskStatusList = solveNullList(taskStatus);
            return this;
        }

        public ConditionBuilder taskStatusList(List<String> taskStatus){
            this.taskStatusList = taskStatus;
            return this;
        }

        public ConditionBuilder taskAwardPointBetWeen(Integer taskAwardPointSt,Integer taskAwardPointEd){
            this.taskAwardPointSt = taskAwardPointSt;
            this.taskAwardPointEd = taskAwardPointEd;
            return this;
        }

        public ConditionBuilder taskAwardPointGreaterEqThan(Integer taskAwardPointSt){
            this.taskAwardPointSt = taskAwardPointSt;
            return this;
        }
        public ConditionBuilder taskAwardPointLessEqThan(Integer taskAwardPointEd){
            this.taskAwardPointEd = taskAwardPointEd;
            return this;
        }


        public ConditionBuilder taskAwardPointList(Integer ... taskAwardPoint){
            this.taskAwardPointList = solveNullList(taskAwardPoint);
            return this;
        }

        public ConditionBuilder taskAwardPointList(List<Integer> taskAwardPoint){
            this.taskAwardPointList = taskAwardPoint;
            return this;
        }

        public ConditionBuilder createTimeBetWeen(java.time.LocalDateTime createTimeSt,java.time.LocalDateTime createTimeEd){
            this.createTimeSt = createTimeSt;
            this.createTimeEd = createTimeEd;
            return this;
        }

        public ConditionBuilder createTimeGreaterEqThan(java.time.LocalDateTime createTimeSt){
            this.createTimeSt = createTimeSt;
            return this;
        }
        public ConditionBuilder createTimeLessEqThan(java.time.LocalDateTime createTimeEd){
            this.createTimeEd = createTimeEd;
            return this;
        }


        public ConditionBuilder createTimeList(java.time.LocalDateTime ... createTime){
            this.createTimeList = solveNullList(createTime);
            return this;
        }

        public ConditionBuilder createTimeList(List<java.time.LocalDateTime> createTime){
            this.createTimeList = createTime;
            return this;
        }

        public ConditionBuilder updateTimeBetWeen(java.time.LocalDateTime updateTimeSt,java.time.LocalDateTime updateTimeEd){
            this.updateTimeSt = updateTimeSt;
            this.updateTimeEd = updateTimeEd;
            return this;
        }

        public ConditionBuilder updateTimeGreaterEqThan(java.time.LocalDateTime updateTimeSt){
            this.updateTimeSt = updateTimeSt;
            return this;
        }
        public ConditionBuilder updateTimeLessEqThan(java.time.LocalDateTime updateTimeEd){
            this.updateTimeEd = updateTimeEd;
            return this;
        }


        public ConditionBuilder updateTimeList(java.time.LocalDateTime ... updateTime){
            this.updateTimeList = solveNullList(updateTime);
            return this;
        }

        public ConditionBuilder updateTimeList(List<java.time.LocalDateTime> updateTime){
            this.updateTimeList = updateTime;
            return this;
        }

        private <T>List<T> solveNullList(T ... objs){
            if (objs != null){
            List<T> list = new ArrayList<>();
                for (T item : objs){
                    if (item != null){
                        list.add(item);
                    }
                }
                return list;
            }
            return null;
        }

        public ConditionBuilder build(){return this;}
    }

    public static class Builder {

        private TaskDAO obj;

        public Builder(){
            this.obj = new TaskDAO();
        }

        public Builder id(Integer id){
            this.obj.setId(id);
            return this;
        }
        public Builder taskId(Integer taskId){
            this.obj.setTaskId(taskId);
            return this;
        }
        public Builder taskTitle(String taskTitle){
            this.obj.setTaskTitle(taskTitle);
            return this;
        }
        public Builder taskIcon(String taskIcon){
            this.obj.setTaskIcon(taskIcon);
            return this;
        }
        public Builder taskMaxTime(Integer taskMaxTime){
            this.obj.setTaskMaxTime(taskMaxTime);
            return this;
        }
        public Builder taskStatus(String taskStatus){
            this.obj.setTaskStatus(taskStatus);
            return this;
        }
        public Builder taskAwardPoint(Integer taskAwardPoint){
            this.obj.setTaskAwardPoint(taskAwardPoint);
            return this;
        }
        public Builder createTime(java.time.LocalDateTime createTime){
            this.obj.setCreateTime(createTime);
            return this;
        }
        public Builder updateTime(java.time.LocalDateTime updateTime){
            this.obj.setUpdateTime(updateTime);
            return this;
        }
        public TaskDAO build(){return obj;}
    }

}
