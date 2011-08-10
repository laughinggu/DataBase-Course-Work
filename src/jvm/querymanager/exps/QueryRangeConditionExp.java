package jvm.querymanager.exps;

public class QueryRangeConditionExp extends RangeConditionExp {
	QueryExp upLimit;
	QueryExp downLimit;
	
	public QueryRangeConditionExp(ParameterExp parameter, QueryExp downLimit, QueryExp upLimit, boolean isNot){
		super(parameter, isNot);
		this.downLimit = downLimit;
		this.upLimit = upLimit;
	}
}
