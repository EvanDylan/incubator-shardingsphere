// Generated from org\apache\shardingsphere\core\parse\antlr\autogen\MySQLStatement.g4 by ANTLR 4.7.1
package org.apache.shardingsphere.core.parse.antlr.autogen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MySQLStatementParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, ALL=2, AND=3, ANY=4, ASC=5, BETWEEN=6, BINARY=7, BY=8, DATE=9, DESC=10, 
		DISTINCT=11, ESCAPE=12, EXISTS=13, FALSE=14, FROM=15, GROUP=16, HAVING=17, 
		IN=18, IS=19, KEY=20, LIKE=21, LIMIT=22, MOD=23, DIV=24, NOT=25, NULL=26, 
		OFFSET=27, OR=28, ORDER=29, PARTITION=30, PRIMARY=31, REGEXP=32, RLIKE=33, 
		ROLLUP=34, ROW=35, SET=36, SOUNDS=37, TIME=38, TIMESTAMP=39, TRUE=40, 
		UNION=41, UNKNOWN=42, WHERE=43, WITH=44, XOR=45, ADD=46, ALTER=47, ALWAYS=48, 
		AS=49, CASCADE=50, CHECK=51, COLUMN=52, COMMIT=53, COMMITTED=54, CONSTRAINT=55, 
		CREATE=56, CURRENT=57, DEFAULT=58, DELETE=59, DISABLE=60, DROP=61, ENABLE=62, 
		FOR=63, FOREIGN=64, FUNCTION=65, GENERATED=66, GRANT=67, INDEX=68, LEVEL=69, 
		NO=70, ON=71, OPTION=72, PASSWORD=73, PRIVILEGES=74, READ=75, REFERENCES=76, 
		REVOKE=77, ROLE=78, ROLLBACK=79, ROWS=80, START=81, TABLE=82, TO=83, TRANSACTION=84, 
		TRUNCATE=85, UNIQUE=86, USER=87, ACCOUNT=88, ACTION=89, AFTER=90, ALGORITHM=91, 
		ANALYZE=92, AUDIT_ADMIN=93, AUTO_INCREMENT=94, AUTOCOMMIT=95, AVG_ROW_LENGTH=96, 
		BEGIN=97, BINLOG_ADMIN=98, BOTH=99, BTREE=100, CASE=101, CAST=102, CHAIN=103, 
		CHANGE=104, CHAR=105, CHARACTER=106, CHARSET=107, CHECKSUM=108, CIPHER=109, 
		CLIENT=110, COALESCE=111, COLLATE=112, COLUMNS=113, COLUMN_FORMAT=114, 
		COMMENT=115, COMPACT=116, COMPRESSED=117, COMPRESSION=118, CONNECTION=119, 
		CONNECTION_ADMIN=120, CONSISTENT=121, CONVERT=122, COPY=123, CROSS=124, 
		CURRENT_TIMESTAMP=125, DATA=126, DATABASES=127, DELAYED=128, DELAY_KEY_WRITE=129, 
		DIRECTORY=130, DISCARD=131, DISK=132, DISTINCTROW=133, DOUBLE=134, DUPLICATE=135, 
		DYNAMIC=136, ELSE=137, ENCRYPTION=138, ENCRYPTION_KEY_ADMIN=139, END=140, 
		ENGINE=141, EVENT=142, EXCEPT=143, EXCHANGE=144, EXCLUSIVE=145, EXECUTE=146, 
		EXTRACT=147, FILE=148, FIREWALL_ADMIN=149, FIREWALL_USER=150, FIRST=151, 
		FIXED=152, FOLLOWING=153, FORCE=154, FULL=155, FULLTEXT=156, GLOBAL=157, 
		GROUP_REPLICATION_ADMIN=158, HASH=159, HIGH_PRIORITY=160, IDENTIFIED=161, 
		IF=162, IGNORE=163, IMPORT_=164, INNER=165, INPLACE=166, INSERT=167, INSERT_METHOD=168, 
		INTERVAL=169, INTO=170, JOIN=171, KEYS=172, KEY_BLOCK_SIZE=173, LAST=174, 
		LEADING=175, LEFT=176, LESS=177, LINEAR=178, LOCALTIME=179, LOCALTIMESTAMP=180, 
		LOCK=181, LOW_PRIORITY=182, MATCH=183, MAXVALUE=184, MAX_ROWS=185, MEMORY=186, 
		MIN_ROWS=187, MODIFY=188, NATURAL=189, NONE=190, NOW=191, OFFLINE=192, 
		ONLINE=193, OPTIMIZE=194, OUTER=195, OVER=196, PACK_KEYS=197, PARSER=198, 
		PARTIAL=199, PARTITIONING=200, PERSIST=201, PERSIST_ONLY=202, POSITION=203, 
		PRECEDING=204, PRECISION=205, PROCEDURE=206, PROCESS=207, PROXY=208, QUICK=209, 
		RANGE=210, REBUILD=211, RECURSIVE=212, REDUNDANT=213, RELEASE=214, RELOAD=215, 
		REMOVE=216, RENAME=217, REORGANIZE=218, REPAIR=219, REPLACE=220, REPLICATION=221, 
		REPLICATION_SLAVE_ADMIN=222, REQUIRE=223, RESTRICT=224, REVERSE=225, RIGHT=226, 
		ROLE_ADMIN=227, ROUTINE=228, ROW_FORMAT=229, SAVEPOINT=230, SELECT=231, 
		SEPARATOR=232, SESSION=233, SET_USER_ID=234, SHARED=235, SHOW=236, SHUTDOWN=237, 
		SIMPLE=238, SLAVE=239, SPATIAL=240, SQLDML=241, SQLDQL=242, SQL_BIG_RESULT=243, 
		SQL_BUFFER_RESULT=244, SQL_CACHE=245, SQL_CALC_FOUND_ROWS=246, SQL_NO_CACHE=247, 
		SQL_SMALL_RESULT=248, SSL=249, STATS_AUTO_RECALC=250, STATS_PERSISTENT=251, 
		STATS_SAMPLE_PAGES=252, STORAGE=253, STORED=254, STRAIGHT_JOIN=255, SUBPARTITION=256, 
		SUPER=257, SUBSTR=258, SUBSTRING=259, SYSTEM_VARIABLES_ADMIN=260, TABLES=261, 
		TABLESPACE=262, TEMPORARY=263, THAN=264, THEN=265, TRAILING=266, TRIGGER=267, 
		TRIM=268, UNBOUNDED=269, UNLOCK=270, UNSIGNED=271, UPDATE=272, UPGRADE=273, 
		USAGE=274, USE=275, USING=276, VALIDATION=277, VALUE=278, VALUES=279, 
		VERSION_TOKEN_ADMIN=280, VIEW=281, VIRTUAL=282, WEIGHT_STRING=283, WHEN=284, 
		WINDOW=285, WITHOUT=286, WRITE=287, ZEROFILL=288, VISIBLE=289, INVISIBLE=290, 
		INSTANT=291, ENFORCED=292, OJ=293, MICROSECOND=294, SECOND=295, MINUTE=296, 
		HOUR=297, DAY=298, WEEK=299, MONTH=300, QUARTER=301, YEAR=302, SECOND_MICROSECOND=303, 
		MINUTE_MICROSECOND=304, MINUTE_SECOND=305, HOUR_MICROSECOND=306, HOUR_SECOND=307, 
		HOUR_MINUTE=308, DAY_MICROSECOND=309, DAY_SECOND=310, DAY_MINUTE=311, 
		DAY_HOUR=312, YEAR_MONTH=313, AGAINST=314, LANGUAGE=315, MODE=316, QUERY=317, 
		EXPANSION=318, BOOLEAN=319, MAX=320, MIN=321, SUM=322, COUNT=323, AVG=324, 
		BIT_AND=325, BIT_OR=326, BIT_XOR=327, GROUP_CONCAT=328, JSON_ARRAYAGG=329, 
		JSON_OBJECTAGG=330, STD=331, STDDEV=332, STDDEV_POP=333, STDDEV_SAMP=334, 
		VAR_POP=335, VAR_SAMP=336, VARIANCE=337, FOR_GENERATOR=338, AND_=339, 
		OR_=340, NOT_=341, TILDE_=342, VERTICAL_BAR_=343, AMPERSAND_=344, SIGNED_LEFT_SHIFT_=345, 
		SIGNED_RIGHT_SHIFT_=346, CARET_=347, MOD_=348, COLON_=349, PLUS_=350, 
		MINUS_=351, ASTERISK_=352, SLASH_=353, BACKSLASH_=354, DOT_=355, DOT_ASTERISK_=356, 
		SAFE_EQ_=357, DEQ_=358, EQ_=359, NEQ_=360, GT_=361, GTE_=362, LT_=363, 
		LTE_=364, POUND_=365, LP_=366, RP_=367, LBE_=368, RBE_=369, LBT_=370, 
		RBT_=371, COMMA_=372, DQ_=373, SQ_=374, BQ_=375, QUESTION_=376, AT_=377, 
		SEMI_=378, BLOCK_COMMENT=379, INLINE_COMMENT=380, IDENTIFIER_=381, STRING_=382, 
		NUMBER_=383, HEX_DIGIT_=384, BIT_NUM_=385;
	public static final int
		RULE_execute = 0, RULE_insert = 1, RULE_insertSpecification_ = 2, RULE_insertValuesClause = 3, 
		RULE_insertSelectClause = 4, RULE_onDuplicateKeyClause = 5, RULE_update = 6, 
		RULE_updateSpecification_ = 7, RULE_assignment = 8, RULE_setAssignmentsClause = 9, 
		RULE_assignmentValues = 10, RULE_assignmentValue = 11, RULE_delete = 12, 
		RULE_deleteSpecification_ = 13, RULE_singleTableClause_ = 14, RULE_multipleTablesClause_ = 15, 
		RULE_multipleTableNames_ = 16, RULE_select = 17, RULE_withClause_ = 18, 
		RULE_cteClause_ = 19, RULE_unionClause_ = 20, RULE_selectClause = 21, 
		RULE_selectSpecification_ = 22, RULE_duplicateSpecification = 23, RULE_selectItems = 24, 
		RULE_selectItem = 25, RULE_alias = 26, RULE_unqualifiedShorthand = 27, 
		RULE_qualifiedShorthand = 28, RULE_fromClause = 29, RULE_tableReferences = 30, 
		RULE_escapedTableReference_ = 31, RULE_tableReference = 32, RULE_tableFactor = 33, 
		RULE_partitionNames_ = 34, RULE_indexHintList_ = 35, RULE_indexHint_ = 36, 
		RULE_joinedTable = 37, RULE_joinSpecification = 38, RULE_whereClause = 39, 
		RULE_groupByClause = 40, RULE_havingClause = 41, RULE_limitClause = 42, 
		RULE_rangeItem_ = 43, RULE_windowClause_ = 44, RULE_windowItem_ = 45, 
		RULE_subquery = 46, RULE_parameterMarker = 47, RULE_literals = 48, RULE_stringLiterals = 49, 
		RULE_numberLiterals = 50, RULE_dateTimeLiterals = 51, RULE_hexadecimalLiterals = 52, 
		RULE_bitValueLiterals = 53, RULE_booleanLiterals = 54, RULE_nullValueLiterals = 55, 
		RULE_characterSetName_ = 56, RULE_collateName_ = 57, RULE_identifier_ = 58, 
		RULE_variable_ = 59, RULE_unreservedWord_ = 60, RULE_tableName = 61, RULE_columnName = 62, 
		RULE_columnNames = 63, RULE_indexName = 64, RULE_expr = 65, RULE_logicalOperator = 66, 
		RULE_notOperator_ = 67, RULE_booleanPrimary_ = 68, RULE_comparisonOperator = 69, 
		RULE_predicate = 70, RULE_bitExpr = 71, RULE_simpleExpr = 72, RULE_functionCall = 73, 
		RULE_aggregationFunction = 74, RULE_aggregationFunctionName_ = 75, RULE_distinct = 76, 
		RULE_overClause_ = 77, RULE_windowSpecification_ = 78, RULE_partitionClause_ = 79, 
		RULE_frameClause_ = 80, RULE_frameStart_ = 81, RULE_frameEnd_ = 82, RULE_frameBetween_ = 83, 
		RULE_specialFunction_ = 84, RULE_groupConcatFunction_ = 85, RULE_windowFunction_ = 86, 
		RULE_castFunction_ = 87, RULE_convertFunction_ = 88, RULE_positionFunction_ = 89, 
		RULE_substringFunction_ = 90, RULE_extractFunction_ = 91, RULE_charFunction_ = 92, 
		RULE_trimFunction_ = 93, RULE_weightStringFunction_ = 94, RULE_levelClause_ = 95, 
		RULE_levelInWeightListElement_ = 96, RULE_regularFunction_ = 97, RULE_regularFunctionName_ = 98, 
		RULE_matchExpression_ = 99, RULE_matchSearchModifier_ = 100, RULE_caseExpression_ = 101, 
		RULE_caseWhen_ = 102, RULE_caseElse_ = 103, RULE_intervalExpression_ = 104, 
		RULE_intervalUnit_ = 105, RULE_orderByClause = 106, RULE_orderByItem = 107, 
		RULE_dataType = 108, RULE_dataTypeName_ = 109, RULE_dataTypeLength = 110, 
		RULE_characterSet_ = 111, RULE_collateClause_ = 112, RULE_ignoredIdentifier_ = 113, 
		RULE_ignoredIdentifiers_ = 114, RULE_createTable = 115, RULE_createDefinitions_ = 116, 
		RULE_createDefinition_ = 117, RULE_columnDefinition = 118, RULE_inlineDataType_ = 119, 
		RULE_generatedDataType_ = 120, RULE_commonDataTypeOption_ = 121, RULE_referenceDefinition_ = 122, 
		RULE_referenceOption_ = 123, RULE_indexDefinition_ = 124, RULE_indexType_ = 125, 
		RULE_keyParts_ = 126, RULE_keyPart_ = 127, RULE_indexOption_ = 128, RULE_constraintDefinition_ = 129, 
		RULE_primaryKeyOption_ = 130, RULE_primaryKey = 131, RULE_uniqueOption_ = 132, 
		RULE_foreignKeyOption_ = 133, RULE_checkConstraintDefinition_ = 134, RULE_createLike_ = 135, 
		RULE_alterTable = 136, RULE_alterSpecifications_ = 137, RULE_alterSpecification_ = 138, 
		RULE_tableOptions_ = 139, RULE_tableOption_ = 140, RULE_addColumnSpecification = 141, 
		RULE_firstOrAfterColumn = 142, RULE_addIndexSpecification = 143, RULE_addConstraintSpecification = 144, 
		RULE_changeColumnSpecification = 145, RULE_dropColumnSpecification = 146, 
		RULE_dropIndexSpecification = 147, RULE_dropPrimaryKeySpecification = 148, 
		RULE_modifyColumnSpecification = 149, RULE_renameColumnSpecification = 150, 
		RULE_renameIndexSpecification = 151, RULE_renameTableSpecification_ = 152, 
		RULE_newTableName = 153, RULE_partitionDefinitions_ = 154, RULE_partitionDefinition_ = 155, 
		RULE_partitionLessThanValue_ = 156, RULE_partitionValueList_ = 157, RULE_partitionDefinitionOption_ = 158, 
		RULE_subpartitionDefinition_ = 159, RULE_dropTable = 160, RULE_truncateTable = 161, 
		RULE_createIndex = 162, RULE_dropIndex = 163, RULE_setTransaction = 164, 
		RULE_setAutoCommit = 165, RULE_autoCommitValue = 166, RULE_beginTransaction = 167, 
		RULE_commit = 168, RULE_rollback = 169, RULE_savepoint = 170, RULE_grant = 171, 
		RULE_revoke = 172, RULE_proxyClause_ = 173, RULE_privilegeClause_ = 174, 
		RULE_roleClause_ = 175, RULE_allClause_ = 176, RULE_privileges_ = 177, 
		RULE_privilegeType_ = 178, RULE_onObjectClause_ = 179, RULE_objectType_ = 180, 
		RULE_privilegeLevel_ = 181, RULE_createUser = 182, RULE_dropUser = 183, 
		RULE_alterUser = 184, RULE_renameUser = 185, RULE_createRole = 186, RULE_dropRole = 187, 
		RULE_setRole = 188, RULE_setPassword = 189;
	public static final String[] ruleNames = {
		"execute", "insert", "insertSpecification_", "insertValuesClause", "insertSelectClause", 
		"onDuplicateKeyClause", "update", "updateSpecification_", "assignment", 
		"setAssignmentsClause", "assignmentValues", "assignmentValue", "delete", 
		"deleteSpecification_", "singleTableClause_", "multipleTablesClause_", 
		"multipleTableNames_", "select", "withClause_", "cteClause_", "unionClause_", 
		"selectClause", "selectSpecification_", "duplicateSpecification", "selectItems", 
		"selectItem", "alias", "unqualifiedShorthand", "qualifiedShorthand", "fromClause", 
		"tableReferences", "escapedTableReference_", "tableReference", "tableFactor", 
		"partitionNames_", "indexHintList_", "indexHint_", "joinedTable", "joinSpecification", 
		"whereClause", "groupByClause", "havingClause", "limitClause", "rangeItem_", 
		"windowClause_", "windowItem_", "subquery", "parameterMarker", "literals", 
		"stringLiterals", "numberLiterals", "dateTimeLiterals", "hexadecimalLiterals", 
		"bitValueLiterals", "booleanLiterals", "nullValueLiterals", "characterSetName_", 
		"collateName_", "identifier_", "variable_", "unreservedWord_", "tableName", 
		"columnName", "columnNames", "indexName", "expr", "logicalOperator", "notOperator_", 
		"booleanPrimary_", "comparisonOperator", "predicate", "bitExpr", "simpleExpr", 
		"functionCall", "aggregationFunction", "aggregationFunctionName_", "distinct", 
		"overClause_", "windowSpecification_", "partitionClause_", "frameClause_", 
		"frameStart_", "frameEnd_", "frameBetween_", "specialFunction_", "groupConcatFunction_", 
		"windowFunction_", "castFunction_", "convertFunction_", "positionFunction_", 
		"substringFunction_", "extractFunction_", "charFunction_", "trimFunction_", 
		"weightStringFunction_", "levelClause_", "levelInWeightListElement_", 
		"regularFunction_", "regularFunctionName_", "matchExpression_", "matchSearchModifier_", 
		"caseExpression_", "caseWhen_", "caseElse_", "intervalExpression_", "intervalUnit_", 
		"orderByClause", "orderByItem", "dataType", "dataTypeName_", "dataTypeLength", 
		"characterSet_", "collateClause_", "ignoredIdentifier_", "ignoredIdentifiers_", 
		"createTable", "createDefinitions_", "createDefinition_", "columnDefinition", 
		"inlineDataType_", "generatedDataType_", "commonDataTypeOption_", "referenceDefinition_", 
		"referenceOption_", "indexDefinition_", "indexType_", "keyParts_", "keyPart_", 
		"indexOption_", "constraintDefinition_", "primaryKeyOption_", "primaryKey", 
		"uniqueOption_", "foreignKeyOption_", "checkConstraintDefinition_", "createLike_", 
		"alterTable", "alterSpecifications_", "alterSpecification_", "tableOptions_", 
		"tableOption_", "addColumnSpecification", "firstOrAfterColumn", "addIndexSpecification", 
		"addConstraintSpecification", "changeColumnSpecification", "dropColumnSpecification", 
		"dropIndexSpecification", "dropPrimaryKeySpecification", "modifyColumnSpecification", 
		"renameColumnSpecification", "renameIndexSpecification", "renameTableSpecification_", 
		"newTableName", "partitionDefinitions_", "partitionDefinition_", "partitionLessThanValue_", 
		"partitionValueList_", "partitionDefinitionOption_", "subpartitionDefinition_", 
		"dropTable", "truncateTable", "createIndex", "dropIndex", "setTransaction", 
		"setAutoCommit", "autoCommitValue", "beginTransaction", "commit", "rollback", 
		"savepoint", "grant", "revoke", "proxyClause_", "privilegeClause_", "roleClause_", 
		"allClause_", "privileges_", "privilegeType_", "onObjectClause_", "objectType_", 
		"privilegeLevel_", "createUser", "dropUser", "alterUser", "renameUser", 
		"createRole", "dropRole", "setRole", "setPassword"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "'DO NOT MATCH ANY THING, JUST FOR GENERATOR'", "'&&'", "'||'", 
		"'!'", "'~'", "'|'", "'&'", "'<<'", "'>>'", "'^'", "'%'", "':'", "'+'", 
		"'-'", "'*'", "'/'", "'\\'", "'.'", "'.*'", "'<=>'", "'=='", "'='", null, 
		"'>'", "'>='", "'<'", "'<='", "'#'", "'('", "')'", "'{'", "'}'", "'['", 
		"']'", "','", "'\"'", "'''", "'`'", "'?'", "'@'", "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WS", "ALL", "AND", "ANY", "ASC", "BETWEEN", "BINARY", "BY", "DATE", 
		"DESC", "DISTINCT", "ESCAPE", "EXISTS", "FALSE", "FROM", "GROUP", "HAVING", 
		"IN", "IS", "KEY", "LIKE", "LIMIT", "MOD", "DIV", "NOT", "NULL", "OFFSET", 
		"OR", "ORDER", "PARTITION", "PRIMARY", "REGEXP", "RLIKE", "ROLLUP", "ROW", 
		"SET", "SOUNDS", "TIME", "TIMESTAMP", "TRUE", "UNION", "UNKNOWN", "WHERE", 
		"WITH", "XOR", "ADD", "ALTER", "ALWAYS", "AS", "CASCADE", "CHECK", "COLUMN", 
		"COMMIT", "COMMITTED", "CONSTRAINT", "CREATE", "CURRENT", "DEFAULT", "DELETE", 
		"DISABLE", "DROP", "ENABLE", "FOR", "FOREIGN", "FUNCTION", "GENERATED", 
		"GRANT", "INDEX", "LEVEL", "NO", "ON", "OPTION", "PASSWORD", "PRIVILEGES", 
		"READ", "REFERENCES", "REVOKE", "ROLE", "ROLLBACK", "ROWS", "START", "TABLE", 
		"TO", "TRANSACTION", "TRUNCATE", "UNIQUE", "USER", "ACCOUNT", "ACTION", 
		"AFTER", "ALGORITHM", "ANALYZE", "AUDIT_ADMIN", "AUTO_INCREMENT", "AUTOCOMMIT", 
		"AVG_ROW_LENGTH", "BEGIN", "BINLOG_ADMIN", "BOTH", "BTREE", "CASE", "CAST", 
		"CHAIN", "CHANGE", "CHAR", "CHARACTER", "CHARSET", "CHECKSUM", "CIPHER", 
		"CLIENT", "COALESCE", "COLLATE", "COLUMNS", "COLUMN_FORMAT", "COMMENT", 
		"COMPACT", "COMPRESSED", "COMPRESSION", "CONNECTION", "CONNECTION_ADMIN", 
		"CONSISTENT", "CONVERT", "COPY", "CROSS", "CURRENT_TIMESTAMP", "DATA", 
		"DATABASES", "DELAYED", "DELAY_KEY_WRITE", "DIRECTORY", "DISCARD", "DISK", 
		"DISTINCTROW", "DOUBLE", "DUPLICATE", "DYNAMIC", "ELSE", "ENCRYPTION", 
		"ENCRYPTION_KEY_ADMIN", "END", "ENGINE", "EVENT", "EXCEPT", "EXCHANGE", 
		"EXCLUSIVE", "EXECUTE", "EXTRACT", "FILE", "FIREWALL_ADMIN", "FIREWALL_USER", 
		"FIRST", "FIXED", "FOLLOWING", "FORCE", "FULL", "FULLTEXT", "GLOBAL", 
		"GROUP_REPLICATION_ADMIN", "HASH", "HIGH_PRIORITY", "IDENTIFIED", "IF", 
		"IGNORE", "IMPORT_", "INNER", "INPLACE", "INSERT", "INSERT_METHOD", "INTERVAL", 
		"INTO", "JOIN", "KEYS", "KEY_BLOCK_SIZE", "LAST", "LEADING", "LEFT", "LESS", 
		"LINEAR", "LOCALTIME", "LOCALTIMESTAMP", "LOCK", "LOW_PRIORITY", "MATCH", 
		"MAXVALUE", "MAX_ROWS", "MEMORY", "MIN_ROWS", "MODIFY", "NATURAL", "NONE", 
		"NOW", "OFFLINE", "ONLINE", "OPTIMIZE", "OUTER", "OVER", "PACK_KEYS", 
		"PARSER", "PARTIAL", "PARTITIONING", "PERSIST", "PERSIST_ONLY", "POSITION", 
		"PRECEDING", "PRECISION", "PROCEDURE", "PROCESS", "PROXY", "QUICK", "RANGE", 
		"REBUILD", "RECURSIVE", "REDUNDANT", "RELEASE", "RELOAD", "REMOVE", "RENAME", 
		"REORGANIZE", "REPAIR", "REPLACE", "REPLICATION", "REPLICATION_SLAVE_ADMIN", 
		"REQUIRE", "RESTRICT", "REVERSE", "RIGHT", "ROLE_ADMIN", "ROUTINE", "ROW_FORMAT", 
		"SAVEPOINT", "SELECT", "SEPARATOR", "SESSION", "SET_USER_ID", "SHARED", 
		"SHOW", "SHUTDOWN", "SIMPLE", "SLAVE", "SPATIAL", "SQLDML", "SQLDQL", 
		"SQL_BIG_RESULT", "SQL_BUFFER_RESULT", "SQL_CACHE", "SQL_CALC_FOUND_ROWS", 
		"SQL_NO_CACHE", "SQL_SMALL_RESULT", "SSL", "STATS_AUTO_RECALC", "STATS_PERSISTENT", 
		"STATS_SAMPLE_PAGES", "STORAGE", "STORED", "STRAIGHT_JOIN", "SUBPARTITION", 
		"SUPER", "SUBSTR", "SUBSTRING", "SYSTEM_VARIABLES_ADMIN", "TABLES", "TABLESPACE", 
		"TEMPORARY", "THAN", "THEN", "TRAILING", "TRIGGER", "TRIM", "UNBOUNDED", 
		"UNLOCK", "UNSIGNED", "UPDATE", "UPGRADE", "USAGE", "USE", "USING", "VALIDATION", 
		"VALUE", "VALUES", "VERSION_TOKEN_ADMIN", "VIEW", "VIRTUAL", "WEIGHT_STRING", 
		"WHEN", "WINDOW", "WITHOUT", "WRITE", "ZEROFILL", "VISIBLE", "INVISIBLE", 
		"INSTANT", "ENFORCED", "OJ", "MICROSECOND", "SECOND", "MINUTE", "HOUR", 
		"DAY", "WEEK", "MONTH", "QUARTER", "YEAR", "SECOND_MICROSECOND", "MINUTE_MICROSECOND", 
		"MINUTE_SECOND", "HOUR_MICROSECOND", "HOUR_SECOND", "HOUR_MINUTE", "DAY_MICROSECOND", 
		"DAY_SECOND", "DAY_MINUTE", "DAY_HOUR", "YEAR_MONTH", "AGAINST", "LANGUAGE", 
		"MODE", "QUERY", "EXPANSION", "BOOLEAN", "MAX", "MIN", "SUM", "COUNT", 
		"AVG", "BIT_AND", "BIT_OR", "BIT_XOR", "GROUP_CONCAT", "JSON_ARRAYAGG", 
		"JSON_OBJECTAGG", "STD", "STDDEV", "STDDEV_POP", "STDDEV_SAMP", "VAR_POP", 
		"VAR_SAMP", "VARIANCE", "FOR_GENERATOR", "AND_", "OR_", "NOT_", "TILDE_", 
		"VERTICAL_BAR_", "AMPERSAND_", "SIGNED_LEFT_SHIFT_", "SIGNED_RIGHT_SHIFT_", 
		"CARET_", "MOD_", "COLON_", "PLUS_", "MINUS_", "ASTERISK_", "SLASH_", 
		"BACKSLASH_", "DOT_", "DOT_ASTERISK_", "SAFE_EQ_", "DEQ_", "EQ_", "NEQ_", 
		"GT_", "GTE_", "LT_", "LTE_", "POUND_", "LP_", "RP_", "LBE_", "RBE_", 
		"LBT_", "RBT_", "COMMA_", "DQ_", "SQ_", "BQ_", "QUESTION_", "AT_", "SEMI_", 
		"BLOCK_COMMENT", "INLINE_COMMENT", "IDENTIFIER_", "STRING_", "NUMBER_", 
		"HEX_DIGIT_", "BIT_NUM_"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "MySQLStatement.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MySQLStatementParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ExecuteContext extends ParserRuleContext {
		public SelectContext select() {
			return getRuleContext(SelectContext.class,0);
		}
		public InsertContext insert() {
			return getRuleContext(InsertContext.class,0);
		}
		public UpdateContext update() {
			return getRuleContext(UpdateContext.class,0);
		}
		public DeleteContext delete() {
			return getRuleContext(DeleteContext.class,0);
		}
		public CreateTableContext createTable() {
			return getRuleContext(CreateTableContext.class,0);
		}
		public AlterTableContext alterTable() {
			return getRuleContext(AlterTableContext.class,0);
		}
		public DropTableContext dropTable() {
			return getRuleContext(DropTableContext.class,0);
		}
		public TruncateTableContext truncateTable() {
			return getRuleContext(TruncateTableContext.class,0);
		}
		public CreateIndexContext createIndex() {
			return getRuleContext(CreateIndexContext.class,0);
		}
		public DropIndexContext dropIndex() {
			return getRuleContext(DropIndexContext.class,0);
		}
		public SetTransactionContext setTransaction() {
			return getRuleContext(SetTransactionContext.class,0);
		}
		public BeginTransactionContext beginTransaction() {
			return getRuleContext(BeginTransactionContext.class,0);
		}
		public SetAutoCommitContext setAutoCommit() {
			return getRuleContext(SetAutoCommitContext.class,0);
		}
		public CommitContext commit() {
			return getRuleContext(CommitContext.class,0);
		}
		public RollbackContext rollback() {
			return getRuleContext(RollbackContext.class,0);
		}
		public SavepointContext savepoint() {
			return getRuleContext(SavepointContext.class,0);
		}
		public GrantContext grant() {
			return getRuleContext(GrantContext.class,0);
		}
		public RevokeContext revoke() {
			return getRuleContext(RevokeContext.class,0);
		}
		public CreateUserContext createUser() {
			return getRuleContext(CreateUserContext.class,0);
		}
		public DropUserContext dropUser() {
			return getRuleContext(DropUserContext.class,0);
		}
		public AlterUserContext alterUser() {
			return getRuleContext(AlterUserContext.class,0);
		}
		public RenameUserContext renameUser() {
			return getRuleContext(RenameUserContext.class,0);
		}
		public CreateRoleContext createRole() {
			return getRuleContext(CreateRoleContext.class,0);
		}
		public DropRoleContext dropRole() {
			return getRuleContext(DropRoleContext.class,0);
		}
		public SetRoleContext setRole() {
			return getRuleContext(SetRoleContext.class,0);
		}
		public SetPasswordContext setPassword() {
			return getRuleContext(SetPasswordContext.class,0);
		}
		public TerminalNode SEMI_() { return getToken(MySQLStatementParser.SEMI_, 0); }
		public ExecuteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_execute; }
	}

	public final ExecuteContext execute() throws RecognitionException {
		ExecuteContext _localctx = new ExecuteContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_execute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(380);
				select();
				}
				break;
			case 2:
				{
				setState(381);
				insert();
				}
				break;
			case 3:
				{
				setState(382);
				update();
				}
				break;
			case 4:
				{
				setState(383);
				delete();
				}
				break;
			case 5:
				{
				setState(384);
				createTable();
				}
				break;
			case 6:
				{
				setState(385);
				alterTable();
				}
				break;
			case 7:
				{
				setState(386);
				dropTable();
				}
				break;
			case 8:
				{
				setState(387);
				truncateTable();
				}
				break;
			case 9:
				{
				setState(388);
				createIndex();
				}
				break;
			case 10:
				{
				setState(389);
				dropIndex();
				}
				break;
			case 11:
				{
				setState(390);
				setTransaction();
				}
				break;
			case 12:
				{
				setState(391);
				beginTransaction();
				}
				break;
			case 13:
				{
				setState(392);
				setAutoCommit();
				}
				break;
			case 14:
				{
				setState(393);
				commit();
				}
				break;
			case 15:
				{
				setState(394);
				rollback();
				}
				break;
			case 16:
				{
				setState(395);
				savepoint();
				}
				break;
			case 17:
				{
				setState(396);
				grant();
				}
				break;
			case 18:
				{
				setState(397);
				revoke();
				}
				break;
			case 19:
				{
				setState(398);
				createUser();
				}
				break;
			case 20:
				{
				setState(399);
				dropUser();
				}
				break;
			case 21:
				{
				setState(400);
				alterUser();
				}
				break;
			case 22:
				{
				setState(401);
				renameUser();
				}
				break;
			case 23:
				{
				setState(402);
				createRole();
				}
				break;
			case 24:
				{
				setState(403);
				dropRole();
				}
				break;
			case 25:
				{
				setState(404);
				setRole();
				}
				break;
			case 26:
				{
				setState(405);
				setPassword();
				}
				break;
			}
			setState(409);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI_) {
				{
				setState(408);
				match(SEMI_);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InsertContext extends ParserRuleContext {
		public TerminalNode INSERT() { return getToken(MySQLStatementParser.INSERT, 0); }
		public InsertSpecification_Context insertSpecification_() {
			return getRuleContext(InsertSpecification_Context.class,0);
		}
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public InsertValuesClauseContext insertValuesClause() {
			return getRuleContext(InsertValuesClauseContext.class,0);
		}
		public SetAssignmentsClauseContext setAssignmentsClause() {
			return getRuleContext(SetAssignmentsClauseContext.class,0);
		}
		public InsertSelectClauseContext insertSelectClause() {
			return getRuleContext(InsertSelectClauseContext.class,0);
		}
		public TerminalNode INTO() { return getToken(MySQLStatementParser.INTO, 0); }
		public PartitionNames_Context partitionNames_() {
			return getRuleContext(PartitionNames_Context.class,0);
		}
		public OnDuplicateKeyClauseContext onDuplicateKeyClause() {
			return getRuleContext(OnDuplicateKeyClauseContext.class,0);
		}
		public InsertContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert; }
	}

	public final InsertContext insert() throws RecognitionException {
		InsertContext _localctx = new InsertContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_insert);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(411);
			match(INSERT);
			setState(412);
			insertSpecification_();
			setState(414);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INTO) {
				{
				setState(413);
				match(INTO);
				}
			}

			setState(416);
			tableName();
			setState(418);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PARTITION) {
				{
				setState(417);
				partitionNames_();
				}
			}

			setState(423);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(420);
				insertValuesClause();
				}
				break;
			case 2:
				{
				setState(421);
				setAssignmentsClause();
				}
				break;
			case 3:
				{
				setState(422);
				insertSelectClause();
				}
				break;
			}
			setState(426);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(425);
				onDuplicateKeyClause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InsertSpecification_Context extends ParserRuleContext {
		public TerminalNode IGNORE() { return getToken(MySQLStatementParser.IGNORE, 0); }
		public TerminalNode LOW_PRIORITY() { return getToken(MySQLStatementParser.LOW_PRIORITY, 0); }
		public TerminalNode DELAYED() { return getToken(MySQLStatementParser.DELAYED, 0); }
		public TerminalNode HIGH_PRIORITY() { return getToken(MySQLStatementParser.HIGH_PRIORITY, 0); }
		public InsertSpecification_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertSpecification_; }
	}

	public final InsertSpecification_Context insertSpecification_() throws RecognitionException {
		InsertSpecification_Context _localctx = new InsertSpecification_Context(_ctx, getState());
		enterRule(_localctx, 4, RULE_insertSpecification_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (DELAYED - 128)) | (1L << (HIGH_PRIORITY - 128)) | (1L << (LOW_PRIORITY - 128)))) != 0)) {
				{
				setState(428);
				_la = _input.LA(1);
				if ( !(((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (DELAYED - 128)) | (1L << (HIGH_PRIORITY - 128)) | (1L << (LOW_PRIORITY - 128)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(432);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IGNORE) {
				{
				setState(431);
				match(IGNORE);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InsertValuesClauseContext extends ParserRuleContext {
		public List<AssignmentValuesContext> assignmentValues() {
			return getRuleContexts(AssignmentValuesContext.class);
		}
		public AssignmentValuesContext assignmentValues(int i) {
			return getRuleContext(AssignmentValuesContext.class,i);
		}
		public TerminalNode VALUES() { return getToken(MySQLStatementParser.VALUES, 0); }
		public TerminalNode VALUE() { return getToken(MySQLStatementParser.VALUE, 0); }
		public ColumnNamesContext columnNames() {
			return getRuleContext(ColumnNamesContext.class,0);
		}
		public List<TerminalNode> COMMA_() { return getTokens(MySQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(MySQLStatementParser.COMMA_, i);
		}
		public InsertValuesClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertValuesClause; }
	}

	public final InsertValuesClauseContext insertValuesClause() throws RecognitionException {
		InsertValuesClauseContext _localctx = new InsertValuesClauseContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_insertValuesClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP_) {
				{
				setState(434);
				columnNames();
				}
			}

			setState(437);
			_la = _input.LA(1);
			if ( !(_la==VALUE || _la==VALUES) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(438);
			assignmentValues();
			setState(443);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(439);
				match(COMMA_);
				setState(440);
				assignmentValues();
				}
				}
				setState(445);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InsertSelectClauseContext extends ParserRuleContext {
		public SelectContext select() {
			return getRuleContext(SelectContext.class,0);
		}
		public ColumnNamesContext columnNames() {
			return getRuleContext(ColumnNamesContext.class,0);
		}
		public InsertSelectClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertSelectClause; }
	}

	public final InsertSelectClauseContext insertSelectClause() throws RecognitionException {
		InsertSelectClauseContext _localctx = new InsertSelectClauseContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_insertSelectClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(447);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP_) {
				{
				setState(446);
				columnNames();
				}
			}

			setState(449);
			select();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OnDuplicateKeyClauseContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(MySQLStatementParser.ON, 0); }
		public TerminalNode DUPLICATE() { return getToken(MySQLStatementParser.DUPLICATE, 0); }
		public TerminalNode KEY() { return getToken(MySQLStatementParser.KEY, 0); }
		public TerminalNode UPDATE() { return getToken(MySQLStatementParser.UPDATE, 0); }
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(MySQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(MySQLStatementParser.COMMA_, i);
		}
		public OnDuplicateKeyClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onDuplicateKeyClause; }
	}

	public final OnDuplicateKeyClauseContext onDuplicateKeyClause() throws RecognitionException {
		OnDuplicateKeyClauseContext _localctx = new OnDuplicateKeyClauseContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_onDuplicateKeyClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
			match(ON);
			setState(452);
			match(DUPLICATE);
			setState(453);
			match(KEY);
			setState(454);
			match(UPDATE);
			setState(455);
			assignment();
			setState(460);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(456);
				match(COMMA_);
				setState(457);
				assignment();
				}
				}
				setState(462);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UpdateContext extends ParserRuleContext {
		public TerminalNode UPDATE() { return getToken(MySQLStatementParser.UPDATE, 0); }
		public UpdateSpecification_Context updateSpecification_() {
			return getRuleContext(UpdateSpecification_Context.class,0);
		}
		public TableReferencesContext tableReferences() {
			return getRuleContext(TableReferencesContext.class,0);
		}
		public SetAssignmentsClauseContext setAssignmentsClause() {
			return getRuleContext(SetAssignmentsClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public UpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update; }
	}

	public final UpdateContext update() throws RecognitionException {
		UpdateContext _localctx = new UpdateContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_update);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(463);
			match(UPDATE);
			setState(464);
			updateSpecification_();
			setState(465);
			tableReferences();
			setState(466);
			setAssignmentsClause();
			setState(468);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(467);
				whereClause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UpdateSpecification_Context extends ParserRuleContext {
		public TerminalNode LOW_PRIORITY() { return getToken(MySQLStatementParser.LOW_PRIORITY, 0); }
		public TerminalNode IGNORE() { return getToken(MySQLStatementParser.IGNORE, 0); }
		public UpdateSpecification_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_updateSpecification_; }
	}

	public final UpdateSpecification_Context updateSpecification_() throws RecognitionException {
		UpdateSpecification_Context _localctx = new UpdateSpecification_Context(_ctx, getState());
		enterRule(_localctx, 14, RULE_updateSpecification_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(471);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LOW_PRIORITY) {
				{
				setState(470);
				match(LOW_PRIORITY);
				}
			}

			setState(474);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IGNORE) {
				{
				setState(473);
				match(IGNORE);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public TerminalNode EQ_() { return getToken(MySQLStatementParser.EQ_, 0); }
		public AssignmentValueContext assignmentValue() {
			return getRuleContext(AssignmentValueContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(476);
			columnName();
			setState(477);
			match(EQ_);
			setState(478);
			assignmentValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetAssignmentsClauseContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(MySQLStatementParser.SET, 0); }
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(MySQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(MySQLStatementParser.COMMA_, i);
		}
		public SetAssignmentsClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setAssignmentsClause; }
	}

	public final SetAssignmentsClauseContext setAssignmentsClause() throws RecognitionException {
		SetAssignmentsClauseContext _localctx = new SetAssignmentsClauseContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_setAssignmentsClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(480);
			match(SET);
			setState(481);
			assignment();
			setState(486);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(482);
				match(COMMA_);
				setState(483);
				assignment();
				}
				}
				setState(488);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentValuesContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(MySQLStatementParser.LP_, 0); }
		public List<AssignmentValueContext> assignmentValue() {
			return getRuleContexts(AssignmentValueContext.class);
		}
		public AssignmentValueContext assignmentValue(int i) {
			return getRuleContext(AssignmentValueContext.class,i);
		}
		public TerminalNode RP_() { return getToken(MySQLStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(MySQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(MySQLStatementParser.COMMA_, i);
		}
		public AssignmentValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentValues; }
	}

	public final AssignmentValuesContext assignmentValues() throws RecognitionException {
		AssignmentValuesContext _localctx = new AssignmentValuesContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_assignmentValues);
		int _la;
		try {
			setState(502);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(489);
				match(LP_);
				setState(490);
				assignmentValue();
				setState(495);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(491);
					match(COMMA_);
					setState(492);
					assignmentValue();
					}
					}
					setState(497);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(498);
				match(RP_);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(500);
				match(LP_);
				setState(501);
				match(RP_);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentValueContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(MySQLStatementParser.DEFAULT, 0); }
		public AssignmentValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentValue; }
	}

	public final AssignmentValueContext assignmentValue() throws RecognitionException {
		AssignmentValueContext _localctx = new AssignmentValueContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_assignmentValue);
		try {
			setState(506);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ANY:
			case BINARY:
			case DATE:
			case ESCAPE:
			case EXISTS:
			case FALSE:
			case NOT:
			case NULL:
			case OFFSET:
			case ROLLUP:
			case ROW:
			case SOUNDS:
			case TIME:
			case TIMESTAMP:
			case TRUE:
			case UNKNOWN:
			case ALWAYS:
			case COMMIT:
			case COMMITTED:
			case CURRENT:
			case DISABLE:
			case ENABLE:
			case LEVEL:
			case NO:
			case PASSWORD:
			case PRIVILEGES:
			case ROLLBACK:
			case START:
			case TRANSACTION:
			case TRUNCATE:
			case ACCOUNT:
			case ACTION:
			case AFTER:
			case ALGORITHM:
			case AUTO_INCREMENT:
			case AVG_ROW_LENGTH:
			case BEGIN:
			case BTREE:
			case CASE:
			case CAST:
			case CHAIN:
			case CHAR:
			case CHARSET:
			case CHECKSUM:
			case CIPHER:
			case CLIENT:
			case COALESCE:
			case COLUMNS:
			case COLUMN_FORMAT:
			case COMMENT:
			case COMPACT:
			case COMPRESSED:
			case COMPRESSION:
			case CONNECTION:
			case CONSISTENT:
			case CONVERT:
			case CURRENT_TIMESTAMP:
			case DATA:
			case DELAY_KEY_WRITE:
			case DISCARD:
			case DISK:
			case DUPLICATE:
			case ENCRYPTION:
			case END:
			case ENGINE:
			case EVENT:
			case EXCHANGE:
			case EXECUTE:
			case EXTRACT:
			case FILE:
			case FIRST:
			case FIXED:
			case FOLLOWING:
			case GLOBAL:
			case HASH:
			case IF:
			case IMPORT_:
			case INSERT_METHOD:
			case INTERVAL:
			case KEY_BLOCK_SIZE:
			case LAST:
			case LESS:
			case LOCALTIME:
			case LOCALTIMESTAMP:
			case MATCH:
			case MAX_ROWS:
			case MEMORY:
			case MIN_ROWS:
			case MODIFY:
			case NONE:
			case NOW:
			case PACK_KEYS:
			case PARSER:
			case PARTIAL:
			case PARTITIONING:
			case PERSIST:
			case PERSIST_ONLY:
			case POSITION:
			case PRECEDING:
			case PROCESS:
			case PROXY:
			case QUICK:
			case REBUILD:
			case REDUNDANT:
			case RELOAD:
			case REMOVE:
			case REORGANIZE:
			case REPAIR:
			case REPLACE:
			case REVERSE:
			case ROW_FORMAT:
			case SAVEPOINT:
			case SESSION:
			case SHUTDOWN:
			case SIMPLE:
			case SLAVE:
			case SQL_BIG_RESULT:
			case SQL_BUFFER_RESULT:
			case SQL_CACHE:
			case SQL_NO_CACHE:
			case STATS_AUTO_RECALC:
			case STATS_PERSISTENT:
			case STATS_SAMPLE_PAGES:
			case STORAGE:
			case SUBPARTITION:
			case SUPER:
			case SUBSTR:
			case SUBSTRING:
			case TABLES:
			case TABLESPACE:
			case TEMPORARY:
			case THAN:
			case TRIM:
			case UNBOUNDED:
			case UPGRADE:
			case VALIDATION:
			case VALUE:
			case VIEW:
			case WEIGHT_STRING:
			case WITHOUT:
			case VISIBLE:
			case INVISIBLE:
			case ENFORCED:
			case MICROSECOND:
			case SECOND:
			case MINUTE:
			case HOUR:
			case DAY:
			case WEEK:
			case MONTH:
			case QUARTER:
			case YEAR:
			case AGAINST:
			case LANGUAGE:
			case MODE:
			case QUERY:
			case EXPANSION:
			case BOOLEAN:
			case MAX:
			case MIN:
			case SUM:
			case COUNT:
			case AVG:
			case BIT_AND:
			case BIT_OR:
			case BIT_XOR:
			case GROUP_CONCAT:
			case JSON_ARRAYAGG:
			case JSON_OBJECTAGG:
			case STD:
			case STDDEV:
			case STDDEV_POP:
			case STDDEV_SAMP:
			case VAR_POP:
			case VAR_SAMP:
			case VARIANCE:
			case NOT_:
			case TILDE_:
			case PLUS_:
			case MINUS_:
			case DOT_:
			case LP_:
			case LBE_:
			case QUESTION_:
			case AT_:
			case IDENTIFIER_:
			case STRING_:
			case NUMBER_:
			case HEX_DIGIT_:
			case BIT_NUM_:
				enterOuterAlt(_localctx, 1);
				{
				setState(504);
				expr(0);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(505);
				match(DEFAULT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeleteContext extends ParserRuleContext {
		public TerminalNode DELETE() { return getToken(MySQLStatementParser.DELETE, 0); }
		public DeleteSpecification_Context deleteSpecification_() {
			return getRuleContext(DeleteSpecification_Context.class,0);
		}
		public SingleTableClause_Context singleTableClause_() {
			return getRuleContext(SingleTableClause_Context.class,0);
		}
		public MultipleTablesClause_Context multipleTablesClause_() {
			return getRuleContext(MultipleTablesClause_Context.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public DeleteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete; }
	}

	public final DeleteContext delete() throws RecognitionException {
		DeleteContext _localctx = new DeleteContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_delete);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(508);
			match(DELETE);
			setState(509);
			deleteSpecification_();
			setState(512);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(510);
				singleTableClause_();
				}
				break;
			case 2:
				{
				setState(511);
				multipleTablesClause_();
				}
				break;
			}
			setState(515);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(514);
				whereClause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeleteSpecification_Context extends ParserRuleContext {
		public TerminalNode LOW_PRIORITY() { return getToken(MySQLStatementParser.LOW_PRIORITY, 0); }
		public TerminalNode QUICK() { return getToken(MySQLStatementParser.QUICK, 0); }
		public TerminalNode IGNORE() { return getToken(MySQLStatementParser.IGNORE, 0); }
		public DeleteSpecification_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deleteSpecification_; }
	}

	public final DeleteSpecification_Context deleteSpecification_() throws RecognitionException {
		DeleteSpecification_Context _localctx = new DeleteSpecification_Context(_ctx, getState());
		enterRule(_localctx, 26, RULE_deleteSpecification_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(518);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LOW_PRIORITY) {
				{
				setState(517);
				match(LOW_PRIORITY);
				}
			}

			setState(521);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(520);
				match(QUICK);
				}
				break;
			}
			setState(524);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IGNORE) {
				{
				setState(523);
				match(IGNORE);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleTableClause_Context extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(MySQLStatementParser.FROM, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public PartitionNames_Context partitionNames_() {
			return getRuleContext(PartitionNames_Context.class,0);
		}
		public TerminalNode AS() { return getToken(MySQLStatementParser.AS, 0); }
		public SingleTableClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleTableClause_; }
	}

	public final SingleTableClause_Context singleTableClause_() throws RecognitionException {
		SingleTableClause_Context _localctx = new SingleTableClause_Context(_ctx, getState());
		enterRule(_localctx, 28, RULE_singleTableClause_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(526);
			match(FROM);
			setState(527);
			tableName();
			setState(532);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ANY) | (1L << DATE) | (1L << ESCAPE) | (1L << OFFSET) | (1L << ROLLUP) | (1L << SOUNDS) | (1L << TIME) | (1L << TIMESTAMP) | (1L << UNKNOWN) | (1L << ALWAYS) | (1L << AS) | (1L << COMMIT) | (1L << COMMITTED) | (1L << CURRENT) | (1L << DISABLE) | (1L << ENABLE))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (LEVEL - 69)) | (1L << (NO - 69)) | (1L << (PASSWORD - 69)) | (1L << (PRIVILEGES - 69)) | (1L << (ROLLBACK - 69)) | (1L << (START - 69)) | (1L << (TRANSACTION - 69)) | (1L << (TRUNCATE - 69)) | (1L << (ACCOUNT - 69)) | (1L << (ACTION - 69)) | (1L << (AFTER - 69)) | (1L << (ALGORITHM - 69)) | (1L << (AUTO_INCREMENT - 69)) | (1L << (AVG_ROW_LENGTH - 69)) | (1L << (BEGIN - 69)) | (1L << (BTREE - 69)) | (1L << (CHAIN - 69)) | (1L << (CHARSET - 69)) | (1L << (CHECKSUM - 69)) | (1L << (CIPHER - 69)) | (1L << (CLIENT - 69)) | (1L << (COALESCE - 69)) | (1L << (COLUMNS - 69)) | (1L << (COLUMN_FORMAT - 69)) | (1L << (COMMENT - 69)) | (1L << (COMPACT - 69)) | (1L << (COMPRESSED - 69)) | (1L << (COMPRESSION - 69)) | (1L << (CONNECTION - 69)) | (1L << (CONSISTENT - 69)) | (1L << (DATA - 69)) | (1L << (DELAY_KEY_WRITE - 69)) | (1L << (DISCARD - 69)) | (1L << (DISK - 69)))) != 0) || ((((_la - 135)) & ~0x3f) == 0 && ((1L << (_la - 135)) & ((1L << (DUPLICATE - 135)) | (1L << (ENCRYPTION - 135)) | (1L << (END - 135)) | (1L << (ENGINE - 135)) | (1L << (EVENT - 135)) | (1L << (EXCHANGE - 135)) | (1L << (EXECUTE - 135)) | (1L << (FILE - 135)) | (1L << (FIRST - 135)) | (1L << (FIXED - 135)) | (1L << (FOLLOWING - 135)) | (1L << (GLOBAL - 135)) | (1L << (HASH - 135)) | (1L << (IMPORT_ - 135)) | (1L << (INSERT_METHOD - 135)) | (1L << (KEY_BLOCK_SIZE - 135)) | (1L << (LAST - 135)) | (1L << (LESS - 135)) | (1L << (MAX_ROWS - 135)) | (1L << (MEMORY - 135)) | (1L << (MIN_ROWS - 135)) | (1L << (MODIFY - 135)) | (1L << (NONE - 135)) | (1L << (PACK_KEYS - 135)) | (1L << (PARSER - 135)))) != 0) || ((((_la - 199)) & ~0x3f) == 0 && ((1L << (_la - 199)) & ((1L << (PARTIAL - 199)) | (1L << (PARTITIONING - 199)) | (1L << (PERSIST - 199)) | (1L << (PERSIST_ONLY - 199)) | (1L << (PRECEDING - 199)) | (1L << (PROCESS - 199)) | (1L << (PROXY - 199)) | (1L << (QUICK - 199)) | (1L << (REBUILD - 199)) | (1L << (REDUNDANT - 199)) | (1L << (RELOAD - 199)) | (1L << (REMOVE - 199)) | (1L << (REORGANIZE - 199)) | (1L << (REPAIR - 199)) | (1L << (REVERSE - 199)) | (1L << (ROW_FORMAT - 199)) | (1L << (SAVEPOINT - 199)) | (1L << (SESSION - 199)) | (1L << (SHUTDOWN - 199)) | (1L << (SIMPLE - 199)) | (1L << (SLAVE - 199)) | (1L << (SQL_BIG_RESULT - 199)) | (1L << (SQL_BUFFER_RESULT - 199)) | (1L << (SQL_CACHE - 199)) | (1L << (SQL_NO_CACHE - 199)) | (1L << (STATS_AUTO_RECALC - 199)) | (1L << (STATS_PERSISTENT - 199)) | (1L << (STATS_SAMPLE_PAGES - 199)) | (1L << (STORAGE - 199)) | (1L << (SUBPARTITION - 199)) | (1L << (SUPER - 199)) | (1L << (TABLES - 199)) | (1L << (TABLESPACE - 199)))) != 0) || ((((_la - 263)) & ~0x3f) == 0 && ((1L << (_la - 263)) & ((1L << (TEMPORARY - 263)) | (1L << (THAN - 263)) | (1L << (UNBOUNDED - 263)) | (1L << (UPGRADE - 263)) | (1L << (VALIDATION - 263)) | (1L << (VALUE - 263)) | (1L << (VIEW - 263)) | (1L << (WEIGHT_STRING - 263)) | (1L << (WITHOUT - 263)) | (1L << (VISIBLE - 263)) | (1L << (INVISIBLE - 263)) | (1L << (ENFORCED - 263)) | (1L << (MICROSECOND - 263)) | (1L << (SECOND - 263)) | (1L << (MINUTE - 263)) | (1L << (HOUR - 263)) | (1L << (DAY - 263)) | (1L << (WEEK - 263)) | (1L << (MONTH - 263)) | (1L << (QUARTER - 263)) | (1L << (YEAR - 263)) | (1L << (AGAINST - 263)) | (1L << (LANGUAGE - 263)) | (1L << (MODE - 263)) | (1L << (QUERY - 263)) | (1L << (EXPANSION - 263)) | (1L << (BOOLEAN - 263)) | (1L << (MAX - 263)) | (1L << (MIN - 263)) | (1L << (SUM - 263)) | (1L << (COUNT - 263)) | (1L << (AVG - 263)) | (1L << (BIT_AND - 263)) | (1L << (BIT_OR - 263)))) != 0) || ((((_la - 327)) & ~0x3f) == 0 && ((1L << (_la - 327)) & ((1L << (BIT_XOR - 327)) | (1L << (GROUP_CONCAT - 327)) | (1L << (JSON_ARRAYAGG - 327)) | (1L << (JSON_OBJECTAGG - 327)) | (1L << (STD - 327)) | (1L << (STDDEV - 327)) | (1L << (STDDEV_POP - 327)) | (1L << (STDDEV_SAMP - 327)) | (1L << (VAR_POP - 327)) | (1L << (VAR_SAMP - 327)) | (1L << (VARIANCE - 327)) | (1L << (IDENTIFIER_ - 327)) | (1L << (STRING_ - 327)))) != 0)) {
				{
				setState(529);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(528);
					match(AS);
					}
				}

				setState(531);
				alias();
				}
			}

			setState(535);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PARTITION) {
				{
				setState(534);
				partitionNames_();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultipleTablesClause_Context extends ParserRuleContext {
		public MultipleTableNames_Context multipleTableNames_() {
			return getRuleContext(MultipleTableNames_Context.class,0);
		}
		public TerminalNode FROM() { return getToken(MySQLStatementParser.FROM, 0); }
		public TableReferencesContext tableReferences() {
			return getRuleContext(TableReferencesContext.class,0);
		}
		public TerminalNode USING() { return getToken(MySQLStatementParser.USING, 0); }
		public MultipleTablesClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multipleTablesClause_; }
	}

	public final MultipleTablesClause_Context multipleTablesClause_() throws RecognitionException {
		MultipleTablesClause_Context _localctx = new MultipleTablesClause_Context(_ctx, getState());
		enterRule(_localctx, 30, RULE_multipleTablesClause_);
		try {
			setState(546);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ANY:
			case DATE:
			case ESCAPE:
			case OFFSET:
			case ROLLUP:
			case SOUNDS:
			case TIME:
			case TIMESTAMP:
			case UNKNOWN:
			case ALWAYS:
			case COMMIT:
			case COMMITTED:
			case CURRENT:
			case DISABLE:
			case ENABLE:
			case LEVEL:
			case NO:
			case PASSWORD:
			case PRIVILEGES:
			case ROLLBACK:
			case START:
			case TRANSACTION:
			case TRUNCATE:
			case ACCOUNT:
			case ACTION:
			case AFTER:
			case ALGORITHM:
			case AUTO_INCREMENT:
			case AVG_ROW_LENGTH:
			case BEGIN:
			case BTREE:
			case CHAIN:
			case CHARSET:
			case CHECKSUM:
			case CIPHER:
			case CLIENT:
			case COALESCE:
			case COLUMNS:
			case COLUMN_FORMAT:
			case COMMENT:
			case COMPACT:
			case COMPRESSED:
			case COMPRESSION:
			case CONNECTION:
			case CONSISTENT:
			case DATA:
			case DELAY_KEY_WRITE:
			case DISCARD:
			case DISK:
			case DUPLICATE:
			case ENCRYPTION:
			case END:
			case ENGINE:
			case EVENT:
			case EXCHANGE:
			case EXECUTE:
			case FILE:
			case FIRST:
			case FIXED:
			case FOLLOWING:
			case GLOBAL:
			case HASH:
			case IMPORT_:
			case INSERT_METHOD:
			case KEY_BLOCK_SIZE:
			case LAST:
			case LESS:
			case MAX_ROWS:
			case MEMORY:
			case MIN_ROWS:
			case MODIFY:
			case NONE:
			case PACK_KEYS:
			case PARSER:
			case PARTIAL:
			case PARTITIONING:
			case PERSIST:
			case PERSIST_ONLY:
			case PRECEDING:
			case PROCESS:
			case PROXY:
			case QUICK:
			case REBUILD:
			case REDUNDANT:
			case RELOAD:
			case REMOVE:
			case REORGANIZE:
			case REPAIR:
			case REVERSE:
			case ROW_FORMAT:
			case SAVEPOINT:
			case SESSION:
			case SHUTDOWN:
			case SIMPLE:
			case SLAVE:
			case SQL_BIG_RESULT:
			case SQL_BUFFER_RESULT:
			case SQL_CACHE:
			case SQL_NO_CACHE:
			case STATS_AUTO_RECALC:
			case STATS_PERSISTENT:
			case STATS_SAMPLE_PAGES:
			case STORAGE:
			case SUBPARTITION:
			case SUPER:
			case TABLES:
			case TABLESPACE:
			case TEMPORARY:
			case THAN:
			case UNBOUNDED:
			case UPGRADE:
			case VALIDATION:
			case VALUE:
			case VIEW:
			case WEIGHT_STRING:
			case WITHOUT:
			case VISIBLE:
			case INVISIBLE:
			case ENFORCED:
			case MICROSECOND:
			case SECOND:
			case MINUTE:
			case HOUR:
			case DAY:
			case WEEK:
			case MONTH:
			case QUARTER:
			case YEAR:
			case AGAINST:
			case LANGUAGE:
			case MODE:
			case QUERY:
			case EXPANSION:
			case BOOLEAN:
			case MAX:
			case MIN:
			case SUM:
			case COUNT:
			case AVG:
			case BIT_AND:
			case BIT_OR:
			case BIT_XOR:
			case GROUP_CONCAT:
			case JSON_ARRAYAGG:
			case JSON_OBJECTAGG:
			case STD:
			case STDDEV:
			case STDDEV_POP:
			case STDDEV_SAMP:
			case VAR_POP:
			case VAR_SAMP:
			case VARIANCE:
			case IDENTIFIER_:
				enterOuterAlt(_localctx, 1);
				{
				setState(537);
				multipleTableNames_();
				setState(538);
				match(FROM);
				setState(539);
				tableReferences();
				}
				break;
			case FROM:
				enterOuterAlt(_localctx, 2);
				{
				setState(541);
				match(FROM);
				setState(542);
				multipleTableNames_();
				setState(543);
				match(USING);
				setState(544);
				tableReferences();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultipleTableNames_Context extends ParserRuleContext {
		public List<TableNameContext> tableName() {
			return getRuleContexts(TableNameContext.class);
		}
		public TableNameContext tableName(int i) {
			return getRuleContext(TableNameContext.class,i);
		}
		public List<TerminalNode> DOT_ASTERISK_() { return getTokens(MySQLStatementParser.DOT_ASTERISK_); }
		public TerminalNode DOT_ASTERISK_(int i) {
			return getToken(MySQLStatementParser.DOT_ASTERISK_, i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(MySQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(MySQLStatementParser.COMMA_, i);
		}
		public MultipleTableNames_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multipleTableNames_; }
	}

	public final MultipleTableNames_Context multipleTableNames_() throws RecognitionException {
		MultipleTableNames_Context _localctx = new MultipleTableNames_Context(_ctx, getState());
		enterRule(_localctx, 32, RULE_multipleTableNames_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(548);
			tableName();
			setState(550);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT_ASTERISK_) {
				{
				setState(549);
				match(DOT_ASTERISK_);
				}
			}

			setState(559);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(552);
				match(COMMA_);
				setState(553);
				tableName();
				setState(555);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOT_ASTERISK_) {
					{
					setState(554);
					match(DOT_ASTERISK_);
					}
				}

				}
				}
				setState(561);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectContext extends ParserRuleContext {
		public UnionClause_Context unionClause_() {
			return getRuleContext(UnionClause_Context.class,0);
		}
		public WithClause_Context withClause_() {
			return getRuleContext(WithClause_Context.class,0);
		}
		public SelectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select; }
	}

	public final SelectContext select() throws RecognitionException {
		SelectContext _localctx = new SelectContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_select);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(563);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(562);
				withClause_();
				}
			}

			setState(565);
			unionClause_();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WithClause_Context extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(MySQLStatementParser.WITH, 0); }
		public List<CteClause_Context> cteClause_() {
			return getRuleContexts(CteClause_Context.class);
		}
		public CteClause_Context cteClause_(int i) {
			return getRuleContext(CteClause_Context.class,i);
		}
		public TerminalNode RECURSIVE() { return getToken(MySQLStatementParser.RECURSIVE, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(MySQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(MySQLStatementParser.COMMA_, i);
		}
		public WithClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_withClause_; }
	}

	public final WithClause_Context withClause_() throws RecognitionException {
		WithClause_Context _localctx = new WithClause_Context(_ctx, getState());
		enterRule(_localctx, 36, RULE_withClause_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(567);
			match(WITH);
			setState(569);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RECURSIVE) {
				{
				setState(568);
				match(RECURSIVE);
				}
			}

			setState(571);
			cteClause_();
			setState(576);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(572);
				match(COMMA_);
				setState(573);
				cteClause_();
				}
				}
				setState(578);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CteClause_Context extends ParserRuleContext {
		public IgnoredIdentifier_Context ignoredIdentifier_() {
			return getRuleContext(IgnoredIdentifier_Context.class,0);
		}
		public TerminalNode AS() { return getToken(MySQLStatementParser.AS, 0); }
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public ColumnNamesContext columnNames() {
			return getRuleContext(ColumnNamesContext.class,0);
		}
		public CteClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cteClause_; }
	}

	public final CteClause_Context cteClause_() throws RecognitionException {
		CteClause_Context _localctx = new CteClause_Context(_ctx, getState());
		enterRule(_localctx, 38, RULE_cteClause_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(579);
			ignoredIdentifier_();
			setState(581);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP_) {
				{
				setState(580);
				columnNames();
				}
			}

			setState(583);
			match(AS);
			setState(584);
			subquery();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnionClause_Context extends ParserRuleContext {
		public List<SelectClauseContext> selectClause() {
			return getRuleContexts(SelectClauseContext.class);
		}
		public SelectClauseContext selectClause(int i) {
			return getRuleContext(SelectClauseContext.class,i);
		}
		public List<TerminalNode> UNION() { return getTokens(MySQLStatementParser.UNION); }
		public TerminalNode UNION(int i) {
			return getToken(MySQLStatementParser.UNION, i);
		}
		public List<TerminalNode> ALL() { return getTokens(MySQLStatementParser.ALL); }
		public TerminalNode ALL(int i) {
			return getToken(MySQLStatementParser.ALL, i);
		}
		public List<TerminalNode> DISTINCT() { return getTokens(MySQLStatementParser.DISTINCT); }
		public TerminalNode DISTINCT(int i) {
			return getToken(MySQLStatementParser.DISTINCT, i);
		}
		public UnionClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unionClause_; }
	}

	public final UnionClause_Context unionClause_() throws RecognitionException {
		UnionClause_Context _localctx = new UnionClause_Context(_ctx, getState());
		enterRule(_localctx, 40, RULE_unionClause_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(586);
			selectClause();
			setState(594);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==UNION) {
				{
				{
				setState(587);
				match(UNION);
				setState(589);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ALL || _la==DISTINCT) {
					{
					setState(588);
					_la = _input.LA(1);
					if ( !(_la==ALL || _la==DISTINCT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(591);
				selectClause();
				}
				}
				setState(596);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectClauseContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(MySQLStatementParser.SELECT, 0); }
		public SelectItemsContext selectItems() {
			return getRuleContext(SelectItemsContext.class,0);
		}
		public List<SelectSpecification_Context> selectSpecification_() {
			return getRuleContexts(SelectSpecification_Context.class);
		}
		public SelectSpecification_Context selectSpecification_(int i) {
			return getRuleContext(SelectSpecification_Context.class,i);
		}
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public GroupByClauseContext groupByClause() {
			return getRuleContext(GroupByClauseContext.class,0);
		}
		public HavingClauseContext havingClause() {
			return getRuleContext(HavingClauseContext.class,0);
		}
		public WindowClause_Context windowClause_() {
			return getRuleContext(WindowClause_Context.class,0);
		}
		public OrderByClauseContext orderByClause() {
			return getRuleContext(OrderByClauseContext.class,0);
		}
		public LimitClauseContext limitClause() {
			return getRuleContext(LimitClauseContext.class,0);
		}
		public SelectClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectClause; }
	}

	public final SelectClauseContext selectClause() throws RecognitionException {
		SelectClauseContext _localctx = new SelectClauseContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_selectClause);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(597);
			match(SELECT);
			setState(601);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(598);
					selectSpecification_();
					}
					} 
				}
				setState(603);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			}
			setState(604);
			selectItems();
			setState(606);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(605);
				fromClause();
				}
			}

			setState(609);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(608);
				whereClause();
				}
			}

			setState(612);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GROUP) {
				{
				setState(611);
				groupByClause();
				}
			}

			setState(615);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HAVING) {
				{
				setState(614);
				havingClause();
				}
			}

			setState(618);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WINDOW) {
				{
				setState(617);
				windowClause_();
				}
			}

			setState(621);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(620);
				orderByClause();
				}
			}

			setState(624);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(623);
				limitClause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectSpecification_Context extends ParserRuleContext {
		public DuplicateSpecificationContext duplicateSpecification() {
			return getRuleContext(DuplicateSpecificationContext.class,0);
		}
		public TerminalNode HIGH_PRIORITY() { return getToken(MySQLStatementParser.HIGH_PRIORITY, 0); }
		public TerminalNode STRAIGHT_JOIN() { return getToken(MySQLStatementParser.STRAIGHT_JOIN, 0); }
		public TerminalNode SQL_SMALL_RESULT() { return getToken(MySQLStatementParser.SQL_SMALL_RESULT, 0); }
		public TerminalNode SQL_BIG_RESULT() { return getToken(MySQLStatementParser.SQL_BIG_RESULT, 0); }
		public TerminalNode SQL_BUFFER_RESULT() { return getToken(MySQLStatementParser.SQL_BUFFER_RESULT, 0); }
		public TerminalNode SQL_CACHE() { return getToken(MySQLStatementParser.SQL_CACHE, 0); }
		public TerminalNode SQL_NO_CACHE() { return getToken(MySQLStatementParser.SQL_NO_CACHE, 0); }
		public TerminalNode SQL_CALC_FOUND_ROWS() { return getToken(MySQLStatementParser.SQL_CALC_FOUND_ROWS, 0); }
		public SelectSpecification_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectSpecification_; }
	}

	public final SelectSpecification_Context selectSpecification_() throws RecognitionException {
		SelectSpecification_Context _localctx = new SelectSpecification_Context(_ctx, getState());
		enterRule(_localctx, 44, RULE_selectSpecification_);
		int _la;
		try {
			setState(634);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALL:
			case DISTINCT:
			case DISTINCTROW:
				enterOuterAlt(_localctx, 1);
				{
				setState(626);
				duplicateSpecification();
				}
				break;
			case HIGH_PRIORITY:
				enterOuterAlt(_localctx, 2);
				{
				setState(627);
				match(HIGH_PRIORITY);
				}
				break;
			case STRAIGHT_JOIN:
				enterOuterAlt(_localctx, 3);
				{
				setState(628);
				match(STRAIGHT_JOIN);
				}
				break;
			case SQL_SMALL_RESULT:
				enterOuterAlt(_localctx, 4);
				{
				setState(629);
				match(SQL_SMALL_RESULT);
				}
				break;
			case SQL_BIG_RESULT:
				enterOuterAlt(_localctx, 5);
				{
				setState(630);
				match(SQL_BIG_RESULT);
				}
				break;
			case SQL_BUFFER_RESULT:
				enterOuterAlt(_localctx, 6);
				{
				setState(631);
				match(SQL_BUFFER_RESULT);
				}
				break;
			case SQL_CACHE:
			case SQL_NO_CACHE:
				enterOuterAlt(_localctx, 7);
				{
				setState(632);
				_la = _input.LA(1);
				if ( !(_la==SQL_CACHE || _la==SQL_NO_CACHE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case SQL_CALC_FOUND_ROWS:
				enterOuterAlt(_localctx, 8);
				{
				setState(633);
				match(SQL_CALC_FOUND_ROWS);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DuplicateSpecificationContext extends ParserRuleContext {
		public TerminalNode ALL() { return getToken(MySQLStatementParser.ALL, 0); }
		public TerminalNode DISTINCT() { return getToken(MySQLStatementParser.DISTINCT, 0); }
		public TerminalNode DISTINCTROW() { return getToken(MySQLStatementParser.DISTINCTROW, 0); }
		public DuplicateSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_duplicateSpecification; }
	}

	public final DuplicateSpecificationContext duplicateSpecification() throws RecognitionException {
		DuplicateSpecificationContext _localctx = new DuplicateSpecificationContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_duplicateSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(636);
			_la = _input.LA(1);
			if ( !(_la==ALL || _la==DISTINCT || _la==DISTINCTROW) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectItemsContext extends ParserRuleContext {
		public UnqualifiedShorthandContext unqualifiedShorthand() {
			return getRuleContext(UnqualifiedShorthandContext.class,0);
		}
		public List<SelectItemContext> selectItem() {
			return getRuleContexts(SelectItemContext.class);
		}
		public SelectItemContext selectItem(int i) {
			return getRuleContext(SelectItemContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(MySQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(MySQLStatementParser.COMMA_, i);
		}
		public SelectItemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectItems; }
	}

	public final SelectItemsContext selectItems() throws RecognitionException {
		SelectItemsContext _localctx = new SelectItemsContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_selectItems);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(640);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASTERISK_:
				{
				setState(638);
				unqualifiedShorthand();
				}
				break;
			case ANY:
			case BINARY:
			case DATE:
			case ESCAPE:
			case EXISTS:
			case FALSE:
			case NOT:
			case NULL:
			case OFFSET:
			case ROLLUP:
			case ROW:
			case SOUNDS:
			case TIME:
			case TIMESTAMP:
			case TRUE:
			case UNKNOWN:
			case ALWAYS:
			case COMMIT:
			case COMMITTED:
			case CURRENT:
			case DISABLE:
			case ENABLE:
			case LEVEL:
			case NO:
			case PASSWORD:
			case PRIVILEGES:
			case ROLLBACK:
			case START:
			case TRANSACTION:
			case TRUNCATE:
			case ACCOUNT:
			case ACTION:
			case AFTER:
			case ALGORITHM:
			case AUTO_INCREMENT:
			case AVG_ROW_LENGTH:
			case BEGIN:
			case BTREE:
			case CASE:
			case CAST:
			case CHAIN:
			case CHAR:
			case CHARSET:
			case CHECKSUM:
			case CIPHER:
			case CLIENT:
			case COALESCE:
			case COLUMNS:
			case COLUMN_FORMAT:
			case COMMENT:
			case COMPACT:
			case COMPRESSED:
			case COMPRESSION:
			case CONNECTION:
			case CONSISTENT:
			case CONVERT:
			case CURRENT_TIMESTAMP:
			case DATA:
			case DELAY_KEY_WRITE:
			case DISCARD:
			case DISK:
			case DUPLICATE:
			case ENCRYPTION:
			case END:
			case ENGINE:
			case EVENT:
			case EXCHANGE:
			case EXECUTE:
			case EXTRACT:
			case FILE:
			case FIRST:
			case FIXED:
			case FOLLOWING:
			case GLOBAL:
			case HASH:
			case IF:
			case IMPORT_:
			case INSERT_METHOD:
			case INTERVAL:
			case KEY_BLOCK_SIZE:
			case LAST:
			case LESS:
			case LOCALTIME:
			case LOCALTIMESTAMP:
			case MATCH:
			case MAX_ROWS:
			case MEMORY:
			case MIN_ROWS:
			case MODIFY:
			case NONE:
			case NOW:
			case PACK_KEYS:
			case PARSER:
			case PARTIAL:
			case PARTITIONING:
			case PERSIST:
			case PERSIST_ONLY:
			case POSITION:
			case PRECEDING:
			case PROCESS:
			case PROXY:
			case QUICK:
			case REBUILD:
			case REDUNDANT:
			case RELOAD:
			case REMOVE:
			case REORGANIZE:
			case REPAIR:
			case REPLACE:
			case REVERSE:
			case ROW_FORMAT:
			case SAVEPOINT:
			case SESSION:
			case SHUTDOWN:
			case SIMPLE:
			case SLAVE:
			case SQL_BIG_RESULT:
			case SQL_BUFFER_RESULT:
			case SQL_CACHE:
			case SQL_NO_CACHE:
			case STATS_AUTO_RECALC:
			case STATS_PERSISTENT:
			case STATS_SAMPLE_PAGES:
			case STORAGE:
			case SUBPARTITION:
			case SUPER:
			case SUBSTR:
			case SUBSTRING:
			case TABLES:
			case TABLESPACE:
			case TEMPORARY:
			case THAN:
			case TRIM:
			case UNBOUNDED:
			case UPGRADE:
			case VALIDATION:
			case VALUE:
			case VIEW:
			case WEIGHT_STRING:
			case WITHOUT:
			case VISIBLE:
			case INVISIBLE:
			case ENFORCED:
			case MICROSECOND:
			case SECOND:
			case MINUTE:
			case HOUR:
			case DAY:
			case WEEK:
			case MONTH:
			case QUARTER:
			case YEAR:
			case AGAINST:
			case LANGUAGE:
			case MODE:
			case QUERY:
			case EXPANSION:
			case BOOLEAN:
			case MAX:
			case MIN:
			case SUM:
			case COUNT:
			case AVG:
			case BIT_AND:
			case BIT_OR:
			case BIT_XOR:
			case GROUP_CONCAT:
			case JSON_ARRAYAGG:
			case JSON_OBJECTAGG:
			case STD:
			case STDDEV:
			case STDDEV_POP:
			case STDDEV_SAMP:
			case VAR_POP:
			case VAR_SAMP:
			case VARIANCE:
			case NOT_:
			case TILDE_:
			case PLUS_:
			case MINUS_:
			case DOT_:
			case LP_:
			case LBE_:
			case QUESTION_:
			case AT_:
			case IDENTIFIER_:
			case STRING_:
			case NUMBER_:
			case HEX_DIGIT_:
			case BIT_NUM_:
				{
				setState(639);
				selectItem();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(646);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(642);
				match(COMMA_);
				setState(643);
				selectItem();
				}
				}
				setState(648);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectItemContext extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public TerminalNode AS() { return getToken(MySQLStatementParser.AS, 0); }
		public QualifiedShorthandContext qualifiedShorthand() {
			return getRuleContext(QualifiedShorthandContext.class,0);
		}
		public SelectItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectItem; }
	}

	public final SelectItemContext selectItem() throws RecognitionException {
		SelectItemContext _localctx = new SelectItemContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_selectItem);
		int _la;
		try {
			setState(660);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(651);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
				case 1:
					{
					setState(649);
					columnName();
					}
					break;
				case 2:
					{
					setState(650);
					expr(0);
					}
					break;
				}
				setState(657);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ANY) | (1L << DATE) | (1L << ESCAPE) | (1L << OFFSET) | (1L << ROLLUP) | (1L << SOUNDS) | (1L << TIME) | (1L << TIMESTAMP) | (1L << UNKNOWN) | (1L << ALWAYS) | (1L << AS) | (1L << COMMIT) | (1L << COMMITTED) | (1L << CURRENT) | (1L << DISABLE) | (1L << ENABLE))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (LEVEL - 69)) | (1L << (NO - 69)) | (1L << (PASSWORD - 69)) | (1L << (PRIVILEGES - 69)) | (1L << (ROLLBACK - 69)) | (1L << (START - 69)) | (1L << (TRANSACTION - 69)) | (1L << (TRUNCATE - 69)) | (1L << (ACCOUNT - 69)) | (1L << (ACTION - 69)) | (1L << (AFTER - 69)) | (1L << (ALGORITHM - 69)) | (1L << (AUTO_INCREMENT - 69)) | (1L << (AVG_ROW_LENGTH - 69)) | (1L << (BEGIN - 69)) | (1L << (BTREE - 69)) | (1L << (CHAIN - 69)) | (1L << (CHARSET - 69)) | (1L << (CHECKSUM - 69)) | (1L << (CIPHER - 69)) | (1L << (CLIENT - 69)) | (1L << (COALESCE - 69)) | (1L << (COLUMNS - 69)) | (1L << (COLUMN_FORMAT - 69)) | (1L << (COMMENT - 69)) | (1L << (COMPACT - 69)) | (1L << (COMPRESSED - 69)) | (1L << (COMPRESSION - 69)) | (1L << (CONNECTION - 69)) | (1L << (CONSISTENT - 69)) | (1L << (DATA - 69)) | (1L << (DELAY_KEY_WRITE - 69)) | (1L << (DISCARD - 69)) | (1L << (DISK - 69)))) != 0) || ((((_la - 135)) & ~0x3f) == 0 && ((1L << (_la - 135)) & ((1L << (DUPLICATE - 135)) | (1L << (ENCRYPTION - 135)) | (1L << (END - 135)) | (1L << (ENGINE - 135)) | (1L << (EVENT - 135)) | (1L << (EXCHANGE - 135)) | (1L << (EXECUTE - 135)) | (1L << (FILE - 135)) | (1L << (FIRST - 135)) | (1L << (FIXED - 135)) | (1L << (FOLLOWING - 135)) | (1L << (GLOBAL - 135)) | (1L << (HASH - 135)) | (1L << (IMPORT_ - 135)) | (1L << (INSERT_METHOD - 135)) | (1L << (KEY_BLOCK_SIZE - 135)) | (1L << (LAST - 135)) | (1L << (LESS - 135)) | (1L << (MAX_ROWS - 135)) | (1L << (MEMORY - 135)) | (1L << (MIN_ROWS - 135)) | (1L << (MODIFY - 135)) | (1L << (NONE - 135)) | (1L << (PACK_KEYS - 135)) | (1L << (PARSER - 135)))) != 0) || ((((_la - 199)) & ~0x3f) == 0 && ((1L << (_la - 199)) & ((1L << (PARTIAL - 199)) | (1L << (PARTITIONING - 199)) | (1L << (PERSIST - 199)) | (1L << (PERSIST_ONLY - 199)) | (1L << (PRECEDING - 199)) | (1L << (PROCESS - 199)) | (1L << (PROXY - 199)) | (1L << (QUICK - 199)) | (1L << (REBUILD - 199)) | (1L << (REDUNDANT - 199)) | (1L << (RELOAD - 199)) | (1L << (REMOVE - 199)) | (1L << (REORGANIZE - 199)) | (1L << (REPAIR - 199)) | (1L << (REVERSE - 199)) | (1L << (ROW_FORMAT - 199)) | (1L << (SAVEPOINT - 199)) | (1L << (SESSION - 199)) | (1L << (SHUTDOWN - 199)) | (1L << (SIMPLE - 199)) | (1L << (SLAVE - 199)) | (1L << (SQL_BIG_RESULT - 199)) | (1L << (SQL_BUFFER_RESULT - 199)) | (1L << (SQL_CACHE - 199)) | (1L << (SQL_NO_CACHE - 199)) | (1L << (STATS_AUTO_RECALC - 199)) | (1L << (STATS_PERSISTENT - 199)) | (1L << (STATS_SAMPLE_PAGES - 199)) | (1L << (STORAGE - 199)) | (1L << (SUBPARTITION - 199)) | (1L << (SUPER - 199)) | (1L << (TABLES - 199)) | (1L << (TABLESPACE - 199)))) != 0) || ((((_la - 263)) & ~0x3f) == 0 && ((1L << (_la - 263)) & ((1L << (TEMPORARY - 263)) | (1L << (THAN - 263)) | (1L << (UNBOUNDED - 263)) | (1L << (UPGRADE - 263)) | (1L << (VALIDATION - 263)) | (1L << (VALUE - 263)) | (1L << (VIEW - 263)) | (1L << (WEIGHT_STRING - 263)) | (1L << (WITHOUT - 263)) | (1L << (VISIBLE - 263)) | (1L << (INVISIBLE - 263)) | (1L << (ENFORCED - 263)) | (1L << (MICROSECOND - 263)) | (1L << (SECOND - 263)) | (1L << (MINUTE - 263)) | (1L << (HOUR - 263)) | (1L << (DAY - 263)) | (1L << (WEEK - 263)) | (1L << (MONTH - 263)) | (1L << (QUARTER - 263)) | (1L << (YEAR - 263)) | (1L << (AGAINST - 263)) | (1L << (LANGUAGE - 263)) | (1L << (MODE - 263)) | (1L << (QUERY - 263)) | (1L << (EXPANSION - 263)) | (1L << (BOOLEAN - 263)) | (1L << (MAX - 263)) | (1L << (MIN - 263)) | (1L << (SUM - 263)) | (1L << (COUNT - 263)) | (1L << (AVG - 263)) | (1L << (BIT_AND - 263)) | (1L << (BIT_OR - 263)))) != 0) || ((((_la - 327)) & ~0x3f) == 0 && ((1L << (_la - 327)) & ((1L << (BIT_XOR - 327)) | (1L << (GROUP_CONCAT - 327)) | (1L << (JSON_ARRAYAGG - 327)) | (1L << (JSON_OBJECTAGG - 327)) | (1L << (STD - 327)) | (1L << (STDDEV - 327)) | (1L << (STDDEV_POP - 327)) | (1L << (STDDEV_SAMP - 327)) | (1L << (VAR_POP - 327)) | (1L << (VAR_SAMP - 327)) | (1L << (VARIANCE - 327)) | (1L << (IDENTIFIER_ - 327)) | (1L << (STRING_ - 327)))) != 0)) {
					{
					setState(654);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(653);
						match(AS);
						}
					}

					setState(656);
					alias();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(659);
				qualifiedShorthand();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AliasContext extends ParserRuleContext {
		public Identifier_Context identifier_() {
			return getRuleContext(Identifier_Context.class,0);
		}
		public TerminalNode STRING_() { return getToken(MySQLStatementParser.STRING_, 0); }
		public AliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alias; }
	}

	public final AliasContext alias() throws RecognitionException {
		AliasContext _localctx = new AliasContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_alias);
		try {
			setState(664);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ANY:
			case DATE:
			case ESCAPE:
			case OFFSET:
			case ROLLUP:
			case SOUNDS:
			case TIME:
			case TIMESTAMP:
			case UNKNOWN:
			case ALWAYS:
			case COMMIT:
			case COMMITTED:
			case CURRENT:
			case DISABLE:
			case ENABLE:
			case LEVEL:
			case NO:
			case PASSWORD:
			case PRIVILEGES:
			case ROLLBACK:
			case START:
			case TRANSACTION:
			case TRUNCATE:
			case ACCOUNT:
			case ACTION:
			case AFTER:
			case ALGORITHM:
			case AUTO_INCREMENT:
			case AVG_ROW_LENGTH:
			case BEGIN:
			case BTREE:
			case CHAIN:
			case CHARSET:
			case CHECKSUM:
			case CIPHER:
			case CLIENT:
			case COALESCE:
			case COLUMNS:
			case COLUMN_FORMAT:
			case COMMENT:
			case COMPACT:
			case COMPRESSED:
			case COMPRESSION:
			case CONNECTION:
			case CONSISTENT:
			case DATA:
			case DELAY_KEY_WRITE:
			case DISCARD:
			case DISK:
			case DUPLICATE:
			case ENCRYPTION:
			case END:
			case ENGINE:
			case EVENT:
			case EXCHANGE:
			case EXECUTE:
			case FILE:
			case FIRST:
			case FIXED:
			case FOLLOWING:
			case GLOBAL:
			case HASH:
			case IMPORT_:
			case INSERT_METHOD:
			case KEY_BLOCK_SIZE:
			case LAST:
			case LESS:
			case MAX_ROWS:
			case MEMORY:
			case MIN_ROWS:
			case MODIFY:
			case NONE:
			case PACK_KEYS:
			case PARSER:
			case PARTIAL:
			case PARTITIONING:
			case PERSIST:
			case PERSIST_ONLY:
			case PRECEDING:
			case PROCESS:
			case PROXY:
			case QUICK:
			case REBUILD:
			case REDUNDANT:
			case RELOAD:
			case REMOVE:
			case REORGANIZE:
			case REPAIR:
			case REVERSE:
			case ROW_FORMAT:
			case SAVEPOINT:
			case SESSION:
			case SHUTDOWN:
			case SIMPLE:
			case SLAVE:
			case SQL_BIG_RESULT:
			case SQL_BUFFER_RESULT:
			case SQL_CACHE:
			case SQL_NO_CACHE:
			case STATS_AUTO_RECALC:
			case STATS_PERSISTENT:
			case STATS_SAMPLE_PAGES:
			case STORAGE:
			case SUBPARTITION:
			case SUPER:
			case TABLES:
			case TABLESPACE:
			case TEMPORARY:
			case THAN:
			case UNBOUNDED:
			case UPGRADE:
			case VALIDATION:
			case VALUE:
			case VIEW:
			case WEIGHT_STRING:
			case WITHOUT:
			case VISIBLE:
			case INVISIBLE:
			case ENFORCED:
			case MICROSECOND:
			case SECOND:
			case MINUTE:
			case HOUR:
			case DAY:
			case WEEK:
			case MONTH:
			case QUARTER:
			case YEAR:
			case AGAINST:
			case LANGUAGE:
			case MODE:
			case QUERY:
			case EXPANSION:
			case BOOLEAN:
			case MAX:
			case MIN:
			case SUM:
			case COUNT:
			case AVG:
			case BIT_AND:
			case BIT_OR:
			case BIT_XOR:
			case GROUP_CONCAT:
			case JSON_ARRAYAGG:
			case JSON_OBJECTAGG:
			case STD:
			case STDDEV:
			case STDDEV_POP:
			case STDDEV_SAMP:
			case VAR_POP:
			case VAR_SAMP:
			case VARIANCE:
			case IDENTIFIER_:
				enterOuterAlt(_localctx, 1);
				{
				setState(662);
				identifier_();
				}
				break;
			case STRING_:
				enterOuterAlt(_localctx, 2);
				{
				setState(663);
				match(STRING_);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnqualifiedShorthandContext extends ParserRuleContext {
		public TerminalNode ASTERISK_() { return getToken(MySQLStatementParser.ASTERISK_, 0); }
		public UnqualifiedShorthandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unqualifiedShorthand; }
	}

	public final UnqualifiedShorthandContext unqualifiedShorthand() throws RecognitionException {
		UnqualifiedShorthandContext _localctx = new UnqualifiedShorthandContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_unqualifiedShorthand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(666);
			match(ASTERISK_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedShorthandContext extends ParserRuleContext {
		public Identifier_Context identifier_() {
			return getRuleContext(Identifier_Context.class,0);
		}
		public TerminalNode DOT_ASTERISK_() { return getToken(MySQLStatementParser.DOT_ASTERISK_, 0); }
		public QualifiedShorthandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedShorthand; }
	}

	public final QualifiedShorthandContext qualifiedShorthand() throws RecognitionException {
		QualifiedShorthandContext _localctx = new QualifiedShorthandContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_qualifiedShorthand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(668);
			identifier_();
			setState(669);
			match(DOT_ASTERISK_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FromClauseContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(MySQLStatementParser.FROM, 0); }
		public TableReferencesContext tableReferences() {
			return getRuleContext(TableReferencesContext.class,0);
		}
		public FromClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromClause; }
	}

	public final FromClauseContext fromClause() throws RecognitionException {
		FromClauseContext _localctx = new FromClauseContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_fromClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(671);
			match(FROM);
			setState(672);
			tableReferences();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableReferencesContext extends ParserRuleContext {
		public List<EscapedTableReference_Context> escapedTableReference_() {
			return getRuleContexts(EscapedTableReference_Context.class);
		}
		public EscapedTableReference_Context escapedTableReference_(int i) {
			return getRuleContext(EscapedTableReference_Context.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(MySQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(MySQLStatementParser.COMMA_, i);
		}
		public TableReferencesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableReferences; }
	}

	public final TableReferencesContext tableReferences() throws RecognitionException {
		TableReferencesContext _localctx = new TableReferencesContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_tableReferences);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(674);
			escapedTableReference_();
			setState(679);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(675);
				match(COMMA_);
				setState(676);
				escapedTableReference_();
				}
				}
				setState(681);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EscapedTableReference_Context extends ParserRuleContext {
		public TableReferenceContext tableReference() {
			return getRuleContext(TableReferenceContext.class,0);
		}
		public TerminalNode LBE_() { return getToken(MySQLStatementParser.LBE_, 0); }
		public TerminalNode OJ() { return getToken(MySQLStatementParser.OJ, 0); }
		public TerminalNode RBE_() { return getToken(MySQLStatementParser.RBE_, 0); }
		public EscapedTableReference_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_escapedTableReference_; }
	}

	public final EscapedTableReference_Context escapedTableReference_() throws RecognitionException {
		EscapedTableReference_Context _localctx = new EscapedTableReference_Context(_ctx, getState());
		enterRule(_localctx, 62, RULE_escapedTableReference_);
		try {
			setState(688);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ANY:
			case DATE:
			case ESCAPE:
			case OFFSET:
			case ROLLUP:
			case SOUNDS:
			case TIME:
			case TIMESTAMP:
			case UNKNOWN:
			case ALWAYS:
			case COMMIT:
			case COMMITTED:
			case CURRENT:
			case DISABLE:
			case ENABLE:
			case LEVEL:
			case NO:
			case PASSWORD:
			case PRIVILEGES:
			case ROLLBACK:
			case START:
			case TRANSACTION:
			case TRUNCATE:
			case ACCOUNT:
			case ACTION:
			case AFTER:
			case ALGORITHM:
			case AUTO_INCREMENT:
			case AVG_ROW_LENGTH:
			case BEGIN:
			case BTREE:
			case CHAIN:
			case CHARSET:
			case CHECKSUM:
			case CIPHER:
			case CLIENT:
			case COALESCE:
			case COLUMNS:
			case COLUMN_FORMAT:
			case COMMENT:
			case COMPACT:
			case COMPRESSED:
			case COMPRESSION:
			case CONNECTION:
			case CONSISTENT:
			case DATA:
			case DELAY_KEY_WRITE:
			case DISCARD:
			case DISK:
			case DUPLICATE:
			case ENCRYPTION:
			case END:
			case ENGINE:
			case EVENT:
			case EXCHANGE:
			case EXECUTE:
			case FILE:
			case FIRST:
			case FIXED:
			case FOLLOWING:
			case GLOBAL:
			case HASH:
			case IMPORT_:
			case INSERT_METHOD:
			case KEY_BLOCK_SIZE:
			case LAST:
			case LESS:
			case MAX_ROWS:
			case MEMORY:
			case MIN_ROWS:
			case MODIFY:
			case NONE:
			case PACK_KEYS:
			case PARSER:
			case PARTIAL:
			case PARTITIONING:
			case PERSIST:
			case PERSIST_ONLY:
			case PRECEDING:
			case PROCESS:
			case PROXY:
			case QUICK:
			case REBUILD:
			case REDUNDANT:
			case RELOAD:
			case REMOVE:
			case REORGANIZE:
			case REPAIR:
			case REVERSE:
			case ROW_FORMAT:
			case SAVEPOINT:
			case SESSION:
			case SHUTDOWN:
			case SIMPLE:
			case SLAVE:
			case SQL_BIG_RESULT:
			case SQL_BUFFER_RESULT:
			case SQL_CACHE:
			case SQL_NO_CACHE:
			case STATS_AUTO_RECALC:
			case STATS_PERSISTENT:
			case STATS_SAMPLE_PAGES:
			case STORAGE:
			case SUBPARTITION:
			case SUPER:
			case TABLES:
			case TABLESPACE:
			case TEMPORARY:
			case THAN:
			case UNBOUNDED:
			case UPGRADE:
			case VALIDATION:
			case VALUE:
			case VIEW:
			case WEIGHT_STRING:
			case WITHOUT:
			case VISIBLE:
			case INVISIBLE:
			case ENFORCED:
			case MICROSECOND:
			case SECOND:
			case MINUTE:
			case HOUR:
			case DAY:
			case WEEK:
			case MONTH:
			case QUARTER:
			case YEAR:
			case AGAINST:
			case LANGUAGE:
			case MODE:
			case QUERY:
			case EXPANSION:
			case BOOLEAN:
			case MAX:
			case MIN:
			case SUM:
			case COUNT:
			case AVG:
			case BIT_AND:
			case BIT_OR:
			case BIT_XOR:
			case GROUP_CONCAT:
			case JSON_ARRAYAGG:
			case JSON_OBJECTAGG:
			case STD:
			case STDDEV:
			case STDDEV_POP:
			case STDDEV_SAMP:
			case VAR_POP:
			case VAR_SAMP:
			case VARIANCE:
			case LP_:
			case IDENTIFIER_:
				enterOuterAlt(_localctx, 1);
				{
				setState(682);
				tableReference();
				}
				break;
			case LBE_:
				enterOuterAlt(_localctx, 2);
				{
				setState(683);
				match(LBE_);
				setState(684);
				match(OJ);
				setState(685);
				tableReference();
				setState(686);
				match(RBE_);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableReferenceContext extends ParserRuleContext {
		public List<TableFactorContext> tableFactor() {
			return getRuleContexts(TableFactorContext.class);
		}
		public TableFactorContext tableFactor(int i) {
			return getRuleContext(TableFactorContext.class,i);
		}
		public List<JoinedTableContext> joinedTable() {
			return getRuleContexts(JoinedTableContext.class);
		}
		public JoinedTableContext joinedTable(int i) {
			return getRuleContext(JoinedTableContext.class,i);
		}
		public TableReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableReference; }
	}

	public final TableReferenceContext tableReference() throws RecognitionException {
		TableReferenceContext _localctx = new TableReferenceContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_tableReference);
		int _la;
		try {
			setState(704);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(693); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(690);
					tableFactor();
					setState(691);
					joinedTable();
					}
					}
					setState(695); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ANY) | (1L << DATE) | (1L << ESCAPE) | (1L << OFFSET) | (1L << ROLLUP) | (1L << SOUNDS) | (1L << TIME) | (1L << TIMESTAMP) | (1L << UNKNOWN) | (1L << ALWAYS) | (1L << COMMIT) | (1L << COMMITTED) | (1L << CURRENT) | (1L << DISABLE) | (1L << ENABLE))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (LEVEL - 69)) | (1L << (NO - 69)) | (1L << (PASSWORD - 69)) | (1L << (PRIVILEGES - 69)) | (1L << (ROLLBACK - 69)) | (1L << (START - 69)) | (1L << (TRANSACTION - 69)) | (1L << (TRUNCATE - 69)) | (1L << (ACCOUNT - 69)) | (1L << (ACTION - 69)) | (1L << (AFTER - 69)) | (1L << (ALGORITHM - 69)) | (1L << (AUTO_INCREMENT - 69)) | (1L << (AVG_ROW_LENGTH - 69)) | (1L << (BEGIN - 69)) | (1L << (BTREE - 69)) | (1L << (CHAIN - 69)) | (1L << (CHARSET - 69)) | (1L << (CHECKSUM - 69)) | (1L << (CIPHER - 69)) | (1L << (CLIENT - 69)) | (1L << (COALESCE - 69)) | (1L << (COLUMNS - 69)) | (1L << (COLUMN_FORMAT - 69)) | (1L << (COMMENT - 69)) | (1L << (COMPACT - 69)) | (1L << (COMPRESSED - 69)) | (1L << (COMPRESSION - 69)) | (1L << (CONNECTION - 69)) | (1L << (CONSISTENT - 69)) | (1L << (DATA - 69)) | (1L << (DELAY_KEY_WRITE - 69)) | (1L << (DISCARD - 69)) | (1L << (DISK - 69)))) != 0) || ((((_la - 135)) & ~0x3f) == 0 && ((1L << (_la - 135)) & ((1L << (DUPLICATE - 135)) | (1L << (ENCRYPTION - 135)) | (1L << (END - 135)) | (1L << (ENGINE - 135)) | (1L << (EVENT - 135)) | (1L << (EXCHANGE - 135)) | (1L << (EXECUTE - 135)) | (1L << (FILE - 135)) | (1L << (FIRST - 135)) | (1L << (FIXED - 135)) | (1L << (FOLLOWING - 135)) | (1L << (GLOBAL - 135)) | (1L << (HASH - 135)) | (1L << (IMPORT_ - 135)) | (1L << (INSERT_METHOD - 135)) | (1L << (KEY_BLOCK_SIZE - 135)) | (1L << (LAST - 135)) | (1L << (LESS - 135)) | (1L << (MAX_ROWS - 135)) | (1L << (MEMORY - 135)) | (1L << (MIN_ROWS - 135)) | (1L << (MODIFY - 135)) | (1L << (NONE - 135)) | (1L << (PACK_KEYS - 135)) | (1L << (PARSER - 135)))) != 0) || ((((_la - 199)) & ~0x3f) == 0 && ((1L << (_la - 199)) & ((1L << (PARTIAL - 199)) | (1L << (PARTITIONING - 199)) | (1L << (PERSIST - 199)) | (1L << (PERSIST_ONLY - 199)) | (1L << (PRECEDING - 199)) | (1L << (PROCESS - 199)) | (1L << (PROXY - 199)) | (1L << (QUICK - 199)) | (1L << (REBUILD - 199)) | (1L << (REDUNDANT - 199)) | (1L << (RELOAD - 199)) | (1L << (REMOVE - 199)) | (1L << (REORGANIZE - 199)) | (1L << (REPAIR - 199)) | (1L << (REVERSE - 199)) | (1L << (ROW_FORMAT - 199)) | (1L << (SAVEPOINT - 199)) | (1L << (SESSION - 199)) | (1L << (SHUTDOWN - 199)) | (1L << (SIMPLE - 199)) | (1L << (SLAVE - 199)) | (1L << (SQL_BIG_RESULT - 199)) | (1L << (SQL_BUFFER_RESULT - 199)) | (1L << (SQL_CACHE - 199)) | (1L << (SQL_NO_CACHE - 199)) | (1L << (STATS_AUTO_RECALC - 199)) | (1L << (STATS_PERSISTENT - 199)) | (1L << (STATS_SAMPLE_PAGES - 199)) | (1L << (STORAGE - 199)) | (1L << (SUBPARTITION - 199)) | (1L << (SUPER - 199)) | (1L << (TABLES - 199)) | (1L << (TABLESPACE - 199)))) != 0) || ((((_la - 263)) & ~0x3f) == 0 && ((1L << (_la - 263)) & ((1L << (TEMPORARY - 263)) | (1L << (THAN - 263)) | (1L << (UNBOUNDED - 263)) | (1L << (UPGRADE - 263)) | (1L << (VALIDATION - 263)) | (1L << (VALUE - 263)) | (1L << (VIEW - 263)) | (1L << (WEIGHT_STRING - 263)) | (1L << (WITHOUT - 263)) | (1L << (VISIBLE - 263)) | (1L << (INVISIBLE - 263)) | (1L << (ENFORCED - 263)) | (1L << (MICROSECOND - 263)) | (1L << (SECOND - 263)) | (1L << (MINUTE - 263)) | (1L << (HOUR - 263)) | (1L << (DAY - 263)) | (1L << (WEEK - 263)) | (1L << (MONTH - 263)) | (1L << (QUARTER - 263)) | (1L << (YEAR - 263)) | (1L << (AGAINST - 263)) | (1L << (LANGUAGE - 263)) | (1L << (MODE - 263)) | (1L << (QUERY - 263)) | (1L << (EXPANSION - 263)) | (1L << (BOOLEAN - 263)) | (1L << (MAX - 263)) | (1L << (MIN - 263)) | (1L << (SUM - 263)) | (1L << (COUNT - 263)) | (1L << (AVG - 263)) | (1L << (BIT_AND - 263)) | (1L << (BIT_OR - 263)))) != 0) || ((((_la - 327)) & ~0x3f) == 0 && ((1L << (_la - 327)) & ((1L << (BIT_XOR - 327)) | (1L << (GROUP_CONCAT - 327)) | (1L << (JSON_ARRAYAGG - 327)) | (1L << (JSON_OBJECTAGG - 327)) | (1L << (STD - 327)) | (1L << (STDDEV - 327)) | (1L << (STDDEV_POP - 327)) | (1L << (STDDEV_SAMP - 327)) | (1L << (VAR_POP - 327)) | (1L << (VAR_SAMP - 327)) | (1L << (VARIANCE - 327)) | (1L << (LP_ - 327)) | (1L << (IDENTIFIER_ - 327)))) != 0) );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(697);
				tableFactor();
				setState(701);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 124)) & ~0x3f) == 0 && ((1L << (_la - 124)) & ((1L << (CROSS - 124)) | (1L << (INNER - 124)) | (1L << (JOIN - 124)) | (1L << (LEFT - 124)))) != 0) || _la==NATURAL || _la==RIGHT || _la==STRAIGHT_JOIN) {
					{
					{
					setState(698);
					joinedTable();
					}
					}
					setState(703);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableFactorContext extends ParserRuleContext {
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public PartitionNames_Context partitionNames_() {
			return getRuleContext(PartitionNames_Context.class,0);
		}
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public IndexHintList_Context indexHintList_() {
			return getRuleContext(IndexHintList_Context.class,0);
		}
		public TerminalNode AS() { return getToken(MySQLStatementParser.AS, 0); }
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public ColumnNamesContext columnNames() {
			return getRuleContext(ColumnNamesContext.class,0);
		}
		public TerminalNode LP_() { return getToken(MySQLStatementParser.LP_, 0); }
		public TableReferencesContext tableReferences() {
			return getRuleContext(TableReferencesContext.class,0);
		}
		public TerminalNode RP_() { return getToken(MySQLStatementParser.RP_, 0); }
		public TableFactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableFactor; }
	}

	public final TableFactorContext tableFactor() throws RecognitionException {
		TableFactorContext _localctx = new TableFactorContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_tableFactor);
		int _la;
		try {
			setState(731);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(706);
				tableName();
				setState(708);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(707);
					partitionNames_();
					}
				}

				setState(714);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
				case 1:
					{
					setState(711);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(710);
						match(AS);
						}
					}

					setState(713);
					alias();
					}
					break;
				}
				setState(717);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FORCE || _la==IGNORE || _la==USE) {
					{
					setState(716);
					indexHintList_();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(719);
				subquery();
				setState(721);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(720);
					match(AS);
					}
				}

				setState(723);
				alias();
				setState(725);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
				case 1:
					{
					setState(724);
					columnNames();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(727);
				match(LP_);
				setState(728);
				tableReferences();
				setState(729);
				match(RP_);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PartitionNames_Context extends ParserRuleContext {
		public TerminalNode PARTITION() { return getToken(MySQLStatementParser.PARTITION, 0); }
		public TerminalNode LP_() { return getToken(MySQLStatementParser.LP_, 0); }
		public List<Identifier_Context> identifier_() {
			return getRuleContexts(Identifier_Context.class);
		}
		public Identifier_Context identifier_(int i) {
			return getRuleContext(Identifier_Context.class,i);
		}
		public TerminalNode RP_() { return getToken(MySQLStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(MySQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(MySQLStatementParser.COMMA_, i);
		}
		public PartitionNames_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionNames_; }
	}

	public final PartitionNames_Context partitionNames_() throws RecognitionException {
		PartitionNames_Context _localctx = new PartitionNames_Context(_ctx, getState());
		enterRule(_localctx, 68, RULE_partitionNames_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(733);
			match(PARTITION);
			setState(734);
			match(LP_);
			setState(735);
			identifier_();
			setState(740);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(736);
				match(COMMA_);
				setState(737);
				identifier_();
				}
				}
				setState(742);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(743);
			match(RP_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IndexHintList_Context extends ParserRuleContext {
		public List<IndexHint_Context> indexHint_() {
			return getRuleContexts(IndexHint_Context.class);
		}
		public IndexHint_Context indexHint_(int i) {
			return getRuleContext(IndexHint_Context.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(MySQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(MySQLStatementParser.COMMA_, i);
		}
		public IndexHintList_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexHintList_; }
	}

	public final IndexHintList_Context indexHintList_() throws RecognitionException {
		IndexHintList_Context _localctx = new IndexHintList_Context(_ctx, getState());
		enterRule(_localctx, 70, RULE_indexHintList_);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(745);
			indexHint_();
			setState(750);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(746);
					match(COMMA_);
					setState(747);
					indexHint_();
					}
					} 
				}
				setState(752);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IndexHint_Context extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(MySQLStatementParser.LP_, 0); }
		public List<IndexNameContext> indexName() {
			return getRuleContexts(IndexNameContext.class);
		}
		public IndexNameContext indexName(int i) {
			return getRuleContext(IndexNameContext.class,i);
		}
		public TerminalNode RP_() { return getToken(MySQLStatementParser.RP_, 0); }
		public TerminalNode USE() { return getToken(MySQLStatementParser.USE, 0); }
		public TerminalNode IGNORE() { return getToken(MySQLStatementParser.IGNORE, 0); }
		public TerminalNode FORCE() { return getToken(MySQLStatementParser.FORCE, 0); }
		public TerminalNode INDEX() { return getToken(MySQLStatementParser.INDEX, 0); }
		public TerminalNode KEY() { return getToken(MySQLStatementParser.KEY, 0); }
		public TerminalNode FOR() { return getToken(MySQLStatementParser.FOR, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(MySQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(MySQLStatementParser.COMMA_, i);
		}
		public TerminalNode JOIN() { return getToken(MySQLStatementParser.JOIN, 0); }
		public TerminalNode ORDER() { return getToken(MySQLStatementParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(MySQLStatementParser.BY, 0); }
		public TerminalNode GROUP() { return getToken(MySQLStatementParser.GROUP, 0); }
		public IndexHint_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexHint_; }
	}

	public final IndexHint_Context indexHint_() throws RecognitionException {
		IndexHint_Context _localctx = new IndexHint_Context(_ctx, getState());
		enterRule(_localctx, 72, RULE_indexHint_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(753);
			_la = _input.LA(1);
			if ( !(_la==FORCE || _la==IGNORE || _la==USE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(754);
			_la = _input.LA(1);
			if ( !(_la==KEY || _la==INDEX) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(763);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FOR) {
				{
				setState(755);
				match(FOR);
				setState(761);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case JOIN:
					{
					setState(756);
					match(JOIN);
					}
					break;
				case ORDER:
					{
					setState(757);
					match(ORDER);
					setState(758);
					match(BY);
					}
					break;
				case GROUP:
					{
					setState(759);
					match(GROUP);
					setState(760);
					match(BY);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			setState(765);
			match(LP_);
			setState(766);
			indexName();
			setState(771);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(767);
				match(COMMA_);
				setState(768);
				indexName();
				}
				}
				setState(773);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(774);
			match(RP_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JoinedTableContext extends ParserRuleContext {
		public TableFactorContext tableFactor() {
			return getRuleContext(TableFactorContext.class,0);
		}
		public TerminalNode JOIN() { return getToken(MySQLStatementParser.JOIN, 0); }
		public TerminalNode STRAIGHT_JOIN() { return getToken(MySQLStatementParser.STRAIGHT_JOIN, 0); }
		public JoinSpecificationContext joinSpecification() {
			return getRuleContext(JoinSpecificationContext.class,0);
		}
		public TerminalNode INNER() { return getToken(MySQLStatementParser.INNER, 0); }
		public TerminalNode CROSS() { return getToken(MySQLStatementParser.CROSS, 0); }
		public TerminalNode LEFT() { return getToken(MySQLStatementParser.LEFT, 0); }
		public TerminalNode RIGHT() { return getToken(MySQLStatementParser.RIGHT, 0); }
		public TerminalNode OUTER() { return getToken(MySQLStatementParser.OUTER, 0); }
		public TerminalNode NATURAL() { return getToken(MySQLStatementParser.NATURAL, 0); }
		public JoinedTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinedTable; }
	}

	public final JoinedTableContext joinedTable() throws RecognitionException {
		JoinedTableContext _localctx = new JoinedTableContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_joinedTable);
		int _la;
		try {
			setState(803);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CROSS:
			case INNER:
			case JOIN:
			case STRAIGHT_JOIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(781);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CROSS:
				case INNER:
				case JOIN:
					{
					setState(777);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==CROSS || _la==INNER) {
						{
						setState(776);
						_la = _input.LA(1);
						if ( !(_la==CROSS || _la==INNER) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
					}

					setState(779);
					match(JOIN);
					}
					break;
				case STRAIGHT_JOIN:
					{
					setState(780);
					match(STRAIGHT_JOIN);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(783);
				tableFactor();
				setState(785);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
				case 1:
					{
					setState(784);
					joinSpecification();
					}
					break;
				}
				}
				break;
			case LEFT:
			case RIGHT:
				enterOuterAlt(_localctx, 2);
				{
				setState(787);
				_la = _input.LA(1);
				if ( !(_la==LEFT || _la==RIGHT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(789);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(788);
					match(OUTER);
					}
				}

				setState(791);
				match(JOIN);
				setState(792);
				tableFactor();
				setState(793);
				joinSpecification();
				}
				break;
			case NATURAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(795);
				match(NATURAL);
				setState(799);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INNER:
					{
					setState(796);
					match(INNER);
					}
					break;
				case LEFT:
				case RIGHT:
					{
					setState(797);
					_la = _input.LA(1);
					if ( !(_la==LEFT || _la==RIGHT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					{
					setState(798);
					match(OUTER);
					}
					}
					break;
				case JOIN:
					break;
				default:
					break;
				}
				setState(801);
				match(JOIN);
				setState(802);
				tableFactor();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JoinSpecificationContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(MySQLStatementParser.ON, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode USING() { return getToken(MySQLStatementParser.USING, 0); }
		public ColumnNamesContext columnNames() {
			return getRuleContext(ColumnNamesContext.class,0);
		}
		public JoinSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinSpecification; }
	}

	public final JoinSpecificationContext joinSpecification() throws RecognitionException {
		JoinSpecificationContext _localctx = new JoinSpecificationContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_joinSpecification);
		try {
			setState(809);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ON:
				enterOuterAlt(_localctx, 1);
				{
				setState(805);
				match(ON);
				setState(806);
				expr(0);
				}
				break;
			case USING:
				enterOuterAlt(_localctx, 2);
				{
				setState(807);
				match(USING);
				setState(808);
				columnNames();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhereClauseContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(MySQLStatementParser.WHERE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public WhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereClause; }
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(811);
			match(WHERE);
			setState(812);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GroupByClauseContext extends ParserRuleContext {
		public TerminalNode GROUP() { return getToken(MySQLStatementParser.GROUP, 0); }
		public TerminalNode BY() { return getToken(MySQLStatementParser.BY, 0); }
		public List<OrderByItemContext> orderByItem() {
			return getRuleContexts(OrderByItemContext.class);
		}
		public OrderByItemContext orderByItem(int i) {
			return getRuleContext(OrderByItemContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(MySQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(MySQLStatementParser.COMMA_, i);
		}
		public TerminalNode WITH() { return getToken(MySQLStatementParser.WITH, 0); }
		public TerminalNode ROLLUP() { return getToken(MySQLStatementParser.ROLLUP, 0); }
		public GroupByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupByClause; }
	}

	public final GroupByClauseContext groupByClause() throws RecognitionException {
		GroupByClauseContext _localctx = new GroupByClauseContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_groupByClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(814);
			match(GROUP);
			setState(815);
			match(BY);
			setState(816);
			orderByItem();
			setState(821);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(817);
				match(COMMA_);
				setState(818);
				orderByItem();
				}
				}
				setState(823);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(826);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(824);
				match(WITH);
				setState(825);
				match(ROLLUP);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HavingClauseContext extends ParserRuleContext {
		public TerminalNode HAVING() { return getToken(MySQLStatementParser.HAVING, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public HavingClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_havingClause; }
	}

	public final HavingClauseContext havingClause() throws RecognitionException {
		HavingClauseContext _localctx = new HavingClauseContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_havingClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(828);
			match(HAVING);
			setState(829);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LimitClauseContext extends ParserRuleContext {
		public TerminalNode LIMIT() { return getToken(MySQLStatementParser.LIMIT, 0); }
		public List<RangeItem_Context> rangeItem_() {
			return getRuleContexts(RangeItem_Context.class);
		}
		public RangeItem_Context rangeItem_(int i) {
			return getRuleContext(RangeItem_Context.class,i);
		}
		public TerminalNode OFFSET() { return getToken(MySQLStatementParser.OFFSET, 0); }
		public TerminalNode COMMA_() { return getToken(MySQLStatementParser.COMMA_, 0); }
		public LimitClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limitClause; }
	}

	public final LimitClauseContext limitClause() throws RecognitionException {
		LimitClauseContext _localctx = new LimitClauseContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_limitClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(831);
			match(LIMIT);
			setState(841);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				{
				setState(832);
				rangeItem_();
				setState(835);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA_) {
					{
					setState(833);
					match(COMMA_);
					setState(834);
					rangeItem_();
					}
				}

				}
				break;
			case 2:
				{
				setState(837);
				rangeItem_();
				setState(838);
				match(OFFSET);
				setState(839);
				rangeItem_();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RangeItem_Context extends ParserRuleContext {
		public NumberLiteralsContext numberLiterals() {
			return getRuleContext(NumberLiteralsContext.class,0);
		}
		public ParameterMarkerContext parameterMarker() {
			return getRuleContext(ParameterMarkerContext.class,0);
		}
		public RangeItem_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rangeItem_; }
	}

	public final RangeItem_Context rangeItem_() throws RecognitionException {
		RangeItem_Context _localctx = new RangeItem_Context(_ctx, getState());
		enterRule(_localctx, 86, RULE_rangeItem_);
		try {
			setState(845);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER_:
				enterOuterAlt(_localctx, 1);
				{
				setState(843);
				numberLiterals();
				}
				break;
			case QUESTION_:
				enterOuterAlt(_localctx, 2);
				{
				setState(844);
				parameterMarker();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WindowClause_Context extends ParserRuleContext {
		public TerminalNode WINDOW() { return getToken(MySQLStatementParser.WINDOW, 0); }
		public List<WindowItem_Context> windowItem_() {
			return getRuleContexts(WindowItem_Context.class);
		}
		public WindowItem_Context windowItem_(int i) {
			return getRuleContext(WindowItem_Context.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(MySQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(MySQLStatementParser.COMMA_, i);
		}
		public WindowClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowClause_; }
	}

	public final WindowClause_Context windowClause_() throws RecognitionException {
		WindowClause_Context _localctx = new WindowClause_Context(_ctx, getState());
		enterRule(_localctx, 88, RULE_windowClause_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(847);
			match(WINDOW);
			setState(848);
			windowItem_();
			setState(853);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(849);
				match(COMMA_);
				setState(850);
				windowItem_();
				}
				}
				setState(855);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WindowItem_Context extends ParserRuleContext {
		public IgnoredIdentifier_Context ignoredIdentifier_() {
			return getRuleContext(IgnoredIdentifier_Context.class,0);
		}
		public TerminalNode AS() { return getToken(MySQLStatementParser.AS, 0); }
		public TerminalNode LP_() { return getToken(MySQLStatementParser.LP_, 0); }
		public WindowSpecification_Context windowSpecification_() {
			return getRuleContext(WindowSpecification_Context.class,0);
		}
		public TerminalNode RP_() { return getToken(MySQLStatementParser.RP_, 0); }
		public WindowItem_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowItem_; }
	}

	public final WindowItem_Context windowItem_() throws RecognitionException {
		WindowItem_Context _localctx = new WindowItem_Context(_ctx, getState());
		enterRule(_localctx, 90, RULE_windowItem_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(856);
			ignoredIdentifier_();
			setState(857);
			match(AS);
			setState(858);
			match(LP_);
			setState(859);
			windowSpecification_();
			setState(860);
			match(RP_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubqueryContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(MySQLStatementParser.LP_, 0); }
		public UnionClause_Context unionClause_() {
			return getRuleContext(UnionClause_Context.class,0);
		}
		public TerminalNode RP_() { return getToken(MySQLStatementParser.RP_, 0); }
		public SubqueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subquery; }
	}

	public final SubqueryContext subquery() throws RecognitionException {
		SubqueryContext _localctx = new SubqueryContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_subquery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(862);
			match(LP_);
			setState(863);
			unionClause_();
			setState(864);
			match(RP_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterMarkerContext extends ParserRuleContext {
		public TerminalNode QUESTION_() { return getToken(MySQLStatementParser.QUESTION_, 0); }
		public ParameterMarkerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterMarker; }
	}

	public final ParameterMarkerContext parameterMarker() throws RecognitionException {
		ParameterMarkerContext _localctx = new ParameterMarkerContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_parameterMarker);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(866);
			match(QUESTION_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralsContext extends ParserRuleContext {
		public StringLiteralsContext stringLiterals() {
			return getRuleContext(StringLiteralsContext.class,0);
		}
		public NumberLiteralsContext numberLiterals() {
			return getRuleContext(NumberLiteralsContext.class,0);
		}
		public DateTimeLiteralsContext dateTimeLiterals() {
			return getRuleContext(DateTimeLiteralsContext.class,0);
		}
		public HexadecimalLiteralsContext hexadecimalLiterals() {
			return getRuleContext(HexadecimalLiteralsContext.class,0);
		}
		public BitValueLiteralsContext bitValueLiterals() {
			return getRuleContext(BitValueLiteralsContext.class,0);
		}
		public BooleanLiteralsContext booleanLiterals() {
			return getRuleContext(BooleanLiteralsContext.class,0);
		}
		public NullValueLiteralsContext nullValueLiterals() {
			return getRuleContext(NullValueLiteralsContext.class,0);
		}
		public LiteralsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literals; }
	}

	public final LiteralsContext literals() throws RecognitionException {
		LiteralsContext _localctx = new LiteralsContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_literals);
		try {
			setState(875);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(868);
				stringLiterals();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(869);
				numberLiterals();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(870);
				dateTimeLiterals();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(871);
				hexadecimalLiterals();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(872);
				bitValueLiterals();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(873);
				booleanLiterals();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(874);
				nullValueLiterals();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringLiteralsContext extends ParserRuleContext {
		public TerminalNode STRING_() { return getToken(MySQLStatementParser.STRING_, 0); }
		public CharacterSetName_Context characterSetName_() {
			return getRuleContext(CharacterSetName_Context.class,0);
		}
		public CollateName_Context collateName_() {
			return getRuleContext(CollateName_Context.class,0);
		}
		public StringLiteralsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLiterals; }
	}

	public final StringLiteralsContext stringLiterals() throws RecognitionException {
		StringLiteralsContext _localctx = new StringLiteralsContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_stringLiterals);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(878);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER_) {
				{
				setState(877);
				characterSetName_();
				}
			}

			setState(880);
			match(STRING_);
			setState(882);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				{
				setState(881);
				collateName_();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberLiteralsContext extends ParserRuleContext {
		public TerminalNode NUMBER_() { return getToken(MySQLStatementParser.NUMBER_, 0); }
		public NumberLiteralsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberLiterals; }
	}

	public final NumberLiteralsContext numberLiterals() throws RecognitionException {
		NumberLiteralsContext _localctx = new NumberLiteralsContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_numberLiterals);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(884);
			match(NUMBER_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DateTimeLiteralsContext extends ParserRuleContext {
		public TerminalNode STRING_() { return getToken(MySQLStatementParser.STRING_, 0); }
		public TerminalNode DATE() { return getToken(MySQLStatementParser.DATE, 0); }
		public TerminalNode TIME() { return getToken(MySQLStatementParser.TIME, 0); }
		public TerminalNode TIMESTAMP() { return getToken(MySQLStatementParser.TIMESTAMP, 0); }
		public TerminalNode LBE_() { return getToken(MySQLStatementParser.LBE_, 0); }
		public Identifier_Context identifier_() {
			return getRuleContext(Identifier_Context.class,0);
		}
		public TerminalNode RBE_() { return getToken(MySQLStatementParser.RBE_, 0); }
		public DateTimeLiteralsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dateTimeLiterals; }
	}

	public final DateTimeLiteralsContext dateTimeLiterals() throws RecognitionException {
		DateTimeLiteralsContext _localctx = new DateTimeLiteralsContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_dateTimeLiterals);
		int _la;
		try {
			setState(893);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DATE:
			case TIME:
			case TIMESTAMP:
				enterOuterAlt(_localctx, 1);
				{
				setState(886);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DATE) | (1L << TIME) | (1L << TIMESTAMP))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(887);
				match(STRING_);
				}
				break;
			case LBE_:
				enterOuterAlt(_localctx, 2);
				{
				setState(888);
				match(LBE_);
				setState(889);
				identifier_();
				setState(890);
				match(STRING_);
				setState(891);
				match(RBE_);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HexadecimalLiteralsContext extends ParserRuleContext {
		public TerminalNode HEX_DIGIT_() { return getToken(MySQLStatementParser.HEX_DIGIT_, 0); }
		public CharacterSetName_Context characterSetName_() {
			return getRuleContext(CharacterSetName_Context.class,0);
		}
		public CollateName_Context collateName_() {
			return getRuleContext(CollateName_Context.class,0);
		}
		public HexadecimalLiteralsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hexadecimalLiterals; }
	}

	public final HexadecimalLiteralsContext hexadecimalLiterals() throws RecognitionException {
		HexadecimalLiteralsContext _localctx = new HexadecimalLiteralsContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_hexadecimalLiterals);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(896);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER_) {
				{
				setState(895);
				characterSetName_();
				}
			}

			setState(898);
			match(HEX_DIGIT_);
			setState(900);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				{
				setState(899);
				collateName_();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BitValueLiteralsContext extends ParserRuleContext {
		public TerminalNode BIT_NUM_() { return getToken(MySQLStatementParser.BIT_NUM_, 0); }
		public CharacterSetName_Context characterSetName_() {
			return getRuleContext(CharacterSetName_Context.class,0);
		}
		public CollateName_Context collateName_() {
			return getRuleContext(CollateName_Context.class,0);
		}
		public BitValueLiteralsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitValueLiterals; }
	}

	public final BitValueLiteralsContext bitValueLiterals() throws RecognitionException {
		BitValueLiteralsContext _localctx = new BitValueLiteralsContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_bitValueLiterals);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(903);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER_) {
				{
				setState(902);
				characterSetName_();
				}
			}

			setState(905);
			match(BIT_NUM_);
			setState(907);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				{
				setState(906);
				collateName_();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanLiteralsContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(MySQLStatementParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(MySQLStatementParser.FALSE, 0); }
		public BooleanLiteralsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanLiterals; }
	}

	public final BooleanLiteralsContext booleanLiterals() throws RecognitionException {
		BooleanLiteralsContext _localctx = new BooleanLiteralsContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_booleanLiterals);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(909);
			_la = _input.LA(1);
			if ( !(_la==FALSE || _la==TRUE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NullValueLiteralsContext extends ParserRuleContext {
		public TerminalNode NULL() { return getToken(MySQLStatementParser.NULL, 0); }
		public NullValueLiteralsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nullValueLiterals; }
	}

	public final NullValueLiteralsContext nullValueLiterals() throws RecognitionException {
		NullValueLiteralsContext _localctx = new NullValueLiteralsContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_nullValueLiterals);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(911);
			match(NULL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CharacterSetName_Context extends ParserRuleContext {
		public TerminalNode IDENTIFIER_() { return getToken(MySQLStatementParser.IDENTIFIER_, 0); }
		public CharacterSetName_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_characterSetName_; }
	}

	public final CharacterSetName_Context characterSetName_() throws RecognitionException {
		CharacterSetName_Context _localctx = new CharacterSetName_Context(_ctx, getState());
		enterRule(_localctx, 112, RULE_characterSetName_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(913);
			match(IDENTIFIER_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CollateName_Context extends ParserRuleContext {
		public TerminalNode IDENTIFIER_() { return getToken(MySQLStatementParser.IDENTIFIER_, 0); }
		public CollateName_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collateName_; }
	}

	public final CollateName_Context collateName_() throws RecognitionException {
		CollateName_Context _localctx = new CollateName_Context(_ctx, getState());
		enterRule(_localctx, 114, RULE_collateName_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(915);
			match(IDENTIFIER_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Identifier_Context extends ParserRuleContext {
		public TerminalNode IDENTIFIER_() { return getToken(MySQLStatementParser.IDENTIFIER_, 0); }
		public UnreservedWord_Context unreservedWord_() {
			return getRuleContext(UnreservedWord_Context.class,0);
		}
		public Identifier_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier_; }
	}

	public final Identifier_Context identifier_() throws RecognitionException {
		Identifier_Context _localctx = new Identifier_Context(_ctx, getState());
		enterRule(_localctx, 116, RULE_identifier_);
		try {
			setState(919);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER_:
				enterOuterAlt(_localctx, 1);
				{
				setState(917);
				match(IDENTIFIER_);
				}
				break;
			case ANY:
			case DATE:
			case ESCAPE:
			case OFFSET:
			case ROLLUP:
			case SOUNDS:
			case TIME:
			case TIMESTAMP:
			case UNKNOWN:
			case ALWAYS:
			case COMMIT:
			case COMMITTED:
			case CURRENT:
			case DISABLE:
			case ENABLE:
			case LEVEL:
			case NO:
			case PASSWORD:
			case PRIVILEGES:
			case ROLLBACK:
			case START:
			case TRANSACTION:
			case TRUNCATE:
			case ACCOUNT:
			case ACTION:
			case AFTER:
			case ALGORITHM:
			case AUTO_INCREMENT:
			case AVG_ROW_LENGTH:
			case BEGIN:
			case BTREE:
			case CHAIN:
			case CHARSET:
			case CHECKSUM:
			case CIPHER:
			case CLIENT:
			case COALESCE:
			case COLUMNS:
			case COLUMN_FORMAT:
			case COMMENT:
			case COMPACT:
			case COMPRESSED:
			case COMPRESSION:
			case CONNECTION:
			case CONSISTENT:
			case DATA:
			case DELAY_KEY_WRITE:
			case DISCARD:
			case DISK:
			case DUPLICATE:
			case ENCRYPTION:
			case END:
			case ENGINE:
			case EVENT:
			case EXCHANGE:
			case EXECUTE:
			case FILE:
			case FIRST:
			case FIXED:
			case FOLLOWING:
			case GLOBAL:
			case HASH:
			case IMPORT_:
			case INSERT_METHOD:
			case KEY_BLOCK_SIZE:
			case LAST:
			case LESS:
			case MAX_ROWS:
			case MEMORY:
			case MIN_ROWS:
			case MODIFY:
			case NONE:
			case PACK_KEYS:
			case PARSER:
			case PARTIAL:
			case PARTITIONING:
			case PERSIST:
			case PERSIST_ONLY:
			case PRECEDING:
			case PROCESS:
			case PROXY:
			case QUICK:
			case REBUILD:
			case REDUNDANT:
			case RELOAD:
			case REMOVE:
			case REORGANIZE:
			case REPAIR:
			case REVERSE:
			case ROW_FORMAT:
			case SAVEPOINT:
			case SESSION:
			case SHUTDOWN:
			case SIMPLE:
			case SLAVE:
			case SQL_BIG_RESULT:
			case SQL_BUFFER_RESULT:
			case SQL_CACHE:
			case SQL_NO_CACHE:
			case STATS_AUTO_RECALC:
			case STATS_PERSISTENT:
			case STATS_SAMPLE_PAGES:
			case STORAGE:
			case SUBPARTITION:
			case SUPER:
			case TABLES:
			case TABLESPACE:
			case TEMPORARY:
			case THAN:
			case UNBOUNDED:
			case UPGRADE:
			case VALIDATION:
			case VALUE:
			case VIEW:
			case WEIGHT_STRING:
			case WITHOUT:
			case VISIBLE:
			case INVISIBLE:
			case ENFORCED:
			case MICROSECOND:
			case SECOND:
			case MINUTE:
			case HOUR:
			case DAY:
			case WEEK:
			case MONTH:
			case QUARTER:
			case YEAR:
			case AGAINST:
			case LANGUAGE:
			case MODE:
			case QUERY:
			case EXPANSION:
			case BOOLEAN:
			case MAX:
			case MIN:
			case SUM:
			case COUNT:
			case AVG:
			case BIT_AND:
			case BIT_OR:
			case BIT_XOR:
			case GROUP_CONCAT:
			case JSON_ARRAYAGG:
			case JSON_OBJECTAGG:
			case STD:
			case STDDEV:
			case STDDEV_POP:
			case STDDEV_SAMP:
			case VAR_POP:
			case VAR_SAMP:
			case VARIANCE:
				enterOuterAlt(_localctx, 2);
				{
				setState(918);
				unreservedWord_();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Variable_Context extends ParserRuleContext {
		public Identifier_Context identifier_() {
			return getRuleContext(Identifier_Context.class,0);
		}
		public List<TerminalNode> AT_() { return getTokens(MySQLStatementParser.AT_); }
		public TerminalNode AT_(int i) {
			return getToken(MySQLStatementParser.AT_, i);
		}
		public TerminalNode DOT_() { return getToken(MySQLStatementParser.DOT_, 0); }
		public TerminalNode GLOBAL() { return getToken(MySQLStatementParser.GLOBAL, 0); }
		public TerminalNode PERSIST() { return getToken(MySQLStatementParser.PERSIST, 0); }
		public TerminalNode PERSIST_ONLY() { return getToken(MySQLStatementParser.PERSIST_ONLY, 0); }
		public TerminalNode SESSION() { return getToken(MySQLStatementParser.SESSION, 0); }
		public Variable_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_; }
	}

	public final Variable_Context variable_() throws RecognitionException {
		Variable_Context _localctx = new Variable_Context(_ctx, getState());
		enterRule(_localctx, 118, RULE_variable_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(923);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT_) {
				{
				setState(921);
				match(AT_);
				setState(922);
				match(AT_);
				}
			}

			setState(926);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				{
				setState(925);
				_la = _input.LA(1);
				if ( !(((((_la - 157)) & ~0x3f) == 0 && ((1L << (_la - 157)) & ((1L << (GLOBAL - 157)) | (1L << (PERSIST - 157)) | (1L << (PERSIST_ONLY - 157)))) != 0) || _la==SESSION) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			setState(929);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT_) {
				{
				setState(928);
				match(DOT_);
				}
			}

			setState(931);
			identifier_();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnreservedWord_Context extends ParserRuleContext {
		public TerminalNode ACCOUNT() { return getToken(MySQLStatementParser.ACCOUNT, 0); }
		public TerminalNode ACTION() { return getToken(MySQLStatementParser.ACTION, 0); }
		public TerminalNode AFTER() { return getToken(MySQLStatementParser.AFTER, 0); }
		public TerminalNode ALGORITHM() { return getToken(MySQLStatementParser.ALGORITHM, 0); }
		public TerminalNode ALWAYS() { return getToken(MySQLStatementParser.ALWAYS, 0); }
		public TerminalNode ANY() { return getToken(MySQLStatementParser.ANY, 0); }
		public TerminalNode AUTO_INCREMENT() { return getToken(MySQLStatementParser.AUTO_INCREMENT, 0); }
		public TerminalNode AVG_ROW_LENGTH() { return getToken(MySQLStatementParser.AVG_ROW_LENGTH, 0); }
		public TerminalNode BEGIN() { return getToken(MySQLStatementParser.BEGIN, 0); }
		public TerminalNode BTREE() { return getToken(MySQLStatementParser.BTREE, 0); }
		public TerminalNode CHAIN() { return getToken(MySQLStatementParser.CHAIN, 0); }
		public TerminalNode CHARSET() { return getToken(MySQLStatementParser.CHARSET, 0); }
		public TerminalNode CHECKSUM() { return getToken(MySQLStatementParser.CHECKSUM, 0); }
		public TerminalNode CIPHER() { return getToken(MySQLStatementParser.CIPHER, 0); }
		public TerminalNode CLIENT() { return getToken(MySQLStatementParser.CLIENT, 0); }
		public TerminalNode COALESCE() { return getToken(MySQLStatementParser.COALESCE, 0); }
		public TerminalNode COLUMNS() { return getToken(MySQLStatementParser.COLUMNS, 0); }
		public TerminalNode COLUMN_FORMAT() { return getToken(MySQLStatementParser.COLUMN_FORMAT, 0); }
		public TerminalNode COMMENT() { return getToken(MySQLStatementParser.COMMENT, 0); }
		public TerminalNode COMMIT() { return getToken(MySQLStatementParser.COMMIT, 0); }
		public TerminalNode COMMITTED() { return getToken(MySQLStatementParser.COMMITTED, 0); }
		public TerminalNode COMPACT() { return getToken(MySQLStatementParser.COMPACT, 0); }
		public TerminalNode COMPRESSED() { return getToken(MySQLStatementParser.COMPRESSED, 0); }
		public TerminalNode COMPRESSION() { return getToken(MySQLStatementParser.COMPRESSION, 0); }
		public TerminalNode CONNECTION() { return getToken(MySQLStatementParser.CONNECTION, 0); }
		public TerminalNode CONSISTENT() { return getToken(MySQLStatementParser.CONSISTENT, 0); }
		public TerminalNode CURRENT() { return getToken(MySQLStatementParser.CURRENT, 0); }
		public TerminalNode DATA() { return getToken(MySQLStatementParser.DATA, 0); }
		public TerminalNode DATE() { return getToken(MySQLStatementParser.DATE, 0); }
		public TerminalNode DELAY_KEY_WRITE() { return getToken(MySQLStatementParser.DELAY_KEY_WRITE, 0); }
		public TerminalNode DISABLE() { return getToken(MySQLStatementParser.DISABLE, 0); }
		public TerminalNode DISCARD() { return getToken(MySQLStatementParser.DISCARD, 0); }
		public TerminalNode DISK() { return getToken(MySQLStatementParser.DISK, 0); }
		public TerminalNode DUPLICATE() { return getToken(MySQLStatementParser.DUPLICATE, 0); }
		public TerminalNode ENABLE() { return getToken(MySQLStatementParser.ENABLE, 0); }
		public TerminalNode ENCRYPTION() { return getToken(MySQLStatementParser.ENCRYPTION, 0); }
		public TerminalNode ENFORCED() { return getToken(MySQLStatementParser.ENFORCED, 0); }
		public TerminalNode END() { return getToken(MySQLStatementParser.END, 0); }
		public TerminalNode ENGINE() { return getToken(MySQLStatementParser.ENGINE, 0); }
		public TerminalNode ESCAPE() { return getToken(MySQLStatementParser.ESCAPE, 0); }
		public TerminalNode EVENT() { return getToken(MySQLStatementParser.EVENT, 0); }
		public TerminalNode EXCHANGE() { return getToken(MySQLStatementParser.EXCHANGE, 0); }
		public TerminalNode EXECUTE() { return getToken(MySQLStatementParser.EXECUTE, 0); }
		public TerminalNode FILE() { return getToken(MySQLStatementParser.FILE, 0); }
		public TerminalNode FIRST() { return getToken(MySQLStatementParser.FIRST, 0); }
		public TerminalNode FIXED() { return getToken(MySQLStatementParser.FIXED, 0); }
		public TerminalNode FOLLOWING() { return getToken(MySQLStatementParser.FOLLOWING, 0); }
		public TerminalNode GLOBAL() { return getToken(MySQLStatementParser.GLOBAL, 0); }
		public TerminalNode HASH() { return getToken(MySQLStatementParser.HASH, 0); }
		public TerminalNode IMPORT_() { return getToken(MySQLStatementParser.IMPORT_, 0); }
		public TerminalNode INSERT_METHOD() { return getToken(MySQLStatementParser.INSERT_METHOD, 0); }
		public TerminalNode INVISIBLE() { return getToken(MySQLStatementParser.INVISIBLE, 0); }
		public TerminalNode KEY_BLOCK_SIZE() { return getToken(MySQLStatementParser.KEY_BLOCK_SIZE, 0); }
		public TerminalNode LAST() { return getToken(MySQLStatementParser.LAST, 0); }
		public TerminalNode LESS() { return getToken(MySQLStatementParser.LESS, 0); }
		public TerminalNode LEVEL() { return getToken(MySQLStatementParser.LEVEL, 0); }
		public TerminalNode MAX_ROWS() { return getToken(MySQLStatementParser.MAX_ROWS, 0); }
		public TerminalNode MEMORY() { return getToken(MySQLStatementParser.MEMORY, 0); }
		public TerminalNode MIN_ROWS() { return getToken(MySQLStatementParser.MIN_ROWS, 0); }
		public TerminalNode MODIFY() { return getToken(MySQLStatementParser.MODIFY, 0); }
		public TerminalNode NO() { return getToken(MySQLStatementParser.NO, 0); }
		public TerminalNode NONE() { return getToken(MySQLStatementParser.NONE, 0); }
		public TerminalNode OFFSET() { return getToken(MySQLStatementParser.OFFSET, 0); }
		public TerminalNode PACK_KEYS() { return getToken(MySQLStatementParser.PACK_KEYS, 0); }
		public TerminalNode PARSER() { return getToken(MySQLStatementParser.PARSER, 0); }
		public TerminalNode PARTIAL() { return getToken(MySQLStatementParser.PARTIAL, 0); }
		public TerminalNode PARTITIONING() { return getToken(MySQLStatementParser.PARTITIONING, 0); }
		public TerminalNode PASSWORD() { return getToken(MySQLStatementParser.PASSWORD, 0); }
		public TerminalNode PERSIST() { return getToken(MySQLStatementParser.PERSIST, 0); }
		public TerminalNode PERSIST_ONLY() { return getToken(MySQLStatementParser.PERSIST_ONLY, 0); }
		public TerminalNode PRECEDING() { return getToken(MySQLStatementParser.PRECEDING, 0); }
		public TerminalNode PRIVILEGES() { return getToken(MySQLStatementParser.PRIVILEGES, 0); }
		public TerminalNode PROCESS() { return getToken(MySQLStatementParser.PROCESS, 0); }
		public TerminalNode PROXY() { return getToken(MySQLStatementParser.PROXY, 0); }
		public TerminalNode QUICK() { return getToken(MySQLStatementParser.QUICK, 0); }
		public TerminalNode REBUILD() { return getToken(MySQLStatementParser.REBUILD, 0); }
		public TerminalNode REDUNDANT() { return getToken(MySQLStatementParser.REDUNDANT, 0); }
		public TerminalNode RELOAD() { return getToken(MySQLStatementParser.RELOAD, 0); }
		public TerminalNode REMOVE() { return getToken(MySQLStatementParser.REMOVE, 0); }
		public TerminalNode REORGANIZE() { return getToken(MySQLStatementParser.REORGANIZE, 0); }
		public TerminalNode REPAIR() { return getToken(MySQLStatementParser.REPAIR, 0); }
		public TerminalNode REVERSE() { return getToken(MySQLStatementParser.REVERSE, 0); }
		public TerminalNode ROLLBACK() { return getToken(MySQLStatementParser.ROLLBACK, 0); }
		public TerminalNode ROLLUP() { return getToken(MySQLStatementParser.ROLLUP, 0); }
		public TerminalNode ROW_FORMAT() { return getToken(MySQLStatementParser.ROW_FORMAT, 0); }
		public TerminalNode SAVEPOINT() { return getToken(MySQLStatementParser.SAVEPOINT, 0); }
		public TerminalNode SESSION() { return getToken(MySQLStatementParser.SESSION, 0); }
		public TerminalNode SHUTDOWN() { return getToken(MySQLStatementParser.SHUTDOWN, 0); }
		public TerminalNode SIMPLE() { return getToken(MySQLStatementParser.SIMPLE, 0); }
		public TerminalNode SLAVE() { return getToken(MySQLStatementParser.SLAVE, 0); }
		public TerminalNode SOUNDS() { return getToken(MySQLStatementParser.SOUNDS, 0); }
		public TerminalNode SQL_BIG_RESULT() { return getToken(MySQLStatementParser.SQL_BIG_RESULT, 0); }
		public TerminalNode SQL_BUFFER_RESULT() { return getToken(MySQLStatementParser.SQL_BUFFER_RESULT, 0); }
		public TerminalNode SQL_CACHE() { return getToken(MySQLStatementParser.SQL_CACHE, 0); }
		public TerminalNode SQL_NO_CACHE() { return getToken(MySQLStatementParser.SQL_NO_CACHE, 0); }
		public TerminalNode START() { return getToken(MySQLStatementParser.START, 0); }
		public TerminalNode STATS_AUTO_RECALC() { return getToken(MySQLStatementParser.STATS_AUTO_RECALC, 0); }
		public TerminalNode STATS_PERSISTENT() { return getToken(MySQLStatementParser.STATS_PERSISTENT, 0); }
		public TerminalNode STATS_SAMPLE_PAGES() { return getToken(MySQLStatementParser.STATS_SAMPLE_PAGES, 0); }
		public TerminalNode STORAGE() { return getToken(MySQLStatementParser.STORAGE, 0); }
		public TerminalNode SUBPARTITION() { return getToken(MySQLStatementParser.SUBPARTITION, 0); }
		public TerminalNode SUPER() { return getToken(MySQLStatementParser.SUPER, 0); }
		public TerminalNode TABLES() { return getToken(MySQLStatementParser.TABLES, 0); }
		public TerminalNode TABLESPACE() { return getToken(MySQLStatementParser.TABLESPACE, 0); }
		public TerminalNode TEMPORARY() { return getToken(MySQLStatementParser.TEMPORARY, 0); }
		public TerminalNode THAN() { return getToken(MySQLStatementParser.THAN, 0); }
		public TerminalNode TIME() { return getToken(MySQLStatementParser.TIME, 0); }
		public TerminalNode TIMESTAMP() { return getToken(MySQLStatementParser.TIMESTAMP, 0); }
		public TerminalNode TRANSACTION() { return getToken(MySQLStatementParser.TRANSACTION, 0); }
		public TerminalNode TRUNCATE() { return getToken(MySQLStatementParser.TRUNCATE, 0); }
		public TerminalNode UNBOUNDED() { return getToken(MySQLStatementParser.UNBOUNDED, 0); }
		public TerminalNode UNKNOWN() { return getToken(MySQLStatementParser.UNKNOWN, 0); }
		public TerminalNode UPGRADE() { return getToken(MySQLStatementParser.UPGRADE, 0); }
		public TerminalNode VALIDATION() { return getToken(MySQLStatementParser.VALIDATION, 0); }
		public TerminalNode VALUE() { return getToken(MySQLStatementParser.VALUE, 0); }
		public TerminalNode VIEW() { return getToken(MySQLStatementParser.VIEW, 0); }
		public TerminalNode VISIBLE() { return getToken(MySQLStatementParser.VISIBLE, 0); }
		public TerminalNode WEIGHT_STRING() { return getToken(MySQLStatementParser.WEIGHT_STRING, 0); }
		public TerminalNode WITHOUT() { return getToken(MySQLStatementParser.WITHOUT, 0); }
		public TerminalNode MICROSECOND() { return getToken(MySQLStatementParser.MICROSECOND, 0); }
		public TerminalNode SECOND() { return getToken(MySQLStatementParser.SECOND, 0); }
		public TerminalNode MINUTE() { return getToken(MySQLStatementParser.MINUTE, 0); }
		public TerminalNode HOUR() { return getToken(MySQLStatementParser.HOUR, 0); }
		public TerminalNode DAY() { return getToken(MySQLStatementParser.DAY, 0); }
		public TerminalNode WEEK() { return getToken(MySQLStatementParser.WEEK, 0); }
		public TerminalNode MONTH() { return getToken(MySQLStatementParser.MONTH, 0); }
		public TerminalNode QUARTER() { return getToken(MySQLStatementParser.QUARTER, 0); }
		public TerminalNode YEAR() { return getToken(MySQLStatementParser.YEAR, 0); }
		public TerminalNode AGAINST() { return getToken(MySQLStatementParser.AGAINST, 0); }
		public TerminalNode LANGUAGE() { return getToken(MySQLStatementParser.LANGUAGE, 0); }
		public TerminalNode MODE() { return getToken(MySQLStatementParser.MODE, 0); }
		public TerminalNode QUERY() { return getToken(MySQLStatementParser.QUERY, 0); }
		public TerminalNode EXPANSION() { return getToken(MySQLStatementParser.EXPANSION, 0); }
		public TerminalNode BOOLEAN() { return getToken(MySQLStatementParser.BOOLEAN, 0); }
		public TerminalNode MAX() { return getToken(MySQLStatementParser.MAX, 0); }
		public TerminalNode MIN() { return getToken(MySQLStatementParser.MIN, 0); }
		public TerminalNode SUM() { return getToken(MySQLStatementParser.SUM, 0); }
		public TerminalNode COUNT() { return getToken(MySQLStatementParser.COUNT, 0); }
		public TerminalNode AVG() { return getToken(MySQLStatementParser.AVG, 0); }
		public TerminalNode BIT_AND() { return getToken(MySQLStatementParser.BIT_AND, 0); }
		public TerminalNode BIT_OR() { return getToken(MySQLStatementParser.BIT_OR, 0); }
		public TerminalNode BIT_XOR() { return getToken(MySQLStatementParser.BIT_XOR, 0); }
		public TerminalNode GROUP_CONCAT() { return getToken(MySQLStatementParser.GROUP_CONCAT, 0); }
		public TerminalNode JSON_ARRAYAGG() { return getToken(MySQLStatementParser.JSON_ARRAYAGG, 0); }
		public TerminalNode JSON_OBJECTAGG() { return getToken(MySQLStatementParser.JSON_OBJECTAGG, 0); }
		public TerminalNode STD() { return getToken(MySQLStatementParser.STD, 0); }
		public TerminalNode STDDEV() { return getToken(MySQLStatementParser.STDDEV, 0); }
		public TerminalNode STDDEV_POP() { return getToken(MySQLStatementParser.STDDEV_POP, 0); }
		public TerminalNode STDDEV_SAMP() { return getToken(MySQLStatementParser.STDDEV_SAMP, 0); }
		public TerminalNode VAR_POP() { return getToken(MySQLStatementParser.VAR_POP, 0); }
		public TerminalNode VAR_SAMP() { return getToken(MySQLStatementParser.VAR_SAMP, 0); }
		public TerminalNode VARIANCE() { return getToken(MySQLStatementParser.VARIANCE, 0); }
		public UnreservedWord_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unreservedWord_; }
	}

	public final UnreservedWord_Context unreservedWord_() throws RecognitionException {
		UnreservedWord_Context _localctx = new UnreservedWord_Context(_ctx, getState());
		enterRule(_localctx, 120, RULE_unreservedWord_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(933);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ANY) | (1L << DATE) | (1L << ESCAPE) | (1L << OFFSET) | (1L << ROLLUP) | (1L << SOUNDS) | (1L << TIME) | (1L << TIMESTAMP) | (1L << UNKNOWN) | (1L << ALWAYS) | (1L << COMMIT) | (1L << COMMITTED) | (1L << CURRENT) | (1L << DISABLE) | (1L << ENABLE))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (LEVEL - 69)) | (1L << (NO - 69)) | (1L << (PASSWORD - 69)) | (1L << (PRIVILEGES - 69)) | (1L << (ROLLBACK - 69)) | (1L << (START - 69)) | (1L << (TRANSACTION - 69)) | (1L << (TRUNCATE - 69)) | (1L << (ACCOUNT - 69)) | (1L << (ACTION - 69)) | (1L << (AFTER - 69)) | (1L << (ALGORITHM - 69)) | (1L << (AUTO_INCREMENT - 69)) | (1L << (AVG_ROW_LENGTH - 69)) | (1L << (BEGIN - 69)) | (1L << (BTREE - 69)) | (1L << (CHAIN - 69)) | (1L << (CHARSET - 69)) | (1L << (CHECKSUM - 69)) | (1L << (CIPHER - 69)) | (1L << (CLIENT - 69)) | (1L << (COALESCE - 69)) | (1L << (COLUMNS - 69)) | (1L << (COLUMN_FORMAT - 69)) | (1L << (COMMENT - 69)) | (1L << (COMPACT - 69)) | (1L << (COMPRESSED - 69)) | (1L << (COMPRESSION - 69)) | (1L << (CONNECTION - 69)) | (1L << (CONSISTENT - 69)) | (1L << (DATA - 69)) | (1L << (DELAY_KEY_WRITE - 69)) | (1L << (DISCARD - 69)) | (1L << (DISK - 69)))) != 0) || ((((_la - 135)) & ~0x3f) == 0 && ((1L << (_la - 135)) & ((1L << (DUPLICATE - 135)) | (1L << (ENCRYPTION - 135)) | (1L << (END - 135)) | (1L << (ENGINE - 135)) | (1L << (EVENT - 135)) | (1L << (EXCHANGE - 135)) | (1L << (EXECUTE - 135)) | (1L << (FILE - 135)) | (1L << (FIRST - 135)) | (1L << (FIXED - 135)) | (1L << (FOLLOWING - 135)) | (1L << (GLOBAL - 135)) | (1L << (HASH - 135)) | (1L << (IMPORT_ - 135)) | (1L << (INSERT_METHOD - 135)) | (1L << (KEY_BLOCK_SIZE - 135)) | (1L << (LAST - 135)) | (1L << (LESS - 135)) | (1L << (MAX_ROWS - 135)) | (1L << (MEMORY - 135)) | (1L << (MIN_ROWS - 135)) | (1L << (MODIFY - 135)) | (1L << (NONE - 135)) | (1L << (PACK_KEYS - 135)) | (1L << (PARSER - 135)))) != 0) || ((((_la - 199)) & ~0x3f) == 0 && ((1L << (_la - 199)) & ((1L << (PARTIAL - 199)) | (1L << (PARTITIONING - 199)) | (1L << (PERSIST - 199)) | (1L << (PERSIST_ONLY - 199)) | (1L << (PRECEDING - 199)) | (1L << (PROCESS - 199)) | (1L << (PROXY - 199)) | (1L << (QUICK - 199)) | (1L << (REBUILD - 199)) | (1L << (REDUNDANT - 199)) | (1L << (RELOAD - 199)) | (1L << (REMOVE - 199)) | (1L << (REORGANIZE - 199)) | (1L << (REPAIR - 199)) | (1L << (REVERSE - 199)) | (1L << (ROW_FORMAT - 199)) | (1L << (SAVEPOINT - 199)) | (1L << (SESSION - 199)) | (1L << (SHUTDOWN - 199)) | (1L << (SIMPLE - 199)) | (1L << (SLAVE - 199)) | (1L << (SQL_BIG_RESULT - 199)) | (1L << (SQL_BUFFER_RESULT - 199)) | (1L << (SQL_CACHE - 199)) | (1L << (SQL_NO_CACHE - 199)) | (1L << (STATS_AUTO_RECALC - 199)) | (1L << (STATS_PERSISTENT - 199)) | (1L << (STATS_SAMPLE_PAGES - 199)) | (1L << (STORAGE - 199)) | (1L << (SUBPARTITION - 199)) | (1L << (SUPER - 199)) | (1L << (TABLES - 199)) | (1L << (TABLESPACE - 199)))) != 0) || ((((_la - 263)) & ~0x3f) == 0 && ((1L << (_la - 263)) & ((1L << (TEMPORARY - 263)) | (1L << (THAN - 263)) | (1L << (UNBOUNDED - 263)) | (1L << (UPGRADE - 263)) | (1L << (VALIDATION - 263)) | (1L << (VALUE - 263)) | (1L << (VIEW - 263)) | (1L << (WEIGHT_STRING - 263)) | (1L << (WITHOUT - 263)) | (1L << (VISIBLE - 263)) | (1L << (INVISIBLE - 263)) | (1L << (ENFORCED - 263)) | (1L << (MICROSECOND - 263)) | (1L << (SECOND - 263)) | (1L << (MINUTE - 263)) | (1L << (HOUR - 263)) | (1L << (DAY - 263)) | (1L << (WEEK - 263)) | (1L << (MONTH - 263)) | (1L << (QUARTER - 263)) | (1L << (YEAR - 263)) | (1L << (AGAINST - 263)) | (1L << (LANGUAGE - 263)) | (1L << (MODE - 263)) | (1L << (QUERY - 263)) | (1L << (EXPANSION - 263)) | (1L << (BOOLEAN - 263)) | (1L << (MAX - 263)) | (1L << (MIN - 263)) | (1L << (SUM - 263)) | (1L << (COUNT - 263)) | (1L << (AVG - 263)) | (1L << (BIT_AND - 263)) | (1L << (BIT_OR - 263)))) != 0) || ((((_la - 327)) & ~0x3f) == 0 && ((1L << (_la - 327)) & ((1L << (BIT_XOR - 327)) | (1L << (GROUP_CONCAT - 327)) | (1L << (JSON_ARRAYAGG - 327)) | (1L << (JSON_OBJECTAGG - 327)) | (1L << (STD - 327)) | (1L << (STDDEV - 327)) | (1L << (STDDEV_POP - 327)) | (1L << (STDDEV_SAMP - 327)) | (1L << (VAR_POP - 327)) | (1L << (VAR_SAMP - 327)) | (1L << (VARIANCE - 327)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableNameContext extends ParserRuleContext {
		public List<Identifier_Context> identifier_() {
			return getRuleContexts(Identifier_Context.class);
		}
		public Identifier_Context identifier_(int i) {
			return getRuleContext(Identifier_Context.class,i);
		}
		public TerminalNode DOT_() { return getToken(MySQLStatementParser.DOT_, 0); }
		public TableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableName; }
	}

	public final TableNameContext tableName() throws RecognitionException {
		TableNameContext _localctx = new TableNameContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_tableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(938);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				{
				setState(935);
				identifier_();
				setState(936);
				match(DOT_);
				}
				break;
			}
			setState(940);
			identifier_();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnNameContext extends ParserRuleContext {
		public List<Identifier_Context> identifier_() {
			return getRuleContexts(Identifier_Context.class);
		}
		public Identifier_Context identifier_(int i) {
			return getRuleContext(Identifier_Context.class,i);
		}
		public TerminalNode DOT_() { return getToken(MySQLStatementParser.DOT_, 0); }
		public ColumnNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnName; }
	}

	public final ColumnNameContext columnName() throws RecognitionException {
		ColumnNameContext _localctx = new ColumnNameContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_columnName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(945);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
			case 1:
				{
				setState(942);
				identifier_();
				setState(943);
				match(DOT_);
				}
				break;
			}
			setState(947);
			identifier_();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnNamesContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(MySQLStatementParser.LP_, 0); }
		public List<ColumnNameContext> columnName() {
			return getRuleContexts(ColumnNameContext.class);
		}
		public ColumnNameContext columnName(int i) {
			return getRuleContext(ColumnNameContext.class,i);
		}
		public TerminalNode RP_() { return getToken(MySQLStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(MySQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(MySQLStatementParser.COMMA_, i);
		}
		public ColumnNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnNames; }
	}

	public final ColumnNamesContext columnNames() throws RecognitionException {
		ColumnNamesContext _localctx = new ColumnNamesContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_columnNames);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(949);
			match(LP_);
			setState(950);
			columnName();
			setState(955);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(951);
				match(COMMA_);
				setState(952);
				columnName();
				}
				}
				setState(957);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(958);
			match(RP_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IndexNameContext extends ParserRuleContext {
		public Identifier_Context identifier_() {
			return getRuleContext(Identifier_Context.class,0);
		}
		public IndexNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexName; }
	}

	public final IndexNameContext indexName() throws RecognitionException {
		IndexNameContext _localctx = new IndexNameContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_indexName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(960);
			identifier_();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public NotOperator_Context notOperator_() {
			return getRuleContext(NotOperator_Context.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LP_() { return getToken(MySQLStatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(MySQLStatementParser.RP_, 0); }
		public BooleanPrimary_Context booleanPrimary_() {
			return getRuleContext(BooleanPrimary_Context.class,0);
		}
		public LogicalOperatorContext logicalOperator() {
			return getRuleContext(LogicalOperatorContext.class,0);
		}
		public TerminalNode XOR() { return getToken(MySQLStatementParser.XOR, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 130;
		enterRecursionRule(_localctx, 130, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(971);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				{
				setState(963);
				notOperator_();
				setState(964);
				expr(3);
				}
				break;
			case 2:
				{
				setState(966);
				match(LP_);
				setState(967);
				expr(0);
				setState(968);
				match(RP_);
				}
				break;
			case 3:
				{
				setState(970);
				booleanPrimary_(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(982);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(980);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(973);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(974);
						logicalOperator();
						setState(975);
						expr(6);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(977);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(978);
						match(XOR);
						setState(979);
						expr(5);
						}
						break;
					}
					} 
				}
				setState(984);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class LogicalOperatorContext extends ParserRuleContext {
		public TerminalNode OR() { return getToken(MySQLStatementParser.OR, 0); }
		public TerminalNode OR_() { return getToken(MySQLStatementParser.OR_, 0); }
		public TerminalNode AND() { return getToken(MySQLStatementParser.AND, 0); }
		public TerminalNode AND_() { return getToken(MySQLStatementParser.AND_, 0); }
		public LogicalOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOperator; }
	}

	public final LogicalOperatorContext logicalOperator() throws RecognitionException {
		LogicalOperatorContext _localctx = new LogicalOperatorContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_logicalOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(985);
			_la = _input.LA(1);
			if ( !(_la==AND || _la==OR || _la==AND_ || _la==OR_) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NotOperator_Context extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(MySQLStatementParser.NOT, 0); }
		public TerminalNode NOT_() { return getToken(MySQLStatementParser.NOT_, 0); }
		public NotOperator_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notOperator_; }
	}

	public final NotOperator_Context notOperator_() throws RecognitionException {
		NotOperator_Context _localctx = new NotOperator_Context(_ctx, getState());
		enterRule(_localctx, 134, RULE_notOperator_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(987);
			_la = _input.LA(1);
			if ( !(_la==NOT || _la==NOT_) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanPrimary_Context extends ParserRuleContext {
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public BooleanPrimary_Context booleanPrimary_() {
			return getRuleContext(BooleanPrimary_Context.class,0);
		}
		public TerminalNode IS() { return getToken(MySQLStatementParser.IS, 0); }
		public TerminalNode TRUE() { return getToken(MySQLStatementParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(MySQLStatementParser.FALSE, 0); }
		public TerminalNode UNKNOWN() { return getToken(MySQLStatementParser.UNKNOWN, 0); }
		public TerminalNode NULL() { return getToken(MySQLStatementParser.NULL, 0); }
		public TerminalNode NOT() { return getToken(MySQLStatementParser.NOT, 0); }
		public TerminalNode SAFE_EQ_() { return getToken(MySQLStatementParser.SAFE_EQ_, 0); }
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public TerminalNode ALL() { return getToken(MySQLStatementParser.ALL, 0); }
		public TerminalNode ANY() { return getToken(MySQLStatementParser.ANY, 0); }
		public BooleanPrimary_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanPrimary_; }
	}

	public final BooleanPrimary_Context booleanPrimary_() throws RecognitionException {
		return booleanPrimary_(0);
	}

	private BooleanPrimary_Context booleanPrimary_(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BooleanPrimary_Context _localctx = new BooleanPrimary_Context(_ctx, _parentState);
		BooleanPrimary_Context _prevctx = _localctx;
		int _startState = 136;
		enterRecursionRule(_localctx, 136, RULE_booleanPrimary_, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(990);
			predicate();
			}
			_ctx.stop = _input.LT(-1);
			setState(1012);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,103,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1010);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
					case 1:
						{
						_localctx = new BooleanPrimary_Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_booleanPrimary_);
						setState(992);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(993);
						match(IS);
						setState(995);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(994);
							match(NOT);
							}
						}

						setState(997);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FALSE) | (1L << NULL) | (1L << TRUE) | (1L << UNKNOWN))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					case 2:
						{
						_localctx = new BooleanPrimary_Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_booleanPrimary_);
						setState(998);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(999);
						match(SAFE_EQ_);
						setState(1000);
						predicate();
						}
						break;
					case 3:
						{
						_localctx = new BooleanPrimary_Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_booleanPrimary_);
						setState(1001);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1002);
						comparisonOperator();
						setState(1003);
						predicate();
						}
						break;
					case 4:
						{
						_localctx = new BooleanPrimary_Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_booleanPrimary_);
						setState(1005);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1006);
						comparisonOperator();
						setState(1007);
						_la = _input.LA(1);
						if ( !(_la==ALL || _la==ANY) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1008);
						subquery();
						}
						break;
					}
					} 
				}
				setState(1014);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,103,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ComparisonOperatorContext extends ParserRuleContext {
		public TerminalNode EQ_() { return getToken(MySQLStatementParser.EQ_, 0); }
		public TerminalNode GTE_() { return getToken(MySQLStatementParser.GTE_, 0); }
		public TerminalNode GT_() { return getToken(MySQLStatementParser.GT_, 0); }
		public TerminalNode LTE_() { return getToken(MySQLStatementParser.LTE_, 0); }
		public TerminalNode LT_() { return getToken(MySQLStatementParser.LT_, 0); }
		public TerminalNode NEQ_() { return getToken(MySQLStatementParser.NEQ_, 0); }
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1015);
			_la = _input.LA(1);
			if ( !(((((_la - 359)) & ~0x3f) == 0 && ((1L << (_la - 359)) & ((1L << (EQ_ - 359)) | (1L << (NEQ_ - 359)) | (1L << (GT_ - 359)) | (1L << (GTE_ - 359)) | (1L << (LT_ - 359)) | (1L << (LTE_ - 359)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PredicateContext extends ParserRuleContext {
		public List<BitExprContext> bitExpr() {
			return getRuleContexts(BitExprContext.class);
		}
		public BitExprContext bitExpr(int i) {
			return getRuleContext(BitExprContext.class,i);
		}
		public TerminalNode IN() { return getToken(MySQLStatementParser.IN, 0); }
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public TerminalNode NOT() { return getToken(MySQLStatementParser.NOT, 0); }
		public TerminalNode LP_() { return getToken(MySQLStatementParser.LP_, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RP_() { return getToken(MySQLStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(MySQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(MySQLStatementParser.COMMA_, i);
		}
		public TerminalNode BETWEEN() { return getToken(MySQLStatementParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(MySQLStatementParser.AND, 0); }
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public TerminalNode SOUNDS() { return getToken(MySQLStatementParser.SOUNDS, 0); }
		public TerminalNode LIKE() { return getToken(MySQLStatementParser.LIKE, 0); }
		public List<SimpleExprContext> simpleExpr() {
			return getRuleContexts(SimpleExprContext.class);
		}
		public SimpleExprContext simpleExpr(int i) {
			return getRuleContext(SimpleExprContext.class,i);
		}
		public TerminalNode ESCAPE() { return getToken(MySQLStatementParser.ESCAPE, 0); }
		public TerminalNode REGEXP() { return getToken(MySQLStatementParser.REGEXP, 0); }
		public TerminalNode RLIKE() { return getToken(MySQLStatementParser.RLIKE, 0); }
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_predicate);
		int _la;
		try {
			setState(1072);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1017);
				bitExpr(0);
				setState(1019);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1018);
					match(NOT);
					}
				}

				setState(1021);
				match(IN);
				setState(1022);
				subquery();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1024);
				bitExpr(0);
				setState(1026);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1025);
					match(NOT);
					}
				}

				setState(1028);
				match(IN);
				setState(1029);
				match(LP_);
				setState(1030);
				expr(0);
				setState(1035);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(1031);
					match(COMMA_);
					setState(1032);
					expr(0);
					}
					}
					setState(1037);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1038);
				match(RP_);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1040);
				bitExpr(0);
				setState(1042);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1041);
					match(NOT);
					}
				}

				setState(1044);
				match(BETWEEN);
				setState(1045);
				bitExpr(0);
				setState(1046);
				match(AND);
				setState(1047);
				predicate();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1049);
				bitExpr(0);
				setState(1050);
				match(SOUNDS);
				setState(1051);
				match(LIKE);
				setState(1052);
				bitExpr(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1054);
				bitExpr(0);
				setState(1056);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1055);
					match(NOT);
					}
				}

				setState(1058);
				match(LIKE);
				setState(1059);
				simpleExpr(0);
				setState(1062);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
				case 1:
					{
					setState(1060);
					match(ESCAPE);
					setState(1061);
					simpleExpr(0);
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1064);
				bitExpr(0);
				setState(1066);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1065);
					match(NOT);
					}
				}

				setState(1068);
				_la = _input.LA(1);
				if ( !(_la==REGEXP || _la==RLIKE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1069);
				bitExpr(0);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1071);
				bitExpr(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BitExprContext extends ParserRuleContext {
		public SimpleExprContext simpleExpr() {
			return getRuleContext(SimpleExprContext.class,0);
		}
		public List<BitExprContext> bitExpr() {
			return getRuleContexts(BitExprContext.class);
		}
		public BitExprContext bitExpr(int i) {
			return getRuleContext(BitExprContext.class,i);
		}
		public TerminalNode VERTICAL_BAR_() { return getToken(MySQLStatementParser.VERTICAL_BAR_, 0); }
		public TerminalNode AMPERSAND_() { return getToken(MySQLStatementParser.AMPERSAND_, 0); }
		public TerminalNode SIGNED_LEFT_SHIFT_() { return getToken(MySQLStatementParser.SIGNED_LEFT_SHIFT_, 0); }
		public TerminalNode SIGNED_RIGHT_SHIFT_() { return getToken(MySQLStatementParser.SIGNED_RIGHT_SHIFT_, 0); }
		public TerminalNode PLUS_() { return getToken(MySQLStatementParser.PLUS_, 0); }
		public TerminalNode MINUS_() { return getToken(MySQLStatementParser.MINUS_, 0); }
		public TerminalNode ASTERISK_() { return getToken(MySQLStatementParser.ASTERISK_, 0); }
		public TerminalNode SLASH_() { return getToken(MySQLStatementParser.SLASH_, 0); }
		public TerminalNode DIV() { return getToken(MySQLStatementParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(MySQLStatementParser.MOD, 0); }
		public TerminalNode MOD_() { return getToken(MySQLStatementParser.MOD_, 0); }
		public TerminalNode CARET_() { return getToken(MySQLStatementParser.CARET_, 0); }
		public IntervalExpression_Context intervalExpression_() {
			return getRuleContext(IntervalExpression_Context.class,0);
		}
		public BitExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitExpr; }
	}

	public final BitExprContext bitExpr() throws RecognitionException {
		return bitExpr(0);
	}

	private BitExprContext bitExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BitExprContext _localctx = new BitExprContext(_ctx, _parentState);
		BitExprContext _prevctx = _localctx;
		int _startState = 142;
		enterRecursionRule(_localctx, 142, RULE_bitExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1075);
			simpleExpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(1121);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,113,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1119);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
					case 1:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1077);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(1078);
						match(VERTICAL_BAR_);
						setState(1079);
						bitExpr(16);
						}
						break;
					case 2:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1080);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1081);
						match(AMPERSAND_);
						setState(1082);
						bitExpr(15);
						}
						break;
					case 3:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1083);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1084);
						match(SIGNED_LEFT_SHIFT_);
						setState(1085);
						bitExpr(14);
						}
						break;
					case 4:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1086);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1087);
						match(SIGNED_RIGHT_SHIFT_);
						setState(1088);
						bitExpr(13);
						}
						break;
					case 5:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1089);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1090);
						match(PLUS_);
						setState(1091);
						bitExpr(12);
						}
						break;
					case 6:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1092);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1093);
						match(MINUS_);
						setState(1094);
						bitExpr(11);
						}
						break;
					case 7:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1095);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1096);
						match(ASTERISK_);
						setState(1097);
						bitExpr(10);
						}
						break;
					case 8:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1098);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1099);
						match(SLASH_);
						setState(1100);
						bitExpr(9);
						}
						break;
					case 9:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1101);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1102);
						match(DIV);
						setState(1103);
						bitExpr(8);
						}
						break;
					case 10:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1104);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1105);
						match(MOD);
						setState(1106);
						bitExpr(7);
						}
						break;
					case 11:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1107);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1108);
						match(MOD_);
						setState(1109);
						bitExpr(6);
						}
						break;
					case 12:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1110);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1111);
						match(CARET_);
						setState(1112);
						bitExpr(5);
						}
						break;
					case 13:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1113);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1114);
						match(PLUS_);
						setState(1115);
						intervalExpression_();
						}
						break;
					case 14:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1116);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1117);
						match(MINUS_);
						setState(1118);
						intervalExpression_();
						}
						break;
					}
					} 
				}
				setState(1123);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,113,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class SimpleExprContext extends ParserRuleContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public ParameterMarkerContext parameterMarker() {
			return getRuleContext(ParameterMarkerContext.class,0);
		}
		public LiteralsContext literals() {
			return getRuleContext(LiteralsContext.class,0);
		}
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public Variable_Context variable_() {
			return getRuleContext(Variable_Context.class,0);
		}
		public List<SimpleExprContext> simpleExpr() {
			return getRuleContexts(SimpleExprContext.class);
		}
		public SimpleExprContext simpleExpr(int i) {
			return getRuleContext(SimpleExprContext.class,i);
		}
		public TerminalNode PLUS_() { return getToken(MySQLStatementParser.PLUS_, 0); }
		public TerminalNode MINUS_() { return getToken(MySQLStatementParser.MINUS_, 0); }
		public TerminalNode TILDE_() { return getToken(MySQLStatementParser.TILDE_, 0); }
		public TerminalNode NOT_() { return getToken(MySQLStatementParser.NOT_, 0); }
		public TerminalNode BINARY() { return getToken(MySQLStatementParser.BINARY, 0); }
		public TerminalNode LP_() { return getToken(MySQLStatementParser.LP_, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RP_() { return getToken(MySQLStatementParser.RP_, 0); }
		public TerminalNode ROW() { return getToken(MySQLStatementParser.ROW, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(MySQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(MySQLStatementParser.COMMA_, i);
		}
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public TerminalNode EXISTS() { return getToken(MySQLStatementParser.EXISTS, 0); }
		public TerminalNode LBE_() { return getToken(MySQLStatementParser.LBE_, 0); }
		public Identifier_Context identifier_() {
			return getRuleContext(Identifier_Context.class,0);
		}
		public TerminalNode RBE_() { return getToken(MySQLStatementParser.RBE_, 0); }
		public MatchExpression_Context matchExpression_() {
			return getRuleContext(MatchExpression_Context.class,0);
		}
		public CaseExpression_Context caseExpression_() {
			return getRuleContext(CaseExpression_Context.class,0);
		}
		public IntervalExpression_Context intervalExpression_() {
			return getRuleContext(IntervalExpression_Context.class,0);
		}
		public TerminalNode OR_() { return getToken(MySQLStatementParser.OR_, 0); }
		public TerminalNode COLLATE() { return getToken(MySQLStatementParser.COLLATE, 0); }
		public TerminalNode STRING_() { return getToken(MySQLStatementParser.STRING_, 0); }
		public SimpleExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleExpr; }
	}

	public final SimpleExprContext simpleExpr() throws RecognitionException {
		return simpleExpr(0);
	}

	private SimpleExprContext simpleExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SimpleExprContext _localctx = new SimpleExprContext(_ctx, _parentState);
		SimpleExprContext _prevctx = _localctx;
		int _startState = 144;
		enterRecursionRule(_localctx, 144, RULE_simpleExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1158);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
			case 1:
				{
				setState(1125);
				functionCall();
				}
				break;
			case 2:
				{
				setState(1126);
				parameterMarker();
				}
				break;
			case 3:
				{
				setState(1127);
				literals();
				}
				break;
			case 4:
				{
				setState(1128);
				columnName();
				}
				break;
			case 5:
				{
				setState(1129);
				variable_();
				}
				break;
			case 6:
				{
				setState(1130);
				_la = _input.LA(1);
				if ( !(_la==BINARY || ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (NOT_ - 341)) | (1L << (TILDE_ - 341)) | (1L << (PLUS_ - 341)) | (1L << (MINUS_ - 341)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1131);
				simpleExpr(7);
				}
				break;
			case 7:
				{
				setState(1133);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ROW) {
					{
					setState(1132);
					match(ROW);
					}
				}

				setState(1135);
				match(LP_);
				setState(1136);
				expr(0);
				setState(1141);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(1137);
					match(COMMA_);
					setState(1138);
					expr(0);
					}
					}
					setState(1143);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1144);
				match(RP_);
				}
				break;
			case 8:
				{
				setState(1147);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EXISTS) {
					{
					setState(1146);
					match(EXISTS);
					}
				}

				setState(1149);
				subquery();
				}
				break;
			case 9:
				{
				setState(1150);
				match(LBE_);
				setState(1151);
				identifier_();
				setState(1152);
				expr(0);
				setState(1153);
				match(RBE_);
				}
				break;
			case 10:
				{
				setState(1155);
				matchExpression_();
				}
				break;
			case 11:
				{
				setState(1156);
				caseExpression_();
				}
				break;
			case 12:
				{
				setState(1157);
				intervalExpression_();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1171);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,120,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1169);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
					case 1:
						{
						_localctx = new SimpleExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_simpleExpr);
						setState(1160);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1161);
						match(OR_);
						setState(1162);
						simpleExpr(9);
						}
						break;
					case 2:
						{
						_localctx = new SimpleExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_simpleExpr);
						setState(1163);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1164);
						match(COLLATE);
						setState(1167);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case STRING_:
							{
							setState(1165);
							match(STRING_);
							}
							break;
						case ANY:
						case DATE:
						case ESCAPE:
						case OFFSET:
						case ROLLUP:
						case SOUNDS:
						case TIME:
						case TIMESTAMP:
						case UNKNOWN:
						case ALWAYS:
						case COMMIT:
						case COMMITTED:
						case CURRENT:
						case DISABLE:
						case ENABLE:
						case LEVEL:
						case NO:
						case PASSWORD:
						case PRIVILEGES:
						case ROLLBACK:
						case START:
						case TRANSACTION:
						case TRUNCATE:
						case ACCOUNT:
						case ACTION:
						case AFTER:
						case ALGORITHM:
						case AUTO_INCREMENT:
						case AVG_ROW_LENGTH:
						case BEGIN:
						case BTREE:
						case CHAIN:
						case CHARSET:
						case CHECKSUM:
						case CIPHER:
						case CLIENT:
						case COALESCE:
						case COLUMNS:
						case COLUMN_FORMAT:
						case COMMENT:
						case COMPACT:
						case COMPRESSED:
						case COMPRESSION:
						case CONNECTION:
						case CONSISTENT:
						case DATA:
						case DELAY_KEY_WRITE:
						case DISCARD:
						case DISK:
						case DUPLICATE:
						case ENCRYPTION:
						case END:
						case ENGINE:
						case EVENT:
						case EXCHANGE:
						case EXECUTE:
						case FILE:
						case FIRST:
						case FIXED:
						case FOLLOWING:
						case GLOBAL:
						case HASH:
						case IMPORT_:
						case INSERT_METHOD:
						case KEY_BLOCK_SIZE:
						case LAST:
						case LESS:
						case MAX_ROWS:
						case MEMORY:
						case MIN_ROWS:
						case MODIFY:
						case NONE:
						case PACK_KEYS:
						case PARSER:
						case PARTIAL:
						case PARTITIONING:
						case PERSIST:
						case PERSIST_ONLY:
						case PRECEDING:
						case PROCESS:
						case PROXY:
						case QUICK:
						case REBUILD:
						case REDUNDANT:
						case RELOAD:
						case REMOVE:
						case REORGANIZE:
						case REPAIR:
						case REVERSE:
						case ROW_FORMAT:
						case SAVEPOINT:
						case SESSION:
						case SHUTDOWN:
						case SIMPLE:
						case SLAVE:
						case SQL_BIG_RESULT:
						case SQL_BUFFER_RESULT:
						case SQL_CACHE:
						case SQL_NO_CACHE:
						case STATS_AUTO_RECALC:
						case STATS_PERSISTENT:
						case STATS_SAMPLE_PAGES:
						case STORAGE:
						case SUBPARTITION:
						case SUPER:
						case TABLES:
						case TABLESPACE:
						case TEMPORARY:
						case THAN:
						case UNBOUNDED:
						case UPGRADE:
						case VALIDATION:
						case VALUE:
						case VIEW:
						case WEIGHT_STRING:
						case WITHOUT:
						case VISIBLE:
						case INVISIBLE:
						case ENFORCED:
						case MICROSECOND:
						case SECOND:
						case MINUTE:
						case HOUR:
						case DAY:
						case WEEK:
						case MONTH:
						case QUARTER:
						case YEAR:
						case AGAINST:
						case LANGUAGE:
						case MODE:
						case QUERY:
						case EXPANSION:
						case BOOLEAN:
						case MAX:
						case MIN:
						case SUM:
						case COUNT:
						case AVG:
						case BIT_AND:
						case BIT_OR:
						case BIT_XOR:
						case GROUP_CONCAT:
						case JSON_ARRAYAGG:
						case JSON_OBJECTAGG:
						case STD:
						case STDDEV:
						case STDDEV_POP:
						case STDDEV_SAMP:
						case VAR_POP:
						case VAR_SAMP:
						case VARIANCE:
						case IDENTIFIER_:
							{
							setState(1166);
							identifier_();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						break;
					}
					} 
				}
				setState(1173);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,120,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class FunctionCallContext extends ParserRuleContext {
		public AggregationFunctionContext aggregationFunction() {
			return getRuleContext(AggregationFunctionContext.class,0);
		}
		public SpecialFunction_Context specialFunction_() {
			return getRuleContext(SpecialFunction_Context.class,0);
		}
		public RegularFunction_Context regularFunction_() {
			return getRuleContext(RegularFunction_Context.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_functionCall);
		try {
			setState(1177);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1174);
				aggregationFunction();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1175);
				specialFunction_();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1176);
				regularFunction_();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AggregationFunctionContext extends ParserRuleContext {
		public AggregationFunctionName_Context aggregationFunctionName_() {
			return getRuleContext(AggregationFunctionName_Context.class,0);
		}
		public TerminalNode LP_() { return getToken(MySQLStatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(MySQLStatementParser.RP_, 0); }
		public DistinctContext distinct() {
			return getRuleContext(DistinctContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ASTERISK_() { return getToken(MySQLStatementParser.ASTERISK_, 0); }
		public OverClause_Context overClause_() {
			return getRuleContext(OverClause_Context.class,0);
		}
		public List<TerminalNode> COMMA_() { return getTokens(MySQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(MySQLStatementParser.COMMA_, i);
		}
		public AggregationFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregationFunction; }
	}

	public final AggregationFunctionContext aggregationFunction() throws RecognitionException {
		AggregationFunctionContext _localctx = new AggregationFunctionContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_aggregationFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1179);
			aggregationFunctionName_();
			setState(1180);
			match(LP_);
			setState(1182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DISTINCT) {
				{
				setState(1181);
				distinct();
				}
			}

			setState(1193);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ANY:
			case BINARY:
			case DATE:
			case ESCAPE:
			case EXISTS:
			case FALSE:
			case NOT:
			case NULL:
			case OFFSET:
			case ROLLUP:
			case ROW:
			case SOUNDS:
			case TIME:
			case TIMESTAMP:
			case TRUE:
			case UNKNOWN:
			case ALWAYS:
			case COMMIT:
			case COMMITTED:
			case CURRENT:
			case DISABLE:
			case ENABLE:
			case LEVEL:
			case NO:
			case PASSWORD:
			case PRIVILEGES:
			case ROLLBACK:
			case START:
			case TRANSACTION:
			case TRUNCATE:
			case ACCOUNT:
			case ACTION:
			case AFTER:
			case ALGORITHM:
			case AUTO_INCREMENT:
			case AVG_ROW_LENGTH:
			case BEGIN:
			case BTREE:
			case CASE:
			case CAST:
			case CHAIN:
			case CHAR:
			case CHARSET:
			case CHECKSUM:
			case CIPHER:
			case CLIENT:
			case COALESCE:
			case COLUMNS:
			case COLUMN_FORMAT:
			case COMMENT:
			case COMPACT:
			case COMPRESSED:
			case COMPRESSION:
			case CONNECTION:
			case CONSISTENT:
			case CONVERT:
			case CURRENT_TIMESTAMP:
			case DATA:
			case DELAY_KEY_WRITE:
			case DISCARD:
			case DISK:
			case DUPLICATE:
			case ENCRYPTION:
			case END:
			case ENGINE:
			case EVENT:
			case EXCHANGE:
			case EXECUTE:
			case EXTRACT:
			case FILE:
			case FIRST:
			case FIXED:
			case FOLLOWING:
			case GLOBAL:
			case HASH:
			case IF:
			case IMPORT_:
			case INSERT_METHOD:
			case INTERVAL:
			case KEY_BLOCK_SIZE:
			case LAST:
			case LESS:
			case LOCALTIME:
			case LOCALTIMESTAMP:
			case MATCH:
			case MAX_ROWS:
			case MEMORY:
			case MIN_ROWS:
			case MODIFY:
			case NONE:
			case NOW:
			case PACK_KEYS:
			case PARSER:
			case PARTIAL:
			case PARTITIONING:
			case PERSIST:
			case PERSIST_ONLY:
			case POSITION:
			case PRECEDING:
			case PROCESS:
			case PROXY:
			case QUICK:
			case REBUILD:
			case REDUNDANT:
			case RELOAD:
			case REMOVE:
			case REORGANIZE:
			case REPAIR:
			case REPLACE:
			case REVERSE:
			case ROW_FORMAT:
			case SAVEPOINT:
			case SESSION:
			case SHUTDOWN:
			case SIMPLE:
			case SLAVE:
			case SQL_BIG_RESULT:
			case SQL_BUFFER_RESULT:
			case SQL_CACHE:
			case SQL_NO_CACHE:
			case STATS_AUTO_RECALC:
			case STATS_PERSISTENT:
			case STATS_SAMPLE_PAGES:
			case STORAGE:
			case SUBPARTITION:
			case SUPER:
			case SUBSTR:
			case SUBSTRING:
			case TABLES:
			case TABLESPACE:
			case TEMPORARY:
			case THAN:
			case TRIM:
			case UNBOUNDED:
			case UPGRADE:
			case VALIDATION:
			case VALUE:
			case VIEW:
			case WEIGHT_STRING:
			case WITHOUT:
			case VISIBLE:
			case INVISIBLE:
			case ENFORCED:
			case MICROSECOND:
			case SECOND:
			case MINUTE:
			case HOUR:
			case DAY:
			case WEEK:
			case MONTH:
			case QUARTER:
			case YEAR:
			case AGAINST:
			case LANGUAGE:
			case MODE:
			case QUERY:
			case EXPANSION:
			case BOOLEAN:
			case MAX:
			case MIN:
			case SUM:
			case COUNT:
			case AVG:
			case BIT_AND:
			case BIT_OR:
			case BIT_XOR:
			case GROUP_CONCAT:
			case JSON_ARRAYAGG:
			case JSON_OBJECTAGG:
			case STD:
			case STDDEV:
			case STDDEV_POP:
			case STDDEV_SAMP:
			case VAR_POP:
			case VAR_SAMP:
			case VARIANCE:
			case NOT_:
			case TILDE_:
			case PLUS_:
			case MINUS_:
			case DOT_:
			case LP_:
			case LBE_:
			case QUESTION_:
			case AT_:
			case IDENTIFIER_:
			case STRING_:
			case NUMBER_:
			case HEX_DIGIT_:
			case BIT_NUM_:
				{
				setState(1184);
				expr(0);
				setState(1189);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(1185);
					match(COMMA_);
					setState(1186);
					expr(0);
					}
					}
					setState(1191);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case ASTERISK_:
				{
				setState(1192);
				match(ASTERISK_);
				}
				break;
			case RP_:
				break;
			default:
				break;
			}
			setState(1195);
			match(RP_);
			setState(1197);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
			case 1:
				{
				setState(1196);
				overClause_();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AggregationFunctionName_Context extends ParserRuleContext {
		public TerminalNode MAX() { return getToken(MySQLStatementParser.MAX, 0); }
		public TerminalNode MIN() { return getToken(MySQLStatementParser.MIN, 0); }
		public TerminalNode SUM() { return getToken(MySQLStatementParser.SUM, 0); }
		public TerminalNode COUNT() { return getToken(MySQLStatementParser.COUNT, 0); }
		public TerminalNode AVG() { return getToken(MySQLStatementParser.AVG, 0); }
		public TerminalNode BIT_AND() { return getToken(MySQLStatementParser.BIT_AND, 0); }
		public TerminalNode BIT_OR() { return getToken(MySQLStatementParser.BIT_OR, 0); }
		public TerminalNode BIT_XOR() { return getToken(MySQLStatementParser.BIT_XOR, 0); }
		public TerminalNode JSON_ARRAYAGG() { return getToken(MySQLStatementParser.JSON_ARRAYAGG, 0); }
		public TerminalNode JSON_OBJECTAGG() { return getToken(MySQLStatementParser.JSON_OBJECTAGG, 0); }
		public TerminalNode STD() { return getToken(MySQLStatementParser.STD, 0); }
		public TerminalNode STDDEV() { return getToken(MySQLStatementParser.STDDEV, 0); }
		public TerminalNode STDDEV_POP() { return getToken(MySQLStatementParser.STDDEV_POP, 0); }
		public TerminalNode STDDEV_SAMP() { return getToken(MySQLStatementParser.STDDEV_SAMP, 0); }
		public TerminalNode VAR_POP() { return getToken(MySQLStatementParser.VAR_POP, 0); }
		public TerminalNode VAR_SAMP() { return getToken(MySQLStatementParser.VAR_SAMP, 0); }
		public TerminalNode VARIANCE() { return getToken(MySQLStatementParser.VARIANCE, 0); }
		public AggregationFunctionName_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregationFunctionName_; }
	}

	public final AggregationFunctionName_Context aggregationFunctionName_() throws RecognitionException {
		AggregationFunctionName_Context _localctx = new AggregationFunctionName_Context(_ctx, getState());
		enterRule(_localctx, 150, RULE_aggregationFunctionName_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1199);
			_la = _input.LA(1);
			if ( !(((((_la - 320)) & ~0x3f) == 0 && ((1L << (_la - 320)) & ((1L << (MAX - 320)) | (1L << (MIN - 320)) | (1L << (SUM - 320)) | (1L << (COUNT - 320)) | (1L << (AVG - 320)) | (1L << (BIT_AND - 320)) | (1L << (BIT_OR - 320)) | (1L << (BIT_XOR - 320)) | (1L << (JSON_ARRAYAGG - 320)) | (1L << (JSON_OBJECTAGG - 320)) | (1L << (STD - 320)) | (1L << (STDDEV - 320)) | (1L << (STDDEV_POP - 320)) | (1L << (STDDEV_SAMP - 320)) | (1L << (VAR_POP - 320)) | (1L << (VAR_SAMP - 320)) | (1L << (VARIANCE - 320)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DistinctContext extends ParserRuleContext {
		public TerminalNode DISTINCT() { return getToken(MySQLStatementParser.DISTINCT, 0); }
		public DistinctContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_distinct; }
	}

	public final DistinctContext distinct() throws RecognitionException {
		DistinctContext _localctx = new DistinctContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_distinct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1201);
			match(DISTINCT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OverClause_Context extends ParserRuleContext {
		public TerminalNode OVER() { return getToken(MySQLStatementParser.OVER, 0); }
		public TerminalNode LP_() { return getToken(MySQLStatementParser.LP_, 0); }
		public WindowSpecification_Context windowSpecification_() {
			return getRuleContext(WindowSpecification_Context.class,0);
		}
		public TerminalNode RP_() { return getToken(MySQLStatementParser.RP_, 0); }
		public Identifier_Context identifier_() {
			return getRuleContext(Identifier_Context.class,0);
		}
		public OverClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_overClause_; }
	}

	public final OverClause_Context overClause_() throws RecognitionException {
		OverClause_Context _localctx = new OverClause_Context(_ctx, getState());
		enterRule(_localctx, 154, RULE_overClause_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1203);
			match(OVER);
			setState(1209);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LP_:
				{
				setState(1204);
				match(LP_);
				setState(1205);
				windowSpecification_();
				setState(1206);
				match(RP_);
				}
				break;
			case ANY:
			case DATE:
			case ESCAPE:
			case OFFSET:
			case ROLLUP:
			case SOUNDS:
			case TIME:
			case TIMESTAMP:
			case UNKNOWN:
			case ALWAYS:
			case COMMIT:
			case COMMITTED:
			case CURRENT:
			case DISABLE:
			case ENABLE:
			case LEVEL:
			case NO:
			case PASSWORD:
			case PRIVILEGES:
			case ROLLBACK:
			case START:
			case TRANSACTION:
			case TRUNCATE:
			case ACCOUNT:
			case ACTION:
			case AFTER:
			case ALGORITHM:
			case AUTO_INCREMENT:
			case AVG_ROW_LENGTH:
			case BEGIN:
			case BTREE:
			case CHAIN:
			case CHARSET:
			case CHECKSUM:
			case CIPHER:
			case CLIENT:
			case COALESCE:
			case COLUMNS:
			case COLUMN_FORMAT:
			case COMMENT:
			case COMPACT:
			case COMPRESSED:
			case COMPRESSION:
			case CONNECTION:
			case CONSISTENT:
			case DATA:
			case DELAY_KEY_WRITE:
			case DISCARD:
			case DISK:
			case DUPLICATE:
			case ENCRYPTION:
			case END:
			case ENGINE:
			case EVENT:
			case EXCHANGE:
			case EXECUTE:
			case FILE:
			case FIRST:
			case FIXED:
			case FOLLOWING:
			case GLOBAL:
			case HASH:
			case IMPORT_:
			case INSERT_METHOD:
			case KEY_BLOCK_SIZE:
			case LAST:
			case LESS:
			case MAX_ROWS:
			case MEMORY:
			case MIN_ROWS:
			case MODIFY:
			case NONE:
			case PACK_KEYS:
			case PARSER:
			case PARTIAL:
			case PARTITIONING:
			case PERSIST:
			case PERSIST_ONLY:
			case PRECEDING:
			case PROCESS:
			case PROXY:
			case QUICK:
			case REBUILD:
			case REDUNDANT:
			case RELOAD:
			case REMOVE:
			case REORGANIZE:
			case REPAIR:
			case REVERSE:
			case ROW_FORMAT:
			case SAVEPOINT:
			case SESSION:
			case SHUTDOWN:
			case SIMPLE:
			case SLAVE:
			case SQL_BIG_RESULT:
			case SQL_BUFFER_RESULT:
			case SQL_CACHE:
			case SQL_NO_CACHE:
			case STATS_AUTO_RECALC:
			case STATS_PERSISTENT:
			case STATS_SAMPLE_PAGES:
			case STORAGE:
			case SUBPARTITION:
			case SUPER:
			case TABLES:
			case TABLESPACE:
			case TEMPORARY:
			case THAN:
			case UNBOUNDED:
			case UPGRADE:
			case VALIDATION:
			case VALUE:
			case VIEW:
			case WEIGHT_STRING:
			case WITHOUT:
			case VISIBLE:
			case INVISIBLE:
			case ENFORCED:
			case MICROSECOND:
			case SECOND:
			case MINUTE:
			case HOUR:
			case DAY:
			case WEEK:
			case MONTH:
			case QUARTER:
			case YEAR:
			case AGAINST:
			case LANGUAGE:
			case MODE:
			case QUERY:
			case EXPANSION:
			case BOOLEAN:
			case MAX:
			case MIN:
			case SUM:
			case COUNT:
			case AVG:
			case BIT_AND:
			case BIT_OR:
			case BIT_XOR:
			case GROUP_CONCAT:
			case JSON_ARRAYAGG:
			case JSON_OBJECTAGG:
			case STD:
			case STDDEV:
			case STDDEV_POP:
			case STDDEV_SAMP:
			case VAR_POP:
			case VAR_SAMP:
			case VARIANCE:
			case IDENTIFIER_:
				{
				setState(1208);
				identifier_();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WindowSpecification_Context extends ParserRuleContext {
		public Identifier_Context identifier_() {
			return getRuleContext(Identifier_Context.class,0);
		}
		public PartitionClause_Context partitionClause_() {
			return getRuleContext(PartitionClause_Context.class,0);
		}
		public OrderByClauseContext orderByClause() {
			return getRuleContext(OrderByClauseContext.class,0);
		}
		public FrameClause_Context frameClause_() {
			return getRuleContext(FrameClause_Context.class,0);
		}
		public WindowSpecification_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowSpecification_; }
	}

	public final WindowSpecification_Context windowSpecification_() throws RecognitionException {
		WindowSpecification_Context _localctx = new WindowSpecification_Context(_ctx, getState());
		enterRule(_localctx, 156, RULE_windowSpecification_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1212);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ANY) | (1L << DATE) | (1L << ESCAPE) | (1L << OFFSET) | (1L << ROLLUP) | (1L << SOUNDS) | (1L << TIME) | (1L << TIMESTAMP) | (1L << UNKNOWN) | (1L << ALWAYS) | (1L << COMMIT) | (1L << COMMITTED) | (1L << CURRENT) | (1L << DISABLE) | (1L << ENABLE))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (LEVEL - 69)) | (1L << (NO - 69)) | (1L << (PASSWORD - 69)) | (1L << (PRIVILEGES - 69)) | (1L << (ROLLBACK - 69)) | (1L << (START - 69)) | (1L << (TRANSACTION - 69)) | (1L << (TRUNCATE - 69)) | (1L << (ACCOUNT - 69)) | (1L << (ACTION - 69)) | (1L << (AFTER - 69)) | (1L << (ALGORITHM - 69)) | (1L << (AUTO_INCREMENT - 69)) | (1L << (AVG_ROW_LENGTH - 69)) | (1L << (BEGIN - 69)) | (1L << (BTREE - 69)) | (1L << (CHAIN - 69)) | (1L << (CHARSET - 69)) | (1L << (CHECKSUM - 69)) | (1L << (CIPHER - 69)) | (1L << (CLIENT - 69)) | (1L << (COALESCE - 69)) | (1L << (COLUMNS - 69)) | (1L << (COLUMN_FORMAT - 69)) | (1L << (COMMENT - 69)) | (1L << (COMPACT - 69)) | (1L << (COMPRESSED - 69)) | (1L << (COMPRESSION - 69)) | (1L << (CONNECTION - 69)) | (1L << (CONSISTENT - 69)) | (1L << (DATA - 69)) | (1L << (DELAY_KEY_WRITE - 69)) | (1L << (DISCARD - 69)) | (1L << (DISK - 69)))) != 0) || ((((_la - 135)) & ~0x3f) == 0 && ((1L << (_la - 135)) & ((1L << (DUPLICATE - 135)) | (1L << (ENCRYPTION - 135)) | (1L << (END - 135)) | (1L << (ENGINE - 135)) | (1L << (EVENT - 135)) | (1L << (EXCHANGE - 135)) | (1L << (EXECUTE - 135)) | (1L << (FILE - 135)) | (1L << (FIRST - 135)) | (1L << (FIXED - 135)) | (1L << (FOLLOWING - 135)) | (1L << (GLOBAL - 135)) | (1L << (HASH - 135)) | (1L << (IMPORT_ - 135)) | (1L << (INSERT_METHOD - 135)) | (1L << (KEY_BLOCK_SIZE - 135)) | (1L << (LAST - 135)) | (1L << (LESS - 135)) | (1L << (MAX_ROWS - 135)) | (1L << (MEMORY - 135)) | (1L << (MIN_ROWS - 135)) | (1L << (MODIFY - 135)) | (1L << (NONE - 135)) | (1L << (PACK_KEYS - 135)) | (1L << (PARSER - 135)))) != 0) || ((((_la - 199)) & ~0x3f) == 0 && ((1L << (_la - 199)) & ((1L << (PARTIAL - 199)) | (1L << (PARTITIONING - 199)) | (1L << (PERSIST - 199)) | (1L << (PERSIST_ONLY - 199)) | (1L << (PRECEDING - 199)) | (1L << (PROCESS - 199)) | (1L << (PROXY - 199)) | (1L << (QUICK - 199)) | (1L << (REBUILD - 199)) | (1L << (REDUNDANT - 199)) | (1L << (RELOAD - 199)) | (1L << (REMOVE - 199)) | (1L << (REORGANIZE - 199)) | (1L << (REPAIR - 199)) | (1L << (REVERSE - 199)) | (1L << (ROW_FORMAT - 199)) | (1L << (SAVEPOINT - 199)) | (1L << (SESSION - 199)) | (1L << (SHUTDOWN - 199)) | (1L << (SIMPLE - 199)) | (1L << (SLAVE - 199)) | (1L << (SQL_BIG_RESULT - 199)) | (1L << (SQL_BUFFER_RESULT - 199)) | (1L << (SQL_CACHE - 199)) | (1L << (SQL_NO_CACHE - 199)) | (1L << (STATS_AUTO_RECALC - 199)) | (1L << (STATS_PERSISTENT - 199)) | (1L << (STATS_SAMPLE_PAGES - 199)) | (1L << (STORAGE - 199)) | (1L << (SUBPARTITION - 199)) | (1L << (SUPER - 199)) | (1L << (TABLES - 199)) | (1L << (TABLESPACE - 199)))) != 0) || ((((_la - 263)) & ~0x3f) == 0 && ((1L << (_la - 263)) & ((1L << (TEMPORARY - 263)) | (1L << (THAN - 263)) | (1L << (UNBOUNDED - 263)) | (1L << (UPGRADE - 263)) | (1L << (VALIDATION - 263)) | (1L << (VALUE - 263)) | (1L << (VIEW - 263)) | (1L << (WEIGHT_STRING - 263)) | (1L << (WITHOUT - 263)) | (1L << (VISIBLE - 263)) | (1L << (INVISIBLE - 263)) | (1L << (ENFORCED - 263)) | (1L << (MICROSECOND - 263)) | (1L << (SECOND - 263)) | (1L << (MINUTE - 263)) | (1L << (HOUR - 263)) | (1L << (DAY - 263)) | (1L << (WEEK - 263)) | (1L << (MONTH - 263)) | (1L << (QUARTER - 263)) | (1L << (YEAR - 263)) | (1L << (AGAINST - 263)) | (1L << (LANGUAGE - 263)) | (1L << (MODE - 263)) | (1L << (QUERY - 263)) | (1L << (EXPANSION - 263)) | (1L << (BOOLEAN - 263)) | (1L << (MAX - 263)) | (1L << (MIN - 263)) | (1L << (SUM - 263)) | (1L << (COUNT - 263)) | (1L << (AVG - 263)) | (1L << (BIT_AND - 263)) | (1L << (BIT_OR - 263)))) != 0) || ((((_la - 327)) & ~0x3f) == 0 && ((1L << (_la - 327)) & ((1L << (BIT_XOR - 327)) | (1L << (GROUP_CONCAT - 327)) | (1L << (JSON_ARRAYAGG - 327)) | (1L << (JSON_OBJECTAGG - 327)) | (1L << (STD - 327)) | (1L << (STDDEV - 327)) | (1L << (STDDEV_POP - 327)) | (1L << (STDDEV_SAMP - 327)) | (1L << (VAR_POP - 327)) | (1L << (VAR_SAMP - 327)) | (1L << (VARIANCE - 327)) | (1L << (IDENTIFIER_ - 327)))) != 0)) {
				{
				setState(1211);
				identifier_();
				}
			}

			setState(1215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PARTITION) {
				{
				setState(1214);
				partitionClause_();
				}
			}

			setState(1218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(1217);
				orderByClause();
				}
			}

			setState(1221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ROWS || _la==RANGE) {
				{
				setState(1220);
				frameClause_();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PartitionClause_Context extends ParserRuleContext {
		public TerminalNode PARTITION() { return getToken(MySQLStatementParser.PARTITION, 0); }
		public TerminalNode BY() { return getToken(MySQLStatementParser.BY, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(MySQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(MySQLStatementParser.COMMA_, i);
		}
		public PartitionClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionClause_; }
	}

	public final PartitionClause_Context partitionClause_() throws RecognitionException {
		PartitionClause_Context _localctx = new PartitionClause_Context(_ctx, getState());
		enterRule(_localctx, 158, RULE_partitionClause_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1223);
			match(PARTITION);
			setState(1224);
			match(BY);
			setState(1225);
			expr(0);
			setState(1230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(1226);
				match(COMMA_);
				setState(1227);
				expr(0);
				}
				}
				setState(1232);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FrameClause_Context extends ParserRuleContext {
		public TerminalNode ROWS() { return getToken(MySQLStatementParser.ROWS, 0); }
		public TerminalNode RANGE() { return getToken(MySQLStatementParser.RANGE, 0); }
		public FrameStart_Context frameStart_() {
			return getRuleContext(FrameStart_Context.class,0);
		}
		public FrameBetween_Context frameBetween_() {
			return getRuleContext(FrameBetween_Context.class,0);
		}
		public FrameClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frameClause_; }
	}

	public final FrameClause_Context frameClause_() throws RecognitionException {
		FrameClause_Context _localctx = new FrameClause_Context(_ctx, getState());
		enterRule(_localctx, 160, RULE_frameClause_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1233);
			_la = _input.LA(1);
			if ( !(_la==ROWS || _la==RANGE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1236);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ANY:
			case BINARY:
			case DATE:
			case ESCAPE:
			case EXISTS:
			case FALSE:
			case NOT:
			case NULL:
			case OFFSET:
			case ROLLUP:
			case ROW:
			case SOUNDS:
			case TIME:
			case TIMESTAMP:
			case TRUE:
			case UNKNOWN:
			case ALWAYS:
			case COMMIT:
			case COMMITTED:
			case CURRENT:
			case DISABLE:
			case ENABLE:
			case LEVEL:
			case NO:
			case PASSWORD:
			case PRIVILEGES:
			case ROLLBACK:
			case START:
			case TRANSACTION:
			case TRUNCATE:
			case ACCOUNT:
			case ACTION:
			case AFTER:
			case ALGORITHM:
			case AUTO_INCREMENT:
			case AVG_ROW_LENGTH:
			case BEGIN:
			case BTREE:
			case CASE:
			case CAST:
			case CHAIN:
			case CHAR:
			case CHARSET:
			case CHECKSUM:
			case CIPHER:
			case CLIENT:
			case COALESCE:
			case COLUMNS:
			case COLUMN_FORMAT:
			case COMMENT:
			case COMPACT:
			case COMPRESSED:
			case COMPRESSION:
			case CONNECTION:
			case CONSISTENT:
			case CONVERT:
			case CURRENT_TIMESTAMP:
			case DATA:
			case DELAY_KEY_WRITE:
			case DISCARD:
			case DISK:
			case DUPLICATE:
			case ENCRYPTION:
			case END:
			case ENGINE:
			case EVENT:
			case EXCHANGE:
			case EXECUTE:
			case EXTRACT:
			case FILE:
			case FIRST:
			case FIXED:
			case FOLLOWING:
			case GLOBAL:
			case HASH:
			case IF:
			case IMPORT_:
			case INSERT_METHOD:
			case INTERVAL:
			case KEY_BLOCK_SIZE:
			case LAST:
			case LESS:
			case LOCALTIME:
			case LOCALTIMESTAMP:
			case MATCH:
			case MAX_ROWS:
			case MEMORY:
			case MIN_ROWS:
			case MODIFY:
			case NONE:
			case NOW:
			case PACK_KEYS:
			case PARSER:
			case PARTIAL:
			case PARTITIONING:
			case PERSIST:
			case PERSIST_ONLY:
			case POSITION:
			case PRECEDING:
			case PROCESS:
			case PROXY:
			case QUICK:
			case REBUILD:
			case REDUNDANT:
			case RELOAD:
			case REMOVE:
			case REORGANIZE:
			case REPAIR:
			case REPLACE:
			case REVERSE:
			case ROW_FORMAT:
			case SAVEPOINT:
			case SESSION:
			case SHUTDOWN:
			case SIMPLE:
			case SLAVE:
			case SQL_BIG_RESULT:
			case SQL_BUFFER_RESULT:
			case SQL_CACHE:
			case SQL_NO_CACHE:
			case STATS_AUTO_RECALC:
			case STATS_PERSISTENT:
			case STATS_SAMPLE_PAGES:
			case STORAGE:
			case SUBPARTITION:
			case SUPER:
			case SUBSTR:
			case SUBSTRING:
			case TABLES:
			case TABLESPACE:
			case TEMPORARY:
			case THAN:
			case TRIM:
			case UNBOUNDED:
			case UPGRADE:
			case VALIDATION:
			case VALUE:
			case VIEW:
			case WEIGHT_STRING:
			case WITHOUT:
			case VISIBLE:
			case INVISIBLE:
			case ENFORCED:
			case MICROSECOND:
			case SECOND:
			case MINUTE:
			case HOUR:
			case DAY:
			case WEEK:
			case MONTH:
			case QUARTER:
			case YEAR:
			case AGAINST:
			case LANGUAGE:
			case MODE:
			case QUERY:
			case EXPANSION:
			case BOOLEAN:
			case MAX:
			case MIN:
			case SUM:
			case COUNT:
			case AVG:
			case BIT_AND:
			case BIT_OR:
			case BIT_XOR:
			case GROUP_CONCAT:
			case JSON_ARRAYAGG:
			case JSON_OBJECTAGG:
			case STD:
			case STDDEV:
			case STDDEV_POP:
			case STDDEV_SAMP:
			case VAR_POP:
			case VAR_SAMP:
			case VARIANCE:
			case NOT_:
			case TILDE_:
			case PLUS_:
			case MINUS_:
			case DOT_:
			case LP_:
			case LBE_:
			case QUESTION_:
			case AT_:
			case IDENTIFIER_:
			case STRING_:
			case NUMBER_:
			case HEX_DIGIT_:
			case BIT_NUM_:
				{
				setState(1234);
				frameStart_();
				}
				break;
			case BETWEEN:
				{
				setState(1235);
				frameBetween_();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FrameStart_Context extends ParserRuleContext {
		public TerminalNode CURRENT() { return getToken(MySQLStatementParser.CURRENT, 0); }
		public TerminalNode ROW() { return getToken(MySQLStatementParser.ROW, 0); }
		public TerminalNode UNBOUNDED() { return getToken(MySQLStatementParser.UNBOUNDED, 0); }
		public TerminalNode PRECEDING() { return getToken(MySQLStatementParser.PRECEDING, 0); }
		public TerminalNode FOLLOWING() { return getToken(MySQLStatementParser.FOLLOWING, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FrameStart_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frameStart_; }
	}

	public final FrameStart_Context frameStart_() throws RecognitionException {
		FrameStart_Context _localctx = new FrameStart_Context(_ctx, getState());
		enterRule(_localctx, 162, RULE_frameStart_);
		try {
			setState(1250);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1238);
				match(CURRENT);
				setState(1239);
				match(ROW);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1240);
				match(UNBOUNDED);
				setState(1241);
				match(PRECEDING);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1242);
				match(UNBOUNDED);
				setState(1243);
				match(FOLLOWING);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1244);
				expr(0);
				setState(1245);
				match(PRECEDING);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1247);
				expr(0);
				setState(1248);
				match(FOLLOWING);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FrameEnd_Context extends ParserRuleContext {
		public FrameStart_Context frameStart_() {
			return getRuleContext(FrameStart_Context.class,0);
		}
		public FrameEnd_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frameEnd_; }
	}

	public final FrameEnd_Context frameEnd_() throws RecognitionException {
		FrameEnd_Context _localctx = new FrameEnd_Context(_ctx, getState());
		enterRule(_localctx, 164, RULE_frameEnd_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1252);
			frameStart_();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FrameBetween_Context extends ParserRuleContext {
		public TerminalNode BETWEEN() { return getToken(MySQLStatementParser.BETWEEN, 0); }
		public FrameStart_Context frameStart_() {
			return getRuleContext(FrameStart_Context.class,0);
		}
		public TerminalNode AND() { return getToken(MySQLStatementParser.AND, 0); }
		public FrameEnd_Context frameEnd_() {
			return getRuleContext(FrameEnd_Context.class,0);
		}
		public FrameBetween_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frameBetween_; }
	}

	public final FrameBetween_Context frameBetween_() throws RecognitionException {
		FrameBetween_Context _localctx = new FrameBetween_Context(_ctx, getState());
		enterRule(_localctx, 166, RULE_frameBetween_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1254);
			match(BETWEEN);
			setState(1255);
			frameStart_();
			setState(1256);
			match(AND);
			setState(1257);
			frameEnd_();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SpecialFunction_Context extends ParserRuleContext {
		public GroupConcatFunction_Context groupConcatFunction_() {
			return getRuleContext(GroupConcatFunction_Context.class,0);
		}
		public WindowFunction_Context windowFunction_() {
			return getRuleContext(WindowFunction_Context.class,0);
		}
		public CastFunction_Context castFunction_() {
			return getRuleContext(CastFunction_Context.class,0);
		}
		public ConvertFunction_Context convertFunction_() {
			return getRuleContext(ConvertFunction_Context.class,0);
		}
		public PositionFunction_Context positionFunction_() {
			return getRuleContext(PositionFunction_Context.class,0);
		}
		public SubstringFunction_Context substringFunction_() {
			return getRuleContext(SubstringFunction_Context.class,0);
		}
		public ExtractFunction_Context extractFunction_() {
			return getRuleContext(ExtractFunction_Context.class,0);
		}
		public CharFunction_Context charFunction_() {
			return getRuleContext(CharFunction_Context.class,0);
		}
		public TrimFunction_Context trimFunction_() {
			return getRuleContext(TrimFunction_Context.class,0);
		}
		public WeightStringFunction_Context weightStringFunction_() {
			return getRuleContext(WeightStringFunction_Context.class,0);
		}
		public SpecialFunction_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specialFunction_; }
	}

	public final SpecialFunction_Context specialFunction_() throws RecognitionException {
		SpecialFunction_Context _localctx = new SpecialFunction_Context(_ctx, getState());
		enterRule(_localctx, 168, RULE_specialFunction_);
		try {
			setState(1269);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1259);
				groupConcatFunction_();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1260);
				windowFunction_();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1261);
				castFunction_();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1262);
				convertFunction_();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1263);
				positionFunction_();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1264);
				substringFunction_();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1265);
				extractFunction_();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1266);
				charFunction_();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1267);
				trimFunction_();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1268);
				weightStringFunction_();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GroupConcatFunction_Context extends ParserRuleContext {
		public TerminalNode GROUP_CONCAT() { return getToken(MySQLStatementParser.GROUP_CONCAT, 0); }
		public TerminalNode LP_() { return getToken(MySQLStatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(MySQLStatementParser.RP_, 0); }
		public DistinctContext distinct() {
			return getRuleContext(DistinctContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ASTERISK_() { return getToken(MySQLStatementParser.ASTERISK_, 0); }
		public OrderByClauseContext orderByClause() {
			return getRuleContext(OrderByClauseContext.class,0);
		}
		public List<TerminalNode> COMMA_() { return getTokens(MySQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(MySQLStatementParser.COMMA_, i);
		}
		public TerminalNode SEPARATOR() { return getToken(MySQLStatementParser.SEPARATOR, 0); }
		public GroupConcatFunction_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupConcatFunction_; }
	}

	public final GroupConcatFunction_Context groupConcatFunction_() throws RecognitionException {
		GroupConcatFunction_Context _localctx = new GroupConcatFunction_Context(_ctx, getState());
		enterRule(_localctx, 170, RULE_groupConcatFunction_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1271);
			match(GROUP_CONCAT);
			setState(1272);
			match(LP_);
			setState(1274);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DISTINCT) {
				{
				setState(1273);
				distinct();
				}
			}

			setState(1285);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ANY:
			case BINARY:
			case DATE:
			case ESCAPE:
			case EXISTS:
			case FALSE:
			case NOT:
			case NULL:
			case OFFSET:
			case ROLLUP:
			case ROW:
			case SOUNDS:
			case TIME:
			case TIMESTAMP:
			case TRUE:
			case UNKNOWN:
			case ALWAYS:
			case COMMIT:
			case COMMITTED:
			case CURRENT:
			case DISABLE:
			case ENABLE:
			case LEVEL:
			case NO:
			case PASSWORD:
			case PRIVILEGES:
			case ROLLBACK:
			case START:
			case TRANSACTION:
			case TRUNCATE:
			case ACCOUNT:
			case ACTION:
			case AFTER:
			case ALGORITHM:
			case AUTO_INCREMENT:
			case AVG_ROW_LENGTH:
			case BEGIN:
			case BTREE:
			case CASE:
			case CAST:
			case CHAIN:
			case CHAR:
			case CHARSET:
			case CHECKSUM:
			case CIPHER:
			case CLIENT:
			case COALESCE:
			case COLUMNS:
			case COLUMN_FORMAT:
			case COMMENT:
			case COMPACT:
			case COMPRESSED:
			case COMPRESSION:
			case CONNECTION:
			case CONSISTENT:
			case CONVERT:
			case CURRENT_TIMESTAMP:
			case DATA:
			case DELAY_KEY_WRITE:
			case DISCARD:
			case DISK:
			case DUPLICATE:
			case ENCRYPTION:
			case END:
			case ENGINE:
			case EVENT:
			case EXCHANGE:
			case EXECUTE:
			case EXTRACT:
			case FILE:
			case FIRST:
			case FIXED:
			case FOLLOWING:
			case GLOBAL:
			case HASH:
			case IF:
			case IMPORT_:
			case INSERT_METHOD:
			case INTERVAL:
			case KEY_BLOCK_SIZE:
			case LAST:
			case LESS:
			case LOCALTIME:
			case LOCALTIMESTAMP:
			case MATCH:
			case MAX_ROWS:
			case MEMORY:
			case MIN_ROWS:
			case MODIFY:
			case NONE:
			case NOW:
			case PACK_KEYS:
			case PARSER:
			case PARTIAL:
			case PARTITIONING:
			case PERSIST:
			case PERSIST_ONLY:
			case POSITION:
			case PRECEDING:
			case PROCESS:
			case PROXY:
			case QUICK:
			case REBUILD:
			case REDUNDANT:
			case RELOAD:
			case REMOVE:
			case REORGANIZE:
			case REPAIR:
			case REPLACE:
			case REVERSE:
			case ROW_FORMAT:
			case SAVEPOINT:
			case SESSION:
			case SHUTDOWN:
			case SIMPLE:
			case SLAVE:
			case SQL_BIG_RESULT:
			case SQL_BUFFER_RESULT:
			case SQL_CACHE:
			case SQL_NO_CACHE:
			case STATS_AUTO_RECALC:
			case STATS_PERSISTENT:
			case STATS_SAMPLE_PAGES:
			case STORAGE:
			case SUBPARTITION:
			case SUPER:
			case SUBSTR:
			case SUBSTRING:
			case TABLES:
			case TABLESPACE:
			case TEMPORARY:
			case THAN:
			case TRIM:
			case UNBOUNDED:
			case UPGRADE:
			case VALIDATION:
			case VALUE:
			case VIEW:
			case WEIGHT_STRING:
			case WITHOUT:
			case VISIBLE:
			case INVISIBLE:
			case ENFORCED:
			case MICROSECOND:
			case SECOND:
			case MINUTE:
			case HOUR:
			case DAY:
			case WEEK:
			case MONTH:
			case QUARTER:
			case YEAR:
			case AGAINST:
			case LANGUAGE:
			case MODE:
			case QUERY:
			case EXPANSION:
			case BOOLEAN:
			case MAX:
			case MIN:
			case SUM:
			case COUNT:
			case AVG:
			case BIT_AND:
			case BIT_OR:
			case BIT_XOR:
			case GROUP_CONCAT:
			case JSON_ARRAYAGG:
			case JSON_OBJECTAGG:
			case STD:
			case STDDEV:
			case STDDEV_POP:
			case STDDEV_SAMP:
			case VAR_POP:
			case VAR_SAMP:
			case VARIANCE:
			case NOT_:
			case TILDE_:
			case PLUS_:
			case MINUS_:
			case DOT_:
			case LP_:
			case LBE_:
			case QUESTION_:
			case AT_:
			case IDENTIFIER_:
			case STRING_:
			case NUMBER_:
			case HEX_DIGIT_:
			case BIT_NUM_:
				{
				setState(1276);
				expr(0);
				setState(1281);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(1277);
					match(COMMA_);
					setState(1278);
					expr(0);
					}
					}
					setState(1283);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case ASTERISK_:
				{
				setState(1284);
				match(ASTERISK_);
				}
				break;
			case ORDER:
			case RP_:
				break;
			default:
				break;
			}
			setState(1292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(1287);
				orderByClause();
				setState(1290);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEPARATOR) {
					{
					setState(1288);
					match(SEPARATOR);
					setState(1289);
					expr(0);
					}
				}

				}
			}

			setState(1294);
			match(RP_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WindowFunction_Context extends ParserRuleContext {
		public Identifier_Context identifier_() {
			return getRuleContext(Identifier_Context.class,0);
		}
		public TerminalNode LP_() { return getToken(MySQLStatementParser.LP_, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RP_() { return getToken(MySQLStatementParser.RP_, 0); }
		public OverClause_Context overClause_() {
			return getRuleContext(OverClause_Context.class,0);
		}
		public List<TerminalNode> COMMA_() { return getTokens(MySQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(MySQLStatementParser.COMMA_, i);
		}
		public WindowFunction_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowFunction_; }
	}

	public final WindowFunction_Context windowFunction_() throws RecognitionException {
		WindowFunction_Context _localctx = new WindowFunction_Context(_ctx, getState());
		enterRule(_localctx, 172, RULE_windowFunction_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1296);
			identifier_();
			setState(1297);
			match(LP_);
			setState(1298);
			expr(0);
			setState(1303);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(1299);
				match(COMMA_);
				setState(1300);
				expr(0);
				}
				}
				setState(1305);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1306);
			match(RP_);
			setState(1307);
			overClause_();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CastFunction_Context extends ParserRuleContext {
		public TerminalNode CAST() { return getToken(MySQLStatementParser.CAST, 0); }
		public TerminalNode LP_() { return getToken(MySQLStatementParser.LP_, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode AS() { return getToken(MySQLStatementParser.AS, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode RP_() { return getToken(MySQLStatementParser.RP_, 0); }
		public CastFunction_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castFunction_; }
	}

	public final CastFunction_Context castFunction_() throws RecognitionException {
		CastFunction_Context _localctx = new CastFunction_Context(_ctx, getState());
		enterRule(_localctx, 174, RULE_castFunction_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1309);
			match(CAST);
			setState(1310);
			match(LP_);
			setState(1311);
			expr(0);
			setState(1312);
			match(AS);
			setState(1313);
			dataType();
			setState(1314);
			match(RP_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConvertFunction_Context extends ParserRuleContext {
		public TerminalNode CONVERT() { return getToken(MySQLStatementParser.CONVERT, 0); }
		public TerminalNode LP_() { return getToken(MySQLStatementParser.LP_, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode COMMA_() { return getToken(MySQLStatementParser.COMMA_, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode RP_() { return getToken(MySQLStatementParser.RP_, 0); }
		public TerminalNode USING() { return getToken(MySQLStatementParser.USING, 0); }
		public Identifier_Context identifier_() {
			return getRuleContext(Identifier_Context.class,0);
		}
		public ConvertFunction_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_convertFunction_; }
	}

	public final ConvertFunction_Context convertFunction_() throws RecognitionException {
		ConvertFunction_Context _localctx = new ConvertFunction_Context(_ctx, getState());
		enterRule(_localctx, 176, RULE_convertFunction_);
		try {
			setState(1330);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1316);
				match(CONVERT);
				setState(1317);
				match(LP_);
				setState(1318);
				expr(0);
				setState(1319);
				match(COMMA_);
				setState(1320);
				dataType();
				setState(1321);
				match(RP_);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1323);
				match(CONVERT);
				setState(1324);
				match(LP_);
				setState(1325);
				expr(0);
				setState(1326);
				match(USING);
				setState(1327);
				identifier_();
				setState(1328);
				match(RP_);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PositionFunction_Context extends ParserRuleContext {
		public TerminalNode POSITION() { return getToken(MySQLStatementParser.POSITION, 0); }
		public TerminalNode LP_() { return getToken(MySQLStatementParser.LP_, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode IN() { return getToken(MySQLStatementParser.IN, 0); }
		public TerminalNode RP_() { return getToken(MySQLStatementParser.RP_, 0); }
		public PositionFunction_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_positionFunction_; }
	}

	public final PositionFunction_Context positionFunction_() throws RecognitionException {
		PositionFunction_Context _localctx = new PositionFunction_Context(_ctx, getState());
		enterRule(_localctx, 178, RULE_positionFunction_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1332);
			match(POSITION);
			setState(1333);
			match(LP_);
			setState(1334);
			expr(0);
			setState(1335);
			match(IN);
			setState(1336);
			expr(0);
			setState(1337);
			match(RP_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubstringFunction_Context extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(MySQLStatementParser.LP_, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode FROM() { return getToken(MySQLStatementParser.FROM, 0); }
		public List<TerminalNode> NUMBER_() { return getTokens(MySQLStatementParser.NUMBER_); }
		public TerminalNode NUMBER_(int i) {
			return getToken(MySQLStatementParser.NUMBER_, i);
		}
		public TerminalNode RP_() { return getToken(MySQLStatementParser.RP_, 0); }
		public TerminalNode SUBSTRING() { return getToken(MySQLStatementParser.SUBSTRING, 0); }
		public TerminalNode SUBSTR() { return getToken(MySQLStatementParser.SUBSTR, 0); }
		public TerminalNode FOR() { return getToken(MySQLStatementParser.FOR, 0); }
		public SubstringFunction_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_substringFunction_; }
	}

	public final SubstringFunction_Context substringFunction_() throws RecognitionException {
		SubstringFunction_Context _localctx = new SubstringFunction_Context(_ctx, getState());
		enterRule(_localctx, 180, RULE_substringFunction_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1339);
			_la = _input.LA(1);
			if ( !(_la==SUBSTR || _la==SUBSTRING) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1340);
			match(LP_);
			setState(1341);
			expr(0);
			setState(1342);
			match(FROM);
			setState(1343);
			match(NUMBER_);
			setState(1346);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FOR) {
				{
				setState(1344);
				match(FOR);
				setState(1345);
				match(NUMBER_);
				}
			}

			setState(1348);
			match(RP_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExtractFunction_Context extends ParserRuleContext {
		public TerminalNode EXTRACT() { return getToken(MySQLStatementParser.EXTRACT, 0); }
		public TerminalNode LP_() { return getToken(MySQLStatementParser.LP_, 0); }
		public Identifier_Context identifier_() {
			return getRuleContext(Identifier_Context.class,0);
		}
		public TerminalNode FROM() { return getToken(MySQLStatementParser.FROM, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RP_() { return getToken(MySQLStatementParser.RP_, 0); }
		public ExtractFunction_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extractFunction_; }
	}

	public final ExtractFunction_Context extractFunction_() throws RecognitionException {
		ExtractFunction_Context _localctx = new ExtractFunction_Context(_ctx, getState());
		enterRule(_localctx, 182, RULE_extractFunction_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1350);
			match(EXTRACT);
			setState(1351);
			match(LP_);
			setState(1352);
			identifier_();
			setState(1353);
			match(FROM);
			setState(1354);
			expr(0);
			setState(1355);
			match(RP_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CharFunction_Context extends ParserRuleContext {
		public TerminalNode CHAR() { return getToken(MySQLStatementParser.CHAR, 0); }
		public TerminalNode LP_() { return getToken(MySQLStatementParser.LP_, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RP_() { return getToken(MySQLStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(MySQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(MySQLStatementParser.COMMA_, i);
		}
		public TerminalNode USING() { return getToken(MySQLStatementParser.USING, 0); }
		public IgnoredIdentifier_Context ignoredIdentifier_() {
			return getRuleContext(IgnoredIdentifier_Context.class,0);
		}
		public CharFunction_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charFunction_; }
	}

	public final CharFunction_Context charFunction_() throws RecognitionException {
		CharFunction_Context _localctx = new CharFunction_Context(_ctx, getState());
		enterRule(_localctx, 184, RULE_charFunction_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1357);
			match(CHAR);
			setState(1358);
			match(LP_);
			setState(1359);
			expr(0);
			setState(1364);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(1360);
				match(COMMA_);
				setState(1361);
				expr(0);
				}
				}
				setState(1366);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1369);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==USING) {
				{
				setState(1367);
				match(USING);
				setState(1368);
				ignoredIdentifier_();
				}
			}

			setState(1371);
			match(RP_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TrimFunction_Context extends ParserRuleContext {
		public TerminalNode TRIM() { return getToken(MySQLStatementParser.TRIM, 0); }
		public TerminalNode LP_() { return getToken(MySQLStatementParser.LP_, 0); }
		public List<TerminalNode> STRING_() { return getTokens(MySQLStatementParser.STRING_); }
		public TerminalNode STRING_(int i) {
			return getToken(MySQLStatementParser.STRING_, i);
		}
		public TerminalNode FROM() { return getToken(MySQLStatementParser.FROM, 0); }
		public TerminalNode RP_() { return getToken(MySQLStatementParser.RP_, 0); }
		public TerminalNode LEADING() { return getToken(MySQLStatementParser.LEADING, 0); }
		public TerminalNode BOTH() { return getToken(MySQLStatementParser.BOTH, 0); }
		public TerminalNode TRAILING() { return getToken(MySQLStatementParser.TRAILING, 0); }
		public TrimFunction_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trimFunction_; }
	}

	public final TrimFunction_Context trimFunction_() throws RecognitionException {
		TrimFunction_Context _localctx = new TrimFunction_Context(_ctx, getState());
		enterRule(_localctx, 186, RULE_trimFunction_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1373);
			match(TRIM);
			setState(1374);
			match(LP_);
			setState(1375);
			_la = _input.LA(1);
			if ( !(_la==BOTH || _la==LEADING || _la==TRAILING) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1376);
			match(STRING_);
			setState(1377);
			match(FROM);
			setState(1378);
			match(STRING_);
			setState(1379);
			match(RP_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WeightStringFunction_Context extends ParserRuleContext {
		public TerminalNode WEIGHT_STRING() { return getToken(MySQLStatementParser.WEIGHT_STRING, 0); }
		public TerminalNode LP_() { return getToken(MySQLStatementParser.LP_, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RP_() { return getToken(MySQLStatementParser.RP_, 0); }
		public TerminalNode AS() { return getToken(MySQLStatementParser.AS, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public LevelClause_Context levelClause_() {
			return getRuleContext(LevelClause_Context.class,0);
		}
		public WeightStringFunction_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_weightStringFunction_; }
	}

	public final WeightStringFunction_Context weightStringFunction_() throws RecognitionException {
		WeightStringFunction_Context _localctx = new WeightStringFunction_Context(_ctx, getState());
		enterRule(_localctx, 188, RULE_weightStringFunction_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1381);
			match(WEIGHT_STRING);
			setState(1382);
			match(LP_);
			setState(1383);
			expr(0);
			setState(1386);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(1384);
				match(AS);
				setState(1385);
				dataType();
				}
			}

			setState(1389);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LEVEL) {
				{
				setState(1388);
				levelClause_();
				}
			}

			setState(1391);
			match(RP_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LevelClause_Context extends ParserRuleContext {
		public TerminalNode LEVEL() { return getToken(MySQLStatementParser.LEVEL, 0); }
		public List<LevelInWeightListElement_Context> levelInWeightListElement_() {
			return getRuleContexts(LevelInWeightListElement_Context.class);
		}
		public LevelInWeightListElement_Context levelInWeightListElement_(int i) {
			return getRuleContext(LevelInWeightListElement_Context.class,i);
		}
		public List<TerminalNode> NUMBER_() { return getTokens(MySQLStatementParser.NUMBER_); }
		public TerminalNode NUMBER_(int i) {
			return getToken(MySQLStatementParser.NUMBER_, i);
		}
		public TerminalNode MINUS_() { return getToken(MySQLStatementParser.MINUS_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(MySQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(MySQLStatementParser.COMMA_, i);
		}
		public LevelClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_levelClause_; }
	}

	public final LevelClause_Context levelClause_() throws RecognitionException {
		LevelClause_Context _localctx = new LevelClause_Context(_ctx, getState());
		enterRule(_localctx, 190, RULE_levelClause_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1393);
			match(LEVEL);
			setState(1405);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
			case 1:
				{
				setState(1394);
				levelInWeightListElement_();
				setState(1399);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(1395);
					match(COMMA_);
					setState(1396);
					levelInWeightListElement_();
					}
					}
					setState(1401);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(1402);
				match(NUMBER_);
				setState(1403);
				match(MINUS_);
				setState(1404);
				match(NUMBER_);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LevelInWeightListElement_Context extends ParserRuleContext {
		public TerminalNode NUMBER_() { return getToken(MySQLStatementParser.NUMBER_, 0); }
		public TerminalNode REVERSE() { return getToken(MySQLStatementParser.REVERSE, 0); }
		public TerminalNode ASC() { return getToken(MySQLStatementParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(MySQLStatementParser.DESC, 0); }
		public LevelInWeightListElement_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_levelInWeightListElement_; }
	}

	public final LevelInWeightListElement_Context levelInWeightListElement_() throws RecognitionException {
		LevelInWeightListElement_Context _localctx = new LevelInWeightListElement_Context(_ctx, getState());
		enterRule(_localctx, 192, RULE_levelInWeightListElement_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1407);
			match(NUMBER_);
			setState(1409);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(1408);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1412);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==REVERSE) {
				{
				setState(1411);
				match(REVERSE);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RegularFunction_Context extends ParserRuleContext {
		public RegularFunctionName_Context regularFunctionName_() {
			return getRuleContext(RegularFunctionName_Context.class,0);
		}
		public TerminalNode LP_() { return getToken(MySQLStatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(MySQLStatementParser.RP_, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ASTERISK_() { return getToken(MySQLStatementParser.ASTERISK_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(MySQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(MySQLStatementParser.COMMA_, i);
		}
		public RegularFunction_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regularFunction_; }
	}

	public final RegularFunction_Context regularFunction_() throws RecognitionException {
		RegularFunction_Context _localctx = new RegularFunction_Context(_ctx, getState());
		enterRule(_localctx, 194, RULE_regularFunction_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1414);
			regularFunctionName_();
			setState(1415);
			match(LP_);
			setState(1425);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ANY:
			case BINARY:
			case DATE:
			case ESCAPE:
			case EXISTS:
			case FALSE:
			case NOT:
			case NULL:
			case OFFSET:
			case ROLLUP:
			case ROW:
			case SOUNDS:
			case TIME:
			case TIMESTAMP:
			case TRUE:
			case UNKNOWN:
			case ALWAYS:
			case COMMIT:
			case COMMITTED:
			case CURRENT:
			case DISABLE:
			case ENABLE:
			case LEVEL:
			case NO:
			case PASSWORD:
			case PRIVILEGES:
			case ROLLBACK:
			case START:
			case TRANSACTION:
			case TRUNCATE:
			case ACCOUNT:
			case ACTION:
			case AFTER:
			case ALGORITHM:
			case AUTO_INCREMENT:
			case AVG_ROW_LENGTH:
			case BEGIN:
			case BTREE:
			case CASE:
			case CAST:
			case CHAIN:
			case CHAR:
			case CHARSET:
			case CHECKSUM:
			case CIPHER:
			case CLIENT:
			case COALESCE:
			case COLUMNS:
			case COLUMN_FORMAT:
			case COMMENT:
			case COMPACT:
			case COMPRESSED:
			case COMPRESSION:
			case CONNECTION:
			case CONSISTENT:
			case CONVERT:
			case CURRENT_TIMESTAMP:
			case DATA:
			case DELAY_KEY_WRITE:
			case DISCARD:
			case DISK:
			case DUPLICATE:
			case ENCRYPTION:
			case END:
			case ENGINE:
			case EVENT:
			case EXCHANGE:
			case EXECUTE:
			case EXTRACT:
			case FILE:
			case FIRST:
			case FIXED:
			case FOLLOWING:
			case GLOBAL:
			case HASH:
			case IF:
			case IMPORT_:
			case INSERT_METHOD:
			case INTERVAL:
			case KEY_BLOCK_SIZE:
			case LAST:
			case LESS:
			case LOCALTIME:
			case LOCALTIMESTAMP:
			case MATCH:
			case MAX_ROWS:
			case MEMORY:
			case MIN_ROWS:
			case MODIFY:
			case NONE:
			case NOW:
			case PACK_KEYS:
			case PARSER:
			case PARTIAL:
			case PARTITIONING:
			case PERSIST:
			case PERSIST_ONLY:
			case POSITION:
			case PRECEDING:
			case PROCESS:
			case PROXY:
			case QUICK:
			case REBUILD:
			case REDUNDANT:
			case RELOAD:
			case REMOVE:
			case REORGANIZE:
			case REPAIR:
			case REPLACE:
			case REVERSE:
			case ROW_FORMAT:
			case SAVEPOINT:
			case SESSION:
			case SHUTDOWN:
			case SIMPLE:
			case SLAVE:
			case SQL_BIG_RESULT:
			case SQL_BUFFER_RESULT:
			case SQL_CACHE:
			case SQL_NO_CACHE:
			case STATS_AUTO_RECALC:
			case STATS_PERSISTENT:
			case STATS_SAMPLE_PAGES:
			case STORAGE:
			case SUBPARTITION:
			case SUPER:
			case SUBSTR:
			case SUBSTRING:
			case TABLES:
			case TABLESPACE:
			case TEMPORARY:
			case THAN:
			case TRIM:
			case UNBOUNDED:
			case UPGRADE:
			case VALIDATION:
			case VALUE:
			case VIEW:
			case WEIGHT_STRING:
			case WITHOUT:
			case VISIBLE:
			case INVISIBLE:
			case ENFORCED:
			case MICROSECOND:
			case SECOND:
			case MINUTE:
			case HOUR:
			case DAY:
			case WEEK:
			case MONTH:
			case QUARTER:
			case YEAR:
			case AGAINST:
			case LANGUAGE:
			case MODE:
			case QUERY:
			case EXPANSION:
			case BOOLEAN:
			case MAX:
			case MIN:
			case SUM:
			case COUNT:
			case AVG:
			case BIT_AND:
			case BIT_OR:
			case BIT_XOR:
			case GROUP_CONCAT:
			case JSON_ARRAYAGG:
			case JSON_OBJECTAGG:
			case STD:
			case STDDEV:
			case STDDEV_POP:
			case STDDEV_SAMP:
			case VAR_POP:
			case VAR_SAMP:
			case VARIANCE:
			case NOT_:
			case TILDE_:
			case PLUS_:
			case MINUS_:
			case DOT_:
			case LP_:
			case LBE_:
			case QUESTION_:
			case AT_:
			case IDENTIFIER_:
			case STRING_:
			case NUMBER_:
			case HEX_DIGIT_:
			case BIT_NUM_:
				{
				setState(1416);
				expr(0);
				setState(1421);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(1417);
					match(COMMA_);
					setState(1418);
					expr(0);
					}
					}
					setState(1423);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case ASTERISK_:
				{
				setState(1424);
				match(ASTERISK_);
				}
				break;
			case RP_:
				break;
			default:
				break;
			}
			setState(1427);
			match(RP_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RegularFunctionName_Context extends ParserRuleContext {
		public Identifier_Context identifier_() {
			return getRuleContext(Identifier_Context.class,0);
		}
		public TerminalNode IF() { return getToken(MySQLStatementParser.IF, 0); }
		public TerminalNode CURRENT_TIMESTAMP() { return getToken(MySQLStatementParser.CURRENT_TIMESTAMP, 0); }
		public TerminalNode LOCALTIME() { return getToken(MySQLStatementParser.LOCALTIME, 0); }
		public TerminalNode LOCALTIMESTAMP() { return getToken(MySQLStatementParser.LOCALTIMESTAMP, 0); }
		public TerminalNode NOW() { return getToken(MySQLStatementParser.NOW, 0); }
		public TerminalNode REPLACE() { return getToken(MySQLStatementParser.REPLACE, 0); }
		public RegularFunctionName_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regularFunctionName_; }
	}

	public final RegularFunctionName_Context regularFunctionName_() throws RecognitionException {
		RegularFunctionName_Context _localctx = new RegularFunctionName_Context(_ctx, getState());
		enterRule(_localctx, 196, RULE_regularFunctionName_);
		try {
			setState(1436);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ANY:
			case DATE:
			case ESCAPE:
			case OFFSET:
			case ROLLUP:
			case SOUNDS:
			case TIME:
			case TIMESTAMP:
			case UNKNOWN:
			case ALWAYS:
			case COMMIT:
			case COMMITTED:
			case CURRENT:
			case DISABLE:
			case ENABLE:
			case LEVEL:
			case NO:
			case PASSWORD:
			case PRIVILEGES:
			case ROLLBACK:
			case START:
			case TRANSACTION:
			case TRUNCATE:
			case ACCOUNT:
			case ACTION:
			case AFTER:
			case ALGORITHM:
			case AUTO_INCREMENT:
			case AVG_ROW_LENGTH:
			case BEGIN:
			case BTREE:
			case CHAIN:
			case CHARSET:
			case CHECKSUM:
			case CIPHER:
			case CLIENT:
			case COALESCE:
			case COLUMNS:
			case COLUMN_FORMAT:
			case COMMENT:
			case COMPACT:
			case COMPRESSED:
			case COMPRESSION:
			case CONNECTION:
			case CONSISTENT:
			case DATA:
			case DELAY_KEY_WRITE:
			case DISCARD:
			case DISK:
			case DUPLICATE:
			case ENCRYPTION:
			case END:
			case ENGINE:
			case EVENT:
			case EXCHANGE:
			case EXECUTE:
			case FILE:
			case FIRST:
			case FIXED:
			case FOLLOWING:
			case GLOBAL:
			case HASH:
			case IMPORT_:
			case INSERT_METHOD:
			case KEY_BLOCK_SIZE:
			case LAST:
			case LESS:
			case MAX_ROWS:
			case MEMORY:
			case MIN_ROWS:
			case MODIFY:
			case NONE:
			case PACK_KEYS:
			case PARSER:
			case PARTIAL:
			case PARTITIONING:
			case PERSIST:
			case PERSIST_ONLY:
			case PRECEDING:
			case PROCESS:
			case PROXY:
			case QUICK:
			case REBUILD:
			case REDUNDANT:
			case RELOAD:
			case REMOVE:
			case REORGANIZE:
			case REPAIR:
			case REVERSE:
			case ROW_FORMAT:
			case SAVEPOINT:
			case SESSION:
			case SHUTDOWN:
			case SIMPLE:
			case SLAVE:
			case SQL_BIG_RESULT:
			case SQL_BUFFER_RESULT:
			case SQL_CACHE:
			case SQL_NO_CACHE:
			case STATS_AUTO_RECALC:
			case STATS_PERSISTENT:
			case STATS_SAMPLE_PAGES:
			case STORAGE:
			case SUBPARTITION:
			case SUPER:
			case TABLES:
			case TABLESPACE:
			case TEMPORARY:
			case THAN:
			case UNBOUNDED:
			case UPGRADE:
			case VALIDATION:
			case VALUE:
			case VIEW:
			case WEIGHT_STRING:
			case WITHOUT:
			case VISIBLE:
			case INVISIBLE:
			case ENFORCED:
			case MICROSECOND:
			case SECOND:
			case MINUTE:
			case HOUR:
			case DAY:
			case WEEK:
			case MONTH:
			case QUARTER:
			case YEAR:
			case AGAINST:
			case LANGUAGE:
			case MODE:
			case QUERY:
			case EXPANSION:
			case BOOLEAN:
			case MAX:
			case MIN:
			case SUM:
			case COUNT:
			case AVG:
			case BIT_AND:
			case BIT_OR:
			case BIT_XOR:
			case GROUP_CONCAT:
			case JSON_ARRAYAGG:
			case JSON_OBJECTAGG:
			case STD:
			case STDDEV:
			case STDDEV_POP:
			case STDDEV_SAMP:
			case VAR_POP:
			case VAR_SAMP:
			case VARIANCE:
			case IDENTIFIER_:
				enterOuterAlt(_localctx, 1);
				{
				setState(1429);
				identifier_();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(1430);
				match(IF);
				}
				break;
			case CURRENT_TIMESTAMP:
				enterOuterAlt(_localctx, 3);
				{
				setState(1431);
				match(CURRENT_TIMESTAMP);
				}
				break;
			case LOCALTIME:
				enterOuterAlt(_localctx, 4);
				{
				setState(1432);
				match(LOCALTIME);
				}
				break;
			case LOCALTIMESTAMP:
				enterOuterAlt(_localctx, 5);
				{
				setState(1433);
				match(LOCALTIMESTAMP);
				}
				break;
			case NOW:
				enterOuterAlt(_localctx, 6);
				{
				setState(1434);
				match(NOW);
				}
				break;
			case REPLACE:
				enterOuterAlt(_localctx, 7);
				{
				setState(1435);
				match(REPLACE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MatchExpression_Context extends ParserRuleContext {
		public TerminalNode MATCH() { return getToken(MySQLStatementParser.MATCH, 0); }
		public ColumnNamesContext columnNames() {
			return getRuleContext(ColumnNamesContext.class,0);
		}
		public TerminalNode AGAINST() { return getToken(MySQLStatementParser.AGAINST, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public MatchSearchModifier_Context matchSearchModifier_() {
			return getRuleContext(MatchSearchModifier_Context.class,0);
		}
		public MatchExpression_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchExpression_; }
	}

	public final MatchExpression_Context matchExpression_() throws RecognitionException {
		MatchExpression_Context _localctx = new MatchExpression_Context(_ctx, getState());
		enterRule(_localctx, 198, RULE_matchExpression_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1438);
			match(MATCH);
			setState(1439);
			columnNames();
			setState(1440);
			match(AGAINST);
			{
			setState(1441);
			expr(0);
			setState(1443);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,154,_ctx) ) {
			case 1:
				{
				setState(1442);
				matchSearchModifier_();
				}
				break;
			}
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MatchSearchModifier_Context extends ParserRuleContext {
		public TerminalNode IN() { return getToken(MySQLStatementParser.IN, 0); }
		public TerminalNode NATURAL() { return getToken(MySQLStatementParser.NATURAL, 0); }
		public TerminalNode LANGUAGE() { return getToken(MySQLStatementParser.LANGUAGE, 0); }
		public TerminalNode MODE() { return getToken(MySQLStatementParser.MODE, 0); }
		public TerminalNode WITH() { return getToken(MySQLStatementParser.WITH, 0); }
		public TerminalNode QUERY() { return getToken(MySQLStatementParser.QUERY, 0); }
		public TerminalNode EXPANSION() { return getToken(MySQLStatementParser.EXPANSION, 0); }
		public TerminalNode BOOLEAN() { return getToken(MySQLStatementParser.BOOLEAN, 0); }
		public MatchSearchModifier_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchSearchModifier_; }
	}

	public final MatchSearchModifier_Context matchSearchModifier_() throws RecognitionException {
		MatchSearchModifier_Context _localctx = new MatchSearchModifier_Context(_ctx, getState());
		enterRule(_localctx, 200, RULE_matchSearchModifier_);
		try {
			setState(1462);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,155,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1445);
				match(IN);
				setState(1446);
				match(NATURAL);
				setState(1447);
				match(LANGUAGE);
				setState(1448);
				match(MODE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1449);
				match(IN);
				setState(1450);
				match(NATURAL);
				setState(1451);
				match(LANGUAGE);
				setState(1452);
				match(MODE);
				setState(1453);
				match(WITH);
				setState(1454);
				match(QUERY);
				setState(1455);
				match(EXPANSION);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1456);
				match(IN);
				setState(1457);
				match(BOOLEAN);
				setState(1458);
				match(MODE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1459);
				match(WITH);
				setState(1460);
				match(QUERY);
				setState(1461);
				match(EXPANSION);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaseExpression_Context extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(MySQLStatementParser.CASE, 0); }
		public TerminalNode END() { return getToken(MySQLStatementParser.END, 0); }
		public SimpleExprContext simpleExpr() {
			return getRuleContext(SimpleExprContext.class,0);
		}
		public List<CaseWhen_Context> caseWhen_() {
			return getRuleContexts(CaseWhen_Context.class);
		}
		public CaseWhen_Context caseWhen_(int i) {
			return getRuleContext(CaseWhen_Context.class,i);
		}
		public CaseElse_Context caseElse_() {
			return getRuleContext(CaseElse_Context.class,0);
		}
		public CaseExpression_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseExpression_; }
	}

	public final CaseExpression_Context caseExpression_() throws RecognitionException {
		CaseExpression_Context _localctx = new CaseExpression_Context(_ctx, getState());
		enterRule(_localctx, 202, RULE_caseExpression_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1464);
			match(CASE);
			setState(1466);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ANY) | (1L << BINARY) | (1L << DATE) | (1L << ESCAPE) | (1L << EXISTS) | (1L << FALSE) | (1L << NULL) | (1L << OFFSET) | (1L << ROLLUP) | (1L << ROW) | (1L << SOUNDS) | (1L << TIME) | (1L << TIMESTAMP) | (1L << TRUE) | (1L << UNKNOWN) | (1L << ALWAYS) | (1L << COMMIT) | (1L << COMMITTED) | (1L << CURRENT) | (1L << DISABLE) | (1L << ENABLE))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (LEVEL - 69)) | (1L << (NO - 69)) | (1L << (PASSWORD - 69)) | (1L << (PRIVILEGES - 69)) | (1L << (ROLLBACK - 69)) | (1L << (START - 69)) | (1L << (TRANSACTION - 69)) | (1L << (TRUNCATE - 69)) | (1L << (ACCOUNT - 69)) | (1L << (ACTION - 69)) | (1L << (AFTER - 69)) | (1L << (ALGORITHM - 69)) | (1L << (AUTO_INCREMENT - 69)) | (1L << (AVG_ROW_LENGTH - 69)) | (1L << (BEGIN - 69)) | (1L << (BTREE - 69)) | (1L << (CASE - 69)) | (1L << (CAST - 69)) | (1L << (CHAIN - 69)) | (1L << (CHAR - 69)) | (1L << (CHARSET - 69)) | (1L << (CHECKSUM - 69)) | (1L << (CIPHER - 69)) | (1L << (CLIENT - 69)) | (1L << (COALESCE - 69)) | (1L << (COLUMNS - 69)) | (1L << (COLUMN_FORMAT - 69)) | (1L << (COMMENT - 69)) | (1L << (COMPACT - 69)) | (1L << (COMPRESSED - 69)) | (1L << (COMPRESSION - 69)) | (1L << (CONNECTION - 69)) | (1L << (CONSISTENT - 69)) | (1L << (CONVERT - 69)) | (1L << (CURRENT_TIMESTAMP - 69)) | (1L << (DATA - 69)) | (1L << (DELAY_KEY_WRITE - 69)) | (1L << (DISCARD - 69)) | (1L << (DISK - 69)))) != 0) || ((((_la - 135)) & ~0x3f) == 0 && ((1L << (_la - 135)) & ((1L << (DUPLICATE - 135)) | (1L << (ENCRYPTION - 135)) | (1L << (END - 135)) | (1L << (ENGINE - 135)) | (1L << (EVENT - 135)) | (1L << (EXCHANGE - 135)) | (1L << (EXECUTE - 135)) | (1L << (EXTRACT - 135)) | (1L << (FILE - 135)) | (1L << (FIRST - 135)) | (1L << (FIXED - 135)) | (1L << (FOLLOWING - 135)) | (1L << (GLOBAL - 135)) | (1L << (HASH - 135)) | (1L << (IF - 135)) | (1L << (IMPORT_ - 135)) | (1L << (INSERT_METHOD - 135)) | (1L << (INTERVAL - 135)) | (1L << (KEY_BLOCK_SIZE - 135)) | (1L << (LAST - 135)) | (1L << (LESS - 135)) | (1L << (LOCALTIME - 135)) | (1L << (LOCALTIMESTAMP - 135)) | (1L << (MATCH - 135)) | (1L << (MAX_ROWS - 135)) | (1L << (MEMORY - 135)) | (1L << (MIN_ROWS - 135)) | (1L << (MODIFY - 135)) | (1L << (NONE - 135)) | (1L << (NOW - 135)) | (1L << (PACK_KEYS - 135)) | (1L << (PARSER - 135)))) != 0) || ((((_la - 199)) & ~0x3f) == 0 && ((1L << (_la - 199)) & ((1L << (PARTIAL - 199)) | (1L << (PARTITIONING - 199)) | (1L << (PERSIST - 199)) | (1L << (PERSIST_ONLY - 199)) | (1L << (POSITION - 199)) | (1L << (PRECEDING - 199)) | (1L << (PROCESS - 199)) | (1L << (PROXY - 199)) | (1L << (QUICK - 199)) | (1L << (REBUILD - 199)) | (1L << (REDUNDANT - 199)) | (1L << (RELOAD - 199)) | (1L << (REMOVE - 199)) | (1L << (REORGANIZE - 199)) | (1L << (REPAIR - 199)) | (1L << (REPLACE - 199)) | (1L << (REVERSE - 199)) | (1L << (ROW_FORMAT - 199)) | (1L << (SAVEPOINT - 199)) | (1L << (SESSION - 199)) | (1L << (SHUTDOWN - 199)) | (1L << (SIMPLE - 199)) | (1L << (SLAVE - 199)) | (1L << (SQL_BIG_RESULT - 199)) | (1L << (SQL_BUFFER_RESULT - 199)) | (1L << (SQL_CACHE - 199)) | (1L << (SQL_NO_CACHE - 199)) | (1L << (STATS_AUTO_RECALC - 199)) | (1L << (STATS_PERSISTENT - 199)) | (1L << (STATS_SAMPLE_PAGES - 199)) | (1L << (STORAGE - 199)) | (1L << (SUBPARTITION - 199)) | (1L << (SUPER - 199)) | (1L << (SUBSTR - 199)) | (1L << (SUBSTRING - 199)) | (1L << (TABLES - 199)) | (1L << (TABLESPACE - 199)))) != 0) || ((((_la - 263)) & ~0x3f) == 0 && ((1L << (_la - 263)) & ((1L << (TEMPORARY - 263)) | (1L << (THAN - 263)) | (1L << (TRIM - 263)) | (1L << (UNBOUNDED - 263)) | (1L << (UPGRADE - 263)) | (1L << (VALIDATION - 263)) | (1L << (VALUE - 263)) | (1L << (VIEW - 263)) | (1L << (WEIGHT_STRING - 263)) | (1L << (WITHOUT - 263)) | (1L << (VISIBLE - 263)) | (1L << (INVISIBLE - 263)) | (1L << (ENFORCED - 263)) | (1L << (MICROSECOND - 263)) | (1L << (SECOND - 263)) | (1L << (MINUTE - 263)) | (1L << (HOUR - 263)) | (1L << (DAY - 263)) | (1L << (WEEK - 263)) | (1L << (MONTH - 263)) | (1L << (QUARTER - 263)) | (1L << (YEAR - 263)) | (1L << (AGAINST - 263)) | (1L << (LANGUAGE - 263)) | (1L << (MODE - 263)) | (1L << (QUERY - 263)) | (1L << (EXPANSION - 263)) | (1L << (BOOLEAN - 263)) | (1L << (MAX - 263)) | (1L << (MIN - 263)) | (1L << (SUM - 263)) | (1L << (COUNT - 263)) | (1L << (AVG - 263)) | (1L << (BIT_AND - 263)) | (1L << (BIT_OR - 263)))) != 0) || ((((_la - 327)) & ~0x3f) == 0 && ((1L << (_la - 327)) & ((1L << (BIT_XOR - 327)) | (1L << (GROUP_CONCAT - 327)) | (1L << (JSON_ARRAYAGG - 327)) | (1L << (JSON_OBJECTAGG - 327)) | (1L << (STD - 327)) | (1L << (STDDEV - 327)) | (1L << (STDDEV_POP - 327)) | (1L << (STDDEV_SAMP - 327)) | (1L << (VAR_POP - 327)) | (1L << (VAR_SAMP - 327)) | (1L << (VARIANCE - 327)) | (1L << (NOT_ - 327)) | (1L << (TILDE_ - 327)) | (1L << (PLUS_ - 327)) | (1L << (MINUS_ - 327)) | (1L << (DOT_ - 327)) | (1L << (LP_ - 327)) | (1L << (LBE_ - 327)) | (1L << (QUESTION_ - 327)) | (1L << (AT_ - 327)) | (1L << (IDENTIFIER_ - 327)) | (1L << (STRING_ - 327)) | (1L << (NUMBER_ - 327)) | (1L << (HEX_DIGIT_ - 327)) | (1L << (BIT_NUM_ - 327)))) != 0)) {
				{
				setState(1465);
				simpleExpr(0);
				}
			}

			setState(1469); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1468);
				caseWhen_();
				}
				}
				setState(1471); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WHEN );
			setState(1474);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(1473);
				caseElse_();
				}
			}

			setState(1476);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaseWhen_Context extends ParserRuleContext {
		public TerminalNode WHEN() { return getToken(MySQLStatementParser.WHEN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode THEN() { return getToken(MySQLStatementParser.THEN, 0); }
		public CaseWhen_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseWhen_; }
	}

	public final CaseWhen_Context caseWhen_() throws RecognitionException {
		CaseWhen_Context _localctx = new CaseWhen_Context(_ctx, getState());
		enterRule(_localctx, 204, RULE_caseWhen_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1478);
			match(WHEN);
			setState(1479);
			expr(0);
			setState(1480);
			match(THEN);
			setState(1481);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaseElse_Context extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(MySQLStatementParser.ELSE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public CaseElse_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseElse_; }
	}

	public final CaseElse_Context caseElse_() throws RecognitionException {
		CaseElse_Context _localctx = new CaseElse_Context(_ctx, getState());
		enterRule(_localctx, 206, RULE_caseElse_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1483);
			match(ELSE);
			setState(1484);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntervalExpression_Context extends ParserRuleContext {
		public TerminalNode INTERVAL() { return getToken(MySQLStatementParser.INTERVAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public IntervalUnit_Context intervalUnit_() {
			return getRuleContext(IntervalUnit_Context.class,0);
		}
		public IntervalExpression_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intervalExpression_; }
	}

	public final IntervalExpression_Context intervalExpression_() throws RecognitionException {
		IntervalExpression_Context _localctx = new IntervalExpression_Context(_ctx, getState());
		enterRule(_localctx, 208, RULE_intervalExpression_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1486);
			match(INTERVAL);
			setState(1487);
			expr(0);
			setState(1488);
			intervalUnit_();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntervalUnit_Context extends ParserRuleContext {
		public TerminalNode MICROSECOND() { return getToken(MySQLStatementParser.MICROSECOND, 0); }
		public TerminalNode SECOND() { return getToken(MySQLStatementParser.SECOND, 0); }
		public TerminalNode MINUTE() { return getToken(MySQLStatementParser.MINUTE, 0); }
		public TerminalNode HOUR() { return getToken(MySQLStatementParser.HOUR, 0); }
		public TerminalNode DAY() { return getToken(MySQLStatementParser.DAY, 0); }
		public TerminalNode WEEK() { return getToken(MySQLStatementParser.WEEK, 0); }
		public TerminalNode MONTH() { return getToken(MySQLStatementParser.MONTH, 0); }
		public TerminalNode QUARTER() { return getToken(MySQLStatementParser.QUARTER, 0); }
		public TerminalNode YEAR() { return getToken(MySQLStatementParser.YEAR, 0); }
		public TerminalNode SECOND_MICROSECOND() { return getToken(MySQLStatementParser.SECOND_MICROSECOND, 0); }
		public TerminalNode MINUTE_MICROSECOND() { return getToken(MySQLStatementParser.MINUTE_MICROSECOND, 0); }
		public TerminalNode MINUTE_SECOND() { return getToken(MySQLStatementParser.MINUTE_SECOND, 0); }
		public TerminalNode HOUR_MICROSECOND() { return getToken(MySQLStatementParser.HOUR_MICROSECOND, 0); }
		public TerminalNode HOUR_SECOND() { return getToken(MySQLStatementParser.HOUR_SECOND, 0); }
		public TerminalNode HOUR_MINUTE() { return getToken(MySQLStatementParser.HOUR_MINUTE, 0); }
		public TerminalNode DAY_MICROSECOND() { return getToken(MySQLStatementParser.DAY_MICROSECOND, 0); }
		public TerminalNode DAY_SECOND() { return getToken(MySQLStatementParser.DAY_SECOND, 0); }
		public TerminalNode DAY_MINUTE() { return getToken(MySQLStatementParser.DAY_MINUTE, 0); }
		public TerminalNode DAY_HOUR() { return getToken(MySQLStatementParser.DAY_HOUR, 0); }
		public TerminalNode YEAR_MONTH() { return getToken(MySQLStatementParser.YEAR_MONTH, 0); }
		public IntervalUnit_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intervalUnit_; }
	}

	public final IntervalUnit_Context intervalUnit_() throws RecognitionException {
		IntervalUnit_Context _localctx = new IntervalUnit_Context(_ctx, getState());
		enterRule(_localctx, 210, RULE_intervalUnit_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1490);
			_la = _input.LA(1);
			if ( !(((((_la - 294)) & ~0x3f) == 0 && ((1L << (_la - 294)) & ((1L << (MICROSECOND - 294)) | (1L << (SECOND - 294)) | (1L << (MINUTE - 294)) | (1L << (HOUR - 294)) | (1L << (DAY - 294)) | (1L << (WEEK - 294)) | (1L << (MONTH - 294)) | (1L << (QUARTER - 294)) | (1L << (YEAR - 294)) | (1L << (SECOND_MICROSECOND - 294)) | (1L << (MINUTE_MICROSECOND - 294)) | (1L << (MINUTE_SECOND - 294)) | (1L << (HOUR_MICROSECOND - 294)) | (1L << (HOUR_SECOND - 294)) | (1L << (HOUR_MINUTE - 294)) | (1L << (DAY_MICROSECOND - 294)) | (1L << (DAY_SECOND - 294)) | (1L << (DAY_MINUTE - 294)) | (1L << (DAY_HOUR - 294)) | (1L << (YEAR_MONTH - 294)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrderByClauseContext extends ParserRuleContext {
		public TerminalNode ORDER() { return getToken(MySQLStatementParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(MySQLStatementParser.BY, 0); }
		public List<OrderByItemContext> orderByItem() {
			return getRuleContexts(OrderByItemContext.class);
		}
		public OrderByItemContext orderByItem(int i) {
			return getRuleContext(OrderByItemContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(MySQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(MySQLStatementParser.COMMA_, i);
		}
		public OrderByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderByClause; }
	}

	public final OrderByClauseContext orderByClause() throws RecognitionException {
		OrderByClauseContext _localctx = new OrderByClauseContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_orderByClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1492);
			match(ORDER);
			setState(1493);
			match(BY);
			setState(1494);
			orderByItem();
			setState(1499);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(1495);
				match(COMMA_);
				setState(1496);
				orderByItem();
				}
				}
				setState(1501);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrderByItemContext extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public NumberLiteralsContext numberLiterals() {
			return getRuleContext(NumberLiteralsContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ASC() { return getToken(MySQLStatementParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(MySQLStatementParser.DESC, 0); }
		public OrderByItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderByItem; }
	}

	public final OrderByItemContext orderByItem() throws RecognitionException {
		OrderByItemContext _localctx = new OrderByItemContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_orderByItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1505);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
			case 1:
				{
				setState(1502);
				columnName();
				}
				break;
			case 2:
				{
				setState(1503);
				numberLiterals();
				}
				break;
			case 3:
				{
				setState(1504);
				expr(0);
				}
				break;
			}
			setState(1508);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(1507);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataTypeContext extends ParserRuleContext {
		public DataTypeName_Context dataTypeName_() {
			return getRuleContext(DataTypeName_Context.class,0);
		}
		public DataTypeLengthContext dataTypeLength() {
			return getRuleContext(DataTypeLengthContext.class,0);
		}
		public CharacterSet_Context characterSet_() {
			return getRuleContext(CharacterSet_Context.class,0);
		}
		public CollateClause_Context collateClause_() {
			return getRuleContext(CollateClause_Context.class,0);
		}
		public TerminalNode UNSIGNED() { return getToken(MySQLStatementParser.UNSIGNED, 0); }
		public TerminalNode ZEROFILL() { return getToken(MySQLStatementParser.ZEROFILL, 0); }
		public TerminalNode LP_() { return getToken(MySQLStatementParser.LP_, 0); }
		public List<TerminalNode> STRING_() { return getTokens(MySQLStatementParser.STRING_); }
		public TerminalNode STRING_(int i) {
			return getToken(MySQLStatementParser.STRING_, i);
		}
		public TerminalNode RP_() { return getToken(MySQLStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(MySQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(MySQLStatementParser.COMMA_, i);
		}
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_dataType);
		int _la;
		try {
			setState(1543);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,170,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1510);
				dataTypeName_();
				setState(1512);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LP_) {
					{
					setState(1511);
					dataTypeLength();
					}
				}

				setState(1515);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 105)) & ~0x3f) == 0 && ((1L << (_la - 105)) & ((1L << (CHAR - 105)) | (1L << (CHARACTER - 105)) | (1L << (CHARSET - 105)))) != 0)) {
					{
					setState(1514);
					characterSet_();
					}
				}

				setState(1518);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
				case 1:
					{
					setState(1517);
					collateClause_();
					}
					break;
				}
				setState(1521);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==UNSIGNED) {
					{
					setState(1520);
					match(UNSIGNED);
					}
				}

				setState(1524);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ZEROFILL) {
					{
					setState(1523);
					match(ZEROFILL);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1526);
				dataTypeName_();
				setState(1527);
				match(LP_);
				setState(1528);
				match(STRING_);
				setState(1533);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(1529);
					match(COMMA_);
					setState(1530);
					match(STRING_);
					}
					}
					setState(1535);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1536);
				match(RP_);
				setState(1538);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 105)) & ~0x3f) == 0 && ((1L << (_la - 105)) & ((1L << (CHAR - 105)) | (1L << (CHARACTER - 105)) | (1L << (CHARSET - 105)))) != 0)) {
					{
					setState(1537);
					characterSet_();
					}
				}

				setState(1541);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,169,_ctx) ) {
				case 1:
					{
					setState(1540);
					collateClause_();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataTypeName_Context extends ParserRuleContext {
		public List<Identifier_Context> identifier_() {
			return getRuleContexts(Identifier_Context.class);
		}
		public Identifier_Context identifier_(int i) {
			return getRuleContext(Identifier_Context.class,i);
		}
		public DataTypeName_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataTypeName_; }
	}

	public final DataTypeName_Context dataTypeName_() throws RecognitionException {
		DataTypeName_Context _localctx = new DataTypeName_Context(_ctx, getState());
		enterRule(_localctx, 218, RULE_dataTypeName_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1545);
			identifier_();
			setState(1547);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
			case 1:
				{
				setState(1546);
				identifier_();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataTypeLengthContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(MySQLStatementParser.LP_, 0); }
		public List<TerminalNode> NUMBER_() { return getTokens(MySQLStatementParser.NUMBER_); }
		public TerminalNode NUMBER_(int i) {
			return getToken(MySQLStatementParser.NUMBER_, i);
		}
		public TerminalNode RP_() { return getToken(MySQLStatementParser.RP_, 0); }
		public TerminalNode COMMA_() { return getToken(MySQLStatementParser.COMMA_, 0); }
		public DataTypeLengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataTypeLength; }
	}

	public final DataTypeLengthContext dataTypeLength() throws RecognitionException {
		DataTypeLengthContext _localctx = new DataTypeLengthContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_dataTypeLength);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1549);
			match(LP_);
			setState(1550);
			match(NUMBER_);
			setState(1553);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA_) {
				{
				setState(1551);
				match(COMMA_);
				setState(1552);
				match(NUMBER_);
				}
			}

			setState(1555);
			match(RP_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CharacterSet_Context extends ParserRuleContext {
		public TerminalNode SET() { return getToken(MySQLStatementParser.SET, 0); }
		public IgnoredIdentifier_Context ignoredIdentifier_() {
			return getRuleContext(IgnoredIdentifier_Context.class,0);
		}
		public TerminalNode CHARACTER() { return getToken(MySQLStatementParser.CHARACTER, 0); }
		public TerminalNode CHAR() { return getToken(MySQLStatementParser.CHAR, 0); }
		public TerminalNode EQ_() { return getToken(MySQLStatementParser.EQ_, 0); }
		public TerminalNode CHARSET() { return getToken(MySQLStatementParser.CHARSET, 0); }
		public CharacterSet_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_characterSet_; }
	}

	public final CharacterSet_Context characterSet_() throws RecognitionException {
		CharacterSet_Context _localctx = new CharacterSet_Context(_ctx, getState());
		enterRule(_localctx, 222, RULE_characterSet_);
		int _la;
		try {
			setState(1568);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHAR:
			case CHARACTER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1557);
				_la = _input.LA(1);
				if ( !(_la==CHAR || _la==CHARACTER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1558);
				match(SET);
				setState(1560);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ_) {
					{
					setState(1559);
					match(EQ_);
					}
				}

				setState(1562);
				ignoredIdentifier_();
				}
				break;
			case CHARSET:
				enterOuterAlt(_localctx, 2);
				{
				setState(1563);
				match(CHARSET);
				setState(1565);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ_) {
					{
					setState(1564);
					match(EQ_);
					}
				}

				setState(1567);
				ignoredIdentifier_();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CollateClause_Context extends ParserRuleContext {
		public TerminalNode COLLATE() { return getToken(MySQLStatementParser.COLLATE, 0); }
		public TerminalNode STRING_() { return getToken(MySQLStatementParser.STRING_, 0); }
		public IgnoredIdentifier_Context ignoredIdentifier_() {
			return getRuleContext(IgnoredIdentifier_Context.class,0);
		}
		public TerminalNode EQ_() { return getToken(MySQLStatementParser.EQ_, 0); }
		public CollateClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collateClause_; }
	}

	public final CollateClause_Context collateClause_() throws RecognitionException {
		CollateClause_Context _localctx = new CollateClause_Context(_ctx, getState());
		enterRule(_localctx, 224, RULE_collateClause_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1570);
			match(COLLATE);
			setState(1572);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ_) {
				{
				setState(1571);
				match(EQ_);
				}
			}

			setState(1576);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_:
				{
				setState(1574);
				match(STRING_);
				}
				break;
			case ANY:
			case DATE:
			case ESCAPE:
			case OFFSET:
			case ROLLUP:
			case SOUNDS:
			case TIME:
			case TIMESTAMP:
			case UNKNOWN:
			case ALWAYS:
			case COMMIT:
			case COMMITTED:
			case CURRENT:
			case DISABLE:
			case ENABLE:
			case LEVEL:
			case NO:
			case PASSWORD:
			case PRIVILEGES:
			case ROLLBACK:
			case START:
			case TRANSACTION:
			case TRUNCATE:
			case ACCOUNT:
			case ACTION:
			case AFTER:
			case ALGORITHM:
			case AUTO_INCREMENT:
			case AVG_ROW_LENGTH:
			case BEGIN:
			case BTREE:
			case CHAIN:
			case CHARSET:
			case CHECKSUM:
			case CIPHER:
			case CLIENT:
			case COALESCE:
			case COLUMNS:
			case COLUMN_FORMAT:
			case COMMENT:
			case COMPACT:
			case COMPRESSED:
			case COMPRESSION:
			case CONNECTION:
			case CONSISTENT:
			case DATA:
			case DELAY_KEY_WRITE:
			case DISCARD:
			case DISK:
			case DUPLICATE:
			case ENCRYPTION:
			case END:
			case ENGINE:
			case EVENT:
			case EXCHANGE:
			case EXECUTE:
			case FILE:
			case FIRST:
			case FIXED:
			case FOLLOWING:
			case GLOBAL:
			case HASH:
			case IMPORT_:
			case INSERT_METHOD:
			case KEY_BLOCK_SIZE:
			case LAST:
			case LESS:
			case MAX_ROWS:
			case MEMORY:
			case MIN_ROWS:
			case MODIFY:
			case NONE:
			case PACK_KEYS:
			case PARSER:
			case PARTIAL:
			case PARTITIONING:
			case PERSIST:
			case PERSIST_ONLY:
			case PRECEDING:
			case PROCESS:
			case PROXY:
			case QUICK:
			case REBUILD:
			case REDUNDANT:
			case RELOAD:
			case REMOVE:
			case REORGANIZE:
			case REPAIR:
			case REVERSE:
			case ROW_FORMAT:
			case SAVEPOINT:
			case SESSION:
			case SHUTDOWN:
			case SIMPLE:
			case SLAVE:
			case SQL_BIG_RESULT:
			case SQL_BUFFER_RESULT:
			case SQL_CACHE:
			case SQL_NO_CACHE:
			case STATS_AUTO_RECALC:
			case STATS_PERSISTENT:
			case STATS_SAMPLE_PAGES:
			case STORAGE:
			case SUBPARTITION:
			case SUPER:
			case TABLES:
			case TABLESPACE:
			case TEMPORARY:
			case THAN:
			case UNBOUNDED:
			case UPGRADE:
			case VALIDATION:
			case VALUE:
			case VIEW:
			case WEIGHT_STRING:
			case WITHOUT:
			case VISIBLE:
			case INVISIBLE:
			case ENFORCED:
			case MICROSECOND:
			case SECOND:
			case MINUTE:
			case HOUR:
			case DAY:
			case WEEK:
			case MONTH:
			case QUARTER:
			case YEAR:
			case AGAINST:
			case LANGUAGE:
			case MODE:
			case QUERY:
			case EXPANSION:
			case BOOLEAN:
			case MAX:
			case MIN:
			case SUM:
			case COUNT:
			case AVG:
			case BIT_AND:
			case BIT_OR:
			case BIT_XOR:
			case GROUP_CONCAT:
			case JSON_ARRAYAGG:
			case JSON_OBJECTAGG:
			case STD:
			case STDDEV:
			case STDDEV_POP:
			case STDDEV_SAMP:
			case VAR_POP:
			case VAR_SAMP:
			case VARIANCE:
			case IDENTIFIER_:
				{
				setState(1575);
				ignoredIdentifier_();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IgnoredIdentifier_Context extends ParserRuleContext {
		public List<Identifier_Context> identifier_() {
			return getRuleContexts(Identifier_Context.class);
		}
		public Identifier_Context identifier_(int i) {
			return getRuleContext(Identifier_Context.class,i);
		}
		public TerminalNode DOT_() { return getToken(MySQLStatementParser.DOT_, 0); }
		public IgnoredIdentifier_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ignoredIdentifier_; }
	}

	public final IgnoredIdentifier_Context ignoredIdentifier_() throws RecognitionException {
		IgnoredIdentifier_Context _localctx = new IgnoredIdentifier_Context(_ctx, getState());
		enterRule(_localctx, 226, RULE_ignoredIdentifier_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1578);
			identifier_();
			setState(1581);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT_) {
				{
				setState(1579);
				match(DOT_);
				setState(1580);
				identifier_();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IgnoredIdentifiers_Context extends ParserRuleContext {
		public List<IgnoredIdentifier_Context> ignoredIdentifier_() {
			return getRuleContexts(IgnoredIdentifier_Context.class);
		}
		public IgnoredIdentifier_Context ignoredIdentifier_(int i) {
			return getRuleContext(IgnoredIdentifier_Context.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(MySQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(MySQLStatementParser.COMMA_, i);
		}
		public IgnoredIdentifiers_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ignoredIdentifiers_; }
	}

	public final IgnoredIdentifiers_Context ignoredIdentifiers_() throws RecognitionException {
		IgnoredIdentifiers_Context _localctx = new IgnoredIdentifiers_Context(_ctx, getState());
		enterRule(_localctx, 228, RULE_ignoredIdentifiers_);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1583);
			ignoredIdentifier_();
			setState(1588);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,179,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1584);
					match(COMMA_);
					setState(1585);
					ignoredIdentifier_();
					}
					} 
				}
				setState(1590);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,179,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateTableContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(MySQLStatementParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(MySQLStatementParser.TABLE, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode LP_() { return getToken(MySQLStatementParser.LP_, 0); }
		public CreateDefinitions_Context createDefinitions_() {
			return getRuleContext(CreateDefinitions_Context.class,0);
		}
		public TerminalNode RP_() { return getToken(MySQLStatementParser.RP_, 0); }
		public CreateLike_Context createLike_() {
			return getRuleContext(CreateLike_Context.class,0);
		}
		public TerminalNode TEMPORARY() { return getToken(MySQLStatementParser.TEMPORARY, 0); }
		public TerminalNode IF() { return getToken(MySQLStatementParser.IF, 0); }
		public TerminalNode NOT() { return getToken(MySQLStatementParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(MySQLStatementParser.EXISTS, 0); }
		public CreateTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTable; }
	}

	public final CreateTableContext createTable() throws RecognitionException {
		CreateTableContext _localctx = new CreateTableContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_createTable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1591);
			match(CREATE);
			setState(1593);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TEMPORARY) {
				{
				setState(1592);
				match(TEMPORARY);
				}
			}

			setState(1595);
			match(TABLE);
			setState(1599);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(1596);
				match(IF);
				setState(1597);
				match(NOT);
				setState(1598);
				match(EXISTS);
				}
			}

			setState(1601);
			tableName();
			setState(1607);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,182,_ctx) ) {
			case 1:
				{
				setState(1602);
				match(LP_);
				setState(1603);
				createDefinitions_();
				setState(1604);
				match(RP_);
				}
				break;
			case 2:
				{
				setState(1606);
				createLike_();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateDefinitions_Context extends ParserRuleContext {
		public List<CreateDefinition_Context> createDefinition_() {
			return getRuleContexts(CreateDefinition_Context.class);
		}
		public CreateDefinition_Context createDefinition_(int i) {
			return getRuleContext(CreateDefinition_Context.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(MySQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(MySQLStatementParser.COMMA_, i);
		}
		public CreateDefinitions_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createDefinitions_; }
	}

	public final CreateDefinitions_Context createDefinitions_() throws RecognitionException {
		CreateDefinitions_Context _localctx = new CreateDefinitions_Context(_ctx, getState());
		enterRule(_localctx, 232, RULE_createDefinitions_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1609);
			createDefinition_();
			setState(1614);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(1610);
				match(COMMA_);
				setState(1611);
				createDefinition_();
				}
				}
				setState(1616);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateDefinition_Context extends ParserRuleContext {
		public ColumnDefinitionContext columnDefinition() {
			return getRuleContext(ColumnDefinitionContext.class,0);
		}
		public IndexDefinition_Context indexDefinition_() {
			return getRuleContext(IndexDefinition_Context.class,0);
		}
		public ConstraintDefinition_Context constraintDefinition_() {
			return getRuleContext(ConstraintDefinition_Context.class,0);
		}
		public CheckConstraintDefinition_Context checkConstraintDefinition_() {
			return getRuleContext(CheckConstraintDefinition_Context.class,0);
		}
		public CreateDefinition_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createDefinition_; }
	}

	public final CreateDefinition_Context createDefinition_() throws RecognitionException {
		CreateDefinition_Context _localctx = new CreateDefinition_Context(_ctx, getState());
		enterRule(_localctx, 234, RULE_createDefinition_);
		try {
			setState(1621);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,184,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1617);
				columnDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1618);
				indexDefinition_();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1619);
				constraintDefinition_();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1620);
				checkConstraintDefinition_();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnDefinitionContext extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public List<InlineDataType_Context> inlineDataType_() {
			return getRuleContexts(InlineDataType_Context.class);
		}
		public InlineDataType_Context inlineDataType_(int i) {
			return getRuleContext(InlineDataType_Context.class,i);
		}
		public List<GeneratedDataType_Context> generatedDataType_() {
			return getRuleContexts(GeneratedDataType_Context.class);
		}
		public GeneratedDataType_Context generatedDataType_(int i) {
			return getRuleContext(GeneratedDataType_Context.class,i);
		}
		public ColumnDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnDefinition; }
	}

	public final ColumnDefinitionContext columnDefinition() throws RecognitionException {
		ColumnDefinitionContext _localctx = new ColumnDefinitionContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_columnDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1623);
			columnName();
			setState(1624);
			dataType();
			setState(1637);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,187,_ctx) ) {
			case 1:
				{
				setState(1628);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEY) | (1L << NOT) | (1L << NULL) | (1L << PRIMARY) | (1L << CHECK) | (1L << CONSTRAINT) | (1L << DEFAULT))) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (REFERENCES - 76)) | (1L << (UNIQUE - 76)) | (1L << (AUTO_INCREMENT - 76)) | (1L << (COLLATE - 76)) | (1L << (COLUMN_FORMAT - 76)) | (1L << (COMMENT - 76)))) != 0) || _la==STORAGE) {
					{
					{
					setState(1625);
					inlineDataType_();
					}
					}
					setState(1630);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(1634);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEY) | (1L << NOT) | (1L << NULL) | (1L << PRIMARY) | (1L << AS) | (1L << CHECK) | (1L << CONSTRAINT))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (GENERATED - 66)) | (1L << (REFERENCES - 66)) | (1L << (UNIQUE - 66)) | (1L << (COLLATE - 66)) | (1L << (COMMENT - 66)))) != 0) || _la==STORED || _la==VIRTUAL) {
					{
					{
					setState(1631);
					generatedDataType_();
					}
					}
					setState(1636);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InlineDataType_Context extends ParserRuleContext {
		public CommonDataTypeOption_Context commonDataTypeOption_() {
			return getRuleContext(CommonDataTypeOption_Context.class,0);
		}
		public TerminalNode AUTO_INCREMENT() { return getToken(MySQLStatementParser.AUTO_INCREMENT, 0); }
		public TerminalNode DEFAULT() { return getToken(MySQLStatementParser.DEFAULT, 0); }
		public LiteralsContext literals() {
			return getRuleContext(LiteralsContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode COLUMN_FORMAT() { return getToken(MySQLStatementParser.COLUMN_FORMAT, 0); }
		public TerminalNode FIXED() { return getToken(MySQLStatementParser.FIXED, 0); }
		public TerminalNode DYNAMIC() { return getToken(MySQLStatementParser.DYNAMIC, 0); }
		public TerminalNode STORAGE() { return getToken(MySQLStatementParser.STORAGE, 0); }
		public TerminalNode DISK() { return getToken(MySQLStatementParser.DISK, 0); }
		public TerminalNode MEMORY() { return getToken(MySQLStatementParser.MEMORY, 0); }
		public InlineDataType_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inlineDataType_; }
	}

	public final InlineDataType_Context inlineDataType_() throws RecognitionException {
		InlineDataType_Context _localctx = new InlineDataType_Context(_ctx, getState());
		enterRule(_localctx, 238, RULE_inlineDataType_);
		int _la;
		try {
			setState(1650);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KEY:
			case NOT:
			case NULL:
			case PRIMARY:
			case CHECK:
			case CONSTRAINT:
			case REFERENCES:
			case UNIQUE:
			case COLLATE:
			case COMMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1639);
				commonDataTypeOption_();
				}
				break;
			case AUTO_INCREMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1640);
				match(AUTO_INCREMENT);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1641);
				match(DEFAULT);
				setState(1644);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,188,_ctx) ) {
				case 1:
					{
					setState(1642);
					literals();
					}
					break;
				case 2:
					{
					setState(1643);
					expr(0);
					}
					break;
				}
				}
				break;
			case COLUMN_FORMAT:
				enterOuterAlt(_localctx, 4);
				{
				setState(1646);
				match(COLUMN_FORMAT);
				setState(1647);
				_la = _input.LA(1);
				if ( !(_la==DEFAULT || _la==DYNAMIC || _la==FIXED) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case STORAGE:
				enterOuterAlt(_localctx, 5);
				{
				setState(1648);
				match(STORAGE);
				setState(1649);
				_la = _input.LA(1);
				if ( !(_la==DEFAULT || _la==DISK || _la==MEMORY) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GeneratedDataType_Context extends ParserRuleContext {
		public CommonDataTypeOption_Context commonDataTypeOption_() {
			return getRuleContext(CommonDataTypeOption_Context.class,0);
		}
		public TerminalNode AS() { return getToken(MySQLStatementParser.AS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode GENERATED() { return getToken(MySQLStatementParser.GENERATED, 0); }
		public TerminalNode ALWAYS() { return getToken(MySQLStatementParser.ALWAYS, 0); }
		public TerminalNode VIRTUAL() { return getToken(MySQLStatementParser.VIRTUAL, 0); }
		public TerminalNode STORED() { return getToken(MySQLStatementParser.STORED, 0); }
		public GeneratedDataType_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generatedDataType_; }
	}

	public final GeneratedDataType_Context generatedDataType_() throws RecognitionException {
		GeneratedDataType_Context _localctx = new GeneratedDataType_Context(_ctx, getState());
		enterRule(_localctx, 240, RULE_generatedDataType_);
		int _la;
		try {
			setState(1660);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KEY:
			case NOT:
			case NULL:
			case PRIMARY:
			case CHECK:
			case CONSTRAINT:
			case REFERENCES:
			case UNIQUE:
			case COLLATE:
			case COMMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1652);
				commonDataTypeOption_();
				}
				break;
			case AS:
			case GENERATED:
				enterOuterAlt(_localctx, 2);
				{
				setState(1655);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GENERATED) {
					{
					setState(1653);
					match(GENERATED);
					setState(1654);
					match(ALWAYS);
					}
				}

				setState(1657);
				match(AS);
				setState(1658);
				expr(0);
				}
				break;
			case STORED:
			case VIRTUAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(1659);
				_la = _input.LA(1);
				if ( !(_la==STORED || _la==VIRTUAL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommonDataTypeOption_Context extends ParserRuleContext {
		public PrimaryKeyContext primaryKey() {
			return getRuleContext(PrimaryKeyContext.class,0);
		}
		public TerminalNode UNIQUE() { return getToken(MySQLStatementParser.UNIQUE, 0); }
		public TerminalNode KEY() { return getToken(MySQLStatementParser.KEY, 0); }
		public TerminalNode NULL() { return getToken(MySQLStatementParser.NULL, 0); }
		public TerminalNode NOT() { return getToken(MySQLStatementParser.NOT, 0); }
		public CollateClause_Context collateClause_() {
			return getRuleContext(CollateClause_Context.class,0);
		}
		public CheckConstraintDefinition_Context checkConstraintDefinition_() {
			return getRuleContext(CheckConstraintDefinition_Context.class,0);
		}
		public ReferenceDefinition_Context referenceDefinition_() {
			return getRuleContext(ReferenceDefinition_Context.class,0);
		}
		public TerminalNode COMMENT() { return getToken(MySQLStatementParser.COMMENT, 0); }
		public TerminalNode STRING_() { return getToken(MySQLStatementParser.STRING_, 0); }
		public CommonDataTypeOption_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commonDataTypeOption_; }
	}

	public final CommonDataTypeOption_Context commonDataTypeOption_() throws RecognitionException {
		CommonDataTypeOption_Context _localctx = new CommonDataTypeOption_Context(_ctx, getState());
		enterRule(_localctx, 242, RULE_commonDataTypeOption_);
		int _la;
		try {
			setState(1676);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KEY:
			case PRIMARY:
				enterOuterAlt(_localctx, 1);
				{
				setState(1662);
				primaryKey();
				}
				break;
			case UNIQUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1663);
				match(UNIQUE);
				setState(1665);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,192,_ctx) ) {
				case 1:
					{
					setState(1664);
					match(KEY);
					}
					break;
				}
				}
				break;
			case NOT:
			case NULL:
				enterOuterAlt(_localctx, 3);
				{
				setState(1668);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1667);
					match(NOT);
					}
				}

				setState(1670);
				match(NULL);
				}
				break;
			case COLLATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(1671);
				collateClause_();
				}
				break;
			case CHECK:
			case CONSTRAINT:
				enterOuterAlt(_localctx, 5);
				{
				setState(1672);
				checkConstraintDefinition_();
				}
				break;
			case REFERENCES:
				enterOuterAlt(_localctx, 6);
				{
				setState(1673);
				referenceDefinition_();
				}
				break;
			case COMMENT:
				enterOuterAlt(_localctx, 7);
				{
				setState(1674);
				match(COMMENT);
				setState(1675);
				match(STRING_);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReferenceDefinition_Context extends ParserRuleContext {
		public TerminalNode REFERENCES() { return getToken(MySQLStatementParser.REFERENCES, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public KeyParts_Context keyParts_() {
			return getRuleContext(KeyParts_Context.class,0);
		}
		public TerminalNode MATCH() { return getToken(MySQLStatementParser.MATCH, 0); }
		public TerminalNode FULL() { return getToken(MySQLStatementParser.FULL, 0); }
		public TerminalNode PARTIAL() { return getToken(MySQLStatementParser.PARTIAL, 0); }
		public TerminalNode SIMPLE() { return getToken(MySQLStatementParser.SIMPLE, 0); }
		public List<TerminalNode> ON() { return getTokens(MySQLStatementParser.ON); }
		public TerminalNode ON(int i) {
			return getToken(MySQLStatementParser.ON, i);
		}
		public List<ReferenceOption_Context> referenceOption_() {
			return getRuleContexts(ReferenceOption_Context.class);
		}
		public ReferenceOption_Context referenceOption_(int i) {
			return getRuleContext(ReferenceOption_Context.class,i);
		}
		public List<TerminalNode> UPDATE() { return getTokens(MySQLStatementParser.UPDATE); }
		public TerminalNode UPDATE(int i) {
			return getToken(MySQLStatementParser.UPDATE, i);
		}
		public List<TerminalNode> DELETE() { return getTokens(MySQLStatementParser.DELETE); }
		public TerminalNode DELETE(int i) {
			return getToken(MySQLStatementParser.DELETE, i);
		}
		public ReferenceDefinition_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_referenceDefinition_; }
	}

	public final ReferenceDefinition_Context referenceDefinition_() throws RecognitionException {
		ReferenceDefinition_Context _localctx = new ReferenceDefinition_Context(_ctx, getState());
		enterRule(_localctx, 244, RULE_referenceDefinition_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1678);
			match(REFERENCES);
			setState(1679);
			tableName();
			setState(1680);
			keyParts_();
			setState(1687);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,195,_ctx) ) {
			case 1:
				{
				setState(1681);
				match(MATCH);
				setState(1682);
				match(FULL);
				}
				break;
			case 2:
				{
				setState(1683);
				match(MATCH);
				setState(1684);
				match(PARTIAL);
				}
				break;
			case 3:
				{
				setState(1685);
				match(MATCH);
				setState(1686);
				match(SIMPLE);
				}
				break;
			}
			setState(1694);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ON) {
				{
				{
				setState(1689);
				match(ON);
				setState(1690);
				_la = _input.LA(1);
				if ( !(_la==DELETE || _la==UPDATE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1691);
				referenceOption_();
				}
				}
				setState(1696);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReferenceOption_Context extends ParserRuleContext {
		public TerminalNode RESTRICT() { return getToken(MySQLStatementParser.RESTRICT, 0); }
		public TerminalNode CASCADE() { return getToken(MySQLStatementParser.CASCADE, 0); }
		public TerminalNode SET() { return getToken(MySQLStatementParser.SET, 0); }
		public TerminalNode NULL() { return getToken(MySQLStatementParser.NULL, 0); }
		public TerminalNode NO() { return getToken(MySQLStatementParser.NO, 0); }
		public TerminalNode ACTION() { return getToken(MySQLStatementParser.ACTION, 0); }
		public TerminalNode DEFAULT() { return getToken(MySQLStatementParser.DEFAULT, 0); }
		public ReferenceOption_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_referenceOption_; }
	}

	public final ReferenceOption_Context referenceOption_() throws RecognitionException {
		ReferenceOption_Context _localctx = new ReferenceOption_Context(_ctx, getState());
		enterRule(_localctx, 246, RULE_referenceOption_);
		try {
			setState(1705);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,197,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1697);
				match(RESTRICT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1698);
				match(CASCADE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1699);
				match(SET);
				setState(1700);
				match(NULL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1701);
				match(NO);
				setState(1702);
				match(ACTION);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1703);
				match(SET);
				setState(1704);
				match(DEFAULT);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IndexDefinition_Context extends ParserRuleContext {
		public KeyParts_Context keyParts_() {
			return getRuleContext(KeyParts_Context.class,0);
		}
		public IndexNameContext indexName() {
			return getRuleContext(IndexNameContext.class,0);
		}
		public IndexType_Context indexType_() {
			return getRuleContext(IndexType_Context.class,0);
		}
		public List<IndexOption_Context> indexOption_() {
			return getRuleContexts(IndexOption_Context.class);
		}
		public IndexOption_Context indexOption_(int i) {
			return getRuleContext(IndexOption_Context.class,i);
		}
		public TerminalNode FULLTEXT() { return getToken(MySQLStatementParser.FULLTEXT, 0); }
		public TerminalNode SPATIAL() { return getToken(MySQLStatementParser.SPATIAL, 0); }
		public TerminalNode INDEX() { return getToken(MySQLStatementParser.INDEX, 0); }
		public TerminalNode KEY() { return getToken(MySQLStatementParser.KEY, 0); }
		public IndexDefinition_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexDefinition_; }
	}

	public final IndexDefinition_Context indexDefinition_() throws RecognitionException {
		IndexDefinition_Context _localctx = new IndexDefinition_Context(_ctx, getState());
		enterRule(_localctx, 248, RULE_indexDefinition_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1708);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FULLTEXT || _la==SPATIAL) {
				{
				setState(1707);
				_la = _input.LA(1);
				if ( !(_la==FULLTEXT || _la==SPATIAL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1711);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KEY || _la==INDEX) {
				{
				setState(1710);
				_la = _input.LA(1);
				if ( !(_la==KEY || _la==INDEX) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1714);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ANY) | (1L << DATE) | (1L << ESCAPE) | (1L << OFFSET) | (1L << ROLLUP) | (1L << SOUNDS) | (1L << TIME) | (1L << TIMESTAMP) | (1L << UNKNOWN) | (1L << ALWAYS) | (1L << COMMIT) | (1L << COMMITTED) | (1L << CURRENT) | (1L << DISABLE) | (1L << ENABLE))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (LEVEL - 69)) | (1L << (NO - 69)) | (1L << (PASSWORD - 69)) | (1L << (PRIVILEGES - 69)) | (1L << (ROLLBACK - 69)) | (1L << (START - 69)) | (1L << (TRANSACTION - 69)) | (1L << (TRUNCATE - 69)) | (1L << (ACCOUNT - 69)) | (1L << (ACTION - 69)) | (1L << (AFTER - 69)) | (1L << (ALGORITHM - 69)) | (1L << (AUTO_INCREMENT - 69)) | (1L << (AVG_ROW_LENGTH - 69)) | (1L << (BEGIN - 69)) | (1L << (BTREE - 69)) | (1L << (CHAIN - 69)) | (1L << (CHARSET - 69)) | (1L << (CHECKSUM - 69)) | (1L << (CIPHER - 69)) | (1L << (CLIENT - 69)) | (1L << (COALESCE - 69)) | (1L << (COLUMNS - 69)) | (1L << (COLUMN_FORMAT - 69)) | (1L << (COMMENT - 69)) | (1L << (COMPACT - 69)) | (1L << (COMPRESSED - 69)) | (1L << (COMPRESSION - 69)) | (1L << (CONNECTION - 69)) | (1L << (CONSISTENT - 69)) | (1L << (DATA - 69)) | (1L << (DELAY_KEY_WRITE - 69)) | (1L << (DISCARD - 69)) | (1L << (DISK - 69)))) != 0) || ((((_la - 135)) & ~0x3f) == 0 && ((1L << (_la - 135)) & ((1L << (DUPLICATE - 135)) | (1L << (ENCRYPTION - 135)) | (1L << (END - 135)) | (1L << (ENGINE - 135)) | (1L << (EVENT - 135)) | (1L << (EXCHANGE - 135)) | (1L << (EXECUTE - 135)) | (1L << (FILE - 135)) | (1L << (FIRST - 135)) | (1L << (FIXED - 135)) | (1L << (FOLLOWING - 135)) | (1L << (GLOBAL - 135)) | (1L << (HASH - 135)) | (1L << (IMPORT_ - 135)) | (1L << (INSERT_METHOD - 135)) | (1L << (KEY_BLOCK_SIZE - 135)) | (1L << (LAST - 135)) | (1L << (LESS - 135)) | (1L << (MAX_ROWS - 135)) | (1L << (MEMORY - 135)) | (1L << (MIN_ROWS - 135)) | (1L << (MODIFY - 135)) | (1L << (NONE - 135)) | (1L << (PACK_KEYS - 135)) | (1L << (PARSER - 135)))) != 0) || ((((_la - 199)) & ~0x3f) == 0 && ((1L << (_la - 199)) & ((1L << (PARTIAL - 199)) | (1L << (PARTITIONING - 199)) | (1L << (PERSIST - 199)) | (1L << (PERSIST_ONLY - 199)) | (1L << (PRECEDING - 199)) | (1L << (PROCESS - 199)) | (1L << (PROXY - 199)) | (1L << (QUICK - 199)) | (1L << (REBUILD - 199)) | (1L << (REDUNDANT - 199)) | (1L << (RELOAD - 199)) | (1L << (REMOVE - 199)) | (1L << (REORGANIZE - 199)) | (1L << (REPAIR - 199)) | (1L << (REVERSE - 199)) | (1L << (ROW_FORMAT - 199)) | (1L << (SAVEPOINT - 199)) | (1L << (SESSION - 199)) | (1L << (SHUTDOWN - 199)) | (1L << (SIMPLE - 199)) | (1L << (SLAVE - 199)) | (1L << (SQL_BIG_RESULT - 199)) | (1L << (SQL_BUFFER_RESULT - 199)) | (1L << (SQL_CACHE - 199)) | (1L << (SQL_NO_CACHE - 199)) | (1L << (STATS_AUTO_RECALC - 199)) | (1L << (STATS_PERSISTENT - 199)) | (1L << (STATS_SAMPLE_PAGES - 199)) | (1L << (STORAGE - 199)) | (1L << (SUBPARTITION - 199)) | (1L << (SUPER - 199)) | (1L << (TABLES - 199)) | (1L << (TABLESPACE - 199)))) != 0) || ((((_la - 263)) & ~0x3f) == 0 && ((1L << (_la - 263)) & ((1L << (TEMPORARY - 263)) | (1L << (THAN - 263)) | (1L << (UNBOUNDED - 263)) | (1L << (UPGRADE - 263)) | (1L << (VALIDATION - 263)) | (1L << (VALUE - 263)) | (1L << (VIEW - 263)) | (1L << (WEIGHT_STRING - 263)) | (1L << (WITHOUT - 263)) | (1L << (VISIBLE - 263)) | (1L << (INVISIBLE - 263)) | (1L << (ENFORCED - 263)) | (1L << (MICROSECOND - 263)) | (1L << (SECOND - 263)) | (1L << (MINUTE - 263)) | (1L << (HOUR - 263)) | (1L << (DAY - 263)) | (1L << (WEEK - 263)) | (1L << (MONTH - 263)) | (1L << (QUARTER - 263)) | (1L << (YEAR - 263)) | (1L << (AGAINST - 263)) | (1L << (LANGUAGE - 263)) | (1L << (MODE - 263)) | (1L << (QUERY - 263)) | (1L << (EXPANSION - 263)) | (1L << (BOOLEAN - 263)) | (1L << (MAX - 263)) | (1L << (MIN - 263)) | (1L << (SUM - 263)) | (1L << (COUNT - 263)) | (1L << (AVG - 263)) | (1L << (BIT_AND - 263)) | (1L << (BIT_OR - 263)))) != 0) || ((((_la - 327)) & ~0x3f) == 0 && ((1L << (_la - 327)) & ((1L << (BIT_XOR - 327)) | (1L << (GROUP_CONCAT - 327)) | (1L << (JSON_ARRAYAGG - 327)) | (1L << (JSON_OBJECTAGG - 327)) | (1L << (STD - 327)) | (1L << (STDDEV - 327)) | (1L << (STDDEV_POP - 327)) | (1L << (STDDEV_SAMP - 327)) | (1L << (VAR_POP - 327)) | (1L << (VAR_SAMP - 327)) | (1L << (VARIANCE - 327)) | (1L << (IDENTIFIER_ - 327)))) != 0)) {
				{
				setState(1713);
				indexName();
				}
			}

			setState(1717);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==USING) {
				{
				setState(1716);
				indexType_();
				}
			}

			setState(1719);
			keyParts_();
			setState(1723);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WITH || _la==COMMENT || _la==KEY_BLOCK_SIZE || ((((_la - 276)) & ~0x3f) == 0 && ((1L << (_la - 276)) & ((1L << (USING - 276)) | (1L << (VISIBLE - 276)) | (1L << (INVISIBLE - 276)))) != 0)) {
				{
				{
				setState(1720);
				indexOption_();
				}
				}
				setState(1725);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IndexType_Context extends ParserRuleContext {
		public TerminalNode USING() { return getToken(MySQLStatementParser.USING, 0); }
		public TerminalNode BTREE() { return getToken(MySQLStatementParser.BTREE, 0); }
		public TerminalNode HASH() { return getToken(MySQLStatementParser.HASH, 0); }
		public IndexType_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexType_; }
	}

	public final IndexType_Context indexType_() throws RecognitionException {
		IndexType_Context _localctx = new IndexType_Context(_ctx, getState());
		enterRule(_localctx, 250, RULE_indexType_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1726);
			match(USING);
			setState(1727);
			_la = _input.LA(1);
			if ( !(_la==BTREE || _la==HASH) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KeyParts_Context extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(MySQLStatementParser.LP_, 0); }
		public List<KeyPart_Context> keyPart_() {
			return getRuleContexts(KeyPart_Context.class);
		}
		public KeyPart_Context keyPart_(int i) {
			return getRuleContext(KeyPart_Context.class,i);
		}
		public TerminalNode RP_() { return getToken(MySQLStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(MySQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(MySQLStatementParser.COMMA_, i);
		}
		public KeyParts_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyParts_; }
	}

	public final KeyParts_Context keyParts_() throws RecognitionException {
		KeyParts_Context _localctx = new KeyParts_Context(_ctx, getState());
		enterRule(_localctx, 252, RULE_keyParts_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1729);
			match(LP_);
			setState(1730);
			keyPart_();
			setState(1735);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(1731);
				match(COMMA_);
				setState(1732);
				keyPart_();
				}
				}
				setState(1737);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1738);
			match(RP_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KeyPart_Context extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ASC() { return getToken(MySQLStatementParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(MySQLStatementParser.DESC, 0); }
		public TerminalNode LP_() { return getToken(MySQLStatementParser.LP_, 0); }
		public TerminalNode NUMBER_() { return getToken(MySQLStatementParser.NUMBER_, 0); }
		public TerminalNode RP_() { return getToken(MySQLStatementParser.RP_, 0); }
		public KeyPart_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyPart_; }
	}

	public final KeyPart_Context keyPart_() throws RecognitionException {
		KeyPart_Context _localctx = new KeyPart_Context(_ctx, getState());
		enterRule(_localctx, 254, RULE_keyPart_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1747);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,205,_ctx) ) {
			case 1:
				{
				setState(1740);
				columnName();
				setState(1744);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LP_) {
					{
					setState(1741);
					match(LP_);
					setState(1742);
					match(NUMBER_);
					setState(1743);
					match(RP_);
					}
				}

				}
				break;
			case 2:
				{
				setState(1746);
				expr(0);
				}
				break;
			}
			setState(1750);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(1749);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IndexOption_Context extends ParserRuleContext {
		public TerminalNode KEY_BLOCK_SIZE() { return getToken(MySQLStatementParser.KEY_BLOCK_SIZE, 0); }
		public TerminalNode NUMBER_() { return getToken(MySQLStatementParser.NUMBER_, 0); }
		public TerminalNode EQ_() { return getToken(MySQLStatementParser.EQ_, 0); }
		public IndexType_Context indexType_() {
			return getRuleContext(IndexType_Context.class,0);
		}
		public TerminalNode WITH() { return getToken(MySQLStatementParser.WITH, 0); }
		public TerminalNode PARSER() { return getToken(MySQLStatementParser.PARSER, 0); }
		public Identifier_Context identifier_() {
			return getRuleContext(Identifier_Context.class,0);
		}
		public TerminalNode COMMENT() { return getToken(MySQLStatementParser.COMMENT, 0); }
		public TerminalNode STRING_() { return getToken(MySQLStatementParser.STRING_, 0); }
		public TerminalNode VISIBLE() { return getToken(MySQLStatementParser.VISIBLE, 0); }
		public TerminalNode INVISIBLE() { return getToken(MySQLStatementParser.INVISIBLE, 0); }
		public IndexOption_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexOption_; }
	}

	public final IndexOption_Context indexOption_() throws RecognitionException {
		IndexOption_Context _localctx = new IndexOption_Context(_ctx, getState());
		enterRule(_localctx, 256, RULE_indexOption_);
		int _la;
		try {
			setState(1765);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KEY_BLOCK_SIZE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1752);
				match(KEY_BLOCK_SIZE);
				setState(1754);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ_) {
					{
					setState(1753);
					match(EQ_);
					}
				}

				setState(1756);
				match(NUMBER_);
				}
				break;
			case USING:
				enterOuterAlt(_localctx, 2);
				{
				setState(1757);
				indexType_();
				}
				break;
			case WITH:
				enterOuterAlt(_localctx, 3);
				{
				setState(1758);
				match(WITH);
				setState(1759);
				match(PARSER);
				setState(1760);
				identifier_();
				}
				break;
			case COMMENT:
				enterOuterAlt(_localctx, 4);
				{
				setState(1761);
				match(COMMENT);
				setState(1762);
				match(STRING_);
				}
				break;
			case VISIBLE:
				enterOuterAlt(_localctx, 5);
				{
				setState(1763);
				match(VISIBLE);
				}
				break;
			case INVISIBLE:
				enterOuterAlt(_localctx, 6);
				{
				setState(1764);
				match(INVISIBLE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstraintDefinition_Context extends ParserRuleContext {
		public PrimaryKeyOption_Context primaryKeyOption_() {
			return getRuleContext(PrimaryKeyOption_Context.class,0);
		}
		public UniqueOption_Context uniqueOption_() {
			return getRuleContext(UniqueOption_Context.class,0);
		}
		public ForeignKeyOption_Context foreignKeyOption_() {
			return getRuleContext(ForeignKeyOption_Context.class,0);
		}
		public TerminalNode CONSTRAINT() { return getToken(MySQLStatementParser.CONSTRAINT, 0); }
		public IgnoredIdentifier_Context ignoredIdentifier_() {
			return getRuleContext(IgnoredIdentifier_Context.class,0);
		}
		public ConstraintDefinition_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraintDefinition_; }
	}

	public final ConstraintDefinition_Context constraintDefinition_() throws RecognitionException {
		ConstraintDefinition_Context _localctx = new ConstraintDefinition_Context(_ctx, getState());
		enterRule(_localctx, 258, RULE_constraintDefinition_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1771);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONSTRAINT) {
				{
				setState(1767);
				match(CONSTRAINT);
				setState(1769);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ANY) | (1L << DATE) | (1L << ESCAPE) | (1L << OFFSET) | (1L << ROLLUP) | (1L << SOUNDS) | (1L << TIME) | (1L << TIMESTAMP) | (1L << UNKNOWN) | (1L << ALWAYS) | (1L << COMMIT) | (1L << COMMITTED) | (1L << CURRENT) | (1L << DISABLE) | (1L << ENABLE))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (LEVEL - 69)) | (1L << (NO - 69)) | (1L << (PASSWORD - 69)) | (1L << (PRIVILEGES - 69)) | (1L << (ROLLBACK - 69)) | (1L << (START - 69)) | (1L << (TRANSACTION - 69)) | (1L << (TRUNCATE - 69)) | (1L << (ACCOUNT - 69)) | (1L << (ACTION - 69)) | (1L << (AFTER - 69)) | (1L << (ALGORITHM - 69)) | (1L << (AUTO_INCREMENT - 69)) | (1L << (AVG_ROW_LENGTH - 69)) | (1L << (BEGIN - 69)) | (1L << (BTREE - 69)) | (1L << (CHAIN - 69)) | (1L << (CHARSET - 69)) | (1L << (CHECKSUM - 69)) | (1L << (CIPHER - 69)) | (1L << (CLIENT - 69)) | (1L << (COALESCE - 69)) | (1L << (COLUMNS - 69)) | (1L << (COLUMN_FORMAT - 69)) | (1L << (COMMENT - 69)) | (1L << (COMPACT - 69)) | (1L << (COMPRESSED - 69)) | (1L << (COMPRESSION - 69)) | (1L << (CONNECTION - 69)) | (1L << (CONSISTENT - 69)) | (1L << (DATA - 69)) | (1L << (DELAY_KEY_WRITE - 69)) | (1L << (DISCARD - 69)) | (1L << (DISK - 69)))) != 0) || ((((_la - 135)) & ~0x3f) == 0 && ((1L << (_la - 135)) & ((1L << (DUPLICATE - 135)) | (1L << (ENCRYPTION - 135)) | (1L << (END - 135)) | (1L << (ENGINE - 135)) | (1L << (EVENT - 135)) | (1L << (EXCHANGE - 135)) | (1L << (EXECUTE - 135)) | (1L << (FILE - 135)) | (1L << (FIRST - 135)) | (1L << (FIXED - 135)) | (1L << (FOLLOWING - 135)) | (1L << (GLOBAL - 135)) | (1L << (HASH - 135)) | (1L << (IMPORT_ - 135)) | (1L << (INSERT_METHOD - 135)) | (1L << (KEY_BLOCK_SIZE - 135)) | (1L << (LAST - 135)) | (1L << (LESS - 135)) | (1L << (MAX_ROWS - 135)) | (1L << (MEMORY - 135)) | (1L << (MIN_ROWS - 135)) | (1L << (MODIFY - 135)) | (1L << (NONE - 135)) | (1L << (PACK_KEYS - 135)) | (1L << (PARSER - 135)))) != 0) || ((((_la - 199)) & ~0x3f) == 0 && ((1L << (_la - 199)) & ((1L << (PARTIAL - 199)) | (1L << (PARTITIONING - 199)) | (1L << (PERSIST - 199)) | (1L << (PERSIST_ONLY - 199)) | (1L << (PRECEDING - 199)) | (1L << (PROCESS - 199)) | (1L << (PROXY - 199)) | (1L << (QUICK - 199)) | (1L << (REBUILD - 199)) | (1L << (REDUNDANT - 199)) | (1L << (RELOAD - 199)) | (1L << (REMOVE - 199)) | (1L << (REORGANIZE - 199)) | (1L << (REPAIR - 199)) | (1L << (REVERSE - 199)) | (1L << (ROW_FORMAT - 199)) | (1L << (SAVEPOINT - 199)) | (1L << (SESSION - 199)) | (1L << (SHUTDOWN - 199)) | (1L << (SIMPLE - 199)) | (1L << (SLAVE - 199)) | (1L << (SQL_BIG_RESULT - 199)) | (1L << (SQL_BUFFER_RESULT - 199)) | (1L << (SQL_CACHE - 199)) | (1L << (SQL_NO_CACHE - 199)) | (1L << (STATS_AUTO_RECALC - 199)) | (1L << (STATS_PERSISTENT - 199)) | (1L << (STATS_SAMPLE_PAGES - 199)) | (1L << (STORAGE - 199)) | (1L << (SUBPARTITION - 199)) | (1L << (SUPER - 199)) | (1L << (TABLES - 199)) | (1L << (TABLESPACE - 199)))) != 0) || ((((_la - 263)) & ~0x3f) == 0 && ((1L << (_la - 263)) & ((1L << (TEMPORARY - 263)) | (1L << (THAN - 263)) | (1L << (UNBOUNDED - 263)) | (1L << (UPGRADE - 263)) | (1L << (VALIDATION - 263)) | (1L << (VALUE - 263)) | (1L << (VIEW - 263)) | (1L << (WEIGHT_STRING - 263)) | (1L << (WITHOUT - 263)) | (1L << (VISIBLE - 263)) | (1L << (INVISIBLE - 263)) | (1L << (ENFORCED - 263)) | (1L << (MICROSECOND - 263)) | (1L << (SECOND - 263)) | (1L << (MINUTE - 263)) | (1L << (HOUR - 263)) | (1L << (DAY - 263)) | (1L << (WEEK - 263)) | (1L << (MONTH - 263)) | (1L << (QUARTER - 263)) | (1L << (YEAR - 263)) | (1L << (AGAINST - 263)) | (1L << (LANGUAGE - 263)) | (1L << (MODE - 263)) | (1L << (QUERY - 263)) | (1L << (EXPANSION - 263)) | (1L << (BOOLEAN - 263)) | (1L << (MAX - 263)) | (1L << (MIN - 263)) | (1L << (SUM - 263)) | (1L << (COUNT - 263)) | (1L << (AVG - 263)) | (1L << (BIT_AND - 263)) | (1L << (BIT_OR - 263)))) != 0) || ((((_la - 327)) & ~0x3f) == 0 && ((1L << (_la - 327)) & ((1L << (BIT_XOR - 327)) | (1L << (GROUP_CONCAT - 327)) | (1L << (JSON_ARRAYAGG - 327)) | (1L << (JSON_OBJECTAGG - 327)) | (1L << (STD - 327)) | (1L << (STDDEV - 327)) | (1L << (STDDEV_POP - 327)) | (1L << (STDDEV_SAMP - 327)) | (1L << (VAR_POP - 327)) | (1L << (VAR_SAMP - 327)) | (1L << (VARIANCE - 327)) | (1L << (IDENTIFIER_ - 327)))) != 0)) {
					{
					setState(1768);
					ignoredIdentifier_();
					}
				}

				}
			}

			setState(1776);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KEY:
			case PRIMARY:
				{
				setState(1773);
				primaryKeyOption_();
				}
				break;
			case UNIQUE:
				{
				setState(1774);
				uniqueOption_();
				}
				break;
			case FOREIGN:
				{
				setState(1775);
				foreignKeyOption_();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryKeyOption_Context extends ParserRuleContext {
		public PrimaryKeyContext primaryKey() {
			return getRuleContext(PrimaryKeyContext.class,0);
		}
		public ColumnNamesContext columnNames() {
			return getRuleContext(ColumnNamesContext.class,0);
		}
		public IndexType_Context indexType_() {
			return getRuleContext(IndexType_Context.class,0);
		}
		public List<IndexOption_Context> indexOption_() {
			return getRuleContexts(IndexOption_Context.class);
		}
		public IndexOption_Context indexOption_(int i) {
			return getRuleContext(IndexOption_Context.class,i);
		}
		public PrimaryKeyOption_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryKeyOption_; }
	}

	public final PrimaryKeyOption_Context primaryKeyOption_() throws RecognitionException {
		PrimaryKeyOption_Context _localctx = new PrimaryKeyOption_Context(_ctx, getState());
		enterRule(_localctx, 260, RULE_primaryKeyOption_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1778);
			primaryKey();
			setState(1780);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==USING) {
				{
				setState(1779);
				indexType_();
				}
			}

			setState(1782);
			columnNames();
			setState(1786);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WITH || _la==COMMENT || _la==KEY_BLOCK_SIZE || ((((_la - 276)) & ~0x3f) == 0 && ((1L << (_la - 276)) & ((1L << (USING - 276)) | (1L << (VISIBLE - 276)) | (1L << (INVISIBLE - 276)))) != 0)) {
				{
				{
				setState(1783);
				indexOption_();
				}
				}
				setState(1788);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryKeyContext extends ParserRuleContext {
		public TerminalNode KEY() { return getToken(MySQLStatementParser.KEY, 0); }
		public TerminalNode PRIMARY() { return getToken(MySQLStatementParser.PRIMARY, 0); }
		public PrimaryKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryKey; }
	}

	public final PrimaryKeyContext primaryKey() throws RecognitionException {
		PrimaryKeyContext _localctx = new PrimaryKeyContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_primaryKey);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1790);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PRIMARY) {
				{
				setState(1789);
				match(PRIMARY);
				}
			}

			setState(1792);
			match(KEY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UniqueOption_Context extends ParserRuleContext {
		public TerminalNode UNIQUE() { return getToken(MySQLStatementParser.UNIQUE, 0); }
		public KeyParts_Context keyParts_() {
			return getRuleContext(KeyParts_Context.class,0);
		}
		public IndexNameContext indexName() {
			return getRuleContext(IndexNameContext.class,0);
		}
		public IndexType_Context indexType_() {
			return getRuleContext(IndexType_Context.class,0);
		}
		public List<IndexOption_Context> indexOption_() {
			return getRuleContexts(IndexOption_Context.class);
		}
		public IndexOption_Context indexOption_(int i) {
			return getRuleContext(IndexOption_Context.class,i);
		}
		public TerminalNode INDEX() { return getToken(MySQLStatementParser.INDEX, 0); }
		public TerminalNode KEY() { return getToken(MySQLStatementParser.KEY, 0); }
		public UniqueOption_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_uniqueOption_; }
	}

	public final UniqueOption_Context uniqueOption_() throws RecognitionException {
		UniqueOption_Context _localctx = new UniqueOption_Context(_ctx, getState());
		enterRule(_localctx, 264, RULE_uniqueOption_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1794);
			match(UNIQUE);
			setState(1796);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KEY || _la==INDEX) {
				{
				setState(1795);
				_la = _input.LA(1);
				if ( !(_la==KEY || _la==INDEX) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1799);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ANY) | (1L << DATE) | (1L << ESCAPE) | (1L << OFFSET) | (1L << ROLLUP) | (1L << SOUNDS) | (1L << TIME) | (1L << TIMESTAMP) | (1L << UNKNOWN) | (1L << ALWAYS) | (1L << COMMIT) | (1L << COMMITTED) | (1L << CURRENT) | (1L << DISABLE) | (1L << ENABLE))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (LEVEL - 69)) | (1L << (NO - 69)) | (1L << (PASSWORD - 69)) | (1L << (PRIVILEGES - 69)) | (1L << (ROLLBACK - 69)) | (1L << (START - 69)) | (1L << (TRANSACTION - 69)) | (1L << (TRUNCATE - 69)) | (1L << (ACCOUNT - 69)) | (1L << (ACTION - 69)) | (1L << (AFTER - 69)) | (1L << (ALGORITHM - 69)) | (1L << (AUTO_INCREMENT - 69)) | (1L << (AVG_ROW_LENGTH - 69)) | (1L << (BEGIN - 69)) | (1L << (BTREE - 69)) | (1L << (CHAIN - 69)) | (1L << (CHARSET - 69)) | (1L << (CHECKSUM - 69)) | (1L << (CIPHER - 69)) | (1L << (CLIENT - 69)) | (1L << (COALESCE - 69)) | (1L << (COLUMNS - 69)) | (1L << (COLUMN_FORMAT - 69)) | (1L << (COMMENT - 69)) | (1L << (COMPACT - 69)) | (1L << (COMPRESSED - 69)) | (1L << (COMPRESSION - 69)) | (1L << (CONNECTION - 69)) | (1L << (CONSISTENT - 69)) | (1L << (DATA - 69)) | (1L << (DELAY_KEY_WRITE - 69)) | (1L << (DISCARD - 69)) | (1L << (DISK - 69)))) != 0) || ((((_la - 135)) & ~0x3f) == 0 && ((1L << (_la - 135)) & ((1L << (DUPLICATE - 135)) | (1L << (ENCRYPTION - 135)) | (1L << (END - 135)) | (1L << (ENGINE - 135)) | (1L << (EVENT - 135)) | (1L << (EXCHANGE - 135)) | (1L << (EXECUTE - 135)) | (1L << (FILE - 135)) | (1L << (FIRST - 135)) | (1L << (FIXED - 135)) | (1L << (FOLLOWING - 135)) | (1L << (GLOBAL - 135)) | (1L << (HASH - 135)) | (1L << (IMPORT_ - 135)) | (1L << (INSERT_METHOD - 135)) | (1L << (KEY_BLOCK_SIZE - 135)) | (1L << (LAST - 135)) | (1L << (LESS - 135)) | (1L << (MAX_ROWS - 135)) | (1L << (MEMORY - 135)) | (1L << (MIN_ROWS - 135)) | (1L << (MODIFY - 135)) | (1L << (NONE - 135)) | (1L << (PACK_KEYS - 135)) | (1L << (PARSER - 135)))) != 0) || ((((_la - 199)) & ~0x3f) == 0 && ((1L << (_la - 199)) & ((1L << (PARTIAL - 199)) | (1L << (PARTITIONING - 199)) | (1L << (PERSIST - 199)) | (1L << (PERSIST_ONLY - 199)) | (1L << (PRECEDING - 199)) | (1L << (PROCESS - 199)) | (1L << (PROXY - 199)) | (1L << (QUICK - 199)) | (1L << (REBUILD - 199)) | (1L << (REDUNDANT - 199)) | (1L << (RELOAD - 199)) | (1L << (REMOVE - 199)) | (1L << (REORGANIZE - 199)) | (1L << (REPAIR - 199)) | (1L << (REVERSE - 199)) | (1L << (ROW_FORMAT - 199)) | (1L << (SAVEPOINT - 199)) | (1L << (SESSION - 199)) | (1L << (SHUTDOWN - 199)) | (1L << (SIMPLE - 199)) | (1L << (SLAVE - 199)) | (1L << (SQL_BIG_RESULT - 199)) | (1L << (SQL_BUFFER_RESULT - 199)) | (1L << (SQL_CACHE - 199)) | (1L << (SQL_NO_CACHE - 199)) | (1L << (STATS_AUTO_RECALC - 199)) | (1L << (STATS_PERSISTENT - 199)) | (1L << (STATS_SAMPLE_PAGES - 199)) | (1L << (STORAGE - 199)) | (1L << (SUBPARTITION - 199)) | (1L << (SUPER - 199)) | (1L << (TABLES - 199)) | (1L << (TABLESPACE - 199)))) != 0) || ((((_la - 263)) & ~0x3f) == 0 && ((1L << (_la - 263)) & ((1L << (TEMPORARY - 263)) | (1L << (THAN - 263)) | (1L << (UNBOUNDED - 263)) | (1L << (UPGRADE - 263)) | (1L << (VALIDATION - 263)) | (1L << (VALUE - 263)) | (1L << (VIEW - 263)) | (1L << (WEIGHT_STRING - 263)) | (1L << (WITHOUT - 263)) | (1L << (VISIBLE - 263)) | (1L << (INVISIBLE - 263)) | (1L << (ENFORCED - 263)) | (1L << (MICROSECOND - 263)) | (1L << (SECOND - 263)) | (1L << (MINUTE - 263)) | (1L << (HOUR - 263)) | (1L << (DAY - 263)) | (1L << (WEEK - 263)) | (1L << (MONTH - 263)) | (1L << (QUARTER - 263)) | (1L << (YEAR - 263)) | (1L << (AGAINST - 263)) | (1L << (LANGUAGE - 263)) | (1L << (MODE - 263)) | (1L << (QUERY - 263)) | (1L << (EXPANSION - 263)) | (1L << (BOOLEAN - 263)) | (1L << (MAX - 263)) | (1L << (MIN - 263)) | (1L << (SUM - 263)) | (1L << (COUNT - 263)) | (1L << (AVG - 263)) | (1L << (BIT_AND - 263)) | (1L << (BIT_OR - 263)))) != 0) || ((((_la - 327)) & ~0x3f) == 0 && ((1L << (_la - 327)) & ((1L << (BIT_XOR - 327)) | (1L << (GROUP_CONCAT - 327)) | (1L << (JSON_ARRAYAGG - 327)) | (1L << (JSON_OBJECTAGG - 327)) | (1L << (STD - 327)) | (1L << (STDDEV - 327)) | (1L << (STDDEV_POP - 327)) | (1L << (STDDEV_SAMP - 327)) | (1L << (VAR_POP - 327)) | (1L << (VAR_SAMP - 327)) | (1L << (VARIANCE - 327)) | (1L << (IDENTIFIER_ - 327)))) != 0)) {
				{
				setState(1798);
				indexName();
				}
			}

			setState(1802);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==USING) {
				{
				setState(1801);
				indexType_();
				}
			}

			setState(1804);
			keyParts_();
			setState(1808);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WITH || _la==COMMENT || _la==KEY_BLOCK_SIZE || ((((_la - 276)) & ~0x3f) == 0 && ((1L << (_la - 276)) & ((1L << (USING - 276)) | (1L << (VISIBLE - 276)) | (1L << (INVISIBLE - 276)))) != 0)) {
				{
				{
				setState(1805);
				indexOption_();
				}
				}
				setState(1810);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForeignKeyOption_Context extends ParserRuleContext {
		public TerminalNode FOREIGN() { return getToken(MySQLStatementParser.FOREIGN, 0); }
		public TerminalNode KEY() { return getToken(MySQLStatementParser.KEY, 0); }
		public ColumnNamesContext columnNames() {
			return getRuleContext(ColumnNamesContext.class,0);
		}
		public ReferenceDefinition_Context referenceDefinition_() {
			return getRuleContext(ReferenceDefinition_Context.class,0);
		}
		public IndexNameContext indexName() {
			return getRuleContext(IndexNameContext.class,0);
		}
		public ForeignKeyOption_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreignKeyOption_; }
	}

	public final ForeignKeyOption_Context foreignKeyOption_() throws RecognitionException {
		ForeignKeyOption_Context _localctx = new ForeignKeyOption_Context(_ctx, getState());
		enterRule(_localctx, 266, RULE_foreignKeyOption_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1811);
			match(FOREIGN);
			setState(1812);
			match(KEY);
			setState(1814);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ANY) | (1L << DATE) | (1L << ESCAPE) | (1L << OFFSET) | (1L << ROLLUP) | (1L << SOUNDS) | (1L << TIME) | (1L << TIMESTAMP) | (1L << UNKNOWN) | (1L << ALWAYS) | (1L << COMMIT) | (1L << COMMITTED) | (1L << CURRENT) | (1L << DISABLE) | (1L << ENABLE))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (LEVEL - 69)) | (1L << (NO - 69)) | (1L << (PASSWORD - 69)) | (1L << (PRIVILEGES - 69)) | (1L << (ROLLBACK - 69)) | (1L << (START - 69)) | (1L << (TRANSACTION - 69)) | (1L << (TRUNCATE - 69)) | (1L << (ACCOUNT - 69)) | (1L << (ACTION - 69)) | (1L << (AFTER - 69)) | (1L << (ALGORITHM - 69)) | (1L << (AUTO_INCREMENT - 69)) | (1L << (AVG_ROW_LENGTH - 69)) | (1L << (BEGIN - 69)) | (1L << (BTREE - 69)) | (1L << (CHAIN - 69)) | (1L << (CHARSET - 69)) | (1L << (CHECKSUM - 69)) | (1L << (CIPHER - 69)) | (1L << (CLIENT - 69)) | (1L << (COALESCE - 69)) | (1L << (COLUMNS - 69)) | (1L << (COLUMN_FORMAT - 69)) | (1L << (COMMENT - 69)) | (1L << (COMPACT - 69)) | (1L << (COMPRESSED - 69)) | (1L << (COMPRESSION - 69)) | (1L << (CONNECTION - 69)) | (1L << (CONSISTENT - 69)) | (1L << (DATA - 69)) | (1L << (DELAY_KEY_WRITE - 69)) | (1L << (DISCARD - 69)) | (1L << (DISK - 69)))) != 0) || ((((_la - 135)) & ~0x3f) == 0 && ((1L << (_la - 135)) & ((1L << (DUPLICATE - 135)) | (1L << (ENCRYPTION - 135)) | (1L << (END - 135)) | (1L << (ENGINE - 135)) | (1L << (EVENT - 135)) | (1L << (EXCHANGE - 135)) | (1L << (EXECUTE - 135)) | (1L << (FILE - 135)) | (1L << (FIRST - 135)) | (1L << (FIXED - 135)) | (1L << (FOLLOWING - 135)) | (1L << (GLOBAL - 135)) | (1L << (HASH - 135)) | (1L << (IMPORT_ - 135)) | (1L << (INSERT_METHOD - 135)) | (1L << (KEY_BLOCK_SIZE - 135)) | (1L << (LAST - 135)) | (1L << (LESS - 135)) | (1L << (MAX_ROWS - 135)) | (1L << (MEMORY - 135)) | (1L << (MIN_ROWS - 135)) | (1L << (MODIFY - 135)) | (1L << (NONE - 135)) | (1L << (PACK_KEYS - 135)) | (1L << (PARSER - 135)))) != 0) || ((((_la - 199)) & ~0x3f) == 0 && ((1L << (_la - 199)) & ((1L << (PARTIAL - 199)) | (1L << (PARTITIONING - 199)) | (1L << (PERSIST - 199)) | (1L << (PERSIST_ONLY - 199)) | (1L << (PRECEDING - 199)) | (1L << (PROCESS - 199)) | (1L << (PROXY - 199)) | (1L << (QUICK - 199)) | (1L << (REBUILD - 199)) | (1L << (REDUNDANT - 199)) | (1L << (RELOAD - 199)) | (1L << (REMOVE - 199)) | (1L << (REORGANIZE - 199)) | (1L << (REPAIR - 199)) | (1L << (REVERSE - 199)) | (1L << (ROW_FORMAT - 199)) | (1L << (SAVEPOINT - 199)) | (1L << (SESSION - 199)) | (1L << (SHUTDOWN - 199)) | (1L << (SIMPLE - 199)) | (1L << (SLAVE - 199)) | (1L << (SQL_BIG_RESULT - 199)) | (1L << (SQL_BUFFER_RESULT - 199)) | (1L << (SQL_CACHE - 199)) | (1L << (SQL_NO_CACHE - 199)) | (1L << (STATS_AUTO_RECALC - 199)) | (1L << (STATS_PERSISTENT - 199)) | (1L << (STATS_SAMPLE_PAGES - 199)) | (1L << (STORAGE - 199)) | (1L << (SUBPARTITION - 199)) | (1L << (SUPER - 199)) | (1L << (TABLES - 199)) | (1L << (TABLESPACE - 199)))) != 0) || ((((_la - 263)) & ~0x3f) == 0 && ((1L << (_la - 263)) & ((1L << (TEMPORARY - 263)) | (1L << (THAN - 263)) | (1L << (UNBOUNDED - 263)) | (1L << (UPGRADE - 263)) | (1L << (VALIDATION - 263)) | (1L << (VALUE - 263)) | (1L << (VIEW - 263)) | (1L << (WEIGHT_STRING - 263)) | (1L << (WITHOUT - 263)) | (1L << (VISIBLE - 263)) | (1L << (INVISIBLE - 263)) | (1L << (ENFORCED - 263)) | (1L << (MICROSECOND - 263)) | (1L << (SECOND - 263)) | (1L << (MINUTE - 263)) | (1L << (HOUR - 263)) | (1L << (DAY - 263)) | (1L << (WEEK - 263)) | (1L << (MONTH - 263)) | (1L << (QUARTER - 263)) | (1L << (YEAR - 263)) | (1L << (AGAINST - 263)) | (1L << (LANGUAGE - 263)) | (1L << (MODE - 263)) | (1L << (QUERY - 263)) | (1L << (EXPANSION - 263)) | (1L << (BOOLEAN - 263)) | (1L << (MAX - 263)) | (1L << (MIN - 263)) | (1L << (SUM - 263)) | (1L << (COUNT - 263)) | (1L << (AVG - 263)) | (1L << (BIT_AND - 263)) | (1L << (BIT_OR - 263)))) != 0) || ((((_la - 327)) & ~0x3f) == 0 && ((1L << (_la - 327)) & ((1L << (BIT_XOR - 327)) | (1L << (GROUP_CONCAT - 327)) | (1L << (JSON_ARRAYAGG - 327)) | (1L << (JSON_OBJECTAGG - 327)) | (1L << (STD - 327)) | (1L << (STDDEV - 327)) | (1L << (STDDEV_POP - 327)) | (1L << (STDDEV_SAMP - 327)) | (1L << (VAR_POP - 327)) | (1L << (VAR_SAMP - 327)) | (1L << (VARIANCE - 327)) | (1L << (IDENTIFIER_ - 327)))) != 0)) {
				{
				setState(1813);
				indexName();
				}
			}

			setState(1816);
			columnNames();
			setState(1817);
			referenceDefinition_();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CheckConstraintDefinition_Context extends ParserRuleContext {
		public TerminalNode CHECK() { return getToken(MySQLStatementParser.CHECK, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CONSTRAINT() { return getToken(MySQLStatementParser.CONSTRAINT, 0); }
		public TerminalNode ENFORCED() { return getToken(MySQLStatementParser.ENFORCED, 0); }
		public IgnoredIdentifier_Context ignoredIdentifier_() {
			return getRuleContext(IgnoredIdentifier_Context.class,0);
		}
		public TerminalNode NOT() { return getToken(MySQLStatementParser.NOT, 0); }
		public CheckConstraintDefinition_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_checkConstraintDefinition_; }
	}

	public final CheckConstraintDefinition_Context checkConstraintDefinition_() throws RecognitionException {
		CheckConstraintDefinition_Context _localctx = new CheckConstraintDefinition_Context(_ctx, getState());
		enterRule(_localctx, 268, RULE_checkConstraintDefinition_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1823);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONSTRAINT) {
				{
				setState(1819);
				match(CONSTRAINT);
				setState(1821);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ANY) | (1L << DATE) | (1L << ESCAPE) | (1L << OFFSET) | (1L << ROLLUP) | (1L << SOUNDS) | (1L << TIME) | (1L << TIMESTAMP) | (1L << UNKNOWN) | (1L << ALWAYS) | (1L << COMMIT) | (1L << COMMITTED) | (1L << CURRENT) | (1L << DISABLE) | (1L << ENABLE))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (LEVEL - 69)) | (1L << (NO - 69)) | (1L << (PASSWORD - 69)) | (1L << (PRIVILEGES - 69)) | (1L << (ROLLBACK - 69)) | (1L << (START - 69)) | (1L << (TRANSACTION - 69)) | (1L << (TRUNCATE - 69)) | (1L << (ACCOUNT - 69)) | (1L << (ACTION - 69)) | (1L << (AFTER - 69)) | (1L << (ALGORITHM - 69)) | (1L << (AUTO_INCREMENT - 69)) | (1L << (AVG_ROW_LENGTH - 69)) | (1L << (BEGIN - 69)) | (1L << (BTREE - 69)) | (1L << (CHAIN - 69)) | (1L << (CHARSET - 69)) | (1L << (CHECKSUM - 69)) | (1L << (CIPHER - 69)) | (1L << (CLIENT - 69)) | (1L << (COALESCE - 69)) | (1L << (COLUMNS - 69)) | (1L << (COLUMN_FORMAT - 69)) | (1L << (COMMENT - 69)) | (1L << (COMPACT - 69)) | (1L << (COMPRESSED - 69)) | (1L << (COMPRESSION - 69)) | (1L << (CONNECTION - 69)) | (1L << (CONSISTENT - 69)) | (1L << (DATA - 69)) | (1L << (DELAY_KEY_WRITE - 69)) | (1L << (DISCARD - 69)) | (1L << (DISK - 69)))) != 0) || ((((_la - 135)) & ~0x3f) == 0 && ((1L << (_la - 135)) & ((1L << (DUPLICATE - 135)) | (1L << (ENCRYPTION - 135)) | (1L << (END - 135)) | (1L << (ENGINE - 135)) | (1L << (EVENT - 135)) | (1L << (EXCHANGE - 135)) | (1L << (EXECUTE - 135)) | (1L << (FILE - 135)) | (1L << (FIRST - 135)) | (1L << (FIXED - 135)) | (1L << (FOLLOWING - 135)) | (1L << (GLOBAL - 135)) | (1L << (HASH - 135)) | (1L << (IMPORT_ - 135)) | (1L << (INSERT_METHOD - 135)) | (1L << (KEY_BLOCK_SIZE - 135)) | (1L << (LAST - 135)) | (1L << (LESS - 135)) | (1L << (MAX_ROWS - 135)) | (1L << (MEMORY - 135)) | (1L << (MIN_ROWS - 135)) | (1L << (MODIFY - 135)) | (1L << (NONE - 135)) | (1L << (PACK_KEYS - 135)) | (1L << (PARSER - 135)))) != 0) || ((((_la - 199)) & ~0x3f) == 0 && ((1L << (_la - 199)) & ((1L << (PARTIAL - 199)) | (1L << (PARTITIONING - 199)) | (1L << (PERSIST - 199)) | (1L << (PERSIST_ONLY - 199)) | (1L << (PRECEDING - 199)) | (1L << (PROCESS - 199)) | (1L << (PROXY - 199)) | (1L << (QUICK - 199)) | (1L << (REBUILD - 199)) | (1L << (REDUNDANT - 199)) | (1L << (RELOAD - 199)) | (1L << (REMOVE - 199)) | (1L << (REORGANIZE - 199)) | (1L << (REPAIR - 199)) | (1L << (REVERSE - 199)) | (1L << (ROW_FORMAT - 199)) | (1L << (SAVEPOINT - 199)) | (1L << (SESSION - 199)) | (1L << (SHUTDOWN - 199)) | (1L << (SIMPLE - 199)) | (1L << (SLAVE - 199)) | (1L << (SQL_BIG_RESULT - 199)) | (1L << (SQL_BUFFER_RESULT - 199)) | (1L << (SQL_CACHE - 199)) | (1L << (SQL_NO_CACHE - 199)) | (1L << (STATS_AUTO_RECALC - 199)) | (1L << (STATS_PERSISTENT - 199)) | (1L << (STATS_SAMPLE_PAGES - 199)) | (1L << (STORAGE - 199)) | (1L << (SUBPARTITION - 199)) | (1L << (SUPER - 199)) | (1L << (TABLES - 199)) | (1L << (TABLESPACE - 199)))) != 0) || ((((_la - 263)) & ~0x3f) == 0 && ((1L << (_la - 263)) & ((1L << (TEMPORARY - 263)) | (1L << (THAN - 263)) | (1L << (UNBOUNDED - 263)) | (1L << (UPGRADE - 263)) | (1L << (VALIDATION - 263)) | (1L << (VALUE - 263)) | (1L << (VIEW - 263)) | (1L << (WEIGHT_STRING - 263)) | (1L << (WITHOUT - 263)) | (1L << (VISIBLE - 263)) | (1L << (INVISIBLE - 263)) | (1L << (ENFORCED - 263)) | (1L << (MICROSECOND - 263)) | (1L << (SECOND - 263)) | (1L << (MINUTE - 263)) | (1L << (HOUR - 263)) | (1L << (DAY - 263)) | (1L << (WEEK - 263)) | (1L << (MONTH - 263)) | (1L << (QUARTER - 263)) | (1L << (YEAR - 263)) | (1L << (AGAINST - 263)) | (1L << (LANGUAGE - 263)) | (1L << (MODE - 263)) | (1L << (QUERY - 263)) | (1L << (EXPANSION - 263)) | (1L << (BOOLEAN - 263)) | (1L << (MAX - 263)) | (1L << (MIN - 263)) | (1L << (SUM - 263)) | (1L << (COUNT - 263)) | (1L << (AVG - 263)) | (1L << (BIT_AND - 263)) | (1L << (BIT_OR - 263)))) != 0) || ((((_la - 327)) & ~0x3f) == 0 && ((1L << (_la - 327)) & ((1L << (BIT_XOR - 327)) | (1L << (GROUP_CONCAT - 327)) | (1L << (JSON_ARRAYAGG - 327)) | (1L << (JSON_OBJECTAGG - 327)) | (1L << (STD - 327)) | (1L << (STDDEV - 327)) | (1L << (STDDEV_POP - 327)) | (1L << (STDDEV_SAMP - 327)) | (1L << (VAR_POP - 327)) | (1L << (VAR_SAMP - 327)) | (1L << (VARIANCE - 327)) | (1L << (IDENTIFIER_ - 327)))) != 0)) {
					{
					setState(1820);
					ignoredIdentifier_();
					}
				}

				}
			}

			setState(1825);
			match(CHECK);
			setState(1826);
			expr(0);
			setState(1831);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,223,_ctx) ) {
			case 1:
				{
				setState(1828);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1827);
					match(NOT);
					}
				}

				setState(1830);
				match(ENFORCED);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateLike_Context extends ParserRuleContext {
		public TerminalNode LIKE() { return getToken(MySQLStatementParser.LIKE, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode LP_() { return getToken(MySQLStatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(MySQLStatementParser.RP_, 0); }
		public CreateLike_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createLike_; }
	}

	public final CreateLike_Context createLike_() throws RecognitionException {
		CreateLike_Context _localctx = new CreateLike_Context(_ctx, getState());
		enterRule(_localctx, 270, RULE_createLike_);
		try {
			setState(1840);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LIKE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1833);
				match(LIKE);
				setState(1834);
				tableName();
				}
				break;
			case LP_:
				enterOuterAlt(_localctx, 2);
				{
				setState(1835);
				match(LP_);
				setState(1836);
				match(LIKE);
				setState(1837);
				tableName();
				setState(1838);
				match(RP_);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlterTableContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(MySQLStatementParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(MySQLStatementParser.TABLE, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public AlterSpecifications_Context alterSpecifications_() {
			return getRuleContext(AlterSpecifications_Context.class,0);
		}
		public AlterTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterTable; }
	}

	public final AlterTableContext alterTable() throws RecognitionException {
		AlterTableContext _localctx = new AlterTableContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_alterTable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1842);
			match(ALTER);
			setState(1843);
			match(TABLE);
			setState(1844);
			tableName();
			setState(1846);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 29)) & ~0x3f) == 0 && ((1L << (_la - 29)) & ((1L << (ORDER - 29)) | (1L << (UNION - 29)) | (1L << (WITH - 29)) | (1L << (ADD - 29)) | (1L << (ALTER - 29)) | (1L << (CHECK - 29)) | (1L << (DEFAULT - 29)) | (1L << (DISABLE - 29)) | (1L << (DROP - 29)) | (1L << (ENABLE - 29)) | (1L << (INDEX - 29)) | (1L << (PASSWORD - 29)) | (1L << (TRUNCATE - 29)) | (1L << (ALGORITHM - 29)) | (1L << (ANALYZE - 29)))) != 0) || ((((_la - 94)) & ~0x3f) == 0 && ((1L << (_la - 94)) & ((1L << (AUTO_INCREMENT - 94)) | (1L << (AVG_ROW_LENGTH - 94)) | (1L << (CHANGE - 94)) | (1L << (CHAR - 94)) | (1L << (CHARACTER - 94)) | (1L << (CHARSET - 94)) | (1L << (CHECKSUM - 94)) | (1L << (COALESCE - 94)) | (1L << (COLLATE - 94)) | (1L << (COMMENT - 94)) | (1L << (COMPRESSION - 94)) | (1L << (CONNECTION - 94)) | (1L << (CONVERT - 94)) | (1L << (DATA - 94)) | (1L << (DELAY_KEY_WRITE - 94)) | (1L << (DISCARD - 94)) | (1L << (ENCRYPTION - 94)) | (1L << (ENGINE - 94)) | (1L << (EXCHANGE - 94)) | (1L << (FORCE - 94)))) != 0) || ((((_la - 164)) & ~0x3f) == 0 && ((1L << (_la - 164)) & ((1L << (IMPORT_ - 164)) | (1L << (INSERT_METHOD - 164)) | (1L << (KEY_BLOCK_SIZE - 164)) | (1L << (LOCK - 164)) | (1L << (MAX_ROWS - 164)) | (1L << (MIN_ROWS - 164)) | (1L << (MODIFY - 164)) | (1L << (OPTIMIZE - 164)) | (1L << (PACK_KEYS - 164)) | (1L << (REBUILD - 164)) | (1L << (REMOVE - 164)) | (1L << (RENAME - 164)) | (1L << (REORGANIZE - 164)) | (1L << (REPAIR - 164)))) != 0) || ((((_la - 229)) & ~0x3f) == 0 && ((1L << (_la - 229)) & ((1L << (ROW_FORMAT - 229)) | (1L << (STATS_AUTO_RECALC - 229)) | (1L << (STATS_PERSISTENT - 229)) | (1L << (STATS_SAMPLE_PAGES - 229)) | (1L << (TABLESPACE - 229)) | (1L << (UPGRADE - 229)) | (1L << (WITHOUT - 229)))) != 0)) {
				{
				setState(1845);
				alterSpecifications_();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlterSpecifications_Context extends ParserRuleContext {
		public List<AlterSpecification_Context> alterSpecification_() {
			return getRuleContexts(AlterSpecification_Context.class);
		}
		public AlterSpecification_Context alterSpecification_(int i) {
			return getRuleContext(AlterSpecification_Context.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(MySQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(MySQLStatementParser.COMMA_, i);
		}
		public AlterSpecifications_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterSpecifications_; }
	}

	public final AlterSpecifications_Context alterSpecifications_() throws RecognitionException {
		AlterSpecifications_Context _localctx = new AlterSpecifications_Context(_ctx, getState());
		enterRule(_localctx, 274, RULE_alterSpecifications_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1848);
			alterSpecification_();
			setState(1853);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(1849);
				match(COMMA_);
				setState(1850);
				alterSpecification_();
				}
				}
				setState(1855);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlterSpecification_Context extends ParserRuleContext {
		public TableOptions_Context tableOptions_() {
			return getRuleContext(TableOptions_Context.class,0);
		}
		public AddColumnSpecificationContext addColumnSpecification() {
			return getRuleContext(AddColumnSpecificationContext.class,0);
		}
		public AddIndexSpecificationContext addIndexSpecification() {
			return getRuleContext(AddIndexSpecificationContext.class,0);
		}
		public AddConstraintSpecificationContext addConstraintSpecification() {
			return getRuleContext(AddConstraintSpecificationContext.class,0);
		}
		public TerminalNode ADD() { return getToken(MySQLStatementParser.ADD, 0); }
		public CheckConstraintDefinition_Context checkConstraintDefinition_() {
			return getRuleContext(CheckConstraintDefinition_Context.class,0);
		}
		public TerminalNode DROP() { return getToken(MySQLStatementParser.DROP, 0); }
		public TerminalNode CHECK() { return getToken(MySQLStatementParser.CHECK, 0); }
		public IgnoredIdentifier_Context ignoredIdentifier_() {
			return getRuleContext(IgnoredIdentifier_Context.class,0);
		}
		public TerminalNode ALTER() { return getToken(MySQLStatementParser.ALTER, 0); }
		public TerminalNode ENFORCED() { return getToken(MySQLStatementParser.ENFORCED, 0); }
		public TerminalNode NOT() { return getToken(MySQLStatementParser.NOT, 0); }
		public TerminalNode ALGORITHM() { return getToken(MySQLStatementParser.ALGORITHM, 0); }
		public TerminalNode DEFAULT() { return getToken(MySQLStatementParser.DEFAULT, 0); }
		public TerminalNode INSTANT() { return getToken(MySQLStatementParser.INSTANT, 0); }
		public TerminalNode INPLACE() { return getToken(MySQLStatementParser.INPLACE, 0); }
		public TerminalNode COPY() { return getToken(MySQLStatementParser.COPY, 0); }
		public TerminalNode EQ_() { return getToken(MySQLStatementParser.EQ_, 0); }
		public List<ColumnNameContext> columnName() {
			return getRuleContexts(ColumnNameContext.class);
		}
		public ColumnNameContext columnName(int i) {
			return getRuleContext(ColumnNameContext.class,i);
		}
		public TerminalNode SET() { return getToken(MySQLStatementParser.SET, 0); }
		public LiteralsContext literals() {
			return getRuleContext(LiteralsContext.class,0);
		}
		public TerminalNode COLUMN() { return getToken(MySQLStatementParser.COLUMN, 0); }
		public TerminalNode INDEX() { return getToken(MySQLStatementParser.INDEX, 0); }
		public IndexNameContext indexName() {
			return getRuleContext(IndexNameContext.class,0);
		}
		public TerminalNode VISIBLE() { return getToken(MySQLStatementParser.VISIBLE, 0); }
		public TerminalNode INVISIBLE() { return getToken(MySQLStatementParser.INVISIBLE, 0); }
		public ChangeColumnSpecificationContext changeColumnSpecification() {
			return getRuleContext(ChangeColumnSpecificationContext.class,0);
		}
		public CharacterSet_Context characterSet_() {
			return getRuleContext(CharacterSet_Context.class,0);
		}
		public CollateClause_Context collateClause_() {
			return getRuleContext(CollateClause_Context.class,0);
		}
		public TerminalNode CONVERT() { return getToken(MySQLStatementParser.CONVERT, 0); }
		public TerminalNode TO() { return getToken(MySQLStatementParser.TO, 0); }
		public TerminalNode KEYS() { return getToken(MySQLStatementParser.KEYS, 0); }
		public TerminalNode DISABLE() { return getToken(MySQLStatementParser.DISABLE, 0); }
		public TerminalNode ENABLE() { return getToken(MySQLStatementParser.ENABLE, 0); }
		public TerminalNode TABLESPACE() { return getToken(MySQLStatementParser.TABLESPACE, 0); }
		public TerminalNode DISCARD() { return getToken(MySQLStatementParser.DISCARD, 0); }
		public TerminalNode IMPORT_() { return getToken(MySQLStatementParser.IMPORT_, 0); }
		public DropColumnSpecificationContext dropColumnSpecification() {
			return getRuleContext(DropColumnSpecificationContext.class,0);
		}
		public DropIndexSpecificationContext dropIndexSpecification() {
			return getRuleContext(DropIndexSpecificationContext.class,0);
		}
		public DropPrimaryKeySpecificationContext dropPrimaryKeySpecification() {
			return getRuleContext(DropPrimaryKeySpecificationContext.class,0);
		}
		public TerminalNode FOREIGN() { return getToken(MySQLStatementParser.FOREIGN, 0); }
		public TerminalNode KEY() { return getToken(MySQLStatementParser.KEY, 0); }
		public TerminalNode FORCE() { return getToken(MySQLStatementParser.FORCE, 0); }
		public TerminalNode LOCK() { return getToken(MySQLStatementParser.LOCK, 0); }
		public TerminalNode NONE() { return getToken(MySQLStatementParser.NONE, 0); }
		public TerminalNode SHARED() { return getToken(MySQLStatementParser.SHARED, 0); }
		public TerminalNode EXCLUSIVE() { return getToken(MySQLStatementParser.EXCLUSIVE, 0); }
		public ModifyColumnSpecificationContext modifyColumnSpecification() {
			return getRuleContext(ModifyColumnSpecificationContext.class,0);
		}
		public TerminalNode ORDER() { return getToken(MySQLStatementParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(MySQLStatementParser.BY, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(MySQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(MySQLStatementParser.COMMA_, i);
		}
		public RenameColumnSpecificationContext renameColumnSpecification() {
			return getRuleContext(RenameColumnSpecificationContext.class,0);
		}
		public RenameIndexSpecificationContext renameIndexSpecification() {
			return getRuleContext(RenameIndexSpecificationContext.class,0);
		}
		public RenameTableSpecification_Context renameTableSpecification_() {
			return getRuleContext(RenameTableSpecification_Context.class,0);
		}
		public TerminalNode VALIDATION() { return getToken(MySQLStatementParser.VALIDATION, 0); }
		public TerminalNode WITHOUT() { return getToken(MySQLStatementParser.WITHOUT, 0); }
		public List<TerminalNode> WITH() { return getTokens(MySQLStatementParser.WITH); }
		public TerminalNode WITH(int i) {
			return getToken(MySQLStatementParser.WITH, i);
		}
		public TerminalNode PARTITION() { return getToken(MySQLStatementParser.PARTITION, 0); }
		public TerminalNode LP_() { return getToken(MySQLStatementParser.LP_, 0); }
		public PartitionDefinition_Context partitionDefinition_() {
			return getRuleContext(PartitionDefinition_Context.class,0);
		}
		public TerminalNode RP_() { return getToken(MySQLStatementParser.RP_, 0); }
		public IgnoredIdentifiers_Context ignoredIdentifiers_() {
			return getRuleContext(IgnoredIdentifiers_Context.class,0);
		}
		public TerminalNode ALL() { return getToken(MySQLStatementParser.ALL, 0); }
		public TerminalNode TRUNCATE() { return getToken(MySQLStatementParser.TRUNCATE, 0); }
		public TerminalNode COALESCE() { return getToken(MySQLStatementParser.COALESCE, 0); }
		public TerminalNode NUMBER_() { return getToken(MySQLStatementParser.NUMBER_, 0); }
		public TerminalNode REORGANIZE() { return getToken(MySQLStatementParser.REORGANIZE, 0); }
		public TerminalNode INTO() { return getToken(MySQLStatementParser.INTO, 0); }
		public PartitionDefinitions_Context partitionDefinitions_() {
			return getRuleContext(PartitionDefinitions_Context.class,0);
		}
		public TerminalNode EXCHANGE() { return getToken(MySQLStatementParser.EXCHANGE, 0); }
		public TerminalNode TABLE() { return getToken(MySQLStatementParser.TABLE, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode ANALYZE() { return getToken(MySQLStatementParser.ANALYZE, 0); }
		public TerminalNode OPTIMIZE() { return getToken(MySQLStatementParser.OPTIMIZE, 0); }
		public TerminalNode REBUILD() { return getToken(MySQLStatementParser.REBUILD, 0); }
		public TerminalNode REPAIR() { return getToken(MySQLStatementParser.REPAIR, 0); }
		public TerminalNode REMOVE() { return getToken(MySQLStatementParser.REMOVE, 0); }
		public TerminalNode PARTITIONING() { return getToken(MySQLStatementParser.PARTITIONING, 0); }
		public TerminalNode UPGRADE() { return getToken(MySQLStatementParser.UPGRADE, 0); }
		public AlterSpecification_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterSpecification_; }
	}

	public final AlterSpecification_Context alterSpecification_() throws RecognitionException {
		AlterSpecification_Context _localctx = new AlterSpecification_Context(_ctx, getState());
		enterRule(_localctx, 276, RULE_alterSpecification_);
		int _la;
		try {
			int _alt;
			setState(2024);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,245,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1856);
				tableOptions_();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1857);
				addColumnSpecification();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1858);
				addIndexSpecification();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1859);
				addConstraintSpecification();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1860);
				match(ADD);
				setState(1861);
				checkConstraintDefinition_();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1862);
				match(DROP);
				setState(1863);
				match(CHECK);
				setState(1864);
				ignoredIdentifier_();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1865);
				match(ALTER);
				setState(1866);
				match(CHECK);
				setState(1867);
				ignoredIdentifier_();
				setState(1869);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1868);
					match(NOT);
					}
				}

				setState(1871);
				match(ENFORCED);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1873);
				match(ALGORITHM);
				setState(1875);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ_) {
					{
					setState(1874);
					match(EQ_);
					}
				}

				setState(1877);
				_la = _input.LA(1);
				if ( !(_la==DEFAULT || _la==COPY || _la==INPLACE || _la==INSTANT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1878);
				match(ALTER);
				setState(1880);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLUMN) {
					{
					setState(1879);
					match(COLUMN);
					}
				}

				setState(1882);
				columnName();
				setState(1888);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SET:
					{
					setState(1883);
					match(SET);
					setState(1884);
					match(DEFAULT);
					setState(1885);
					literals();
					}
					break;
				case DROP:
					{
					setState(1886);
					match(DROP);
					setState(1887);
					match(DEFAULT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1890);
				match(ALTER);
				setState(1891);
				match(INDEX);
				setState(1892);
				indexName();
				setState(1893);
				_la = _input.LA(1);
				if ( !(_la==VISIBLE || _la==INVISIBLE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1895);
				changeColumnSpecification();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1897);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DEFAULT) {
					{
					setState(1896);
					match(DEFAULT);
					}
				}

				setState(1899);
				characterSet_();
				setState(1901);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLLATE) {
					{
					setState(1900);
					collateClause_();
					}
				}

				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1903);
				match(CONVERT);
				setState(1904);
				match(TO);
				setState(1905);
				characterSet_();
				setState(1907);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLLATE) {
					{
					setState(1906);
					collateClause_();
					}
				}

				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1909);
				_la = _input.LA(1);
				if ( !(_la==DISABLE || _la==ENABLE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1910);
				match(KEYS);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1911);
				_la = _input.LA(1);
				if ( !(_la==DISCARD || _la==IMPORT_) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1912);
				match(TABLESPACE);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1913);
				dropColumnSpecification();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1914);
				dropIndexSpecification();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(1915);
				dropPrimaryKeySpecification();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(1916);
				match(DROP);
				setState(1917);
				match(FOREIGN);
				setState(1918);
				match(KEY);
				setState(1919);
				ignoredIdentifier_();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(1920);
				match(FORCE);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(1921);
				match(LOCK);
				setState(1923);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ_) {
					{
					setState(1922);
					match(EQ_);
					}
				}

				setState(1925);
				_la = _input.LA(1);
				if ( !(_la==DEFAULT || _la==EXCLUSIVE || _la==NONE || _la==SHARED) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(1926);
				modifyColumnSpecification();
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(1927);
				match(ORDER);
				setState(1928);
				match(BY);
				setState(1929);
				columnName();
				setState(1934);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,235,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1930);
						match(COMMA_);
						setState(1931);
						columnName();
						}
						} 
					}
					setState(1936);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,235,_ctx);
				}
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(1937);
				renameColumnSpecification();
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(1938);
				renameIndexSpecification();
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(1939);
				renameTableSpecification_();
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(1940);
				_la = _input.LA(1);
				if ( !(_la==WITH || _la==WITHOUT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1941);
				match(VALIDATION);
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(1942);
				match(ADD);
				setState(1943);
				match(PARTITION);
				setState(1944);
				match(LP_);
				setState(1945);
				partitionDefinition_();
				setState(1946);
				match(RP_);
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(1948);
				match(DROP);
				setState(1949);
				match(PARTITION);
				setState(1950);
				ignoredIdentifiers_();
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(1951);
				match(DISCARD);
				setState(1952);
				match(PARTITION);
				setState(1955);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ANY:
				case DATE:
				case ESCAPE:
				case OFFSET:
				case ROLLUP:
				case SOUNDS:
				case TIME:
				case TIMESTAMP:
				case UNKNOWN:
				case ALWAYS:
				case COMMIT:
				case COMMITTED:
				case CURRENT:
				case DISABLE:
				case ENABLE:
				case LEVEL:
				case NO:
				case PASSWORD:
				case PRIVILEGES:
				case ROLLBACK:
				case START:
				case TRANSACTION:
				case TRUNCATE:
				case ACCOUNT:
				case ACTION:
				case AFTER:
				case ALGORITHM:
				case AUTO_INCREMENT:
				case AVG_ROW_LENGTH:
				case BEGIN:
				case BTREE:
				case CHAIN:
				case CHARSET:
				case CHECKSUM:
				case CIPHER:
				case CLIENT:
				case COALESCE:
				case COLUMNS:
				case COLUMN_FORMAT:
				case COMMENT:
				case COMPACT:
				case COMPRESSED:
				case COMPRESSION:
				case CONNECTION:
				case CONSISTENT:
				case DATA:
				case DELAY_KEY_WRITE:
				case DISCARD:
				case DISK:
				case DUPLICATE:
				case ENCRYPTION:
				case END:
				case ENGINE:
				case EVENT:
				case EXCHANGE:
				case EXECUTE:
				case FILE:
				case FIRST:
				case FIXED:
				case FOLLOWING:
				case GLOBAL:
				case HASH:
				case IMPORT_:
				case INSERT_METHOD:
				case KEY_BLOCK_SIZE:
				case LAST:
				case LESS:
				case MAX_ROWS:
				case MEMORY:
				case MIN_ROWS:
				case MODIFY:
				case NONE:
				case PACK_KEYS:
				case PARSER:
				case PARTIAL:
				case PARTITIONING:
				case PERSIST:
				case PERSIST_ONLY:
				case PRECEDING:
				case PROCESS:
				case PROXY:
				case QUICK:
				case REBUILD:
				case REDUNDANT:
				case RELOAD:
				case REMOVE:
				case REORGANIZE:
				case REPAIR:
				case REVERSE:
				case ROW_FORMAT:
				case SAVEPOINT:
				case SESSION:
				case SHUTDOWN:
				case SIMPLE:
				case SLAVE:
				case SQL_BIG_RESULT:
				case SQL_BUFFER_RESULT:
				case SQL_CACHE:
				case SQL_NO_CACHE:
				case STATS_AUTO_RECALC:
				case STATS_PERSISTENT:
				case STATS_SAMPLE_PAGES:
				case STORAGE:
				case SUBPARTITION:
				case SUPER:
				case TABLES:
				case TABLESPACE:
				case TEMPORARY:
				case THAN:
				case UNBOUNDED:
				case UPGRADE:
				case VALIDATION:
				case VALUE:
				case VIEW:
				case WEIGHT_STRING:
				case WITHOUT:
				case VISIBLE:
				case INVISIBLE:
				case ENFORCED:
				case MICROSECOND:
				case SECOND:
				case MINUTE:
				case HOUR:
				case DAY:
				case WEEK:
				case MONTH:
				case QUARTER:
				case YEAR:
				case AGAINST:
				case LANGUAGE:
				case MODE:
				case QUERY:
				case EXPANSION:
				case BOOLEAN:
				case MAX:
				case MIN:
				case SUM:
				case COUNT:
				case AVG:
				case BIT_AND:
				case BIT_OR:
				case BIT_XOR:
				case GROUP_CONCAT:
				case JSON_ARRAYAGG:
				case JSON_OBJECTAGG:
				case STD:
				case STDDEV:
				case STDDEV_POP:
				case STDDEV_SAMP:
				case VAR_POP:
				case VAR_SAMP:
				case VARIANCE:
				case IDENTIFIER_:
					{
					setState(1953);
					ignoredIdentifiers_();
					}
					break;
				case ALL:
					{
					setState(1954);
					match(ALL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1957);
				match(TABLESPACE);
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(1958);
				match(IMPORT_);
				setState(1959);
				match(PARTITION);
				setState(1962);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ANY:
				case DATE:
				case ESCAPE:
				case OFFSET:
				case ROLLUP:
				case SOUNDS:
				case TIME:
				case TIMESTAMP:
				case UNKNOWN:
				case ALWAYS:
				case COMMIT:
				case COMMITTED:
				case CURRENT:
				case DISABLE:
				case ENABLE:
				case LEVEL:
				case NO:
				case PASSWORD:
				case PRIVILEGES:
				case ROLLBACK:
				case START:
				case TRANSACTION:
				case TRUNCATE:
				case ACCOUNT:
				case ACTION:
				case AFTER:
				case ALGORITHM:
				case AUTO_INCREMENT:
				case AVG_ROW_LENGTH:
				case BEGIN:
				case BTREE:
				case CHAIN:
				case CHARSET:
				case CHECKSUM:
				case CIPHER:
				case CLIENT:
				case COALESCE:
				case COLUMNS:
				case COLUMN_FORMAT:
				case COMMENT:
				case COMPACT:
				case COMPRESSED:
				case COMPRESSION:
				case CONNECTION:
				case CONSISTENT:
				case DATA:
				case DELAY_KEY_WRITE:
				case DISCARD:
				case DISK:
				case DUPLICATE:
				case ENCRYPTION:
				case END:
				case ENGINE:
				case EVENT:
				case EXCHANGE:
				case EXECUTE:
				case FILE:
				case FIRST:
				case FIXED:
				case FOLLOWING:
				case GLOBAL:
				case HASH:
				case IMPORT_:
				case INSERT_METHOD:
				case KEY_BLOCK_SIZE:
				case LAST:
				case LESS:
				case MAX_ROWS:
				case MEMORY:
				case MIN_ROWS:
				case MODIFY:
				case NONE:
				case PACK_KEYS:
				case PARSER:
				case PARTIAL:
				case PARTITIONING:
				case PERSIST:
				case PERSIST_ONLY:
				case PRECEDING:
				case PROCESS:
				case PROXY:
				case QUICK:
				case REBUILD:
				case REDUNDANT:
				case RELOAD:
				case REMOVE:
				case REORGANIZE:
				case REPAIR:
				case REVERSE:
				case ROW_FORMAT:
				case SAVEPOINT:
				case SESSION:
				case SHUTDOWN:
				case SIMPLE:
				case SLAVE:
				case SQL_BIG_RESULT:
				case SQL_BUFFER_RESULT:
				case SQL_CACHE:
				case SQL_NO_CACHE:
				case STATS_AUTO_RECALC:
				case STATS_PERSISTENT:
				case STATS_SAMPLE_PAGES:
				case STORAGE:
				case SUBPARTITION:
				case SUPER:
				case TABLES:
				case TABLESPACE:
				case TEMPORARY:
				case THAN:
				case UNBOUNDED:
				case UPGRADE:
				case VALIDATION:
				case VALUE:
				case VIEW:
				case WEIGHT_STRING:
				case WITHOUT:
				case VISIBLE:
				case INVISIBLE:
				case ENFORCED:
				case MICROSECOND:
				case SECOND:
				case MINUTE:
				case HOUR:
				case DAY:
				case WEEK:
				case MONTH:
				case QUARTER:
				case YEAR:
				case AGAINST:
				case LANGUAGE:
				case MODE:
				case QUERY:
				case EXPANSION:
				case BOOLEAN:
				case MAX:
				case MIN:
				case SUM:
				case COUNT:
				case AVG:
				case BIT_AND:
				case BIT_OR:
				case BIT_XOR:
				case GROUP_CONCAT:
				case JSON_ARRAYAGG:
				case JSON_OBJECTAGG:
				case STD:
				case STDDEV:
				case STDDEV_POP:
				case STDDEV_SAMP:
				case VAR_POP:
				case VAR_SAMP:
				case VARIANCE:
				case IDENTIFIER_:
					{
					setState(1960);
					ignoredIdentifiers_();
					}
					break;
				case ALL:
					{
					setState(1961);
					match(ALL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1964);
				match(TABLESPACE);
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(1965);
				match(TRUNCATE);
				setState(1966);
				match(PARTITION);
				setState(1969);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ANY:
				case DATE:
				case ESCAPE:
				case OFFSET:
				case ROLLUP:
				case SOUNDS:
				case TIME:
				case TIMESTAMP:
				case UNKNOWN:
				case ALWAYS:
				case COMMIT:
				case COMMITTED:
				case CURRENT:
				case DISABLE:
				case ENABLE:
				case LEVEL:
				case NO:
				case PASSWORD:
				case PRIVILEGES:
				case ROLLBACK:
				case START:
				case TRANSACTION:
				case TRUNCATE:
				case ACCOUNT:
				case ACTION:
				case AFTER:
				case ALGORITHM:
				case AUTO_INCREMENT:
				case AVG_ROW_LENGTH:
				case BEGIN:
				case BTREE:
				case CHAIN:
				case CHARSET:
				case CHECKSUM:
				case CIPHER:
				case CLIENT:
				case COALESCE:
				case COLUMNS:
				case COLUMN_FORMAT:
				case COMMENT:
				case COMPACT:
				case COMPRESSED:
				case COMPRESSION:
				case CONNECTION:
				case CONSISTENT:
				case DATA:
				case DELAY_KEY_WRITE:
				case DISCARD:
				case DISK:
				case DUPLICATE:
				case ENCRYPTION:
				case END:
				case ENGINE:
				case EVENT:
				case EXCHANGE:
				case EXECUTE:
				case FILE:
				case FIRST:
				case FIXED:
				case FOLLOWING:
				case GLOBAL:
				case HASH:
				case IMPORT_:
				case INSERT_METHOD:
				case KEY_BLOCK_SIZE:
				case LAST:
				case LESS:
				case MAX_ROWS:
				case MEMORY:
				case MIN_ROWS:
				case MODIFY:
				case NONE:
				case PACK_KEYS:
				case PARSER:
				case PARTIAL:
				case PARTITIONING:
				case PERSIST:
				case PERSIST_ONLY:
				case PRECEDING:
				case PROCESS:
				case PROXY:
				case QUICK:
				case REBUILD:
				case REDUNDANT:
				case RELOAD:
				case REMOVE:
				case REORGANIZE:
				case REPAIR:
				case REVERSE:
				case ROW_FORMAT:
				case SAVEPOINT:
				case SESSION:
				case SHUTDOWN:
				case SIMPLE:
				case SLAVE:
				case SQL_BIG_RESULT:
				case SQL_BUFFER_RESULT:
				case SQL_CACHE:
				case SQL_NO_CACHE:
				case STATS_AUTO_RECALC:
				case STATS_PERSISTENT:
				case STATS_SAMPLE_PAGES:
				case STORAGE:
				case SUBPARTITION:
				case SUPER:
				case TABLES:
				case TABLESPACE:
				case TEMPORARY:
				case THAN:
				case UNBOUNDED:
				case UPGRADE:
				case VALIDATION:
				case VALUE:
				case VIEW:
				case WEIGHT_STRING:
				case WITHOUT:
				case VISIBLE:
				case INVISIBLE:
				case ENFORCED:
				case MICROSECOND:
				case SECOND:
				case MINUTE:
				case HOUR:
				case DAY:
				case WEEK:
				case MONTH:
				case QUARTER:
				case YEAR:
				case AGAINST:
				case LANGUAGE:
				case MODE:
				case QUERY:
				case EXPANSION:
				case BOOLEAN:
				case MAX:
				case MIN:
				case SUM:
				case COUNT:
				case AVG:
				case BIT_AND:
				case BIT_OR:
				case BIT_XOR:
				case GROUP_CONCAT:
				case JSON_ARRAYAGG:
				case JSON_OBJECTAGG:
				case STD:
				case STDDEV:
				case STDDEV_POP:
				case STDDEV_SAMP:
				case VAR_POP:
				case VAR_SAMP:
				case VARIANCE:
				case IDENTIFIER_:
					{
					setState(1967);
					ignoredIdentifiers_();
					}
					break;
				case ALL:
					{
					setState(1968);
					match(ALL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(1971);
				match(COALESCE);
				setState(1972);
				match(PARTITION);
				setState(1973);
				match(NUMBER_);
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(1974);
				match(REORGANIZE);
				setState(1975);
				match(PARTITION);
				setState(1976);
				ignoredIdentifiers_();
				setState(1977);
				match(INTO);
				setState(1978);
				partitionDefinitions_();
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(1980);
				match(EXCHANGE);
				setState(1981);
				match(PARTITION);
				setState(1982);
				ignoredIdentifier_();
				setState(1983);
				match(WITH);
				setState(1984);
				match(TABLE);
				setState(1985);
				tableName();
				setState(1988);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH || _la==WITHOUT) {
					{
					setState(1986);
					_la = _input.LA(1);
					if ( !(_la==WITH || _la==WITHOUT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1987);
					match(VALIDATION);
					}
				}

				}
				break;
			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(1990);
				match(ANALYZE);
				setState(1991);
				match(PARTITION);
				setState(1994);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ANY:
				case DATE:
				case ESCAPE:
				case OFFSET:
				case ROLLUP:
				case SOUNDS:
				case TIME:
				case TIMESTAMP:
				case UNKNOWN:
				case ALWAYS:
				case COMMIT:
				case COMMITTED:
				case CURRENT:
				case DISABLE:
				case ENABLE:
				case LEVEL:
				case NO:
				case PASSWORD:
				case PRIVILEGES:
				case ROLLBACK:
				case START:
				case TRANSACTION:
				case TRUNCATE:
				case ACCOUNT:
				case ACTION:
				case AFTER:
				case ALGORITHM:
				case AUTO_INCREMENT:
				case AVG_ROW_LENGTH:
				case BEGIN:
				case BTREE:
				case CHAIN:
				case CHARSET:
				case CHECKSUM:
				case CIPHER:
				case CLIENT:
				case COALESCE:
				case COLUMNS:
				case COLUMN_FORMAT:
				case COMMENT:
				case COMPACT:
				case COMPRESSED:
				case COMPRESSION:
				case CONNECTION:
				case CONSISTENT:
				case DATA:
				case DELAY_KEY_WRITE:
				case DISCARD:
				case DISK:
				case DUPLICATE:
				case ENCRYPTION:
				case END:
				case ENGINE:
				case EVENT:
				case EXCHANGE:
				case EXECUTE:
				case FILE:
				case FIRST:
				case FIXED:
				case FOLLOWING:
				case GLOBAL:
				case HASH:
				case IMPORT_:
				case INSERT_METHOD:
				case KEY_BLOCK_SIZE:
				case LAST:
				case LESS:
				case MAX_ROWS:
				case MEMORY:
				case MIN_ROWS:
				case MODIFY:
				case NONE:
				case PACK_KEYS:
				case PARSER:
				case PARTIAL:
				case PARTITIONING:
				case PERSIST:
				case PERSIST_ONLY:
				case PRECEDING:
				case PROCESS:
				case PROXY:
				case QUICK:
				case REBUILD:
				case REDUNDANT:
				case RELOAD:
				case REMOVE:
				case REORGANIZE:
				case REPAIR:
				case REVERSE:
				case ROW_FORMAT:
				case SAVEPOINT:
				case SESSION:
				case SHUTDOWN:
				case SIMPLE:
				case SLAVE:
				case SQL_BIG_RESULT:
				case SQL_BUFFER_RESULT:
				case SQL_CACHE:
				case SQL_NO_CACHE:
				case STATS_AUTO_RECALC:
				case STATS_PERSISTENT:
				case STATS_SAMPLE_PAGES:
				case STORAGE:
				case SUBPARTITION:
				case SUPER:
				case TABLES:
				case TABLESPACE:
				case TEMPORARY:
				case THAN:
				case UNBOUNDED:
				case UPGRADE:
				case VALIDATION:
				case VALUE:
				case VIEW:
				case WEIGHT_STRING:
				case WITHOUT:
				case VISIBLE:
				case INVISIBLE:
				case ENFORCED:
				case MICROSECOND:
				case SECOND:
				case MINUTE:
				case HOUR:
				case DAY:
				case WEEK:
				case MONTH:
				case QUARTER:
				case YEAR:
				case AGAINST:
				case LANGUAGE:
				case MODE:
				case QUERY:
				case EXPANSION:
				case BOOLEAN:
				case MAX:
				case MIN:
				case SUM:
				case COUNT:
				case AVG:
				case BIT_AND:
				case BIT_OR:
				case BIT_XOR:
				case GROUP_CONCAT:
				case JSON_ARRAYAGG:
				case JSON_OBJECTAGG:
				case STD:
				case STDDEV:
				case STDDEV_POP:
				case STDDEV_SAMP:
				case VAR_POP:
				case VAR_SAMP:
				case VARIANCE:
				case IDENTIFIER_:
					{
					setState(1992);
					ignoredIdentifiers_();
					}
					break;
				case ALL:
					{
					setState(1993);
					match(ALL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 37);
				{
				setState(1996);
				match(CHECK);
				setState(1997);
				match(PARTITION);
				setState(2000);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ANY:
				case DATE:
				case ESCAPE:
				case OFFSET:
				case ROLLUP:
				case SOUNDS:
				case TIME:
				case TIMESTAMP:
				case UNKNOWN:
				case ALWAYS:
				case COMMIT:
				case COMMITTED:
				case CURRENT:
				case DISABLE:
				case ENABLE:
				case LEVEL:
				case NO:
				case PASSWORD:
				case PRIVILEGES:
				case ROLLBACK:
				case START:
				case TRANSACTION:
				case TRUNCATE:
				case ACCOUNT:
				case ACTION:
				case AFTER:
				case ALGORITHM:
				case AUTO_INCREMENT:
				case AVG_ROW_LENGTH:
				case BEGIN:
				case BTREE:
				case CHAIN:
				case CHARSET:
				case CHECKSUM:
				case CIPHER:
				case CLIENT:
				case COALESCE:
				case COLUMNS:
				case COLUMN_FORMAT:
				case COMMENT:
				case COMPACT:
				case COMPRESSED:
				case COMPRESSION:
				case CONNECTION:
				case CONSISTENT:
				case DATA:
				case DELAY_KEY_WRITE:
				case DISCARD:
				case DISK:
				case DUPLICATE:
				case ENCRYPTION:
				case END:
				case ENGINE:
				case EVENT:
				case EXCHANGE:
				case EXECUTE:
				case FILE:
				case FIRST:
				case FIXED:
				case FOLLOWING:
				case GLOBAL:
				case HASH:
				case IMPORT_:
				case INSERT_METHOD:
				case KEY_BLOCK_SIZE:
				case LAST:
				case LESS:
				case MAX_ROWS:
				case MEMORY:
				case MIN_ROWS:
				case MODIFY:
				case NONE:
				case PACK_KEYS:
				case PARSER:
				case PARTIAL:
				case PARTITIONING:
				case PERSIST:
				case PERSIST_ONLY:
				case PRECEDING:
				case PROCESS:
				case PROXY:
				case QUICK:
				case REBUILD:
				case REDUNDANT:
				case RELOAD:
				case REMOVE:
				case REORGANIZE:
				case REPAIR:
				case REVERSE:
				case ROW_FORMAT:
				case SAVEPOINT:
				case SESSION:
				case SHUTDOWN:
				case SIMPLE:
				case SLAVE:
				case SQL_BIG_RESULT:
				case SQL_BUFFER_RESULT:
				case SQL_CACHE:
				case SQL_NO_CACHE:
				case STATS_AUTO_RECALC:
				case STATS_PERSISTENT:
				case STATS_SAMPLE_PAGES:
				case STORAGE:
				case SUBPARTITION:
				case SUPER:
				case TABLES:
				case TABLESPACE:
				case TEMPORARY:
				case THAN:
				case UNBOUNDED:
				case UPGRADE:
				case VALIDATION:
				case VALUE:
				case VIEW:
				case WEIGHT_STRING:
				case WITHOUT:
				case VISIBLE:
				case INVISIBLE:
				case ENFORCED:
				case MICROSECOND:
				case SECOND:
				case MINUTE:
				case HOUR:
				case DAY:
				case WEEK:
				case MONTH:
				case QUARTER:
				case YEAR:
				case AGAINST:
				case LANGUAGE:
				case MODE:
				case QUERY:
				case EXPANSION:
				case BOOLEAN:
				case MAX:
				case MIN:
				case SUM:
				case COUNT:
				case AVG:
				case BIT_AND:
				case BIT_OR:
				case BIT_XOR:
				case GROUP_CONCAT:
				case JSON_ARRAYAGG:
				case JSON_OBJECTAGG:
				case STD:
				case STDDEV:
				case STDDEV_POP:
				case STDDEV_SAMP:
				case VAR_POP:
				case VAR_SAMP:
				case VARIANCE:
				case IDENTIFIER_:
					{
					setState(1998);
					ignoredIdentifiers_();
					}
					break;
				case ALL:
					{
					setState(1999);
					match(ALL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 38:
				enterOuterAlt(_localctx, 38);
				{
				setState(2002);
				match(OPTIMIZE);
				setState(2003);
				match(PARTITION);
				setState(2006);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ANY:
				case DATE:
				case ESCAPE:
				case OFFSET:
				case ROLLUP:
				case SOUNDS:
				case TIME:
				case TIMESTAMP:
				case UNKNOWN:
				case ALWAYS:
				case COMMIT:
				case COMMITTED:
				case CURRENT:
				case DISABLE:
				case ENABLE:
				case LEVEL:
				case NO:
				case PASSWORD:
				case PRIVILEGES:
				case ROLLBACK:
				case START:
				case TRANSACTION:
				case TRUNCATE:
				case ACCOUNT:
				case ACTION:
				case AFTER:
				case ALGORITHM:
				case AUTO_INCREMENT:
				case AVG_ROW_LENGTH:
				case BEGIN:
				case BTREE:
				case CHAIN:
				case CHARSET:
				case CHECKSUM:
				case CIPHER:
				case CLIENT:
				case COALESCE:
				case COLUMNS:
				case COLUMN_FORMAT:
				case COMMENT:
				case COMPACT:
				case COMPRESSED:
				case COMPRESSION:
				case CONNECTION:
				case CONSISTENT:
				case DATA:
				case DELAY_KEY_WRITE:
				case DISCARD:
				case DISK:
				case DUPLICATE:
				case ENCRYPTION:
				case END:
				case ENGINE:
				case EVENT:
				case EXCHANGE:
				case EXECUTE:
				case FILE:
				case FIRST:
				case FIXED:
				case FOLLOWING:
				case GLOBAL:
				case HASH:
				case IMPORT_:
				case INSERT_METHOD:
				case KEY_BLOCK_SIZE:
				case LAST:
				case LESS:
				case MAX_ROWS:
				case MEMORY:
				case MIN_ROWS:
				case MODIFY:
				case NONE:
				case PACK_KEYS:
				case PARSER:
				case PARTIAL:
				case PARTITIONING:
				case PERSIST:
				case PERSIST_ONLY:
				case PRECEDING:
				case PROCESS:
				case PROXY:
				case QUICK:
				case REBUILD:
				case REDUNDANT:
				case RELOAD:
				case REMOVE:
				case REORGANIZE:
				case REPAIR:
				case REVERSE:
				case ROW_FORMAT:
				case SAVEPOINT:
				case SESSION:
				case SHUTDOWN:
				case SIMPLE:
				case SLAVE:
				case SQL_BIG_RESULT:
				case SQL_BUFFER_RESULT:
				case SQL_CACHE:
				case SQL_NO_CACHE:
				case STATS_AUTO_RECALC:
				case STATS_PERSISTENT:
				case STATS_SAMPLE_PAGES:
				case STORAGE:
				case SUBPARTITION:
				case SUPER:
				case TABLES:
				case TABLESPACE:
				case TEMPORARY:
				case THAN:
				case UNBOUNDED:
				case UPGRADE:
				case VALIDATION:
				case VALUE:
				case VIEW:
				case WEIGHT_STRING:
				case WITHOUT:
				case VISIBLE:
				case INVISIBLE:
				case ENFORCED:
				case MICROSECOND:
				case SECOND:
				case MINUTE:
				case HOUR:
				case DAY:
				case WEEK:
				case MONTH:
				case QUARTER:
				case YEAR:
				case AGAINST:
				case LANGUAGE:
				case MODE:
				case QUERY:
				case EXPANSION:
				case BOOLEAN:
				case MAX:
				case MIN:
				case SUM:
				case COUNT:
				case AVG:
				case BIT_AND:
				case BIT_OR:
				case BIT_XOR:
				case GROUP_CONCAT:
				case JSON_ARRAYAGG:
				case JSON_OBJECTAGG:
				case STD:
				case STDDEV:
				case STDDEV_POP:
				case STDDEV_SAMP:
				case VAR_POP:
				case VAR_SAMP:
				case VARIANCE:
				case IDENTIFIER_:
					{
					setState(2004);
					ignoredIdentifiers_();
					}
					break;
				case ALL:
					{
					setState(2005);
					match(ALL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 39:
				enterOuterAlt(_localctx, 39);
				{
				setState(2008);
				match(REBUILD);
				setState(2009);
				match(PARTITION);
				setState(2012);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ANY:
				case DATE:
				case ESCAPE:
				case OFFSET:
				case ROLLUP:
				case SOUNDS:
				case TIME:
				case TIMESTAMP:
				case UNKNOWN:
				case ALWAYS:
				case COMMIT:
				case COMMITTED:
				case CURRENT:
				case DISABLE:
				case ENABLE:
				case LEVEL:
				case NO:
				case PASSWORD:
				case PRIVILEGES:
				case ROLLBACK:
				case START:
				case TRANSACTION:
				case TRUNCATE:
				case ACCOUNT:
				case ACTION:
				case AFTER:
				case ALGORITHM:
				case AUTO_INCREMENT:
				case AVG_ROW_LENGTH:
				case BEGIN:
				case BTREE:
				case CHAIN:
				case CHARSET:
				case CHECKSUM:
				case CIPHER:
				case CLIENT:
				case COALESCE:
				case COLUMNS:
				case COLUMN_FORMAT:
				case COMMENT:
				case COMPACT:
				case COMPRESSED:
				case COMPRESSION:
				case CONNECTION:
				case CONSISTENT:
				case DATA:
				case DELAY_KEY_WRITE:
				case DISCARD:
				case DISK:
				case DUPLICATE:
				case ENCRYPTION:
				case END:
				case ENGINE:
				case EVENT:
				case EXCHANGE:
				case EXECUTE:
				case FILE:
				case FIRST:
				case FIXED:
				case FOLLOWING:
				case GLOBAL:
				case HASH:
				case IMPORT_:
				case INSERT_METHOD:
				case KEY_BLOCK_SIZE:
				case LAST:
				case LESS:
				case MAX_ROWS:
				case MEMORY:
				case MIN_ROWS:
				case MODIFY:
				case NONE:
				case PACK_KEYS:
				case PARSER:
				case PARTIAL:
				case PARTITIONING:
				case PERSIST:
				case PERSIST_ONLY:
				case PRECEDING:
				case PROCESS:
				case PROXY:
				case QUICK:
				case REBUILD:
				case REDUNDANT:
				case RELOAD:
				case REMOVE:
				case REORGANIZE:
				case REPAIR:
				case REVERSE:
				case ROW_FORMAT:
				case SAVEPOINT:
				case SESSION:
				case SHUTDOWN:
				case SIMPLE:
				case SLAVE:
				case SQL_BIG_RESULT:
				case SQL_BUFFER_RESULT:
				case SQL_CACHE:
				case SQL_NO_CACHE:
				case STATS_AUTO_RECALC:
				case STATS_PERSISTENT:
				case STATS_SAMPLE_PAGES:
				case STORAGE:
				case SUBPARTITION:
				case SUPER:
				case TABLES:
				case TABLESPACE:
				case TEMPORARY:
				case THAN:
				case UNBOUNDED:
				case UPGRADE:
				case VALIDATION:
				case VALUE:
				case VIEW:
				case WEIGHT_STRING:
				case WITHOUT:
				case VISIBLE:
				case INVISIBLE:
				case ENFORCED:
				case MICROSECOND:
				case SECOND:
				case MINUTE:
				case HOUR:
				case DAY:
				case WEEK:
				case MONTH:
				case QUARTER:
				case YEAR:
				case AGAINST:
				case LANGUAGE:
				case MODE:
				case QUERY:
				case EXPANSION:
				case BOOLEAN:
				case MAX:
				case MIN:
				case SUM:
				case COUNT:
				case AVG:
				case BIT_AND:
				case BIT_OR:
				case BIT_XOR:
				case GROUP_CONCAT:
				case JSON_ARRAYAGG:
				case JSON_OBJECTAGG:
				case STD:
				case STDDEV:
				case STDDEV_POP:
				case STDDEV_SAMP:
				case VAR_POP:
				case VAR_SAMP:
				case VARIANCE:
				case IDENTIFIER_:
					{
					setState(2010);
					ignoredIdentifiers_();
					}
					break;
				case ALL:
					{
					setState(2011);
					match(ALL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 40);
				{
				setState(2014);
				match(REPAIR);
				setState(2015);
				match(PARTITION);
				setState(2018);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ANY:
				case DATE:
				case ESCAPE:
				case OFFSET:
				case ROLLUP:
				case SOUNDS:
				case TIME:
				case TIMESTAMP:
				case UNKNOWN:
				case ALWAYS:
				case COMMIT:
				case COMMITTED:
				case CURRENT:
				case DISABLE:
				case ENABLE:
				case LEVEL:
				case NO:
				case PASSWORD:
				case PRIVILEGES:
				case ROLLBACK:
				case START:
				case TRANSACTION:
				case TRUNCATE:
				case ACCOUNT:
				case ACTION:
				case AFTER:
				case ALGORITHM:
				case AUTO_INCREMENT:
				case AVG_ROW_LENGTH:
				case BEGIN:
				case BTREE:
				case CHAIN:
				case CHARSET:
				case CHECKSUM:
				case CIPHER:
				case CLIENT:
				case COALESCE:
				case COLUMNS:
				case COLUMN_FORMAT:
				case COMMENT:
				case COMPACT:
				case COMPRESSED:
				case COMPRESSION:
				case CONNECTION:
				case CONSISTENT:
				case DATA:
				case DELAY_KEY_WRITE:
				case DISCARD:
				case DISK:
				case DUPLICATE:
				case ENCRYPTION:
				case END:
				case ENGINE:
				case EVENT:
				case EXCHANGE:
				case EXECUTE:
				case FILE:
				case FIRST:
				case FIXED:
				case FOLLOWING:
				case GLOBAL:
				case HASH:
				case IMPORT_:
				case INSERT_METHOD:
				case KEY_BLOCK_SIZE:
				case LAST:
				case LESS:
				case MAX_ROWS:
				case MEMORY:
				case MIN_ROWS:
				case MODIFY:
				case NONE:
				case PACK_KEYS:
				case PARSER:
				case PARTIAL:
				case PARTITIONING:
				case PERSIST:
				case PERSIST_ONLY:
				case PRECEDING:
				case PROCESS:
				case PROXY:
				case QUICK:
				case REBUILD:
				case REDUNDANT:
				case RELOAD:
				case REMOVE:
				case REORGANIZE:
				case REPAIR:
				case REVERSE:
				case ROW_FORMAT:
				case SAVEPOINT:
				case SESSION:
				case SHUTDOWN:
				case SIMPLE:
				case SLAVE:
				case SQL_BIG_RESULT:
				case SQL_BUFFER_RESULT:
				case SQL_CACHE:
				case SQL_NO_CACHE:
				case STATS_AUTO_RECALC:
				case STATS_PERSISTENT:
				case STATS_SAMPLE_PAGES:
				case STORAGE:
				case SUBPARTITION:
				case SUPER:
				case TABLES:
				case TABLESPACE:
				case TEMPORARY:
				case THAN:
				case UNBOUNDED:
				case UPGRADE:
				case VALIDATION:
				case VALUE:
				case VIEW:
				case WEIGHT_STRING:
				case WITHOUT:
				case VISIBLE:
				case INVISIBLE:
				case ENFORCED:
				case MICROSECOND:
				case SECOND:
				case MINUTE:
				case HOUR:
				case DAY:
				case WEEK:
				case MONTH:
				case QUARTER:
				case YEAR:
				case AGAINST:
				case LANGUAGE:
				case MODE:
				case QUERY:
				case EXPANSION:
				case BOOLEAN:
				case MAX:
				case MIN:
				case SUM:
				case COUNT:
				case AVG:
				case BIT_AND:
				case BIT_OR:
				case BIT_XOR:
				case GROUP_CONCAT:
				case JSON_ARRAYAGG:
				case JSON_OBJECTAGG:
				case STD:
				case STDDEV:
				case STDDEV_POP:
				case STDDEV_SAMP:
				case VAR_POP:
				case VAR_SAMP:
				case VARIANCE:
				case IDENTIFIER_:
					{
					setState(2016);
					ignoredIdentifiers_();
					}
					break;
				case ALL:
					{
					setState(2017);
					match(ALL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 41:
				enterOuterAlt(_localctx, 41);
				{
				setState(2020);
				match(REMOVE);
				setState(2021);
				match(PARTITIONING);
				}
				break;
			case 42:
				enterOuterAlt(_localctx, 42);
				{
				setState(2022);
				match(UPGRADE);
				setState(2023);
				match(PARTITIONING);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableOptions_Context extends ParserRuleContext {
		public List<TableOption_Context> tableOption_() {
			return getRuleContexts(TableOption_Context.class);
		}
		public TableOption_Context tableOption_(int i) {
			return getRuleContext(TableOption_Context.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(MySQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(MySQLStatementParser.COMMA_, i);
		}
		public TableOptions_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableOptions_; }
	}

	public final TableOptions_Context tableOptions_() throws RecognitionException {
		TableOptions_Context _localctx = new TableOptions_Context(_ctx, getState());
		enterRule(_localctx, 278, RULE_tableOptions_);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2026);
			tableOption_();
			setState(2033);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,247,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2028);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA_) {
						{
						setState(2027);
						match(COMMA_);
						}
					}

					setState(2030);
					tableOption_();
					}
					} 
				}
				setState(2035);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,247,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableOption_Context extends ParserRuleContext {
		public TerminalNode AUTO_INCREMENT() { return getToken(MySQLStatementParser.AUTO_INCREMENT, 0); }
		public TerminalNode NUMBER_() { return getToken(MySQLStatementParser.NUMBER_, 0); }
		public TerminalNode EQ_() { return getToken(MySQLStatementParser.EQ_, 0); }
		public TerminalNode AVG_ROW_LENGTH() { return getToken(MySQLStatementParser.AVG_ROW_LENGTH, 0); }
		public CharacterSet_Context characterSet_() {
			return getRuleContext(CharacterSet_Context.class,0);
		}
		public CollateClause_Context collateClause_() {
			return getRuleContext(CollateClause_Context.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(MySQLStatementParser.DEFAULT, 0); }
		public TerminalNode CHECKSUM() { return getToken(MySQLStatementParser.CHECKSUM, 0); }
		public TerminalNode COMMENT() { return getToken(MySQLStatementParser.COMMENT, 0); }
		public TerminalNode STRING_() { return getToken(MySQLStatementParser.STRING_, 0); }
		public TerminalNode COMPRESSION() { return getToken(MySQLStatementParser.COMPRESSION, 0); }
		public TerminalNode CONNECTION() { return getToken(MySQLStatementParser.CONNECTION, 0); }
		public TerminalNode DIRECTORY() { return getToken(MySQLStatementParser.DIRECTORY, 0); }
		public TerminalNode DATA() { return getToken(MySQLStatementParser.DATA, 0); }
		public TerminalNode INDEX() { return getToken(MySQLStatementParser.INDEX, 0); }
		public TerminalNode DELAY_KEY_WRITE() { return getToken(MySQLStatementParser.DELAY_KEY_WRITE, 0); }
		public TerminalNode ENCRYPTION() { return getToken(MySQLStatementParser.ENCRYPTION, 0); }
		public TerminalNode ENGINE() { return getToken(MySQLStatementParser.ENGINE, 0); }
		public IgnoredIdentifier_Context ignoredIdentifier_() {
			return getRuleContext(IgnoredIdentifier_Context.class,0);
		}
		public TerminalNode INSERT_METHOD() { return getToken(MySQLStatementParser.INSERT_METHOD, 0); }
		public TerminalNode NO() { return getToken(MySQLStatementParser.NO, 0); }
		public TerminalNode FIRST() { return getToken(MySQLStatementParser.FIRST, 0); }
		public TerminalNode LAST() { return getToken(MySQLStatementParser.LAST, 0); }
		public TerminalNode KEY_BLOCK_SIZE() { return getToken(MySQLStatementParser.KEY_BLOCK_SIZE, 0); }
		public TerminalNode MAX_ROWS() { return getToken(MySQLStatementParser.MAX_ROWS, 0); }
		public TerminalNode MIN_ROWS() { return getToken(MySQLStatementParser.MIN_ROWS, 0); }
		public TerminalNode PACK_KEYS() { return getToken(MySQLStatementParser.PACK_KEYS, 0); }
		public TerminalNode PASSWORD() { return getToken(MySQLStatementParser.PASSWORD, 0); }
		public TerminalNode ROW_FORMAT() { return getToken(MySQLStatementParser.ROW_FORMAT, 0); }
		public TerminalNode DYNAMIC() { return getToken(MySQLStatementParser.DYNAMIC, 0); }
		public TerminalNode FIXED() { return getToken(MySQLStatementParser.FIXED, 0); }
		public TerminalNode COMPRESSED() { return getToken(MySQLStatementParser.COMPRESSED, 0); }
		public TerminalNode REDUNDANT() { return getToken(MySQLStatementParser.REDUNDANT, 0); }
		public TerminalNode COMPACT() { return getToken(MySQLStatementParser.COMPACT, 0); }
		public TerminalNode STATS_AUTO_RECALC() { return getToken(MySQLStatementParser.STATS_AUTO_RECALC, 0); }
		public TerminalNode STATS_PERSISTENT() { return getToken(MySQLStatementParser.STATS_PERSISTENT, 0); }
		public TerminalNode STATS_SAMPLE_PAGES() { return getToken(MySQLStatementParser.STATS_SAMPLE_PAGES, 0); }
		public TerminalNode TABLESPACE() { return getToken(MySQLStatementParser.TABLESPACE, 0); }
		public TerminalNode STORAGE() { return getToken(MySQLStatementParser.STORAGE, 0); }
		public TerminalNode DISK() { return getToken(MySQLStatementParser.DISK, 0); }
		public TerminalNode MEMORY() { return getToken(MySQLStatementParser.MEMORY, 0); }
		public TerminalNode UNION() { return getToken(MySQLStatementParser.UNION, 0); }
		public TerminalNode LP_() { return getToken(MySQLStatementParser.LP_, 0); }
		public List<TableNameContext> tableName() {
			return getRuleContexts(TableNameContext.class);
		}
		public TableNameContext tableName(int i) {
			return getRuleContext(TableNameContext.class,i);
		}
		public TerminalNode RP_() { return getToken(MySQLStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(MySQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(MySQLStatementParser.COMMA_, i);
		}
		public TableOption_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableOption_; }
	}

	public final TableOption_Context tableOption_() throws RecognitionException {
		TableOption_Context _localctx = new TableOption_Context(_ctx, getState());
		enterRule(_localctx, 280, RULE_tableOption_);
		int _la;
		try {
			setState(2165);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AUTO_INCREMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(2036);
				match(AUTO_INCREMENT);
				setState(2038);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ_) {
					{
					setState(2037);
					match(EQ_);
					}
				}

				setState(2040);
				match(NUMBER_);
				}
				break;
			case AVG_ROW_LENGTH:
				enterOuterAlt(_localctx, 2);
				{
				setState(2041);
				match(AVG_ROW_LENGTH);
				setState(2043);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ_) {
					{
					setState(2042);
					match(EQ_);
					}
				}

				setState(2045);
				match(NUMBER_);
				}
				break;
			case DEFAULT:
			case CHAR:
			case CHARACTER:
			case CHARSET:
			case COLLATE:
				enterOuterAlt(_localctx, 3);
				{
				setState(2047);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DEFAULT) {
					{
					setState(2046);
					match(DEFAULT);
					}
				}

				setState(2051);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CHAR:
				case CHARACTER:
				case CHARSET:
					{
					setState(2049);
					characterSet_();
					}
					break;
				case COLLATE:
					{
					setState(2050);
					collateClause_();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case CHECKSUM:
				enterOuterAlt(_localctx, 4);
				{
				setState(2053);
				match(CHECKSUM);
				setState(2055);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ_) {
					{
					setState(2054);
					match(EQ_);
					}
				}

				setState(2057);
				match(NUMBER_);
				}
				break;
			case COMMENT:
				enterOuterAlt(_localctx, 5);
				{
				setState(2058);
				match(COMMENT);
				setState(2060);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ_) {
					{
					setState(2059);
					match(EQ_);
					}
				}

				setState(2062);
				match(STRING_);
				}
				break;
			case COMPRESSION:
				enterOuterAlt(_localctx, 6);
				{
				setState(2063);
				match(COMPRESSION);
				setState(2065);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ_) {
					{
					setState(2064);
					match(EQ_);
					}
				}

				setState(2067);
				match(STRING_);
				}
				break;
			case CONNECTION:
				enterOuterAlt(_localctx, 7);
				{
				setState(2068);
				match(CONNECTION);
				setState(2070);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ_) {
					{
					setState(2069);
					match(EQ_);
					}
				}

				setState(2072);
				match(STRING_);
				}
				break;
			case INDEX:
			case DATA:
				enterOuterAlt(_localctx, 8);
				{
				setState(2073);
				_la = _input.LA(1);
				if ( !(_la==INDEX || _la==DATA) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2074);
				match(DIRECTORY);
				setState(2076);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ_) {
					{
					setState(2075);
					match(EQ_);
					}
				}

				setState(2078);
				match(STRING_);
				}
				break;
			case DELAY_KEY_WRITE:
				enterOuterAlt(_localctx, 9);
				{
				setState(2079);
				match(DELAY_KEY_WRITE);
				setState(2081);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ_) {
					{
					setState(2080);
					match(EQ_);
					}
				}

				setState(2083);
				match(NUMBER_);
				}
				break;
			case ENCRYPTION:
				enterOuterAlt(_localctx, 10);
				{
				setState(2084);
				match(ENCRYPTION);
				setState(2086);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ_) {
					{
					setState(2085);
					match(EQ_);
					}
				}

				setState(2088);
				match(STRING_);
				}
				break;
			case ENGINE:
				enterOuterAlt(_localctx, 11);
				{
				setState(2089);
				match(ENGINE);
				setState(2091);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ_) {
					{
					setState(2090);
					match(EQ_);
					}
				}

				setState(2093);
				ignoredIdentifier_();
				}
				break;
			case INSERT_METHOD:
				enterOuterAlt(_localctx, 12);
				{
				setState(2094);
				match(INSERT_METHOD);
				setState(2096);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ_) {
					{
					setState(2095);
					match(EQ_);
					}
				}

				setState(2098);
				_la = _input.LA(1);
				if ( !(_la==NO || _la==FIRST || _la==LAST) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case KEY_BLOCK_SIZE:
				enterOuterAlt(_localctx, 13);
				{
				setState(2099);
				match(KEY_BLOCK_SIZE);
				setState(2101);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ_) {
					{
					setState(2100);
					match(EQ_);
					}
				}

				setState(2103);
				match(NUMBER_);
				}
				break;
			case MAX_ROWS:
				enterOuterAlt(_localctx, 14);
				{
				setState(2104);
				match(MAX_ROWS);
				setState(2106);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ_) {
					{
					setState(2105);
					match(EQ_);
					}
				}

				setState(2108);
				match(NUMBER_);
				}
				break;
			case MIN_ROWS:
				enterOuterAlt(_localctx, 15);
				{
				setState(2109);
				match(MIN_ROWS);
				setState(2111);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ_) {
					{
					setState(2110);
					match(EQ_);
					}
				}

				setState(2113);
				match(NUMBER_);
				}
				break;
			case PACK_KEYS:
				enterOuterAlt(_localctx, 16);
				{
				setState(2114);
				match(PACK_KEYS);
				setState(2116);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ_) {
					{
					setState(2115);
					match(EQ_);
					}
				}

				setState(2118);
				_la = _input.LA(1);
				if ( !(_la==DEFAULT || _la==NUMBER_) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case PASSWORD:
				enterOuterAlt(_localctx, 17);
				{
				setState(2119);
				match(PASSWORD);
				setState(2121);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ_) {
					{
					setState(2120);
					match(EQ_);
					}
				}

				setState(2123);
				match(STRING_);
				}
				break;
			case ROW_FORMAT:
				enterOuterAlt(_localctx, 18);
				{
				setState(2124);
				match(ROW_FORMAT);
				setState(2126);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ_) {
					{
					setState(2125);
					match(EQ_);
					}
				}

				setState(2128);
				_la = _input.LA(1);
				if ( !(_la==DEFAULT || ((((_la - 116)) & ~0x3f) == 0 && ((1L << (_la - 116)) & ((1L << (COMPACT - 116)) | (1L << (COMPRESSED - 116)) | (1L << (DYNAMIC - 116)) | (1L << (FIXED - 116)))) != 0) || _la==REDUNDANT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case STATS_AUTO_RECALC:
				enterOuterAlt(_localctx, 19);
				{
				setState(2129);
				match(STATS_AUTO_RECALC);
				setState(2131);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ_) {
					{
					setState(2130);
					match(EQ_);
					}
				}

				setState(2133);
				_la = _input.LA(1);
				if ( !(_la==DEFAULT || _la==NUMBER_) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case STATS_PERSISTENT:
				enterOuterAlt(_localctx, 20);
				{
				setState(2134);
				match(STATS_PERSISTENT);
				setState(2136);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ_) {
					{
					setState(2135);
					match(EQ_);
					}
				}

				setState(2138);
				_la = _input.LA(1);
				if ( !(_la==DEFAULT || _la==NUMBER_) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case STATS_SAMPLE_PAGES:
				enterOuterAlt(_localctx, 21);
				{
				setState(2139);
				match(STATS_SAMPLE_PAGES);
				setState(2141);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ_) {
					{
					setState(2140);
					match(EQ_);
					}
				}

				setState(2143);
				match(NUMBER_);
				}
				break;
			case TABLESPACE:
				enterOuterAlt(_localctx, 22);
				{
				setState(2144);
				match(TABLESPACE);
				setState(2145);
				ignoredIdentifier_();
				setState(2148);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STORAGE) {
					{
					setState(2146);
					match(STORAGE);
					setState(2147);
					_la = _input.LA(1);
					if ( !(_la==DEFAULT || _la==DISK || _la==MEMORY) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				}
				break;
			case UNION:
				enterOuterAlt(_localctx, 23);
				{
				setState(2150);
				match(UNION);
				setState(2152);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ_) {
					{
					setState(2151);
					match(EQ_);
					}
				}

				setState(2154);
				match(LP_);
				setState(2155);
				tableName();
				setState(2160);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(2156);
					match(COMMA_);
					setState(2157);
					tableName();
					}
					}
					setState(2162);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2163);
				match(RP_);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AddColumnSpecificationContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(MySQLStatementParser.ADD, 0); }
		public List<ColumnDefinitionContext> columnDefinition() {
			return getRuleContexts(ColumnDefinitionContext.class);
		}
		public ColumnDefinitionContext columnDefinition(int i) {
			return getRuleContext(ColumnDefinitionContext.class,i);
		}
		public TerminalNode LP_() { return getToken(MySQLStatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(MySQLStatementParser.RP_, 0); }
		public TerminalNode COLUMN() { return getToken(MySQLStatementParser.COLUMN, 0); }
		public FirstOrAfterColumnContext firstOrAfterColumn() {
			return getRuleContext(FirstOrAfterColumnContext.class,0);
		}
		public List<TerminalNode> COMMA_() { return getTokens(MySQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(MySQLStatementParser.COMMA_, i);
		}
		public AddColumnSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addColumnSpecification; }
	}

	public final AddColumnSpecificationContext addColumnSpecification() throws RecognitionException {
		AddColumnSpecificationContext _localctx = new AddColumnSpecificationContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_addColumnSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2167);
			match(ADD);
			setState(2169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLUMN) {
				{
				setState(2168);
				match(COLUMN);
				}
			}

			setState(2186);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ANY:
			case DATE:
			case ESCAPE:
			case OFFSET:
			case ROLLUP:
			case SOUNDS:
			case TIME:
			case TIMESTAMP:
			case UNKNOWN:
			case ALWAYS:
			case COMMIT:
			case COMMITTED:
			case CURRENT:
			case DISABLE:
			case ENABLE:
			case LEVEL:
			case NO:
			case PASSWORD:
			case PRIVILEGES:
			case ROLLBACK:
			case START:
			case TRANSACTION:
			case TRUNCATE:
			case ACCOUNT:
			case ACTION:
			case AFTER:
			case ALGORITHM:
			case AUTO_INCREMENT:
			case AVG_ROW_LENGTH:
			case BEGIN:
			case BTREE:
			case CHAIN:
			case CHARSET:
			case CHECKSUM:
			case CIPHER:
			case CLIENT:
			case COALESCE:
			case COLUMNS:
			case COLUMN_FORMAT:
			case COMMENT:
			case COMPACT:
			case COMPRESSED:
			case COMPRESSION:
			case CONNECTION:
			case CONSISTENT:
			case DATA:
			case DELAY_KEY_WRITE:
			case DISCARD:
			case DISK:
			case DUPLICATE:
			case ENCRYPTION:
			case END:
			case ENGINE:
			case EVENT:
			case EXCHANGE:
			case EXECUTE:
			case FILE:
			case FIRST:
			case FIXED:
			case FOLLOWING:
			case GLOBAL:
			case HASH:
			case IMPORT_:
			case INSERT_METHOD:
			case KEY_BLOCK_SIZE:
			case LAST:
			case LESS:
			case MAX_ROWS:
			case MEMORY:
			case MIN_ROWS:
			case MODIFY:
			case NONE:
			case PACK_KEYS:
			case PARSER:
			case PARTIAL:
			case PARTITIONING:
			case PERSIST:
			case PERSIST_ONLY:
			case PRECEDING:
			case PROCESS:
			case PROXY:
			case QUICK:
			case REBUILD:
			case REDUNDANT:
			case RELOAD:
			case REMOVE:
			case REORGANIZE:
			case REPAIR:
			case REVERSE:
			case ROW_FORMAT:
			case SAVEPOINT:
			case SESSION:
			case SHUTDOWN:
			case SIMPLE:
			case SLAVE:
			case SQL_BIG_RESULT:
			case SQL_BUFFER_RESULT:
			case SQL_CACHE:
			case SQL_NO_CACHE:
			case STATS_AUTO_RECALC:
			case STATS_PERSISTENT:
			case STATS_SAMPLE_PAGES:
			case STORAGE:
			case SUBPARTITION:
			case SUPER:
			case TABLES:
			case TABLESPACE:
			case TEMPORARY:
			case THAN:
			case UNBOUNDED:
			case UPGRADE:
			case VALIDATION:
			case VALUE:
			case VIEW:
			case WEIGHT_STRING:
			case WITHOUT:
			case VISIBLE:
			case INVISIBLE:
			case ENFORCED:
			case MICROSECOND:
			case SECOND:
			case MINUTE:
			case HOUR:
			case DAY:
			case WEEK:
			case MONTH:
			case QUARTER:
			case YEAR:
			case AGAINST:
			case LANGUAGE:
			case MODE:
			case QUERY:
			case EXPANSION:
			case BOOLEAN:
			case MAX:
			case MIN:
			case SUM:
			case COUNT:
			case AVG:
			case BIT_AND:
			case BIT_OR:
			case BIT_XOR:
			case GROUP_CONCAT:
			case JSON_ARRAYAGG:
			case JSON_OBJECTAGG:
			case STD:
			case STDDEV:
			case STDDEV_POP:
			case STDDEV_SAMP:
			case VAR_POP:
			case VAR_SAMP:
			case VARIANCE:
			case IDENTIFIER_:
				{
				setState(2171);
				columnDefinition();
				setState(2173);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AFTER || _la==FIRST) {
					{
					setState(2172);
					firstOrAfterColumn();
					}
				}

				}
				break;
			case LP_:
				{
				setState(2175);
				match(LP_);
				setState(2176);
				columnDefinition();
				setState(2181);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(2177);
					match(COMMA_);
					setState(2178);
					columnDefinition();
					}
					}
					setState(2183);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2184);
				match(RP_);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FirstOrAfterColumnContext extends ParserRuleContext {
		public TerminalNode FIRST() { return getToken(MySQLStatementParser.FIRST, 0); }
		public TerminalNode AFTER() { return getToken(MySQLStatementParser.AFTER, 0); }
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public FirstOrAfterColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_firstOrAfterColumn; }
	}

	public final FirstOrAfterColumnContext firstOrAfterColumn() throws RecognitionException {
		FirstOrAfterColumnContext _localctx = new FirstOrAfterColumnContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_firstOrAfterColumn);
		try {
			setState(2191);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FIRST:
				enterOuterAlt(_localctx, 1);
				{
				setState(2188);
				match(FIRST);
				}
				break;
			case AFTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(2189);
				match(AFTER);
				setState(2190);
				columnName();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AddIndexSpecificationContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(MySQLStatementParser.ADD, 0); }
		public IndexDefinition_Context indexDefinition_() {
			return getRuleContext(IndexDefinition_Context.class,0);
		}
		public AddIndexSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addIndexSpecification; }
	}

	public final AddIndexSpecificationContext addIndexSpecification() throws RecognitionException {
		AddIndexSpecificationContext _localctx = new AddIndexSpecificationContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_addIndexSpecification);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2193);
			match(ADD);
			setState(2194);
			indexDefinition_();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AddConstraintSpecificationContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(MySQLStatementParser.ADD, 0); }
		public ConstraintDefinition_Context constraintDefinition_() {
			return getRuleContext(ConstraintDefinition_Context.class,0);
		}
		public AddConstraintSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addConstraintSpecification; }
	}

	public final AddConstraintSpecificationContext addConstraintSpecification() throws RecognitionException {
		AddConstraintSpecificationContext _localctx = new AddConstraintSpecificationContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_addConstraintSpecification);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2196);
			match(ADD);
			setState(2197);
			constraintDefinition_();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ChangeColumnSpecificationContext extends ParserRuleContext {
		public TerminalNode CHANGE() { return getToken(MySQLStatementParser.CHANGE, 0); }
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public ColumnDefinitionContext columnDefinition() {
			return getRuleContext(ColumnDefinitionContext.class,0);
		}
		public TerminalNode COLUMN() { return getToken(MySQLStatementParser.COLUMN, 0); }
		public FirstOrAfterColumnContext firstOrAfterColumn() {
			return getRuleContext(FirstOrAfterColumnContext.class,0);
		}
		public ChangeColumnSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_changeColumnSpecification; }
	}

	public final ChangeColumnSpecificationContext changeColumnSpecification() throws RecognitionException {
		ChangeColumnSpecificationContext _localctx = new ChangeColumnSpecificationContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_changeColumnSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2199);
			match(CHANGE);
			setState(2201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLUMN) {
				{
				setState(2200);
				match(COLUMN);
				}
			}

			setState(2203);
			columnName();
			setState(2204);
			columnDefinition();
			setState(2206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AFTER || _la==FIRST) {
				{
				setState(2205);
				firstOrAfterColumn();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DropColumnSpecificationContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(MySQLStatementParser.DROP, 0); }
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public TerminalNode COLUMN() { return getToken(MySQLStatementParser.COLUMN, 0); }
		public DropColumnSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropColumnSpecification; }
	}

	public final DropColumnSpecificationContext dropColumnSpecification() throws RecognitionException {
		DropColumnSpecificationContext _localctx = new DropColumnSpecificationContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_dropColumnSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2208);
			match(DROP);
			setState(2210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLUMN) {
				{
				setState(2209);
				match(COLUMN);
				}
			}

			setState(2212);
			columnName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DropIndexSpecificationContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(MySQLStatementParser.DROP, 0); }
		public IndexNameContext indexName() {
			return getRuleContext(IndexNameContext.class,0);
		}
		public TerminalNode INDEX() { return getToken(MySQLStatementParser.INDEX, 0); }
		public TerminalNode KEY() { return getToken(MySQLStatementParser.KEY, 0); }
		public DropIndexSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropIndexSpecification; }
	}

	public final DropIndexSpecificationContext dropIndexSpecification() throws RecognitionException {
		DropIndexSpecificationContext _localctx = new DropIndexSpecificationContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_dropIndexSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2214);
			match(DROP);
			setState(2215);
			_la = _input.LA(1);
			if ( !(_la==KEY || _la==INDEX) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2216);
			indexName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DropPrimaryKeySpecificationContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(MySQLStatementParser.DROP, 0); }
		public PrimaryKeyContext primaryKey() {
			return getRuleContext(PrimaryKeyContext.class,0);
		}
		public DropPrimaryKeySpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropPrimaryKeySpecification; }
	}

	public final DropPrimaryKeySpecificationContext dropPrimaryKeySpecification() throws RecognitionException {
		DropPrimaryKeySpecificationContext _localctx = new DropPrimaryKeySpecificationContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_dropPrimaryKeySpecification);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2218);
			match(DROP);
			setState(2219);
			primaryKey();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModifyColumnSpecificationContext extends ParserRuleContext {
		public TerminalNode MODIFY() { return getToken(MySQLStatementParser.MODIFY, 0); }
		public ColumnDefinitionContext columnDefinition() {
			return getRuleContext(ColumnDefinitionContext.class,0);
		}
		public TerminalNode COLUMN() { return getToken(MySQLStatementParser.COLUMN, 0); }
		public FirstOrAfterColumnContext firstOrAfterColumn() {
			return getRuleContext(FirstOrAfterColumnContext.class,0);
		}
		public ModifyColumnSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifyColumnSpecification; }
	}

	public final ModifyColumnSpecificationContext modifyColumnSpecification() throws RecognitionException {
		ModifyColumnSpecificationContext _localctx = new ModifyColumnSpecificationContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_modifyColumnSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2221);
			match(MODIFY);
			setState(2223);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLUMN) {
				{
				setState(2222);
				match(COLUMN);
				}
			}

			setState(2225);
			columnDefinition();
			setState(2227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AFTER || _la==FIRST) {
				{
				setState(2226);
				firstOrAfterColumn();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RenameColumnSpecificationContext extends ParserRuleContext {
		public TerminalNode RENAME() { return getToken(MySQLStatementParser.RENAME, 0); }
		public TerminalNode COLUMN() { return getToken(MySQLStatementParser.COLUMN, 0); }
		public List<ColumnNameContext> columnName() {
			return getRuleContexts(ColumnNameContext.class);
		}
		public ColumnNameContext columnName(int i) {
			return getRuleContext(ColumnNameContext.class,i);
		}
		public TerminalNode TO() { return getToken(MySQLStatementParser.TO, 0); }
		public RenameColumnSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_renameColumnSpecification; }
	}

	public final RenameColumnSpecificationContext renameColumnSpecification() throws RecognitionException {
		RenameColumnSpecificationContext _localctx = new RenameColumnSpecificationContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_renameColumnSpecification);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2229);
			match(RENAME);
			setState(2230);
			match(COLUMN);
			setState(2231);
			columnName();
			setState(2232);
			match(TO);
			setState(2233);
			columnName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RenameIndexSpecificationContext extends ParserRuleContext {
		public TerminalNode RENAME() { return getToken(MySQLStatementParser.RENAME, 0); }
		public List<IndexNameContext> indexName() {
			return getRuleContexts(IndexNameContext.class);
		}
		public IndexNameContext indexName(int i) {
			return getRuleContext(IndexNameContext.class,i);
		}
		public TerminalNode TO() { return getToken(MySQLStatementParser.TO, 0); }
		public TerminalNode INDEX() { return getToken(MySQLStatementParser.INDEX, 0); }
		public TerminalNode KEY() { return getToken(MySQLStatementParser.KEY, 0); }
		public RenameIndexSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_renameIndexSpecification; }
	}

	public final RenameIndexSpecificationContext renameIndexSpecification() throws RecognitionException {
		RenameIndexSpecificationContext _localctx = new RenameIndexSpecificationContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_renameIndexSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2235);
			match(RENAME);
			setState(2236);
			_la = _input.LA(1);
			if ( !(_la==KEY || _la==INDEX) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2237);
			indexName();
			setState(2238);
			match(TO);
			setState(2239);
			indexName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RenameTableSpecification_Context extends ParserRuleContext {
		public TerminalNode RENAME() { return getToken(MySQLStatementParser.RENAME, 0); }
		public NewTableNameContext newTableName() {
			return getRuleContext(NewTableNameContext.class,0);
		}
		public TerminalNode TO() { return getToken(MySQLStatementParser.TO, 0); }
		public TerminalNode AS() { return getToken(MySQLStatementParser.AS, 0); }
		public RenameTableSpecification_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_renameTableSpecification_; }
	}

	public final RenameTableSpecification_Context renameTableSpecification_() throws RecognitionException {
		RenameTableSpecification_Context _localctx = new RenameTableSpecification_Context(_ctx, getState());
		enterRule(_localctx, 304, RULE_renameTableSpecification_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2241);
			match(RENAME);
			setState(2243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS || _la==TO) {
				{
				setState(2242);
				_la = _input.LA(1);
				if ( !(_la==AS || _la==TO) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(2245);
			newTableName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NewTableNameContext extends ParserRuleContext {
		public Identifier_Context identifier_() {
			return getRuleContext(Identifier_Context.class,0);
		}
		public NewTableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newTableName; }
	}

	public final NewTableNameContext newTableName() throws RecognitionException {
		NewTableNameContext _localctx = new NewTableNameContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_newTableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2247);
			identifier_();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PartitionDefinitions_Context extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(MySQLStatementParser.LP_, 0); }
		public List<PartitionDefinition_Context> partitionDefinition_() {
			return getRuleContexts(PartitionDefinition_Context.class);
		}
		public PartitionDefinition_Context partitionDefinition_(int i) {
			return getRuleContext(PartitionDefinition_Context.class,i);
		}
		public TerminalNode RP_() { return getToken(MySQLStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(MySQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(MySQLStatementParser.COMMA_, i);
		}
		public PartitionDefinitions_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionDefinitions_; }
	}

	public final PartitionDefinitions_Context partitionDefinitions_() throws RecognitionException {
		PartitionDefinitions_Context _localctx = new PartitionDefinitions_Context(_ctx, getState());
		enterRule(_localctx, 308, RULE_partitionDefinitions_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2249);
			match(LP_);
			setState(2250);
			partitionDefinition_();
			setState(2255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(2251);
				match(COMMA_);
				setState(2252);
				partitionDefinition_();
				}
				}
				setState(2257);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2258);
			match(RP_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PartitionDefinition_Context extends ParserRuleContext {
		public TerminalNode PARTITION() { return getToken(MySQLStatementParser.PARTITION, 0); }
		public Identifier_Context identifier_() {
			return getRuleContext(Identifier_Context.class,0);
		}
		public TerminalNode VALUES() { return getToken(MySQLStatementParser.VALUES, 0); }
		public List<PartitionDefinitionOption_Context> partitionDefinitionOption_() {
			return getRuleContexts(PartitionDefinitionOption_Context.class);
		}
		public PartitionDefinitionOption_Context partitionDefinitionOption_(int i) {
			return getRuleContext(PartitionDefinitionOption_Context.class,i);
		}
		public List<TerminalNode> LP_() { return getTokens(MySQLStatementParser.LP_); }
		public TerminalNode LP_(int i) {
			return getToken(MySQLStatementParser.LP_, i);
		}
		public List<SubpartitionDefinition_Context> subpartitionDefinition_() {
			return getRuleContexts(SubpartitionDefinition_Context.class);
		}
		public SubpartitionDefinition_Context subpartitionDefinition_(int i) {
			return getRuleContext(SubpartitionDefinition_Context.class,i);
		}
		public List<TerminalNode> RP_() { return getTokens(MySQLStatementParser.RP_); }
		public TerminalNode RP_(int i) {
			return getToken(MySQLStatementParser.RP_, i);
		}
		public TerminalNode LESS() { return getToken(MySQLStatementParser.LESS, 0); }
		public TerminalNode THAN() { return getToken(MySQLStatementParser.THAN, 0); }
		public PartitionLessThanValue_Context partitionLessThanValue_() {
			return getRuleContext(PartitionLessThanValue_Context.class,0);
		}
		public TerminalNode IN() { return getToken(MySQLStatementParser.IN, 0); }
		public PartitionValueList_Context partitionValueList_() {
			return getRuleContext(PartitionValueList_Context.class,0);
		}
		public List<TerminalNode> COMMA_() { return getTokens(MySQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(MySQLStatementParser.COMMA_, i);
		}
		public PartitionDefinition_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionDefinition_; }
	}

	public final PartitionDefinition_Context partitionDefinition_() throws RecognitionException {
		PartitionDefinition_Context _localctx = new PartitionDefinition_Context(_ctx, getState());
		enterRule(_localctx, 310, RULE_partitionDefinition_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2260);
			match(PARTITION);
			setState(2261);
			identifier_();
			setState(2273);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VALUES) {
				{
				setState(2262);
				match(VALUES);
				setState(2271);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LESS:
					{
					setState(2263);
					match(LESS);
					setState(2264);
					match(THAN);
					setState(2265);
					partitionLessThanValue_();
					}
					break;
				case IN:
					{
					setState(2266);
					match(IN);
					setState(2267);
					match(LP_);
					setState(2268);
					partitionValueList_();
					setState(2269);
					match(RP_);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			setState(2278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (INDEX - 68)) | (1L << (COMMENT - 68)) | (1L << (DATA - 68)))) != 0) || ((((_la - 141)) & ~0x3f) == 0 && ((1L << (_la - 141)) & ((1L << (ENGINE - 141)) | (1L << (MAX_ROWS - 141)) | (1L << (MIN_ROWS - 141)))) != 0) || _la==STORAGE || _la==TABLESPACE) {
				{
				{
				setState(2275);
				partitionDefinitionOption_();
				}
				}
				setState(2280);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP_) {
				{
				setState(2281);
				match(LP_);
				setState(2282);
				subpartitionDefinition_();
				setState(2287);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(2283);
					match(COMMA_);
					setState(2284);
					subpartitionDefinition_();
					}
					}
					setState(2289);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2290);
				match(RP_);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PartitionLessThanValue_Context extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(MySQLStatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(MySQLStatementParser.RP_, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PartitionValueList_Context partitionValueList_() {
			return getRuleContext(PartitionValueList_Context.class,0);
		}
		public TerminalNode MAXVALUE() { return getToken(MySQLStatementParser.MAXVALUE, 0); }
		public PartitionLessThanValue_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionLessThanValue_; }
	}

	public final PartitionLessThanValue_Context partitionLessThanValue_() throws RecognitionException {
		PartitionLessThanValue_Context _localctx = new PartitionLessThanValue_Context(_ctx, getState());
		enterRule(_localctx, 312, RULE_partitionLessThanValue_);
		try {
			setState(2302);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LP_:
				enterOuterAlt(_localctx, 1);
				{
				setState(2294);
				match(LP_);
				setState(2297);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,291,_ctx) ) {
				case 1:
					{
					setState(2295);
					expr(0);
					}
					break;
				case 2:
					{
					setState(2296);
					partitionValueList_();
					}
					break;
				}
				setState(2299);
				match(RP_);
				}
				break;
			case MAXVALUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2301);
				match(MAXVALUE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PartitionValueList_Context extends ParserRuleContext {
		public List<LiteralsContext> literals() {
			return getRuleContexts(LiteralsContext.class);
		}
		public LiteralsContext literals(int i) {
			return getRuleContext(LiteralsContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(MySQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(MySQLStatementParser.COMMA_, i);
		}
		public PartitionValueList_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionValueList_; }
	}

	public final PartitionValueList_Context partitionValueList_() throws RecognitionException {
		PartitionValueList_Context _localctx = new PartitionValueList_Context(_ctx, getState());
		enterRule(_localctx, 314, RULE_partitionValueList_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2304);
			literals();
			setState(2309);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(2305);
				match(COMMA_);
				setState(2306);
				literals();
				}
				}
				setState(2311);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PartitionDefinitionOption_Context extends ParserRuleContext {
		public TerminalNode ENGINE() { return getToken(MySQLStatementParser.ENGINE, 0); }
		public Identifier_Context identifier_() {
			return getRuleContext(Identifier_Context.class,0);
		}
		public TerminalNode STORAGE() { return getToken(MySQLStatementParser.STORAGE, 0); }
		public TerminalNode EQ_() { return getToken(MySQLStatementParser.EQ_, 0); }
		public TerminalNode COMMENT() { return getToken(MySQLStatementParser.COMMENT, 0); }
		public TerminalNode STRING_() { return getToken(MySQLStatementParser.STRING_, 0); }
		public TerminalNode DATA() { return getToken(MySQLStatementParser.DATA, 0); }
		public TerminalNode DIRECTORY() { return getToken(MySQLStatementParser.DIRECTORY, 0); }
		public TerminalNode INDEX() { return getToken(MySQLStatementParser.INDEX, 0); }
		public TerminalNode MAX_ROWS() { return getToken(MySQLStatementParser.MAX_ROWS, 0); }
		public TerminalNode NUMBER_() { return getToken(MySQLStatementParser.NUMBER_, 0); }
		public TerminalNode MIN_ROWS() { return getToken(MySQLStatementParser.MIN_ROWS, 0); }
		public TerminalNode TABLESPACE() { return getToken(MySQLStatementParser.TABLESPACE, 0); }
		public PartitionDefinitionOption_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionDefinitionOption_; }
	}

	public final PartitionDefinitionOption_Context partitionDefinitionOption_() throws RecognitionException {
		PartitionDefinitionOption_Context _localctx = new PartitionDefinitionOption_Context(_ctx, getState());
		enterRule(_localctx, 316, RULE_partitionDefinitionOption_);
		int _la;
		try {
			setState(2352);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENGINE:
			case STORAGE:
				enterOuterAlt(_localctx, 1);
				{
				setState(2313);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STORAGE) {
					{
					setState(2312);
					match(STORAGE);
					}
				}

				setState(2315);
				match(ENGINE);
				setState(2317);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ_) {
					{
					setState(2316);
					match(EQ_);
					}
				}

				setState(2319);
				identifier_();
				}
				break;
			case COMMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(2320);
				match(COMMENT);
				setState(2322);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ_) {
					{
					setState(2321);
					match(EQ_);
					}
				}

				setState(2324);
				match(STRING_);
				}
				break;
			case DATA:
				enterOuterAlt(_localctx, 3);
				{
				setState(2325);
				match(DATA);
				setState(2326);
				match(DIRECTORY);
				setState(2328);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ_) {
					{
					setState(2327);
					match(EQ_);
					}
				}

				setState(2330);
				match(STRING_);
				}
				break;
			case INDEX:
				enterOuterAlt(_localctx, 4);
				{
				setState(2331);
				match(INDEX);
				setState(2332);
				match(DIRECTORY);
				setState(2334);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ_) {
					{
					setState(2333);
					match(EQ_);
					}
				}

				setState(2336);
				match(STRING_);
				}
				break;
			case MAX_ROWS:
				enterOuterAlt(_localctx, 5);
				{
				setState(2337);
				match(MAX_ROWS);
				setState(2339);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ_) {
					{
					setState(2338);
					match(EQ_);
					}
				}

				setState(2341);
				match(NUMBER_);
				}
				break;
			case MIN_ROWS:
				enterOuterAlt(_localctx, 6);
				{
				setState(2342);
				match(MIN_ROWS);
				setState(2344);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ_) {
					{
					setState(2343);
					match(EQ_);
					}
				}

				setState(2346);
				match(NUMBER_);
				}
				break;
			case TABLESPACE:
				enterOuterAlt(_localctx, 7);
				{
				setState(2347);
				match(TABLESPACE);
				setState(2349);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ_) {
					{
					setState(2348);
					match(EQ_);
					}
				}

				setState(2351);
				identifier_();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubpartitionDefinition_Context extends ParserRuleContext {
		public TerminalNode SUBPARTITION() { return getToken(MySQLStatementParser.SUBPARTITION, 0); }
		public Identifier_Context identifier_() {
			return getRuleContext(Identifier_Context.class,0);
		}
		public List<PartitionDefinitionOption_Context> partitionDefinitionOption_() {
			return getRuleContexts(PartitionDefinitionOption_Context.class);
		}
		public PartitionDefinitionOption_Context partitionDefinitionOption_(int i) {
			return getRuleContext(PartitionDefinitionOption_Context.class,i);
		}
		public SubpartitionDefinition_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subpartitionDefinition_; }
	}

	public final SubpartitionDefinition_Context subpartitionDefinition_() throws RecognitionException {
		SubpartitionDefinition_Context _localctx = new SubpartitionDefinition_Context(_ctx, getState());
		enterRule(_localctx, 318, RULE_subpartitionDefinition_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2354);
			match(SUBPARTITION);
			setState(2355);
			identifier_();
			setState(2359);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (INDEX - 68)) | (1L << (COMMENT - 68)) | (1L << (DATA - 68)))) != 0) || ((((_la - 141)) & ~0x3f) == 0 && ((1L << (_la - 141)) & ((1L << (ENGINE - 141)) | (1L << (MAX_ROWS - 141)) | (1L << (MIN_ROWS - 141)))) != 0) || _la==STORAGE || _la==TABLESPACE) {
				{
				{
				setState(2356);
				partitionDefinitionOption_();
				}
				}
				setState(2361);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DropTableContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(MySQLStatementParser.DROP, 0); }
		public TerminalNode TABLE() { return getToken(MySQLStatementParser.TABLE, 0); }
		public List<TableNameContext> tableName() {
			return getRuleContexts(TableNameContext.class);
		}
		public TableNameContext tableName(int i) {
			return getRuleContext(TableNameContext.class,i);
		}
		public TerminalNode TEMPORARY() { return getToken(MySQLStatementParser.TEMPORARY, 0); }
		public TerminalNode IF() { return getToken(MySQLStatementParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(MySQLStatementParser.EXISTS, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(MySQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(MySQLStatementParser.COMMA_, i);
		}
		public DropTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropTable; }
	}

	public final DropTableContext dropTable() throws RecognitionException {
		DropTableContext _localctx = new DropTableContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_dropTable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2362);
			match(DROP);
			setState(2364);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TEMPORARY) {
				{
				setState(2363);
				match(TEMPORARY);
				}
			}

			setState(2366);
			match(TABLE);
			setState(2369);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(2367);
				match(IF);
				setState(2368);
				match(EXISTS);
				}
			}

			setState(2371);
			tableName();
			setState(2376);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(2372);
				match(COMMA_);
				setState(2373);
				tableName();
				}
				}
				setState(2378);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TruncateTableContext extends ParserRuleContext {
		public TerminalNode TRUNCATE() { return getToken(MySQLStatementParser.TRUNCATE, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(MySQLStatementParser.TABLE, 0); }
		public TruncateTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_truncateTable; }
	}

	public final TruncateTableContext truncateTable() throws RecognitionException {
		TruncateTableContext _localctx = new TruncateTableContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_truncateTable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2379);
			match(TRUNCATE);
			setState(2381);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TABLE) {
				{
				setState(2380);
				match(TABLE);
				}
			}

			setState(2383);
			tableName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateIndexContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(MySQLStatementParser.CREATE, 0); }
		public TerminalNode INDEX() { return getToken(MySQLStatementParser.INDEX, 0); }
		public IndexNameContext indexName() {
			return getRuleContext(IndexNameContext.class,0);
		}
		public TerminalNode ON() { return getToken(MySQLStatementParser.ON, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public IndexType_Context indexType_() {
			return getRuleContext(IndexType_Context.class,0);
		}
		public TerminalNode UNIQUE() { return getToken(MySQLStatementParser.UNIQUE, 0); }
		public TerminalNode FULLTEXT() { return getToken(MySQLStatementParser.FULLTEXT, 0); }
		public TerminalNode SPATIAL() { return getToken(MySQLStatementParser.SPATIAL, 0); }
		public CreateIndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createIndex; }
	}

	public final CreateIndexContext createIndex() throws RecognitionException {
		CreateIndexContext _localctx = new CreateIndexContext(_ctx, getState());
		enterRule(_localctx, 324, RULE_createIndex);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2385);
			match(CREATE);
			setState(2387);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==UNIQUE || _la==FULLTEXT || _la==SPATIAL) {
				{
				setState(2386);
				_la = _input.LA(1);
				if ( !(_la==UNIQUE || _la==FULLTEXT || _la==SPATIAL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(2389);
			match(INDEX);
			setState(2390);
			indexName();
			setState(2392);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==USING) {
				{
				setState(2391);
				indexType_();
				}
			}

			setState(2394);
			match(ON);
			setState(2395);
			tableName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DropIndexContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(MySQLStatementParser.DROP, 0); }
		public TerminalNode INDEX() { return getToken(MySQLStatementParser.INDEX, 0); }
		public IndexNameContext indexName() {
			return getRuleContext(IndexNameContext.class,0);
		}
		public TerminalNode ON() { return getToken(MySQLStatementParser.ON, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode ONLINE() { return getToken(MySQLStatementParser.ONLINE, 0); }
		public TerminalNode OFFLINE() { return getToken(MySQLStatementParser.OFFLINE, 0); }
		public DropIndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropIndex; }
	}

	public final DropIndexContext dropIndex() throws RecognitionException {
		DropIndexContext _localctx = new DropIndexContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_dropIndex);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2397);
			match(DROP);
			setState(2398);
			match(INDEX);
			setState(2400);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OFFLINE || _la==ONLINE) {
				{
				setState(2399);
				_la = _input.LA(1);
				if ( !(_la==OFFLINE || _la==ONLINE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(2402);
			indexName();
			setState(2403);
			match(ON);
			setState(2404);
			tableName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetTransactionContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(MySQLStatementParser.SET, 0); }
		public TerminalNode TRANSACTION() { return getToken(MySQLStatementParser.TRANSACTION, 0); }
		public TerminalNode GLOBAL() { return getToken(MySQLStatementParser.GLOBAL, 0); }
		public TerminalNode SESSION() { return getToken(MySQLStatementParser.SESSION, 0); }
		public SetTransactionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setTransaction; }
	}

	public final SetTransactionContext setTransaction() throws RecognitionException {
		SetTransactionContext _localctx = new SetTransactionContext(_ctx, getState());
		enterRule(_localctx, 328, RULE_setTransaction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2406);
			match(SET);
			setState(2408);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GLOBAL || _la==SESSION) {
				{
				setState(2407);
				_la = _input.LA(1);
				if ( !(_la==GLOBAL || _la==SESSION) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(2410);
			match(TRANSACTION);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetAutoCommitContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(MySQLStatementParser.SET, 0); }
		public TerminalNode AUTOCOMMIT() { return getToken(MySQLStatementParser.AUTOCOMMIT, 0); }
		public TerminalNode EQ_() { return getToken(MySQLStatementParser.EQ_, 0); }
		public AutoCommitValueContext autoCommitValue() {
			return getRuleContext(AutoCommitValueContext.class,0);
		}
		public SetAutoCommitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setAutoCommit; }
	}

	public final SetAutoCommitContext setAutoCommit() throws RecognitionException {
		SetAutoCommitContext _localctx = new SetAutoCommitContext(_ctx, getState());
		enterRule(_localctx, 330, RULE_setAutoCommit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2412);
			match(SET);
			setState(2413);
			match(AUTOCOMMIT);
			setState(2414);
			match(EQ_);
			setState(2415);
			autoCommitValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AutoCommitValueContext extends ParserRuleContext {
		public TerminalNode NUMBER_() { return getToken(MySQLStatementParser.NUMBER_, 0); }
		public AutoCommitValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_autoCommitValue; }
	}

	public final AutoCommitValueContext autoCommitValue() throws RecognitionException {
		AutoCommitValueContext _localctx = new AutoCommitValueContext(_ctx, getState());
		enterRule(_localctx, 332, RULE_autoCommitValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2417);
			match(NUMBER_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BeginTransactionContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(MySQLStatementParser.BEGIN, 0); }
		public TerminalNode START() { return getToken(MySQLStatementParser.START, 0); }
		public TerminalNode TRANSACTION() { return getToken(MySQLStatementParser.TRANSACTION, 0); }
		public BeginTransactionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_beginTransaction; }
	}

	public final BeginTransactionContext beginTransaction() throws RecognitionException {
		BeginTransactionContext _localctx = new BeginTransactionContext(_ctx, getState());
		enterRule(_localctx, 334, RULE_beginTransaction);
		try {
			setState(2422);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEGIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(2419);
				match(BEGIN);
				}
				break;
			case START:
				enterOuterAlt(_localctx, 2);
				{
				setState(2420);
				match(START);
				setState(2421);
				match(TRANSACTION);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommitContext extends ParserRuleContext {
		public TerminalNode COMMIT() { return getToken(MySQLStatementParser.COMMIT, 0); }
		public CommitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commit; }
	}

	public final CommitContext commit() throws RecognitionException {
		CommitContext _localctx = new CommitContext(_ctx, getState());
		enterRule(_localctx, 336, RULE_commit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2424);
			match(COMMIT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RollbackContext extends ParserRuleContext {
		public TerminalNode ROLLBACK() { return getToken(MySQLStatementParser.ROLLBACK, 0); }
		public RollbackContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rollback; }
	}

	public final RollbackContext rollback() throws RecognitionException {
		RollbackContext _localctx = new RollbackContext(_ctx, getState());
		enterRule(_localctx, 338, RULE_rollback);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2426);
			match(ROLLBACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SavepointContext extends ParserRuleContext {
		public TerminalNode SAVEPOINT() { return getToken(MySQLStatementParser.SAVEPOINT, 0); }
		public SavepointContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_savepoint; }
	}

	public final SavepointContext savepoint() throws RecognitionException {
		SavepointContext _localctx = new SavepointContext(_ctx, getState());
		enterRule(_localctx, 340, RULE_savepoint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2428);
			match(SAVEPOINT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GrantContext extends ParserRuleContext {
		public TerminalNode GRANT() { return getToken(MySQLStatementParser.GRANT, 0); }
		public ProxyClause_Context proxyClause_() {
			return getRuleContext(ProxyClause_Context.class,0);
		}
		public PrivilegeClause_Context privilegeClause_() {
			return getRuleContext(PrivilegeClause_Context.class,0);
		}
		public RoleClause_Context roleClause_() {
			return getRuleContext(RoleClause_Context.class,0);
		}
		public GrantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grant; }
	}

	public final GrantContext grant() throws RecognitionException {
		GrantContext _localctx = new GrantContext(_ctx, getState());
		enterRule(_localctx, 342, RULE_grant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2430);
			match(GRANT);
			setState(2434);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,313,_ctx) ) {
			case 1:
				{
				setState(2431);
				proxyClause_();
				}
				break;
			case 2:
				{
				setState(2432);
				privilegeClause_();
				}
				break;
			case 3:
				{
				setState(2433);
				roleClause_();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RevokeContext extends ParserRuleContext {
		public TerminalNode REVOKE() { return getToken(MySQLStatementParser.REVOKE, 0); }
		public ProxyClause_Context proxyClause_() {
			return getRuleContext(ProxyClause_Context.class,0);
		}
		public PrivilegeClause_Context privilegeClause_() {
			return getRuleContext(PrivilegeClause_Context.class,0);
		}
		public AllClause_Context allClause_() {
			return getRuleContext(AllClause_Context.class,0);
		}
		public RoleClause_Context roleClause_() {
			return getRuleContext(RoleClause_Context.class,0);
		}
		public RevokeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_revoke; }
	}

	public final RevokeContext revoke() throws RecognitionException {
		RevokeContext _localctx = new RevokeContext(_ctx, getState());
		enterRule(_localctx, 344, RULE_revoke);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2436);
			match(REVOKE);
			setState(2441);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,314,_ctx) ) {
			case 1:
				{
				setState(2437);
				proxyClause_();
				}
				break;
			case 2:
				{
				setState(2438);
				privilegeClause_();
				}
				break;
			case 3:
				{
				setState(2439);
				allClause_();
				}
				break;
			case 4:
				{
				setState(2440);
				roleClause_();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProxyClause_Context extends ParserRuleContext {
		public TerminalNode PROXY() { return getToken(MySQLStatementParser.PROXY, 0); }
		public TerminalNode ON() { return getToken(MySQLStatementParser.ON, 0); }
		public ProxyClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proxyClause_; }
	}

	public final ProxyClause_Context proxyClause_() throws RecognitionException {
		ProxyClause_Context _localctx = new ProxyClause_Context(_ctx, getState());
		enterRule(_localctx, 346, RULE_proxyClause_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2443);
			match(PROXY);
			setState(2444);
			match(ON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrivilegeClause_Context extends ParserRuleContext {
		public Privileges_Context privileges_() {
			return getRuleContext(Privileges_Context.class,0);
		}
		public TerminalNode ON() { return getToken(MySQLStatementParser.ON, 0); }
		public OnObjectClause_Context onObjectClause_() {
			return getRuleContext(OnObjectClause_Context.class,0);
		}
		public PrivilegeClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_privilegeClause_; }
	}

	public final PrivilegeClause_Context privilegeClause_() throws RecognitionException {
		PrivilegeClause_Context _localctx = new PrivilegeClause_Context(_ctx, getState());
		enterRule(_localctx, 348, RULE_privilegeClause_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2446);
			privileges_();
			setState(2447);
			match(ON);
			setState(2448);
			onObjectClause_();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RoleClause_Context extends ParserRuleContext {
		public IgnoredIdentifiers_Context ignoredIdentifiers_() {
			return getRuleContext(IgnoredIdentifiers_Context.class,0);
		}
		public RoleClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_roleClause_; }
	}

	public final RoleClause_Context roleClause_() throws RecognitionException {
		RoleClause_Context _localctx = new RoleClause_Context(_ctx, getState());
		enterRule(_localctx, 350, RULE_roleClause_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2450);
			ignoredIdentifiers_();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AllClause_Context extends ParserRuleContext {
		public TerminalNode ALL() { return getToken(MySQLStatementParser.ALL, 0); }
		public TerminalNode COMMA_() { return getToken(MySQLStatementParser.COMMA_, 0); }
		public TerminalNode GRANT() { return getToken(MySQLStatementParser.GRANT, 0); }
		public TerminalNode OPTION() { return getToken(MySQLStatementParser.OPTION, 0); }
		public TerminalNode PRIVILEGES() { return getToken(MySQLStatementParser.PRIVILEGES, 0); }
		public AllClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_allClause_; }
	}

	public final AllClause_Context allClause_() throws RecognitionException {
		AllClause_Context _localctx = new AllClause_Context(_ctx, getState());
		enterRule(_localctx, 352, RULE_allClause_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2452);
			match(ALL);
			setState(2454);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PRIVILEGES) {
				{
				setState(2453);
				match(PRIVILEGES);
				}
			}

			setState(2456);
			match(COMMA_);
			setState(2457);
			match(GRANT);
			setState(2458);
			match(OPTION);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Privileges_Context extends ParserRuleContext {
		public List<PrivilegeType_Context> privilegeType_() {
			return getRuleContexts(PrivilegeType_Context.class);
		}
		public PrivilegeType_Context privilegeType_(int i) {
			return getRuleContext(PrivilegeType_Context.class,i);
		}
		public List<ColumnNamesContext> columnNames() {
			return getRuleContexts(ColumnNamesContext.class);
		}
		public ColumnNamesContext columnNames(int i) {
			return getRuleContext(ColumnNamesContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(MySQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(MySQLStatementParser.COMMA_, i);
		}
		public Privileges_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_privileges_; }
	}

	public final Privileges_Context privileges_() throws RecognitionException {
		Privileges_Context _localctx = new Privileges_Context(_ctx, getState());
		enterRule(_localctx, 354, RULE_privileges_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2460);
			privilegeType_();
			setState(2462);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP_) {
				{
				setState(2461);
				columnNames();
				}
			}

			setState(2471);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(2464);
				match(COMMA_);
				setState(2465);
				privilegeType_();
				setState(2467);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LP_) {
					{
					setState(2466);
					columnNames();
					}
				}

				}
				}
				setState(2473);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrivilegeType_Context extends ParserRuleContext {
		public TerminalNode ALL() { return getToken(MySQLStatementParser.ALL, 0); }
		public TerminalNode PRIVILEGES() { return getToken(MySQLStatementParser.PRIVILEGES, 0); }
		public TerminalNode ALTER() { return getToken(MySQLStatementParser.ALTER, 0); }
		public TerminalNode ROUTINE() { return getToken(MySQLStatementParser.ROUTINE, 0); }
		public TerminalNode CREATE() { return getToken(MySQLStatementParser.CREATE, 0); }
		public TerminalNode TABLESPACE() { return getToken(MySQLStatementParser.TABLESPACE, 0); }
		public TerminalNode TEMPORARY() { return getToken(MySQLStatementParser.TEMPORARY, 0); }
		public TerminalNode TABLES() { return getToken(MySQLStatementParser.TABLES, 0); }
		public TerminalNode USER() { return getToken(MySQLStatementParser.USER, 0); }
		public TerminalNode VIEW() { return getToken(MySQLStatementParser.VIEW, 0); }
		public TerminalNode DELETE() { return getToken(MySQLStatementParser.DELETE, 0); }
		public TerminalNode DROP() { return getToken(MySQLStatementParser.DROP, 0); }
		public TerminalNode EVENT() { return getToken(MySQLStatementParser.EVENT, 0); }
		public TerminalNode EXECUTE() { return getToken(MySQLStatementParser.EXECUTE, 0); }
		public TerminalNode FILE() { return getToken(MySQLStatementParser.FILE, 0); }
		public TerminalNode GRANT() { return getToken(MySQLStatementParser.GRANT, 0); }
		public TerminalNode OPTION() { return getToken(MySQLStatementParser.OPTION, 0); }
		public TerminalNode INDEX() { return getToken(MySQLStatementParser.INDEX, 0); }
		public TerminalNode INSERT() { return getToken(MySQLStatementParser.INSERT, 0); }
		public TerminalNode LOCK() { return getToken(MySQLStatementParser.LOCK, 0); }
		public TerminalNode PROCESS() { return getToken(MySQLStatementParser.PROCESS, 0); }
		public TerminalNode PROXY() { return getToken(MySQLStatementParser.PROXY, 0); }
		public TerminalNode REFERENCES() { return getToken(MySQLStatementParser.REFERENCES, 0); }
		public TerminalNode RELOAD() { return getToken(MySQLStatementParser.RELOAD, 0); }
		public TerminalNode REPLICATION() { return getToken(MySQLStatementParser.REPLICATION, 0); }
		public TerminalNode CLIENT() { return getToken(MySQLStatementParser.CLIENT, 0); }
		public TerminalNode SLAVE() { return getToken(MySQLStatementParser.SLAVE, 0); }
		public TerminalNode SELECT() { return getToken(MySQLStatementParser.SELECT, 0); }
		public TerminalNode SHOW() { return getToken(MySQLStatementParser.SHOW, 0); }
		public TerminalNode DATABASES() { return getToken(MySQLStatementParser.DATABASES, 0); }
		public TerminalNode SHUTDOWN() { return getToken(MySQLStatementParser.SHUTDOWN, 0); }
		public TerminalNode SUPER() { return getToken(MySQLStatementParser.SUPER, 0); }
		public TerminalNode TRIGGER() { return getToken(MySQLStatementParser.TRIGGER, 0); }
		public TerminalNode UPDATE() { return getToken(MySQLStatementParser.UPDATE, 0); }
		public TerminalNode USAGE() { return getToken(MySQLStatementParser.USAGE, 0); }
		public TerminalNode AUDIT_ADMIN() { return getToken(MySQLStatementParser.AUDIT_ADMIN, 0); }
		public TerminalNode BINLOG_ADMIN() { return getToken(MySQLStatementParser.BINLOG_ADMIN, 0); }
		public TerminalNode CONNECTION_ADMIN() { return getToken(MySQLStatementParser.CONNECTION_ADMIN, 0); }
		public TerminalNode ENCRYPTION_KEY_ADMIN() { return getToken(MySQLStatementParser.ENCRYPTION_KEY_ADMIN, 0); }
		public TerminalNode FIREWALL_ADMIN() { return getToken(MySQLStatementParser.FIREWALL_ADMIN, 0); }
		public TerminalNode FIREWALL_USER() { return getToken(MySQLStatementParser.FIREWALL_USER, 0); }
		public TerminalNode GROUP_REPLICATION_ADMIN() { return getToken(MySQLStatementParser.GROUP_REPLICATION_ADMIN, 0); }
		public TerminalNode REPLICATION_SLAVE_ADMIN() { return getToken(MySQLStatementParser.REPLICATION_SLAVE_ADMIN, 0); }
		public TerminalNode ROLE_ADMIN() { return getToken(MySQLStatementParser.ROLE_ADMIN, 0); }
		public TerminalNode SET_USER_ID() { return getToken(MySQLStatementParser.SET_USER_ID, 0); }
		public TerminalNode SYSTEM_VARIABLES_ADMIN() { return getToken(MySQLStatementParser.SYSTEM_VARIABLES_ADMIN, 0); }
		public TerminalNode VERSION_TOKEN_ADMIN() { return getToken(MySQLStatementParser.VERSION_TOKEN_ADMIN, 0); }
		public PrivilegeType_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_privilegeType_; }
	}

	public final PrivilegeType_Context privilegeType_() throws RecognitionException {
		PrivilegeType_Context _localctx = new PrivilegeType_Context(_ctx, getState());
		enterRule(_localctx, 356, RULE_privilegeType_);
		int _la;
		try {
			setState(2535);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,321,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2474);
				match(ALL);
				setState(2476);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PRIVILEGES) {
					{
					setState(2475);
					match(PRIVILEGES);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2478);
				match(ALTER);
				setState(2480);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ROUTINE) {
					{
					setState(2479);
					match(ROUTINE);
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2482);
				match(CREATE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2483);
				match(CREATE);
				setState(2484);
				match(ROUTINE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2485);
				match(CREATE);
				setState(2486);
				match(TABLESPACE);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2487);
				match(CREATE);
				setState(2488);
				match(TEMPORARY);
				setState(2489);
				match(TABLES);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2490);
				match(CREATE);
				setState(2491);
				match(USER);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2492);
				match(CREATE);
				setState(2493);
				match(VIEW);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2494);
				match(DELETE);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2495);
				match(DROP);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2496);
				match(EVENT);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(2497);
				match(EXECUTE);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(2498);
				match(FILE);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(2499);
				match(GRANT);
				setState(2500);
				match(OPTION);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(2501);
				match(INDEX);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(2502);
				match(INSERT);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(2503);
				match(LOCK);
				setState(2504);
				match(TABLES);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(2505);
				match(PROCESS);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(2506);
				match(PROXY);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(2507);
				match(REFERENCES);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(2508);
				match(RELOAD);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(2509);
				match(REPLICATION);
				setState(2510);
				match(CLIENT);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(2511);
				match(REPLICATION);
				setState(2512);
				match(SLAVE);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(2513);
				match(SELECT);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(2514);
				match(SHOW);
				setState(2515);
				match(DATABASES);
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(2516);
				match(SHOW);
				setState(2517);
				match(VIEW);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(2518);
				match(SHUTDOWN);
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(2519);
				match(SUPER);
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(2520);
				match(TRIGGER);
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(2521);
				match(UPDATE);
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(2522);
				match(USAGE);
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(2523);
				match(AUDIT_ADMIN);
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(2524);
				match(BINLOG_ADMIN);
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(2525);
				match(CONNECTION_ADMIN);
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(2526);
				match(ENCRYPTION_KEY_ADMIN);
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(2527);
				match(FIREWALL_ADMIN);
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 37);
				{
				setState(2528);
				match(FIREWALL_USER);
				}
				break;
			case 38:
				enterOuterAlt(_localctx, 38);
				{
				setState(2529);
				match(GROUP_REPLICATION_ADMIN);
				}
				break;
			case 39:
				enterOuterAlt(_localctx, 39);
				{
				setState(2530);
				match(REPLICATION_SLAVE_ADMIN);
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 40);
				{
				setState(2531);
				match(ROLE_ADMIN);
				}
				break;
			case 41:
				enterOuterAlt(_localctx, 41);
				{
				setState(2532);
				match(SET_USER_ID);
				}
				break;
			case 42:
				enterOuterAlt(_localctx, 42);
				{
				setState(2533);
				match(SYSTEM_VARIABLES_ADMIN);
				}
				break;
			case 43:
				enterOuterAlt(_localctx, 43);
				{
				setState(2534);
				match(VERSION_TOKEN_ADMIN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OnObjectClause_Context extends ParserRuleContext {
		public PrivilegeLevel_Context privilegeLevel_() {
			return getRuleContext(PrivilegeLevel_Context.class,0);
		}
		public ObjectType_Context objectType_() {
			return getRuleContext(ObjectType_Context.class,0);
		}
		public OnObjectClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onObjectClause_; }
	}

	public final OnObjectClause_Context onObjectClause_() throws RecognitionException {
		OnObjectClause_Context _localctx = new OnObjectClause_Context(_ctx, getState());
		enterRule(_localctx, 358, RULE_onObjectClause_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2538);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FUNCTION || _la==TABLE || _la==PROCEDURE) {
				{
				setState(2537);
				objectType_();
				}
			}

			setState(2540);
			privilegeLevel_();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObjectType_Context extends ParserRuleContext {
		public TerminalNode TABLE() { return getToken(MySQLStatementParser.TABLE, 0); }
		public TerminalNode FUNCTION() { return getToken(MySQLStatementParser.FUNCTION, 0); }
		public TerminalNode PROCEDURE() { return getToken(MySQLStatementParser.PROCEDURE, 0); }
		public ObjectType_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectType_; }
	}

	public final ObjectType_Context objectType_() throws RecognitionException {
		ObjectType_Context _localctx = new ObjectType_Context(_ctx, getState());
		enterRule(_localctx, 360, RULE_objectType_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2542);
			_la = _input.LA(1);
			if ( !(_la==FUNCTION || _la==TABLE || _la==PROCEDURE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrivilegeLevel_Context extends ParserRuleContext {
		public TerminalNode ASTERISK_() { return getToken(MySQLStatementParser.ASTERISK_, 0); }
		public TerminalNode DOT_ASTERISK_() { return getToken(MySQLStatementParser.DOT_ASTERISK_, 0); }
		public Identifier_Context identifier_() {
			return getRuleContext(Identifier_Context.class,0);
		}
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public PrivilegeLevel_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_privilegeLevel_; }
	}

	public final PrivilegeLevel_Context privilegeLevel_() throws RecognitionException {
		PrivilegeLevel_Context _localctx = new PrivilegeLevel_Context(_ctx, getState());
		enterRule(_localctx, 362, RULE_privilegeLevel_);
		try {
			setState(2551);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,323,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2544);
				match(ASTERISK_);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2545);
				match(ASTERISK_);
				setState(2546);
				match(DOT_ASTERISK_);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2547);
				identifier_();
				setState(2548);
				match(DOT_ASTERISK_);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2550);
				tableName();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateUserContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(MySQLStatementParser.CREATE, 0); }
		public TerminalNode USER() { return getToken(MySQLStatementParser.USER, 0); }
		public CreateUserContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createUser; }
	}

	public final CreateUserContext createUser() throws RecognitionException {
		CreateUserContext _localctx = new CreateUserContext(_ctx, getState());
		enterRule(_localctx, 364, RULE_createUser);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2553);
			match(CREATE);
			setState(2554);
			match(USER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DropUserContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(MySQLStatementParser.DROP, 0); }
		public TerminalNode USER() { return getToken(MySQLStatementParser.USER, 0); }
		public DropUserContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropUser; }
	}

	public final DropUserContext dropUser() throws RecognitionException {
		DropUserContext _localctx = new DropUserContext(_ctx, getState());
		enterRule(_localctx, 366, RULE_dropUser);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2556);
			match(DROP);
			setState(2557);
			match(USER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlterUserContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(MySQLStatementParser.ALTER, 0); }
		public TerminalNode USER() { return getToken(MySQLStatementParser.USER, 0); }
		public AlterUserContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterUser; }
	}

	public final AlterUserContext alterUser() throws RecognitionException {
		AlterUserContext _localctx = new AlterUserContext(_ctx, getState());
		enterRule(_localctx, 368, RULE_alterUser);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2559);
			match(ALTER);
			setState(2560);
			match(USER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RenameUserContext extends ParserRuleContext {
		public TerminalNode RENAME() { return getToken(MySQLStatementParser.RENAME, 0); }
		public TerminalNode USER() { return getToken(MySQLStatementParser.USER, 0); }
		public RenameUserContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_renameUser; }
	}

	public final RenameUserContext renameUser() throws RecognitionException {
		RenameUserContext _localctx = new RenameUserContext(_ctx, getState());
		enterRule(_localctx, 370, RULE_renameUser);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2562);
			match(RENAME);
			setState(2563);
			match(USER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateRoleContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(MySQLStatementParser.CREATE, 0); }
		public TerminalNode ROLE() { return getToken(MySQLStatementParser.ROLE, 0); }
		public CreateRoleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createRole; }
	}

	public final CreateRoleContext createRole() throws RecognitionException {
		CreateRoleContext _localctx = new CreateRoleContext(_ctx, getState());
		enterRule(_localctx, 372, RULE_createRole);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2565);
			match(CREATE);
			setState(2566);
			match(ROLE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DropRoleContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(MySQLStatementParser.DROP, 0); }
		public TerminalNode ROLE() { return getToken(MySQLStatementParser.ROLE, 0); }
		public DropRoleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropRole; }
	}

	public final DropRoleContext dropRole() throws RecognitionException {
		DropRoleContext _localctx = new DropRoleContext(_ctx, getState());
		enterRule(_localctx, 374, RULE_dropRole);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2568);
			match(DROP);
			setState(2569);
			match(ROLE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetRoleContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(MySQLStatementParser.SET, 0); }
		public TerminalNode ROLE() { return getToken(MySQLStatementParser.ROLE, 0); }
		public TerminalNode DEFAULT() { return getToken(MySQLStatementParser.DEFAULT, 0); }
		public SetRoleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setRole; }
	}

	public final SetRoleContext setRole() throws RecognitionException {
		SetRoleContext _localctx = new SetRoleContext(_ctx, getState());
		enterRule(_localctx, 376, RULE_setRole);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2571);
			match(SET);
			setState(2573);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(2572);
				match(DEFAULT);
				}
			}

			setState(2575);
			match(ROLE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetPasswordContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(MySQLStatementParser.SET, 0); }
		public TerminalNode PASSWORD() { return getToken(MySQLStatementParser.PASSWORD, 0); }
		public SetPasswordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setPassword; }
	}

	public final SetPasswordContext setPassword() throws RecognitionException {
		SetPasswordContext _localctx = new SetPasswordContext(_ctx, getState());
		enterRule(_localctx, 378, RULE_setPassword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2577);
			match(SET);
			setState(2578);
			match(PASSWORD);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 65:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 68:
			return booleanPrimary__sempred((BooleanPrimary_Context)_localctx, predIndex);
		case 71:
			return bitExpr_sempred((BitExprContext)_localctx, predIndex);
		case 72:
			return simpleExpr_sempred((SimpleExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean booleanPrimary__sempred(BooleanPrimary_Context _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		case 4:
			return precpred(_ctx, 3);
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean bitExpr_sempred(BitExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 15);
		case 7:
			return precpred(_ctx, 14);
		case 8:
			return precpred(_ctx, 13);
		case 9:
			return precpred(_ctx, 12);
		case 10:
			return precpred(_ctx, 11);
		case 11:
			return precpred(_ctx, 10);
		case 12:
			return precpred(_ctx, 9);
		case 13:
			return precpred(_ctx, 8);
		case 14:
			return precpred(_ctx, 7);
		case 15:
			return precpred(_ctx, 6);
		case 16:
			return precpred(_ctx, 5);
		case 17:
			return precpred(_ctx, 4);
		case 18:
			return precpred(_ctx, 3);
		case 19:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean simpleExpr_sempred(SimpleExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 20:
			return precpred(_ctx, 8);
		case 21:
			return precpred(_ctx, 10);
		}
		return true;
	}

	private static final int _serializedATNSegments = 2;
	private static final String _serializedATNSegment0 =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u0183\u0a17\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092\t\u0092"+
		"\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096\4\u0097"+
		"\t\u0097\4\u0098\t\u0098\4\u0099\t\u0099\4\u009a\t\u009a\4\u009b\t\u009b"+
		"\4\u009c\t\u009c\4\u009d\t\u009d\4\u009e\t\u009e\4\u009f\t\u009f\4\u00a0"+
		"\t\u00a0\4\u00a1\t\u00a1\4\u00a2\t\u00a2\4\u00a3\t\u00a3\4\u00a4\t\u00a4"+
		"\4\u00a5\t\u00a5\4\u00a6\t\u00a6\4\u00a7\t\u00a7\4\u00a8\t\u00a8\4\u00a9"+
		"\t\u00a9\4\u00aa\t\u00aa\4\u00ab\t\u00ab\4\u00ac\t\u00ac\4\u00ad\t\u00ad"+
		"\4\u00ae\t\u00ae\4\u00af\t\u00af\4\u00b0\t\u00b0\4\u00b1\t\u00b1\4\u00b2"+
		"\t\u00b2\4\u00b3\t\u00b3\4\u00b4\t\u00b4\4\u00b5\t\u00b5\4\u00b6\t\u00b6"+
		"\4\u00b7\t\u00b7\4\u00b8\t\u00b8\4\u00b9\t\u00b9\4\u00ba\t\u00ba\4\u00bb"+
		"\t\u00bb\4\u00bc\t\u00bc\4\u00bd\t\u00bd\4\u00be\t\u00be\4\u00bf\t\u00bf"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\u0199\n\2\3\2\5\2\u019c\n\2\3\3"+
		"\3\3\3\3\5\3\u01a1\n\3\3\3\3\3\5\3\u01a5\n\3\3\3\3\3\3\3\5\3\u01aa\n\3"+
		"\3\3\5\3\u01ad\n\3\3\4\5\4\u01b0\n\4\3\4\5\4\u01b3\n\4\3\5\5\5\u01b6\n"+
		"\5\3\5\3\5\3\5\3\5\7\5\u01bc\n\5\f\5\16\5\u01bf\13\5\3\6\5\6\u01c2\n\6"+
		"\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u01cd\n\7\f\7\16\7\u01d0\13\7"+
		"\3\b\3\b\3\b\3\b\3\b\5\b\u01d7\n\b\3\t\5\t\u01da\n\t\3\t\5\t\u01dd\n\t"+
		"\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\7\13\u01e7\n\13\f\13\16\13\u01ea"+
		"\13\13\3\f\3\f\3\f\3\f\7\f\u01f0\n\f\f\f\16\f\u01f3\13\f\3\f\3\f\3\f\3"+
		"\f\5\f\u01f9\n\f\3\r\3\r\5\r\u01fd\n\r\3\16\3\16\3\16\3\16\5\16\u0203"+
		"\n\16\3\16\5\16\u0206\n\16\3\17\5\17\u0209\n\17\3\17\5\17\u020c\n\17\3"+
		"\17\5\17\u020f\n\17\3\20\3\20\3\20\5\20\u0214\n\20\3\20\5\20\u0217\n\20"+
		"\3\20\5\20\u021a\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21"+
		"\u0225\n\21\3\22\3\22\5\22\u0229\n\22\3\22\3\22\3\22\5\22\u022e\n\22\7"+
		"\22\u0230\n\22\f\22\16\22\u0233\13\22\3\23\5\23\u0236\n\23\3\23\3\23\3"+
		"\24\3\24\5\24\u023c\n\24\3\24\3\24\3\24\7\24\u0241\n\24\f\24\16\24\u0244"+
		"\13\24\3\25\3\25\5\25\u0248\n\25\3\25\3\25\3\25\3\26\3\26\3\26\5\26\u0250"+
		"\n\26\3\26\7\26\u0253\n\26\f\26\16\26\u0256\13\26\3\27\3\27\7\27\u025a"+
		"\n\27\f\27\16\27\u025d\13\27\3\27\3\27\5\27\u0261\n\27\3\27\5\27\u0264"+
		"\n\27\3\27\5\27\u0267\n\27\3\27\5\27\u026a\n\27\3\27\5\27\u026d\n\27\3"+
		"\27\5\27\u0270\n\27\3\27\5\27\u0273\n\27\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\5\30\u027d\n\30\3\31\3\31\3\32\3\32\5\32\u0283\n\32\3\32\3"+
		"\32\7\32\u0287\n\32\f\32\16\32\u028a\13\32\3\33\3\33\5\33\u028e\n\33\3"+
		"\33\5\33\u0291\n\33\3\33\5\33\u0294\n\33\3\33\5\33\u0297\n\33\3\34\3\34"+
		"\5\34\u029b\n\34\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \7 \u02a8"+
		"\n \f \16 \u02ab\13 \3!\3!\3!\3!\3!\3!\5!\u02b3\n!\3\"\3\"\3\"\6\"\u02b8"+
		"\n\"\r\"\16\"\u02b9\3\"\3\"\7\"\u02be\n\"\f\"\16\"\u02c1\13\"\5\"\u02c3"+
		"\n\"\3#\3#\5#\u02c7\n#\3#\5#\u02ca\n#\3#\5#\u02cd\n#\3#\5#\u02d0\n#\3"+
		"#\3#\5#\u02d4\n#\3#\3#\5#\u02d8\n#\3#\3#\3#\3#\5#\u02de\n#\3$\3$\3$\3"+
		"$\3$\7$\u02e5\n$\f$\16$\u02e8\13$\3$\3$\3%\3%\3%\7%\u02ef\n%\f%\16%\u02f2"+
		"\13%\3&\3&\3&\3&\3&\3&\3&\3&\5&\u02fc\n&\5&\u02fe\n&\3&\3&\3&\3&\7&\u0304"+
		"\n&\f&\16&\u0307\13&\3&\3&\3\'\5\'\u030c\n\'\3\'\3\'\5\'\u0310\n\'\3\'"+
		"\3\'\5\'\u0314\n\'\3\'\3\'\5\'\u0318\n\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3"+
		"\'\5\'\u0322\n\'\3\'\3\'\5\'\u0326\n\'\3(\3(\3(\3(\5(\u032c\n(\3)\3)\3"+
		")\3*\3*\3*\3*\3*\7*\u0336\n*\f*\16*\u0339\13*\3*\3*\5*\u033d\n*\3+\3+"+
		"\3+\3,\3,\3,\3,\5,\u0346\n,\3,\3,\3,\3,\5,\u034c\n,\3-\3-\5-\u0350\n-"+
		"\3.\3.\3.\3.\7.\u0356\n.\f.\16.\u0359\13.\3/\3/\3/\3/\3/\3/\3\60\3\60"+
		"\3\60\3\60\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\5\62\u036e\n\62"+
		"\3\63\5\63\u0371\n\63\3\63\3\63\5\63\u0375\n\63\3\64\3\64\3\65\3\65\3"+
		"\65\3\65\3\65\3\65\3\65\5\65\u0380\n\65\3\66\5\66\u0383\n\66\3\66\3\66"+
		"\5\66\u0387\n\66\3\67\5\67\u038a\n\67\3\67\3\67\5\67\u038e\n\67\38\38"+
		"\39\39\3:\3:\3;\3;\3<\3<\5<\u039a\n<\3=\3=\5=\u039e\n=\3=\5=\u03a1\n="+
		"\3=\5=\u03a4\n=\3=\3=\3>\3>\3?\3?\3?\5?\u03ad\n?\3?\3?\3@\3@\3@\5@\u03b4"+
		"\n@\3@\3@\3A\3A\3A\3A\7A\u03bc\nA\fA\16A\u03bf\13A\3A\3A\3B\3B\3C\3C\3"+
		"C\3C\3C\3C\3C\3C\3C\5C\u03ce\nC\3C\3C\3C\3C\3C\3C\3C\7C\u03d7\nC\fC\16"+
		"C\u03da\13C\3D\3D\3E\3E\3F\3F\3F\3F\3F\3F\5F\u03e6\nF\3F\3F\3F\3F\3F\3"+
		"F\3F\3F\3F\3F\3F\3F\3F\7F\u03f5\nF\fF\16F\u03f8\13F\3G\3G\3H\3H\5H\u03fe"+
		"\nH\3H\3H\3H\3H\3H\5H\u0405\nH\3H\3H\3H\3H\3H\7H\u040c\nH\fH\16H\u040f"+
		"\13H\3H\3H\3H\3H\5H\u0415\nH\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\5H\u0423"+
		"\nH\3H\3H\3H\3H\5H\u0429\nH\3H\3H\5H\u042d\nH\3H\3H\3H\3H\5H\u0433\nH"+
		"\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I"+
		"\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\7I"+
		"\u0462\nI\fI\16I\u0465\13I\3J\3J\3J\3J\3J\3J\3J\3J\3J\5J\u0470\nJ\3J\3"+
		"J\3J\3J\7J\u0476\nJ\fJ\16J\u0479\13J\3J\3J\3J\5J\u047e\nJ\3J\3J\3J\3J"+
		"\3J\3J\3J\3J\3J\5J\u0489\nJ\3J\3J\3J\3J\3J\3J\3J\5J\u0492\nJ\7J\u0494"+
		"\nJ\fJ\16J\u0497\13J\3K\3K\3K\5K\u049c\nK\3L\3L\3L\5L\u04a1\nL\3L\3L\3"+
		"L\7L\u04a6\nL\fL\16L\u04a9\13L\3L\5L\u04ac\nL\3L\3L\5L\u04b0\nL\3M\3M"+
		"\3N\3N\3O\3O\3O\3O\3O\3O\5O\u04bc\nO\3P\5P\u04bf\nP\3P\5P\u04c2\nP\3P"+
		"\5P\u04c5\nP\3P\5P\u04c8\nP\3Q\3Q\3Q\3Q\3Q\7Q\u04cf\nQ\fQ\16Q\u04d2\13"+
		"Q\3R\3R\3R\5R\u04d7\nR\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\5S\u04e5\n"+
		"S\3T\3T\3U\3U\3U\3U\3U\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\5V\u04f8\nV\3W\3"+
		"W\3W\5W\u04fd\nW\3W\3W\3W\7W\u0502\nW\fW\16W\u0505\13W\3W\5W\u0508\nW"+
		"\3W\3W\3W\5W\u050d\nW\5W\u050f\nW\3W\3W\3X\3X\3X\3X\3X\7X\u0518\nX\fX"+
		"\16X\u051b\13X\3X\3X\3X\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3"+
		"Z\3Z\3Z\3Z\3Z\3Z\5Z\u0535\nZ\3[\3[\3[\3[\3[\3[\3[\3\\\3\\\3\\\3\\\3\\"+
		"\3\\\3\\\5\\\u0545\n\\\3\\\3\\\3]\3]\3]\3]\3]\3]\3]\3^\3^\3^\3^\3^\7^"+
		"\u0555\n^\f^\16^\u0558\13^\3^\3^\5^\u055c\n^\3^\3^\3_\3_\3_\3_\3_\3_\3"+
		"_\3_\3`\3`\3`\3`\3`\5`\u056d\n`\3`\5`\u0570\n`\3`\3`\3a\3a\3a\3a\7a\u0578"+
		"\na\fa\16a\u057b\13a\3a\3a\3a\5a\u0580\na\3b\3b\5b\u0584\nb\3b\5b\u0587"+
		"\nb\3c\3c\3c\3c\3c\7c\u058e\nc\fc\16c\u0591\13c\3c\5c\u0594\nc\3c\3c\3"+
		"d\3d\3d\3d\3d\3d\3d\5d\u059f\nd\3e\3e\3e\3e\3e\5e\u05a6\ne\3f\3f\3f\3"+
		"f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\5f\u05b9\nf\3g\3g\5g\u05bd\n"+
		"g\3g\6g\u05c0\ng\rg\16g\u05c1\3g\5g\u05c5\ng\3g\3g\3h\3h\3h\3h\3h\3i\3"+
		"i\3i\3j\3j\3j\3j\3k\3k\3l\3l\3l\3l\3l\7l\u05dc\nl\fl\16l\u05df\13l\3m"+
		"\3m\3m\5m\u05e4\nm\3m\5m\u05e7\nm\3n\3n\5n\u05eb\nn\3n\5n\u05ee\nn\3n"+
		"\5n\u05f1\nn\3n\5n\u05f4\nn\3n\5n\u05f7\nn\3n\3n\3n\3n\3n\7n\u05fe\nn"+
		"\fn\16n\u0601\13n\3n\3n\5n\u0605\nn\3n\5n\u0608\nn\5n\u060a\nn\3o\3o\5"+
		"o\u060e\no\3p\3p\3p\3p\5p\u0614\np\3p\3p\3q\3q\3q\5q\u061b\nq\3q\3q\3"+
		"q\5q\u0620\nq\3q\5q\u0623\nq\3r\3r\5r\u0627\nr\3r\3r\5r\u062b\nr\3s\3"+
		"s\3s\5s\u0630\ns\3t\3t\3t\7t\u0635\nt\ft\16t\u0638\13t\3u\3u\5u\u063c"+
		"\nu\3u\3u\3u\3u\5u\u0642\nu\3u\3u\3u\3u\3u\3u\5u\u064a\nu\3v\3v\3v\7v"+
		"\u064f\nv\fv\16v\u0652\13v\3w\3w\3w\3w\5w\u0658\nw\3x\3x\3x\7x\u065d\n"+
		"x\fx\16x\u0660\13x\3x\7x\u0663\nx\fx\16x\u0666\13x\5x\u0668\nx\3y\3y\3"+
		"y\3y\3y\5y\u066f\ny\3y\3y\3y\3y\5y\u0675\ny\3z\3z\3z\5z\u067a\nz\3z\3"+
		"z\3z\5z\u067f\nz\3{\3{\3{\5{\u0684\n{\3{\5{\u0687\n{\3{\3{\3{\3{\3{\3"+
		"{\5{\u068f\n{\3|\3|\3|\3|\3|\3|\3|\3|\3|\5|\u069a\n|\3|\3|\3|\7|\u069f"+
		"\n|\f|\16|\u06a2\13|\3}\3}\3}\3}\3}\3}\3}\3}\5}\u06ac\n}\3~\5~\u06af\n"+
		"~\3~\5~\u06b2\n~\3~\5~\u06b5\n~\3~\5~\u06b8\n~\3~\3~\7~\u06bc\n~\f~\16"+
		"~\u06bf\13~\3\177\3\177\3\177\3\u0080\3\u0080\3\u0080\3\u0080\7\u0080"+
		"\u06c8\n\u0080\f\u0080\16\u0080\u06cb\13\u0080\3\u0080\3\u0080\3\u0081"+
		"\3\u0081\3\u0081\3\u0081\5\u0081\u06d3\n\u0081\3\u0081\5\u0081\u06d6\n"+
		"\u0081\3\u0081\5\u0081\u06d9\n\u0081\3\u0082\3\u0082\5\u0082\u06dd\n\u0082"+
		"\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082"+
		"\5\u0082\u06e8\n\u0082\3\u0083\3\u0083\5\u0083\u06ec\n\u0083\5\u0083\u06ee"+
		"\n\u0083\3\u0083\3\u0083\3\u0083\5\u0083\u06f3\n\u0083\3\u0084\3\u0084"+
		"\5\u0084\u06f7\n\u0084\3\u0084\3\u0084\7\u0084\u06fb\n\u0084\f\u0084\16"+
		"\u0084\u06fe\13\u0084\3\u0085\5\u0085\u0701\n\u0085\3\u0085\3\u0085\3"+
		"\u0086\3\u0086\5\u0086\u0707\n\u0086\3\u0086\5\u0086\u070a\n\u0086\3\u0086"+
		"\5\u0086\u070d\n\u0086\3\u0086\3\u0086\7\u0086\u0711\n\u0086\f\u0086\16"+
		"\u0086\u0714\13\u0086\3\u0087\3\u0087\3\u0087\5\u0087\u0719\n\u0087\3"+
		"\u0087\3\u0087\3\u0087\3\u0088\3\u0088\5\u0088\u0720\n\u0088\5\u0088\u0722"+
		"\n\u0088\3\u0088\3\u0088\3\u0088\5\u0088\u0727\n\u0088\3\u0088\5\u0088"+
		"\u072a\n\u0088\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089"+
		"\5\u0089\u0733\n\u0089\3\u008a\3\u008a\3\u008a\3\u008a\5\u008a\u0739\n"+
		"\u008a\3\u008b\3\u008b\3\u008b\7\u008b\u073e\n\u008b\f\u008b\16\u008b"+
		"\u0741\13\u008b\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c"+
		"\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\5\u008c\u0750\n\u008c"+
		"\3\u008c\3\u008c\3\u008c\3\u008c\5\u008c\u0756\n\u008c\3\u008c\3\u008c"+
		"\3\u008c\5\u008c\u075b\n\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c"+
		"\3\u008c\5\u008c\u0763\n\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c"+
		"\3\u008c\3\u008c\5\u008c\u076c\n\u008c\3\u008c\3\u008c\5\u008c\u0770\n"+
		"\u008c\3\u008c\3\u008c\3\u008c\3\u008c\5\u008c\u0776\n\u008c\3\u008c\3"+
		"\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c"+
		"\3\u008c\3\u008c\3\u008c\3\u008c\5\u008c\u0786\n\u008c\3\u008c\3\u008c"+
		"\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\7\u008c\u078f\n\u008c\f\u008c"+
		"\16\u008c\u0792\13\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c"+
		"\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c"+
		"\3\u008c\3\u008c\3\u008c\5\u008c\u07a6\n\u008c\3\u008c\3\u008c\3\u008c"+
		"\3\u008c\3\u008c\5\u008c\u07ad\n\u008c\3\u008c\3\u008c\3\u008c\3\u008c"+
		"\3\u008c\5\u008c\u07b4\n\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c"+
		"\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c"+
		"\3\u008c\3\u008c\3\u008c\5\u008c\u07c7\n\u008c\3\u008c\3\u008c\3\u008c"+
		"\3\u008c\5\u008c\u07cd\n\u008c\3\u008c\3\u008c\3\u008c\3\u008c\5\u008c"+
		"\u07d3\n\u008c\3\u008c\3\u008c\3\u008c\3\u008c\5\u008c\u07d9\n\u008c\3"+
		"\u008c\3\u008c\3\u008c\3\u008c\5\u008c\u07df\n\u008c\3\u008c\3\u008c\3"+
		"\u008c\3\u008c\5\u008c\u07e5\n\u008c\3\u008c\3\u008c\3\u008c\3\u008c\5"+
		"\u008c\u07eb\n\u008c\3\u008d\3\u008d\5\u008d\u07ef\n\u008d\3\u008d\7\u008d"+
		"\u07f2\n\u008d\f\u008d\16\u008d\u07f5\13\u008d\3\u008e\3\u008e\5\u008e"+
		"\u07f9\n\u008e\3\u008e\3\u008e\3\u008e\5\u008e\u07fe\n\u008e\3\u008e\3"+
		"\u008e\5\u008e\u0802\n\u008e\3\u008e\3\u008e\5\u008e\u0806\n\u008e\3\u008e"+
		"\3\u008e\5\u008e\u080a\n\u008e\3\u008e\3\u008e\3\u008e\5\u008e\u080f\n"+
		"\u008e\3\u008e\3\u008e\3\u008e\5\u008e\u0814\n\u008e\3\u008e\3\u008e\3"+
		"\u008e\5\u008e\u0819\n\u008e\3\u008e\3\u008e\3\u008e\3\u008e\5\u008e\u081f"+
		"\n\u008e\3\u008e\3\u008e\3\u008e\5\u008e\u0824\n\u008e\3\u008e\3\u008e"+
		"\3\u008e\5\u008e\u0829\n\u008e\3\u008e\3\u008e\3\u008e\5\u008e\u082e\n"+
		"\u008e\3\u008e\3\u008e\3\u008e\5\u008e\u0833\n\u008e\3\u008e\3\u008e\3"+
		"\u008e\5\u008e\u0838\n\u008e\3\u008e\3\u008e\3\u008e\5\u008e\u083d\n\u008e"+
		"\3\u008e\3\u008e\3\u008e\5\u008e\u0842\n\u008e\3\u008e\3\u008e\3\u008e"+
		"\5\u008e\u0847\n\u008e\3\u008e\3\u008e\3\u008e\5\u008e\u084c\n\u008e\3"+
		"\u008e\3\u008e\3\u008e\5\u008e\u0851\n\u008e\3\u008e\3\u008e\3\u008e\5"+
		"\u008e\u0856\n\u008e\3\u008e\3\u008e\3\u008e\5\u008e\u085b\n\u008e\3\u008e"+
		"\3\u008e\3\u008e\5\u008e\u0860\n\u008e\3\u008e\3\u008e\3\u008e\3\u008e"+
		"\3\u008e\5\u008e\u0867\n\u008e\3\u008e\3\u008e\5\u008e\u086b\n\u008e\3"+
		"\u008e\3\u008e\3\u008e\3\u008e\7\u008e\u0871\n\u008e\f\u008e\16\u008e"+
		"\u0874\13\u008e\3\u008e\3\u008e\5\u008e\u0878\n\u008e\3\u008f\3\u008f"+
		"\5\u008f\u087c\n\u008f\3\u008f\3\u008f\5\u008f\u0880\n\u008f\3\u008f\3"+
		"\u008f\3\u008f\3\u008f\7\u008f\u0886\n\u008f\f\u008f\16\u008f\u0889\13"+
		"\u008f\3\u008f\3\u008f\5\u008f\u088d\n\u008f\3\u0090\3\u0090\3\u0090\5"+
		"\u0090\u0892\n\u0090\3\u0091\3\u0091\3\u0091\3\u0092\3\u0092\3\u0092\3"+
		"\u0093\3\u0093\5\u0093\u089c\n\u0093\3\u0093\3\u0093\3\u0093\5\u0093\u08a1"+
		"\n\u0093\3\u0094\3\u0094\5\u0094\u08a5\n\u0094\3\u0094\3\u0094\3\u0095"+
		"\3\u0095\3\u0095\3\u0095\3\u0096\3\u0096\3\u0096\3\u0097\3\u0097\5\u0097"+
		"\u08b2\n\u0097\3\u0097\3\u0097\5\u0097\u08b6\n\u0097\3\u0098\3\u0098\3"+
		"\u0098\3\u0098\3\u0098\3\u0098\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099"+
		"\3\u0099\3\u009a\3\u009a\5\u009a\u08c6\n\u009a\3\u009a\3\u009a\3\u009b"+
		"\3\u009b\3\u009c\3\u009c\3\u009c\3\u009c\7\u009c\u08d0\n\u009c\f\u009c"+
		"\16\u009c\u08d3\13\u009c\3\u009c\3\u009c\3\u009d\3\u009d\3\u009d\3\u009d"+
		"\3\u009d\3\u009d\3\u009d\3\u009d\3\u009d\3\u009d\3\u009d\5\u009d\u08e2"+
		"\n\u009d\5\u009d\u08e4\n\u009d\3\u009d\7\u009d\u08e7\n\u009d\f\u009d\16"+
		"\u009d\u08ea\13\u009d\3\u009d\3\u009d\3\u009d\3\u009d\7\u009d\u08f0\n"+
		"\u009d\f\u009d\16\u009d\u08f3\13\u009d\3\u009d\3\u009d\5\u009d\u08f7\n"+
		"\u009d\3\u009e\3\u009e\3\u009e\5\u009e\u08fc\n\u009e\3\u009e\3\u009e\3"+
		"\u009e\5\u009e\u0901\n\u009e\3\u009f\3\u009f\3\u009f\7\u009f\u0906\n\u009f"+
		"\f\u009f\16\u009f\u0909\13\u009f\3\u00a0\5\u00a0\u090c\n\u00a0\3\u00a0"+
		"\3\u00a0\5\u00a0\u0910\n\u00a0\3\u00a0\3\u00a0\3\u00a0\5\u00a0\u0915\n"+
		"\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0\5\u00a0\u091b\n\u00a0\3\u00a0\3"+
		"\u00a0\3\u00a0\3\u00a0\5\u00a0\u0921\n\u00a0\3\u00a0\3\u00a0\3\u00a0\5"+
		"\u00a0\u0926\n\u00a0\3\u00a0\3\u00a0\3\u00a0\5\u00a0\u092b\n\u00a0\3\u00a0"+
		"\3\u00a0\3\u00a0\5\u00a0\u0930\n\u00a0\3\u00a0\5\u00a0\u0933\n\u00a0\3"+
		"\u00a1\3\u00a1\3\u00a1\7\u00a1\u0938\n\u00a1\f\u00a1\16\u00a1\u093b\13"+
		"\u00a1\3\u00a2\3\u00a2\5\u00a2\u093f\n\u00a2\3\u00a2\3\u00a2\3\u00a2\5"+
		"\u00a2\u0944\n\u00a2\3\u00a2\3\u00a2\3\u00a2\7\u00a2\u0949\n\u00a2\f\u00a2"+
		"\16\u00a2\u094c\13\u00a2\3\u00a3\3\u00a3\5\u00a3\u0950\n\u00a3\3\u00a3"+
		"\3\u00a3\3\u00a4\3\u00a4\5\u00a4\u0956\n\u00a4\3\u00a4\3\u00a4\3\u00a4"+
		"\5\u00a4\u095b\n\u00a4\3\u00a4\3\u00a4\3\u00a4\3\u00a5\3\u00a5\3\u00a5"+
		"\5\u00a5\u0963\n\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a6\3\u00a6"+
		"\5\u00a6\u096b\n\u00a6\3\u00a6\3\u00a6\3\u00a7\3\u00a7\3\u00a7\3\u00a7"+
		"\3\u00a7\3\u00a8\3\u00a8\3\u00a9\3\u00a9\3\u00a9\5\u00a9\u0979\n\u00a9"+
		"\3\u00aa\3\u00aa\3\u00ab\3\u00ab\3\u00ac\3\u00ac\3\u00ad\3\u00ad\3\u00ad"+
		"\3\u00ad\5\u00ad\u0985\n\u00ad\3\u00ae\3\u00ae\3\u00ae\3\u00ae\3\u00ae"+
		"\5\u00ae\u098c\n\u00ae\3\u00af\3\u00af\3\u00af\3\u00b0\3\u00b0\3\u00b0"+
		"\3\u00b0\3\u00b1\3\u00b1\3\u00b2\3\u00b2\5\u00b2\u0999\n\u00b2\3\u00b2"+
		"\3\u00b2\3\u00b2\3\u00b2\3\u00b3\3\u00b3\5\u00b3\u09a1\n\u00b3\3\u00b3"+
		"\3\u00b3\3\u00b3\5\u00b3\u09a6\n\u00b3\7\u00b3\u09a8\n\u00b3\f\u00b3\16"+
		"\u00b3\u09ab\13\u00b3\3\u00b4\3\u00b4\5\u00b4\u09af\n\u00b4\3\u00b4\3"+
		"\u00b4\5\u00b4\u09b3\n\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3"+
		"\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4"+
		"\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4"+
		"\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4"+
		"\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4"+
		"\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4"+
		"\3\u00b4\3\u00b4\3\u00b4\5\u00b4\u09ea\n\u00b4\3\u00b5\5\u00b5\u09ed\n"+
		"\u00b5\3\u00b5\3\u00b5\3\u00b6\3\u00b6\3\u00b7\3\u00b7\3\u00b7\3\u00b7"+
		"\3\u00b7\3\u00b7\3\u00b7\5\u00b7\u09fa\n\u00b7\3\u00b8\3\u00b8\3\u00b8"+
		"\3\u00b9\3\u00b9\3\u00b9\3\u00ba\3\u00ba\3\u00ba\3\u00bb\3\u00bb\3\u00bb"+
		"\3\u00bc\3\u00bc\3\u00bc\3\u00bd\3\u00bd\3\u00bd\3\u00be\3\u00be\5\u00be"+
		"\u0a10\n\u00be\3\u00be\3\u00be\3\u00bf\3\u00bf\3\u00bf\3\u00bf\2\6\u0084"+
		"\u008a\u0090\u0092\u00c0\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&("+
		"*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084"+
		"\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c"+
		"\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4"+
		"\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc"+
		"\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4"+
		"\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc"+
		"\u00fe\u0100\u0102\u0104\u0106\u0108\u010a\u010c\u010e\u0110\u0112\u0114"+
		"\u0116\u0118\u011a\u011c\u011e\u0120\u0122\u0124\u0126\u0128\u012a\u012c"+
		"\u012e\u0130\u0132\u0134\u0136\u0138\u013a\u013c\u013e\u0140\u0142\u0144"+
		"\u0146\u0148\u014a\u014c\u014e\u0150\u0152\u0154\u0156\u0158\u015a\u015c"+
		"\u015e\u0160\u0162\u0164\u0166\u0168\u016a\u016c\u016e\u0170\u0172\u0174"+
		"\u0176\u0178\u017a\u017c\2\62\5\2\u0082\u0082\u00a2\u00a2\u00b8\u00b8"+
		"\3\2\u0118\u0119\4\2\4\4\r\r\4\2\u00f7\u00f7\u00f9\u00f9\5\2\4\4\r\r\u0087"+
		"\u0087\5\2\u009c\u009c\u00a5\u00a5\u0115\u0115\4\2\26\26FF\4\2~~\u00a7"+
		"\u00a7\4\2\u00b2\u00b2\u00e4\u00e4\4\2\13\13()\4\2\20\20**\5\2\u009f\u009f"+
		"\u00cb\u00cc\u00eb\u00ebG\2\6\6\13\13\16\16\35\35$$\'),,\62\62\678;;>"+
		">@@GHKLQQSSVWZ]``bcffiimqsy{{\u0080\u0080\u0083\u0083\u0085\u0086\u0089"+
		"\u0089\u008c\u008c\u008e\u0090\u0092\u0092\u0094\u0094\u0096\u0096\u0099"+
		"\u009b\u009f\u009f\u00a1\u00a1\u00a6\u00a6\u00aa\u00aa\u00af\u00b0\u00b3"+
		"\u00b3\u00bb\u00be\u00c0\u00c0\u00c7\u00cc\u00ce\u00ce\u00d1\u00d3\u00d5"+
		"\u00d5\u00d7\u00d7\u00d9\u00da\u00dc\u00dd\u00e3\u00e3\u00e7\u00e8\u00eb"+
		"\u00eb\u00ef\u00f1\u00f5\u00f7\u00f9\u00f9\u00fc\u00ff\u0102\u0103\u0107"+
		"\u010a\u010f\u010f\u0113\u0113\u0117\u0118\u011b\u011b\u011d\u011d\u0120"+
		"\u0120\u0123\u0124\u0126\u0126\u0128\u0130\u013c\u0153\5\2\5\5\36\36\u0155"+
		"\u0156\4\2\33\33\u0157\u0157\6\2\20\20\34\34**,,\4\2\4\4\6\6\3\2\u0169"+
		"\u016e\3\2\"#\5\2\t\t\u0157\u0158\u0160\u0161\4\2\u0142\u0149\u014b\u0153"+
		"\4\2RR\u00d4\u00d4\3\2\u0104\u0105\5\2ee\u00b1\u00b1\u010c\u010c\4\2\7"+
		"\7\f\f\3\2\u0128\u013b\3\2kl\5\2<<\u008a\u008a\u009a\u009a\5\2<<\u0086"+
		"\u0086\u00bc\u00bc\4\2\u0100\u0100\u011c\u011c\4\2==\u0112\u0112\4\2\u009e"+
		"\u009e\u00f2\u00f2\4\2ff\u00a1\u00a1\6\2<<}}\u00a8\u00a8\u0125\u0125\3"+
		"\2\u0123\u0124\4\2>>@@\4\2\u0085\u0085\u00a6\u00a6\6\2<<\u0093\u0093\u00c0"+
		"\u00c0\u00ed\u00ed\4\2..\u0120\u0120\4\2FF\u0080\u0080\5\2HH\u0099\u0099"+
		"\u00b0\u00b0\4\2<<\u0181\u0181\7\2<<vw\u008a\u008a\u009a\u009a\u00d7\u00d7"+
		"\4\2\63\63UU\5\2XX\u009e\u009e\u00f2\u00f2\3\2\u00c2\u00c3\4\2\u009f\u009f"+
		"\u00eb\u00eb\5\2CCTT\u00d0\u00d0\2\u0b7f\2\u0198\3\2\2\2\4\u019d\3\2\2"+
		"\2\6\u01af\3\2\2\2\b\u01b5\3\2\2\2\n\u01c1\3\2\2\2\f\u01c5\3\2\2\2\16"+
		"\u01d1\3\2\2\2\20\u01d9\3\2\2\2\22\u01de\3\2\2\2\24\u01e2\3\2\2\2\26\u01f8"+
		"\3\2\2\2\30\u01fc\3\2\2\2\32\u01fe\3\2\2\2\34\u0208\3\2\2\2\36\u0210\3"+
		"\2\2\2 \u0224\3\2\2\2\"\u0226\3\2\2\2$\u0235\3\2\2\2&\u0239\3\2\2\2(\u0245"+
		"\3\2\2\2*\u024c\3\2\2\2,\u0257\3\2\2\2.\u027c\3\2\2\2\60\u027e\3\2\2\2"+
		"\62\u0282\3\2\2\2\64\u0296\3\2\2\2\66\u029a\3\2\2\28\u029c\3\2\2\2:\u029e"+
		"\3\2\2\2<\u02a1\3\2\2\2>\u02a4\3\2\2\2@\u02b2\3\2\2\2B\u02c2\3\2\2\2D"+
		"\u02dd\3\2\2\2F\u02df\3\2\2\2H\u02eb\3\2\2\2J\u02f3\3\2\2\2L\u0325\3\2"+
		"\2\2N\u032b\3\2\2\2P\u032d\3\2\2\2R\u0330\3\2\2\2T\u033e\3\2\2\2V\u0341"+
		"\3\2\2\2X\u034f\3\2\2\2Z\u0351\3\2\2\2\\\u035a\3\2\2\2^\u0360\3\2\2\2"+
		"`\u0364\3\2\2\2b\u036d\3\2\2\2d\u0370\3\2\2\2f\u0376\3\2\2\2h\u037f\3"+
		"\2\2\2j\u0382\3\2\2\2l\u0389\3\2\2\2n\u038f\3\2\2\2p\u0391\3\2\2\2r\u0393"+
		"\3\2\2\2t\u0395\3\2\2\2v\u0399\3\2\2\2x\u039d\3\2\2\2z\u03a7\3\2\2\2|"+
		"\u03ac\3\2\2\2~\u03b3\3\2\2\2\u0080\u03b7\3\2\2\2\u0082\u03c2\3\2\2\2"+
		"\u0084\u03cd\3\2\2\2\u0086\u03db\3\2\2\2\u0088\u03dd\3\2\2\2\u008a\u03df"+
		"\3\2\2\2\u008c\u03f9\3\2\2\2\u008e\u0432\3\2\2\2\u0090\u0434\3\2\2\2\u0092"+
		"\u0488\3\2\2\2\u0094\u049b\3\2\2\2\u0096\u049d\3\2\2\2\u0098\u04b1\3\2"+
		"\2\2\u009a\u04b3\3\2\2\2\u009c\u04b5\3\2\2\2\u009e\u04be\3\2\2\2\u00a0"+
		"\u04c9\3\2\2\2\u00a2\u04d3\3\2\2\2\u00a4\u04e4\3\2\2\2\u00a6\u04e6\3\2"+
		"\2\2\u00a8\u04e8\3\2\2\2\u00aa\u04f7\3\2\2\2\u00ac\u04f9\3\2\2\2\u00ae"+
		"\u0512\3\2\2\2\u00b0\u051f\3\2\2\2\u00b2\u0534\3\2\2\2\u00b4\u0536\3\2"+
		"\2\2\u00b6\u053d\3\2\2\2\u00b8\u0548\3\2\2\2\u00ba\u054f\3\2\2\2\u00bc"+
		"\u055f\3\2\2\2\u00be\u0567\3\2\2\2\u00c0\u0573\3\2\2\2\u00c2\u0581\3\2"+
		"\2\2\u00c4\u0588\3\2\2\2\u00c6\u059e\3\2\2\2\u00c8\u05a0\3\2\2\2\u00ca"+
		"\u05b8\3\2\2\2\u00cc\u05ba\3\2\2\2\u00ce\u05c8\3\2\2\2\u00d0\u05cd\3\2"+
		"\2\2\u00d2\u05d0\3\2\2\2\u00d4\u05d4\3\2\2\2\u00d6\u05d6\3\2\2\2\u00d8"+
		"\u05e3\3\2\2\2\u00da\u0609\3\2\2\2\u00dc\u060b\3\2\2\2\u00de\u060f\3\2"+
		"\2\2\u00e0\u0622\3\2\2\2\u00e2\u0624\3\2\2\2\u00e4\u062c\3\2\2\2\u00e6"+
		"\u0631\3\2\2\2\u00e8\u0639\3\2\2\2\u00ea\u064b\3\2\2\2\u00ec\u0657\3\2"+
		"\2\2\u00ee\u0659\3\2\2\2\u00f0\u0674\3\2\2\2\u00f2\u067e\3\2\2\2\u00f4"+
		"\u068e\3\2\2\2\u00f6\u0690\3\2\2\2\u00f8\u06ab\3\2\2\2\u00fa\u06ae\3\2"+
		"\2\2\u00fc\u06c0\3\2\2\2\u00fe\u06c3\3\2\2\2\u0100\u06d5\3\2\2\2\u0102"+
		"\u06e7\3\2\2\2\u0104\u06ed\3\2\2\2\u0106\u06f4\3\2\2\2\u0108\u0700\3\2"+
		"\2\2\u010a\u0704\3\2\2\2\u010c\u0715\3\2\2\2\u010e\u0721\3\2\2\2\u0110"+
		"\u0732\3\2\2\2\u0112\u0734\3\2\2\2\u0114\u073a\3\2\2\2\u0116\u07ea\3\2"+
		"\2\2\u0118\u07ec\3\2\2\2\u011a\u0877\3\2\2\2\u011c\u0879\3\2\2\2\u011e"+
		"\u0891\3\2\2\2\u0120\u0893\3\2\2\2\u0122\u0896\3\2\2\2\u0124\u0899\3\2"+
		"\2\2\u0126\u08a2\3\2\2\2\u0128\u08a8\3\2\2\2\u012a\u08ac\3\2\2\2\u012c"+
		"\u08af\3\2\2\2\u012e\u08b7\3\2\2\2\u0130\u08bd\3\2\2\2\u0132\u08c3\3\2"+
		"\2\2\u0134\u08c9\3\2\2\2\u0136\u08cb\3\2\2\2\u0138\u08d6\3\2\2\2\u013a"+
		"\u0900\3\2\2\2\u013c\u0902\3\2\2\2\u013e\u0932\3\2\2\2\u0140\u0934\3\2"+
		"\2\2\u0142\u093c\3\2\2\2\u0144\u094d\3\2\2\2\u0146\u0953\3\2\2\2\u0148"+
		"\u095f\3\2\2\2\u014a\u0968\3\2\2\2\u014c\u096e\3\2\2\2\u014e\u0973\3\2"+
		"\2\2\u0150\u0978\3\2\2\2\u0152\u097a\3\2\2\2\u0154\u097c\3\2\2\2\u0156"+
		"\u097e\3\2\2\2\u0158\u0980\3\2\2\2\u015a\u0986\3\2\2\2\u015c\u098d\3\2"+
		"\2\2\u015e\u0990\3\2\2\2\u0160\u0994\3\2\2\2\u0162\u0996\3\2\2\2\u0164"+
		"\u099e\3\2\2\2\u0166\u09e9\3\2\2\2\u0168\u09ec\3\2\2\2\u016a\u09f0\3\2"+
		"\2\2\u016c\u09f9\3\2\2\2\u016e\u09fb\3\2\2\2\u0170\u09fe\3\2\2\2\u0172"+
		"\u0a01\3\2\2\2\u0174\u0a04\3\2\2\2\u0176\u0a07\3\2\2\2\u0178\u0a0a\3\2"+
		"\2\2\u017a\u0a0d\3\2\2\2\u017c\u0a13\3\2\2\2\u017e\u0199\5$\23\2\u017f"+
		"\u0199\5\4\3\2\u0180\u0199\5\16\b\2\u0181\u0199\5\32\16\2\u0182\u0199"+
		"\5\u00e8u\2\u0183\u0199\5\u0112\u008a\2\u0184\u0199\5\u0142\u00a2\2\u0185"+
		"\u0199\5\u0144\u00a3\2\u0186\u0199\5\u0146\u00a4\2\u0187\u0199\5\u0148"+
		"\u00a5\2\u0188\u0199\5\u014a\u00a6\2\u0189\u0199\5\u0150\u00a9\2\u018a"+
		"\u0199\5\u014c\u00a7\2\u018b\u0199\5\u0152\u00aa\2\u018c\u0199\5\u0154"+
		"\u00ab\2\u018d\u0199\5\u0156\u00ac\2\u018e\u0199\5\u0158\u00ad\2\u018f"+
		"\u0199\5\u015a\u00ae\2\u0190\u0199\5\u016e\u00b8\2\u0191\u0199\5\u0170"+
		"\u00b9\2\u0192\u0199\5\u0172\u00ba\2\u0193\u0199\5\u0174\u00bb\2\u0194"+
		"\u0199\5\u0176\u00bc\2\u0195\u0199\5\u0178\u00bd\2\u0196\u0199\5\u017a"+
		"\u00be\2\u0197\u0199\5\u017c\u00bf\2\u0198\u017e\3\2\2\2\u0198\u017f\3"+
		"\2\2\2\u0198\u0180\3\2\2\2\u0198\u0181\3\2\2\2\u0198\u0182\3\2\2\2\u0198"+
		"\u0183\3\2\2\2\u0198\u0184\3\2\2\2\u0198\u0185\3\2\2\2\u0198\u0186\3\2"+
		"\2\2\u0198\u0187\3\2\2\2\u0198\u0188\3\2\2\2\u0198\u0189\3\2\2\2\u0198"+
		"\u018a\3\2\2\2\u0198\u018b\3\2\2\2\u0198\u018c\3\2\2\2\u0198\u018d\3\2"+
		"\2\2\u0198\u018e\3\2\2\2\u0198\u018f\3\2\2\2\u0198\u0190\3\2\2\2\u0198"+
		"\u0191\3\2\2\2\u0198\u0192\3\2\2\2\u0198\u0193\3\2\2\2\u0198\u0194\3\2"+
		"\2\2\u0198\u0195\3\2\2\2\u0198\u0196\3\2\2\2\u0198\u0197\3\2\2\2\u0199"+
		"\u019b\3\2\2\2\u019a\u019c\7\u017c\2\2\u019b\u019a\3\2\2\2\u019b\u019c"+
		"\3\2\2\2\u019c\3\3\2\2\2\u019d\u019e\7\u00a9\2\2\u019e\u01a0\5\6\4\2\u019f"+
		"\u01a1\7\u00ac\2\2\u01a0\u019f\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\u01a2"+
		"\3\2\2\2\u01a2\u01a4\5|?\2\u01a3\u01a5\5F$\2\u01a4\u01a3\3\2\2\2\u01a4"+
		"\u01a5\3\2\2\2\u01a5\u01a9\3\2\2\2\u01a6\u01aa\5\b\5\2\u01a7\u01aa\5\24"+
		"\13\2\u01a8\u01aa\5\n\6\2\u01a9\u01a6\3\2\2\2\u01a9\u01a7\3\2\2\2\u01a9"+
		"\u01a8\3\2\2\2\u01aa\u01ac\3\2\2\2\u01ab\u01ad\5\f\7\2\u01ac\u01ab\3\2"+
		"\2\2\u01ac\u01ad\3\2\2\2\u01ad\5\3\2\2\2\u01ae\u01b0\t\2\2\2\u01af\u01ae"+
		"\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0\u01b2\3\2\2\2\u01b1\u01b3\7\u00a5\2"+
		"\2\u01b2\u01b1\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3\7\3\2\2\2\u01b4\u01b6"+
		"\5\u0080A\2\u01b5\u01b4\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6\u01b7\3\2\2"+
		"\2\u01b7\u01b8\t\3\2\2\u01b8\u01bd\5\26\f\2\u01b9\u01ba\7\u0176\2\2\u01ba"+
		"\u01bc\5\26\f\2\u01bb\u01b9\3\2\2\2\u01bc\u01bf\3\2\2\2\u01bd\u01bb\3"+
		"\2\2\2\u01bd\u01be\3\2\2\2\u01be\t\3\2\2\2\u01bf\u01bd\3\2\2\2\u01c0\u01c2"+
		"\5\u0080A\2\u01c1\u01c0\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2\u01c3\3\2\2"+
		"\2\u01c3\u01c4\5$\23\2\u01c4\13\3\2\2\2\u01c5\u01c6\7I\2\2\u01c6\u01c7"+
		"\7\u0089\2\2\u01c7\u01c8\7\26\2\2\u01c8\u01c9\7\u0112\2\2\u01c9\u01ce"+
		"\5\22\n\2\u01ca\u01cb\7\u0176\2\2\u01cb\u01cd\5\22\n\2\u01cc\u01ca\3\2"+
		"\2\2\u01cd\u01d0\3\2\2\2\u01ce\u01cc\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf"+
		"\r\3\2\2\2\u01d0\u01ce\3\2\2\2\u01d1\u01d2\7\u0112\2\2\u01d2\u01d3\5\20"+
		"\t\2\u01d3\u01d4\5> \2\u01d4\u01d6\5\24\13\2\u01d5\u01d7\5P)\2\u01d6\u01d5"+
		"\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7\17\3\2\2\2\u01d8\u01da\7\u00b8\2\2"+
		"\u01d9\u01d8\3\2\2\2\u01d9\u01da\3\2\2\2\u01da\u01dc\3\2\2\2\u01db\u01dd"+
		"\7\u00a5\2\2\u01dc\u01db\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd\21\3\2\2\2"+
		"\u01de\u01df\5~@\2\u01df\u01e0\7\u0169\2\2\u01e0\u01e1\5\30\r\2\u01e1"+
		"\23\3\2\2\2\u01e2\u01e3\7&\2\2\u01e3\u01e8\5\22\n\2\u01e4\u01e5\7\u0176"+
		"\2\2\u01e5\u01e7\5\22\n\2\u01e6\u01e4\3\2\2\2\u01e7\u01ea\3\2\2\2\u01e8"+
		"\u01e6\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9\25\3\2\2\2\u01ea\u01e8\3\2\2"+
		"\2\u01eb\u01ec\7\u0170\2\2\u01ec\u01f1\5\30\r\2\u01ed\u01ee\7\u0176\2"+
		"\2\u01ee\u01f0\5\30\r\2\u01ef\u01ed\3\2\2\2\u01f0\u01f3\3\2\2\2\u01f1"+
		"\u01ef\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2\u01f4\3\2\2\2\u01f3\u01f1\3\2"+
		"\2\2\u01f4\u01f5\7\u0171\2\2\u01f5\u01f9\3\2\2\2\u01f6\u01f7\7\u0170\2"+
		"\2\u01f7\u01f9\7\u0171\2\2\u01f8\u01eb\3\2\2\2\u01f8\u01f6\3\2\2\2\u01f9"+
		"\27\3\2\2\2\u01fa\u01fd\5\u0084C\2\u01fb\u01fd\7<\2\2\u01fc\u01fa\3\2"+
		"\2\2\u01fc\u01fb\3\2\2\2\u01fd\31\3\2\2\2\u01fe\u01ff\7=\2\2\u01ff\u0202"+
		"\5\34\17\2\u0200\u0203\5\36\20\2\u0201\u0203\5 \21\2\u0202\u0200\3\2\2"+
		"\2\u0202\u0201\3\2\2\2\u0203\u0205\3\2\2\2\u0204\u0206\5P)\2\u0205\u0204"+
		"\3\2\2\2\u0205\u0206\3\2\2\2\u0206\33\3\2\2\2\u0207\u0209\7\u00b8\2\2"+
		"\u0208\u0207\3\2\2\2\u0208\u0209\3\2\2\2\u0209\u020b\3\2\2\2\u020a\u020c"+
		"\7\u00d3\2\2\u020b\u020a\3\2\2\2\u020b\u020c\3\2\2\2\u020c\u020e\3\2\2"+
		"\2\u020d\u020f\7\u00a5\2\2\u020e\u020d\3\2\2\2\u020e\u020f\3\2\2\2\u020f"+
		"\35\3\2\2\2\u0210\u0211\7\21\2\2\u0211\u0216\5|?\2\u0212\u0214\7\63\2"+
		"\2\u0213\u0212\3\2\2\2\u0213\u0214\3\2\2\2\u0214\u0215\3\2\2\2\u0215\u0217"+
		"\5\66\34\2\u0216\u0213\3\2\2\2\u0216\u0217\3\2\2\2\u0217\u0219\3\2\2\2"+
		"\u0218\u021a\5F$\2\u0219\u0218\3\2\2\2\u0219\u021a\3\2\2\2\u021a\37\3"+
		"\2\2\2\u021b\u021c\5\"\22\2\u021c\u021d\7\21\2\2\u021d\u021e\5> \2\u021e"+
		"\u0225\3\2\2\2\u021f\u0220\7\21\2\2\u0220\u0221\5\"\22\2\u0221\u0222\7"+
		"\u0116\2\2\u0222\u0223\5> \2\u0223\u0225\3\2\2\2\u0224\u021b\3\2\2\2\u0224"+
		"\u021f\3\2\2\2\u0225!\3\2\2\2\u0226\u0228\5|?\2\u0227\u0229\7\u0166\2"+
		"\2\u0228\u0227\3\2\2\2\u0228\u0229\3\2\2\2\u0229\u0231\3\2\2\2\u022a\u022b"+
		"\7\u0176\2\2\u022b\u022d\5|?\2\u022c\u022e\7\u0166\2\2\u022d\u022c\3\2"+
		"\2\2\u022d\u022e\3\2\2\2\u022e\u0230\3\2\2\2\u022f\u022a\3\2\2\2\u0230"+
		"\u0233\3\2\2\2\u0231\u022f\3\2\2\2\u0231\u0232\3\2\2\2\u0232#\3\2\2\2"+
		"\u0233\u0231\3\2\2\2\u0234\u0236\5&\24\2\u0235\u0234\3\2\2\2\u0235\u0236"+
		"\3\2\2\2\u0236\u0237\3\2\2\2\u0237\u0238\5*\26\2\u0238%\3\2\2\2\u0239"+
		"\u023b\7.\2\2\u023a\u023c\7\u00d6\2\2\u023b\u023a\3\2\2\2\u023b\u023c"+
		"\3\2\2\2\u023c\u023d\3\2\2\2\u023d\u0242\5(\25\2\u023e\u023f\7\u0176\2"+
		"\2\u023f\u0241\5(\25\2\u0240\u023e\3\2\2\2\u0241\u0244\3\2\2\2\u0242\u0240"+
		"\3\2\2\2\u0242\u0243\3\2\2\2\u0243\'\3\2\2\2\u0244\u0242\3\2\2\2\u0245"+
		"\u0247\5\u00e4s\2\u0246\u0248\5\u0080A\2\u0247\u0246\3\2\2\2\u0247\u0248"+
		"\3\2\2\2\u0248\u0249\3\2\2\2\u0249\u024a\7\63\2\2\u024a\u024b\5^\60\2"+
		"\u024b)\3\2\2\2\u024c\u0254\5,\27\2\u024d\u024f\7+\2\2\u024e\u0250\t\4"+
		"\2\2\u024f\u024e\3\2\2\2\u024f\u0250\3\2\2\2\u0250\u0251\3\2\2\2\u0251"+
		"\u0253\5,\27\2\u0252\u024d\3\2\2\2\u0253\u0256\3\2\2\2\u0254\u0252\3\2"+
		"\2\2\u0254\u0255\3\2\2\2\u0255+\3\2\2\2\u0256\u0254\3\2\2\2\u0257\u025b"+
		"\7\u00e9\2\2\u0258\u025a\5.\30\2\u0259\u0258\3\2\2\2\u025a\u025d\3\2\2"+
		"\2\u025b\u0259\3\2\2\2\u025b\u025c\3\2\2\2\u025c\u025e\3\2\2\2\u025d\u025b"+
		"\3\2\2\2\u025e\u0260\5\62\32\2\u025f\u0261\5<\37\2\u0260\u025f\3\2\2\2"+
		"\u0260\u0261\3\2\2\2\u0261\u0263\3\2\2\2\u0262\u0264\5P)\2\u0263\u0262"+
		"\3\2\2\2\u0263\u0264\3\2\2\2\u0264\u0266\3\2\2\2\u0265\u0267\5R*\2\u0266"+
		"\u0265\3\2\2\2\u0266\u0267\3\2\2\2\u0267\u0269\3\2\2\2\u0268\u026a\5T"+
		"+\2\u0269\u0268\3\2\2\2\u0269\u026a\3\2\2\2\u026a\u026c\3\2\2\2\u026b"+
		"\u026d\5Z.\2\u026c\u026b\3\2\2\2\u026c\u026d\3\2\2\2\u026d\u026f\3\2\2"+
		"\2\u026e\u0270\5\u00d6l\2\u026f\u026e\3\2\2\2\u026f\u0270\3\2\2\2\u0270"+
		"\u0272\3\2\2\2\u0271\u0273\5V,\2\u0272\u0271\3\2\2\2\u0272\u0273\3\2\2"+
		"\2\u0273-\3\2\2\2\u0274\u027d\5\60\31\2\u0275\u027d\7\u00a2\2\2\u0276"+
		"\u027d\7\u0101\2\2\u0277\u027d\7\u00fa\2\2\u0278\u027d\7\u00f5\2\2\u0279"+
		"\u027d\7\u00f6\2\2\u027a\u027d\t\5\2\2\u027b\u027d\7\u00f8\2\2\u027c\u0274"+
		"\3\2\2\2\u027c\u0275\3\2\2\2\u027c\u0276\3\2\2\2\u027c\u0277\3\2\2\2\u027c"+
		"\u0278\3\2\2\2\u027c\u0279\3\2\2\2\u027c\u027a\3\2\2\2\u027c\u027b\3\2"+
		"\2\2\u027d/\3\2\2\2\u027e\u027f\t\6\2\2\u027f\61\3\2\2\2\u0280\u0283\5"+
		"8\35\2\u0281\u0283\5\64\33\2\u0282\u0280\3\2\2\2\u0282\u0281\3\2\2\2\u0283"+
		"\u0288\3\2\2\2\u0284\u0285\7\u0176\2\2\u0285\u0287\5\64\33\2\u0286\u0284"+
		"\3\2\2\2\u0287\u028a\3\2\2\2\u0288\u0286\3\2\2\2\u0288\u0289\3\2\2\2\u0289"+
		"\63\3\2\2\2\u028a\u0288\3\2\2\2\u028b\u028e\5~@\2\u028c\u028e\5\u0084"+
		"C\2\u028d\u028b\3\2\2\2\u028d\u028c\3\2\2\2\u028e\u0293\3\2\2\2\u028f"+
		"\u0291\7\63\2\2\u0290\u028f\3\2\2\2\u0290\u0291\3\2\2\2\u0291\u0292\3"+
		"\2\2\2\u0292\u0294\5\66\34\2\u0293\u0290\3\2\2\2\u0293\u0294\3\2\2\2\u0294"+
		"\u0297\3\2\2\2\u0295\u0297\5:\36\2\u0296\u028d\3\2\2\2\u0296\u0295\3\2"+
		"\2\2\u0297\65\3\2\2\2\u0298\u029b\5v<\2\u0299\u029b\7\u0180\2\2\u029a"+
		"\u0298\3\2\2\2\u029a\u0299\3\2\2\2\u029b\67\3\2\2\2\u029c\u029d\7\u0162"+
		"\2\2\u029d9\3\2\2\2\u029e\u029f\5v<\2\u029f\u02a0\7\u0166\2\2\u02a0;\3"+
		"\2\2\2\u02a1\u02a2\7\21\2\2\u02a2\u02a3\5> \2\u02a3=\3\2\2\2\u02a4\u02a9"+
		"\5@!\2\u02a5\u02a6\7\u0176\2\2\u02a6\u02a8\5@!\2\u02a7\u02a5\3\2\2\2\u02a8"+
		"\u02ab\3\2\2\2\u02a9\u02a7\3\2\2\2\u02a9\u02aa\3\2\2\2\u02aa?\3\2\2\2"+
		"\u02ab\u02a9\3\2\2\2\u02ac\u02b3\5B\"\2\u02ad\u02ae\7\u0172\2\2\u02ae"+
		"\u02af\7\u0127\2\2\u02af\u02b0\5B\"\2\u02b0\u02b1\7\u0173\2\2\u02b1\u02b3"+
		"\3\2\2\2\u02b2\u02ac\3\2\2\2\u02b2\u02ad\3\2\2\2\u02b3A\3\2\2\2\u02b4"+
		"\u02b5\5D#\2\u02b5\u02b6\5L\'\2\u02b6\u02b8\3\2\2\2\u02b7\u02b4\3\2\2"+
		"\2\u02b8\u02b9\3\2\2\2\u02b9\u02b7\3\2\2\2\u02b9\u02ba\3\2\2\2\u02ba\u02c3"+
		"\3\2\2\2\u02bb\u02bf\5D#\2\u02bc\u02be\5L\'\2\u02bd\u02bc\3\2\2\2\u02be"+
		"\u02c1\3\2\2\2\u02bf\u02bd\3\2\2\2\u02bf\u02c0\3\2\2\2\u02c0\u02c3\3\2"+
		"\2\2\u02c1\u02bf\3\2\2\2\u02c2\u02b7\3\2\2\2\u02c2\u02bb\3\2\2\2\u02c3"+
		"C\3\2\2\2\u02c4\u02c6\5|?\2\u02c5\u02c7\5F$\2\u02c6\u02c5\3\2\2\2\u02c6"+
		"\u02c7\3\2\2\2\u02c7\u02cc\3\2\2\2\u02c8\u02ca\7\63\2\2\u02c9\u02c8\3"+
		"\2\2\2\u02c9\u02ca\3\2\2\2\u02ca\u02cb\3\2\2\2\u02cb\u02cd\5\66\34\2\u02cc"+
		"\u02c9\3\2\2\2\u02cc\u02cd\3\2\2\2\u02cd\u02cf\3\2\2\2\u02ce\u02d0\5H"+
		"%\2\u02cf\u02ce\3\2\2\2\u02cf\u02d0\3\2\2\2\u02d0\u02de\3\2\2\2\u02d1"+
		"\u02d3\5^\60\2\u02d2\u02d4\7\63\2\2\u02d3\u02d2\3\2\2\2\u02d3\u02d4\3"+
		"\2\2\2\u02d4\u02d5\3\2\2\2\u02d5\u02d7\5\66\34\2\u02d6\u02d8\5\u0080A"+
		"\2\u02d7\u02d6\3\2\2\2\u02d7\u02d8\3\2\2\2\u02d8\u02de\3\2\2\2\u02d9\u02da"+
		"\7\u0170\2\2\u02da\u02db\5> \2\u02db\u02dc\7\u0171\2\2\u02dc\u02de\3\2"+
		"\2\2\u02dd\u02c4\3\2\2\2\u02dd\u02d1\3\2\2\2\u02dd\u02d9\3\2\2\2\u02de"+
		"E\3\2\2\2\u02df\u02e0\7 \2\2\u02e0\u02e1\7\u0170\2\2\u02e1\u02e6\5v<\2"+
		"\u02e2\u02e3\7\u0176\2\2\u02e3\u02e5\5v<\2\u02e4\u02e2\3\2\2\2\u02e5\u02e8"+
		"\3\2\2\2\u02e6\u02e4\3\2\2\2\u02e6\u02e7\3\2\2\2\u02e7\u02e9\3\2\2\2\u02e8"+
		"\u02e6\3\2\2\2\u02e9\u02ea\7\u0171\2\2\u02eaG\3\2\2\2\u02eb\u02f0\5J&"+
		"\2\u02ec\u02ed\7\u0176\2\2\u02ed\u02ef\5J&\2\u02ee\u02ec\3\2\2\2\u02ef"+
		"\u02f2\3\2\2\2\u02f0\u02ee\3\2\2\2\u02f0\u02f1\3\2\2\2\u02f1I\3\2\2\2"+
		"\u02f2\u02f0\3\2\2\2\u02f3\u02f4\t\7\2\2\u02f4\u02fd\t\b\2\2\u02f5\u02fb"+
		"\7A\2\2\u02f6\u02fc\7\u00ad\2\2\u02f7\u02f8\7\37\2\2\u02f8\u02fc\7\n\2"+
		"\2\u02f9\u02fa\7\22\2\2\u02fa\u02fc\7\n\2\2\u02fb\u02f6\3\2\2\2\u02fb"+
		"\u02f7\3\2\2\2\u02fb\u02f9\3\2\2\2\u02fc\u02fe\3\2\2\2\u02fd\u02f5\3\2"+
		"\2\2\u02fd\u02fe\3\2\2\2\u02fe\u02ff\3\2\2\2\u02ff\u0300\7\u0170\2\2\u0300"+
		"\u0305\5\u0082B\2\u0301\u0302\7\u0176\2\2\u0302\u0304\5\u0082B\2\u0303"+
		"\u0301\3\2\2\2\u0304\u0307\3\2\2\2\u0305\u0303\3\2\2\2\u0305\u0306\3\2"+
		"\2\2\u0306\u0308\3\2\2\2\u0307\u0305\3\2\2\2\u0308\u0309\7\u0171\2\2\u0309"+
		"K\3\2\2\2\u030a\u030c\t\t\2\2\u030b\u030a\3\2\2\2\u030b\u030c\3\2\2\2"+
		"\u030c\u030d\3\2\2\2\u030d\u0310\7\u00ad\2\2\u030e\u0310\7\u0101\2\2\u030f"+
		"\u030b\3\2\2\2\u030f\u030e\3\2\2\2\u0310\u0311\3\2\2\2\u0311\u0313\5D"+
		"#\2\u0312\u0314\5N(\2\u0313\u0312\3\2\2\2\u0313\u0314\3\2\2\2\u0314\u0326"+
		"\3\2\2\2\u0315\u0317\t\n\2\2\u0316\u0318\7\u00c5\2\2\u0317\u0316\3\2\2"+
		"\2\u0317\u0318\3\2\2\2\u0318\u0319\3\2\2\2\u0319\u031a\7\u00ad\2\2\u031a"+
		"\u031b\5D#\2\u031b\u031c\5N(\2\u031c\u0326\3\2\2\2\u031d\u0321\7\u00bf"+
		"\2\2\u031e\u0322\7\u00a7\2\2\u031f\u0320\t\n\2\2\u0320\u0322\7\u00c5\2"+
		"\2\u0321\u031e\3\2\2\2\u0321\u031f\3\2\2\2\u0321\u0322\3\2\2\2\u0322\u0323"+
		"\3\2\2\2\u0323\u0324\7\u00ad\2\2\u0324\u0326\5D#\2\u0325\u030f\3\2\2\2"+
		"\u0325\u0315\3\2\2\2\u0325\u031d\3\2\2\2\u0326M\3\2\2\2\u0327\u0328\7"+
		"I\2\2\u0328\u032c\5\u0084C\2\u0329\u032a\7\u0116\2\2\u032a\u032c\5\u0080"+
		"A\2\u032b\u0327\3\2\2\2\u032b\u0329\3\2\2\2\u032cO\3\2\2\2\u032d\u032e"+
		"\7-\2\2\u032e\u032f\5\u0084C\2\u032fQ\3\2\2\2\u0330\u0331\7\22\2\2\u0331"+
		"\u0332\7\n\2\2\u0332\u0337\5\u00d8m\2\u0333\u0334\7\u0176\2\2\u0334\u0336"+
		"\5\u00d8m\2\u0335\u0333\3\2\2\2\u0336\u0339\3\2\2\2\u0337\u0335\3\2\2"+
		"\2\u0337\u0338\3\2\2\2\u0338\u033c\3\2\2\2\u0339\u0337\3\2\2\2\u033a\u033b"+
		"\7.\2\2\u033b\u033d\7$\2\2\u033c\u033a\3\2\2\2\u033c\u033d\3\2\2\2\u033d"+
		"S\3\2\2\2\u033e\u033f\7\23\2\2\u033f\u0340\5\u0084C\2\u0340U\3\2\2\2\u0341"+
		"\u034b\7\30\2\2\u0342\u0345\5X-\2\u0343\u0344\7\u0176\2\2\u0344\u0346"+
		"\5X-\2\u0345\u0343\3\2\2\2\u0345\u0346\3\2\2\2\u0346\u034c\3\2\2\2\u0347"+
		"\u0348\5X-\2\u0348\u0349\7\35\2\2\u0349\u034a\5X-\2\u034a\u034c\3\2\2"+
		"\2\u034b\u0342\3\2\2\2\u034b\u0347\3\2\2\2\u034cW\3\2\2\2\u034d\u0350"+
		"\5f\64\2\u034e\u0350\5`\61\2\u034f\u034d\3\2\2\2\u034f\u034e\3\2\2\2\u0350"+
		"Y\3\2\2\2\u0351\u0352\7\u011f\2\2\u0352\u0357\5\\/\2\u0353\u0354\7\u0176"+
		"\2\2\u0354\u0356\5\\/\2\u0355\u0353\3\2\2\2\u0356\u0359\3\2\2\2\u0357"+
		"\u0355\3\2\2\2\u0357\u0358\3\2\2\2\u0358[\3\2\2\2\u0359\u0357\3\2\2\2"+
		"\u035a\u035b\5\u00e4s\2\u035b\u035c\7\63\2\2\u035c\u035d\7\u0170\2\2\u035d"+
		"\u035e\5\u009eP\2\u035e\u035f\7\u0171\2\2\u035f]\3\2\2\2\u0360\u0361\7"+
		"\u0170\2\2\u0361\u0362\5*\26\2\u0362\u0363\7\u0171\2\2\u0363_\3\2\2\2"+
		"\u0364\u0365\7\u017a\2\2\u0365a\3\2\2\2\u0366\u036e\5d\63\2\u0367\u036e"+
		"\5f\64\2\u0368\u036e\5h\65\2\u0369\u036e\5j\66\2\u036a\u036e\5l\67\2\u036b"+
		"\u036e\5n8\2\u036c\u036e\5p9\2\u036d\u0366\3\2\2\2\u036d\u0367\3\2\2\2"+
		"\u036d\u0368\3\2\2\2\u036d\u0369\3\2\2\2\u036d\u036a\3\2\2\2\u036d\u036b"+
		"\3\2\2\2\u036d\u036c\3\2\2\2\u036ec\3\2\2\2\u036f\u0371\5r:\2\u0370\u036f"+
		"\3\2\2\2\u0370\u0371\3\2\2\2\u0371\u0372\3\2\2\2\u0372\u0374\7\u0180\2"+
		"\2\u0373\u0375\5t;\2\u0374\u0373\3\2\2\2\u0374\u0375\3\2\2\2\u0375e\3"+
		"\2\2\2\u0376\u0377\7\u0181\2\2\u0377g\3\2\2\2\u0378\u0379\t\13\2\2\u0379"+
		"\u0380\7\u0180\2\2\u037a\u037b\7\u0172\2\2\u037b\u037c\5v<\2\u037c\u037d"+
		"\7\u0180\2\2\u037d\u037e\7\u0173\2\2\u037e\u0380\3\2\2\2\u037f\u0378\3"+
		"\2\2\2\u037f\u037a\3\2\2\2\u0380i\3\2\2\2\u0381\u0383\5r:\2\u0382\u0381"+
		"\3\2\2\2\u0382\u0383\3\2\2\2\u0383\u0384\3\2\2\2\u0384\u0386\7\u0182\2"+
		"\2\u0385\u0387\5t;\2\u0386\u0385\3\2\2\2\u0386\u0387\3\2\2\2\u0387k\3"+
		"\2\2\2\u0388\u038a\5r:\2\u0389\u0388\3\2\2\2\u0389\u038a\3\2\2\2\u038a"+
		"\u038b\3\2\2\2\u038b\u038d\7\u0183\2\2\u038c\u038e\5t;\2\u038d\u038c\3"+
		"\2\2\2\u038d\u038e\3\2\2\2\u038em\3\2\2\2\u038f\u0390\t\f\2\2\u0390o\3"+
		"\2\2\2\u0391\u0392\7\34\2\2\u0392q\3\2\2\2\u0393\u0394\7\u017f\2\2\u0394"+
		"s\3\2\2\2\u0395\u0396\7\u017f\2\2\u0396u\3\2\2\2\u0397\u039a\7\u017f\2"+
		"\2\u0398\u039a\5z>\2\u0399\u0397\3\2\2\2\u0399\u0398\3\2\2\2\u039aw\3"+
		"\2\2\2\u039b\u039c\7\u017b\2\2\u039c\u039e\7\u017b\2\2\u039d\u039b\3\2"+
		"\2\2\u039d\u039e\3\2\2\2\u039e\u03a0\3\2\2\2\u039f\u03a1\t\r\2\2\u03a0"+
		"\u039f\3\2\2\2\u03a0\u03a1\3\2\2\2\u03a1\u03a3\3\2\2\2\u03a2\u03a4\7\u0165"+
		"\2\2\u03a3\u03a2\3\2\2\2\u03a3\u03a4\3\2\2\2\u03a4\u03a5\3\2\2\2\u03a5"+
		"\u03a6\5v<\2\u03a6y\3\2\2\2\u03a7\u03a8\t\16\2\2\u03a8{\3\2\2\2\u03a9"+
		"\u03aa\5v<\2\u03aa\u03ab\7\u0165\2\2\u03ab\u03ad\3\2\2\2\u03ac\u03a9\3"+
		"\2\2\2\u03ac\u03ad\3\2\2\2\u03ad\u03ae\3\2\2\2\u03ae\u03af\5v<\2\u03af"+
		"}\3\2\2\2\u03b0\u03b1\5v<\2\u03b1\u03b2\7\u0165\2\2\u03b2\u03b4\3\2\2"+
		"\2\u03b3\u03b0\3\2\2\2\u03b3\u03b4\3\2\2\2\u03b4\u03b5\3\2\2\2\u03b5\u03b6"+
		"\5v<\2\u03b6\177\3\2\2\2\u03b7\u03b8\7\u0170\2\2\u03b8\u03bd\5~@\2\u03b9"+
		"\u03ba\7\u0176\2\2\u03ba\u03bc\5~@\2\u03bb\u03b9\3\2\2\2\u03bc\u03bf\3"+
		"\2\2\2\u03bd\u03bb\3\2\2\2\u03bd\u03be\3\2\2\2\u03be\u03c0\3\2\2\2\u03bf"+
		"\u03bd\3\2\2\2\u03c0\u03c1\7\u0171\2\2\u03c1\u0081\3\2\2\2\u03c2\u03c3"+
		"\5v<\2\u03c3\u0083\3\2\2\2\u03c4\u03c5\bC\1\2\u03c5\u03c6\5\u0088E\2\u03c6"+
		"\u03c7\5\u0084C\5\u03c7\u03ce\3\2\2\2\u03c8\u03c9\7\u0170\2\2\u03c9\u03ca"+
		"\5\u0084C\2\u03ca\u03cb\7\u0171\2\2\u03cb\u03ce\3\2\2\2\u03cc\u03ce\5"+
		"\u008aF\2\u03cd\u03c4\3\2\2\2\u03cd\u03c8\3\2\2\2\u03cd\u03cc\3\2\2\2"+
		"\u03ce\u03d8\3\2\2\2\u03cf\u03d0\f\7\2\2\u03d0\u03d1\5\u0086D\2\u03d1"+
		"\u03d2\5\u0084C\b\u03d2\u03d7\3\2\2\2\u03d3\u03d4\f\6\2\2\u03d4\u03d5"+
		"\7/\2\2\u03d5\u03d7\5\u0084C\7\u03d6\u03cf\3\2\2\2\u03d6\u03d3\3\2\2\2"+
		"\u03d7\u03da\3\2\2\2\u03d8\u03d6\3\2\2\2\u03d8\u03d9\3\2\2\2\u03d9\u0085"+
		"\3\2\2\2\u03da\u03d8\3\2\2\2\u03db\u03dc\t\17\2\2\u03dc\u0087\3\2\2\2"+
		"\u03dd\u03de\t\20\2\2\u03de\u0089\3\2\2\2\u03df\u03e0\bF\1\2\u03e0\u03e1"+
		"\5\u008eH\2\u03e1\u03f6\3\2\2\2\u03e2\u03e3\f\7\2\2\u03e3\u03e5\7\25\2"+
		"\2\u03e4\u03e6\7\33\2\2\u03e5\u03e4\3\2\2\2\u03e5\u03e6\3\2\2\2\u03e6"+
		"\u03e7\3\2\2\2\u03e7\u03f5\t\21\2\2\u03e8\u03e9\f\6\2\2\u03e9\u03ea\7"+
		"\u0167\2\2\u03ea\u03f5\5\u008eH\2\u03eb\u03ec\f\5\2\2\u03ec\u03ed\5\u008c"+
		"G\2\u03ed\u03ee\5\u008eH\2\u03ee\u03f5\3\2\2\2\u03ef\u03f0\f\4\2\2\u03f0"+
		"\u03f1\5\u008cG\2\u03f1\u03f2\t\22\2\2\u03f2\u03f3\5^\60\2\u03f3\u03f5"+
		"\3\2\2\2\u03f4\u03e2\3\2\2\2\u03f4\u03e8\3\2\2\2\u03f4\u03eb\3\2\2\2\u03f4"+
		"\u03ef\3\2\2\2\u03f5\u03f8\3\2\2\2\u03f6\u03f4\3\2\2\2\u03f6\u03f7\3\2"+
		"\2\2\u03f7\u008b\3\2\2\2\u03f8\u03f6\3\2\2\2\u03f9\u03fa\t\23\2\2\u03fa"+
		"\u008d\3\2\2\2\u03fb\u03fd\5\u0090I\2\u03fc\u03fe\7\33\2\2\u03fd\u03fc"+
		"\3\2\2\2\u03fd\u03fe\3\2\2\2\u03fe\u03ff\3\2\2\2\u03ff\u0400\7\24\2\2"+
		"\u0400\u0401\5^\60\2\u0401\u0433\3\2\2\2\u0402\u0404\5\u0090I\2\u0403"+
		"\u0405\7\33\2\2\u0404\u0403\3\2\2\2\u0404\u0405\3\2\2\2\u0405\u0406\3"+
		"\2\2\2\u0406\u0407\7\24\2\2\u0407\u0408\7\u0170\2\2\u0408\u040d\5\u0084"+
		"C\2\u0409\u040a\7\u0176\2\2\u040a\u040c\5\u0084C\2\u040b\u0409\3\2\2\2"+
		"\u040c\u040f\3\2\2\2\u040d\u040b\3\2\2\2\u040d\u040e\3\2\2\2\u040e\u0410"+
		"\3\2\2\2\u040f\u040d\3\2\2\2\u0410\u0411\7\u0171\2\2\u0411\u0433\3\2\2"+
		"\2\u0412\u0414\5\u0090I\2\u0413\u0415\7\33\2\2\u0414\u0413\3\2\2\2\u0414"+
		"\u0415\3\2\2\2\u0415\u0416\3\2\2\2\u0416\u0417\7\b\2\2\u0417\u0418\5\u0090"+
		"I\2\u0418\u0419\7\5\2\2\u0419\u041a\5\u008eH\2\u041a\u0433\3\2\2\2\u041b"+
		"\u041c\5\u0090I\2\u041c\u041d\7\'\2\2\u041d\u041e\7\27\2\2\u041e\u041f"+
		"\5\u0090I\2\u041f\u0433\3\2\2\2\u0420\u0422\5\u0090I\2\u0421\u0423\7\33"+
		"\2\2\u0422\u0421\3\2\2\2\u0422\u0423\3\2\2\2\u0423\u0424\3\2\2\2\u0424"+
		"\u0425\7\27\2\2\u0425\u0428\5\u0092J\2\u0426\u0427\7\16\2\2\u0427\u0429"+
		"\5\u0092J\2\u0428\u0426\3\2\2\2\u0428\u0429\3\2\2\2\u0429\u0433\3\2\2"+
		"\2\u042a\u042c\5\u0090I\2\u042b\u042d\7\33\2\2\u042c\u042b\3\2\2\2\u042c"+
		"\u042d\3\2\2\2\u042d\u042e\3\2\2\2\u042e\u042f\t\24\2\2\u042f\u0430\5"+
		"\u0090I\2\u0430\u0433\3\2\2\2\u0431\u0433\5\u0090I\2\u0432\u03fb\3\2\2"+
		"\2\u0432\u0402\3\2\2\2\u0432\u0412\3\2\2\2\u0432\u041b\3\2\2\2\u0432\u0420"+
		"\3\2\2\2\u0432\u042a\3\2\2\2\u0432\u0431\3\2\2\2\u0433\u008f\3\2\2\2\u0434"+
		"\u0435\bI\1\2\u0435\u0436\5\u0092J\2\u0436\u0463\3\2\2\2\u0437\u0438\f"+
		"\21\2\2\u0438\u0439\7\u0159\2\2\u0439\u0462\5\u0090I\22\u043a\u043b\f"+
		"\20\2\2\u043b\u043c\7\u015a\2\2\u043c\u0462\5\u0090I\21\u043d\u043e\f"+
		"\17\2\2\u043e\u043f\7\u015b\2\2\u043f\u0462\5\u0090I\20\u0440\u0441\f"+
		"\16\2\2\u0441\u0442\7\u015c\2\2\u0442\u0462\5\u0090I\17\u0443\u0444\f"+
		"\r\2\2\u0444\u0445\7\u0160\2\2\u0445\u0462\5\u0090I\16\u0446\u0447\f\f"+
		"\2\2\u0447\u0448\7\u0161\2\2\u0448\u0462\5\u0090I\r\u0449\u044a\f\13\2"+
		"\2\u044a\u044b\7\u0162\2\2\u044b\u0462\5\u0090I\f\u044c\u044d\f\n\2\2"+
		"\u044d\u044e\7\u0163\2\2\u044e\u0462\5\u0090I\13\u044f\u0450\f\t\2\2\u0450"+
		"\u0451\7\32\2\2\u0451\u0462\5\u0090I\n\u0452\u0453\f\b\2\2\u0453\u0454"+
		"\7\31\2\2\u0454\u0462\5\u0090I\t\u0455\u0456\f\7\2\2\u0456\u0457\7\u015e"+
		"\2\2\u0457\u0462\5\u0090I\b\u0458\u0459\f\6\2\2\u0459\u045a\7\u015d\2"+
		"\2\u045a\u0462\5\u0090I\7\u045b\u045c\f\5\2\2\u045c\u045d\7\u0160\2\2"+
		"\u045d\u0462\5\u00d2j\2\u045e\u045f\f\4\2\2\u045f\u0460\7\u0161\2\2\u0460"+
		"\u0462\5\u00d2j\2\u0461\u0437\3\2\2\2\u0461\u043a\3\2\2\2\u0461\u043d"+
		"\3\2\2\2\u0461\u0440\3\2\2\2\u0461\u0443\3\2\2\2\u0461\u0446\3\2\2\2\u0461"+
		"\u0449\3\2\2\2\u0461\u044c\3\2\2\2\u0461\u044f\3\2\2\2\u0461\u0452\3\2"+
		"\2\2\u0461\u0455\3\2\2\2\u0461\u0458\3\2\2\2\u0461\u045b\3\2\2\2\u0461"+
		"\u045e\3\2\2\2\u0462\u0465\3\2\2\2\u0463\u0461\3\2\2\2\u0463\u0464\3\2"+
		"\2\2\u0464\u0091\3\2\2\2\u0465\u0463\3\2\2\2\u0466\u0467\bJ\1\2\u0467"+
		"\u0489\5\u0094K\2\u0468\u0489\5`\61\2\u0469\u0489\5b\62\2\u046a\u0489"+
		"\5~@\2\u046b\u0489\5x=\2\u046c\u046d\t\25\2\2\u046d\u0489\5\u0092J\t\u046e"+
		"\u0470\7%\2\2\u046f\u046e\3\2\2\2\u046f\u0470\3\2\2\2\u0470\u0471\3\2"+
		"\2\2\u0471\u0472\7\u0170\2\2\u0472\u0477\5\u0084C\2\u0473\u0474\7\u0176"+
		"\2\2\u0474\u0476\5\u0084C\2\u0475\u0473\3\2\2\2\u0476\u0479\3\2\2\2\u0477"+
		"\u0475\3\2\2\2\u0477\u0478\3\2\2\2\u0478\u047a\3\2\2\2\u0479\u0477\3\2"+
		"\2\2\u047a\u047b\7\u0171\2\2\u047b\u0489\3\2\2\2\u047c\u047e\7\17\2\2"+
		"\u047d\u047c\3\2\2\2\u047d\u047e\3\2\2\2\u047e\u047f\3\2\2\2\u047f\u0489"+
		"\5^\60\2\u0480\u0481\7\u0172\2\2\u0481\u0482\5v<\2\u0482\u0483\5\u0084"+
		"C\2\u0483\u0484\7\u0173\2\2\u0484\u0489\3\2\2\2\u0485\u0489\5\u00c8e\2"+
		"\u0486\u0489\5\u00ccg\2\u0487\u0489\5\u00d2j\2\u0488\u0466\3\2\2\2\u0488"+
		"\u0468\3\2\2\2\u0488\u0469\3\2\2\2\u0488\u046a\3\2\2\2\u0488\u046b\3\2"+
		"\2\2\u0488\u046c\3\2\2\2\u0488\u046f\3\2\2\2\u0488\u047d\3\2\2\2\u0488"+
		"\u0480\3\2\2\2\u0488\u0485\3\2\2\2\u0488\u0486\3\2\2\2\u0488\u0487\3\2"+
		"\2\2\u0489\u0495\3\2\2\2\u048a\u048b\f\n\2\2\u048b\u048c\7\u0156\2\2\u048c"+
		"\u0494\5\u0092J\13\u048d\u048e\f\f\2\2\u048e\u0491\7r\2\2\u048f\u0492"+
		"\7\u0180\2\2\u0490\u0492\5v<\2\u0491\u048f\3\2\2\2\u0491\u0490\3\2\2\2"+
		"\u0492\u0494\3\2\2\2\u0493\u048a\3\2\2\2\u0493\u048d\3\2\2\2\u0494\u0497"+
		"\3\2\2\2\u0495\u0493\3\2\2\2\u0495\u0496\3\2\2\2\u0496\u0093\3\2\2\2\u0497"+
		"\u0495\3\2\2\2\u0498\u049c\5\u0096L\2\u0499\u049c\5\u00aaV\2\u049a\u049c"+
		"\5\u00c4c\2\u049b\u0498\3\2\2\2\u049b\u0499\3\2\2\2\u049b\u049a\3\2\2"+
		"\2\u049c\u0095\3\2\2\2\u049d\u049e\5\u0098M\2\u049e\u04a0\7\u0170\2\2"+
		"\u049f\u04a1\5\u009aN\2\u04a0\u049f\3\2\2\2\u04a0\u04a1\3\2\2\2\u04a1"+
		"\u04ab\3\2\2\2\u04a2\u04a7\5\u0084C\2\u04a3\u04a4\7\u0176\2\2\u04a4\u04a6"+
		"\5\u0084C\2\u04a5\u04a3\3\2\2\2\u04a6\u04a9\3\2\2\2\u04a7\u04a5\3\2\2"+
		"\2\u04a7\u04a8\3\2\2\2\u04a8\u04ac\3\2\2\2\u04a9\u04a7\3\2\2\2\u04aa\u04ac"+
		"\7\u0162\2\2\u04ab\u04a2\3\2\2\2\u04ab\u04aa\3\2\2\2\u04ab\u04ac\3\2\2"+
		"\2\u04ac\u04ad\3\2\2\2\u04ad\u04af\7\u0171\2\2\u04ae\u04b0\5\u009cO\2"+
		"\u04af\u04ae\3\2\2\2\u04af\u04b0\3\2\2\2\u04b0\u0097\3\2\2\2\u04b1\u04b2"+
		"\t\26\2\2\u04b2\u0099\3\2\2\2\u04b3\u04b4\7\r\2\2\u04b4\u009b\3\2\2\2"+
		"\u04b5\u04bb\7\u00c6\2\2\u04b6\u04b7\7\u0170\2\2\u04b7\u04b8\5\u009eP"+
		"\2\u04b8\u04b9\7\u0171\2\2\u04b9\u04bc\3\2\2\2\u04ba\u04bc\5v<\2\u04bb"+
		"\u04b6\3\2\2\2\u04bb\u04ba\3\2\2\2\u04bc\u009d\3\2\2\2\u04bd\u04bf\5v"+
		"<\2\u04be\u04bd\3\2\2\2\u04be\u04bf\3\2\2\2\u04bf\u04c1\3\2\2\2\u04c0"+
		"\u04c2\5\u00a0Q\2\u04c1\u04c0\3\2\2\2\u04c1\u04c2\3\2\2\2\u04c2\u04c4"+
		"\3\2\2\2\u04c3\u04c5\5\u00d6l\2\u04c4\u04c3\3\2\2\2\u04c4\u04c5\3\2\2"+
		"\2\u04c5\u04c7\3\2\2\2\u04c6\u04c8\5\u00a2R\2\u04c7\u04c6\3\2\2\2\u04c7"+
		"\u04c8\3\2\2\2\u04c8\u009f\3\2\2\2\u04c9\u04ca\7 \2\2\u04ca\u04cb\7\n"+
		"\2\2\u04cb\u04d0\5\u0084C\2\u04cc\u04cd\7\u0176\2\2\u04cd\u04cf\5\u0084"+
		"C\2\u04ce\u04cc\3\2\2\2\u04cf\u04d2\3\2\2\2\u04d0\u04ce\3\2\2\2\u04d0"+
		"\u04d1\3\2\2\2\u04d1\u00a1\3\2\2\2\u04d2\u04d0\3\2\2\2\u04d3\u04d6\t\27"+
		"\2\2\u04d4\u04d7\5\u00a4S\2\u04d5\u04d7\5\u00a8U\2\u04d6\u04d4\3\2\2\2"+
		"\u04d6\u04d5\3\2\2\2\u04d7\u00a3\3\2\2\2\u04d8\u04d9\7;\2\2\u04d9\u04e5"+
		"\7%\2\2\u04da\u04db\7\u010f\2\2\u04db\u04e5\7\u00ce\2\2\u04dc\u04dd\7"+
		"\u010f\2\2\u04dd\u04e5\7\u009b\2\2\u04de\u04df\5\u0084C\2\u04df\u04e0"+
		"\7\u00ce\2\2\u04e0\u04e5\3\2\2\2\u04e1\u04e2\5\u0084C\2\u04e2\u04e3\7"+
		"\u009b\2\2\u04e3\u04e5\3\2\2\2\u04e4\u04d8\3\2\2\2\u04e4\u04da\3\2\2\2"+
		"\u04e4\u04dc\3\2\2\2\u04e4\u04de\3\2\2\2\u04e4\u04e1\3\2\2\2\u04e5\u00a5"+
		"\3\2\2\2\u04e6\u04e7\5\u00a4S\2\u04e7\u00a7\3\2\2\2\u04e8\u04e9\7\b\2"+
		"\2\u04e9\u04ea\5\u00a4S\2\u04ea\u04eb\7\5\2\2\u04eb\u04ec\5\u00a6T\2\u04ec"+
		"\u00a9\3\2\2\2\u04ed\u04f8\5\u00acW\2\u04ee\u04f8\5\u00aeX\2\u04ef\u04f8"+
		"\5\u00b0Y\2\u04f0\u04f8\5\u00b2Z\2\u04f1\u04f8\5\u00b4[\2\u04f2\u04f8"+
		"\5\u00b6\\\2\u04f3\u04f8\5\u00b8]\2\u04f4\u04f8\5\u00ba^\2\u04f5\u04f8"+
		"\5\u00bc_\2\u04f6\u04f8\5\u00be`\2\u04f7\u04ed\3\2\2\2\u04f7\u04ee\3\2"+
		"\2\2\u04f7\u04ef\3\2\2\2\u04f7\u04f0\3\2\2\2\u04f7\u04f1\3\2\2\2\u04f7"+
		"\u04f2\3\2\2\2\u04f7\u04f3\3\2\2\2\u04f7\u04f4\3\2\2\2\u04f7\u04f5\3\2"+
		"\2\2\u04f7\u04f6\3\2\2\2\u04f8\u00ab\3\2\2\2\u04f9\u04fa\7\u014a\2\2\u04fa"+
		"\u04fc\7\u0170\2\2\u04fb\u04fd\5\u009aN\2\u04fc\u04fb\3\2\2\2\u04fc\u04fd"+
		"\3\2\2\2\u04fd\u0507\3\2\2\2\u04fe\u0503\5\u0084C\2\u04ff\u0500\7\u0176"+
		"\2\2\u0500\u0502\5\u0084C\2\u0501\u04ff\3\2\2\2\u0502\u0505\3\2\2\2\u0503"+
		"\u0501\3\2\2\2\u0503\u0504\3\2\2\2\u0504\u0508\3\2\2\2\u0505\u0503\3\2"+
		"\2\2\u0506\u0508\7\u0162\2\2\u0507\u04fe\3\2\2\2\u0507\u0506\3\2\2\2\u0507"+
		"\u0508\3\2\2\2\u0508\u050e\3\2\2\2\u0509\u050c\5\u00d6l\2\u050a\u050b"+
		"\7\u00ea\2\2\u050b\u050d\5\u0084C\2\u050c\u050a\3\2\2\2\u050c\u050d\3"+
		"\2\2\2\u050d\u050f\3\2\2\2\u050e\u0509\3\2\2\2\u050e\u050f\3\2\2\2\u050f"+
		"\u0510\3\2\2\2\u0510\u0511\7\u0171\2\2\u0511\u00ad\3\2\2\2\u0512\u0513"+
		"\5v<\2\u0513\u0514\7\u0170\2\2\u0514\u0519\5\u0084C\2\u0515\u0516\7\u0176"+
		"\2\2\u0516\u0518\5\u0084C\2\u0517\u0515\3\2\2\2\u0518\u051b\3\2\2\2\u0519"+
		"\u0517\3\2\2\2\u0519\u051a\3\2\2\2\u051a\u051c\3\2\2\2\u051b\u0519\3\2"+
		"\2\2\u051c\u051d\7\u0171\2\2\u051d\u051e\5\u009cO\2\u051e\u00af\3\2\2"+
		"\2\u051f\u0520\7h\2\2\u0520\u0521\7\u0170\2\2\u0521\u0522\5\u0084C\2\u0522"+
		"\u0523\7\63\2\2\u0523\u0524\5\u00dan\2\u0524\u0525\7\u0171\2\2\u0525\u00b1"+
		"\3\2\2\2\u0526\u0527\7|\2\2\u0527\u0528\7\u0170\2\2\u0528\u0529\5\u0084"+
		"C\2\u0529\u052a\7\u0176\2\2\u052a\u052b\5\u00dan\2\u052b\u052c\7\u0171"+
		"\2\2\u052c\u0535\3\2\2\2\u052d\u052e\7|\2\2\u052e\u052f\7\u0170\2\2\u052f"+
		"\u0530\5\u0084C\2\u0530\u0531\7\u0116\2\2\u0531\u0532\5v<\2\u0532\u0533"+
		"\7\u0171\2\2\u0533\u0535\3\2\2\2\u0534\u0526\3\2\2\2\u0534\u052d\3\2\2"+
		"\2\u0535\u00b3\3\2\2\2\u0536\u0537\7\u00cd\2\2\u0537\u0538\7\u0170\2\2"+
		"\u0538\u0539\5\u0084C\2\u0539\u053a\7\24\2\2\u053a\u053b\5\u0084C\2\u053b"+
		"\u053c\7\u0171\2\2\u053c\u00b5\3\2\2\2\u053d\u053e\t\30\2\2\u053e\u053f"+
		"\7\u0170\2\2\u053f\u0540\5\u0084C\2\u0540\u0541\7\21\2\2\u0541\u0544\7"+
		"\u0181\2\2\u0542\u0543\7A\2\2\u0543\u0545\7\u0181\2\2\u0544\u0542\3\2"+
		"\2\2\u0544\u0545\3\2\2\2\u0545\u0546\3\2\2\2\u0546\u0547\7\u0171\2\2\u0547"+
		"\u00b7\3\2\2\2\u0548\u0549\7\u0095\2\2\u0549\u054a\7\u0170\2\2\u054a\u054b"+
		"\5v<\2\u054b\u054c\7\21\2\2\u054c\u054d\5\u0084C\2\u054d\u054e\7\u0171"+
		"\2\2\u054e\u00b9\3\2\2\2\u054f\u0550\7k\2\2\u0550\u0551\7\u0170\2\2\u0551"+
		"\u0556\5\u0084C\2\u0552\u0553\7\u0176\2\2\u0553\u0555\5\u0084C\2\u0554"+
		"\u0552\3\2\2\2\u0555\u0558\3\2\2\2\u0556\u0554\3\2\2\2\u0556\u0557\3\2"+
		"\2\2\u0557\u055b\3\2\2\2\u0558\u0556\3\2\2\2\u0559\u055a\7\u0116\2\2\u055a"+
		"\u055c\5\u00e4s\2\u055b\u0559\3\2\2\2\u055b\u055c\3\2\2\2\u055c\u055d"+
		"\3\2\2\2\u055d\u055e\7\u0171\2\2\u055e\u00bb\3\2\2\2\u055f\u0560\7\u010e"+
		"\2\2\u0560\u0561\7\u0170\2\2\u0561\u0562\t\31\2\2\u0562\u0563\7\u0180"+
		"\2\2\u0563\u0564\7\21\2\2\u0564\u0565\7\u0180\2\2\u0565\u0566\7\u0171"+
		"\2\2\u0566\u00bd\3\2\2\2\u0567\u0568\7\u011d\2\2\u0568\u0569\7\u0170\2"+
		"\2\u0569\u056c\5\u0084C\2\u056a\u056b\7\63\2\2\u056b\u056d\5\u00dan\2"+
		"\u056c\u056a\3\2\2\2\u056c\u056d\3\2\2\2\u056d\u056f\3\2\2\2\u056e\u0570"+
		"\5\u00c0a\2\u056f\u056e\3\2\2\2\u056f\u0570\3\2\2\2\u0570\u0571\3\2\2"+
		"\2\u0571\u0572\7\u0171\2\2\u0572\u00bf\3\2\2\2\u0573\u057f\7G\2\2\u0574"+
		"\u0579\5\u00c2b\2\u0575\u0576\7\u0176\2\2\u0576\u0578\5\u00c2b\2\u0577"+
		"\u0575\3\2\2\2\u0578\u057b\3\2\2\2\u0579\u0577\3\2\2\2\u0579\u057a\3\2"+
		"\2\2\u057a\u0580\3\2\2\2\u057b\u0579\3\2\2\2\u057c\u057d\7\u0181\2\2\u057d"+
		"\u057e\7\u0161\2\2\u057e\u0580\7\u0181\2\2\u057f\u0574\3\2\2\2\u057f\u057c"+
		"\3\2\2\2\u0580\u00c1\3\2\2\2\u0581\u0583\7\u0181\2\2\u0582\u0584\t\32"+
		"\2\2\u0583\u0582\3\2\2\2\u0583\u0584\3\2\2\2\u0584\u0586\3\2\2\2\u0585"+
		"\u0587\7\u00e3\2\2\u0586\u0585\3\2\2\2\u0586\u0587\3\2\2\2\u0587\u00c3"+
		"\3\2\2\2\u0588\u0589\5\u00c6d\2\u0589\u0593\7\u0170\2\2\u058a\u058f\5"+
		"\u0084C\2\u058b\u058c\7\u0176\2\2\u058c\u058e\5\u0084C\2\u058d\u058b\3"+
		"\2\2\2\u058e\u0591\3\2\2\2\u058f\u058d\3\2\2\2\u058f\u0590\3\2\2\2\u0590"+
		"\u0594\3\2\2\2\u0591\u058f\3\2\2\2\u0592\u0594\7\u0162\2\2\u0593\u058a"+
		"\3\2\2\2\u0593\u0592\3\2\2\2\u0593\u0594\3\2\2\2\u0594\u0595\3\2\2\2\u0595"+
		"\u0596\7\u0171\2\2\u0596\u00c5\3\2\2\2\u0597\u059f\5v<\2\u0598\u059f\7"+
		"\u00a4\2\2\u0599\u059f\7\177\2\2\u059a\u059f\7\u00b5\2\2\u059b\u059f\7"+
		"\u00b6\2\2\u059c\u059f\7\u00c1\2\2\u059d\u059f\7\u00de\2\2\u059e\u0597"+
		"\3\2\2\2\u059e\u0598\3\2\2\2\u059e\u0599\3\2\2\2\u059e\u059a\3\2\2\2\u059e"+
		"\u059b\3\2\2\2\u059e\u059c\3\2\2\2\u059e\u059d\3\2\2\2\u059f\u00c7\3\2"+
		"\2\2\u05a0\u05a1\7\u00b9\2\2\u05a1\u05a2\5\u0080A\2\u05a2\u05a3\7\u013c"+
		"\2\2\u05a3\u05a5\5\u0084C\2\u05a4\u05a6\5\u00caf\2\u05a5\u05a4\3\2\2\2"+
		"\u05a5\u05a6\3\2\2\2\u05a6\u00c9\3\2\2\2\u05a7\u05a8\7\24\2\2\u05a8\u05a9"+
		"\7\u00bf\2\2\u05a9\u05aa\7\u013d\2\2\u05aa\u05b9\7\u013e\2\2\u05ab\u05ac"+
		"\7\24\2\2\u05ac\u05ad\7\u00bf\2\2\u05ad\u05ae\7\u013d\2\2\u05ae\u05af"+
		"\7\u013e\2\2\u05af\u05b0\7.\2\2\u05b0\u05b1\7\u013f\2\2\u05b1\u05b9\7"+
		"\u0140\2\2\u05b2\u05b3\7\24\2\2\u05b3\u05b4\7\u0141\2\2\u05b4\u05b9\7"+
		"\u013e\2\2\u05b5\u05b6\7.\2\2\u05b6\u05b7\7\u013f\2\2\u05b7\u05b9\7\u0140"+
		"\2\2\u05b8\u05a7\3\2\2\2\u05b8\u05ab\3\2\2\2\u05b8\u05b2\3\2\2\2\u05b8"+
		"\u05b5\3\2\2\2\u05b9\u00cb\3\2\2\2\u05ba\u05bc\7g\2\2\u05bb\u05bd\5\u0092"+
		"J\2\u05bc\u05bb\3\2\2\2\u05bc\u05bd\3\2\2\2\u05bd\u05bf\3\2\2\2\u05be"+
		"\u05c0\5\u00ceh\2\u05bf\u05be\3\2\2\2\u05c0\u05c1\3\2\2\2\u05c1\u05bf"+
		"\3\2\2\2\u05c1\u05c2\3\2\2\2\u05c2\u05c4\3\2\2\2\u05c3\u05c5\5\u00d0i"+
		"\2\u05c4\u05c3\3\2\2\2\u05c4\u05c5\3\2\2\2\u05c5\u05c6\3\2\2\2\u05c6\u05c7"+
		"\7\u008e\2\2\u05c7\u00cd\3\2\2\2\u05c8\u05c9\7\u011e\2\2\u05c9\u05ca\5"+
		"\u0084C\2\u05ca\u05cb\7\u010b\2\2\u05cb\u05cc\5\u0084C\2\u05cc\u00cf\3"+
		"\2\2\2\u05cd\u05ce\7\u008b\2\2\u05ce\u05cf\5\u0084C\2\u05cf\u00d1\3\2"+
		"\2\2\u05d0\u05d1\7\u00ab\2\2\u05d1\u05d2\5\u0084C\2\u05d2\u05d3\5\u00d4"+
		"k\2\u05d3\u00d3\3\2\2\2\u05d4\u05d5\t\33\2\2\u05d5\u00d5\3\2\2\2\u05d6"+
		"\u05d7\7\37\2\2\u05d7\u05d8\7\n\2\2\u05d8\u05dd\5\u00d8m\2\u05d9\u05da"+
		"\7\u0176\2\2\u05da\u05dc\5\u00d8m\2\u05db\u05d9\3\2\2\2\u05dc\u05df\3"+
		"\2\2\2\u05dd\u05db\3\2\2\2\u05dd\u05de\3\2\2\2\u05de\u00d7\3\2\2\2\u05df"+
		"\u05dd\3\2\2\2\u05e0\u05e4\5~@\2\u05e1\u05e4\5f\64\2\u05e2\u05e4\5\u0084"+
		"C\2\u05e3\u05e0\3\2\2\2\u05e3\u05e1\3\2\2\2\u05e3\u05e2\3\2\2\2\u05e4"+
		"\u05e6\3\2\2\2\u05e5\u05e7\t\32\2\2\u05e6\u05e5\3\2\2\2\u05e6\u05e7\3"+
		"\2\2\2\u05e7\u00d9\3\2\2\2\u05e8\u05ea\5\u00dco\2\u05e9\u05eb\5\u00de"+
		"p\2\u05ea\u05e9\3\2\2\2\u05ea\u05eb\3\2\2\2\u05eb\u05ed\3\2\2\2\u05ec"+
		"\u05ee\5\u00e0q\2\u05ed\u05ec\3\2\2\2\u05ed\u05ee\3\2\2\2\u05ee\u05f0"+
		"\3\2\2\2\u05ef\u05f1\5\u00e2r\2\u05f0\u05ef\3\2\2\2\u05f0\u05f1\3\2\2"+
		"\2\u05f1\u05f3\3\2\2\2\u05f2\u05f4\7\u0111\2\2\u05f3\u05f2\3\2\2\2\u05f3"+
		"\u05f4\3\2\2\2\u05f4\u05f6\3\2\2\2\u05f5\u05f7\7\u0122\2\2\u05f6\u05f5"+
		"\3\2\2\2\u05f6\u05f7\3\2\2\2\u05f7\u060a\3\2\2\2\u05f8\u05f9\5\u00dco"+
		"\2\u05f9\u05fa\7\u0170\2\2\u05fa\u05ff\7\u0180\2\2\u05fb\u05fc\7\u0176"+
		"\2\2\u05fc\u05fe\7\u0180\2\2\u05fd\u05fb\3\2\2\2\u05fe\u0601\3\2\2\2\u05ff"+
		"\u05fd\3\2\2\2\u05ff\u0600\3\2\2\2\u0600\u0602\3\2\2\2\u0601\u05ff\3\2"+
		"\2\2\u0602\u0604\7\u0171\2\2\u0603\u0605\5\u00e0q\2\u0604\u0603\3\2\2"+
		"\2\u0604\u0605\3\2\2\2\u0605\u0607\3\2\2\2\u0606\u0608\5\u00e2r\2\u0607"+
		"\u0606\3\2\2\2\u0607\u0608\3\2\2\2\u0608\u060a\3\2\2\2\u0609\u05e8\3\2"+
		"\2\2\u0609\u05f8\3\2\2\2\u060a\u00db\3\2\2\2\u060b\u060d\5v<\2\u060c\u060e"+
		"\5v<\2\u060d\u060c\3\2\2\2\u060d\u060e\3\2\2\2\u060e\u00dd\3\2\2\2\u060f"+
		"\u0610\7\u0170\2\2\u0610\u0613\7\u0181\2\2\u0611\u0612\7\u0176\2\2\u0612"+
		"\u0614\7\u0181\2\2\u0613\u0611\3\2\2\2\u0613\u0614\3\2\2\2\u0614\u0615"+
		"\3\2\2\2\u0615\u0616\7\u0171\2\2\u0616\u00df\3\2\2\2\u0617\u0618\t\34"+
		"\2\2\u0618\u061a\7&\2\2\u0619\u061b\7\u0169\2\2\u061a\u0619\3\2\2\2\u061a"+
		"\u061b\3\2\2\2\u061b\u061c\3\2\2\2\u061c\u0623\5\u00e4s\2\u061d\u061f"+
		"\7m\2\2\u061e\u0620\7\u0169\2\2\u061f\u061e\3\2\2\2\u061f\u0620\3\2\2"+
		"\2\u0620\u0621\3\2\2\2\u0621\u0623\5\u00e4s\2\u0622\u0617\3\2\2\2\u0622"+
		"\u061d\3\2\2\2\u0623\u00e1\3\2\2\2\u0624\u0626\7r\2\2\u0625\u0627\7\u0169"+
		"\2\2\u0626\u0625\3\2\2\2\u0626\u0627\3\2\2\2\u0627\u062a\3\2\2\2\u0628"+
		"\u062b\7\u0180\2\2\u0629\u062b\5\u00e4s\2\u062a\u0628\3\2\2\2\u062a\u0629"+
		"\3\2\2\2\u062b\u00e3\3\2\2\2\u062c\u062f\5v<\2\u062d\u062e\7\u0165\2\2"+
		"\u062e\u0630\5v<\2\u062f\u062d\3\2\2\2\u062f\u0630\3\2\2\2\u0630\u00e5"+
		"\3\2\2\2\u0631\u0636\5\u00e4s\2\u0632\u0633\7\u0176\2\2\u0633\u0635\5"+
		"\u00e4s\2\u0634\u0632\3\2\2\2\u0635\u0638\3\2\2\2\u0636\u0634\3\2\2\2"+
		"\u0636\u0637\3\2\2\2\u0637\u00e7\3\2\2\2\u0638\u0636\3\2\2\2\u0639\u063b"+
		"\7:\2\2\u063a\u063c\7\u0109\2\2\u063b\u063a\3\2\2\2\u063b\u063c\3\2\2"+
		"\2\u063c\u063d\3\2\2\2\u063d\u0641\7T\2\2\u063e\u063f\7\u00a4\2\2\u063f"+
		"\u0640\7\33\2\2\u0640\u0642\7\17\2\2\u0641\u063e\3\2\2\2\u0641\u0642\3"+
		"\2\2\2\u0642\u0643\3\2\2\2\u0643\u0649\5|?\2\u0644\u0645\7\u0170\2\2\u0645"+
		"\u0646\5\u00eav\2\u0646\u0647\7\u0171\2\2\u0647\u064a\3\2\2\2\u0648\u064a"+
		"\5\u0110\u0089\2\u0649\u0644\3\2\2\2\u0649\u0648\3\2\2\2\u064a\u00e9\3"+
		"\2\2\2\u064b\u0650\5\u00ecw\2\u064c\u064d\7\u0176\2\2\u064d\u064f\5\u00ec"+
		"w\2\u064e\u064c\3\2\2\2\u064f\u0652\3\2\2\2\u0650\u064e\3\2\2\2\u0650"+
		"\u0651\3\2\2\2\u0651\u00eb\3\2\2\2\u0652\u0650\3\2\2\2\u0653\u0658\5\u00ee"+
		"x\2\u0654\u0658\5\u00fa~\2\u0655\u0658\5\u0104\u0083\2\u0656\u0658\5\u010e"+
		"\u0088\2\u0657\u0653\3\2\2\2\u0657\u0654\3\2\2\2\u0657\u0655\3\2\2\2\u0657"+
		"\u0656\3\2\2\2\u0658\u00ed\3\2\2\2\u0659\u065a\5~@\2\u065a\u0667\5\u00da"+
		"n\2\u065b\u065d\5\u00f0y\2\u065c\u065b\3\2\2\2\u065d\u0660\3\2\2\2\u065e"+
		"\u065c\3\2\2\2\u065e\u065f\3\2\2\2\u065f\u0668\3\2\2\2\u0660\u065e\3\2"+
		"\2\2\u0661\u0663\5\u00f2z\2\u0662\u0661\3\2\2\2\u0663\u0666\3\2\2\2\u0664"+
		"\u0662\3\2\2\2\u0664\u0665\3\2\2\2\u0665\u0668\3\2\2\2\u0666\u0664\3\2"+
		"\2\2\u0667\u065e\3\2\2\2\u0667\u0664\3\2\2\2\u0668\u00ef\3\2\2\2\u0669"+
		"\u0675\5\u00f4{\2\u066a\u0675\7`\2\2\u066b\u066e\7<\2\2\u066c\u066f\5"+
		"b\62\2\u066d\u066f\5\u0084C\2\u066e\u066c\3\2\2\2\u066e\u066d\3\2\2\2"+
		"\u066f\u0675\3\2\2\2\u0670\u0671\7t\2\2\u0671\u0675\t\35\2\2\u0672\u0673"+
		"\7\u00ff\2\2\u0673\u0675\t\36\2\2\u0674\u0669\3\2\2\2\u0674\u066a\3\2"+
		"\2\2\u0674\u066b\3\2\2\2\u0674\u0670\3\2\2\2\u0674\u0672\3\2\2\2\u0675"+
		"\u00f1\3\2\2\2\u0676\u067f\5\u00f4{\2\u0677\u0678\7D\2\2\u0678\u067a\7"+
		"\62\2\2\u0679\u0677\3\2\2\2\u0679\u067a\3\2\2\2\u067a\u067b\3\2\2\2\u067b"+
		"\u067c\7\63\2\2\u067c\u067f\5\u0084C\2\u067d\u067f\t\37\2\2\u067e\u0676"+
		"\3\2\2\2\u067e\u0679\3\2\2\2\u067e\u067d\3\2\2\2\u067f\u00f3\3\2\2\2\u0680"+
		"\u068f\5\u0108\u0085\2\u0681\u0683\7X\2\2\u0682\u0684\7\26\2\2\u0683\u0682"+
		"\3\2\2\2\u0683\u0684\3\2\2\2\u0684\u068f\3\2\2\2\u0685\u0687\7\33\2\2"+
		"\u0686\u0685\3\2\2\2\u0686\u0687\3\2\2\2\u0687\u0688\3\2\2\2\u0688\u068f"+
		"\7\34\2\2\u0689\u068f\5\u00e2r\2\u068a\u068f\5\u010e\u0088\2\u068b\u068f"+
		"\5\u00f6|\2\u068c\u068d\7u\2\2\u068d\u068f\7\u0180\2\2\u068e\u0680\3\2"+
		"\2\2\u068e\u0681\3\2\2\2\u068e\u0686\3\2\2\2\u068e\u0689\3\2\2\2\u068e"+
		"\u068a\3\2\2\2\u068e\u068b\3\2\2\2\u068e\u068c\3\2\2\2\u068f\u00f5\3\2"+
		"\2\2\u0690\u0691\7N\2\2\u0691\u0692\5|?\2\u0692\u0699\5\u00fe\u0080\2"+
		"\u0693\u0694\7\u00b9\2\2\u0694\u069a\7\u009d\2\2\u0695\u0696\7\u00b9\2"+
		"\2\u0696\u069a\7\u00c9\2\2\u0697\u0698\7\u00b9\2\2\u0698\u069a\7\u00f0"+
		"\2\2\u0699\u0693\3\2\2\2\u0699\u0695\3\2\2\2\u0699\u0697\3\2\2\2\u0699"+
		"\u069a\3\2\2\2\u069a\u06a0\3\2\2\2\u069b\u069c\7I\2\2\u069c\u069d\t \2"+
		"\2\u069d\u069f\5\u00f8}\2\u069e\u069b\3\2\2\2\u069f\u06a2\3\2\2\2\u06a0"+
		"\u069e\3\2\2\2\u06a0\u06a1\3\2\2\2\u06a1\u00f7\3\2\2\2\u06a2\u06a0\3\2"+
		"\2\2\u06a3\u06ac\7\u00e2\2\2\u06a4\u06ac\7\64\2\2\u06a5\u06a6\7&\2\2\u06a6"+
		"\u06ac\7\34\2\2\u06a7\u06a8\7H\2\2\u06a8\u06ac\7[\2\2\u06a9\u06aa\7&\2"+
		"\2\u06aa\u06ac\7<\2\2\u06ab\u06a3\3\2\2\2\u06ab\u06a4\3\2\2\2\u06ab\u06a5"+
		"\3\2\2\2\u06ab\u06a7\3\2\2\2\u06ab\u06a9\3\2\2\2\u06ac\u00f9\3\2\2\2\u06ad"+
		"\u06af\t!\2\2\u06ae\u06ad\3\2\2\2\u06ae\u06af\3\2\2\2\u06af\u06b1\3\2"+
		"\2\2\u06b0\u06b2\t\b\2\2\u06b1\u06b0\3\2\2\2\u06b1\u06b2\3\2\2\2\u06b2"+
		"\u06b4\3\2\2\2\u06b3\u06b5\5\u0082B\2\u06b4\u06b3\3\2\2\2\u06b4\u06b5"+
		"\3\2\2\2\u06b5\u06b7\3\2\2\2\u06b6\u06b8\5\u00fc\177\2\u06b7\u06b6\3\2"+
		"\2\2\u06b7\u06b8\3\2\2\2\u06b8\u06b9\3\2\2\2\u06b9\u06bd\5\u00fe\u0080"+
		"\2\u06ba\u06bc\5\u0102\u0082\2\u06bb\u06ba\3\2\2\2\u06bc\u06bf\3\2\2\2"+
		"\u06bd\u06bb\3\2\2\2\u06bd\u06be\3\2\2\2\u06be\u00fb\3\2\2\2\u06bf\u06bd"+
		"\3\2\2\2\u06c0\u06c1\7\u0116\2\2\u06c1\u06c2\t\"\2\2\u06c2\u00fd\3\2\2"+
		"\2\u06c3\u06c4\7\u0170\2\2\u06c4\u06c9\5\u0100\u0081\2\u06c5\u06c6\7\u0176"+
		"\2\2\u06c6\u06c8\5\u0100\u0081\2\u06c7\u06c5\3\2\2\2\u06c8\u06cb\3\2\2"+
		"\2\u06c9\u06c7\3\2\2\2\u06c9\u06ca\3\2\2\2\u06ca\u06cc\3\2\2\2\u06cb\u06c9"+
		"\3\2\2\2\u06cc\u06cd\7\u0171\2\2\u06cd\u00ff\3\2\2\2\u06ce\u06d2\5~@\2"+
		"\u06cf\u06d0\7\u0170\2\2\u06d0\u06d1\7\u0181\2\2\u06d1\u06d3\7\u0171\2"+
		"\2\u06d2\u06cf\3\2\2\2\u06d2\u06d3\3\2\2\2\u06d3\u06d6\3\2\2\2\u06d4\u06d6"+
		"\5\u0084C\2\u06d5\u06ce\3\2\2\2\u06d5\u06d4\3\2\2\2\u06d6\u06d8\3\2\2"+
		"\2\u06d7\u06d9\t\32\2\2\u06d8\u06d7\3\2\2\2\u06d8\u06d9\3\2\2\2\u06d9"+
		"\u0101\3\2\2\2\u06da\u06dc\7\u00af\2\2\u06db\u06dd\7\u0169\2\2\u06dc\u06db"+
		"\3\2\2\2\u06dc\u06dd\3\2\2\2\u06dd\u06de\3\2\2\2\u06de\u06e8\7\u0181\2"+
		"\2\u06df\u06e8\5\u00fc\177\2\u06e0\u06e1\7.\2\2\u06e1\u06e2\7\u00c8\2"+
		"\2\u06e2\u06e8\5v<\2\u06e3\u06e4\7u\2\2\u06e4\u06e8\7\u0180\2\2\u06e5"+
		"\u06e8\7\u0123\2\2\u06e6\u06e8\7\u0124\2\2\u06e7\u06da\3\2\2\2\u06e7\u06df"+
		"\3\2\2\2\u06e7\u06e0\3\2\2\2\u06e7\u06e3\3\2\2\2\u06e7\u06e5\3\2\2\2\u06e7"+
		"\u06e6\3\2\2\2\u06e8\u0103\3\2\2\2\u06e9\u06eb\79\2\2\u06ea\u06ec\5\u00e4"+
		"s\2\u06eb\u06ea\3\2\2\2\u06eb\u06ec\3\2\2\2\u06ec\u06ee\3\2\2\2\u06ed"+
		"\u06e9\3\2\2\2\u06ed\u06ee\3\2\2\2\u06ee\u06f2\3\2\2\2\u06ef\u06f3\5\u0106"+
		"\u0084\2\u06f0\u06f3\5\u010a\u0086\2\u06f1\u06f3\5\u010c\u0087\2\u06f2"+
		"\u06ef\3\2\2\2\u06f2\u06f0\3\2\2\2\u06f2\u06f1\3\2\2\2\u06f3\u0105\3\2"+
		"\2\2\u06f4\u06f6\5\u0108\u0085\2\u06f5\u06f7\5\u00fc\177\2\u06f6\u06f5"+
		"\3\2\2\2\u06f6\u06f7\3\2\2\2\u06f7\u06f8\3\2\2\2\u06f8\u06fc\5\u0080A"+
		"\2\u06f9\u06fb\5\u0102\u0082\2\u06fa\u06f9\3\2\2\2\u06fb\u06fe\3\2\2\2"+
		"\u06fc\u06fa\3\2\2\2\u06fc\u06fd\3\2\2\2\u06fd\u0107\3\2\2\2\u06fe\u06fc"+
		"\3\2\2\2\u06ff\u0701\7!\2\2\u0700\u06ff\3\2\2\2\u0700\u0701\3\2\2\2\u0701"+
		"\u0702\3\2\2\2\u0702\u0703\7\26\2\2\u0703\u0109\3\2\2\2\u0704\u0706\7"+
		"X\2\2\u0705\u0707\t\b\2\2\u0706\u0705\3\2\2\2\u0706\u0707\3\2\2\2\u0707"+
		"\u0709\3\2\2\2\u0708\u070a\5\u0082B\2\u0709\u0708\3\2\2\2\u0709\u070a"+
		"\3\2\2\2\u070a\u070c\3\2\2\2\u070b\u070d\5\u00fc\177\2\u070c\u070b\3\2"+
		"\2\2\u070c\u070d\3\2\2\2\u070d\u070e\3\2\2\2\u070e\u0712\5\u00fe\u0080"+
		"\2\u070f\u0711\5\u0102\u0082\2\u0710\u070f\3\2\2\2\u0711\u0714\3\2\2\2"+
		"\u0712\u0710\3\2\2\2\u0712\u0713\3\2\2\2\u0713\u010b\3\2\2\2\u0714\u0712"+
		"\3\2\2\2\u0715\u0716\7B\2\2\u0716\u0718\7\26\2\2\u0717\u0719\5\u0082B"+
		"\2\u0718\u0717\3\2\2\2\u0718\u0719\3\2\2\2\u0719\u071a\3\2\2\2\u071a\u071b"+
		"\5\u0080A\2\u071b\u071c\5\u00f6|\2\u071c\u010d\3\2\2\2\u071d\u071f\79"+
		"\2\2\u071e\u0720\5\u00e4s\2\u071f\u071e\3\2\2\2\u071f\u0720\3\2\2\2\u0720"+
		"\u0722\3\2\2\2\u0721\u071d\3\2\2\2\u0721\u0722\3\2\2\2\u0722\u0723\3\2"+
		"\2\2\u0723\u0724\7\65\2\2\u0724\u0729\5\u0084C\2\u0725\u0727\7\33\2\2"+
		"\u0726\u0725\3\2\2\2\u0726\u0727\3\2\2\2\u0727\u0728\3\2\2\2\u0728\u072a"+
		"\7\u0126\2\2\u0729\u0726\3\2\2\2\u0729\u072a\3\2\2\2\u072a\u010f\3\2\2"+
		"\2\u072b\u072c\7\27\2\2\u072c\u0733\5|?\2\u072d\u072e\7\u0170\2\2\u072e"+
		"\u072f\7\27\2\2\u072f\u0730\5|?\2\u0730\u0731\7\u0171\2\2\u0731\u0733"+
		"\3\2\2\2\u0732\u072b\3\2\2\2\u0732\u072d\3\2\2\2\u0733\u0111\3\2\2\2\u0734"+
		"\u0735\7\61\2\2\u0735\u0736\7T\2\2\u0736\u0738\5|?\2\u0737\u0739\5\u0114"+
		"\u008b\2\u0738\u0737\3\2\2\2\u0738\u0739\3\2\2\2\u0739\u0113\3\2\2\2\u073a"+
		"\u073f\5\u0116\u008c\2\u073b\u073c\7\u0176\2\2\u073c\u073e\5\u0116\u008c"+
		"\2\u073d\u073b\3\2\2\2\u073e\u0741\3\2\2\2\u073f\u073d\3\2\2\2\u073f\u0740"+
		"\3\2\2\2\u0740\u0115\3\2\2\2\u0741\u073f\3\2\2\2\u0742\u07eb\5\u0118\u008d"+
		"\2\u0743\u07eb\5\u011c\u008f\2\u0744\u07eb\5\u0120\u0091\2\u0745\u07eb"+
		"\5\u0122\u0092\2\u0746\u0747\7\60\2\2\u0747\u07eb\5\u010e\u0088\2\u0748"+
		"\u0749\7?\2\2\u0749\u074a\7\65\2\2\u074a\u07eb\5\u00e4s\2\u074b\u074c"+
		"\7\61\2\2\u074c\u074d\7\65\2\2\u074d\u074f\5\u00e4s\2\u074e\u0750\7\33"+
		"\2\2\u074f\u074e\3\2\2\2\u074f\u0750\3\2\2\2\u0750\u0751\3\2\2\2\u0751"+
		"\u0752\7\u0126\2\2\u0752\u07eb\3\2\2\2\u0753\u0755\7]\2\2\u0754\u0756"+
		"\7\u0169\2\2\u0755\u0754\3\2\2\2\u0755\u0756\3\2\2\2\u0756\u0757\3\2\2"+
		"\2\u0757\u07eb\t#\2\2\u0758\u075a\7\61\2\2\u0759\u075b\7\66\2\2\u075a"+
		"\u0759\3\2\2\2\u075a\u075b\3\2\2\2\u075b\u075c\3\2\2\2\u075c\u0762\5~"+
		"@\2\u075d\u075e\7&\2\2\u075e\u075f\7<\2\2\u075f\u0763\5b\62\2\u0760\u0761"+
		"\7?\2\2\u0761\u0763\7<\2\2\u0762\u075d\3\2\2\2\u0762\u0760\3\2\2\2\u0763"+
		"\u07eb\3\2\2\2\u0764\u0765\7\61\2\2\u0765\u0766\7F\2\2\u0766\u0767\5\u0082"+
		"B\2\u0767\u0768\t$\2\2\u0768\u07eb\3\2\2\2\u0769\u07eb\5\u0124\u0093\2"+
		"\u076a\u076c\7<\2\2\u076b\u076a\3\2\2\2\u076b\u076c\3\2\2\2\u076c\u076d"+
		"\3\2\2\2\u076d\u076f\5\u00e0q\2\u076e\u0770\5\u00e2r\2\u076f\u076e\3\2"+
		"\2\2\u076f\u0770\3\2\2\2\u0770\u07eb\3\2\2\2\u0771\u0772\7|\2\2\u0772"+
		"\u0773\7U\2\2\u0773\u0775\5\u00e0q\2\u0774\u0776\5\u00e2r\2\u0775\u0774"+
		"\3\2\2\2\u0775\u0776\3\2\2\2\u0776\u07eb\3\2\2\2\u0777\u0778\t%\2\2\u0778"+
		"\u07eb\7\u00ae\2\2\u0779\u077a\t&\2\2\u077a\u07eb\7\u0108\2\2\u077b\u07eb"+
		"\5\u0126\u0094\2\u077c\u07eb\5\u0128\u0095\2\u077d\u07eb\5\u012a\u0096"+
		"\2\u077e\u077f\7?\2\2\u077f\u0780\7B\2\2\u0780\u0781\7\26\2\2\u0781\u07eb"+
		"\5\u00e4s\2\u0782\u07eb\7\u009c\2\2\u0783\u0785\7\u00b7\2\2\u0784\u0786"+
		"\7\u0169\2\2\u0785\u0784\3\2\2\2\u0785\u0786\3\2\2\2\u0786\u0787\3\2\2"+
		"\2\u0787\u07eb\t\'\2\2\u0788\u07eb\5\u012c\u0097\2\u0789\u078a\7\37\2"+
		"\2\u078a\u078b\7\n\2\2\u078b\u0790\5~@\2\u078c\u078d\7\u0176\2\2\u078d"+
		"\u078f\5~@\2\u078e\u078c\3\2\2\2\u078f\u0792\3\2\2\2\u0790\u078e\3\2\2"+
		"\2\u0790\u0791\3\2\2\2\u0791\u07eb\3\2\2\2\u0792\u0790\3\2\2\2\u0793\u07eb"+
		"\5\u012e\u0098\2\u0794\u07eb\5\u0130\u0099\2\u0795\u07eb\5\u0132\u009a"+
		"\2\u0796\u0797\t(\2\2\u0797\u07eb\7\u0117\2\2\u0798\u0799\7\60\2\2\u0799"+
		"\u079a\7 \2\2\u079a\u079b\7\u0170\2\2\u079b\u079c\5\u0138\u009d\2\u079c"+
		"\u079d\7\u0171\2\2\u079d\u07eb\3\2\2\2\u079e\u079f\7?\2\2\u079f\u07a0"+
		"\7 \2\2\u07a0\u07eb\5\u00e6t\2\u07a1\u07a2\7\u0085\2\2\u07a2\u07a5\7 "+
		"\2\2\u07a3\u07a6\5\u00e6t\2\u07a4\u07a6\7\4\2\2\u07a5\u07a3\3\2\2\2\u07a5"+
		"\u07a4\3\2\2\2\u07a6\u07a7\3\2\2\2\u07a7\u07eb\7\u0108\2\2\u07a8\u07a9"+
		"\7\u00a6\2\2\u07a9\u07ac\7 \2\2\u07aa\u07ad\5\u00e6t\2\u07ab\u07ad\7\4"+
		"\2\2\u07ac\u07aa\3\2\2\2\u07ac\u07ab\3\2\2\2\u07ad\u07ae\3\2\2\2\u07ae"+
		"\u07eb\7\u0108\2\2\u07af\u07b0\7W\2\2\u07b0\u07b3\7 \2\2\u07b1\u07b4\5"+
		"\u00e6t\2\u07b2\u07b4\7\4\2\2\u07b3\u07b1\3\2\2\2\u07b3\u07b2\3\2\2\2"+
		"\u07b4\u07eb\3\2\2\2\u07b5\u07b6\7q\2\2\u07b6\u07b7\7 \2\2\u07b7\u07eb"+
		"\7\u0181\2\2\u07b8\u07b9\7\u00dc\2\2\u07b9\u07ba\7 \2\2\u07ba\u07bb\5"+
		"\u00e6t\2\u07bb\u07bc\7\u00ac\2\2\u07bc\u07bd\5\u0136\u009c\2\u07bd\u07eb"+
		"\3\2\2\2\u07be\u07bf\7\u0092\2\2\u07bf\u07c0\7 \2\2\u07c0\u07c1\5\u00e4"+
		"s\2\u07c1\u07c2\7.\2\2\u07c2\u07c3\7T\2\2\u07c3\u07c6\5|?\2\u07c4\u07c5"+
		"\t(\2\2\u07c5\u07c7\7\u0117\2\2\u07c6\u07c4\3\2\2\2\u07c6\u07c7\3\2\2"+
		"\2\u07c7\u07eb\3\2\2\2\u07c8\u07c9\7^\2\2\u07c9\u07cc\7 \2\2\u07ca\u07cd"+
		"\5\u00e6t\2\u07cb\u07cd\7\4\2\2\u07cc\u07ca\3\2\2\2\u07cc\u07cb\3\2\2"+
		"\2\u07cd\u07eb\3\2\2\2\u07ce\u07cf\7\65\2\2\u07cf\u07d2\7 \2\2\u07d0\u07d3"+
		"\5\u00e6t\2\u07d1\u07d3\7\4\2\2\u07d2\u07d0\3\2\2\2\u07d2\u07d1\3\2\2"+
		"\2\u07d3\u07eb\3\2\2\2\u07d4\u07d5\7\u00c4\2\2\u07d5\u07d8\7 \2\2\u07d6"+
		"\u07d9\5\u00e6t\2\u07d7\u07d9\7\4\2\2\u07d8\u07d6\3\2\2\2\u07d8\u07d7"+
		"\3\2\2\2\u07d9\u07eb\3\2\2\2\u07da\u07db\7\u00d5\2\2\u07db\u07de\7 \2"+
		"\2\u07dc\u07df\5\u00e6t\2\u07dd\u07df\7\4\2\2\u07de\u07dc\3\2\2\2\u07de"+
		"\u07dd\3\2\2\2\u07df\u07eb\3\2\2\2\u07e0\u07e1\7\u00dd\2\2\u07e1\u07e4"+
		"\7 \2\2\u07e2\u07e5\5\u00e6t\2\u07e3\u07e5\7\4\2\2\u07e4\u07e2\3\2\2\2"+
		"\u07e4\u07e3\3\2\2\2\u07e5\u07eb\3\2\2\2\u07e6\u07e7\7\u00da\2\2\u07e7"+
		"\u07eb\7\u00ca\2\2\u07e8\u07e9\7\u0113\2\2\u07e9\u07eb\7\u00ca\2\2\u07ea"+
		"\u0742\3\2\2\2\u07ea\u0743\3\2\2\2\u07ea\u0744\3\2\2\2\u07ea\u0745\3\2"+
		"\2\2\u07ea\u0746\3\2\2\2\u07ea\u0748\3\2\2\2\u07ea\u074b\3\2\2\2\u07ea"+
		"\u0753\3\2\2\2\u07ea\u0758\3\2\2\2\u07ea\u0764\3\2\2\2\u07ea\u0769\3\2"+
		"\2\2\u07ea\u076b\3\2\2\2\u07ea\u0771\3\2\2\2\u07ea\u0777\3\2\2\2\u07ea"+
		"\u0779\3\2\2\2\u07ea\u077b\3\2\2\2\u07ea\u077c\3\2\2\2\u07ea\u077d\3\2"+
		"\2\2\u07ea\u077e\3\2\2\2\u07ea\u0782\3\2\2\2\u07ea\u0783\3\2\2\2\u07ea"+
		"\u0788\3\2\2\2\u07ea\u0789\3\2\2\2\u07ea\u0793\3\2\2\2\u07ea\u0794\3\2"+
		"\2\2\u07ea\u0795\3\2\2\2\u07ea\u0796\3\2\2\2\u07ea\u0798\3\2\2\2\u07ea"+
		"\u079e\3\2\2\2\u07ea\u07a1\3\2\2\2\u07ea\u07a8\3\2\2\2\u07ea\u07af\3\2"+
		"\2\2\u07ea\u07b5\3\2\2\2\u07ea\u07b8\3\2\2\2\u07ea\u07be\3\2\2\2\u07ea"+
		"\u07c8\3\2\2\2\u07ea\u07ce\3\2\2\2\u07ea\u07d4\3\2\2\2\u07ea\u07da\3\2"+
		"\2\2\u07ea\u07e0\3\2\2\2\u07ea\u07e6\3\2\2\2\u07ea\u07e8\3\2\2\2\u07eb"+
		"\u0117\3\2\2\2\u07ec\u07f3\5\u011a\u008e\2\u07ed\u07ef\7\u0176\2\2\u07ee"+
		"\u07ed\3\2\2\2\u07ee\u07ef\3\2\2\2\u07ef\u07f0\3\2\2\2\u07f0\u07f2\5\u011a"+
		"\u008e\2\u07f1\u07ee\3\2\2\2\u07f2\u07f5\3\2\2\2\u07f3\u07f1\3\2\2\2\u07f3"+
		"\u07f4\3\2\2\2\u07f4\u0119\3\2\2\2\u07f5\u07f3\3\2\2\2\u07f6\u07f8\7`"+
		"\2\2\u07f7\u07f9\7\u0169\2\2\u07f8\u07f7\3\2\2\2\u07f8\u07f9\3\2\2\2\u07f9"+
		"\u07fa\3\2\2\2\u07fa\u0878\7\u0181\2\2\u07fb\u07fd\7b\2\2\u07fc\u07fe"+
		"\7\u0169\2\2\u07fd\u07fc\3\2\2\2\u07fd\u07fe\3\2\2\2\u07fe\u07ff\3\2\2"+
		"\2\u07ff\u0878\7\u0181\2\2\u0800\u0802\7<\2\2\u0801\u0800\3\2\2\2\u0801"+
		"\u0802\3\2\2\2\u0802\u0805\3\2\2\2\u0803\u0806\5\u00e0q\2\u0804\u0806"+
		"\5\u00e2r\2\u0805\u0803\3\2\2\2\u0805\u0804\3\2\2\2\u0806\u0878\3\2\2"+
		"\2\u0807\u0809\7n\2\2\u0808\u080a\7\u0169\2\2\u0809\u0808\3\2\2\2\u0809"+
		"\u080a\3\2\2\2\u080a\u080b\3\2\2\2\u080b\u0878\7\u0181\2\2\u080c\u080e"+
		"\7u\2\2\u080d\u080f\7\u0169\2\2\u080e\u080d\3\2\2\2\u080e\u080f\3\2\2"+
		"\2\u080f\u0810\3\2\2\2\u0810\u0878\7\u0180\2\2\u0811\u0813\7x\2\2\u0812"+
		"\u0814\7\u0169\2\2\u0813\u0812\3\2\2\2\u0813\u0814\3\2\2\2\u0814\u0815"+
		"\3\2\2\2\u0815\u0878\7\u0180\2\2\u0816\u0818\7y\2\2\u0817\u0819\7\u0169"+
		"\2\2\u0818\u0817\3\2\2\2\u0818\u0819\3\2\2\2\u0819\u081a\3\2\2\2\u081a"+
		"\u0878\7\u0180\2\2\u081b\u081c\t)\2\2\u081c\u081e\7\u0084\2\2\u081d\u081f"+
		"\7\u0169\2\2\u081e\u081d\3\2\2\2\u081e\u081f\3\2\2\2\u081f\u0820\3\2\2"+
		"\2\u0820\u0878\7\u0180\2\2\u0821\u0823\7\u0083\2\2\u0822\u0824\7\u0169"+
		"\2\2\u0823\u0822\3\2\2\2\u0823\u0824\3\2\2\2\u0824\u0825\3\2\2\2\u0825"+
		"\u0878\7\u0181\2\2\u0826\u0828\7\u008c\2\2\u0827\u0829\7\u0169\2\2\u0828"+
		"\u0827\3\2\2\2\u0828\u0829\3\2\2\2\u0829\u082a\3\2\2\2\u082a\u0878\7\u0180"+
		"\2\2\u082b\u082d\7\u008f\2\2\u082c\u082e\7\u0169\2\2\u082d\u082c\3\2\2"+
		"\2\u082d\u082e\3\2\2\2\u082e\u082f\3\2\2\2\u082f\u0878\5\u00e4s\2\u0830"+
		"\u0832\7\u00aa\2\2\u0831\u0833\7\u0169\2\2\u0832\u0831\3\2\2\2\u0832\u0833"+
		"\3\2\2\2\u0833\u0834\3\2\2\2\u0834\u0878\t*\2\2\u0835\u0837\7\u00af\2"+
		"\2\u0836\u0838\7\u0169\2\2\u0837\u0836\3\2\2\2\u0837\u0838\3\2\2\2\u0838"+
		"\u0839\3\2\2\2\u0839\u0878\7\u0181\2\2\u083a\u083c\7\u00bb\2\2\u083b\u083d"+
		"\7\u0169\2\2\u083c\u083b\3\2\2\2\u083c\u083d\3\2\2\2\u083d\u083e\3\2\2"+
		"\2\u083e\u0878\7\u0181\2\2\u083f\u0841\7\u00bd\2\2\u0840\u0842\7\u0169"+
		"\2\2\u0841\u0840\3\2\2\2\u0841\u0842\3\2\2\2\u0842\u0843\3\2\2\2\u0843"+
		"\u0878\7\u0181\2\2\u0844\u0846\7\u00c7\2\2\u0845\u0847\7\u0169\2\2\u0846"+
		"\u0845\3\2\2\2\u0846\u0847\3\2\2\2\u0847\u0848\3\2\2\2\u0848\u0878\t+"+
		"\2\2\u0849\u084b\7K\2\2\u084a\u084c\7\u0169\2\2\u084b\u084a\3\2\2\2\u084b"+
		"\u084c\3\2\2\2\u084c\u084d\3\2\2\2\u084d\u0878\7\u0180\2\2\u084e\u0850"+
		"\7\u00e7\2\2\u084f\u0851\7\u0169\2\2\u0850\u084f\3\2\2\2\u0850\u0851\3"+
		"\2\2\2\u0851\u0852\3\2\2\2\u0852\u0878\t,\2\2\u0853\u0855\7\u00fc\2\2"+
		"\u0854\u0856\7\u0169\2\2\u0855\u0854\3\2\2\2\u0855\u0856\3\2\2\2\u0856"+
		"\u0857\3\2\2\2\u0857\u0878\t+\2\2\u0858\u085a\7\u00fd\2\2\u0859\u085b"+
		"\7\u0169\2\2\u085a\u0859\3\2\2\2\u085a\u085b\3\2\2\2\u085b\u085c\3\2\2"+
		"\2\u085c\u0878\t+\2\2\u085d\u085f\7\u00fe\2\2\u085e\u0860\7\u0169\2\2"+
		"\u085f\u085e\3\2\2\2\u085f\u0860\3\2\2\2\u0860\u0861\3\2\2\2\u0861\u0878"+
		"\7\u0181\2\2\u0862\u0863\7\u0108\2\2\u0863\u0866\5\u00e4s\2\u0864\u0865"+
		"\7\u00ff\2\2\u0865\u0867\t\36\2\2\u0866\u0864\3\2\2\2\u0866\u0867\3\2"+
		"\2\2\u0867\u0878\3\2\2\2\u0868\u086a\7+\2\2\u0869\u086b\7\u0169\2\2\u086a"+
		"\u0869\3\2\2\2\u086a\u086b\3\2\2\2\u086b\u086c\3\2\2\2\u086c\u086d\7\u0170"+
		"\2\2\u086d\u0872\5|?\2\u086e\u086f\7\u0176\2\2\u086f\u0871\5|?\2\u0870"+
		"\u086e\3\2\2\2\u0871\u0874\3\2\2\2\u0872\u0870\3\2\2\2\u0872\u0873\3\2"+
		"\2\2\u0873\u0875\3\2\2\2\u0874\u0872\3\2\2\2\u0875\u0876\7\u0171\2\2\u0876"+
		"\u0878\3\2\2\2\u0877\u07f6\3\2\2\2\u0877\u07fb\3\2\2\2\u0877\u0801\3\2"+
		"\2\2\u0877\u0807\3\2\2\2\u0877\u080c\3\2\2\2\u0877\u0811\3\2\2\2\u0877"+
		"\u0816\3\2\2\2\u0877\u081b\3\2\2\2\u0877\u0821\3\2\2\2\u0877\u0826\3\2"+
		"\2\2\u0877\u082b\3\2\2\2\u0877\u0830\3\2\2\2\u0877\u0835\3\2\2\2\u0877"+
		"\u083a\3\2\2\2\u0877\u083f\3\2\2\2\u0877\u0844\3\2\2\2\u0877\u0849\3\2"+
		"\2\2\u0877\u084e\3\2\2\2\u0877\u0853\3\2\2\2\u0877\u0858\3\2\2\2\u0877"+
		"\u085d\3\2\2\2\u0877\u0862\3\2\2\2\u0877\u0868\3\2\2\2\u0878\u011b\3\2"+
		"\2\2\u0879\u087b\7\60\2\2\u087a\u087c\7\66\2\2\u087b\u087a\3\2\2\2\u087b"+
		"\u087c\3\2\2\2\u087c\u088c\3\2\2\2\u087d\u087f\5\u00eex\2\u087e\u0880"+
		"\5\u011e\u0090\2\u087f\u087e\3\2\2\2\u087f\u0880\3\2\2\2\u0880\u088d\3"+
		"\2\2\2\u0881\u0882\7\u0170\2\2\u0882\u0887\5\u00eex\2\u0883\u0884\7\u0176"+
		"\2\2\u0884\u0886\5\u00eex\2\u0885\u0883\3\2\2\2\u0886\u0889\3\2\2\2\u0887"+
		"\u0885\3\2\2\2\u0887\u0888\3\2\2\2\u0888\u088a\3\2\2\2\u0889\u0887\3\2"+
		"\2\2\u088a\u088b\7\u0171\2\2\u088b\u088d\3\2\2\2\u088c\u087d\3\2\2\2\u088c"+
		"\u0881\3\2\2\2\u088d\u011d\3\2\2\2\u088e\u0892\7\u0099\2\2\u088f\u0890"+
		"\7\\\2\2\u0890\u0892\5~@\2\u0891\u088e\3\2\2\2\u0891\u088f\3\2\2\2\u0892"+
		"\u011f\3\2\2\2\u0893\u0894\7\60\2\2\u0894\u0895\5\u00fa~\2\u0895\u0121"+
		"\3\2\2\2\u0896\u0897\7\60\2\2\u0897\u0898\5\u0104\u0083\2\u0898\u0123"+
		"\3\2\2\2\u0899\u089b\7j\2\2\u089a\u089c\7\66\2\2\u089b\u089a\3\2\2\2\u089b"+
		"\u089c\3\2\2\2\u089c\u089d\3\2\2\2\u089d\u089e\5~@\2\u089e\u08a0\5\u00ee"+
		"x\2\u089f\u08a1\5\u011e\u0090\2\u08a0\u089f\3\2\2\2\u08a0\u08a1\3\2\2"+
		"\2\u08a1\u0125\3\2\2\2\u08a2\u08a4\7?\2\2\u08a3\u08a5\7\66\2\2\u08a4\u08a3"+
		"\3\2\2\2\u08a4\u08a5\3\2\2\2\u08a5\u08a6\3\2\2\2\u08a6\u08a7\5~@\2\u08a7"+
		"\u0127\3\2\2\2\u08a8\u08a9\7?\2\2\u08a9\u08aa\t\b\2\2\u08aa\u08ab\5\u0082"+
		"B\2\u08ab\u0129\3\2\2\2\u08ac\u08ad\7?\2\2\u08ad\u08ae\5\u0108\u0085\2"+
		"\u08ae\u012b\3\2\2\2\u08af\u08b1\7\u00be\2\2\u08b0\u08b2\7\66\2\2\u08b1"+
		"\u08b0\3\2\2\2\u08b1\u08b2\3\2\2\2\u08b2\u08b3\3\2\2\2\u08b3\u08b5\5\u00ee"+
		"x\2\u08b4\u08b6\5\u011e\u0090\2\u08b5\u08b4\3\2\2\2\u08b5\u08b6\3\2\2"+
		"\2\u08b6\u012d\3\2\2\2\u08b7\u08b8\7\u00db\2\2\u08b8\u08b9\7\66\2\2\u08b9"+
		"\u08ba\5~@\2\u08ba\u08bb\7U\2\2\u08bb\u08bc\5~@\2\u08bc\u012f\3\2\2\2"+
		"\u08bd\u08be\7\u00db\2\2\u08be\u08bf\t\b\2\2\u08bf\u08c0\5\u0082B\2\u08c0"+
		"\u08c1\7U\2\2\u08c1\u08c2\5\u0082B\2\u08c2\u0131\3\2\2\2\u08c3\u08c5\7"+
		"\u00db\2\2\u08c4\u08c6\t-\2\2\u08c5\u08c4\3\2\2\2\u08c5\u08c6\3\2\2\2"+
		"\u08c6\u08c7\3\2\2\2\u08c7\u08c8\5\u0134\u009b\2\u08c8\u0133\3\2\2\2\u08c9"+
		"\u08ca\5v<\2\u08ca\u0135\3\2\2\2\u08cb\u08cc\7\u0170\2\2\u08cc\u08d1\5"+
		"\u0138\u009d\2\u08cd\u08ce\7\u0176\2\2\u08ce\u08d0\5\u0138\u009d\2\u08cf"+
		"\u08cd\3\2\2\2\u08d0\u08d3\3\2\2\2\u08d1\u08cf\3\2\2\2\u08d1\u08d2\3\2"+
		"\2\2\u08d2\u08d4\3\2\2\2\u08d3\u08d1\3\2\2\2\u08d4\u08d5\7\u0171\2\2\u08d5"+
		"\u0137\3\2\2\2\u08d6\u08d7\7 \2\2\u08d7\u08e3\5v<\2\u08d8\u08e1\7\u0119"+
		"\2\2\u08d9\u08da\7\u00b3\2\2\u08da\u08db\7\u010a\2\2\u08db\u08e2\5\u013a"+
		"\u009e\2\u08dc\u08dd\7\24\2\2\u08dd\u08de\7\u0170\2\2\u08de\u08df\5\u013c"+
		"\u009f\2\u08df\u08e0\7\u0171\2\2\u08e0\u08e2\3\2\2\2\u08e1\u08d9\3\2\2"+
		"\2\u08e1\u08dc\3\2\2\2\u08e2\u08e4\3\2\2\2\u08e3\u08d8\3\2\2\2\u08e3\u08e4"+
		"\3\2\2\2\u08e4\u08e8\3\2\2\2\u08e5\u08e7\5\u013e\u00a0\2\u08e6\u08e5\3"+
		"\2\2\2\u08e7\u08ea\3\2\2\2\u08e8\u08e6\3\2\2\2\u08e8\u08e9\3\2\2\2\u08e9"+
		"\u08f6\3\2\2\2\u08ea\u08e8\3\2\2\2\u08eb\u08ec\7\u0170\2\2\u08ec\u08f1"+
		"\5\u0140\u00a1\2\u08ed\u08ee\7\u0176\2\2\u08ee\u08f0\5\u0140\u00a1\2\u08ef"+
		"\u08ed\3\2\2\2\u08f0\u08f3\3\2\2\2\u08f1\u08ef\3\2\2\2\u08f1\u08f2\3\2"+
		"\2\2\u08f2\u08f4\3\2\2\2\u08f3\u08f1\3\2\2\2\u08f4\u08f5\7\u0171\2\2\u08f5"+
		"\u08f7\3\2\2\2\u08f6\u08eb\3\2\2\2\u08f6\u08f7\3\2\2\2\u08f7\u0139\3\2"+
		"\2\2\u08f8\u08fb\7\u0170\2\2\u08f9\u08fc\5\u0084C\2\u08fa\u08fc\5\u013c"+
		"\u009f\2\u08fb\u08f9\3\2\2\2\u08fb\u08fa\3\2\2\2\u08fc\u08fd\3\2\2\2\u08fd"+
		"\u08fe\7\u0171\2\2\u08fe\u0901\3\2\2\2\u08ff\u0901\7\u00ba\2\2\u0900\u08f8"+
		"\3\2\2\2\u0900\u08ff\3\2\2\2\u0901\u013b\3\2\2\2\u0902\u0907\5b\62\2\u0903"+
		"\u0904\7\u0176\2\2\u0904\u0906\5b\62\2\u0905\u0903\3\2\2\2\u0906\u0909"+
		"\3\2\2\2\u0907\u0905\3\2\2\2\u0907\u0908\3\2\2\2\u0908\u013d\3\2\2\2\u0909"+
		"\u0907\3\2\2\2\u090a\u090c\7\u00ff\2\2\u090b\u090a\3\2\2\2\u090b\u090c"+
		"\3\2\2\2\u090c\u090d\3\2\2\2\u090d\u090f\7\u008f\2\2\u090e\u0910\7\u0169"+
		"\2\2\u090f\u090e\3\2\2\2\u090f\u0910\3\2\2\2\u0910\u0911\3\2\2\2\u0911"+
		"\u0933\5v<\2\u0912\u0914\7u\2\2\u0913\u0915\7\u0169\2\2\u0914\u0913\3"+
		"\2\2\2\u0914\u0915\3\2\2\2\u0915\u0916\3\2\2\2\u0916\u0933\7\u0180\2\2"+
		"\u0917\u0918\7\u0080";
	private static final String _serializedATNSegment1 =
		"\2\2\u0918\u091a\7\u0084\2\2\u0919\u091b\7\u0169\2\2\u091a\u0919\3\2\2"+
		"\2\u091a\u091b\3\2\2\2\u091b\u091c\3\2\2\2\u091c\u0933\7\u0180\2\2\u091d"+
		"\u091e\7F\2\2\u091e\u0920\7\u0084\2\2\u091f\u0921\7\u0169\2\2\u0920\u091f"+
		"\3\2\2\2\u0920\u0921\3\2\2\2\u0921\u0922\3\2\2\2\u0922\u0933\7\u0180\2"+
		"\2\u0923\u0925\7\u00bb\2\2\u0924\u0926\7\u0169\2\2\u0925\u0924\3\2\2\2"+
		"\u0925\u0926\3\2\2\2\u0926\u0927\3\2\2\2\u0927\u0933\7\u0181\2\2\u0928"+
		"\u092a\7\u00bd\2\2\u0929\u092b\7\u0169\2\2\u092a\u0929\3\2\2\2\u092a\u092b"+
		"\3\2\2\2\u092b\u092c\3\2\2\2\u092c\u0933\7\u0181\2\2\u092d\u092f\7\u0108"+
		"\2\2\u092e\u0930\7\u0169\2\2\u092f\u092e\3\2\2\2\u092f\u0930\3\2\2\2\u0930"+
		"\u0931\3\2\2\2\u0931\u0933\5v<\2\u0932\u090b\3\2\2\2\u0932\u0912\3\2\2"+
		"\2\u0932\u0917\3\2\2\2\u0932\u091d\3\2\2\2\u0932\u0923\3\2\2\2\u0932\u0928"+
		"\3\2\2\2\u0932\u092d\3\2\2\2\u0933\u013f\3\2\2\2\u0934\u0935\7\u0102\2"+
		"\2\u0935\u0939\5v<\2\u0936\u0938\5\u013e\u00a0\2\u0937\u0936\3\2\2\2\u0938"+
		"\u093b\3\2\2\2\u0939\u0937\3\2\2\2\u0939\u093a\3\2\2\2\u093a\u0141\3\2"+
		"\2\2\u093b\u0939\3\2\2\2\u093c\u093e\7?\2\2\u093d\u093f\7\u0109\2\2\u093e"+
		"\u093d\3\2\2\2\u093e\u093f\3\2\2\2\u093f\u0940\3\2\2\2\u0940\u0943\7T"+
		"\2\2\u0941\u0942\7\u00a4\2\2\u0942\u0944\7\17\2\2\u0943\u0941\3\2\2\2"+
		"\u0943\u0944\3\2\2\2\u0944\u0945\3\2\2\2\u0945\u094a\5|?\2\u0946\u0947"+
		"\7\u0176\2\2\u0947\u0949\5|?\2\u0948\u0946\3\2\2\2\u0949\u094c\3\2\2\2"+
		"\u094a\u0948\3\2\2\2\u094a\u094b\3\2\2\2\u094b\u0143\3\2\2\2\u094c\u094a"+
		"\3\2\2\2\u094d\u094f\7W\2\2\u094e\u0950\7T\2\2\u094f\u094e\3\2\2\2\u094f"+
		"\u0950\3\2\2\2\u0950\u0951\3\2\2\2\u0951\u0952\5|?\2\u0952\u0145\3\2\2"+
		"\2\u0953\u0955\7:\2\2\u0954\u0956\t.\2\2\u0955\u0954\3\2\2\2\u0955\u0956"+
		"\3\2\2\2\u0956\u0957\3\2\2\2\u0957\u0958\7F\2\2\u0958\u095a\5\u0082B\2"+
		"\u0959\u095b\5\u00fc\177\2\u095a\u0959\3\2\2\2\u095a\u095b\3\2\2\2\u095b"+
		"\u095c\3\2\2\2\u095c\u095d\7I\2\2\u095d\u095e\5|?\2\u095e\u0147\3\2\2"+
		"\2\u095f\u0960\7?\2\2\u0960\u0962\7F\2\2\u0961\u0963\t/\2\2\u0962\u0961"+
		"\3\2\2\2\u0962\u0963\3\2\2\2\u0963\u0964\3\2\2\2\u0964\u0965\5\u0082B"+
		"\2\u0965\u0966\7I\2\2\u0966\u0967\5|?\2\u0967\u0149\3\2\2\2\u0968\u096a"+
		"\7&\2\2\u0969\u096b\t\60\2\2\u096a\u0969\3\2\2\2\u096a\u096b\3\2\2\2\u096b"+
		"\u096c\3\2\2\2\u096c\u096d\7V\2\2\u096d\u014b\3\2\2\2\u096e\u096f\7&\2"+
		"\2\u096f\u0970\7a\2\2\u0970\u0971\7\u0169\2\2\u0971\u0972\5\u014e\u00a8"+
		"\2\u0972\u014d\3\2\2\2\u0973\u0974\7\u0181\2\2\u0974\u014f\3\2\2\2\u0975"+
		"\u0979\7c\2\2\u0976\u0977\7S\2\2\u0977\u0979\7V\2\2\u0978\u0975\3\2\2"+
		"\2\u0978\u0976\3\2\2\2\u0979\u0151\3\2\2\2\u097a\u097b\7\67\2\2\u097b"+
		"\u0153\3\2\2\2\u097c\u097d\7Q\2\2\u097d\u0155\3\2\2\2\u097e\u097f\7\u00e8"+
		"\2\2\u097f\u0157\3\2\2\2\u0980\u0984\7E\2\2\u0981\u0985\5\u015c\u00af"+
		"\2\u0982\u0985\5\u015e\u00b0\2\u0983\u0985\5\u0160\u00b1\2\u0984\u0981"+
		"\3\2\2\2\u0984\u0982\3\2\2\2\u0984\u0983\3\2\2\2\u0985\u0159\3\2\2\2\u0986"+
		"\u098b\7O\2\2\u0987\u098c\5\u015c\u00af\2\u0988\u098c\5\u015e\u00b0\2"+
		"\u0989\u098c\5\u0162\u00b2\2\u098a\u098c\5\u0160\u00b1\2\u098b\u0987\3"+
		"\2\2\2\u098b\u0988\3\2\2\2\u098b\u0989\3\2\2\2\u098b\u098a\3\2\2\2\u098c"+
		"\u015b\3\2\2\2\u098d\u098e\7\u00d2\2\2\u098e\u098f\7I\2\2\u098f\u015d"+
		"\3\2\2\2\u0990\u0991\5\u0164\u00b3\2\u0991\u0992\7I\2\2\u0992\u0993\5"+
		"\u0168\u00b5\2\u0993\u015f\3\2\2\2\u0994\u0995\5\u00e6t\2\u0995\u0161"+
		"\3\2\2\2\u0996\u0998\7\4\2\2\u0997\u0999\7L\2\2\u0998\u0997\3\2\2\2\u0998"+
		"\u0999\3\2\2\2\u0999\u099a\3\2\2\2\u099a\u099b\7\u0176\2\2\u099b\u099c"+
		"\7E\2\2\u099c\u099d\7J\2\2\u099d\u0163\3\2\2\2\u099e\u09a0\5\u0166\u00b4"+
		"\2\u099f\u09a1\5\u0080A\2\u09a0\u099f\3\2\2\2\u09a0\u09a1\3\2\2\2\u09a1"+
		"\u09a9\3\2\2\2\u09a2\u09a3\7\u0176\2\2\u09a3\u09a5\5\u0166\u00b4\2\u09a4"+
		"\u09a6\5\u0080A\2\u09a5\u09a4\3\2\2\2\u09a5\u09a6\3\2\2\2\u09a6\u09a8"+
		"\3\2\2\2\u09a7\u09a2\3\2\2\2\u09a8\u09ab\3\2\2\2\u09a9\u09a7\3\2\2\2\u09a9"+
		"\u09aa\3\2\2\2\u09aa\u0165\3\2\2\2\u09ab\u09a9\3\2\2\2\u09ac\u09ae\7\4"+
		"\2\2\u09ad\u09af\7L\2\2\u09ae\u09ad\3\2\2\2\u09ae\u09af\3\2\2\2\u09af"+
		"\u09ea\3\2\2\2\u09b0\u09b2\7\61\2\2\u09b1\u09b3\7\u00e6\2\2\u09b2\u09b1"+
		"\3\2\2\2\u09b2\u09b3\3\2\2\2\u09b3\u09ea\3\2\2\2\u09b4\u09ea\7:\2\2\u09b5"+
		"\u09b6\7:\2\2\u09b6\u09ea\7\u00e6\2\2\u09b7\u09b8\7:\2\2\u09b8\u09ea\7"+
		"\u0108\2\2\u09b9\u09ba\7:\2\2\u09ba\u09bb\7\u0109\2\2\u09bb\u09ea\7\u0107"+
		"\2\2\u09bc\u09bd\7:\2\2\u09bd\u09ea\7Y\2\2\u09be\u09bf\7:\2\2\u09bf\u09ea"+
		"\7\u011b\2\2\u09c0\u09ea\7=\2\2\u09c1\u09ea\7?\2\2\u09c2\u09ea\7\u0090"+
		"\2\2\u09c3\u09ea\7\u0094\2\2\u09c4\u09ea\7\u0096\2\2\u09c5\u09c6\7E\2"+
		"\2\u09c6\u09ea\7J\2\2\u09c7\u09ea\7F\2\2\u09c8\u09ea\7\u00a9\2\2\u09c9"+
		"\u09ca\7\u00b7\2\2\u09ca\u09ea\7\u0107\2\2\u09cb\u09ea\7\u00d1\2\2\u09cc"+
		"\u09ea\7\u00d2\2\2\u09cd\u09ea\7N\2\2\u09ce\u09ea\7\u00d9\2\2\u09cf\u09d0"+
		"\7\u00df\2\2\u09d0\u09ea\7p\2\2\u09d1\u09d2\7\u00df\2\2\u09d2\u09ea\7"+
		"\u00f1\2\2\u09d3\u09ea\7\u00e9\2\2\u09d4\u09d5\7\u00ee\2\2\u09d5\u09ea"+
		"\7\u0081\2\2\u09d6\u09d7\7\u00ee\2\2\u09d7\u09ea\7\u011b\2\2\u09d8\u09ea"+
		"\7\u00ef\2\2\u09d9\u09ea\7\u0103\2\2\u09da\u09ea\7\u010d\2\2\u09db\u09ea"+
		"\7\u0112\2\2\u09dc\u09ea\7\u0114\2\2\u09dd\u09ea\7_\2\2\u09de\u09ea\7"+
		"d\2\2\u09df\u09ea\7z\2\2\u09e0\u09ea\7\u008d\2\2\u09e1\u09ea\7\u0097\2"+
		"\2\u09e2\u09ea\7\u0098\2\2\u09e3\u09ea\7\u00a0\2\2\u09e4\u09ea\7\u00e0"+
		"\2\2\u09e5\u09ea\7\u00e5\2\2\u09e6\u09ea\7\u00ec\2\2\u09e7\u09ea\7\u0106"+
		"\2\2\u09e8\u09ea\7\u011a\2\2\u09e9\u09ac\3\2\2\2\u09e9\u09b0\3\2\2\2\u09e9"+
		"\u09b4\3\2\2\2\u09e9\u09b5\3\2\2\2\u09e9\u09b7\3\2\2\2\u09e9\u09b9\3\2"+
		"\2\2\u09e9\u09bc\3\2\2\2\u09e9\u09be\3\2\2\2\u09e9\u09c0\3\2\2\2\u09e9"+
		"\u09c1\3\2\2\2\u09e9\u09c2\3\2\2\2\u09e9\u09c3\3\2\2\2\u09e9\u09c4\3\2"+
		"\2\2\u09e9\u09c5\3\2\2\2\u09e9\u09c7\3\2\2\2\u09e9\u09c8\3\2\2\2\u09e9"+
		"\u09c9\3\2\2\2\u09e9\u09cb\3\2\2\2\u09e9\u09cc\3\2\2\2\u09e9\u09cd\3\2"+
		"\2\2\u09e9\u09ce\3\2\2\2\u09e9\u09cf\3\2\2\2\u09e9\u09d1\3\2\2\2\u09e9"+
		"\u09d3\3\2\2\2\u09e9\u09d4\3\2\2\2\u09e9\u09d6\3\2\2\2\u09e9\u09d8\3\2"+
		"\2\2\u09e9\u09d9\3\2\2\2\u09e9\u09da\3\2\2\2\u09e9\u09db\3\2\2\2\u09e9"+
		"\u09dc\3\2\2\2\u09e9\u09dd\3\2\2\2\u09e9\u09de\3\2\2\2\u09e9\u09df\3\2"+
		"\2\2\u09e9\u09e0\3\2\2\2\u09e9\u09e1\3\2\2\2\u09e9\u09e2\3\2\2\2\u09e9"+
		"\u09e3\3\2\2\2\u09e9\u09e4\3\2\2\2\u09e9\u09e5\3\2\2\2\u09e9\u09e6\3\2"+
		"\2\2\u09e9\u09e7\3\2\2\2\u09e9\u09e8\3\2\2\2\u09ea\u0167\3\2\2\2\u09eb"+
		"\u09ed\5\u016a\u00b6\2\u09ec\u09eb\3\2\2\2\u09ec\u09ed\3\2\2\2\u09ed\u09ee"+
		"\3\2\2\2\u09ee\u09ef\5\u016c\u00b7\2\u09ef\u0169\3\2\2\2\u09f0\u09f1\t"+
		"\61\2\2\u09f1\u016b\3\2\2\2\u09f2\u09fa\7\u0162\2\2\u09f3\u09f4\7\u0162"+
		"\2\2\u09f4\u09fa\7\u0166\2\2\u09f5\u09f6\5v<\2\u09f6\u09f7\7\u0166\2\2"+
		"\u09f7\u09fa\3\2\2\2\u09f8\u09fa\5|?\2\u09f9\u09f2\3\2\2\2\u09f9\u09f3"+
		"\3\2\2\2\u09f9\u09f5\3\2\2\2\u09f9\u09f8\3\2\2\2\u09fa\u016d\3\2\2\2\u09fb"+
		"\u09fc\7:\2\2\u09fc\u09fd\7Y\2\2\u09fd\u016f\3\2\2\2\u09fe\u09ff\7?\2"+
		"\2\u09ff\u0a00\7Y\2\2\u0a00\u0171\3\2\2\2\u0a01\u0a02\7\61\2\2\u0a02\u0a03"+
		"\7Y\2\2\u0a03\u0173\3\2\2\2\u0a04\u0a05\7\u00db\2\2\u0a05\u0a06\7Y\2\2"+
		"\u0a06\u0175\3\2\2\2\u0a07\u0a08\7:\2\2\u0a08\u0a09\7P\2\2\u0a09\u0177"+
		"\3\2\2\2\u0a0a\u0a0b\7?\2\2\u0a0b\u0a0c\7P\2\2\u0a0c\u0179\3\2\2\2\u0a0d"+
		"\u0a0f\7&\2\2\u0a0e\u0a10\7<\2\2\u0a0f\u0a0e\3\2\2\2\u0a0f\u0a10\3\2\2"+
		"\2\u0a10\u0a11\3\2\2\2\u0a11\u0a12\7P\2\2\u0a12\u017b\3\2\2\2\u0a13\u0a14"+
		"\7&\2\2\u0a14\u0a15\7K\2\2\u0a15\u017d\3\2\2\2\u0147\u0198\u019b\u01a0"+
		"\u01a4\u01a9\u01ac\u01af\u01b2\u01b5\u01bd\u01c1\u01ce\u01d6\u01d9\u01dc"+
		"\u01e8\u01f1\u01f8\u01fc\u0202\u0205\u0208\u020b\u020e\u0213\u0216\u0219"+
		"\u0224\u0228\u022d\u0231\u0235\u023b\u0242\u0247\u024f\u0254\u025b\u0260"+
		"\u0263\u0266\u0269\u026c\u026f\u0272\u027c\u0282\u0288\u028d\u0290\u0293"+
		"\u0296\u029a\u02a9\u02b2\u02b9\u02bf\u02c2\u02c6\u02c9\u02cc\u02cf\u02d3"+
		"\u02d7\u02dd\u02e6\u02f0\u02fb\u02fd\u0305\u030b\u030f\u0313\u0317\u0321"+
		"\u0325\u032b\u0337\u033c\u0345\u034b\u034f\u0357\u036d\u0370\u0374\u037f"+
		"\u0382\u0386\u0389\u038d\u0399\u039d\u03a0\u03a3\u03ac\u03b3\u03bd\u03cd"+
		"\u03d6\u03d8\u03e5\u03f4\u03f6\u03fd\u0404\u040d\u0414\u0422\u0428\u042c"+
		"\u0432\u0461\u0463\u046f\u0477\u047d\u0488\u0491\u0493\u0495\u049b\u04a0"+
		"\u04a7\u04ab\u04af\u04bb\u04be\u04c1\u04c4\u04c7\u04d0\u04d6\u04e4\u04f7"+
		"\u04fc\u0503\u0507\u050c\u050e\u0519\u0534\u0544\u0556\u055b\u056c\u056f"+
		"\u0579\u057f\u0583\u0586\u058f\u0593\u059e\u05a5\u05b8\u05bc\u05c1\u05c4"+
		"\u05dd\u05e3\u05e6\u05ea\u05ed\u05f0\u05f3\u05f6\u05ff\u0604\u0607\u0609"+
		"\u060d\u0613\u061a\u061f\u0622\u0626\u062a\u062f\u0636\u063b\u0641\u0649"+
		"\u0650\u0657\u065e\u0664\u0667\u066e\u0674\u0679\u067e\u0683\u0686\u068e"+
		"\u0699\u06a0\u06ab\u06ae\u06b1\u06b4\u06b7\u06bd\u06c9\u06d2\u06d5\u06d8"+
		"\u06dc\u06e7\u06eb\u06ed\u06f2\u06f6\u06fc\u0700\u0706\u0709\u070c\u0712"+
		"\u0718\u071f\u0721\u0726\u0729\u0732\u0738\u073f\u074f\u0755\u075a\u0762"+
		"\u076b\u076f\u0775\u0785\u0790\u07a5\u07ac\u07b3\u07c6\u07cc\u07d2\u07d8"+
		"\u07de\u07e4\u07ea\u07ee\u07f3\u07f8\u07fd\u0801\u0805\u0809\u080e\u0813"+
		"\u0818\u081e\u0823\u0828\u082d\u0832\u0837\u083c\u0841\u0846\u084b\u0850"+
		"\u0855\u085a\u085f\u0866\u086a\u0872\u0877\u087b\u087f\u0887\u088c\u0891"+
		"\u089b\u08a0\u08a4\u08b1\u08b5\u08c5\u08d1\u08e1\u08e3\u08e8\u08f1\u08f6"+
		"\u08fb\u0900\u0907\u090b\u090f\u0914\u091a\u0920\u0925\u092a\u092f\u0932"+
		"\u0939\u093e\u0943\u094a\u094f\u0955\u095a\u0962\u096a\u0978\u0984\u098b"+
		"\u0998\u09a0\u09a5\u09a9\u09ae\u09b2\u09e9\u09ec\u09f9\u0a0f";
	public static final String _serializedATN = Utils.join(
		new String[] {
			_serializedATNSegment0,
			_serializedATNSegment1
		},
		""
	);
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}