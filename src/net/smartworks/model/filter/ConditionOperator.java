package net.smartworks.model.filter;

import net.smartworks.model.KeyMap;
import net.smartworks.util.SmartUtil;

public class ConditionOperator {

	public static final KeyMap EQUAL = new KeyMap("=", "filter.operator.title.equal");
	public static final KeyMap NOT_EQUAL = new KeyMap("!=", "filter.operator.title.not_equal");
	public static final KeyMap CONTAIN = new KeyMap("like", "filter.operator.title.contain");
	public static final KeyMap NOT_CONTAIN = new KeyMap("not like", "filter.operator.title.not_contain");
	public static final KeyMap SMALLER = new KeyMap("<", "filter.operator.title.smaller");
	public static final KeyMap SMALLER_EQUAL = new KeyMap("<=", "filter.operator.title.smaller_equal");
	public static final KeyMap GREATER = new KeyMap(">", "filter.operator.title.greater");
	public static final KeyMap GREATER_EQUAL = new KeyMap(">=", "filter.operator.title.greater_equal");
	public static final KeyMap AND = new KeyMap("and", "filter.operator.title.and");
	public static final KeyMap OR = new KeyMap("or", "filter.operator.title.or");
	public static final KeyMap MAX = new KeyMap("max", "filter.operator.title.max");

	public static final KeyMap TODAY = new KeyMap("today", "filter.operator.title.today");
	public static final KeyMap RECENT_DAYS = new KeyMap("recentDays.7", "filter.operator.title.recent_7_days");
	public static final KeyMap THIS_WEEK = new KeyMap("thisWeek", "filter.operator.title.this_week");
	public static final KeyMap THIS_MONTH = new KeyMap("thisMonth", "filter.operator.title.this_month");
	public static final KeyMap THIS_QUARTER = new KeyMap("thisQuarter", "filter.operator.title.this_quarter");
	public static final KeyMap THIS_HALF_YEAR = new KeyMap("thisHalfYear", "filter.operator.title.this_half_year");
	public static final KeyMap THIS_YEAR = new KeyMap("thisYear", "filter.operator.title.this_year");	
	public static final KeyMap RECENT_SOME_DAYS = new KeyMap("recentSomeDays", "filter.operator.title.recent_some_days");;
	public static final KeyMap RECENT_SOME_MONTHS = new KeyMap("recentSomeMonths", "filter.operator.title.recent_some_months");;
	
	public static final KeyMap[] connectorOperators = new KeyMap[] {
		AND,
		OR
	};
	
	public static final KeyMap[] stringOperators = new KeyMap[] {
		EQUAL,
		NOT_EQUAL,
		CONTAIN,
		NOT_CONTAIN
	};
	
	public static final KeyMap[] numberOperators = new KeyMap[] {
		EQUAL,
		NOT_EQUAL,
		SMALLER,
		SMALLER_EQUAL,
		GREATER,
		GREATER_EQUAL
	};
	
	public static final KeyMap[] dateOperators = new KeyMap[] {
		RECENT_DAYS,
		TODAY,
		THIS_WEEK,
		THIS_MONTH,
		THIS_QUARTER,
		THIS_HALF_YEAR,
		THIS_YEAR,
		RECENT_SOME_DAYS,
		RECENT_SOME_MONTHS,
		EQUAL,
		NOT_EQUAL,
		SMALLER,
		SMALLER_EQUAL,
		GREATER,
		GREATER_EQUAL
	};
	
	public static final KeyMap[] timeOperators = new KeyMap[] {
		EQUAL,
		NOT_EQUAL,
		SMALLER,
		SMALLER_EQUAL,
		GREATER,
		GREATER_EQUAL
	};
	
	public static KeyMap[] instanceCountOperators = new KeyMap[] {
		MAX
	};

	public static KeyMap[] generalOperators = new KeyMap[] {
		EQUAL,
		NOT_EQUAL
	};
	
	public static boolean isDateTypeOperator(String operator){
		if(SmartUtil.isBlankObject(operator)) return false;
		for(int i=0; i<ConditionOperator.dateOperators.length; i++){
			KeyMap dateOperator = ConditionOperator.dateOperators[i];
			if(dateOperator.getId().equals(operator)){
				if(		dateOperator.getId().equals(ConditionOperator.RECENT_DAYS.getId())
						|| 	dateOperator.getId().equals(ConditionOperator.RECENT_SOME_DAYS.getId())
						|| 	dateOperator.getId().equals(ConditionOperator.RECENT_SOME_MONTHS.getId()))
					return false;
				else{
					return true;
				}
			}
		}
		return false;
	};

}
