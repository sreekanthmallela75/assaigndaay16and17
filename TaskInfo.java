package assaignDay16and17;

public class TaskInfo {
	  String taskName;
	    long deadline;

	    public TaskInfo(String taskName, long deadline) {
	        this.taskName = taskName;
	        this.deadline = deadline;
	    }

	    public String getTaskName() {
	        return taskName;
	    }

	    public void setTaskName(String taskName) {
	        this.taskName = taskName;
	    }

	    public long getDeadline() {
	        return deadline;
	    }

	    public void setDeadline(long deadline) {
	        this.deadline = deadline;
	    }
	}


