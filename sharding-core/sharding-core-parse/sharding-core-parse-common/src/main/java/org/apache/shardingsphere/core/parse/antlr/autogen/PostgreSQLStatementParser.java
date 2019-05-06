// Generated from org\apache\shardingsphere\core\parse\antlr\autogen\PostgreSQLStatement.g4 by ANTLR 4.7.1
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
public class PostgreSQLStatementParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, WS=2, ALL=3, AND=4, ANY=5, ASC=6, ADMIN=7, BETWEEN=8, BINARY=9, 
		BY=10, DATE=11, DESC=12, DISTINCT=13, ESCAPE=14, EXISTS=15, FALSE=16, 
		FROM=17, GROUP=18, HAVING=19, IN=20, IS=21, KEY=22, LIKE=23, LIMIT=24, 
		MOD=25, NOT=26, NULL=27, OFFSET=28, OR=29, ORDER=30, PARTITION=31, PRIMARY=32, 
		REGEXP=33, ROW=34, SET=35, SOUNDS=36, TIME=37, TIMESTAMP=38, TRUE=39, 
		UNION=40, UNKNOWN=41, WHERE=42, WITH=43, XOR=44, ADD=45, ALTER=46, ALWAYS=47, 
		AS=48, CASCADE=49, CHECK=50, COLUMN=51, COMMIT=52, CONSTRAINT=53, CREATE=54, 
		CURRENT=55, DAY=56, DEFAULT=57, DELETE=58, DISABLE=59, DROP=60, ENABLE=61, 
		FOR=62, FOREIGN=63, FUNCTION=64, GENERATED=65, GRANT=66, INDEX=67, ISOLATION=68, 
		LEVEL=69, NO=70, ON=71, OPTION=72, PRIVILEGES=73, READ=74, REFERENCES=75, 
		REVOKE=76, ROLE=77, ROLLBACK=78, ROWS=79, START=80, TABLE=81, TO=82, TRANSACTION=83, 
		TRUNCATE=84, UNIQUE=85, USER=86, YEAR=87, ACTION=88, ARRAY=89, BEGIN=90, 
		BRIN=91, BTREE=92, CACHE=93, CAST=94, CHARACTERISTICS=95, CLUSTER=96, 
		COLLATE=97, COMMENTS=98, CONCURRENTLY=99, CONNECT=100, CONSTRAINTS=101, 
		CURRENT_TIMESTAMP=102, CURRENT_USER=103, CYCLE=104, DATA=105, DATABASE=106, 
		DEFAULTS=107, DEFERRABLE=108, DEFERRED=109, DEPENDS=110, DOMAIN=111, EXCLUDING=112, 
		EXECUTE=113, EXTENDED=114, EXTENSION=115, EXTERNAL=116, EXTRACT=117, FILTER=118, 
		FIRST=119, FOLLOWING=120, FORCE=121, FULL=122, GIN=123, GIST=124, GLOBAL=125, 
		HASH=126, HOUR=127, IDENTITY=128, IF=129, IMMEDIATE=130, INCLUDING=131, 
		INCREMENT=132, INDEXES=133, INHERIT=134, INHERITS=135, INITIALLY=136, 
		INSERT=137, LANGUAGE=138, LARGE=139, LAST=140, LOCAL=141, LOGGED=142, 
		MAIN=143, MATCH=144, MAXVALUE=145, MINUTE=146, MINVALUE=147, MONTH=148, 
		NOTHING=149, NULLS=150, OBJECT=151, OF=152, OIDS=153, ONLY=154, OVER=155, 
		OWNED=156, OWNER=157, PARTIAL=158, PLAIN=159, PRECEDING=160, PROCEDURE=161, 
		RANGE=162, RENAME=163, REPLICA=164, RESET=165, RESTART=166, RESTRICT=167, 
		ROUTINE=168, RULE=169, SAVEPOINT=170, SCHEMA=171, SECOND=172, SECURITY=173, 
		SELECT=174, SEQUENCE=175, SESSION=176, SESSION_USER=177, SHOW=178, SIMPLE=179, 
		SPGIST=180, STATISTICS=181, STORAGE=182, TABLESPACE=183, TEMP=184, TEMPORARY=185, 
		TRIGGER=186, TYPE=187, UNBOUNDED=188, UNLOGGED=189, UPDATE=190, USAGE=191, 
		USING=192, VALID=193, VALIDATE=194, WITHIN=195, WITHOUT=196, ZONE=197, 
		FOR_GENERATOR=198, AND_=199, OR_=200, NOT_=201, TILDE_=202, VERTICAL_BAR_=203, 
		AMPERSAND_=204, SIGNED_LEFT_SHIFT_=205, SIGNED_RIGHT_SHIFT_=206, CARET_=207, 
		MOD_=208, COLON_=209, PLUS_=210, MINUS_=211, ASTERISK_=212, SLASH_=213, 
		BACKSLASH_=214, DOT_=215, DOT_ASTERISK_=216, SAFE_EQ_=217, DEQ_=218, EQ_=219, 
		NEQ_=220, GT_=221, GTE_=222, LT_=223, LTE_=224, POUND_=225, LP_=226, RP_=227, 
		LBE_=228, RBE_=229, LBT_=230, RBT_=231, COMMA_=232, DQ_=233, SQ_=234, 
		BQ_=235, QUESTION_=236, AT_=237, SEMI_=238, IDENTIFIER_=239, STRING_=240, 
		NUMBER_=241, HEX_DIGIT_=242, BIT_NUM_=243;
	public static final int
		RULE_execute = 0, RULE_createIndex = 1, RULE_dropIndex = 2, RULE_alterIndex = 3, 
		RULE_createTable = 4, RULE_alterTable = 5, RULE_truncateTable = 6, RULE_dropTable = 7, 
		RULE_alterIndexName = 8, RULE_renameIndexSpecification = 9, RULE_alterIndexDependsOnExtension = 10, 
		RULE_alterIndexSetTableSpace = 11, RULE_tableNameParts = 12, RULE_tableNamePart = 13, 
		RULE_createTableHeader = 14, RULE_createDefinitions = 15, RULE_createDefinition = 16, 
		RULE_likeOption = 17, RULE_inheritClause = 18, RULE_alterTableNameWithAsterisk = 19, 
		RULE_alterTableActions = 20, RULE_alterTableAction = 21, RULE_tableConstraintUsingIndex = 22, 
		RULE_addColumnSpecification = 23, RULE_dropColumnSpecification = 24, RULE_modifyColumnSpecification = 25, 
		RULE_alterColumn = 26, RULE_alterColumnSetOption = 27, RULE_attributeOptions = 28, 
		RULE_attributeOption = 29, RULE_addConstraintSpecification = 30, RULE_renameColumnSpecification = 31, 
		RULE_renameConstraint = 32, RULE_storageParameterWithValue = 33, RULE_storageParameter = 34, 
		RULE_alterTableNameExists = 35, RULE_renameTableSpecification_ = 36, RULE_newTableName = 37, 
		RULE_usingIndexType = 38, RULE_tableConstraint = 39, RULE_tableConstraintOption = 40, 
		RULE_excludeElement = 41, RULE_schemaName = 42, RULE_tableName = 43, RULE_columnName = 44, 
		RULE_collationName = 45, RULE_indexName = 46, RULE_alias = 47, RULE_dataTypeLength = 48, 
		RULE_primaryKey = 49, RULE_columnNames = 50, RULE_exprs = 51, RULE_exprList = 52, 
		RULE_expr = 53, RULE_exprRecursive = 54, RULE_booleanPrimary = 55, RULE_comparisonOperator = 56, 
		RULE_predicate = 57, RULE_bitExpr = 58, RULE_simpleExpr = 59, RULE_functionCall = 60, 
		RULE_distinct = 61, RULE_intervalExpr = 62, RULE_caseExpress = 63, RULE_privateExprOfDb = 64, 
		RULE_variable = 65, RULE_literal = 66, RULE_question = 67, RULE_number = 68, 
		RULE_string = 69, RULE_subquery = 70, RULE_collateClause = 71, RULE_orderByClause = 72, 
		RULE_orderByItem = 73, RULE_asterisk = 74, RULE_columnDefinition = 75, 
		RULE_columnConstraint = 76, RULE_constraintClause = 77, RULE_columnConstraintOption = 78, 
		RULE_checkOption = 79, RULE_defaultExpr = 80, RULE_sequenceOptions = 81, 
		RULE_sequenceOption = 82, RULE_indexParameters = 83, RULE_action = 84, 
		RULE_foreignKeyOnAction = 85, RULE_foreignKeyOn = 86, RULE_constraintOptionalParam = 87, 
		RULE_dataType = 88, RULE_dataTypeName_ = 89, RULE_intervalFields = 90, 
		RULE_intervalField = 91, RULE_pgExpr = 92, RULE_aggregateExpression = 93, 
		RULE_filterClause = 94, RULE_asteriskWithParen = 95, RULE_windowFunction = 96, 
		RULE_windowFunctionWithClause = 97, RULE_windowDefinition = 98, RULE_operator = 99, 
		RULE_frameClause = 100, RULE_frameStart = 101, RULE_frameEnd = 102, RULE_castExpr = 103, 
		RULE_castExprWithCOLON_ = 104, RULE_collateExpr = 105, RULE_arrayConstructorWithCast = 106, 
		RULE_arrayConstructor = 107, RULE_extractFromFunction = 108, RULE_ignoredIdentifier_ = 109, 
		RULE_ignoredIdentifiers_ = 110, RULE_matchNone = 111, RULE_setTransaction = 112, 
		RULE_beginTransaction = 113, RULE_commit = 114, RULE_rollback = 115, RULE_savepoint = 116, 
		RULE_grant = 117, RULE_revoke = 118, RULE_privilegeClause_ = 119, RULE_roleClause_ = 120, 
		RULE_optionForClause_ = 121, RULE_privileges_ = 122, RULE_privilegeType_ = 123, 
		RULE_onObjectClause_ = 124, RULE_createUser = 125, RULE_dropUser = 126, 
		RULE_alterUser = 127, RULE_createRole = 128, RULE_dropRole = 129, RULE_alterRole = 130, 
		RULE_show = 131, RULE_setParam = 132, RULE_scope = 133, RULE_setClause = 134, 
		RULE_timeZoneType = 135, RULE_resetParam = 136;
	public static final String[] ruleNames = {
		"execute", "createIndex", "dropIndex", "alterIndex", "createTable", "alterTable", 
		"truncateTable", "dropTable", "alterIndexName", "renameIndexSpecification", 
		"alterIndexDependsOnExtension", "alterIndexSetTableSpace", "tableNameParts", 
		"tableNamePart", "createTableHeader", "createDefinitions", "createDefinition", 
		"likeOption", "inheritClause", "alterTableNameWithAsterisk", "alterTableActions", 
		"alterTableAction", "tableConstraintUsingIndex", "addColumnSpecification", 
		"dropColumnSpecification", "modifyColumnSpecification", "alterColumn", 
		"alterColumnSetOption", "attributeOptions", "attributeOption", "addConstraintSpecification", 
		"renameColumnSpecification", "renameConstraint", "storageParameterWithValue", 
		"storageParameter", "alterTableNameExists", "renameTableSpecification_", 
		"newTableName", "usingIndexType", "tableConstraint", "tableConstraintOption", 
		"excludeElement", "schemaName", "tableName", "columnName", "collationName", 
		"indexName", "alias", "dataTypeLength", "primaryKey", "columnNames", "exprs", 
		"exprList", "expr", "exprRecursive", "booleanPrimary", "comparisonOperator", 
		"predicate", "bitExpr", "simpleExpr", "functionCall", "distinct", "intervalExpr", 
		"caseExpress", "privateExprOfDb", "variable", "literal", "question", "number", 
		"string", "subquery", "collateClause", "orderByClause", "orderByItem", 
		"asterisk", "columnDefinition", "columnConstraint", "constraintClause", 
		"columnConstraintOption", "checkOption", "defaultExpr", "sequenceOptions", 
		"sequenceOption", "indexParameters", "action", "foreignKeyOnAction", "foreignKeyOn", 
		"constraintOptionalParam", "dataType", "dataTypeName_", "intervalFields", 
		"intervalField", "pgExpr", "aggregateExpression", "filterClause", "asteriskWithParen", 
		"windowFunction", "windowFunctionWithClause", "windowDefinition", "operator", 
		"frameClause", "frameStart", "frameEnd", "castExpr", "castExprWithCOLON_", 
		"collateExpr", "arrayConstructorWithCast", "arrayConstructor", "extractFromFunction", 
		"ignoredIdentifier_", "ignoredIdentifiers_", "matchNone", "setTransaction", 
		"beginTransaction", "commit", "rollback", "savepoint", "grant", "revoke", 
		"privilegeClause_", "roleClause_", "optionForClause_", "privileges_", 
		"privilegeType_", "onObjectClause_", "createUser", "dropUser", "alterUser", 
		"createRole", "dropRole", "alterRole", "show", "setParam", "scope", "setClause", 
		"timeZoneType", "resetParam"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'Default does not match anything'", null, null, null, null, null, 
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
		null, null, null, null, null, null, null, null, null, null, null, "'DO NOT MATCH ANY THING, JUST FOR GENERATOR'", 
		"'&&'", "'||'", "'!'", "'~'", "'|'", "'&'", "'<<'", "'>>'", "'^'", "'%'", 
		"':'", "'+'", "'-'", "'*'", "'/'", "'\\'", "'.'", "'.*'", "'<=>'", "'=='", 
		"'='", null, "'>'", "'>='", "'<'", "'<='", "'#'", "'('", "')'", "'{'", 
		"'}'", "'['", "']'", "','", "'\"'", "'''", "'`'", "'?'", "'@'", "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "WS", "ALL", "AND", "ANY", "ASC", "ADMIN", "BETWEEN", "BINARY", 
		"BY", "DATE", "DESC", "DISTINCT", "ESCAPE", "EXISTS", "FALSE", "FROM", 
		"GROUP", "HAVING", "IN", "IS", "KEY", "LIKE", "LIMIT", "MOD", "NOT", "NULL", 
		"OFFSET", "OR", "ORDER", "PARTITION", "PRIMARY", "REGEXP", "ROW", "SET", 
		"SOUNDS", "TIME", "TIMESTAMP", "TRUE", "UNION", "UNKNOWN", "WHERE", "WITH", 
		"XOR", "ADD", "ALTER", "ALWAYS", "AS", "CASCADE", "CHECK", "COLUMN", "COMMIT", 
		"CONSTRAINT", "CREATE", "CURRENT", "DAY", "DEFAULT", "DELETE", "DISABLE", 
		"DROP", "ENABLE", "FOR", "FOREIGN", "FUNCTION", "GENERATED", "GRANT", 
		"INDEX", "ISOLATION", "LEVEL", "NO", "ON", "OPTION", "PRIVILEGES", "READ", 
		"REFERENCES", "REVOKE", "ROLE", "ROLLBACK", "ROWS", "START", "TABLE", 
		"TO", "TRANSACTION", "TRUNCATE", "UNIQUE", "USER", "YEAR", "ACTION", "ARRAY", 
		"BEGIN", "BRIN", "BTREE", "CACHE", "CAST", "CHARACTERISTICS", "CLUSTER", 
		"COLLATE", "COMMENTS", "CONCURRENTLY", "CONNECT", "CONSTRAINTS", "CURRENT_TIMESTAMP", 
		"CURRENT_USER", "CYCLE", "DATA", "DATABASE", "DEFAULTS", "DEFERRABLE", 
		"DEFERRED", "DEPENDS", "DOMAIN", "EXCLUDING", "EXECUTE", "EXTENDED", "EXTENSION", 
		"EXTERNAL", "EXTRACT", "FILTER", "FIRST", "FOLLOWING", "FORCE", "FULL", 
		"GIN", "GIST", "GLOBAL", "HASH", "HOUR", "IDENTITY", "IF", "IMMEDIATE", 
		"INCLUDING", "INCREMENT", "INDEXES", "INHERIT", "INHERITS", "INITIALLY", 
		"INSERT", "LANGUAGE", "LARGE", "LAST", "LOCAL", "LOGGED", "MAIN", "MATCH", 
		"MAXVALUE", "MINUTE", "MINVALUE", "MONTH", "NOTHING", "NULLS", "OBJECT", 
		"OF", "OIDS", "ONLY", "OVER", "OWNED", "OWNER", "PARTIAL", "PLAIN", "PRECEDING", 
		"PROCEDURE", "RANGE", "RENAME", "REPLICA", "RESET", "RESTART", "RESTRICT", 
		"ROUTINE", "RULE", "SAVEPOINT", "SCHEMA", "SECOND", "SECURITY", "SELECT", 
		"SEQUENCE", "SESSION", "SESSION_USER", "SHOW", "SIMPLE", "SPGIST", "STATISTICS", 
		"STORAGE", "TABLESPACE", "TEMP", "TEMPORARY", "TRIGGER", "TYPE", "UNBOUNDED", 
		"UNLOGGED", "UPDATE", "USAGE", "USING", "VALID", "VALIDATE", "WITHIN", 
		"WITHOUT", "ZONE", "FOR_GENERATOR", "AND_", "OR_", "NOT_", "TILDE_", "VERTICAL_BAR_", 
		"AMPERSAND_", "SIGNED_LEFT_SHIFT_", "SIGNED_RIGHT_SHIFT_", "CARET_", "MOD_", 
		"COLON_", "PLUS_", "MINUS_", "ASTERISK_", "SLASH_", "BACKSLASH_", "DOT_", 
		"DOT_ASTERISK_", "SAFE_EQ_", "DEQ_", "EQ_", "NEQ_", "GT_", "GTE_", "LT_", 
		"LTE_", "POUND_", "LP_", "RP_", "LBE_", "RBE_", "LBT_", "RBT_", "COMMA_", 
		"DQ_", "SQ_", "BQ_", "QUESTION_", "AT_", "SEMI_", "IDENTIFIER_", "STRING_", 
		"NUMBER_", "HEX_DIGIT_", "BIT_NUM_"
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
	public String getGrammarFileName() { return "PostgreSQLStatement.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PostgreSQLStatementParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ExecuteContext extends ParserRuleContext {
		public CreateIndexContext createIndex() {
			return getRuleContext(CreateIndexContext.class,0);
		}
		public AlterIndexContext alterIndex() {
			return getRuleContext(AlterIndexContext.class,0);
		}
		public DropIndexContext dropIndex() {
			return getRuleContext(DropIndexContext.class,0);
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
		public SetTransactionContext setTransaction() {
			return getRuleContext(SetTransactionContext.class,0);
		}
		public BeginTransactionContext beginTransaction() {
			return getRuleContext(BeginTransactionContext.class,0);
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
		public CreateRoleContext createRole() {
			return getRuleContext(CreateRoleContext.class,0);
		}
		public DropRoleContext dropRole() {
			return getRuleContext(DropRoleContext.class,0);
		}
		public AlterRoleContext alterRole() {
			return getRuleContext(AlterRoleContext.class,0);
		}
		public ShowContext show() {
			return getRuleContext(ShowContext.class,0);
		}
		public SetParamContext setParam() {
			return getRuleContext(SetParamContext.class,0);
		}
		public ResetParamContext resetParam() {
			return getRuleContext(ResetParamContext.class,0);
		}
		public TerminalNode SEMI_() { return getToken(PostgreSQLStatementParser.SEMI_, 0); }
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
			setState(297);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(274);
				createIndex();
				}
				break;
			case 2:
				{
				setState(275);
				alterIndex();
				}
				break;
			case 3:
				{
				setState(276);
				dropIndex();
				}
				break;
			case 4:
				{
				setState(277);
				createTable();
				}
				break;
			case 5:
				{
				setState(278);
				alterTable();
				}
				break;
			case 6:
				{
				setState(279);
				dropTable();
				}
				break;
			case 7:
				{
				setState(280);
				truncateTable();
				}
				break;
			case 8:
				{
				setState(281);
				setTransaction();
				}
				break;
			case 9:
				{
				setState(282);
				beginTransaction();
				}
				break;
			case 10:
				{
				setState(283);
				commit();
				}
				break;
			case 11:
				{
				setState(284);
				rollback();
				}
				break;
			case 12:
				{
				setState(285);
				savepoint();
				}
				break;
			case 13:
				{
				setState(286);
				grant();
				}
				break;
			case 14:
				{
				setState(287);
				revoke();
				}
				break;
			case 15:
				{
				setState(288);
				createUser();
				}
				break;
			case 16:
				{
				setState(289);
				dropUser();
				}
				break;
			case 17:
				{
				setState(290);
				alterUser();
				}
				break;
			case 18:
				{
				setState(291);
				createRole();
				}
				break;
			case 19:
				{
				setState(292);
				dropRole();
				}
				break;
			case 20:
				{
				setState(293);
				alterRole();
				}
				break;
			case 21:
				{
				setState(294);
				show();
				}
				break;
			case 22:
				{
				setState(295);
				setParam();
				}
				break;
			case 23:
				{
				setState(296);
				resetParam();
				}
				break;
			}
			setState(300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI_) {
				{
				setState(299);
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

	public static class CreateIndexContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(PostgreSQLStatementParser.CREATE, 0); }
		public TerminalNode INDEX() { return getToken(PostgreSQLStatementParser.INDEX, 0); }
		public TerminalNode ON() { return getToken(PostgreSQLStatementParser.ON, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode UNIQUE() { return getToken(PostgreSQLStatementParser.UNIQUE, 0); }
		public TerminalNode CONCURRENTLY() { return getToken(PostgreSQLStatementParser.CONCURRENTLY, 0); }
		public IndexNameContext indexName() {
			return getRuleContext(IndexNameContext.class,0);
		}
		public TerminalNode IF() { return getToken(PostgreSQLStatementParser.IF, 0); }
		public TerminalNode NOT() { return getToken(PostgreSQLStatementParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(PostgreSQLStatementParser.EXISTS, 0); }
		public CreateIndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createIndex; }
	}

	public final CreateIndexContext createIndex() throws RecognitionException {
		CreateIndexContext _localctx = new CreateIndexContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_createIndex);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			match(CREATE);
			setState(304);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==UNIQUE) {
				{
				setState(303);
				match(UNIQUE);
				}
			}

			setState(306);
			match(INDEX);
			setState(308);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONCURRENTLY) {
				{
				setState(307);
				match(CONCURRENTLY);
				}
			}

			setState(316);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF || _la==IDENTIFIER_) {
				{
				setState(313);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(310);
					match(IF);
					setState(311);
					match(NOT);
					setState(312);
					match(EXISTS);
					}
				}

				setState(315);
				indexName();
				}
			}

			setState(318);
			match(ON);
			setState(319);
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
		public TerminalNode DROP() { return getToken(PostgreSQLStatementParser.DROP, 0); }
		public TerminalNode INDEX() { return getToken(PostgreSQLStatementParser.INDEX, 0); }
		public List<IndexNameContext> indexName() {
			return getRuleContexts(IndexNameContext.class);
		}
		public IndexNameContext indexName(int i) {
			return getRuleContext(IndexNameContext.class,i);
		}
		public TerminalNode CONCURRENTLY() { return getToken(PostgreSQLStatementParser.CONCURRENTLY, 0); }
		public TerminalNode IF() { return getToken(PostgreSQLStatementParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(PostgreSQLStatementParser.EXISTS, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(PostgreSQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(PostgreSQLStatementParser.COMMA_, i);
		}
		public DropIndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropIndex; }
	}

	public final DropIndexContext dropIndex() throws RecognitionException {
		DropIndexContext _localctx = new DropIndexContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_dropIndex);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			match(DROP);
			setState(322);
			match(INDEX);
			setState(324);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONCURRENTLY) {
				{
				setState(323);
				match(CONCURRENTLY);
				}
			}

			setState(328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(326);
				match(IF);
				setState(327);
				match(EXISTS);
				}
			}

			setState(330);
			indexName();
			setState(335);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(331);
				match(COMMA_);
				setState(332);
				indexName();
				}
				}
				setState(337);
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

	public static class AlterIndexContext extends ParserRuleContext {
		public AlterIndexNameContext alterIndexName() {
			return getRuleContext(AlterIndexNameContext.class,0);
		}
		public RenameIndexSpecificationContext renameIndexSpecification() {
			return getRuleContext(RenameIndexSpecificationContext.class,0);
		}
		public AlterIndexDependsOnExtensionContext alterIndexDependsOnExtension() {
			return getRuleContext(AlterIndexDependsOnExtensionContext.class,0);
		}
		public AlterIndexSetTableSpaceContext alterIndexSetTableSpace() {
			return getRuleContext(AlterIndexSetTableSpaceContext.class,0);
		}
		public AlterIndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterIndex; }
	}

	public final AlterIndexContext alterIndex() throws RecognitionException {
		AlterIndexContext _localctx = new AlterIndexContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_alterIndex);
		try {
			setState(343);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(338);
				alterIndexName();
				setState(339);
				renameIndexSpecification();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(341);
				alterIndexDependsOnExtension();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(342);
				alterIndexSetTableSpace();
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

	public static class CreateTableContext extends ParserRuleContext {
		public CreateTableHeaderContext createTableHeader() {
			return getRuleContext(CreateTableHeaderContext.class,0);
		}
		public CreateDefinitionsContext createDefinitions() {
			return getRuleContext(CreateDefinitionsContext.class,0);
		}
		public InheritClauseContext inheritClause() {
			return getRuleContext(InheritClauseContext.class,0);
		}
		public CreateTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTable; }
	}

	public final CreateTableContext createTable() throws RecognitionException {
		CreateTableContext _localctx = new CreateTableContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_createTable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			createTableHeader();
			setState(346);
			createDefinitions();
			setState(348);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INHERITS) {
				{
				setState(347);
				inheritClause();
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

	public static class AlterTableContext extends ParserRuleContext {
		public AlterTableNameWithAsteriskContext alterTableNameWithAsterisk() {
			return getRuleContext(AlterTableNameWithAsteriskContext.class,0);
		}
		public AlterTableActionsContext alterTableActions() {
			return getRuleContext(AlterTableActionsContext.class,0);
		}
		public RenameColumnSpecificationContext renameColumnSpecification() {
			return getRuleContext(RenameColumnSpecificationContext.class,0);
		}
		public RenameConstraintContext renameConstraint() {
			return getRuleContext(RenameConstraintContext.class,0);
		}
		public AlterTableNameExistsContext alterTableNameExists() {
			return getRuleContext(AlterTableNameExistsContext.class,0);
		}
		public RenameTableSpecification_Context renameTableSpecification_() {
			return getRuleContext(RenameTableSpecification_Context.class,0);
		}
		public AlterTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterTable; }
	}

	public final AlterTableContext alterTable() throws RecognitionException {
		AlterTableContext _localctx = new AlterTableContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_alterTable);
		try {
			setState(359);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(350);
				alterTableNameWithAsterisk();
				setState(354);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(351);
					alterTableActions();
					}
					break;
				case 2:
					{
					setState(352);
					renameColumnSpecification();
					}
					break;
				case 3:
					{
					setState(353);
					renameConstraint();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(356);
				alterTableNameExists();
				setState(357);
				renameTableSpecification_();
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

	public static class TruncateTableContext extends ParserRuleContext {
		public TerminalNode TRUNCATE() { return getToken(PostgreSQLStatementParser.TRUNCATE, 0); }
		public TableNamePartsContext tableNameParts() {
			return getRuleContext(TableNamePartsContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(PostgreSQLStatementParser.TABLE, 0); }
		public TerminalNode ONLY() { return getToken(PostgreSQLStatementParser.ONLY, 0); }
		public TruncateTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_truncateTable; }
	}

	public final TruncateTableContext truncateTable() throws RecognitionException {
		TruncateTableContext _localctx = new TruncateTableContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_truncateTable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			match(TRUNCATE);
			setState(363);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TABLE) {
				{
				setState(362);
				match(TABLE);
				}
			}

			setState(366);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ONLY) {
				{
				setState(365);
				match(ONLY);
				}
			}

			setState(368);
			tableNameParts();
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
		public TerminalNode DROP() { return getToken(PostgreSQLStatementParser.DROP, 0); }
		public TerminalNode TABLE() { return getToken(PostgreSQLStatementParser.TABLE, 0); }
		public List<TableNameContext> tableName() {
			return getRuleContexts(TableNameContext.class);
		}
		public TableNameContext tableName(int i) {
			return getRuleContext(TableNameContext.class,i);
		}
		public TerminalNode IF() { return getToken(PostgreSQLStatementParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(PostgreSQLStatementParser.EXISTS, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(PostgreSQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(PostgreSQLStatementParser.COMMA_, i);
		}
		public DropTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropTable; }
	}

	public final DropTableContext dropTable() throws RecognitionException {
		DropTableContext _localctx = new DropTableContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_dropTable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			match(DROP);
			setState(371);
			match(TABLE);
			setState(374);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(372);
				match(IF);
				setState(373);
				match(EXISTS);
				}
			}

			setState(376);
			tableName();
			setState(381);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(377);
				match(COMMA_);
				setState(378);
				tableName();
				}
				}
				setState(383);
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

	public static class AlterIndexNameContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(PostgreSQLStatementParser.ALTER, 0); }
		public TerminalNode INDEX() { return getToken(PostgreSQLStatementParser.INDEX, 0); }
		public IndexNameContext indexName() {
			return getRuleContext(IndexNameContext.class,0);
		}
		public TerminalNode IF() { return getToken(PostgreSQLStatementParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(PostgreSQLStatementParser.EXISTS, 0); }
		public AlterIndexNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterIndexName; }
	}

	public final AlterIndexNameContext alterIndexName() throws RecognitionException {
		AlterIndexNameContext _localctx = new AlterIndexNameContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_alterIndexName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			match(ALTER);
			setState(385);
			match(INDEX);
			setState(388);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(386);
				match(IF);
				setState(387);
				match(EXISTS);
				}
			}

			setState(390);
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

	public static class RenameIndexSpecificationContext extends ParserRuleContext {
		public TerminalNode RENAME() { return getToken(PostgreSQLStatementParser.RENAME, 0); }
		public TerminalNode TO() { return getToken(PostgreSQLStatementParser.TO, 0); }
		public IndexNameContext indexName() {
			return getRuleContext(IndexNameContext.class,0);
		}
		public RenameIndexSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_renameIndexSpecification; }
	}

	public final RenameIndexSpecificationContext renameIndexSpecification() throws RecognitionException {
		RenameIndexSpecificationContext _localctx = new RenameIndexSpecificationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_renameIndexSpecification);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			match(RENAME);
			setState(393);
			match(TO);
			setState(394);
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

	public static class AlterIndexDependsOnExtensionContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(PostgreSQLStatementParser.ALTER, 0); }
		public TerminalNode INDEX() { return getToken(PostgreSQLStatementParser.INDEX, 0); }
		public IndexNameContext indexName() {
			return getRuleContext(IndexNameContext.class,0);
		}
		public TerminalNode DEPENDS() { return getToken(PostgreSQLStatementParser.DEPENDS, 0); }
		public TerminalNode ON() { return getToken(PostgreSQLStatementParser.ON, 0); }
		public TerminalNode EXTENSION() { return getToken(PostgreSQLStatementParser.EXTENSION, 0); }
		public IgnoredIdentifier_Context ignoredIdentifier_() {
			return getRuleContext(IgnoredIdentifier_Context.class,0);
		}
		public AlterIndexDependsOnExtensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterIndexDependsOnExtension; }
	}

	public final AlterIndexDependsOnExtensionContext alterIndexDependsOnExtension() throws RecognitionException {
		AlterIndexDependsOnExtensionContext _localctx = new AlterIndexDependsOnExtensionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_alterIndexDependsOnExtension);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			match(ALTER);
			setState(397);
			match(INDEX);
			setState(398);
			indexName();
			setState(399);
			match(DEPENDS);
			setState(400);
			match(ON);
			setState(401);
			match(EXTENSION);
			setState(402);
			ignoredIdentifier_();
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

	public static class AlterIndexSetTableSpaceContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(PostgreSQLStatementParser.ALTER, 0); }
		public TerminalNode INDEX() { return getToken(PostgreSQLStatementParser.INDEX, 0); }
		public TerminalNode ALL() { return getToken(PostgreSQLStatementParser.ALL, 0); }
		public TerminalNode IN() { return getToken(PostgreSQLStatementParser.IN, 0); }
		public TerminalNode TABLESPACE() { return getToken(PostgreSQLStatementParser.TABLESPACE, 0); }
		public IndexNameContext indexName() {
			return getRuleContext(IndexNameContext.class,0);
		}
		public TerminalNode OWNED() { return getToken(PostgreSQLStatementParser.OWNED, 0); }
		public TerminalNode BY() { return getToken(PostgreSQLStatementParser.BY, 0); }
		public IgnoredIdentifiers_Context ignoredIdentifiers_() {
			return getRuleContext(IgnoredIdentifiers_Context.class,0);
		}
		public AlterIndexSetTableSpaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterIndexSetTableSpace; }
	}

	public final AlterIndexSetTableSpaceContext alterIndexSetTableSpace() throws RecognitionException {
		AlterIndexSetTableSpaceContext _localctx = new AlterIndexSetTableSpaceContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_alterIndexSetTableSpace);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(404);
			match(ALTER);
			setState(405);
			match(INDEX);
			setState(406);
			match(ALL);
			setState(407);
			match(IN);
			setState(408);
			match(TABLESPACE);
			setState(409);
			indexName();
			setState(413);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OWNED) {
				{
				setState(410);
				match(OWNED);
				setState(411);
				match(BY);
				setState(412);
				ignoredIdentifiers_();
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

	public static class TableNamePartsContext extends ParserRuleContext {
		public List<TableNamePartContext> tableNamePart() {
			return getRuleContexts(TableNamePartContext.class);
		}
		public TableNamePartContext tableNamePart(int i) {
			return getRuleContext(TableNamePartContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(PostgreSQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(PostgreSQLStatementParser.COMMA_, i);
		}
		public TableNamePartsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableNameParts; }
	}

	public final TableNamePartsContext tableNameParts() throws RecognitionException {
		TableNamePartsContext _localctx = new TableNamePartsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_tableNameParts);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(415);
			tableNamePart();
			setState(420);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(416);
				match(COMMA_);
				setState(417);
				tableNamePart();
				}
				}
				setState(422);
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

	public static class TableNamePartContext extends ParserRuleContext {
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode ASTERISK_() { return getToken(PostgreSQLStatementParser.ASTERISK_, 0); }
		public TableNamePartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableNamePart; }
	}

	public final TableNamePartContext tableNamePart() throws RecognitionException {
		TableNamePartContext _localctx = new TableNamePartContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_tableNamePart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423);
			tableName();
			setState(425);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASTERISK_) {
				{
				setState(424);
				match(ASTERISK_);
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

	public static class CreateTableHeaderContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(PostgreSQLStatementParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(PostgreSQLStatementParser.TABLE, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode UNLOGGED() { return getToken(PostgreSQLStatementParser.UNLOGGED, 0); }
		public TerminalNode IF() { return getToken(PostgreSQLStatementParser.IF, 0); }
		public TerminalNode NOT() { return getToken(PostgreSQLStatementParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(PostgreSQLStatementParser.EXISTS, 0); }
		public TerminalNode TEMPORARY() { return getToken(PostgreSQLStatementParser.TEMPORARY, 0); }
		public TerminalNode TEMP() { return getToken(PostgreSQLStatementParser.TEMP, 0); }
		public TerminalNode GLOBAL() { return getToken(PostgreSQLStatementParser.GLOBAL, 0); }
		public TerminalNode LOCAL() { return getToken(PostgreSQLStatementParser.LOCAL, 0); }
		public CreateTableHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTableHeader; }
	}

	public final CreateTableHeaderContext createTableHeader() throws RecognitionException {
		CreateTableHeaderContext _localctx = new CreateTableHeaderContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_createTableHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(427);
			match(CREATE);
			setState(433);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GLOBAL:
			case LOCAL:
			case TEMP:
			case TEMPORARY:
				{
				setState(429);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GLOBAL || _la==LOCAL) {
					{
					setState(428);
					_la = _input.LA(1);
					if ( !(_la==GLOBAL || _la==LOCAL) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(431);
				_la = _input.LA(1);
				if ( !(_la==TEMP || _la==TEMPORARY) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case UNLOGGED:
				{
				setState(432);
				match(UNLOGGED);
				}
				break;
			case TABLE:
				break;
			default:
				break;
			}
			setState(435);
			match(TABLE);
			setState(439);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(436);
				match(IF);
				setState(437);
				match(NOT);
				setState(438);
				match(EXISTS);
				}
			}

			setState(441);
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

	public static class CreateDefinitionsContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(PostgreSQLStatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(PostgreSQLStatementParser.RP_, 0); }
		public List<CreateDefinitionContext> createDefinition() {
			return getRuleContexts(CreateDefinitionContext.class);
		}
		public CreateDefinitionContext createDefinition(int i) {
			return getRuleContext(CreateDefinitionContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(PostgreSQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(PostgreSQLStatementParser.COMMA_, i);
		}
		public CreateDefinitionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createDefinitions; }
	}

	public final CreateDefinitionsContext createDefinitions() throws RecognitionException {
		CreateDefinitionsContext _localctx = new CreateDefinitionsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_createDefinitions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(443);
			match(LP_);
			setState(452);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 22)) & ~0x3f) == 0 && ((1L << (_la - 22)) & ((1L << (KEY - 22)) | (1L << (LIKE - 22)) | (1L << (PRIMARY - 22)) | (1L << (CHECK - 22)) | (1L << (CONSTRAINT - 22)) | (1L << (FOREIGN - 22)) | (1L << (UNIQUE - 22)))) != 0) || _la==IDENTIFIER_) {
				{
				setState(444);
				createDefinition();
				setState(449);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(445);
					match(COMMA_);
					setState(446);
					createDefinition();
					}
					}
					setState(451);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(454);
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

	public static class CreateDefinitionContext extends ParserRuleContext {
		public ColumnDefinitionContext columnDefinition() {
			return getRuleContext(ColumnDefinitionContext.class,0);
		}
		public TableConstraintContext tableConstraint() {
			return getRuleContext(TableConstraintContext.class,0);
		}
		public TerminalNode LIKE() { return getToken(PostgreSQLStatementParser.LIKE, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public List<LikeOptionContext> likeOption() {
			return getRuleContexts(LikeOptionContext.class);
		}
		public LikeOptionContext likeOption(int i) {
			return getRuleContext(LikeOptionContext.class,i);
		}
		public CreateDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createDefinition; }
	}

	public final CreateDefinitionContext createDefinition() throws RecognitionException {
		CreateDefinitionContext _localctx = new CreateDefinitionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_createDefinition);
		int _la;
		try {
			setState(466);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER_:
				enterOuterAlt(_localctx, 1);
				{
				setState(456);
				columnDefinition();
				}
				break;
			case KEY:
			case PRIMARY:
			case CHECK:
			case CONSTRAINT:
			case FOREIGN:
			case UNIQUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(457);
				tableConstraint();
				}
				break;
			case LIKE:
				enterOuterAlt(_localctx, 3);
				{
				setState(458);
				match(LIKE);
				setState(459);
				tableName();
				setState(463);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==EXCLUDING || _la==INCLUDING) {
					{
					{
					setState(460);
					likeOption();
					}
					}
					setState(465);
					_errHandler.sync(this);
					_la = _input.LA(1);
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

	public static class LikeOptionContext extends ParserRuleContext {
		public TerminalNode INCLUDING() { return getToken(PostgreSQLStatementParser.INCLUDING, 0); }
		public TerminalNode EXCLUDING() { return getToken(PostgreSQLStatementParser.EXCLUDING, 0); }
		public TerminalNode COMMENTS() { return getToken(PostgreSQLStatementParser.COMMENTS, 0); }
		public TerminalNode CONSTRAINTS() { return getToken(PostgreSQLStatementParser.CONSTRAINTS, 0); }
		public TerminalNode DEFAULTS() { return getToken(PostgreSQLStatementParser.DEFAULTS, 0); }
		public TerminalNode IDENTITY() { return getToken(PostgreSQLStatementParser.IDENTITY, 0); }
		public TerminalNode INDEXES() { return getToken(PostgreSQLStatementParser.INDEXES, 0); }
		public TerminalNode STATISTICS() { return getToken(PostgreSQLStatementParser.STATISTICS, 0); }
		public TerminalNode STORAGE() { return getToken(PostgreSQLStatementParser.STORAGE, 0); }
		public TerminalNode ALL() { return getToken(PostgreSQLStatementParser.ALL, 0); }
		public LikeOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_likeOption; }
	}

	public final LikeOptionContext likeOption() throws RecognitionException {
		LikeOptionContext _localctx = new LikeOptionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_likeOption);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(468);
			_la = _input.LA(1);
			if ( !(_la==EXCLUDING || _la==INCLUDING) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(469);
			_la = _input.LA(1);
			if ( !(_la==ALL || ((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & ((1L << (COMMENTS - 98)) | (1L << (CONSTRAINTS - 98)) | (1L << (DEFAULTS - 98)) | (1L << (IDENTITY - 98)) | (1L << (INDEXES - 98)))) != 0) || _la==STATISTICS || _la==STORAGE) ) {
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

	public static class InheritClauseContext extends ParserRuleContext {
		public TerminalNode INHERITS() { return getToken(PostgreSQLStatementParser.INHERITS, 0); }
		public TerminalNode LP_() { return getToken(PostgreSQLStatementParser.LP_, 0); }
		public List<TableNameContext> tableName() {
			return getRuleContexts(TableNameContext.class);
		}
		public TableNameContext tableName(int i) {
			return getRuleContext(TableNameContext.class,i);
		}
		public TerminalNode RP_() { return getToken(PostgreSQLStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(PostgreSQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(PostgreSQLStatementParser.COMMA_, i);
		}
		public InheritClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inheritClause; }
	}

	public final InheritClauseContext inheritClause() throws RecognitionException {
		InheritClauseContext _localctx = new InheritClauseContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_inheritClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(471);
			match(INHERITS);
			setState(472);
			match(LP_);
			setState(473);
			tableName();
			setState(478);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(474);
				match(COMMA_);
				setState(475);
				tableName();
				}
				}
				setState(480);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(481);
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

	public static class AlterTableNameWithAsteriskContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(PostgreSQLStatementParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(PostgreSQLStatementParser.TABLE, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode IF() { return getToken(PostgreSQLStatementParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(PostgreSQLStatementParser.EXISTS, 0); }
		public TerminalNode ONLY() { return getToken(PostgreSQLStatementParser.ONLY, 0); }
		public TerminalNode ASTERISK_() { return getToken(PostgreSQLStatementParser.ASTERISK_, 0); }
		public AlterTableNameWithAsteriskContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterTableNameWithAsterisk; }
	}

	public final AlterTableNameWithAsteriskContext alterTableNameWithAsterisk() throws RecognitionException {
		AlterTableNameWithAsteriskContext _localctx = new AlterTableNameWithAsteriskContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_alterTableNameWithAsterisk);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(483);
			match(ALTER);
			setState(484);
			match(TABLE);
			setState(487);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(485);
				match(IF);
				setState(486);
				match(EXISTS);
				}
			}

			setState(490);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ONLY) {
				{
				setState(489);
				match(ONLY);
				}
			}

			setState(492);
			tableName();
			setState(494);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASTERISK_) {
				{
				setState(493);
				match(ASTERISK_);
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

	public static class AlterTableActionsContext extends ParserRuleContext {
		public List<AlterTableActionContext> alterTableAction() {
			return getRuleContexts(AlterTableActionContext.class);
		}
		public AlterTableActionContext alterTableAction(int i) {
			return getRuleContext(AlterTableActionContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(PostgreSQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(PostgreSQLStatementParser.COMMA_, i);
		}
		public AlterTableActionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterTableActions; }
	}

	public final AlterTableActionsContext alterTableActions() throws RecognitionException {
		AlterTableActionsContext _localctx = new AlterTableActionsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_alterTableActions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(496);
			alterTableAction();
			setState(501);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(497);
				match(COMMA_);
				setState(498);
				alterTableAction();
				}
				}
				setState(503);
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

	public static class AlterTableActionContext extends ParserRuleContext {
		public AddColumnSpecificationContext addColumnSpecification() {
			return getRuleContext(AddColumnSpecificationContext.class,0);
		}
		public DropColumnSpecificationContext dropColumnSpecification() {
			return getRuleContext(DropColumnSpecificationContext.class,0);
		}
		public ModifyColumnSpecificationContext modifyColumnSpecification() {
			return getRuleContext(ModifyColumnSpecificationContext.class,0);
		}
		public AddConstraintSpecificationContext addConstraintSpecification() {
			return getRuleContext(AddConstraintSpecificationContext.class,0);
		}
		public TerminalNode ALTER() { return getToken(PostgreSQLStatementParser.ALTER, 0); }
		public TerminalNode CONSTRAINT() { return getToken(PostgreSQLStatementParser.CONSTRAINT, 0); }
		public IgnoredIdentifier_Context ignoredIdentifier_() {
			return getRuleContext(IgnoredIdentifier_Context.class,0);
		}
		public ConstraintOptionalParamContext constraintOptionalParam() {
			return getRuleContext(ConstraintOptionalParamContext.class,0);
		}
		public TerminalNode VALIDATE() { return getToken(PostgreSQLStatementParser.VALIDATE, 0); }
		public TerminalNode DROP() { return getToken(PostgreSQLStatementParser.DROP, 0); }
		public TerminalNode IF() { return getToken(PostgreSQLStatementParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(PostgreSQLStatementParser.EXISTS, 0); }
		public TerminalNode RESTRICT() { return getToken(PostgreSQLStatementParser.RESTRICT, 0); }
		public TerminalNode CASCADE() { return getToken(PostgreSQLStatementParser.CASCADE, 0); }
		public TerminalNode TRIGGER() { return getToken(PostgreSQLStatementParser.TRIGGER, 0); }
		public TerminalNode DISABLE() { return getToken(PostgreSQLStatementParser.DISABLE, 0); }
		public TerminalNode ENABLE() { return getToken(PostgreSQLStatementParser.ENABLE, 0); }
		public TerminalNode ALL() { return getToken(PostgreSQLStatementParser.ALL, 0); }
		public TerminalNode USER() { return getToken(PostgreSQLStatementParser.USER, 0); }
		public TerminalNode REPLICA() { return getToken(PostgreSQLStatementParser.REPLICA, 0); }
		public TerminalNode ALWAYS() { return getToken(PostgreSQLStatementParser.ALWAYS, 0); }
		public TerminalNode RULE() { return getToken(PostgreSQLStatementParser.RULE, 0); }
		public TerminalNode ROW() { return getToken(PostgreSQLStatementParser.ROW, 0); }
		public TerminalNode LEVEL() { return getToken(PostgreSQLStatementParser.LEVEL, 0); }
		public TerminalNode SECURITY() { return getToken(PostgreSQLStatementParser.SECURITY, 0); }
		public TerminalNode FORCE() { return getToken(PostgreSQLStatementParser.FORCE, 0); }
		public TerminalNode NO() { return getToken(PostgreSQLStatementParser.NO, 0); }
		public TerminalNode CLUSTER() { return getToken(PostgreSQLStatementParser.CLUSTER, 0); }
		public TerminalNode ON() { return getToken(PostgreSQLStatementParser.ON, 0); }
		public IndexNameContext indexName() {
			return getRuleContext(IndexNameContext.class,0);
		}
		public TerminalNode SET() { return getToken(PostgreSQLStatementParser.SET, 0); }
		public TerminalNode WITHOUT() { return getToken(PostgreSQLStatementParser.WITHOUT, 0); }
		public TerminalNode OIDS() { return getToken(PostgreSQLStatementParser.OIDS, 0); }
		public TerminalNode WITH() { return getToken(PostgreSQLStatementParser.WITH, 0); }
		public TerminalNode TABLESPACE() { return getToken(PostgreSQLStatementParser.TABLESPACE, 0); }
		public TerminalNode LOGGED() { return getToken(PostgreSQLStatementParser.LOGGED, 0); }
		public TerminalNode UNLOGGED() { return getToken(PostgreSQLStatementParser.UNLOGGED, 0); }
		public TerminalNode LP_() { return getToken(PostgreSQLStatementParser.LP_, 0); }
		public List<StorageParameterWithValueContext> storageParameterWithValue() {
			return getRuleContexts(StorageParameterWithValueContext.class);
		}
		public StorageParameterWithValueContext storageParameterWithValue(int i) {
			return getRuleContext(StorageParameterWithValueContext.class,i);
		}
		public TerminalNode RP_() { return getToken(PostgreSQLStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(PostgreSQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(PostgreSQLStatementParser.COMMA_, i);
		}
		public TerminalNode RESET() { return getToken(PostgreSQLStatementParser.RESET, 0); }
		public List<StorageParameterContext> storageParameter() {
			return getRuleContexts(StorageParameterContext.class);
		}
		public StorageParameterContext storageParameter(int i) {
			return getRuleContext(StorageParameterContext.class,i);
		}
		public TerminalNode INHERIT() { return getToken(PostgreSQLStatementParser.INHERIT, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode OF() { return getToken(PostgreSQLStatementParser.OF, 0); }
		public DataTypeName_Context dataTypeName_() {
			return getRuleContext(DataTypeName_Context.class,0);
		}
		public TerminalNode NOT() { return getToken(PostgreSQLStatementParser.NOT, 0); }
		public TerminalNode OWNER() { return getToken(PostgreSQLStatementParser.OWNER, 0); }
		public TerminalNode TO() { return getToken(PostgreSQLStatementParser.TO, 0); }
		public TerminalNode CURRENT_USER() { return getToken(PostgreSQLStatementParser.CURRENT_USER, 0); }
		public TerminalNode SESSION_USER() { return getToken(PostgreSQLStatementParser.SESSION_USER, 0); }
		public TerminalNode IDENTITY() { return getToken(PostgreSQLStatementParser.IDENTITY, 0); }
		public TerminalNode DEFAULT() { return getToken(PostgreSQLStatementParser.DEFAULT, 0); }
		public TerminalNode FULL() { return getToken(PostgreSQLStatementParser.FULL, 0); }
		public TerminalNode NOTHING() { return getToken(PostgreSQLStatementParser.NOTHING, 0); }
		public TerminalNode USING() { return getToken(PostgreSQLStatementParser.USING, 0); }
		public TerminalNode INDEX() { return getToken(PostgreSQLStatementParser.INDEX, 0); }
		public AlterTableActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterTableAction; }
	}

	public final AlterTableActionContext alterTableAction() throws RecognitionException {
		AlterTableActionContext _localctx = new AlterTableActionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_alterTableAction);
		int _la;
		try {
			setState(619);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(504);
				addColumnSpecification();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(505);
				dropColumnSpecification();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(506);
				modifyColumnSpecification();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(507);
				addConstraintSpecification();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(508);
				match(ALTER);
				setState(509);
				match(CONSTRAINT);
				setState(510);
				ignoredIdentifier_();
				setState(511);
				constraintOptionalParam();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(513);
				match(VALIDATE);
				setState(514);
				match(CONSTRAINT);
				setState(515);
				ignoredIdentifier_();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(516);
				match(DROP);
				setState(517);
				match(CONSTRAINT);
				setState(520);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(518);
					match(IF);
					setState(519);
					match(EXISTS);
					}
				}

				setState(522);
				ignoredIdentifier_();
				setState(524);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CASCADE || _la==RESTRICT) {
					{
					setState(523);
					_la = _input.LA(1);
					if ( !(_la==CASCADE || _la==RESTRICT) ) {
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
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(526);
				_la = _input.LA(1);
				if ( !(_la==DISABLE || _la==ENABLE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(527);
				match(TRIGGER);
				setState(531);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IDENTIFIER_:
					{
					setState(528);
					ignoredIdentifier_();
					}
					break;
				case ALL:
					{
					setState(529);
					match(ALL);
					}
					break;
				case USER:
					{
					setState(530);
					match(USER);
					}
					break;
				case EOF:
				case COMMA_:
				case SEMI_:
					break;
				default:
					break;
				}
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(533);
				match(ENABLE);
				setState(534);
				_la = _input.LA(1);
				if ( !(_la==ALWAYS || _la==REPLICA) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(535);
				match(TRIGGER);
				setState(536);
				ignoredIdentifier_();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(537);
				_la = _input.LA(1);
				if ( !(_la==DISABLE || _la==ENABLE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(538);
				match(RULE);
				setState(539);
				ignoredIdentifier_();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(540);
				match(ENABLE);
				setState(541);
				_la = _input.LA(1);
				if ( !(_la==ALWAYS || _la==REPLICA) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(542);
				match(RULE);
				setState(543);
				ignoredIdentifier_();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(550);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DISABLE:
					{
					setState(544);
					match(DISABLE);
					}
					break;
				case ENABLE:
					{
					setState(545);
					match(ENABLE);
					}
					break;
				case NO:
				case FORCE:
					{
					{
					setState(547);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==NO) {
						{
						setState(546);
						match(NO);
						}
					}

					setState(549);
					match(FORCE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(552);
				match(ROW);
				setState(553);
				match(LEVEL);
				setState(554);
				match(SECURITY);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(555);
				match(CLUSTER);
				setState(556);
				match(ON);
				setState(557);
				indexName();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(558);
				match(SET);
				setState(559);
				match(WITHOUT);
				setState(560);
				match(CLUSTER);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(561);
				match(SET);
				setState(562);
				_la = _input.LA(1);
				if ( !(_la==WITH || _la==WITHOUT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(563);
				match(OIDS);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(564);
				match(SET);
				setState(565);
				match(TABLESPACE);
				setState(566);
				ignoredIdentifier_();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(567);
				match(SET);
				setState(568);
				_la = _input.LA(1);
				if ( !(_la==LOGGED || _la==UNLOGGED) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(569);
				match(SET);
				setState(570);
				match(LP_);
				setState(571);
				storageParameterWithValue();
				setState(576);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(572);
					match(COMMA_);
					setState(573);
					storageParameterWithValue();
					}
					}
					setState(578);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(579);
				match(RP_);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(581);
				match(RESET);
				setState(582);
				match(LP_);
				setState(583);
				storageParameter();
				setState(588);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(584);
					match(COMMA_);
					setState(585);
					storageParameter();
					}
					}
					setState(590);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(591);
				match(RP_);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(593);
				match(INHERIT);
				setState(594);
				tableName();
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(595);
				match(NO);
				setState(596);
				match(INHERIT);
				setState(597);
				tableName();
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(598);
				match(OF);
				setState(599);
				dataTypeName_();
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(600);
				match(NOT);
				setState(601);
				match(OF);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(602);
				match(OWNER);
				setState(603);
				match(TO);
				setState(607);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IDENTIFIER_:
					{
					setState(604);
					ignoredIdentifier_();
					}
					break;
				case CURRENT_USER:
					{
					setState(605);
					match(CURRENT_USER);
					}
					break;
				case SESSION_USER:
					{
					setState(606);
					match(SESSION_USER);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(609);
				match(REPLICA);
				setState(610);
				match(IDENTITY);
				setState(617);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DEFAULT:
					{
					setState(611);
					match(DEFAULT);
					}
					break;
				case USING:
					{
					{
					setState(612);
					match(USING);
					setState(613);
					match(INDEX);
					setState(614);
					indexName();
					}
					}
					break;
				case FULL:
					{
					setState(615);
					match(FULL);
					}
					break;
				case NOTHING:
					{
					setState(616);
					match(NOTHING);
					}
					break;
				default:
					throw new NoViableAltException(this);
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

	public static class TableConstraintUsingIndexContext extends ParserRuleContext {
		public TerminalNode USING() { return getToken(PostgreSQLStatementParser.USING, 0); }
		public TerminalNode INDEX() { return getToken(PostgreSQLStatementParser.INDEX, 0); }
		public IndexNameContext indexName() {
			return getRuleContext(IndexNameContext.class,0);
		}
		public ConstraintOptionalParamContext constraintOptionalParam() {
			return getRuleContext(ConstraintOptionalParamContext.class,0);
		}
		public TerminalNode UNIQUE() { return getToken(PostgreSQLStatementParser.UNIQUE, 0); }
		public PrimaryKeyContext primaryKey() {
			return getRuleContext(PrimaryKeyContext.class,0);
		}
		public TerminalNode CONSTRAINT() { return getToken(PostgreSQLStatementParser.CONSTRAINT, 0); }
		public IgnoredIdentifier_Context ignoredIdentifier_() {
			return getRuleContext(IgnoredIdentifier_Context.class,0);
		}
		public TableConstraintUsingIndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableConstraintUsingIndex; }
	}

	public final TableConstraintUsingIndexContext tableConstraintUsingIndex() throws RecognitionException {
		TableConstraintUsingIndexContext _localctx = new TableConstraintUsingIndexContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_tableConstraintUsingIndex);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(623);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONSTRAINT) {
				{
				setState(621);
				match(CONSTRAINT);
				setState(622);
				ignoredIdentifier_();
				}
			}

			setState(627);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UNIQUE:
				{
				setState(625);
				match(UNIQUE);
				}
				break;
			case KEY:
			case PRIMARY:
				{
				setState(626);
				primaryKey();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(629);
			match(USING);
			setState(630);
			match(INDEX);
			setState(631);
			indexName();
			setState(632);
			constraintOptionalParam();
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
		public TerminalNode ADD() { return getToken(PostgreSQLStatementParser.ADD, 0); }
		public ColumnDefinitionContext columnDefinition() {
			return getRuleContext(ColumnDefinitionContext.class,0);
		}
		public TerminalNode COLUMN() { return getToken(PostgreSQLStatementParser.COLUMN, 0); }
		public TerminalNode IF() { return getToken(PostgreSQLStatementParser.IF, 0); }
		public TerminalNode NOT() { return getToken(PostgreSQLStatementParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(PostgreSQLStatementParser.EXISTS, 0); }
		public AddColumnSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addColumnSpecification; }
	}

	public final AddColumnSpecificationContext addColumnSpecification() throws RecognitionException {
		AddColumnSpecificationContext _localctx = new AddColumnSpecificationContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_addColumnSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(634);
			match(ADD);
			setState(636);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLUMN) {
				{
				setState(635);
				match(COLUMN);
				}
			}

			setState(641);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(638);
				match(IF);
				setState(639);
				match(NOT);
				setState(640);
				match(EXISTS);
				}
			}

			setState(643);
			columnDefinition();
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
		public TerminalNode DROP() { return getToken(PostgreSQLStatementParser.DROP, 0); }
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public TerminalNode COLUMN() { return getToken(PostgreSQLStatementParser.COLUMN, 0); }
		public TerminalNode IF() { return getToken(PostgreSQLStatementParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(PostgreSQLStatementParser.EXISTS, 0); }
		public TerminalNode RESTRICT() { return getToken(PostgreSQLStatementParser.RESTRICT, 0); }
		public TerminalNode CASCADE() { return getToken(PostgreSQLStatementParser.CASCADE, 0); }
		public DropColumnSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropColumnSpecification; }
	}

	public final DropColumnSpecificationContext dropColumnSpecification() throws RecognitionException {
		DropColumnSpecificationContext _localctx = new DropColumnSpecificationContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_dropColumnSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(645);
			match(DROP);
			setState(647);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLUMN) {
				{
				setState(646);
				match(COLUMN);
				}
			}

			setState(651);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(649);
				match(IF);
				setState(650);
				match(EXISTS);
				}
			}

			setState(653);
			columnName();
			setState(655);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CASCADE || _la==RESTRICT) {
				{
				setState(654);
				_la = _input.LA(1);
				if ( !(_la==CASCADE || _la==RESTRICT) ) {
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

	public static class ModifyColumnSpecificationContext extends ParserRuleContext {
		public AlterColumnContext alterColumn() {
			return getRuleContext(AlterColumnContext.class,0);
		}
		public TerminalNode TYPE() { return getToken(PostgreSQLStatementParser.TYPE, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode SET() { return getToken(PostgreSQLStatementParser.SET, 0); }
		public TerminalNode DATA() { return getToken(PostgreSQLStatementParser.DATA, 0); }
		public CollateClauseContext collateClause() {
			return getRuleContext(CollateClauseContext.class,0);
		}
		public TerminalNode USING() { return getToken(PostgreSQLStatementParser.USING, 0); }
		public SimpleExprContext simpleExpr() {
			return getRuleContext(SimpleExprContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(PostgreSQLStatementParser.DEFAULT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode DROP() { return getToken(PostgreSQLStatementParser.DROP, 0); }
		public TerminalNode NOT() { return getToken(PostgreSQLStatementParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(PostgreSQLStatementParser.NULL, 0); }
		public TerminalNode ADD() { return getToken(PostgreSQLStatementParser.ADD, 0); }
		public TerminalNode GENERATED() { return getToken(PostgreSQLStatementParser.GENERATED, 0); }
		public TerminalNode AS() { return getToken(PostgreSQLStatementParser.AS, 0); }
		public TerminalNode IDENTITY() { return getToken(PostgreSQLStatementParser.IDENTITY, 0); }
		public TerminalNode ALWAYS() { return getToken(PostgreSQLStatementParser.ALWAYS, 0); }
		public TerminalNode LP_() { return getToken(PostgreSQLStatementParser.LP_, 0); }
		public SequenceOptionsContext sequenceOptions() {
			return getRuleContext(SequenceOptionsContext.class,0);
		}
		public TerminalNode RP_() { return getToken(PostgreSQLStatementParser.RP_, 0); }
		public TerminalNode BY() { return getToken(PostgreSQLStatementParser.BY, 0); }
		public List<AlterColumnSetOptionContext> alterColumnSetOption() {
			return getRuleContexts(AlterColumnSetOptionContext.class);
		}
		public AlterColumnSetOptionContext alterColumnSetOption(int i) {
			return getRuleContext(AlterColumnSetOptionContext.class,i);
		}
		public TerminalNode IF() { return getToken(PostgreSQLStatementParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(PostgreSQLStatementParser.EXISTS, 0); }
		public TerminalNode STATISTICS() { return getToken(PostgreSQLStatementParser.STATISTICS, 0); }
		public TerminalNode NUMBER_() { return getToken(PostgreSQLStatementParser.NUMBER_, 0); }
		public AttributeOptionsContext attributeOptions() {
			return getRuleContext(AttributeOptionsContext.class,0);
		}
		public TerminalNode RESET() { return getToken(PostgreSQLStatementParser.RESET, 0); }
		public TerminalNode STORAGE() { return getToken(PostgreSQLStatementParser.STORAGE, 0); }
		public TerminalNode PLAIN() { return getToken(PostgreSQLStatementParser.PLAIN, 0); }
		public TerminalNode EXTERNAL() { return getToken(PostgreSQLStatementParser.EXTERNAL, 0); }
		public TerminalNode EXTENDED() { return getToken(PostgreSQLStatementParser.EXTENDED, 0); }
		public TerminalNode MAIN() { return getToken(PostgreSQLStatementParser.MAIN, 0); }
		public ModifyColumnSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifyColumnSpecification; }
	}

	public final ModifyColumnSpecificationContext modifyColumnSpecification() throws RecognitionException {
		ModifyColumnSpecificationContext _localctx = new ModifyColumnSpecificationContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_modifyColumnSpecification);
		int _la;
		try {
			setState(738);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(657);
				alterColumn();
				setState(660);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SET) {
					{
					setState(658);
					match(SET);
					setState(659);
					match(DATA);
					}
				}

				setState(662);
				match(TYPE);
				setState(663);
				dataType();
				setState(665);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLLATE) {
					{
					setState(664);
					collateClause();
					}
				}

				setState(669);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==USING) {
					{
					setState(667);
					match(USING);
					setState(668);
					simpleExpr(0);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(671);
				alterColumn();
				setState(672);
				match(SET);
				setState(673);
				match(DEFAULT);
				setState(674);
				expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(676);
				alterColumn();
				setState(677);
				match(DROP);
				setState(678);
				match(DEFAULT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(680);
				alterColumn();
				setState(681);
				_la = _input.LA(1);
				if ( !(_la==SET || _la==DROP) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(682);
				match(NOT);
				setState(683);
				match(NULL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(685);
				alterColumn();
				setState(686);
				match(ADD);
				setState(687);
				match(GENERATED);
				setState(691);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ALWAYS:
					{
					setState(688);
					match(ALWAYS);
					}
					break;
				case BY:
					{
					{
					setState(689);
					match(BY);
					setState(690);
					match(DEFAULT);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(693);
				match(AS);
				setState(694);
				match(IDENTITY);
				setState(699);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LP_) {
					{
					setState(695);
					match(LP_);
					setState(696);
					sequenceOptions();
					setState(697);
					match(RP_);
					}
				}

				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(701);
				alterColumn();
				setState(702);
				alterColumnSetOption();
				setState(706);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SET || _la==RESTART) {
					{
					{
					setState(703);
					alterColumnSetOption();
					}
					}
					setState(708);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(709);
				alterColumn();
				setState(710);
				match(DROP);
				setState(711);
				match(IDENTITY);
				setState(714);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(712);
					match(IF);
					setState(713);
					match(EXISTS);
					}
				}

				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(716);
				alterColumn();
				setState(717);
				match(SET);
				setState(718);
				match(STATISTICS);
				setState(719);
				match(NUMBER_);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(721);
				alterColumn();
				setState(722);
				match(SET);
				setState(723);
				match(LP_);
				setState(724);
				attributeOptions();
				setState(725);
				match(RP_);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(727);
				alterColumn();
				setState(728);
				match(RESET);
				setState(729);
				match(LP_);
				setState(730);
				attributeOptions();
				setState(731);
				match(RP_);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(733);
				alterColumn();
				setState(734);
				match(SET);
				setState(735);
				match(STORAGE);
				setState(736);
				_la = _input.LA(1);
				if ( !(((((_la - 114)) & ~0x3f) == 0 && ((1L << (_la - 114)) & ((1L << (EXTENDED - 114)) | (1L << (EXTERNAL - 114)) | (1L << (MAIN - 114)) | (1L << (PLAIN - 114)))) != 0)) ) {
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

	public static class AlterColumnContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(PostgreSQLStatementParser.ALTER, 0); }
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public TerminalNode COLUMN() { return getToken(PostgreSQLStatementParser.COLUMN, 0); }
		public AlterColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterColumn; }
	}

	public final AlterColumnContext alterColumn() throws RecognitionException {
		AlterColumnContext _localctx = new AlterColumnContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_alterColumn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(740);
			match(ALTER);
			setState(742);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLUMN) {
				{
				setState(741);
				match(COLUMN);
				}
			}

			setState(744);
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

	public static class AlterColumnSetOptionContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(PostgreSQLStatementParser.SET, 0); }
		public TerminalNode GENERATED() { return getToken(PostgreSQLStatementParser.GENERATED, 0); }
		public SequenceOptionContext sequenceOption() {
			return getRuleContext(SequenceOptionContext.class,0);
		}
		public TerminalNode ALWAYS() { return getToken(PostgreSQLStatementParser.ALWAYS, 0); }
		public TerminalNode BY() { return getToken(PostgreSQLStatementParser.BY, 0); }
		public TerminalNode DEFAULT() { return getToken(PostgreSQLStatementParser.DEFAULT, 0); }
		public TerminalNode RESTART() { return getToken(PostgreSQLStatementParser.RESTART, 0); }
		public TerminalNode NUMBER_() { return getToken(PostgreSQLStatementParser.NUMBER_, 0); }
		public TerminalNode WITH() { return getToken(PostgreSQLStatementParser.WITH, 0); }
		public AlterColumnSetOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterColumnSetOption; }
	}

	public final AlterColumnSetOptionContext alterColumnSetOption() throws RecognitionException {
		AlterColumnSetOptionContext _localctx = new AlterColumnSetOptionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_alterColumnSetOption);
		int _la;
		try {
			setState(763);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SET:
				enterOuterAlt(_localctx, 1);
				{
				setState(746);
				match(SET);
				setState(754);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case GENERATED:
					{
					setState(747);
					match(GENERATED);
					setState(751);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case ALWAYS:
						{
						setState(748);
						match(ALWAYS);
						}
						break;
					case BY:
						{
						setState(749);
						match(BY);
						setState(750);
						match(DEFAULT);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				case NO:
				case START:
				case CACHE:
				case CYCLE:
				case INCREMENT:
				case MAXVALUE:
				case MINVALUE:
					{
					setState(753);
					sequenceOption();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case RESTART:
				enterOuterAlt(_localctx, 2);
				{
				setState(756);
				match(RESTART);
				setState(761);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH || _la==NUMBER_) {
					{
					setState(758);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WITH) {
						{
						setState(757);
						match(WITH);
						}
					}

					setState(760);
					match(NUMBER_);
					}
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

	public static class AttributeOptionsContext extends ParserRuleContext {
		public List<AttributeOptionContext> attributeOption() {
			return getRuleContexts(AttributeOptionContext.class);
		}
		public AttributeOptionContext attributeOption(int i) {
			return getRuleContext(AttributeOptionContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(PostgreSQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(PostgreSQLStatementParser.COMMA_, i);
		}
		public AttributeOptionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeOptions; }
	}

	public final AttributeOptionsContext attributeOptions() throws RecognitionException {
		AttributeOptionsContext _localctx = new AttributeOptionsContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_attributeOptions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(765);
			attributeOption();
			setState(770);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(766);
				match(COMMA_);
				setState(767);
				attributeOption();
				}
				}
				setState(772);
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

	public static class AttributeOptionContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER_() { return getToken(PostgreSQLStatementParser.IDENTIFIER_, 0); }
		public TerminalNode EQ_() { return getToken(PostgreSQLStatementParser.EQ_, 0); }
		public SimpleExprContext simpleExpr() {
			return getRuleContext(SimpleExprContext.class,0);
		}
		public AttributeOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeOption; }
	}

	public final AttributeOptionContext attributeOption() throws RecognitionException {
		AttributeOptionContext _localctx = new AttributeOptionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_attributeOption);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(773);
			match(IDENTIFIER_);
			setState(774);
			match(EQ_);
			setState(775);
			simpleExpr(0);
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
		public TerminalNode ADD() { return getToken(PostgreSQLStatementParser.ADD, 0); }
		public TableConstraintContext tableConstraint() {
			return getRuleContext(TableConstraintContext.class,0);
		}
		public TableConstraintUsingIndexContext tableConstraintUsingIndex() {
			return getRuleContext(TableConstraintUsingIndexContext.class,0);
		}
		public TerminalNode NOT() { return getToken(PostgreSQLStatementParser.NOT, 0); }
		public TerminalNode VALID() { return getToken(PostgreSQLStatementParser.VALID, 0); }
		public AddConstraintSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addConstraintSpecification; }
	}

	public final AddConstraintSpecificationContext addConstraintSpecification() throws RecognitionException {
		AddConstraintSpecificationContext _localctx = new AddConstraintSpecificationContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_addConstraintSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(777);
			match(ADD);
			setState(784);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				{
				setState(778);
				tableConstraint();
				setState(781);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(779);
					match(NOT);
					setState(780);
					match(VALID);
					}
				}

				}
				break;
			case 2:
				{
				setState(783);
				tableConstraintUsingIndex();
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

	public static class RenameColumnSpecificationContext extends ParserRuleContext {
		public TerminalNode RENAME() { return getToken(PostgreSQLStatementParser.RENAME, 0); }
		public List<ColumnNameContext> columnName() {
			return getRuleContexts(ColumnNameContext.class);
		}
		public ColumnNameContext columnName(int i) {
			return getRuleContext(ColumnNameContext.class,i);
		}
		public TerminalNode TO() { return getToken(PostgreSQLStatementParser.TO, 0); }
		public TerminalNode COLUMN() { return getToken(PostgreSQLStatementParser.COLUMN, 0); }
		public RenameColumnSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_renameColumnSpecification; }
	}

	public final RenameColumnSpecificationContext renameColumnSpecification() throws RecognitionException {
		RenameColumnSpecificationContext _localctx = new RenameColumnSpecificationContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_renameColumnSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(786);
			match(RENAME);
			setState(788);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLUMN) {
				{
				setState(787);
				match(COLUMN);
				}
			}

			setState(790);
			columnName();
			setState(791);
			match(TO);
			setState(792);
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

	public static class RenameConstraintContext extends ParserRuleContext {
		public TerminalNode RENAME() { return getToken(PostgreSQLStatementParser.RENAME, 0); }
		public TerminalNode CONSTRAINT() { return getToken(PostgreSQLStatementParser.CONSTRAINT, 0); }
		public List<IgnoredIdentifier_Context> ignoredIdentifier_() {
			return getRuleContexts(IgnoredIdentifier_Context.class);
		}
		public IgnoredIdentifier_Context ignoredIdentifier_(int i) {
			return getRuleContext(IgnoredIdentifier_Context.class,i);
		}
		public TerminalNode TO() { return getToken(PostgreSQLStatementParser.TO, 0); }
		public RenameConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_renameConstraint; }
	}

	public final RenameConstraintContext renameConstraint() throws RecognitionException {
		RenameConstraintContext _localctx = new RenameConstraintContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_renameConstraint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(794);
			match(RENAME);
			setState(795);
			match(CONSTRAINT);
			setState(796);
			ignoredIdentifier_();
			setState(797);
			match(TO);
			setState(798);
			ignoredIdentifier_();
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

	public static class StorageParameterWithValueContext extends ParserRuleContext {
		public StorageParameterContext storageParameter() {
			return getRuleContext(StorageParameterContext.class,0);
		}
		public TerminalNode EQ_() { return getToken(PostgreSQLStatementParser.EQ_, 0); }
		public SimpleExprContext simpleExpr() {
			return getRuleContext(SimpleExprContext.class,0);
		}
		public StorageParameterWithValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storageParameterWithValue; }
	}

	public final StorageParameterWithValueContext storageParameterWithValue() throws RecognitionException {
		StorageParameterWithValueContext _localctx = new StorageParameterWithValueContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_storageParameterWithValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(800);
			storageParameter();
			setState(801);
			match(EQ_);
			setState(802);
			simpleExpr(0);
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

	public static class StorageParameterContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER_() { return getToken(PostgreSQLStatementParser.IDENTIFIER_, 0); }
		public StorageParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storageParameter; }
	}

	public final StorageParameterContext storageParameter() throws RecognitionException {
		StorageParameterContext _localctx = new StorageParameterContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_storageParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(804);
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

	public static class AlterTableNameExistsContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(PostgreSQLStatementParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(PostgreSQLStatementParser.TABLE, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode IF() { return getToken(PostgreSQLStatementParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(PostgreSQLStatementParser.EXISTS, 0); }
		public AlterTableNameExistsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterTableNameExists; }
	}

	public final AlterTableNameExistsContext alterTableNameExists() throws RecognitionException {
		AlterTableNameExistsContext _localctx = new AlterTableNameExistsContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_alterTableNameExists);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(806);
			match(ALTER);
			setState(807);
			match(TABLE);
			setState(810);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(808);
				match(IF);
				setState(809);
				match(EXISTS);
				}
			}

			setState(812);
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

	public static class RenameTableSpecification_Context extends ParserRuleContext {
		public TerminalNode RENAME() { return getToken(PostgreSQLStatementParser.RENAME, 0); }
		public TerminalNode TO() { return getToken(PostgreSQLStatementParser.TO, 0); }
		public NewTableNameContext newTableName() {
			return getRuleContext(NewTableNameContext.class,0);
		}
		public RenameTableSpecification_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_renameTableSpecification_; }
	}

	public final RenameTableSpecification_Context renameTableSpecification_() throws RecognitionException {
		RenameTableSpecification_Context _localctx = new RenameTableSpecification_Context(_ctx, getState());
		enterRule(_localctx, 72, RULE_renameTableSpecification_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(814);
			match(RENAME);
			setState(815);
			match(TO);
			setState(816);
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
		public TerminalNode IDENTIFIER_() { return getToken(PostgreSQLStatementParser.IDENTIFIER_, 0); }
		public NewTableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newTableName; }
	}

	public final NewTableNameContext newTableName() throws RecognitionException {
		NewTableNameContext _localctx = new NewTableNameContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_newTableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(818);
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

	public static class UsingIndexTypeContext extends ParserRuleContext {
		public TerminalNode USING() { return getToken(PostgreSQLStatementParser.USING, 0); }
		public TerminalNode BTREE() { return getToken(PostgreSQLStatementParser.BTREE, 0); }
		public TerminalNode HASH() { return getToken(PostgreSQLStatementParser.HASH, 0); }
		public TerminalNode GIST() { return getToken(PostgreSQLStatementParser.GIST, 0); }
		public TerminalNode SPGIST() { return getToken(PostgreSQLStatementParser.SPGIST, 0); }
		public TerminalNode GIN() { return getToken(PostgreSQLStatementParser.GIN, 0); }
		public TerminalNode BRIN() { return getToken(PostgreSQLStatementParser.BRIN, 0); }
		public UsingIndexTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_usingIndexType; }
	}

	public final UsingIndexTypeContext usingIndexType() throws RecognitionException {
		UsingIndexTypeContext _localctx = new UsingIndexTypeContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_usingIndexType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(820);
			match(USING);
			setState(821);
			_la = _input.LA(1);
			if ( !(((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & ((1L << (BRIN - 91)) | (1L << (BTREE - 91)) | (1L << (GIN - 91)) | (1L << (GIST - 91)) | (1L << (HASH - 91)))) != 0) || _la==SPGIST) ) {
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

	public static class TableConstraintContext extends ParserRuleContext {
		public TableConstraintOptionContext tableConstraintOption() {
			return getRuleContext(TableConstraintOptionContext.class,0);
		}
		public ConstraintOptionalParamContext constraintOptionalParam() {
			return getRuleContext(ConstraintOptionalParamContext.class,0);
		}
		public ConstraintClauseContext constraintClause() {
			return getRuleContext(ConstraintClauseContext.class,0);
		}
		public TableConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableConstraint; }
	}

	public final TableConstraintContext tableConstraint() throws RecognitionException {
		TableConstraintContext _localctx = new TableConstraintContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_tableConstraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(824);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONSTRAINT) {
				{
				setState(823);
				constraintClause();
				}
			}

			setState(826);
			tableConstraintOption();
			setState(827);
			constraintOptionalParam();
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

	public static class TableConstraintOptionContext extends ParserRuleContext {
		public CheckOptionContext checkOption() {
			return getRuleContext(CheckOptionContext.class,0);
		}
		public TerminalNode UNIQUE() { return getToken(PostgreSQLStatementParser.UNIQUE, 0); }
		public List<ColumnNamesContext> columnNames() {
			return getRuleContexts(ColumnNamesContext.class);
		}
		public ColumnNamesContext columnNames(int i) {
			return getRuleContext(ColumnNamesContext.class,i);
		}
		public IndexParametersContext indexParameters() {
			return getRuleContext(IndexParametersContext.class,0);
		}
		public PrimaryKeyContext primaryKey() {
			return getRuleContext(PrimaryKeyContext.class,0);
		}
		public TerminalNode FOREIGN() { return getToken(PostgreSQLStatementParser.FOREIGN, 0); }
		public TerminalNode KEY() { return getToken(PostgreSQLStatementParser.KEY, 0); }
		public TerminalNode REFERENCES() { return getToken(PostgreSQLStatementParser.REFERENCES, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode MATCH() { return getToken(PostgreSQLStatementParser.MATCH, 0); }
		public TerminalNode FULL() { return getToken(PostgreSQLStatementParser.FULL, 0); }
		public TerminalNode PARTIAL() { return getToken(PostgreSQLStatementParser.PARTIAL, 0); }
		public TerminalNode SIMPLE() { return getToken(PostgreSQLStatementParser.SIMPLE, 0); }
		public List<ForeignKeyOnActionContext> foreignKeyOnAction() {
			return getRuleContexts(ForeignKeyOnActionContext.class);
		}
		public ForeignKeyOnActionContext foreignKeyOnAction(int i) {
			return getRuleContext(ForeignKeyOnActionContext.class,i);
		}
		public TableConstraintOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableConstraintOption; }
	}

	public final TableConstraintOptionContext tableConstraintOption() throws RecognitionException {
		TableConstraintOptionContext _localctx = new TableConstraintOptionContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_tableConstraintOption);
		int _la;
		try {
			setState(858);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHECK:
				enterOuterAlt(_localctx, 1);
				{
				setState(829);
				checkOption();
				}
				break;
			case UNIQUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(830);
				match(UNIQUE);
				setState(831);
				columnNames();
				setState(832);
				indexParameters();
				}
				break;
			case KEY:
			case PRIMARY:
				enterOuterAlt(_localctx, 3);
				{
				setState(834);
				primaryKey();
				setState(835);
				columnNames();
				setState(836);
				indexParameters();
				}
				break;
			case FOREIGN:
				enterOuterAlt(_localctx, 4);
				{
				setState(838);
				match(FOREIGN);
				setState(839);
				match(KEY);
				setState(840);
				columnNames();
				setState(841);
				match(REFERENCES);
				setState(842);
				tableName();
				setState(843);
				columnNames();
				setState(850);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
				case 1:
					{
					setState(844);
					match(MATCH);
					setState(845);
					match(FULL);
					}
					break;
				case 2:
					{
					setState(846);
					match(MATCH);
					setState(847);
					match(PARTIAL);
					}
					break;
				case 3:
					{
					setState(848);
					match(MATCH);
					setState(849);
					match(SIMPLE);
					}
					break;
				}
				setState(855);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ON) {
					{
					{
					setState(852);
					foreignKeyOnAction();
					}
					}
					setState(857);
					_errHandler.sync(this);
					_la = _input.LA(1);
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

	public static class ExcludeElementContext extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public IgnoredIdentifier_Context ignoredIdentifier_() {
			return getRuleContext(IgnoredIdentifier_Context.class,0);
		}
		public TerminalNode NULLS() { return getToken(PostgreSQLStatementParser.NULLS, 0); }
		public TerminalNode ASC() { return getToken(PostgreSQLStatementParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(PostgreSQLStatementParser.DESC, 0); }
		public TerminalNode FIRST() { return getToken(PostgreSQLStatementParser.FIRST, 0); }
		public TerminalNode LAST() { return getToken(PostgreSQLStatementParser.LAST, 0); }
		public ExcludeElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_excludeElement; }
	}

	public final ExcludeElementContext excludeElement() throws RecognitionException {
		ExcludeElementContext _localctx = new ExcludeElementContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_excludeElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(862);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				{
				setState(860);
				columnName();
				}
				break;
			case 2:
				{
				setState(861);
				expr(0);
				}
				break;
			}
			setState(865);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER_) {
				{
				setState(864);
				ignoredIdentifier_();
				}
			}

			setState(868);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(867);
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

			setState(872);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NULLS) {
				{
				setState(870);
				match(NULLS);
				setState(871);
				_la = _input.LA(1);
				if ( !(_la==FIRST || _la==LAST) ) {
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

	public static class SchemaNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER_() { return getToken(PostgreSQLStatementParser.IDENTIFIER_, 0); }
		public SchemaNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_schemaName; }
	}

	public final SchemaNameContext schemaName() throws RecognitionException {
		SchemaNameContext _localctx = new SchemaNameContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_schemaName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(874);
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

	public static class TableNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER_() { return getToken(PostgreSQLStatementParser.IDENTIFIER_, 0); }
		public TableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableName; }
	}

	public final TableNameContext tableName() throws RecognitionException {
		TableNameContext _localctx = new TableNameContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_tableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(876);
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

	public static class ColumnNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER_() { return getToken(PostgreSQLStatementParser.IDENTIFIER_, 0); }
		public ColumnNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnName; }
	}

	public final ColumnNameContext columnName() throws RecognitionException {
		ColumnNameContext _localctx = new ColumnNameContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_columnName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(878);
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

	public static class CollationNameContext extends ParserRuleContext {
		public TerminalNode STRING_() { return getToken(PostgreSQLStatementParser.STRING_, 0); }
		public TerminalNode IDENTIFIER_() { return getToken(PostgreSQLStatementParser.IDENTIFIER_, 0); }
		public CollationNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collationName; }
	}

	public final CollationNameContext collationName() throws RecognitionException {
		CollationNameContext _localctx = new CollationNameContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_collationName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(880);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFIER_ || _la==STRING_) ) {
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

	public static class IndexNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER_() { return getToken(PostgreSQLStatementParser.IDENTIFIER_, 0); }
		public IndexNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexName; }
	}

	public final IndexNameContext indexName() throws RecognitionException {
		IndexNameContext _localctx = new IndexNameContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_indexName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(882);
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

	public static class AliasContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER_() { return getToken(PostgreSQLStatementParser.IDENTIFIER_, 0); }
		public AliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alias; }
	}

	public final AliasContext alias() throws RecognitionException {
		AliasContext _localctx = new AliasContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(884);
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

	public static class DataTypeLengthContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(PostgreSQLStatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(PostgreSQLStatementParser.RP_, 0); }
		public List<TerminalNode> NUMBER_() { return getTokens(PostgreSQLStatementParser.NUMBER_); }
		public TerminalNode NUMBER_(int i) {
			return getToken(PostgreSQLStatementParser.NUMBER_, i);
		}
		public TerminalNode COMMA_() { return getToken(PostgreSQLStatementParser.COMMA_, 0); }
		public DataTypeLengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataTypeLength; }
	}

	public final DataTypeLengthContext dataTypeLength() throws RecognitionException {
		DataTypeLengthContext _localctx = new DataTypeLengthContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_dataTypeLength);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(886);
			match(LP_);
			setState(892);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NUMBER_) {
				{
				setState(887);
				match(NUMBER_);
				setState(890);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA_) {
					{
					setState(888);
					match(COMMA_);
					setState(889);
					match(NUMBER_);
					}
				}

				}
			}

			setState(894);
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

	public static class PrimaryKeyContext extends ParserRuleContext {
		public TerminalNode KEY() { return getToken(PostgreSQLStatementParser.KEY, 0); }
		public TerminalNode PRIMARY() { return getToken(PostgreSQLStatementParser.PRIMARY, 0); }
		public PrimaryKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryKey; }
	}

	public final PrimaryKeyContext primaryKey() throws RecognitionException {
		PrimaryKeyContext _localctx = new PrimaryKeyContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_primaryKey);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(897);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PRIMARY) {
				{
				setState(896);
				match(PRIMARY);
				}
			}

			setState(899);
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

	public static class ColumnNamesContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(PostgreSQLStatementParser.LP_, 0); }
		public List<ColumnNameContext> columnName() {
			return getRuleContexts(ColumnNameContext.class);
		}
		public ColumnNameContext columnName(int i) {
			return getRuleContext(ColumnNameContext.class,i);
		}
		public TerminalNode RP_() { return getToken(PostgreSQLStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(PostgreSQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(PostgreSQLStatementParser.COMMA_, i);
		}
		public ColumnNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnNames; }
	}

	public final ColumnNamesContext columnNames() throws RecognitionException {
		ColumnNamesContext _localctx = new ColumnNamesContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_columnNames);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(901);
			match(LP_);
			setState(902);
			columnName();
			setState(907);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(903);
				match(COMMA_);
				setState(904);
				columnName();
				}
				}
				setState(909);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(910);
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

	public static class ExprsContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(PostgreSQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(PostgreSQLStatementParser.COMMA_, i);
		}
		public ExprsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprs; }
	}

	public final ExprsContext exprs() throws RecognitionException {
		ExprsContext _localctx = new ExprsContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_exprs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(912);
			expr(0);
			setState(917);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(913);
				match(COMMA_);
				setState(914);
				expr(0);
				}
				}
				setState(919);
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

	public static class ExprListContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(PostgreSQLStatementParser.LP_, 0); }
		public ExprsContext exprs() {
			return getRuleContext(ExprsContext.class,0);
		}
		public TerminalNode RP_() { return getToken(PostgreSQLStatementParser.RP_, 0); }
		public ExprListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprList; }
	}

	public final ExprListContext exprList() throws RecognitionException {
		ExprListContext _localctx = new ExprListContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_exprList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(920);
			match(LP_);
			setState(921);
			exprs();
			setState(922);
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

	public static class ExprContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(PostgreSQLStatementParser.LP_, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RP_() { return getToken(PostgreSQLStatementParser.RP_, 0); }
		public TerminalNode NOT() { return getToken(PostgreSQLStatementParser.NOT, 0); }
		public TerminalNode NOT_() { return getToken(PostgreSQLStatementParser.NOT_, 0); }
		public BooleanPrimaryContext booleanPrimary() {
			return getRuleContext(BooleanPrimaryContext.class,0);
		}
		public ExprRecursiveContext exprRecursive() {
			return getRuleContext(ExprRecursiveContext.class,0);
		}
		public TerminalNode AND() { return getToken(PostgreSQLStatementParser.AND, 0); }
		public TerminalNode AND_() { return getToken(PostgreSQLStatementParser.AND_, 0); }
		public TerminalNode XOR() { return getToken(PostgreSQLStatementParser.XOR, 0); }
		public TerminalNode OR() { return getToken(PostgreSQLStatementParser.OR, 0); }
		public TerminalNode OR_() { return getToken(PostgreSQLStatementParser.OR_, 0); }
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
		int _startState = 106;
		enterRecursionRule(_localctx, 106, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(935);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				{
				setState(925);
				match(LP_);
				setState(926);
				expr(0);
				setState(927);
				match(RP_);
				}
				break;
			case 2:
				{
				setState(929);
				match(NOT);
				setState(930);
				expr(6);
				}
				break;
			case 3:
				{
				setState(931);
				match(NOT_);
				setState(932);
				expr(5);
				}
				break;
			case 4:
				{
				setState(933);
				booleanPrimary(0);
				}
				break;
			case 5:
				{
				setState(934);
				exprRecursive();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(954);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(952);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(937);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(938);
						match(AND);
						setState(939);
						expr(11);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(940);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(941);
						match(AND_);
						setState(942);
						expr(10);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(943);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(944);
						match(XOR);
						setState(945);
						expr(9);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(946);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(947);
						match(OR);
						setState(948);
						expr(5);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(949);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(950);
						match(OR_);
						setState(951);
						expr(4);
						}
						break;
					}
					} 
				}
				setState(956);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
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

	public static class ExprRecursiveContext extends ParserRuleContext {
		public MatchNoneContext matchNone() {
			return getRuleContext(MatchNoneContext.class,0);
		}
		public ExprRecursiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprRecursive; }
	}

	public final ExprRecursiveContext exprRecursive() throws RecognitionException {
		ExprRecursiveContext _localctx = new ExprRecursiveContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_exprRecursive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(957);
			matchNone();
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

	public static class BooleanPrimaryContext extends ParserRuleContext {
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public BooleanPrimaryContext booleanPrimary() {
			return getRuleContext(BooleanPrimaryContext.class,0);
		}
		public TerminalNode IS() { return getToken(PostgreSQLStatementParser.IS, 0); }
		public TerminalNode TRUE() { return getToken(PostgreSQLStatementParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(PostgreSQLStatementParser.FALSE, 0); }
		public TerminalNode UNKNOWN() { return getToken(PostgreSQLStatementParser.UNKNOWN, 0); }
		public TerminalNode NULL() { return getToken(PostgreSQLStatementParser.NULL, 0); }
		public TerminalNode NOT() { return getToken(PostgreSQLStatementParser.NOT, 0); }
		public TerminalNode SAFE_EQ_() { return getToken(PostgreSQLStatementParser.SAFE_EQ_, 0); }
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public TerminalNode ALL() { return getToken(PostgreSQLStatementParser.ALL, 0); }
		public TerminalNode ANY() { return getToken(PostgreSQLStatementParser.ANY, 0); }
		public BooleanPrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanPrimary; }
	}

	public final BooleanPrimaryContext booleanPrimary() throws RecognitionException {
		return booleanPrimary(0);
	}

	private BooleanPrimaryContext booleanPrimary(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BooleanPrimaryContext _localctx = new BooleanPrimaryContext(_ctx, _parentState);
		BooleanPrimaryContext _prevctx = _localctx;
		int _startState = 110;
		enterRecursionRule(_localctx, 110, RULE_booleanPrimary, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(960);
			predicate();
			}
			_ctx.stop = _input.LT(-1);
			setState(982);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(980);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
					case 1:
						{
						_localctx = new BooleanPrimaryContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_booleanPrimary);
						setState(962);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(963);
						match(IS);
						setState(965);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(964);
							match(NOT);
							}
						}

						setState(967);
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
						_localctx = new BooleanPrimaryContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_booleanPrimary);
						setState(968);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(969);
						match(SAFE_EQ_);
						setState(970);
						predicate();
						}
						break;
					case 3:
						{
						_localctx = new BooleanPrimaryContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_booleanPrimary);
						setState(971);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(972);
						comparisonOperator();
						setState(973);
						predicate();
						}
						break;
					case 4:
						{
						_localctx = new BooleanPrimaryContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_booleanPrimary);
						setState(975);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(976);
						comparisonOperator();
						setState(977);
						_la = _input.LA(1);
						if ( !(_la==ALL || _la==ANY) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(978);
						subquery();
						}
						break;
					}
					} 
				}
				setState(984);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
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
		public TerminalNode EQ_() { return getToken(PostgreSQLStatementParser.EQ_, 0); }
		public TerminalNode GTE_() { return getToken(PostgreSQLStatementParser.GTE_, 0); }
		public TerminalNode GT_() { return getToken(PostgreSQLStatementParser.GT_, 0); }
		public TerminalNode LTE_() { return getToken(PostgreSQLStatementParser.LTE_, 0); }
		public TerminalNode LT_() { return getToken(PostgreSQLStatementParser.LT_, 0); }
		public TerminalNode NEQ_() { return getToken(PostgreSQLStatementParser.NEQ_, 0); }
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(985);
			_la = _input.LA(1);
			if ( !(((((_la - 219)) & ~0x3f) == 0 && ((1L << (_la - 219)) & ((1L << (EQ_ - 219)) | (1L << (NEQ_ - 219)) | (1L << (GT_ - 219)) | (1L << (GTE_ - 219)) | (1L << (LT_ - 219)) | (1L << (LTE_ - 219)))) != 0)) ) {
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
		public BitExprContext bitExpr() {
			return getRuleContext(BitExprContext.class,0);
		}
		public TerminalNode IN() { return getToken(PostgreSQLStatementParser.IN, 0); }
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public TerminalNode NOT() { return getToken(PostgreSQLStatementParser.NOT, 0); }
		public TerminalNode LP_() { return getToken(PostgreSQLStatementParser.LP_, 0); }
		public List<SimpleExprContext> simpleExpr() {
			return getRuleContexts(SimpleExprContext.class);
		}
		public SimpleExprContext simpleExpr(int i) {
			return getRuleContext(SimpleExprContext.class,i);
		}
		public TerminalNode RP_() { return getToken(PostgreSQLStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(PostgreSQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(PostgreSQLStatementParser.COMMA_, i);
		}
		public TerminalNode BETWEEN() { return getToken(PostgreSQLStatementParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(PostgreSQLStatementParser.AND, 0); }
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public TerminalNode SOUNDS() { return getToken(PostgreSQLStatementParser.SOUNDS, 0); }
		public TerminalNode LIKE() { return getToken(PostgreSQLStatementParser.LIKE, 0); }
		public List<TerminalNode> ESCAPE() { return getTokens(PostgreSQLStatementParser.ESCAPE); }
		public TerminalNode ESCAPE(int i) {
			return getToken(PostgreSQLStatementParser.ESCAPE, i);
		}
		public TerminalNode REGEXP() { return getToken(PostgreSQLStatementParser.REGEXP, 0); }
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_predicate);
		int _la;
		try {
			int _alt;
			setState(1045);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(987);
				bitExpr(0);
				setState(989);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(988);
					match(NOT);
					}
				}

				setState(991);
				match(IN);
				setState(992);
				subquery();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(994);
				bitExpr(0);
				setState(996);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(995);
					match(NOT);
					}
				}

				setState(998);
				match(IN);
				setState(999);
				match(LP_);
				setState(1000);
				simpleExpr(0);
				setState(1005);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(1001);
					match(COMMA_);
					setState(1002);
					simpleExpr(0);
					}
					}
					setState(1007);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1008);
				match(RP_);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1010);
				bitExpr(0);
				setState(1012);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1011);
					match(NOT);
					}
				}

				setState(1014);
				match(BETWEEN);
				setState(1015);
				simpleExpr(0);
				setState(1016);
				match(AND);
				setState(1017);
				predicate();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1019);
				bitExpr(0);
				setState(1020);
				match(SOUNDS);
				setState(1021);
				match(LIKE);
				setState(1022);
				simpleExpr(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
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
				match(LIKE);
				setState(1029);
				simpleExpr(0);
				setState(1034);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1030);
						match(ESCAPE);
						setState(1031);
						simpleExpr(0);
						}
						} 
					}
					setState(1036);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1037);
				bitExpr(0);
				setState(1039);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1038);
					match(NOT);
					}
				}

				setState(1041);
				match(REGEXP);
				setState(1042);
				simpleExpr(0);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1044);
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
		public TerminalNode VERTICAL_BAR_() { return getToken(PostgreSQLStatementParser.VERTICAL_BAR_, 0); }
		public TerminalNode AMPERSAND_() { return getToken(PostgreSQLStatementParser.AMPERSAND_, 0); }
		public TerminalNode SIGNED_LEFT_SHIFT_() { return getToken(PostgreSQLStatementParser.SIGNED_LEFT_SHIFT_, 0); }
		public TerminalNode SIGNED_RIGHT_SHIFT_() { return getToken(PostgreSQLStatementParser.SIGNED_RIGHT_SHIFT_, 0); }
		public TerminalNode PLUS_() { return getToken(PostgreSQLStatementParser.PLUS_, 0); }
		public TerminalNode MINUS_() { return getToken(PostgreSQLStatementParser.MINUS_, 0); }
		public TerminalNode ASTERISK_() { return getToken(PostgreSQLStatementParser.ASTERISK_, 0); }
		public TerminalNode SLASH_() { return getToken(PostgreSQLStatementParser.SLASH_, 0); }
		public TerminalNode MOD() { return getToken(PostgreSQLStatementParser.MOD, 0); }
		public TerminalNode MOD_() { return getToken(PostgreSQLStatementParser.MOD_, 0); }
		public TerminalNode CARET_() { return getToken(PostgreSQLStatementParser.CARET_, 0); }
		public IntervalExprContext intervalExpr() {
			return getRuleContext(IntervalExprContext.class,0);
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
		int _startState = 116;
		enterRecursionRule(_localctx, 116, RULE_bitExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1048);
			simpleExpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(1091);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1089);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
					case 1:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1050);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1051);
						match(VERTICAL_BAR_);
						setState(1052);
						bitExpr(15);
						}
						break;
					case 2:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1053);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1054);
						match(AMPERSAND_);
						setState(1055);
						bitExpr(14);
						}
						break;
					case 3:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1056);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1057);
						match(SIGNED_LEFT_SHIFT_);
						setState(1058);
						bitExpr(13);
						}
						break;
					case 4:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1059);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1060);
						match(SIGNED_RIGHT_SHIFT_);
						setState(1061);
						bitExpr(12);
						}
						break;
					case 5:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1062);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1063);
						match(PLUS_);
						setState(1064);
						bitExpr(11);
						}
						break;
					case 6:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1065);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1066);
						match(MINUS_);
						setState(1067);
						bitExpr(10);
						}
						break;
					case 7:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1068);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1069);
						match(ASTERISK_);
						setState(1070);
						bitExpr(9);
						}
						break;
					case 8:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1071);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1072);
						match(SLASH_);
						setState(1073);
						bitExpr(8);
						}
						break;
					case 9:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1074);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1075);
						match(MOD);
						setState(1076);
						bitExpr(7);
						}
						break;
					case 10:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1077);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1078);
						match(MOD_);
						setState(1079);
						bitExpr(6);
						}
						break;
					case 11:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1080);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1081);
						match(CARET_);
						setState(1082);
						bitExpr(5);
						}
						break;
					case 12:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1083);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1084);
						match(PLUS_);
						setState(1085);
						intervalExpr();
						}
						break;
					case 13:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1086);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1087);
						match(MINUS_);
						setState(1088);
						intervalExpr();
						}
						break;
					}
					} 
				}
				setState(1093);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
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
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode PLUS_() { return getToken(PostgreSQLStatementParser.PLUS_, 0); }
		public List<SimpleExprContext> simpleExpr() {
			return getRuleContexts(SimpleExprContext.class);
		}
		public SimpleExprContext simpleExpr(int i) {
			return getRuleContext(SimpleExprContext.class,i);
		}
		public TerminalNode MINUS_() { return getToken(PostgreSQLStatementParser.MINUS_, 0); }
		public TerminalNode TILDE_() { return getToken(PostgreSQLStatementParser.TILDE_, 0); }
		public TerminalNode NOT_() { return getToken(PostgreSQLStatementParser.NOT_, 0); }
		public TerminalNode BINARY() { return getToken(PostgreSQLStatementParser.BINARY, 0); }
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public TerminalNode ROW() { return getToken(PostgreSQLStatementParser.ROW, 0); }
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public TerminalNode EXISTS() { return getToken(PostgreSQLStatementParser.EXISTS, 0); }
		public CaseExpressContext caseExpress() {
			return getRuleContext(CaseExpressContext.class,0);
		}
		public IntervalExprContext intervalExpr() {
			return getRuleContext(IntervalExprContext.class,0);
		}
		public PrivateExprOfDbContext privateExprOfDb() {
			return getRuleContext(PrivateExprOfDbContext.class,0);
		}
		public TerminalNode AND_() { return getToken(PostgreSQLStatementParser.AND_, 0); }
		public CollateClauseContext collateClause() {
			return getRuleContext(CollateClauseContext.class,0);
		}
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
		int _startState = 118;
		enterRecursionRule(_localctx, 118, RULE_simpleExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1118);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				{
				setState(1095);
				functionCall();
				}
				break;
			case 2:
				{
				setState(1096);
				literal();
				}
				break;
			case 3:
				{
				setState(1097);
				columnName();
				}
				break;
			case 4:
				{
				setState(1098);
				variable();
				}
				break;
			case 5:
				{
				setState(1099);
				match(PLUS_);
				setState(1100);
				simpleExpr(12);
				}
				break;
			case 6:
				{
				setState(1101);
				match(MINUS_);
				setState(1102);
				simpleExpr(11);
				}
				break;
			case 7:
				{
				setState(1103);
				match(TILDE_);
				setState(1104);
				simpleExpr(10);
				}
				break;
			case 8:
				{
				setState(1105);
				match(NOT_);
				setState(1106);
				simpleExpr(9);
				}
				break;
			case 9:
				{
				setState(1107);
				match(BINARY);
				setState(1108);
				simpleExpr(8);
				}
				break;
			case 10:
				{
				setState(1109);
				exprList();
				}
				break;
			case 11:
				{
				setState(1110);
				match(ROW);
				setState(1111);
				exprList();
				}
				break;
			case 12:
				{
				setState(1112);
				subquery();
				}
				break;
			case 13:
				{
				setState(1113);
				match(EXISTS);
				setState(1114);
				subquery();
				}
				break;
			case 14:
				{
				setState(1115);
				caseExpress();
				}
				break;
			case 15:
				{
				setState(1116);
				intervalExpr();
				}
				break;
			case 16:
				{
				setState(1117);
				privateExprOfDb();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1127);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1125);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
					case 1:
						{
						_localctx = new SimpleExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_simpleExpr);
						setState(1120);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1121);
						match(AND_);
						setState(1122);
						simpleExpr(14);
						}
						break;
					case 2:
						{
						_localctx = new SimpleExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_simpleExpr);
						setState(1123);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(1124);
						collateClause();
						}
						break;
					}
					} 
				}
				setState(1129);
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

	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER_() { return getToken(PostgreSQLStatementParser.IDENTIFIER_, 0); }
		public TerminalNode LP_() { return getToken(PostgreSQLStatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(PostgreSQLStatementParser.RP_, 0); }
		public DistinctContext distinct() {
			return getRuleContext(DistinctContext.class,0);
		}
		public ExprsContext exprs() {
			return getRuleContext(ExprsContext.class,0);
		}
		public TerminalNode ASTERISK_() { return getToken(PostgreSQLStatementParser.ASTERISK_, 0); }
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1130);
			match(IDENTIFIER_);
			setState(1131);
			match(LP_);
			setState(1133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DISTINCT) {
				{
				setState(1132);
				distinct();
				}
			}

			setState(1137);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case BINARY:
			case DATE:
			case EXISTS:
			case FALSE:
			case NOT:
			case NULL:
			case ROW:
			case TIME:
			case TIMESTAMP:
			case TRUE:
			case ARRAY:
			case EXTRACT:
			case NOT_:
			case TILDE_:
			case PLUS_:
			case MINUS_:
			case LP_:
			case LBE_:
			case QUESTION_:
			case IDENTIFIER_:
			case STRING_:
			case NUMBER_:
			case HEX_DIGIT_:
			case BIT_NUM_:
				{
				setState(1135);
				exprs();
				}
				break;
			case ASTERISK_:
				{
				setState(1136);
				match(ASTERISK_);
				}
				break;
			case RP_:
				break;
			default:
				break;
			}
			setState(1139);
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

	public static class DistinctContext extends ParserRuleContext {
		public TerminalNode DISTINCT() { return getToken(PostgreSQLStatementParser.DISTINCT, 0); }
		public DistinctContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_distinct; }
	}

	public final DistinctContext distinct() throws RecognitionException {
		DistinctContext _localctx = new DistinctContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_distinct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1141);
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

	public static class IntervalExprContext extends ParserRuleContext {
		public MatchNoneContext matchNone() {
			return getRuleContext(MatchNoneContext.class,0);
		}
		public IntervalExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intervalExpr; }
	}

	public final IntervalExprContext intervalExpr() throws RecognitionException {
		IntervalExprContext _localctx = new IntervalExprContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_intervalExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1143);
			matchNone();
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

	public static class CaseExpressContext extends ParserRuleContext {
		public MatchNoneContext matchNone() {
			return getRuleContext(MatchNoneContext.class,0);
		}
		public CaseExpressContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseExpress; }
	}

	public final CaseExpressContext caseExpress() throws RecognitionException {
		CaseExpressContext _localctx = new CaseExpressContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_caseExpress);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1145);
			matchNone();
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

	public static class PrivateExprOfDbContext extends ParserRuleContext {
		public AggregateExpressionContext aggregateExpression() {
			return getRuleContext(AggregateExpressionContext.class,0);
		}
		public WindowFunctionContext windowFunction() {
			return getRuleContext(WindowFunctionContext.class,0);
		}
		public ArrayConstructorWithCastContext arrayConstructorWithCast() {
			return getRuleContext(ArrayConstructorWithCastContext.class,0);
		}
		public TerminalNode TIMESTAMP() { return getToken(PostgreSQLStatementParser.TIMESTAMP, 0); }
		public TerminalNode STRING_() { return getToken(PostgreSQLStatementParser.STRING_, 0); }
		public TerminalNode WITH() { return getToken(PostgreSQLStatementParser.WITH, 0); }
		public TerminalNode TIME() { return getToken(PostgreSQLStatementParser.TIME, 0); }
		public TerminalNode ZONE() { return getToken(PostgreSQLStatementParser.ZONE, 0); }
		public ExtractFromFunctionContext extractFromFunction() {
			return getRuleContext(ExtractFromFunctionContext.class,0);
		}
		public PrivateExprOfDbContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_privateExprOfDb; }
	}

	public final PrivateExprOfDbContext privateExprOfDb() throws RecognitionException {
		PrivateExprOfDbContext _localctx = new PrivateExprOfDbContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_privateExprOfDb);
		int _la;
		try {
			setState(1158);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1147);
				aggregateExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1148);
				windowFunction();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1149);
				arrayConstructorWithCast();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(1150);
				match(TIMESTAMP);
				setState(1154);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(1151);
					match(WITH);
					setState(1152);
					match(TIME);
					setState(1153);
					match(ZONE);
					}
				}

				setState(1156);
				match(STRING_);
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1157);
				extractFromFunction();
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

	public static class VariableContext extends ParserRuleContext {
		public MatchNoneContext matchNone() {
			return getRuleContext(MatchNoneContext.class,0);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1160);
			matchNone();
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

	public static class LiteralContext extends ParserRuleContext {
		public QuestionContext question() {
			return getRuleContext(QuestionContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode TRUE() { return getToken(PostgreSQLStatementParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(PostgreSQLStatementParser.FALSE, 0); }
		public TerminalNode NULL() { return getToken(PostgreSQLStatementParser.NULL, 0); }
		public TerminalNode LBE_() { return getToken(PostgreSQLStatementParser.LBE_, 0); }
		public TerminalNode IDENTIFIER_() { return getToken(PostgreSQLStatementParser.IDENTIFIER_, 0); }
		public TerminalNode STRING_() { return getToken(PostgreSQLStatementParser.STRING_, 0); }
		public TerminalNode RBE_() { return getToken(PostgreSQLStatementParser.RBE_, 0); }
		public TerminalNode HEX_DIGIT_() { return getToken(PostgreSQLStatementParser.HEX_DIGIT_, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public CollateClauseContext collateClause() {
			return getRuleContext(CollateClauseContext.class,0);
		}
		public TerminalNode DATE() { return getToken(PostgreSQLStatementParser.DATE, 0); }
		public TerminalNode TIME() { return getToken(PostgreSQLStatementParser.TIME, 0); }
		public TerminalNode TIMESTAMP() { return getToken(PostgreSQLStatementParser.TIMESTAMP, 0); }
		public TerminalNode BIT_NUM_() { return getToken(PostgreSQLStatementParser.BIT_NUM_, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_literal);
		int _la;
		try {
			setState(1187);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1162);
				question();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1163);
				number();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1164);
				match(TRUE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1165);
				match(FALSE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1166);
				match(NULL);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1167);
				match(LBE_);
				setState(1168);
				match(IDENTIFIER_);
				setState(1169);
				match(STRING_);
				setState(1170);
				match(RBE_);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1171);
				match(HEX_DIGIT_);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1172);
				string();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1173);
				match(IDENTIFIER_);
				setState(1174);
				match(STRING_);
				setState(1176);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
				case 1:
					{
					setState(1175);
					collateClause();
					}
					break;
				}
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1178);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DATE) | (1L << TIME) | (1L << TIMESTAMP))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1179);
				match(STRING_);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1181);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER_) {
					{
					setState(1180);
					match(IDENTIFIER_);
					}
				}

				setState(1183);
				match(BIT_NUM_);
				setState(1185);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
				case 1:
					{
					setState(1184);
					collateClause();
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

	public static class QuestionContext extends ParserRuleContext {
		public TerminalNode QUESTION_() { return getToken(PostgreSQLStatementParser.QUESTION_, 0); }
		public QuestionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_question; }
	}

	public final QuestionContext question() throws RecognitionException {
		QuestionContext _localctx = new QuestionContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_question);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1189);
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

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode NUMBER_() { return getToken(PostgreSQLStatementParser.NUMBER_, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1191);
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

	public static class StringContext extends ParserRuleContext {
		public TerminalNode STRING_() { return getToken(PostgreSQLStatementParser.STRING_, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1193);
			match(STRING_);
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
		public MatchNoneContext matchNone() {
			return getRuleContext(MatchNoneContext.class,0);
		}
		public SubqueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subquery; }
	}

	public final SubqueryContext subquery() throws RecognitionException {
		SubqueryContext _localctx = new SubqueryContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_subquery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1195);
			matchNone();
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

	public static class CollateClauseContext extends ParserRuleContext {
		public TerminalNode COLLATE() { return getToken(PostgreSQLStatementParser.COLLATE, 0); }
		public CollationNameContext collationName() {
			return getRuleContext(CollationNameContext.class,0);
		}
		public CollateClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collateClause; }
	}

	public final CollateClauseContext collateClause() throws RecognitionException {
		CollateClauseContext _localctx = new CollateClauseContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_collateClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1197);
			match(COLLATE);
			setState(1198);
			collationName();
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
		public TerminalNode ORDER() { return getToken(PostgreSQLStatementParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(PostgreSQLStatementParser.BY, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ASC() { return getToken(PostgreSQLStatementParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(PostgreSQLStatementParser.DESC, 0); }
		public TerminalNode USING() { return getToken(PostgreSQLStatementParser.USING, 0); }
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public TerminalNode NULLS() { return getToken(PostgreSQLStatementParser.NULLS, 0); }
		public TerminalNode FIRST() { return getToken(PostgreSQLStatementParser.FIRST, 0); }
		public TerminalNode LAST() { return getToken(PostgreSQLStatementParser.LAST, 0); }
		public OrderByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderByClause; }
	}

	public final OrderByClauseContext orderByClause() throws RecognitionException {
		OrderByClauseContext _localctx = new OrderByClauseContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_orderByClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1200);
			match(ORDER);
			setState(1201);
			match(BY);
			setState(1202);
			expr(0);
			setState(1207);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASC:
				{
				setState(1203);
				match(ASC);
				}
				break;
			case DESC:
				{
				setState(1204);
				match(DESC);
				}
				break;
			case USING:
				{
				setState(1205);
				match(USING);
				setState(1206);
				operator();
				}
				break;
			case ROWS:
			case NULLS:
			case RANGE:
			case RP_:
			case COMMA_:
				break;
			default:
				break;
			}
			setState(1211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NULLS) {
				{
				setState(1209);
				match(NULLS);
				setState(1210);
				_la = _input.LA(1);
				if ( !(_la==FIRST || _la==LAST) ) {
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

	public static class OrderByItemContext extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ASC() { return getToken(PostgreSQLStatementParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(PostgreSQLStatementParser.DESC, 0); }
		public OrderByItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderByItem; }
	}

	public final OrderByItemContext orderByItem() throws RecognitionException {
		OrderByItemContext _localctx = new OrderByItemContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_orderByItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1216);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
			case 1:
				{
				setState(1213);
				columnName();
				}
				break;
			case 2:
				{
				setState(1214);
				number();
				}
				break;
			case 3:
				{
				setState(1215);
				expr(0);
				}
				break;
			}
			setState(1219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(1218);
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

	public static class AsteriskContext extends ParserRuleContext {
		public TerminalNode ASTERISK_() { return getToken(PostgreSQLStatementParser.ASTERISK_, 0); }
		public AsteriskContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asterisk; }
	}

	public final AsteriskContext asterisk() throws RecognitionException {
		AsteriskContext _localctx = new AsteriskContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_asterisk);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1221);
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

	public static class ColumnDefinitionContext extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public CollateClauseContext collateClause() {
			return getRuleContext(CollateClauseContext.class,0);
		}
		public List<ColumnConstraintContext> columnConstraint() {
			return getRuleContexts(ColumnConstraintContext.class);
		}
		public ColumnConstraintContext columnConstraint(int i) {
			return getRuleContext(ColumnConstraintContext.class,i);
		}
		public ColumnDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnDefinition; }
	}

	public final ColumnDefinitionContext columnDefinition() throws RecognitionException {
		ColumnDefinitionContext _localctx = new ColumnDefinitionContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_columnDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1223);
			columnName();
			setState(1224);
			dataType();
			setState(1226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLLATE) {
				{
				setState(1225);
				collateClause();
				}
			}

			setState(1231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 22)) & ~0x3f) == 0 && ((1L << (_la - 22)) & ((1L << (KEY - 22)) | (1L << (NOT - 22)) | (1L << (NULL - 22)) | (1L << (PRIMARY - 22)) | (1L << (CHECK - 22)) | (1L << (CONSTRAINT - 22)) | (1L << (DEFAULT - 22)) | (1L << (GENERATED - 22)) | (1L << (REFERENCES - 22)) | (1L << (UNIQUE - 22)))) != 0)) {
				{
				{
				setState(1228);
				columnConstraint();
				}
				}
				setState(1233);
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

	public static class ColumnConstraintContext extends ParserRuleContext {
		public ColumnConstraintOptionContext columnConstraintOption() {
			return getRuleContext(ColumnConstraintOptionContext.class,0);
		}
		public ConstraintOptionalParamContext constraintOptionalParam() {
			return getRuleContext(ConstraintOptionalParamContext.class,0);
		}
		public ConstraintClauseContext constraintClause() {
			return getRuleContext(ConstraintClauseContext.class,0);
		}
		public ColumnConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnConstraint; }
	}

	public final ColumnConstraintContext columnConstraint() throws RecognitionException {
		ColumnConstraintContext _localctx = new ColumnConstraintContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_columnConstraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONSTRAINT) {
				{
				setState(1234);
				constraintClause();
				}
			}

			setState(1237);
			columnConstraintOption();
			setState(1238);
			constraintOptionalParam();
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

	public static class ConstraintClauseContext extends ParserRuleContext {
		public TerminalNode CONSTRAINT() { return getToken(PostgreSQLStatementParser.CONSTRAINT, 0); }
		public IgnoredIdentifier_Context ignoredIdentifier_() {
			return getRuleContext(IgnoredIdentifier_Context.class,0);
		}
		public ConstraintClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraintClause; }
	}

	public final ConstraintClauseContext constraintClause() throws RecognitionException {
		ConstraintClauseContext _localctx = new ConstraintClauseContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_constraintClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1240);
			match(CONSTRAINT);
			setState(1241);
			ignoredIdentifier_();
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

	public static class ColumnConstraintOptionContext extends ParserRuleContext {
		public TerminalNode NULL() { return getToken(PostgreSQLStatementParser.NULL, 0); }
		public TerminalNode NOT() { return getToken(PostgreSQLStatementParser.NOT, 0); }
		public CheckOptionContext checkOption() {
			return getRuleContext(CheckOptionContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(PostgreSQLStatementParser.DEFAULT, 0); }
		public DefaultExprContext defaultExpr() {
			return getRuleContext(DefaultExprContext.class,0);
		}
		public TerminalNode GENERATED() { return getToken(PostgreSQLStatementParser.GENERATED, 0); }
		public TerminalNode AS() { return getToken(PostgreSQLStatementParser.AS, 0); }
		public TerminalNode IDENTITY() { return getToken(PostgreSQLStatementParser.IDENTITY, 0); }
		public TerminalNode ALWAYS() { return getToken(PostgreSQLStatementParser.ALWAYS, 0); }
		public TerminalNode BY() { return getToken(PostgreSQLStatementParser.BY, 0); }
		public TerminalNode LP_() { return getToken(PostgreSQLStatementParser.LP_, 0); }
		public SequenceOptionsContext sequenceOptions() {
			return getRuleContext(SequenceOptionsContext.class,0);
		}
		public TerminalNode RP_() { return getToken(PostgreSQLStatementParser.RP_, 0); }
		public TerminalNode UNIQUE() { return getToken(PostgreSQLStatementParser.UNIQUE, 0); }
		public IndexParametersContext indexParameters() {
			return getRuleContext(IndexParametersContext.class,0);
		}
		public PrimaryKeyContext primaryKey() {
			return getRuleContext(PrimaryKeyContext.class,0);
		}
		public TerminalNode REFERENCES() { return getToken(PostgreSQLStatementParser.REFERENCES, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public TerminalNode MATCH() { return getToken(PostgreSQLStatementParser.MATCH, 0); }
		public TerminalNode FULL() { return getToken(PostgreSQLStatementParser.FULL, 0); }
		public TerminalNode PARTIAL() { return getToken(PostgreSQLStatementParser.PARTIAL, 0); }
		public TerminalNode SIMPLE() { return getToken(PostgreSQLStatementParser.SIMPLE, 0); }
		public TerminalNode ON() { return getToken(PostgreSQLStatementParser.ON, 0); }
		public TerminalNode DELETE() { return getToken(PostgreSQLStatementParser.DELETE, 0); }
		public ActionContext action() {
			return getRuleContext(ActionContext.class,0);
		}
		public List<ForeignKeyOnActionContext> foreignKeyOnAction() {
			return getRuleContexts(ForeignKeyOnActionContext.class);
		}
		public ForeignKeyOnActionContext foreignKeyOnAction(int i) {
			return getRuleContext(ForeignKeyOnActionContext.class,i);
		}
		public ColumnConstraintOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnConstraintOption; }
	}

	public final ColumnConstraintOptionContext columnConstraintOption() throws RecognitionException {
		ColumnConstraintOptionContext _localctx = new ColumnConstraintOptionContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_columnConstraintOption);
		int _la;
		try {
			setState(1296);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
			case NULL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1244);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1243);
					match(NOT);
					}
				}

				setState(1246);
				match(NULL);
				}
				break;
			case CHECK:
				enterOuterAlt(_localctx, 2);
				{
				setState(1247);
				checkOption();
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1248);
				match(DEFAULT);
				setState(1249);
				defaultExpr();
				}
				break;
			case GENERATED:
				enterOuterAlt(_localctx, 4);
				{
				setState(1250);
				match(GENERATED);
				setState(1254);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ALWAYS:
					{
					setState(1251);
					match(ALWAYS);
					}
					break;
				case BY:
					{
					setState(1252);
					match(BY);
					setState(1253);
					match(DEFAULT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1256);
				match(AS);
				setState(1257);
				match(IDENTITY);
				setState(1262);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LP_) {
					{
					setState(1258);
					match(LP_);
					setState(1259);
					sequenceOptions();
					setState(1260);
					match(RP_);
					}
				}

				}
				break;
			case UNIQUE:
				enterOuterAlt(_localctx, 5);
				{
				setState(1264);
				match(UNIQUE);
				setState(1265);
				indexParameters();
				}
				break;
			case KEY:
			case PRIMARY:
				enterOuterAlt(_localctx, 6);
				{
				setState(1266);
				primaryKey();
				setState(1267);
				indexParameters();
				}
				break;
			case REFERENCES:
				enterOuterAlt(_localctx, 7);
				{
				setState(1269);
				match(REFERENCES);
				setState(1270);
				tableName();
				setState(1275);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LP_) {
					{
					setState(1271);
					match(LP_);
					setState(1272);
					columnName();
					setState(1273);
					match(RP_);
					}
				}

				setState(1283);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
				case 1:
					{
					setState(1277);
					match(MATCH);
					setState(1278);
					match(FULL);
					}
					break;
				case 2:
					{
					setState(1279);
					match(MATCH);
					setState(1280);
					match(PARTIAL);
					}
					break;
				case 3:
					{
					setState(1281);
					match(MATCH);
					setState(1282);
					match(SIMPLE);
					}
					break;
				}
				setState(1288);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
				case 1:
					{
					setState(1285);
					match(ON);
					setState(1286);
					match(DELETE);
					setState(1287);
					action();
					}
					break;
				}
				setState(1293);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ON) {
					{
					{
					setState(1290);
					foreignKeyOnAction();
					}
					}
					setState(1295);
					_errHandler.sync(this);
					_la = _input.LA(1);
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

	public static class CheckOptionContext extends ParserRuleContext {
		public TerminalNode CHECK() { return getToken(PostgreSQLStatementParser.CHECK, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NO() { return getToken(PostgreSQLStatementParser.NO, 0); }
		public TerminalNode INHERIT() { return getToken(PostgreSQLStatementParser.INHERIT, 0); }
		public CheckOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_checkOption; }
	}

	public final CheckOptionContext checkOption() throws RecognitionException {
		CheckOptionContext _localctx = new CheckOptionContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_checkOption);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1298);
			match(CHECK);
			setState(1299);
			expr(0);
			setState(1302);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NO) {
				{
				setState(1300);
				match(NO);
				setState(1301);
				match(INHERIT);
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

	public static class DefaultExprContext extends ParserRuleContext {
		public TerminalNode CURRENT_TIMESTAMP() { return getToken(PostgreSQLStatementParser.CURRENT_TIMESTAMP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DefaultExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultExpr; }
	}

	public final DefaultExprContext defaultExpr() throws RecognitionException {
		DefaultExprContext _localctx = new DefaultExprContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_defaultExpr);
		try {
			setState(1306);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CURRENT_TIMESTAMP:
				enterOuterAlt(_localctx, 1);
				{
				setState(1304);
				match(CURRENT_TIMESTAMP);
				}
				break;
			case T__0:
			case BINARY:
			case DATE:
			case EXISTS:
			case FALSE:
			case NOT:
			case NULL:
			case ROW:
			case TIME:
			case TIMESTAMP:
			case TRUE:
			case ARRAY:
			case EXTRACT:
			case NOT_:
			case TILDE_:
			case PLUS_:
			case MINUS_:
			case LP_:
			case LBE_:
			case QUESTION_:
			case IDENTIFIER_:
			case STRING_:
			case NUMBER_:
			case HEX_DIGIT_:
			case BIT_NUM_:
				enterOuterAlt(_localctx, 2);
				{
				setState(1305);
				expr(0);
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

	public static class SequenceOptionsContext extends ParserRuleContext {
		public List<SequenceOptionContext> sequenceOption() {
			return getRuleContexts(SequenceOptionContext.class);
		}
		public SequenceOptionContext sequenceOption(int i) {
			return getRuleContext(SequenceOptionContext.class,i);
		}
		public SequenceOptionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sequenceOptions; }
	}

	public final SequenceOptionsContext sequenceOptions() throws RecognitionException {
		SequenceOptionsContext _localctx = new SequenceOptionsContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_sequenceOptions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1309); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1308);
				sequenceOption();
				}
				}
				setState(1311); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (NO - 70)) | (1L << (START - 70)) | (1L << (CACHE - 70)) | (1L << (CYCLE - 70)) | (1L << (INCREMENT - 70)))) != 0) || _la==MAXVALUE || _la==MINVALUE );
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

	public static class SequenceOptionContext extends ParserRuleContext {
		public TerminalNode START() { return getToken(PostgreSQLStatementParser.START, 0); }
		public TerminalNode NUMBER_() { return getToken(PostgreSQLStatementParser.NUMBER_, 0); }
		public TerminalNode WITH() { return getToken(PostgreSQLStatementParser.WITH, 0); }
		public TerminalNode INCREMENT() { return getToken(PostgreSQLStatementParser.INCREMENT, 0); }
		public TerminalNode BY() { return getToken(PostgreSQLStatementParser.BY, 0); }
		public TerminalNode MAXVALUE() { return getToken(PostgreSQLStatementParser.MAXVALUE, 0); }
		public TerminalNode NO() { return getToken(PostgreSQLStatementParser.NO, 0); }
		public TerminalNode MINVALUE() { return getToken(PostgreSQLStatementParser.MINVALUE, 0); }
		public TerminalNode CYCLE() { return getToken(PostgreSQLStatementParser.CYCLE, 0); }
		public TerminalNode CACHE() { return getToken(PostgreSQLStatementParser.CACHE, 0); }
		public SequenceOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sequenceOption; }
	}

	public final SequenceOptionContext sequenceOption() throws RecognitionException {
		SequenceOptionContext _localctx = new SequenceOptionContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_sequenceOption);
		int _la;
		try {
			setState(1336);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1313);
				match(START);
				setState(1315);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(1314);
					match(WITH);
					}
				}

				setState(1317);
				match(NUMBER_);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1318);
				match(INCREMENT);
				setState(1320);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BY) {
					{
					setState(1319);
					match(BY);
					}
				}

				setState(1322);
				match(NUMBER_);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1323);
				match(MAXVALUE);
				setState(1324);
				match(NUMBER_);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1325);
				match(NO);
				setState(1326);
				match(MAXVALUE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1327);
				match(MINVALUE);
				setState(1328);
				match(NUMBER_);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1329);
				match(NO);
				setState(1330);
				match(MINVALUE);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1331);
				match(CYCLE);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1332);
				match(NO);
				setState(1333);
				match(CYCLE);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1334);
				match(CACHE);
				setState(1335);
				match(NUMBER_);
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

	public static class IndexParametersContext extends ParserRuleContext {
		public TerminalNode USING() { return getToken(PostgreSQLStatementParser.USING, 0); }
		public TerminalNode INDEX() { return getToken(PostgreSQLStatementParser.INDEX, 0); }
		public TerminalNode TABLESPACE() { return getToken(PostgreSQLStatementParser.TABLESPACE, 0); }
		public IgnoredIdentifier_Context ignoredIdentifier_() {
			return getRuleContext(IgnoredIdentifier_Context.class,0);
		}
		public IndexParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexParameters; }
	}

	public final IndexParametersContext indexParameters() throws RecognitionException {
		IndexParametersContext _localctx = new IndexParametersContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_indexParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1342);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==USING) {
				{
				setState(1338);
				match(USING);
				setState(1339);
				match(INDEX);
				setState(1340);
				match(TABLESPACE);
				setState(1341);
				ignoredIdentifier_();
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

	public static class ActionContext extends ParserRuleContext {
		public TerminalNode NO() { return getToken(PostgreSQLStatementParser.NO, 0); }
		public TerminalNode ACTION() { return getToken(PostgreSQLStatementParser.ACTION, 0); }
		public TerminalNode RESTRICT() { return getToken(PostgreSQLStatementParser.RESTRICT, 0); }
		public TerminalNode CASCADE() { return getToken(PostgreSQLStatementParser.CASCADE, 0); }
		public TerminalNode SET() { return getToken(PostgreSQLStatementParser.SET, 0); }
		public TerminalNode NULL() { return getToken(PostgreSQLStatementParser.NULL, 0); }
		public TerminalNode DEFAULT() { return getToken(PostgreSQLStatementParser.DEFAULT, 0); }
		public ActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_action; }
	}

	public final ActionContext action() throws RecognitionException {
		ActionContext _localctx = new ActionContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_action);
		int _la;
		try {
			setState(1350);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NO:
				enterOuterAlt(_localctx, 1);
				{
				setState(1344);
				match(NO);
				setState(1345);
				match(ACTION);
				}
				break;
			case RESTRICT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1346);
				match(RESTRICT);
				}
				break;
			case CASCADE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1347);
				match(CASCADE);
				}
				break;
			case SET:
				enterOuterAlt(_localctx, 4);
				{
				setState(1348);
				match(SET);
				setState(1349);
				_la = _input.LA(1);
				if ( !(_la==NULL || _la==DEFAULT) ) {
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

	public static class ForeignKeyOnActionContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(PostgreSQLStatementParser.ON, 0); }
		public TerminalNode UPDATE() { return getToken(PostgreSQLStatementParser.UPDATE, 0); }
		public ForeignKeyOnContext foreignKeyOn() {
			return getRuleContext(ForeignKeyOnContext.class,0);
		}
		public TerminalNode DELETE() { return getToken(PostgreSQLStatementParser.DELETE, 0); }
		public ForeignKeyOnActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreignKeyOnAction; }
	}

	public final ForeignKeyOnActionContext foreignKeyOnAction() throws RecognitionException {
		ForeignKeyOnActionContext _localctx = new ForeignKeyOnActionContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_foreignKeyOnAction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1352);
			match(ON);
			setState(1357);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UPDATE:
				{
				setState(1353);
				match(UPDATE);
				setState(1354);
				foreignKeyOn();
				}
				break;
			case DELETE:
				{
				setState(1355);
				match(DELETE);
				setState(1356);
				foreignKeyOn();
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

	public static class ForeignKeyOnContext extends ParserRuleContext {
		public TerminalNode RESTRICT() { return getToken(PostgreSQLStatementParser.RESTRICT, 0); }
		public TerminalNode CASCADE() { return getToken(PostgreSQLStatementParser.CASCADE, 0); }
		public TerminalNode SET() { return getToken(PostgreSQLStatementParser.SET, 0); }
		public TerminalNode NULL() { return getToken(PostgreSQLStatementParser.NULL, 0); }
		public TerminalNode NO() { return getToken(PostgreSQLStatementParser.NO, 0); }
		public TerminalNode ACTION() { return getToken(PostgreSQLStatementParser.ACTION, 0); }
		public TerminalNode DEFAULT() { return getToken(PostgreSQLStatementParser.DEFAULT, 0); }
		public ForeignKeyOnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreignKeyOn; }
	}

	public final ForeignKeyOnContext foreignKeyOn() throws RecognitionException {
		ForeignKeyOnContext _localctx = new ForeignKeyOnContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_foreignKeyOn);
		try {
			setState(1367);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1359);
				match(RESTRICT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1360);
				match(CASCADE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1361);
				match(SET);
				setState(1362);
				match(NULL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1363);
				match(NO);
				setState(1364);
				match(ACTION);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1365);
				match(SET);
				setState(1366);
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

	public static class ConstraintOptionalParamContext extends ParserRuleContext {
		public TerminalNode DEFERRABLE() { return getToken(PostgreSQLStatementParser.DEFERRABLE, 0); }
		public TerminalNode INITIALLY() { return getToken(PostgreSQLStatementParser.INITIALLY, 0); }
		public TerminalNode DEFERRED() { return getToken(PostgreSQLStatementParser.DEFERRED, 0); }
		public TerminalNode IMMEDIATE() { return getToken(PostgreSQLStatementParser.IMMEDIATE, 0); }
		public TerminalNode NOT() { return getToken(PostgreSQLStatementParser.NOT, 0); }
		public ConstraintOptionalParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraintOptionalParam; }
	}

	public final ConstraintOptionalParamContext constraintOptionalParam() throws RecognitionException {
		ConstraintOptionalParamContext _localctx = new ConstraintOptionalParamContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_constraintOptionalParam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1373);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
			case 1:
				{
				setState(1370);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1369);
					match(NOT);
					}
				}

				setState(1372);
				match(DEFERRABLE);
				}
				break;
			}
			setState(1377);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INITIALLY) {
				{
				setState(1375);
				match(INITIALLY);
				setState(1376);
				_la = _input.LA(1);
				if ( !(_la==DEFERRED || _la==IMMEDIATE) ) {
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
		public IntervalFieldsContext intervalFields() {
			return getRuleContext(IntervalFieldsContext.class,0);
		}
		public DataTypeLengthContext dataTypeLength() {
			return getRuleContext(DataTypeLengthContext.class,0);
		}
		public TerminalNode WITHOUT() { return getToken(PostgreSQLStatementParser.WITHOUT, 0); }
		public TerminalNode TIME() { return getToken(PostgreSQLStatementParser.TIME, 0); }
		public TerminalNode ZONE() { return getToken(PostgreSQLStatementParser.ZONE, 0); }
		public TerminalNode WITH() { return getToken(PostgreSQLStatementParser.WITH, 0); }
		public List<TerminalNode> LBT_() { return getTokens(PostgreSQLStatementParser.LBT_); }
		public TerminalNode LBT_(int i) {
			return getToken(PostgreSQLStatementParser.LBT_, i);
		}
		public List<TerminalNode> RBT_() { return getTokens(PostgreSQLStatementParser.RBT_); }
		public TerminalNode RBT_(int i) {
			return getToken(PostgreSQLStatementParser.RBT_, i);
		}
		public TerminalNode IDENTIFIER_() { return getToken(PostgreSQLStatementParser.IDENTIFIER_, 0); }
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_dataType);
		try {
			int _alt;
			setState(1402);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1379);
				dataTypeName_();
				setState(1381);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
				case 1:
					{
					setState(1380);
					intervalFields();
					}
					break;
				}
				setState(1384);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
				case 1:
					{
					setState(1383);
					dataTypeLength();
					}
					break;
				}
				setState(1392);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
				case 1:
					{
					setState(1386);
					match(WITHOUT);
					setState(1387);
					match(TIME);
					setState(1388);
					match(ZONE);
					}
					break;
				case 2:
					{
					setState(1389);
					match(WITH);
					setState(1390);
					match(TIME);
					setState(1391);
					match(ZONE);
					}
					break;
				}
				setState(1398);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,140,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1394);
						match(LBT_);
						setState(1395);
						match(RBT_);
						}
						} 
					}
					setState(1400);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,140,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1401);
				match(IDENTIFIER_);
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
		public List<TerminalNode> IDENTIFIER_() { return getTokens(PostgreSQLStatementParser.IDENTIFIER_); }
		public TerminalNode IDENTIFIER_(int i) {
			return getToken(PostgreSQLStatementParser.IDENTIFIER_, i);
		}
		public DataTypeName_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataTypeName_; }
	}

	public final DataTypeName_Context dataTypeName_() throws RecognitionException {
		DataTypeName_Context _localctx = new DataTypeName_Context(_ctx, getState());
		enterRule(_localctx, 178, RULE_dataTypeName_);
		try {
			setState(1407);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1404);
				match(IDENTIFIER_);
				setState(1405);
				match(IDENTIFIER_);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1406);
				match(IDENTIFIER_);
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

	public static class IntervalFieldsContext extends ParserRuleContext {
		public List<IntervalFieldContext> intervalField() {
			return getRuleContexts(IntervalFieldContext.class);
		}
		public IntervalFieldContext intervalField(int i) {
			return getRuleContext(IntervalFieldContext.class,i);
		}
		public TerminalNode TO() { return getToken(PostgreSQLStatementParser.TO, 0); }
		public IntervalFieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intervalFields; }
	}

	public final IntervalFieldsContext intervalFields() throws RecognitionException {
		IntervalFieldsContext _localctx = new IntervalFieldsContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_intervalFields);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1409);
			intervalField();
			setState(1412);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
			case 1:
				{
				setState(1410);
				match(TO);
				setState(1411);
				intervalField();
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

	public static class IntervalFieldContext extends ParserRuleContext {
		public TerminalNode YEAR() { return getToken(PostgreSQLStatementParser.YEAR, 0); }
		public TerminalNode MONTH() { return getToken(PostgreSQLStatementParser.MONTH, 0); }
		public TerminalNode DAY() { return getToken(PostgreSQLStatementParser.DAY, 0); }
		public TerminalNode HOUR() { return getToken(PostgreSQLStatementParser.HOUR, 0); }
		public TerminalNode MINUTE() { return getToken(PostgreSQLStatementParser.MINUTE, 0); }
		public TerminalNode SECOND() { return getToken(PostgreSQLStatementParser.SECOND, 0); }
		public IntervalFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intervalField; }
	}

	public final IntervalFieldContext intervalField() throws RecognitionException {
		IntervalFieldContext _localctx = new IntervalFieldContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_intervalField);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1414);
			_la = _input.LA(1);
			if ( !(_la==DAY || _la==YEAR || ((((_la - 127)) & ~0x3f) == 0 && ((1L << (_la - 127)) & ((1L << (HOUR - 127)) | (1L << (MINUTE - 127)) | (1L << (MONTH - 127)) | (1L << (SECOND - 127)))) != 0)) ) {
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

	public static class PgExprContext extends ParserRuleContext {
		public CastExprContext castExpr() {
			return getRuleContext(CastExprContext.class,0);
		}
		public CollateExprContext collateExpr() {
			return getRuleContext(CollateExprContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PgExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pgExpr; }
	}

	public final PgExprContext pgExpr() throws RecognitionException {
		PgExprContext _localctx = new PgExprContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_pgExpr);
		try {
			setState(1419);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1416);
				castExpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1417);
				collateExpr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1418);
				expr(0);
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

	public static class AggregateExpressionContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER_() { return getToken(PostgreSQLStatementParser.IDENTIFIER_, 0); }
		public AsteriskWithParenContext asteriskWithParen() {
			return getRuleContext(AsteriskWithParenContext.class,0);
		}
		public List<TerminalNode> LP_() { return getTokens(PostgreSQLStatementParser.LP_); }
		public TerminalNode LP_(int i) {
			return getToken(PostgreSQLStatementParser.LP_, i);
		}
		public List<ExprsContext> exprs() {
			return getRuleContexts(ExprsContext.class);
		}
		public ExprsContext exprs(int i) {
			return getRuleContext(ExprsContext.class,i);
		}
		public List<TerminalNode> RP_() { return getTokens(PostgreSQLStatementParser.RP_); }
		public TerminalNode RP_(int i) {
			return getToken(PostgreSQLStatementParser.RP_, i);
		}
		public TerminalNode WITHIN() { return getToken(PostgreSQLStatementParser.WITHIN, 0); }
		public TerminalNode GROUP() { return getToken(PostgreSQLStatementParser.GROUP, 0); }
		public List<OrderByClauseContext> orderByClause() {
			return getRuleContexts(OrderByClauseContext.class);
		}
		public OrderByClauseContext orderByClause(int i) {
			return getRuleContext(OrderByClauseContext.class,i);
		}
		public FilterClauseContext filterClause() {
			return getRuleContext(FilterClauseContext.class,0);
		}
		public TerminalNode ALL() { return getToken(PostgreSQLStatementParser.ALL, 0); }
		public TerminalNode DISTINCT() { return getToken(PostgreSQLStatementParser.DISTINCT, 0); }
		public AggregateExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregateExpression; }
	}

	public final AggregateExpressionContext aggregateExpression() throws RecognitionException {
		AggregateExpressionContext _localctx = new AggregateExpressionContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_aggregateExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1421);
			match(IDENTIFIER_);
			{
			setState(1422);
			match(LP_);
			setState(1424);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ALL || _la==DISTINCT) {
				{
				setState(1423);
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

			setState(1426);
			exprs();
			setState(1428);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(1427);
				orderByClause();
				}
			}

			setState(1430);
			match(RP_);
			}
			setState(1432);
			asteriskWithParen();
			{
			setState(1433);
			match(LP_);
			setState(1434);
			exprs();
			setState(1435);
			match(RP_);
			setState(1436);
			match(WITHIN);
			setState(1437);
			match(GROUP);
			setState(1438);
			match(LP_);
			setState(1439);
			orderByClause();
			setState(1440);
			match(RP_);
			}
			setState(1443);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
			case 1:
				{
				setState(1442);
				filterClause();
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

	public static class FilterClauseContext extends ParserRuleContext {
		public TerminalNode FILTER() { return getToken(PostgreSQLStatementParser.FILTER, 0); }
		public TerminalNode LP_() { return getToken(PostgreSQLStatementParser.LP_, 0); }
		public TerminalNode WHERE() { return getToken(PostgreSQLStatementParser.WHERE, 0); }
		public BooleanPrimaryContext booleanPrimary() {
			return getRuleContext(BooleanPrimaryContext.class,0);
		}
		public TerminalNode RP_() { return getToken(PostgreSQLStatementParser.RP_, 0); }
		public FilterClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filterClause; }
	}

	public final FilterClauseContext filterClause() throws RecognitionException {
		FilterClauseContext _localctx = new FilterClauseContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_filterClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1445);
			match(FILTER);
			setState(1446);
			match(LP_);
			setState(1447);
			match(WHERE);
			setState(1448);
			booleanPrimary(0);
			setState(1449);
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

	public static class AsteriskWithParenContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(PostgreSQLStatementParser.LP_, 0); }
		public TerminalNode ASTERISK_() { return getToken(PostgreSQLStatementParser.ASTERISK_, 0); }
		public TerminalNode RP_() { return getToken(PostgreSQLStatementParser.RP_, 0); }
		public AsteriskWithParenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asteriskWithParen; }
	}

	public final AsteriskWithParenContext asteriskWithParen() throws RecognitionException {
		AsteriskWithParenContext _localctx = new AsteriskWithParenContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_asteriskWithParen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1451);
			match(LP_);
			setState(1452);
			match(ASTERISK_);
			setState(1453);
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

	public static class WindowFunctionContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER_() { return getToken(PostgreSQLStatementParser.IDENTIFIER_, 0); }
		public WindowFunctionWithClauseContext windowFunctionWithClause() {
			return getRuleContext(WindowFunctionWithClauseContext.class,0);
		}
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public AsteriskWithParenContext asteriskWithParen() {
			return getRuleContext(AsteriskWithParenContext.class,0);
		}
		public FilterClauseContext filterClause() {
			return getRuleContext(FilterClauseContext.class,0);
		}
		public WindowFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowFunction; }
	}

	public final WindowFunctionContext windowFunction() throws RecognitionException {
		WindowFunctionContext _localctx = new WindowFunctionContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_windowFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1455);
			match(IDENTIFIER_);
			setState(1458);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
			case 1:
				{
				setState(1456);
				exprList();
				}
				break;
			case 2:
				{
				setState(1457);
				asteriskWithParen();
				}
				break;
			}
			setState(1461);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FILTER) {
				{
				setState(1460);
				filterClause();
				}
			}

			setState(1463);
			windowFunctionWithClause();
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

	public static class WindowFunctionWithClauseContext extends ParserRuleContext {
		public TerminalNode OVER() { return getToken(PostgreSQLStatementParser.OVER, 0); }
		public TerminalNode IDENTIFIER_() { return getToken(PostgreSQLStatementParser.IDENTIFIER_, 0); }
		public TerminalNode LP_() { return getToken(PostgreSQLStatementParser.LP_, 0); }
		public WindowDefinitionContext windowDefinition() {
			return getRuleContext(WindowDefinitionContext.class,0);
		}
		public TerminalNode RP_() { return getToken(PostgreSQLStatementParser.RP_, 0); }
		public WindowFunctionWithClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowFunctionWithClause; }
	}

	public final WindowFunctionWithClauseContext windowFunctionWithClause() throws RecognitionException {
		WindowFunctionWithClauseContext _localctx = new WindowFunctionWithClauseContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_windowFunctionWithClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1465);
			match(OVER);
			setState(1471);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER_:
				{
				setState(1466);
				match(IDENTIFIER_);
				}
				break;
			case LP_:
				{
				setState(1467);
				match(LP_);
				setState(1468);
				windowDefinition();
				setState(1469);
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

	public static class WindowDefinitionContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER_() { return getToken(PostgreSQLStatementParser.IDENTIFIER_, 0); }
		public TerminalNode PARTITION() { return getToken(PostgreSQLStatementParser.PARTITION, 0); }
		public TerminalNode BY() { return getToken(PostgreSQLStatementParser.BY, 0); }
		public ExprsContext exprs() {
			return getRuleContext(ExprsContext.class,0);
		}
		public List<OrderByClauseContext> orderByClause() {
			return getRuleContexts(OrderByClauseContext.class);
		}
		public OrderByClauseContext orderByClause(int i) {
			return getRuleContext(OrderByClauseContext.class,i);
		}
		public FrameClauseContext frameClause() {
			return getRuleContext(FrameClauseContext.class,0);
		}
		public List<TerminalNode> COMMA_() { return getTokens(PostgreSQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(PostgreSQLStatementParser.COMMA_, i);
		}
		public WindowDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowDefinition; }
	}

	public final WindowDefinitionContext windowDefinition() throws RecognitionException {
		WindowDefinitionContext _localctx = new WindowDefinitionContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_windowDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1474);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER_) {
				{
				setState(1473);
				match(IDENTIFIER_);
				}
			}

			setState(1479);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PARTITION) {
				{
				setState(1476);
				match(PARTITION);
				setState(1477);
				match(BY);
				setState(1478);
				exprs();
				}
			}

			setState(1489);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(1481);
				orderByClause();
				setState(1486);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(1482);
					match(COMMA_);
					setState(1483);
					orderByClause();
					}
					}
					setState(1488);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1492);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ROWS || _la==RANGE) {
				{
				setState(1491);
				frameClause();
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

	public static class OperatorContext extends ParserRuleContext {
		public TerminalNode SAFE_EQ_() { return getToken(PostgreSQLStatementParser.SAFE_EQ_, 0); }
		public TerminalNode EQ_() { return getToken(PostgreSQLStatementParser.EQ_, 0); }
		public TerminalNode NEQ_() { return getToken(PostgreSQLStatementParser.NEQ_, 0); }
		public TerminalNode GT_() { return getToken(PostgreSQLStatementParser.GT_, 0); }
		public TerminalNode GTE_() { return getToken(PostgreSQLStatementParser.GTE_, 0); }
		public TerminalNode LT_() { return getToken(PostgreSQLStatementParser.LT_, 0); }
		public TerminalNode LTE_() { return getToken(PostgreSQLStatementParser.LTE_, 0); }
		public TerminalNode AND_() { return getToken(PostgreSQLStatementParser.AND_, 0); }
		public TerminalNode OR_() { return getToken(PostgreSQLStatementParser.OR_, 0); }
		public TerminalNode NOT_() { return getToken(PostgreSQLStatementParser.NOT_, 0); }
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1494);
			_la = _input.LA(1);
			if ( !(((((_la - 199)) & ~0x3f) == 0 && ((1L << (_la - 199)) & ((1L << (AND_ - 199)) | (1L << (OR_ - 199)) | (1L << (NOT_ - 199)) | (1L << (SAFE_EQ_ - 199)) | (1L << (EQ_ - 199)) | (1L << (NEQ_ - 199)) | (1L << (GT_ - 199)) | (1L << (GTE_ - 199)) | (1L << (LT_ - 199)) | (1L << (LTE_ - 199)))) != 0)) ) {
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

	public static class FrameClauseContext extends ParserRuleContext {
		public FrameStartContext frameStart() {
			return getRuleContext(FrameStartContext.class,0);
		}
		public TerminalNode RANGE() { return getToken(PostgreSQLStatementParser.RANGE, 0); }
		public TerminalNode ROWS() { return getToken(PostgreSQLStatementParser.ROWS, 0); }
		public TerminalNode BETWEEN() { return getToken(PostgreSQLStatementParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(PostgreSQLStatementParser.AND, 0); }
		public FrameEndContext frameEnd() {
			return getRuleContext(FrameEndContext.class,0);
		}
		public FrameClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frameClause; }
	}

	public final FrameClauseContext frameClause() throws RecognitionException {
		FrameClauseContext _localctx = new FrameClauseContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_frameClause);
		int _la;
		try {
			setState(1504);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,156,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1496);
				_la = _input.LA(1);
				if ( !(_la==ROWS || _la==RANGE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1497);
				frameStart();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1498);
				_la = _input.LA(1);
				if ( !(_la==ROWS || _la==RANGE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1499);
				match(BETWEEN);
				setState(1500);
				frameStart();
				setState(1501);
				match(AND);
				setState(1502);
				frameEnd();
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

	public static class FrameStartContext extends ParserRuleContext {
		public TerminalNode UNBOUNDED() { return getToken(PostgreSQLStatementParser.UNBOUNDED, 0); }
		public TerminalNode PRECEDING() { return getToken(PostgreSQLStatementParser.PRECEDING, 0); }
		public TerminalNode NUMBER_() { return getToken(PostgreSQLStatementParser.NUMBER_, 0); }
		public TerminalNode CURRENT() { return getToken(PostgreSQLStatementParser.CURRENT, 0); }
		public TerminalNode ROW() { return getToken(PostgreSQLStatementParser.ROW, 0); }
		public TerminalNode FOLLOWING() { return getToken(PostgreSQLStatementParser.FOLLOWING, 0); }
		public FrameStartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frameStart; }
	}

	public final FrameStartContext frameStart() throws RecognitionException {
		FrameStartContext _localctx = new FrameStartContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_frameStart);
		try {
			setState(1516);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1506);
				match(UNBOUNDED);
				setState(1507);
				match(PRECEDING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1508);
				match(NUMBER_);
				setState(1509);
				match(PRECEDING);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1510);
				match(CURRENT);
				setState(1511);
				match(ROW);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1512);
				match(NUMBER_);
				setState(1513);
				match(FOLLOWING);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1514);
				match(UNBOUNDED);
				setState(1515);
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

	public static class FrameEndContext extends ParserRuleContext {
		public FrameStartContext frameStart() {
			return getRuleContext(FrameStartContext.class,0);
		}
		public FrameEndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frameEnd; }
	}

	public final FrameEndContext frameEnd() throws RecognitionException {
		FrameEndContext _localctx = new FrameEndContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_frameEnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1518);
			frameStart();
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

	public static class CastExprContext extends ParserRuleContext {
		public TerminalNode CAST() { return getToken(PostgreSQLStatementParser.CAST, 0); }
		public TerminalNode LP_() { return getToken(PostgreSQLStatementParser.LP_, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode AS() { return getToken(PostgreSQLStatementParser.AS, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode RP_() { return getToken(PostgreSQLStatementParser.RP_, 0); }
		public List<TerminalNode> COLON_() { return getTokens(PostgreSQLStatementParser.COLON_); }
		public TerminalNode COLON_(int i) {
			return getToken(PostgreSQLStatementParser.COLON_, i);
		}
		public CastExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castExpr; }
	}

	public final CastExprContext castExpr() throws RecognitionException {
		CastExprContext _localctx = new CastExprContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_castExpr);
		try {
			setState(1532);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CAST:
				enterOuterAlt(_localctx, 1);
				{
				setState(1520);
				match(CAST);
				setState(1521);
				match(LP_);
				setState(1522);
				expr(0);
				setState(1523);
				match(AS);
				setState(1524);
				dataType();
				setState(1525);
				match(RP_);
				}
				break;
			case T__0:
			case BINARY:
			case DATE:
			case EXISTS:
			case FALSE:
			case NOT:
			case NULL:
			case ROW:
			case TIME:
			case TIMESTAMP:
			case TRUE:
			case ARRAY:
			case EXTRACT:
			case NOT_:
			case TILDE_:
			case PLUS_:
			case MINUS_:
			case LP_:
			case LBE_:
			case QUESTION_:
			case IDENTIFIER_:
			case STRING_:
			case NUMBER_:
			case HEX_DIGIT_:
			case BIT_NUM_:
				enterOuterAlt(_localctx, 2);
				{
				setState(1527);
				expr(0);
				setState(1528);
				match(COLON_);
				setState(1529);
				match(COLON_);
				setState(1530);
				dataType();
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

	public static class CastExprWithCOLON_Context extends ParserRuleContext {
		public List<TerminalNode> COLON_() { return getTokens(PostgreSQLStatementParser.COLON_); }
		public TerminalNode COLON_(int i) {
			return getToken(PostgreSQLStatementParser.COLON_, i);
		}
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public List<TerminalNode> LBT_() { return getTokens(PostgreSQLStatementParser.LBT_); }
		public TerminalNode LBT_(int i) {
			return getToken(PostgreSQLStatementParser.LBT_, i);
		}
		public List<TerminalNode> RBT_() { return getTokens(PostgreSQLStatementParser.RBT_); }
		public TerminalNode RBT_(int i) {
			return getToken(PostgreSQLStatementParser.RBT_, i);
		}
		public CastExprWithCOLON_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castExprWithCOLON_; }
	}

	public final CastExprWithCOLON_Context castExprWithCOLON_() throws RecognitionException {
		CastExprWithCOLON_Context _localctx = new CastExprWithCOLON_Context(_ctx, getState());
		enterRule(_localctx, 208, RULE_castExprWithCOLON_);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1534);
			match(COLON_);
			setState(1535);
			match(COLON_);
			setState(1536);
			dataType();
			setState(1541);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,159,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1537);
					match(LBT_);
					setState(1538);
					match(RBT_);
					}
					} 
				}
				setState(1543);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,159,_ctx);
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

	public static class CollateExprContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode COLLATE() { return getToken(PostgreSQLStatementParser.COLLATE, 0); }
		public CollateExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collateExpr; }
	}

	public final CollateExprContext collateExpr() throws RecognitionException {
		CollateExprContext _localctx = new CollateExprContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_collateExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1544);
			expr(0);
			setState(1545);
			match(COLLATE);
			setState(1546);
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

	public static class ArrayConstructorWithCastContext extends ParserRuleContext {
		public ArrayConstructorContext arrayConstructor() {
			return getRuleContext(ArrayConstructorContext.class,0);
		}
		public CastExprWithCOLON_Context castExprWithCOLON_() {
			return getRuleContext(CastExprWithCOLON_Context.class,0);
		}
		public TerminalNode ARRAY() { return getToken(PostgreSQLStatementParser.ARRAY, 0); }
		public TerminalNode LBT_() { return getToken(PostgreSQLStatementParser.LBT_, 0); }
		public TerminalNode RBT_() { return getToken(PostgreSQLStatementParser.RBT_, 0); }
		public ArrayConstructorWithCastContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayConstructorWithCast; }
	}

	public final ArrayConstructorWithCastContext arrayConstructorWithCast() throws RecognitionException {
		ArrayConstructorWithCastContext _localctx = new ArrayConstructorWithCastContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_arrayConstructorWithCast);
		try {
			setState(1556);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1548);
				arrayConstructor();
				setState(1550);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
				case 1:
					{
					setState(1549);
					castExprWithCOLON_();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1552);
				match(ARRAY);
				setState(1553);
				match(LBT_);
				setState(1554);
				match(RBT_);
				setState(1555);
				castExprWithCOLON_();
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

	public static class ArrayConstructorContext extends ParserRuleContext {
		public TerminalNode ARRAY() { return getToken(PostgreSQLStatementParser.ARRAY, 0); }
		public TerminalNode LBT_() { return getToken(PostgreSQLStatementParser.LBT_, 0); }
		public ExprsContext exprs() {
			return getRuleContext(ExprsContext.class,0);
		}
		public TerminalNode RBT_() { return getToken(PostgreSQLStatementParser.RBT_, 0); }
		public List<ArrayConstructorContext> arrayConstructor() {
			return getRuleContexts(ArrayConstructorContext.class);
		}
		public ArrayConstructorContext arrayConstructor(int i) {
			return getRuleContext(ArrayConstructorContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(PostgreSQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(PostgreSQLStatementParser.COMMA_, i);
		}
		public ArrayConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayConstructor; }
	}

	public final ArrayConstructorContext arrayConstructor() throws RecognitionException {
		ArrayConstructorContext _localctx = new ArrayConstructorContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_arrayConstructor);
		int _la;
		try {
			setState(1575);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1558);
				match(ARRAY);
				setState(1559);
				match(LBT_);
				setState(1560);
				exprs();
				setState(1561);
				match(RBT_);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1563);
				match(ARRAY);
				setState(1564);
				match(LBT_);
				setState(1565);
				arrayConstructor();
				setState(1570);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(1566);
					match(COMMA_);
					setState(1567);
					arrayConstructor();
					}
					}
					setState(1572);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1573);
				match(RBT_);
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

	public static class ExtractFromFunctionContext extends ParserRuleContext {
		public TerminalNode EXTRACT() { return getToken(PostgreSQLStatementParser.EXTRACT, 0); }
		public TerminalNode LP_() { return getToken(PostgreSQLStatementParser.LP_, 0); }
		public List<TerminalNode> IDENTIFIER_() { return getTokens(PostgreSQLStatementParser.IDENTIFIER_); }
		public TerminalNode IDENTIFIER_(int i) {
			return getToken(PostgreSQLStatementParser.IDENTIFIER_, i);
		}
		public TerminalNode FROM() { return getToken(PostgreSQLStatementParser.FROM, 0); }
		public TerminalNode RP_() { return getToken(PostgreSQLStatementParser.RP_, 0); }
		public ExtractFromFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extractFromFunction; }
	}

	public final ExtractFromFunctionContext extractFromFunction() throws RecognitionException {
		ExtractFromFunctionContext _localctx = new ExtractFromFunctionContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_extractFromFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1577);
			match(EXTRACT);
			setState(1578);
			match(LP_);
			setState(1579);
			match(IDENTIFIER_);
			setState(1580);
			match(FROM);
			setState(1581);
			match(IDENTIFIER_);
			setState(1582);
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

	public static class IgnoredIdentifier_Context extends ParserRuleContext {
		public TerminalNode IDENTIFIER_() { return getToken(PostgreSQLStatementParser.IDENTIFIER_, 0); }
		public IgnoredIdentifier_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ignoredIdentifier_; }
	}

	public final IgnoredIdentifier_Context ignoredIdentifier_() throws RecognitionException {
		IgnoredIdentifier_Context _localctx = new IgnoredIdentifier_Context(_ctx, getState());
		enterRule(_localctx, 218, RULE_ignoredIdentifier_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1584);
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

	public static class IgnoredIdentifiers_Context extends ParserRuleContext {
		public List<IgnoredIdentifier_Context> ignoredIdentifier_() {
			return getRuleContexts(IgnoredIdentifier_Context.class);
		}
		public IgnoredIdentifier_Context ignoredIdentifier_(int i) {
			return getRuleContext(IgnoredIdentifier_Context.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(PostgreSQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(PostgreSQLStatementParser.COMMA_, i);
		}
		public IgnoredIdentifiers_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ignoredIdentifiers_; }
	}

	public final IgnoredIdentifiers_Context ignoredIdentifiers_() throws RecognitionException {
		IgnoredIdentifiers_Context _localctx = new IgnoredIdentifiers_Context(_ctx, getState());
		enterRule(_localctx, 220, RULE_ignoredIdentifiers_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1586);
			ignoredIdentifier_();
			setState(1591);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(1587);
				match(COMMA_);
				setState(1588);
				ignoredIdentifier_();
				}
				}
				setState(1593);
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

	public static class MatchNoneContext extends ParserRuleContext {
		public MatchNoneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchNone; }
	}

	public final MatchNoneContext matchNone() throws RecognitionException {
		MatchNoneContext _localctx = new MatchNoneContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_matchNone);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1594);
			match(T__0);
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
		public TerminalNode SET() { return getToken(PostgreSQLStatementParser.SET, 0); }
		public TerminalNode TRANSACTION() { return getToken(PostgreSQLStatementParser.TRANSACTION, 0); }
		public TerminalNode SESSION() { return getToken(PostgreSQLStatementParser.SESSION, 0); }
		public TerminalNode CHARACTERISTICS() { return getToken(PostgreSQLStatementParser.CHARACTERISTICS, 0); }
		public TerminalNode AS() { return getToken(PostgreSQLStatementParser.AS, 0); }
		public SetTransactionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setTransaction; }
	}

	public final SetTransactionContext setTransaction() throws RecognitionException {
		SetTransactionContext _localctx = new SetTransactionContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_setTransaction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1596);
			match(SET);
			setState(1600);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SESSION) {
				{
				setState(1597);
				match(SESSION);
				setState(1598);
				match(CHARACTERISTICS);
				setState(1599);
				match(AS);
				}
			}

			setState(1602);
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

	public static class BeginTransactionContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(PostgreSQLStatementParser.BEGIN, 0); }
		public TerminalNode START() { return getToken(PostgreSQLStatementParser.START, 0); }
		public TerminalNode TRANSACTION() { return getToken(PostgreSQLStatementParser.TRANSACTION, 0); }
		public BeginTransactionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_beginTransaction; }
	}

	public final BeginTransactionContext beginTransaction() throws RecognitionException {
		BeginTransactionContext _localctx = new BeginTransactionContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_beginTransaction);
		try {
			setState(1607);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEGIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(1604);
				match(BEGIN);
				}
				break;
			case START:
				enterOuterAlt(_localctx, 2);
				{
				setState(1605);
				match(START);
				setState(1606);
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
		public TerminalNode COMMIT() { return getToken(PostgreSQLStatementParser.COMMIT, 0); }
		public CommitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commit; }
	}

	public final CommitContext commit() throws RecognitionException {
		CommitContext _localctx = new CommitContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_commit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1609);
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
		public TerminalNode ROLLBACK() { return getToken(PostgreSQLStatementParser.ROLLBACK, 0); }
		public RollbackContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rollback; }
	}

	public final RollbackContext rollback() throws RecognitionException {
		RollbackContext _localctx = new RollbackContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_rollback);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1611);
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
		public TerminalNode SAVEPOINT() { return getToken(PostgreSQLStatementParser.SAVEPOINT, 0); }
		public SavepointContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_savepoint; }
	}

	public final SavepointContext savepoint() throws RecognitionException {
		SavepointContext _localctx = new SavepointContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_savepoint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1613);
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
		public TerminalNode GRANT() { return getToken(PostgreSQLStatementParser.GRANT, 0); }
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
		enterRule(_localctx, 234, RULE_grant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1615);
			match(GRANT);
			setState(1618);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALL:
			case CREATE:
			case DELETE:
			case REFERENCES:
			case TRUNCATE:
			case CONNECT:
			case EXECUTE:
			case INSERT:
			case SELECT:
			case TEMP:
			case TEMPORARY:
			case TRIGGER:
			case UPDATE:
			case USAGE:
				{
				setState(1616);
				privilegeClause_();
				}
				break;
			case IDENTIFIER_:
				{
				setState(1617);
				roleClause_();
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

	public static class RevokeContext extends ParserRuleContext {
		public TerminalNode REVOKE() { return getToken(PostgreSQLStatementParser.REVOKE, 0); }
		public PrivilegeClause_Context privilegeClause_() {
			return getRuleContext(PrivilegeClause_Context.class,0);
		}
		public RoleClause_Context roleClause_() {
			return getRuleContext(RoleClause_Context.class,0);
		}
		public OptionForClause_Context optionForClause_() {
			return getRuleContext(OptionForClause_Context.class,0);
		}
		public RevokeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_revoke; }
	}

	public final RevokeContext revoke() throws RecognitionException {
		RevokeContext _localctx = new RevokeContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_revoke);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1620);
			match(REVOKE);
			setState(1622);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ADMIN || _la==GRANT) {
				{
				setState(1621);
				optionForClause_();
				}
			}

			setState(1626);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALL:
			case CREATE:
			case DELETE:
			case REFERENCES:
			case TRUNCATE:
			case CONNECT:
			case EXECUTE:
			case INSERT:
			case SELECT:
			case TEMP:
			case TEMPORARY:
			case TRIGGER:
			case UPDATE:
			case USAGE:
				{
				setState(1624);
				privilegeClause_();
				}
				break;
			case IDENTIFIER_:
				{
				setState(1625);
				roleClause_();
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

	public static class PrivilegeClause_Context extends ParserRuleContext {
		public Privileges_Context privileges_() {
			return getRuleContext(Privileges_Context.class,0);
		}
		public TerminalNode ON() { return getToken(PostgreSQLStatementParser.ON, 0); }
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
		enterRule(_localctx, 238, RULE_privilegeClause_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1628);
			privileges_();
			setState(1629);
			match(ON);
			setState(1630);
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
		enterRule(_localctx, 240, RULE_roleClause_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1632);
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

	public static class OptionForClause_Context extends ParserRuleContext {
		public TerminalNode OPTION() { return getToken(PostgreSQLStatementParser.OPTION, 0); }
		public TerminalNode FOR() { return getToken(PostgreSQLStatementParser.FOR, 0); }
		public TerminalNode GRANT() { return getToken(PostgreSQLStatementParser.GRANT, 0); }
		public TerminalNode ADMIN() { return getToken(PostgreSQLStatementParser.ADMIN, 0); }
		public OptionForClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionForClause_; }
	}

	public final OptionForClause_Context optionForClause_() throws RecognitionException {
		OptionForClause_Context _localctx = new OptionForClause_Context(_ctx, getState());
		enterRule(_localctx, 242, RULE_optionForClause_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1634);
			_la = _input.LA(1);
			if ( !(_la==ADMIN || _la==GRANT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1635);
			match(OPTION);
			setState(1636);
			match(FOR);
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
		public List<TerminalNode> COMMA_() { return getTokens(PostgreSQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(PostgreSQLStatementParser.COMMA_, i);
		}
		public Privileges_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_privileges_; }
	}

	public final Privileges_Context privileges_() throws RecognitionException {
		Privileges_Context _localctx = new Privileges_Context(_ctx, getState());
		enterRule(_localctx, 244, RULE_privileges_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1638);
			privilegeType_();
			setState(1640);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP_) {
				{
				setState(1639);
				columnNames();
				}
			}

			setState(1649);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(1642);
				match(COMMA_);
				setState(1643);
				privilegeType_();
				setState(1645);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LP_) {
					{
					setState(1644);
					columnNames();
					}
				}

				}
				}
				setState(1651);
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
		public TerminalNode SELECT() { return getToken(PostgreSQLStatementParser.SELECT, 0); }
		public TerminalNode INSERT() { return getToken(PostgreSQLStatementParser.INSERT, 0); }
		public TerminalNode UPDATE() { return getToken(PostgreSQLStatementParser.UPDATE, 0); }
		public TerminalNode DELETE() { return getToken(PostgreSQLStatementParser.DELETE, 0); }
		public TerminalNode TRUNCATE() { return getToken(PostgreSQLStatementParser.TRUNCATE, 0); }
		public TerminalNode REFERENCES() { return getToken(PostgreSQLStatementParser.REFERENCES, 0); }
		public TerminalNode TRIGGER() { return getToken(PostgreSQLStatementParser.TRIGGER, 0); }
		public TerminalNode CREATE() { return getToken(PostgreSQLStatementParser.CREATE, 0); }
		public TerminalNode CONNECT() { return getToken(PostgreSQLStatementParser.CONNECT, 0); }
		public TerminalNode TEMPORARY() { return getToken(PostgreSQLStatementParser.TEMPORARY, 0); }
		public TerminalNode TEMP() { return getToken(PostgreSQLStatementParser.TEMP, 0); }
		public TerminalNode EXECUTE() { return getToken(PostgreSQLStatementParser.EXECUTE, 0); }
		public TerminalNode USAGE() { return getToken(PostgreSQLStatementParser.USAGE, 0); }
		public TerminalNode ALL() { return getToken(PostgreSQLStatementParser.ALL, 0); }
		public TerminalNode PRIVILEGES() { return getToken(PostgreSQLStatementParser.PRIVILEGES, 0); }
		public PrivilegeType_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_privilegeType_; }
	}

	public final PrivilegeType_Context privilegeType_() throws RecognitionException {
		PrivilegeType_Context _localctx = new PrivilegeType_Context(_ctx, getState());
		enterRule(_localctx, 246, RULE_privilegeType_);
		int _la;
		try {
			setState(1669);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1652);
				match(SELECT);
				}
				break;
			case INSERT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1653);
				match(INSERT);
				}
				break;
			case UPDATE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1654);
				match(UPDATE);
				}
				break;
			case DELETE:
				enterOuterAlt(_localctx, 4);
				{
				setState(1655);
				match(DELETE);
				}
				break;
			case TRUNCATE:
				enterOuterAlt(_localctx, 5);
				{
				setState(1656);
				match(TRUNCATE);
				}
				break;
			case REFERENCES:
				enterOuterAlt(_localctx, 6);
				{
				setState(1657);
				match(REFERENCES);
				}
				break;
			case TRIGGER:
				enterOuterAlt(_localctx, 7);
				{
				setState(1658);
				match(TRIGGER);
				}
				break;
			case CREATE:
				enterOuterAlt(_localctx, 8);
				{
				setState(1659);
				match(CREATE);
				}
				break;
			case CONNECT:
				enterOuterAlt(_localctx, 9);
				{
				setState(1660);
				match(CONNECT);
				}
				break;
			case TEMPORARY:
				enterOuterAlt(_localctx, 10);
				{
				setState(1661);
				match(TEMPORARY);
				}
				break;
			case TEMP:
				enterOuterAlt(_localctx, 11);
				{
				setState(1662);
				match(TEMP);
				}
				break;
			case EXECUTE:
				enterOuterAlt(_localctx, 12);
				{
				setState(1663);
				match(EXECUTE);
				}
				break;
			case USAGE:
				enterOuterAlt(_localctx, 13);
				{
				setState(1664);
				match(USAGE);
				}
				break;
			case ALL:
				enterOuterAlt(_localctx, 14);
				{
				setState(1665);
				match(ALL);
				setState(1667);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PRIVILEGES) {
					{
					setState(1666);
					match(PRIVILEGES);
					}
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

	public static class OnObjectClause_Context extends ParserRuleContext {
		public List<TableNameContext> tableName() {
			return getRuleContexts(TableNameContext.class);
		}
		public TableNameContext tableName(int i) {
			return getRuleContext(TableNameContext.class,i);
		}
		public TerminalNode TABLE() { return getToken(PostgreSQLStatementParser.TABLE, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(PostgreSQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(PostgreSQLStatementParser.COMMA_, i);
		}
		public TerminalNode DATABASE() { return getToken(PostgreSQLStatementParser.DATABASE, 0); }
		public TerminalNode SCHEMA() { return getToken(PostgreSQLStatementParser.SCHEMA, 0); }
		public TerminalNode DOMAIN() { return getToken(PostgreSQLStatementParser.DOMAIN, 0); }
		public TerminalNode FOREIGN() { return getToken(PostgreSQLStatementParser.FOREIGN, 0); }
		public TerminalNode FUNCTION() { return getToken(PostgreSQLStatementParser.FUNCTION, 0); }
		public TerminalNode PROCEDURE() { return getToken(PostgreSQLStatementParser.PROCEDURE, 0); }
		public TerminalNode ROUTINE() { return getToken(PostgreSQLStatementParser.ROUTINE, 0); }
		public TerminalNode ALL() { return getToken(PostgreSQLStatementParser.ALL, 0); }
		public TerminalNode LANGUAGE() { return getToken(PostgreSQLStatementParser.LANGUAGE, 0); }
		public TerminalNode LARGE() { return getToken(PostgreSQLStatementParser.LARGE, 0); }
		public TerminalNode OBJECT() { return getToken(PostgreSQLStatementParser.OBJECT, 0); }
		public TerminalNode TABLESPACE() { return getToken(PostgreSQLStatementParser.TABLESPACE, 0); }
		public TerminalNode TYPE() { return getToken(PostgreSQLStatementParser.TYPE, 0); }
		public TerminalNode SEQUENCE() { return getToken(PostgreSQLStatementParser.SEQUENCE, 0); }
		public OnObjectClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onObjectClause_; }
	}

	public final OnObjectClause_Context onObjectClause_() throws RecognitionException {
		OnObjectClause_Context _localctx = new OnObjectClause_Context(_ctx, getState());
		enterRule(_localctx, 248, RULE_onObjectClause_);
		int _la;
		try {
			setState(1696);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TABLE:
			case IDENTIFIER_:
				enterOuterAlt(_localctx, 1);
				{
				setState(1672);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TABLE) {
					{
					setState(1671);
					match(TABLE);
					}
				}

				setState(1674);
				tableName();
				setState(1679);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(1675);
					match(COMMA_);
					setState(1676);
					tableName();
					}
					}
					setState(1681);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case DATABASE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1682);
				match(DATABASE);
				}
				break;
			case SCHEMA:
				enterOuterAlt(_localctx, 3);
				{
				setState(1683);
				match(SCHEMA);
				}
				break;
			case DOMAIN:
				enterOuterAlt(_localctx, 4);
				{
				setState(1684);
				match(DOMAIN);
				}
				break;
			case FOREIGN:
				enterOuterAlt(_localctx, 5);
				{
				setState(1685);
				match(FOREIGN);
				}
				break;
			case FUNCTION:
				enterOuterAlt(_localctx, 6);
				{
				setState(1686);
				match(FUNCTION);
				}
				break;
			case PROCEDURE:
				enterOuterAlt(_localctx, 7);
				{
				setState(1687);
				match(PROCEDURE);
				}
				break;
			case ROUTINE:
				enterOuterAlt(_localctx, 8);
				{
				setState(1688);
				match(ROUTINE);
				}
				break;
			case ALL:
				enterOuterAlt(_localctx, 9);
				{
				setState(1689);
				match(ALL);
				}
				break;
			case LANGUAGE:
				enterOuterAlt(_localctx, 10);
				{
				setState(1690);
				match(LANGUAGE);
				}
				break;
			case LARGE:
				enterOuterAlt(_localctx, 11);
				{
				setState(1691);
				match(LARGE);
				setState(1692);
				match(OBJECT);
				}
				break;
			case TABLESPACE:
				enterOuterAlt(_localctx, 12);
				{
				setState(1693);
				match(TABLESPACE);
				}
				break;
			case TYPE:
				enterOuterAlt(_localctx, 13);
				{
				setState(1694);
				match(TYPE);
				}
				break;
			case SEQUENCE:
				enterOuterAlt(_localctx, 14);
				{
				setState(1695);
				match(SEQUENCE);
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

	public static class CreateUserContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(PostgreSQLStatementParser.CREATE, 0); }
		public TerminalNode USER() { return getToken(PostgreSQLStatementParser.USER, 0); }
		public CreateUserContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createUser; }
	}

	public final CreateUserContext createUser() throws RecognitionException {
		CreateUserContext _localctx = new CreateUserContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_createUser);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1698);
			match(CREATE);
			setState(1699);
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
		public TerminalNode DROP() { return getToken(PostgreSQLStatementParser.DROP, 0); }
		public TerminalNode USER() { return getToken(PostgreSQLStatementParser.USER, 0); }
		public DropUserContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropUser; }
	}

	public final DropUserContext dropUser() throws RecognitionException {
		DropUserContext _localctx = new DropUserContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_dropUser);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1701);
			match(DROP);
			setState(1702);
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
		public TerminalNode ALTER() { return getToken(PostgreSQLStatementParser.ALTER, 0); }
		public TerminalNode USER() { return getToken(PostgreSQLStatementParser.USER, 0); }
		public AlterUserContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterUser; }
	}

	public final AlterUserContext alterUser() throws RecognitionException {
		AlterUserContext _localctx = new AlterUserContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_alterUser);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1704);
			match(ALTER);
			setState(1705);
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
		public TerminalNode CREATE() { return getToken(PostgreSQLStatementParser.CREATE, 0); }
		public TerminalNode ROLE() { return getToken(PostgreSQLStatementParser.ROLE, 0); }
		public CreateRoleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createRole; }
	}

	public final CreateRoleContext createRole() throws RecognitionException {
		CreateRoleContext _localctx = new CreateRoleContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_createRole);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1707);
			match(CREATE);
			setState(1708);
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
		public TerminalNode DROP() { return getToken(PostgreSQLStatementParser.DROP, 0); }
		public TerminalNode ROLE() { return getToken(PostgreSQLStatementParser.ROLE, 0); }
		public DropRoleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropRole; }
	}

	public final DropRoleContext dropRole() throws RecognitionException {
		DropRoleContext _localctx = new DropRoleContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_dropRole);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1710);
			match(DROP);
			setState(1711);
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

	public static class AlterRoleContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(PostgreSQLStatementParser.ALTER, 0); }
		public TerminalNode ROLE() { return getToken(PostgreSQLStatementParser.ROLE, 0); }
		public AlterRoleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterRole; }
	}

	public final AlterRoleContext alterRole() throws RecognitionException {
		AlterRoleContext _localctx = new AlterRoleContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_alterRole);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1713);
			match(ALTER);
			setState(1714);
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

	public static class ShowContext extends ParserRuleContext {
		public TerminalNode SHOW() { return getToken(PostgreSQLStatementParser.SHOW, 0); }
		public TerminalNode ALL() { return getToken(PostgreSQLStatementParser.ALL, 0); }
		public TerminalNode IDENTIFIER_() { return getToken(PostgreSQLStatementParser.IDENTIFIER_, 0); }
		public TerminalNode TRANSACTION() { return getToken(PostgreSQLStatementParser.TRANSACTION, 0); }
		public TerminalNode ISOLATION() { return getToken(PostgreSQLStatementParser.ISOLATION, 0); }
		public TerminalNode LEVEL() { return getToken(PostgreSQLStatementParser.LEVEL, 0); }
		public ShowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_show; }
	}

	public final ShowContext show() throws RecognitionException {
		ShowContext _localctx = new ShowContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_show);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1716);
			match(SHOW);
			setState(1722);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALL:
				{
				setState(1717);
				match(ALL);
				}
				break;
			case IDENTIFIER_:
				{
				setState(1718);
				match(IDENTIFIER_);
				}
				break;
			case TRANSACTION:
				{
				setState(1719);
				match(TRANSACTION);
				setState(1720);
				match(ISOLATION);
				setState(1721);
				match(LEVEL);
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

	public static class SetParamContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(PostgreSQLStatementParser.SET, 0); }
		public SetClauseContext setClause() {
			return getRuleContext(SetClauseContext.class,0);
		}
		public ScopeContext scope() {
			return getRuleContext(ScopeContext.class,0);
		}
		public SetParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setParam; }
	}

	public final SetParamContext setParam() throws RecognitionException {
		SetParamContext _localctx = new SetParamContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_setParam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1724);
			match(SET);
			setState(1726);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LOCAL || _la==SESSION) {
				{
				setState(1725);
				scope();
				}
			}

			setState(1728);
			setClause();
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

	public static class ScopeContext extends ParserRuleContext {
		public TerminalNode SESSION() { return getToken(PostgreSQLStatementParser.SESSION, 0); }
		public TerminalNode LOCAL() { return getToken(PostgreSQLStatementParser.LOCAL, 0); }
		public ScopeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scope; }
	}

	public final ScopeContext scope() throws RecognitionException {
		ScopeContext _localctx = new ScopeContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_scope);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1730);
			_la = _input.LA(1);
			if ( !(_la==LOCAL || _la==SESSION) ) {
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

	public static class SetClauseContext extends ParserRuleContext {
		public TerminalNode TIME() { return getToken(PostgreSQLStatementParser.TIME, 0); }
		public TerminalNode ZONE() { return getToken(PostgreSQLStatementParser.ZONE, 0); }
		public TimeZoneTypeContext timeZoneType() {
			return getRuleContext(TimeZoneTypeContext.class,0);
		}
		public TerminalNode IDENTIFIER_() { return getToken(PostgreSQLStatementParser.IDENTIFIER_, 0); }
		public TerminalNode TO() { return getToken(PostgreSQLStatementParser.TO, 0); }
		public TerminalNode EQ_() { return getToken(PostgreSQLStatementParser.EQ_, 0); }
		public TerminalNode STRING_() { return getToken(PostgreSQLStatementParser.STRING_, 0); }
		public TerminalNode DEFAULT() { return getToken(PostgreSQLStatementParser.DEFAULT, 0); }
		public SetClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setClause; }
	}

	public final SetClauseContext setClause() throws RecognitionException {
		SetClauseContext _localctx = new SetClauseContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_setClause);
		int _la;
		try {
			setState(1738);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TIME:
				enterOuterAlt(_localctx, 1);
				{
				setState(1732);
				match(TIME);
				setState(1733);
				match(ZONE);
				setState(1734);
				timeZoneType();
				}
				break;
			case IDENTIFIER_:
				enterOuterAlt(_localctx, 2);
				{
				setState(1735);
				match(IDENTIFIER_);
				setState(1736);
				_la = _input.LA(1);
				if ( !(_la==TO || _la==EQ_) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1737);
				_la = _input.LA(1);
				if ( !(_la==DEFAULT || _la==STRING_) ) {
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

	public static class TimeZoneTypeContext extends ParserRuleContext {
		public TerminalNode NUMBER_() { return getToken(PostgreSQLStatementParser.NUMBER_, 0); }
		public TerminalNode LOCAL() { return getToken(PostgreSQLStatementParser.LOCAL, 0); }
		public TerminalNode DEFAULT() { return getToken(PostgreSQLStatementParser.DEFAULT, 0); }
		public TimeZoneTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timeZoneType; }
	}

	public final TimeZoneTypeContext timeZoneType() throws RecognitionException {
		TimeZoneTypeContext _localctx = new TimeZoneTypeContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_timeZoneType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1740);
			_la = _input.LA(1);
			if ( !(_la==DEFAULT || _la==LOCAL || _la==NUMBER_) ) {
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

	public static class ResetParamContext extends ParserRuleContext {
		public TerminalNode RESET() { return getToken(PostgreSQLStatementParser.RESET, 0); }
		public TerminalNode ALL() { return getToken(PostgreSQLStatementParser.ALL, 0); }
		public TerminalNode IDENTIFIER_() { return getToken(PostgreSQLStatementParser.IDENTIFIER_, 0); }
		public ResetParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resetParam; }
	}

	public final ResetParamContext resetParam() throws RecognitionException {
		ResetParamContext _localctx = new ResetParamContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_resetParam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1742);
			match(RESET);
			setState(1743);
			_la = _input.LA(1);
			if ( !(_la==ALL || _la==IDENTIFIER_) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 53:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 55:
			return booleanPrimary_sempred((BooleanPrimaryContext)_localctx, predIndex);
		case 58:
			return bitExpr_sempred((BitExprContext)_localctx, predIndex);
		case 59:
			return simpleExpr_sempred((SimpleExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 10);
		case 1:
			return precpred(_ctx, 9);
		case 2:
			return precpred(_ctx, 8);
		case 3:
			return precpred(_ctx, 4);
		case 4:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean booleanPrimary_sempred(BooleanPrimaryContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 5);
		case 6:
			return precpred(_ctx, 4);
		case 7:
			return precpred(_ctx, 3);
		case 8:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean bitExpr_sempred(BitExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 14);
		case 10:
			return precpred(_ctx, 13);
		case 11:
			return precpred(_ctx, 12);
		case 12:
			return precpred(_ctx, 11);
		case 13:
			return precpred(_ctx, 10);
		case 14:
			return precpred(_ctx, 9);
		case 15:
			return precpred(_ctx, 8);
		case 16:
			return precpred(_ctx, 7);
		case 17:
			return precpred(_ctx, 6);
		case 18:
			return precpred(_ctx, 5);
		case 19:
			return precpred(_ctx, 4);
		case 20:
			return precpred(_ctx, 3);
		case 21:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean simpleExpr_sempred(SimpleExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 22:
			return precpred(_ctx, 13);
		case 23:
			return precpred(_ctx, 15);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00f5\u06d4\4\2\t"+
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
		"\4\u008a\t\u008a\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\u012c\n\2\3\2\5\2\u012f\n\2"+
		"\3\3\3\3\5\3\u0133\n\3\3\3\3\3\5\3\u0137\n\3\3\3\3\3\3\3\5\3\u013c\n\3"+
		"\3\3\5\3\u013f\n\3\3\3\3\3\3\3\3\4\3\4\3\4\5\4\u0147\n\4\3\4\3\4\5\4\u014b"+
		"\n\4\3\4\3\4\3\4\7\4\u0150\n\4\f\4\16\4\u0153\13\4\3\5\3\5\3\5\3\5\3\5"+
		"\5\5\u015a\n\5\3\6\3\6\3\6\5\6\u015f\n\6\3\7\3\7\3\7\3\7\5\7\u0165\n\7"+
		"\3\7\3\7\3\7\5\7\u016a\n\7\3\b\3\b\5\b\u016e\n\b\3\b\5\b\u0171\n\b\3\b"+
		"\3\b\3\t\3\t\3\t\3\t\5\t\u0179\n\t\3\t\3\t\3\t\7\t\u017e\n\t\f\t\16\t"+
		"\u0181\13\t\3\n\3\n\3\n\3\n\5\n\u0187\n\n\3\n\3\n\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5"+
		"\r\u01a0\n\r\3\16\3\16\3\16\7\16\u01a5\n\16\f\16\16\16\u01a8\13\16\3\17"+
		"\3\17\5\17\u01ac\n\17\3\20\3\20\5\20\u01b0\n\20\3\20\3\20\5\20\u01b4\n"+
		"\20\3\20\3\20\3\20\3\20\5\20\u01ba\n\20\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\7\21\u01c2\n\21\f\21\16\21\u01c5\13\21\5\21\u01c7\n\21\3\21\3\21\3\22"+
		"\3\22\3\22\3\22\3\22\7\22\u01d0\n\22\f\22\16\22\u01d3\13\22\5\22\u01d5"+
		"\n\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\7\24\u01df\n\24\f\24\16"+
		"\24\u01e2\13\24\3\24\3\24\3\25\3\25\3\25\3\25\5\25\u01ea\n\25\3\25\5\25"+
		"\u01ed\n\25\3\25\3\25\5\25\u01f1\n\25\3\26\3\26\3\26\7\26\u01f6\n\26\f"+
		"\26\16\26\u01f9\13\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u020b\n\27\3\27\3\27\5\27\u020f\n"+
		"\27\3\27\3\27\3\27\3\27\3\27\5\27\u0216\n\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0226\n\27\3\27\5\27"+
		"\u0229\n\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u0241\n\27\f\27"+
		"\16\27\u0244\13\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u024d\n\27"+
		"\f\27\16\27\u0250\13\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0262\n\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\5\27\u026c\n\27\5\27\u026e\n\27\3\30\3\30\5\30\u0272"+
		"\n\30\3\30\3\30\5\30\u0276\n\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\5\31"+
		"\u027f\n\31\3\31\3\31\3\31\5\31\u0284\n\31\3\31\3\31\3\32\3\32\5\32\u028a"+
		"\n\32\3\32\3\32\5\32\u028e\n\32\3\32\3\32\5\32\u0292\n\32\3\33\3\33\3"+
		"\33\5\33\u0297\n\33\3\33\3\33\3\33\5\33\u029c\n\33\3\33\3\33\5\33\u02a0"+
		"\n\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u02b6\n\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\5\33\u02be\n\33\3\33\3\33\3\33\7\33\u02c3\n\33\f\33\16\33\u02c6"+
		"\13\33\3\33\3\33\3\33\3\33\3\33\5\33\u02cd\n\33\3\33\3\33\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\5\33\u02e5\n\33\3\34\3\34\5\34\u02e9\n\34\3\34\3\34"+
		"\3\35\3\35\3\35\3\35\3\35\5\35\u02f2\n\35\3\35\5\35\u02f5\n\35\3\35\3"+
		"\35\5\35\u02f9\n\35\3\35\5\35\u02fc\n\35\5\35\u02fe\n\35\3\36\3\36\3\36"+
		"\7\36\u0303\n\36\f\36\16\36\u0306\13\36\3\37\3\37\3\37\3\37\3 \3 \3 \3"+
		" \5 \u0310\n \3 \5 \u0313\n \3!\3!\5!\u0317\n!\3!\3!\3!\3!\3\"\3\"\3\""+
		"\3\"\3\"\3\"\3#\3#\3#\3#\3$\3$\3%\3%\3%\3%\5%\u032d\n%\3%\3%\3&\3&\3&"+
		"\3&\3\'\3\'\3(\3(\3(\3)\5)\u033b\n)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3"+
		"*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\5*\u0355\n*\3*\7*\u0358\n*\f*\16"+
		"*\u035b\13*\5*\u035d\n*\3+\3+\5+\u0361\n+\3+\5+\u0364\n+\3+\5+\u0367\n"+
		"+\3+\3+\5+\u036b\n+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3"+
		"\62\3\62\3\62\5\62\u037d\n\62\5\62\u037f\n\62\3\62\3\62\3\63\5\63\u0384"+
		"\n\63\3\63\3\63\3\64\3\64\3\64\3\64\7\64\u038c\n\64\f\64\16\64\u038f\13"+
		"\64\3\64\3\64\3\65\3\65\3\65\7\65\u0396\n\65\f\65\16\65\u0399\13\65\3"+
		"\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3"+
		"\67\5\67\u03aa\n\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67"+
		"\3\67\3\67\3\67\3\67\3\67\7\67\u03bb\n\67\f\67\16\67\u03be\13\67\38\3"+
		"8\39\39\39\39\39\39\59\u03c8\n9\39\39\39\39\39\39\39\39\39\39\39\39\3"+
		"9\79\u03d7\n9\f9\169\u03da\139\3:\3:\3;\3;\5;\u03e0\n;\3;\3;\3;\3;\3;"+
		"\5;\u03e7\n;\3;\3;\3;\3;\3;\7;\u03ee\n;\f;\16;\u03f1\13;\3;\3;\3;\3;\5"+
		";\u03f7\n;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\5;\u0405\n;\3;\3;\3;\3"+
		";\7;\u040b\n;\f;\16;\u040e\13;\3;\3;\5;\u0412\n;\3;\3;\3;\3;\5;\u0418"+
		"\n;\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<"+
		"\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\7<\u0444"+
		"\n<\f<\16<\u0447\13<\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3"+
		"=\3=\3=\3=\3=\3=\3=\3=\5=\u0461\n=\3=\3=\3=\3=\3=\7=\u0468\n=\f=\16=\u046b"+
		"\13=\3>\3>\3>\5>\u0470\n>\3>\3>\5>\u0474\n>\3>\3>\3?\3?\3@\3@\3A\3A\3"+
		"B\3B\3B\3B\3B\3B\3B\5B\u0485\nB\3B\3B\5B\u0489\nB\3C\3C\3D\3D\3D\3D\3"+
		"D\3D\3D\3D\3D\3D\3D\3D\3D\3D\5D\u049b\nD\3D\3D\3D\5D\u04a0\nD\3D\3D\5"+
		"D\u04a4\nD\5D\u04a6\nD\3E\3E\3F\3F\3G\3G\3H\3H\3I\3I\3I\3J\3J\3J\3J\3"+
		"J\3J\3J\5J\u04ba\nJ\3J\3J\5J\u04be\nJ\3K\3K\3K\5K\u04c3\nK\3K\5K\u04c6"+
		"\nK\3L\3L\3M\3M\3M\5M\u04cd\nM\3M\7M\u04d0\nM\fM\16M\u04d3\13M\3N\5N\u04d6"+
		"\nN\3N\3N\3N\3O\3O\3O\3P\5P\u04df\nP\3P\3P\3P\3P\3P\3P\3P\3P\5P\u04e9"+
		"\nP\3P\3P\3P\3P\3P\3P\5P\u04f1\nP\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\5P"+
		"\u04fe\nP\3P\3P\3P\3P\3P\3P\5P\u0506\nP\3P\3P\3P\5P\u050b\nP\3P\7P\u050e"+
		"\nP\fP\16P\u0511\13P\5P\u0513\nP\3Q\3Q\3Q\3Q\5Q\u0519\nQ\3R\3R\5R\u051d"+
		"\nR\3S\6S\u0520\nS\rS\16S\u0521\3T\3T\5T\u0526\nT\3T\3T\3T\5T\u052b\n"+
		"T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\5T\u053b\nT\3U\3U\3U\3U\5"+
		"U\u0541\nU\3V\3V\3V\3V\3V\3V\5V\u0549\nV\3W\3W\3W\3W\3W\5W\u0550\nW\3"+
		"X\3X\3X\3X\3X\3X\3X\3X\5X\u055a\nX\3Y\5Y\u055d\nY\3Y\5Y\u0560\nY\3Y\3"+
		"Y\5Y\u0564\nY\3Z\3Z\5Z\u0568\nZ\3Z\5Z\u056b\nZ\3Z\3Z\3Z\3Z\3Z\3Z\5Z\u0573"+
		"\nZ\3Z\3Z\7Z\u0577\nZ\fZ\16Z\u057a\13Z\3Z\5Z\u057d\nZ\3[\3[\3[\5[\u0582"+
		"\n[\3\\\3\\\3\\\5\\\u0587\n\\\3]\3]\3^\3^\3^\5^\u058e\n^\3_\3_\3_\5_\u0593"+
		"\n_\3_\3_\5_\u0597\n_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\5_\u05a6"+
		"\n_\3`\3`\3`\3`\3`\3`\3a\3a\3a\3a\3b\3b\3b\5b\u05b5\nb\3b\5b\u05b8\nb"+
		"\3b\3b\3c\3c\3c\3c\3c\3c\5c\u05c2\nc\3d\5d\u05c5\nd\3d\3d\3d\5d\u05ca"+
		"\nd\3d\3d\3d\7d\u05cf\nd\fd\16d\u05d2\13d\5d\u05d4\nd\3d\5d\u05d7\nd\3"+
		"e\3e\3f\3f\3f\3f\3f\3f\3f\3f\5f\u05e3\nf\3g\3g\3g\3g\3g\3g\3g\3g\3g\3"+
		"g\5g\u05ef\ng\3h\3h\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\5i\u05ff\ni\3"+
		"j\3j\3j\3j\3j\7j\u0606\nj\fj\16j\u0609\13j\3k\3k\3k\3k\3l\3l\5l\u0611"+
		"\nl\3l\3l\3l\3l\5l\u0617\nl\3m\3m\3m\3m\3m\3m\3m\3m\3m\3m\7m\u0623\nm"+
		"\fm\16m\u0626\13m\3m\3m\5m\u062a\nm\3n\3n\3n\3n\3n\3n\3n\3o\3o\3p\3p\3"+
		"p\7p\u0638\np\fp\16p\u063b\13p\3q\3q\3r\3r\3r\3r\5r\u0643\nr\3r\3r\3s"+
		"\3s\3s\5s\u064a\ns\3t\3t\3u\3u\3v\3v\3w\3w\3w\5w\u0655\nw\3x\3x\5x\u0659"+
		"\nx\3x\3x\5x\u065d\nx\3y\3y\3y\3y\3z\3z\3{\3{\3{\3{\3|\3|\5|\u066b\n|"+
		"\3|\3|\3|\5|\u0670\n|\7|\u0672\n|\f|\16|\u0675\13|\3}\3}\3}\3}\3}\3}\3"+
		"}\3}\3}\3}\3}\3}\3}\3}\3}\5}\u0686\n}\5}\u0688\n}\3~\5~\u068b\n~\3~\3"+
		"~\3~\7~\u0690\n~\f~\16~\u0693\13~\3~\3~\3~\3~\3~\3~\3~\3~\3~\3~\3~\3~"+
		"\3~\3~\5~\u06a3\n~\3\177\3\177\3\177\3\u0080\3\u0080\3\u0080\3\u0081\3"+
		"\u0081\3\u0081\3\u0082\3\u0082\3\u0082\3\u0083\3\u0083\3\u0083\3\u0084"+
		"\3\u0084\3\u0084\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\5\u0085"+
		"\u06bd\n\u0085\3\u0086\3\u0086\5\u0086\u06c1\n\u0086\3\u0086\3\u0086\3"+
		"\u0087\3\u0087\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\5\u0088"+
		"\u06cd\n\u0088\3\u0089\3\u0089\3\u008a\3\u008a\3\u008a\3\u008a\2\6lpv"+
		"x\u008b\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:"+
		"<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a"+
		"\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2"+
		"\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba"+
		"\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2"+
		"\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea"+
		"\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102"+
		"\u0104\u0106\u0108\u010a\u010c\u010e\u0110\u0112\2!\4\2\177\177\u008f"+
		"\u008f\3\2\u00ba\u00bb\4\2rr\u0085\u0085\t\2\5\5ddggmm\u0082\u0082\u0087"+
		"\u0087\u00b7\u00b8\4\2\63\63\u00a9\u00a9\4\2==??\4\2\61\61\u00a6\u00a6"+
		"\4\2--\u00c6\u00c6\4\2\u0090\u0090\u00bf\u00bf\4\2%%>>\6\2ttvv\u0091\u0091"+
		"\u00a1\u00a1\6\2]^}~\u0080\u0080\u00b6\u00b6\4\2\b\b\16\16\4\2yy\u008e"+
		"\u008e\3\2\u00f1\u00f2\6\2\22\22\35\35))++\4\2\5\5\7\7\3\2\u00dd\u00e2"+
		"\4\2\r\r\'(\4\2\35\35;;\4\2oo\u0084\u0084\b\2::YY\u0081\u0081\u0094\u0094"+
		"\u0096\u0096\u00ae\u00ae\4\2\5\5\17\17\5\2\u00c9\u00cb\u00db\u00db\u00dd"+
		"\u00e2\4\2QQ\u00a4\u00a4\4\2\t\tDD\4\2\u008f\u008f\u00b2\u00b2\4\2TT\u00dd"+
		"\u00dd\4\2;;\u00f2\u00f2\5\2;;\u008f\u008f\u00f3\u00f3\4\2\5\5\u00f1\u00f1"+
		"\2\u07a9\2\u012b\3\2\2\2\4\u0130\3\2\2\2\6\u0143\3\2\2\2\b\u0159\3\2\2"+
		"\2\n\u015b\3\2\2\2\f\u0169\3\2\2\2\16\u016b\3\2\2\2\20\u0174\3\2\2\2\22"+
		"\u0182\3\2\2\2\24\u018a\3\2\2\2\26\u018e\3\2\2\2\30\u0196\3\2\2\2\32\u01a1"+
		"\3\2\2\2\34\u01a9\3\2\2\2\36\u01ad\3\2\2\2 \u01bd\3\2\2\2\"\u01d4\3\2"+
		"\2\2$\u01d6\3\2\2\2&\u01d9\3\2\2\2(\u01e5\3\2\2\2*\u01f2\3\2\2\2,\u026d"+
		"\3\2\2\2.\u0271\3\2\2\2\60\u027c\3\2\2\2\62\u0287\3\2\2\2\64\u02e4\3\2"+
		"\2\2\66\u02e6\3\2\2\28\u02fd\3\2\2\2:\u02ff\3\2\2\2<\u0307\3\2\2\2>\u030b"+
		"\3\2\2\2@\u0314\3\2\2\2B\u031c\3\2\2\2D\u0322\3\2\2\2F\u0326\3\2\2\2H"+
		"\u0328\3\2\2\2J\u0330\3\2\2\2L\u0334\3\2\2\2N\u0336\3\2\2\2P\u033a\3\2"+
		"\2\2R\u035c\3\2\2\2T\u0360\3\2\2\2V\u036c\3\2\2\2X\u036e\3\2\2\2Z\u0370"+
		"\3\2\2\2\\\u0372\3\2\2\2^\u0374\3\2\2\2`\u0376\3\2\2\2b\u0378\3\2\2\2"+
		"d\u0383\3\2\2\2f\u0387\3\2\2\2h\u0392\3\2\2\2j\u039a\3\2\2\2l\u03a9\3"+
		"\2\2\2n\u03bf\3\2\2\2p\u03c1\3\2\2\2r\u03db\3\2\2\2t\u0417\3\2\2\2v\u0419"+
		"\3\2\2\2x\u0460\3\2\2\2z\u046c\3\2\2\2|\u0477\3\2\2\2~\u0479\3\2\2\2\u0080"+
		"\u047b\3\2\2\2\u0082\u0488\3\2\2\2\u0084\u048a\3\2\2\2\u0086\u04a5\3\2"+
		"\2\2\u0088\u04a7\3\2\2\2\u008a\u04a9\3\2\2\2\u008c\u04ab\3\2\2\2\u008e"+
		"\u04ad\3\2\2\2\u0090\u04af\3\2\2\2\u0092\u04b2\3\2\2\2\u0094\u04c2\3\2"+
		"\2\2\u0096\u04c7\3\2\2\2\u0098\u04c9\3\2\2\2\u009a\u04d5\3\2\2\2\u009c"+
		"\u04da\3\2\2\2\u009e\u0512\3\2\2\2\u00a0\u0514\3\2\2\2\u00a2\u051c\3\2"+
		"\2\2\u00a4\u051f\3\2\2\2\u00a6\u053a\3\2\2\2\u00a8\u0540\3\2\2\2\u00aa"+
		"\u0548\3\2\2\2\u00ac\u054a\3\2\2\2\u00ae\u0559\3\2\2\2\u00b0\u055f\3\2"+
		"\2\2\u00b2\u057c\3\2\2\2\u00b4\u0581\3\2\2\2\u00b6\u0583\3\2\2\2\u00b8"+
		"\u0588\3\2\2\2\u00ba\u058d\3\2\2\2\u00bc\u058f\3\2\2\2\u00be\u05a7\3\2"+
		"\2\2\u00c0\u05ad\3\2\2\2\u00c2\u05b1\3\2\2\2\u00c4\u05bb\3\2\2\2\u00c6"+
		"\u05c4\3\2\2\2\u00c8\u05d8\3\2\2\2\u00ca\u05e2\3\2\2\2\u00cc\u05ee\3\2"+
		"\2\2\u00ce\u05f0\3\2\2\2\u00d0\u05fe\3\2\2\2\u00d2\u0600\3\2\2\2\u00d4"+
		"\u060a\3\2\2\2\u00d6\u0616\3\2\2\2\u00d8\u0629\3\2\2\2\u00da\u062b\3\2"+
		"\2\2\u00dc\u0632\3\2\2\2\u00de\u0634\3\2\2\2\u00e0\u063c\3\2\2\2\u00e2"+
		"\u063e\3\2\2\2\u00e4\u0649\3\2\2\2\u00e6\u064b\3\2\2\2\u00e8\u064d\3\2"+
		"\2\2\u00ea\u064f\3\2\2\2\u00ec\u0651\3\2\2\2\u00ee\u0656\3\2\2\2\u00f0"+
		"\u065e\3\2\2\2\u00f2\u0662\3\2\2\2\u00f4\u0664\3\2\2\2\u00f6\u0668\3\2"+
		"\2\2\u00f8\u0687\3\2\2\2\u00fa\u06a2\3\2\2\2\u00fc\u06a4\3\2\2\2\u00fe"+
		"\u06a7\3\2\2\2\u0100\u06aa\3\2\2\2\u0102\u06ad\3\2\2\2\u0104\u06b0\3\2"+
		"\2\2\u0106\u06b3\3\2\2\2\u0108\u06b6\3\2\2\2\u010a\u06be\3\2\2\2\u010c"+
		"\u06c4\3\2\2\2\u010e\u06cc\3\2\2\2\u0110\u06ce\3\2\2\2\u0112\u06d0\3\2"+
		"\2\2\u0114\u012c\5\4\3\2\u0115\u012c\5\b\5\2\u0116\u012c\5\6\4\2\u0117"+
		"\u012c\5\n\6\2\u0118\u012c\5\f\7\2\u0119\u012c\5\20\t\2\u011a\u012c\5"+
		"\16\b\2\u011b\u012c\5\u00e2r\2\u011c\u012c\5\u00e4s\2\u011d\u012c\5\u00e6"+
		"t\2\u011e\u012c\5\u00e8u\2\u011f\u012c\5\u00eav\2\u0120\u012c\5\u00ec"+
		"w\2\u0121\u012c\5\u00eex\2\u0122\u012c\5\u00fc\177\2\u0123\u012c\5\u00fe"+
		"\u0080\2\u0124\u012c\5\u0100\u0081\2\u0125\u012c\5\u0102\u0082\2\u0126"+
		"\u012c\5\u0104\u0083\2\u0127\u012c\5\u0106\u0084\2\u0128\u012c\5\u0108"+
		"\u0085\2\u0129\u012c\5\u010a\u0086\2\u012a\u012c\5\u0112\u008a\2\u012b"+
		"\u0114\3\2\2\2\u012b\u0115\3\2\2\2\u012b\u0116\3\2\2\2\u012b\u0117\3\2"+
		"\2\2\u012b\u0118\3\2\2\2\u012b\u0119\3\2\2\2\u012b\u011a\3\2\2\2\u012b"+
		"\u011b\3\2\2\2\u012b\u011c\3\2\2\2\u012b\u011d\3\2\2\2\u012b\u011e\3\2"+
		"\2\2\u012b\u011f\3\2\2\2\u012b\u0120\3\2\2\2\u012b\u0121\3\2\2\2\u012b"+
		"\u0122\3\2\2\2\u012b\u0123\3\2\2\2\u012b\u0124\3\2\2\2\u012b\u0125\3\2"+
		"\2\2\u012b\u0126\3\2\2\2\u012b\u0127\3\2\2\2\u012b\u0128\3\2\2\2\u012b"+
		"\u0129\3\2\2\2\u012b\u012a\3\2\2\2\u012c\u012e\3\2\2\2\u012d\u012f\7\u00f0"+
		"\2\2\u012e\u012d\3\2\2\2\u012e\u012f\3\2\2\2\u012f\3\3\2\2\2\u0130\u0132"+
		"\78\2\2\u0131\u0133\7W\2\2\u0132\u0131\3\2\2\2\u0132\u0133\3\2\2\2\u0133"+
		"\u0134\3\2\2\2\u0134\u0136\7E\2\2\u0135\u0137\7e\2\2\u0136\u0135\3\2\2"+
		"\2\u0136\u0137\3\2\2\2\u0137\u013e\3\2\2\2\u0138\u0139\7\u0083\2\2\u0139"+
		"\u013a\7\34\2\2\u013a\u013c\7\21\2\2\u013b\u0138\3\2\2\2\u013b\u013c\3"+
		"\2\2\2\u013c\u013d\3\2\2\2\u013d\u013f\5^\60\2\u013e\u013b\3\2\2\2\u013e"+
		"\u013f\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0141\7I\2\2\u0141\u0142\5X-"+
		"\2\u0142\5\3\2\2\2\u0143\u0144\7>\2\2\u0144\u0146\7E\2\2\u0145\u0147\7"+
		"e\2\2\u0146\u0145\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u014a\3\2\2\2\u0148"+
		"\u0149\7\u0083\2\2\u0149\u014b\7\21\2\2\u014a\u0148\3\2\2\2\u014a\u014b"+
		"\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u0151\5^\60\2\u014d\u014e\7\u00ea\2"+
		"\2\u014e\u0150\5^\60\2\u014f\u014d\3\2\2\2\u0150\u0153\3\2\2\2\u0151\u014f"+
		"\3\2\2\2\u0151\u0152\3\2\2\2\u0152\7\3\2\2\2\u0153\u0151\3\2\2\2\u0154"+
		"\u0155\5\22\n\2\u0155\u0156\5\24\13\2\u0156\u015a\3\2\2\2\u0157\u015a"+
		"\5\26\f\2\u0158\u015a\5\30\r\2\u0159\u0154\3\2\2\2\u0159\u0157\3\2\2\2"+
		"\u0159\u0158\3\2\2\2\u015a\t\3\2\2\2\u015b\u015c\5\36\20\2\u015c\u015e"+
		"\5 \21\2\u015d\u015f\5&\24\2\u015e\u015d\3\2\2\2\u015e\u015f\3\2\2\2\u015f"+
		"\13\3\2\2\2\u0160\u0164\5(\25\2\u0161\u0165\5*\26\2\u0162\u0165\5@!\2"+
		"\u0163\u0165\5B\"\2\u0164\u0161\3\2\2\2\u0164\u0162\3\2\2\2\u0164\u0163"+
		"\3\2\2\2\u0165\u016a\3\2\2\2\u0166\u0167\5H%\2\u0167\u0168\5J&\2\u0168"+
		"\u016a\3\2\2\2\u0169\u0160\3\2\2\2\u0169\u0166\3\2\2\2\u016a\r\3\2\2\2"+
		"\u016b\u016d\7V\2\2\u016c\u016e\7S\2\2\u016d\u016c\3\2\2\2\u016d\u016e"+
		"\3\2\2\2\u016e\u0170\3\2\2\2\u016f\u0171\7\u009c\2\2\u0170\u016f\3\2\2"+
		"\2\u0170\u0171\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0173\5\32\16\2\u0173"+
		"\17\3\2\2\2\u0174\u0175\7>\2\2\u0175\u0178\7S\2\2\u0176\u0177\7\u0083"+
		"\2\2\u0177\u0179\7\21\2\2\u0178\u0176\3\2\2\2\u0178\u0179\3\2\2\2\u0179"+
		"\u017a\3\2\2\2\u017a\u017f\5X-\2\u017b\u017c\7\u00ea\2\2\u017c\u017e\5"+
		"X-\2\u017d\u017b\3\2\2\2\u017e\u0181\3\2\2\2\u017f\u017d\3\2\2\2\u017f"+
		"\u0180\3\2\2\2\u0180\21\3\2\2\2\u0181\u017f\3\2\2\2\u0182\u0183\7\60\2"+
		"\2\u0183\u0186\7E\2\2\u0184\u0185\7\u0083\2\2\u0185\u0187\7\21\2\2\u0186"+
		"\u0184\3\2\2\2\u0186\u0187\3\2\2\2\u0187\u0188\3\2\2\2\u0188\u0189\5^"+
		"\60\2\u0189\23\3\2\2\2\u018a\u018b\7\u00a5\2\2\u018b\u018c\7T\2\2\u018c"+
		"\u018d\5^\60\2\u018d\25\3\2\2\2\u018e\u018f\7\60\2\2\u018f\u0190\7E\2"+
		"\2\u0190\u0191\5^\60\2\u0191\u0192\7p\2\2\u0192\u0193\7I\2\2\u0193\u0194"+
		"\7u\2\2\u0194\u0195\5\u00dco\2\u0195\27\3\2\2\2\u0196\u0197\7\60\2\2\u0197"+
		"\u0198\7E\2\2\u0198\u0199\7\5\2\2\u0199\u019a\7\26\2\2\u019a\u019b\7\u00b9"+
		"\2\2\u019b\u019f\5^\60\2\u019c\u019d\7\u009e\2\2\u019d\u019e\7\f\2\2\u019e"+
		"\u01a0\5\u00dep\2\u019f\u019c\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0\31\3\2"+
		"\2\2\u01a1\u01a6\5\34\17\2\u01a2\u01a3\7\u00ea\2\2\u01a3\u01a5\5\34\17"+
		"\2\u01a4\u01a2\3\2\2\2\u01a5\u01a8\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a6\u01a7"+
		"\3\2\2\2\u01a7\33\3\2\2\2\u01a8\u01a6\3\2\2\2\u01a9\u01ab\5X-\2\u01aa"+
		"\u01ac\7\u00d6\2\2\u01ab\u01aa\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\35\3"+
		"\2\2\2\u01ad\u01b3\78\2\2\u01ae\u01b0\t\2\2\2\u01af\u01ae\3\2\2\2\u01af"+
		"\u01b0\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1\u01b4\t\3\2\2\u01b2\u01b4\7\u00bf"+
		"\2\2\u01b3\u01af\3\2\2\2\u01b3\u01b2\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4"+
		"\u01b5\3\2\2\2\u01b5\u01b9\7S\2\2\u01b6\u01b7\7\u0083\2\2\u01b7\u01b8"+
		"\7\34\2\2\u01b8\u01ba\7\21\2\2\u01b9\u01b6\3\2\2\2\u01b9\u01ba\3\2\2\2"+
		"\u01ba\u01bb\3\2\2\2\u01bb\u01bc\5X-\2\u01bc\37\3\2\2\2\u01bd\u01c6\7"+
		"\u00e4\2\2\u01be\u01c3\5\"\22\2\u01bf\u01c0\7\u00ea\2\2\u01c0\u01c2\5"+
		"\"\22\2\u01c1\u01bf\3\2\2\2\u01c2\u01c5\3\2\2\2\u01c3\u01c1\3\2\2\2\u01c3"+
		"\u01c4\3\2\2\2\u01c4\u01c7\3\2\2\2\u01c5\u01c3\3\2\2\2\u01c6\u01be\3\2"+
		"\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8\u01c9\7\u00e5\2\2\u01c9"+
		"!\3\2\2\2\u01ca\u01d5\5\u0098M\2\u01cb\u01d5\5P)\2\u01cc\u01cd\7\31\2"+
		"\2\u01cd\u01d1\5X-\2\u01ce\u01d0\5$\23\2\u01cf\u01ce\3\2\2\2\u01d0\u01d3"+
		"\3\2\2\2\u01d1\u01cf\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2\u01d5\3\2\2\2\u01d3"+
		"\u01d1\3\2\2\2\u01d4\u01ca\3\2\2\2\u01d4\u01cb\3\2\2\2\u01d4\u01cc\3\2"+
		"\2\2\u01d5#\3\2\2\2\u01d6\u01d7\t\4\2\2\u01d7\u01d8\t\5\2\2\u01d8%\3\2"+
		"\2\2\u01d9\u01da\7\u0089\2\2\u01da\u01db\7\u00e4\2\2\u01db\u01e0\5X-\2"+
		"\u01dc\u01dd\7\u00ea\2\2\u01dd\u01df\5X-\2\u01de\u01dc\3\2\2\2\u01df\u01e2"+
		"\3\2\2\2\u01e0\u01de\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1\u01e3\3\2\2\2\u01e2"+
		"\u01e0\3\2\2\2\u01e3\u01e4\7\u00e5\2\2\u01e4\'\3\2\2\2\u01e5\u01e6\7\60"+
		"\2\2\u01e6\u01e9\7S\2\2\u01e7\u01e8\7\u0083\2\2\u01e8\u01ea\7\21\2\2\u01e9"+
		"\u01e7\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea\u01ec\3\2\2\2\u01eb\u01ed\7\u009c"+
		"\2\2\u01ec\u01eb\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed\u01ee\3\2\2\2\u01ee"+
		"\u01f0\5X-\2\u01ef\u01f1\7\u00d6\2\2\u01f0\u01ef\3\2\2\2\u01f0\u01f1\3"+
		"\2\2\2\u01f1)\3\2\2\2\u01f2\u01f7\5,\27\2\u01f3\u01f4\7\u00ea\2\2\u01f4"+
		"\u01f6\5,\27\2\u01f5\u01f3\3\2\2\2\u01f6\u01f9\3\2\2\2\u01f7\u01f5\3\2"+
		"\2\2\u01f7\u01f8\3\2\2\2\u01f8+\3\2\2\2\u01f9\u01f7\3\2\2\2\u01fa\u026e"+
		"\5\60\31\2\u01fb\u026e\5\62\32\2\u01fc\u026e\5\64\33\2\u01fd\u026e\5>"+
		" \2\u01fe\u01ff\7\60\2\2\u01ff\u0200\7\67\2\2\u0200\u0201\5\u00dco\2\u0201"+
		"\u0202\5\u00b0Y\2\u0202\u026e\3\2\2\2\u0203\u0204\7\u00c4\2\2\u0204\u0205"+
		"\7\67\2\2\u0205\u026e\5\u00dco\2\u0206\u0207\7>\2\2\u0207\u020a\7\67\2"+
		"\2\u0208\u0209\7\u0083\2\2\u0209\u020b\7\21\2\2\u020a\u0208\3\2\2\2\u020a"+
		"\u020b\3\2\2\2\u020b\u020c\3\2\2\2\u020c\u020e\5\u00dco\2\u020d\u020f"+
		"\t\6\2\2\u020e\u020d\3\2\2\2\u020e\u020f\3\2\2\2\u020f\u026e\3\2\2\2\u0210"+
		"\u0211\t\7\2\2\u0211\u0215\7\u00bc\2\2\u0212\u0216\5\u00dco\2\u0213\u0216"+
		"\7\5\2\2\u0214\u0216\7X\2\2\u0215\u0212\3\2\2\2\u0215\u0213\3\2\2\2\u0215"+
		"\u0214\3\2\2\2\u0215\u0216\3\2\2\2\u0216\u026e\3\2\2\2\u0217\u0218\7?"+
		"\2\2\u0218\u0219\t\b\2\2\u0219\u021a\7\u00bc\2\2\u021a\u026e\5\u00dco"+
		"\2\u021b\u021c\t\7\2\2\u021c\u021d\7\u00ab\2\2\u021d\u026e\5\u00dco\2"+
		"\u021e\u021f\7?\2\2\u021f\u0220\t\b\2\2\u0220\u0221\7\u00ab\2\2\u0221"+
		"\u026e\5\u00dco\2\u0222\u0229\7=\2\2\u0223\u0229\7?\2\2\u0224\u0226\7"+
		"H\2\2\u0225\u0224\3\2\2\2\u0225\u0226\3\2\2\2\u0226\u0227\3\2\2\2\u0227"+
		"\u0229\7{\2\2\u0228\u0222\3\2\2\2\u0228\u0223\3\2\2\2\u0228\u0225\3\2"+
		"\2\2\u0229\u022a\3\2\2\2\u022a\u022b\7$\2\2\u022b\u022c\7G\2\2\u022c\u026e"+
		"\7\u00af\2\2\u022d\u022e\7b\2\2\u022e\u022f\7I\2\2\u022f\u026e\5^\60\2"+
		"\u0230\u0231\7%\2\2\u0231\u0232\7\u00c6\2\2\u0232\u026e\7b\2\2\u0233\u0234"+
		"\7%\2\2\u0234\u0235\t\t\2\2\u0235\u026e\7\u009b\2\2\u0236\u0237\7%\2\2"+
		"\u0237\u0238\7\u00b9\2\2\u0238\u026e\5\u00dco\2\u0239\u023a\7%\2\2\u023a"+
		"\u026e\t\n\2\2\u023b\u023c\7%\2\2\u023c\u023d\7\u00e4\2\2\u023d\u0242"+
		"\5D#\2\u023e\u023f\7\u00ea\2\2\u023f\u0241\5D#\2\u0240\u023e\3\2\2\2\u0241"+
		"\u0244\3\2\2\2\u0242\u0240\3\2\2\2\u0242\u0243\3\2\2\2\u0243\u0245\3\2"+
		"\2\2\u0244\u0242\3\2\2\2\u0245\u0246\7\u00e5\2\2\u0246\u026e\3\2\2\2\u0247"+
		"\u0248\7\u00a7\2\2\u0248\u0249\7\u00e4\2\2\u0249\u024e\5F$\2\u024a\u024b"+
		"\7\u00ea\2\2\u024b\u024d\5F$\2\u024c\u024a\3\2\2\2\u024d\u0250\3\2\2\2"+
		"\u024e\u024c\3\2\2\2\u024e\u024f\3\2\2\2\u024f\u0251\3\2\2\2\u0250\u024e"+
		"\3\2\2\2\u0251\u0252\7\u00e5\2\2\u0252\u026e\3\2\2\2\u0253\u0254\7\u0088"+
		"\2\2\u0254\u026e\5X-\2\u0255\u0256\7H\2\2\u0256\u0257\7\u0088\2\2\u0257"+
		"\u026e\5X-\2\u0258\u0259\7\u009a\2\2\u0259\u026e\5\u00b4[\2\u025a\u025b"+
		"\7\34\2\2\u025b\u026e\7\u009a\2\2\u025c\u025d\7\u009f\2\2\u025d\u0261"+
		"\7T\2\2\u025e\u0262\5\u00dco\2\u025f\u0262\7i\2\2\u0260\u0262\7\u00b3"+
		"\2\2\u0261\u025e\3\2\2\2\u0261\u025f\3\2\2\2\u0261\u0260\3\2\2\2\u0262"+
		"\u026e\3\2\2\2\u0263\u0264\7\u00a6\2\2\u0264\u026b\7\u0082\2\2\u0265\u026c"+
		"\7;\2\2\u0266\u0267\7\u00c2\2\2\u0267\u0268\7E\2\2\u0268\u026c\5^\60\2"+
		"\u0269\u026c\7|\2\2\u026a\u026c\7\u0097\2\2\u026b\u0265\3\2\2\2\u026b"+
		"\u0266\3\2\2\2\u026b\u0269\3\2\2\2\u026b\u026a\3\2\2\2\u026c\u026e\3\2"+
		"\2\2\u026d\u01fa\3\2\2\2\u026d\u01fb\3\2\2\2\u026d\u01fc\3\2\2\2\u026d"+
		"\u01fd\3\2\2\2\u026d\u01fe\3\2\2\2\u026d\u0203\3\2\2\2\u026d\u0206\3\2"+
		"\2\2\u026d\u0210\3\2\2\2\u026d\u0217\3\2\2\2\u026d\u021b\3\2\2\2\u026d"+
		"\u021e\3\2\2\2\u026d\u0228\3\2\2\2\u026d\u022d\3\2\2\2\u026d\u0230\3\2"+
		"\2\2\u026d\u0233\3\2\2\2\u026d\u0236\3\2\2\2\u026d\u0239\3\2\2\2\u026d"+
		"\u023b\3\2\2\2\u026d\u0247\3\2\2\2\u026d\u0253\3\2\2\2\u026d\u0255\3\2"+
		"\2\2\u026d\u0258\3\2\2\2\u026d\u025a\3\2\2\2\u026d\u025c\3\2\2\2\u026d"+
		"\u0263\3\2\2\2\u026e-\3\2\2\2\u026f\u0270\7\67\2\2\u0270\u0272\5\u00dc"+
		"o\2\u0271\u026f\3\2\2\2\u0271\u0272\3\2\2\2\u0272\u0275\3\2\2\2\u0273"+
		"\u0276\7W\2\2\u0274\u0276\5d\63\2\u0275\u0273\3\2\2\2\u0275\u0274\3\2"+
		"\2\2\u0276\u0277\3\2\2\2\u0277\u0278\7\u00c2\2\2\u0278\u0279\7E\2\2\u0279"+
		"\u027a\5^\60\2\u027a\u027b\5\u00b0Y\2\u027b/\3\2\2\2\u027c\u027e\7/\2"+
		"\2\u027d\u027f\7\65\2\2\u027e\u027d\3\2\2\2\u027e\u027f\3\2\2\2\u027f"+
		"\u0283\3\2\2\2\u0280\u0281\7\u0083\2\2\u0281\u0282\7\34\2\2\u0282\u0284"+
		"\7\21\2\2\u0283\u0280\3\2\2\2\u0283\u0284\3\2\2\2\u0284\u0285\3\2\2\2"+
		"\u0285\u0286\5\u0098M\2\u0286\61\3\2\2\2\u0287\u0289\7>\2\2\u0288\u028a"+
		"\7\65\2\2\u0289\u0288\3\2\2\2\u0289\u028a\3\2\2\2\u028a\u028d\3\2\2\2"+
		"\u028b\u028c\7\u0083\2\2\u028c\u028e\7\21\2\2\u028d\u028b\3\2\2\2\u028d"+
		"\u028e\3\2\2\2\u028e\u028f\3\2\2\2\u028f\u0291\5Z.\2\u0290\u0292\t\6\2"+
		"\2\u0291\u0290\3\2\2\2\u0291\u0292\3\2\2\2\u0292\63\3\2\2\2\u0293\u0296"+
		"\5\66\34\2\u0294\u0295\7%\2\2\u0295\u0297\7k\2\2\u0296\u0294\3\2\2\2\u0296"+
		"\u0297\3\2\2\2\u0297\u0298\3\2\2\2\u0298\u0299\7\u00bd\2\2\u0299\u029b"+
		"\5\u00b2Z\2\u029a\u029c\5\u0090I\2\u029b\u029a\3\2\2\2\u029b\u029c\3\2"+
		"\2\2\u029c\u029f\3\2\2\2\u029d\u029e\7\u00c2\2\2\u029e\u02a0\5x=\2\u029f"+
		"\u029d\3\2\2\2\u029f\u02a0\3\2\2\2\u02a0\u02e5\3\2\2\2\u02a1\u02a2\5\66"+
		"\34\2\u02a2\u02a3\7%\2\2\u02a3\u02a4\7;\2\2\u02a4\u02a5\5l\67\2\u02a5"+
		"\u02e5\3\2\2\2\u02a6\u02a7\5\66\34\2\u02a7\u02a8\7>\2\2\u02a8\u02a9\7"+
		";\2\2\u02a9\u02e5\3\2\2\2\u02aa\u02ab\5\66\34\2\u02ab\u02ac\t\13\2\2\u02ac"+
		"\u02ad\7\34\2\2\u02ad\u02ae\7\35\2\2\u02ae\u02e5\3\2\2\2\u02af\u02b0\5"+
		"\66\34\2\u02b0\u02b1\7/\2\2\u02b1\u02b5\7C\2\2\u02b2\u02b6\7\61\2\2\u02b3"+
		"\u02b4\7\f\2\2\u02b4\u02b6\7;\2\2\u02b5\u02b2\3\2\2\2\u02b5\u02b3\3\2"+
		"\2\2\u02b6\u02b7\3\2\2\2\u02b7\u02b8\7\62\2\2\u02b8\u02bd\7\u0082\2\2"+
		"\u02b9\u02ba\7\u00e4\2\2\u02ba\u02bb\5\u00a4S\2\u02bb\u02bc\7\u00e5\2"+
		"\2\u02bc\u02be\3\2\2\2\u02bd\u02b9\3\2\2\2\u02bd\u02be\3\2\2\2\u02be\u02e5"+
		"\3\2\2\2\u02bf\u02c0\5\66\34\2\u02c0\u02c4\58\35\2\u02c1\u02c3\58\35\2"+
		"\u02c2\u02c1\3\2\2\2\u02c3\u02c6\3\2\2\2\u02c4\u02c2\3\2\2\2\u02c4\u02c5"+
		"\3\2\2\2\u02c5\u02e5\3\2\2\2\u02c6\u02c4\3\2\2\2\u02c7\u02c8\5\66\34\2"+
		"\u02c8\u02c9\7>\2\2\u02c9\u02cc\7\u0082\2\2\u02ca\u02cb\7\u0083\2\2\u02cb"+
		"\u02cd\7\21\2\2\u02cc\u02ca\3\2\2\2\u02cc\u02cd\3\2\2\2\u02cd\u02e5\3"+
		"\2\2\2\u02ce\u02cf\5\66\34\2\u02cf\u02d0\7%\2\2\u02d0\u02d1\7\u00b7\2"+
		"\2\u02d1\u02d2\7\u00f3\2\2\u02d2\u02e5\3\2\2\2\u02d3\u02d4\5\66\34\2\u02d4"+
		"\u02d5\7%\2\2\u02d5\u02d6\7\u00e4\2\2\u02d6\u02d7\5:\36\2\u02d7\u02d8"+
		"\7\u00e5\2\2\u02d8\u02e5\3\2\2\2\u02d9\u02da\5\66\34\2\u02da\u02db\7\u00a7"+
		"\2\2\u02db\u02dc\7\u00e4\2\2\u02dc\u02dd\5:\36\2\u02dd\u02de\7\u00e5\2"+
		"\2\u02de\u02e5\3\2\2\2\u02df\u02e0\5\66\34\2\u02e0\u02e1\7%\2\2\u02e1"+
		"\u02e2\7\u00b8\2\2\u02e2\u02e3\t\f\2\2\u02e3\u02e5\3\2\2\2\u02e4\u0293"+
		"\3\2\2\2\u02e4\u02a1\3\2\2\2\u02e4\u02a6\3\2\2\2\u02e4\u02aa\3\2\2\2\u02e4"+
		"\u02af\3\2\2\2\u02e4\u02bf\3\2\2\2\u02e4\u02c7\3\2\2\2\u02e4\u02ce\3\2"+
		"\2\2\u02e4\u02d3\3\2\2\2\u02e4\u02d9\3\2\2\2\u02e4\u02df\3\2\2\2\u02e5"+
		"\65\3\2\2\2\u02e6\u02e8\7\60\2\2\u02e7\u02e9\7\65\2\2\u02e8\u02e7\3\2"+
		"\2\2\u02e8\u02e9\3\2\2\2\u02e9\u02ea\3\2\2\2\u02ea\u02eb\5Z.\2\u02eb\67"+
		"\3\2\2\2\u02ec\u02f4\7%\2\2\u02ed\u02f1\7C\2\2\u02ee\u02f2\7\61\2\2\u02ef"+
		"\u02f0\7\f\2\2\u02f0\u02f2\7;\2\2\u02f1\u02ee\3\2\2\2\u02f1\u02ef\3\2"+
		"\2\2\u02f2\u02f5\3\2\2\2\u02f3\u02f5\5\u00a6T\2\u02f4\u02ed\3\2\2\2\u02f4"+
		"\u02f3\3\2\2\2\u02f5\u02fe\3\2\2\2\u02f6\u02fb\7\u00a8\2\2\u02f7\u02f9"+
		"\7-\2\2\u02f8\u02f7\3\2\2\2\u02f8\u02f9\3\2\2\2\u02f9\u02fa\3\2\2\2\u02fa"+
		"\u02fc\7\u00f3\2\2\u02fb\u02f8\3\2\2\2\u02fb\u02fc\3\2\2\2\u02fc\u02fe"+
		"\3\2\2\2\u02fd\u02ec\3\2\2\2\u02fd\u02f6\3\2\2\2\u02fe9\3\2\2\2\u02ff"+
		"\u0304\5<\37\2\u0300\u0301\7\u00ea\2\2\u0301\u0303\5<\37\2\u0302\u0300"+
		"\3\2\2\2\u0303\u0306\3\2\2\2\u0304\u0302\3\2\2\2\u0304\u0305\3\2\2\2\u0305"+
		";\3\2\2\2\u0306\u0304\3\2\2\2\u0307\u0308\7\u00f1\2\2\u0308\u0309\7\u00dd"+
		"\2\2\u0309\u030a\5x=\2\u030a=\3\2\2\2\u030b\u0312\7/\2\2\u030c\u030f\5"+
		"P)\2\u030d\u030e\7\34\2\2\u030e\u0310\7\u00c3\2\2\u030f\u030d\3\2\2\2"+
		"\u030f\u0310\3\2\2\2\u0310\u0313\3\2\2\2\u0311\u0313\5.\30\2\u0312\u030c"+
		"\3\2\2\2\u0312\u0311\3\2\2\2\u0313?\3\2\2\2\u0314\u0316\7\u00a5\2\2\u0315"+
		"\u0317\7\65\2\2\u0316\u0315\3\2\2\2\u0316\u0317\3\2\2\2\u0317\u0318\3"+
		"\2\2\2\u0318\u0319\5Z.\2\u0319\u031a\7T\2\2\u031a\u031b\5Z.\2\u031bA\3"+
		"\2\2\2\u031c\u031d\7\u00a5\2\2\u031d\u031e\7\67\2\2\u031e\u031f\5\u00dc"+
		"o\2\u031f\u0320\7T\2\2\u0320\u0321\5\u00dco\2\u0321C\3\2\2\2\u0322\u0323"+
		"\5F$\2\u0323\u0324\7\u00dd\2\2\u0324\u0325\5x=\2\u0325E\3\2\2\2\u0326"+
		"\u0327\7\u00f1\2\2\u0327G\3\2\2\2\u0328\u0329\7\60\2\2\u0329\u032c\7S"+
		"\2\2\u032a\u032b\7\u0083\2\2\u032b\u032d\7\21\2\2\u032c\u032a\3\2\2\2"+
		"\u032c\u032d\3\2\2\2\u032d\u032e\3\2\2\2\u032e\u032f\5X-\2\u032fI\3\2"+
		"\2\2\u0330\u0331\7\u00a5\2\2\u0331\u0332\7T\2\2\u0332\u0333\5L\'\2\u0333"+
		"K\3\2\2\2\u0334\u0335\7\u00f1\2\2\u0335M\3\2\2\2\u0336\u0337\7\u00c2\2"+
		"\2\u0337\u0338\t\r\2\2\u0338O\3\2\2\2\u0339\u033b\5\u009cO\2\u033a\u0339"+
		"\3\2\2\2\u033a\u033b\3\2\2\2\u033b\u033c\3\2\2\2\u033c\u033d\5R*\2\u033d"+
		"\u033e\5\u00b0Y\2\u033eQ\3\2\2\2\u033f\u035d\5\u00a0Q\2\u0340\u0341\7"+
		"W\2\2\u0341\u0342\5f\64\2\u0342\u0343\5\u00a8U\2\u0343\u035d\3\2\2\2\u0344"+
		"\u0345\5d\63\2\u0345\u0346\5f\64\2\u0346\u0347\5\u00a8U\2\u0347\u035d"+
		"\3\2\2\2\u0348\u0349\7A\2\2\u0349\u034a\7\30\2\2\u034a\u034b\5f\64\2\u034b"+
		"\u034c\7M\2\2\u034c\u034d\5X-\2\u034d\u0354\5f\64\2\u034e\u034f\7\u0092"+
		"\2\2\u034f\u0355\7|\2\2\u0350\u0351\7\u0092\2\2\u0351\u0355\7\u00a0\2"+
		"\2\u0352\u0353\7\u0092\2\2\u0353\u0355\7\u00b5\2\2\u0354\u034e\3\2\2\2"+
		"\u0354\u0350\3\2\2\2\u0354\u0352\3\2\2\2\u0354\u0355\3\2\2\2\u0355\u0359"+
		"\3\2\2\2\u0356\u0358\5\u00acW\2\u0357\u0356\3\2\2\2\u0358\u035b\3\2\2"+
		"\2\u0359\u0357\3\2\2\2\u0359\u035a\3\2\2\2\u035a\u035d\3\2\2\2\u035b\u0359"+
		"\3\2\2\2\u035c\u033f\3\2\2\2\u035c\u0340\3\2\2\2\u035c\u0344\3\2\2\2\u035c"+
		"\u0348\3\2\2\2\u035dS\3\2\2\2\u035e\u0361\5Z.\2\u035f\u0361\5l\67\2\u0360"+
		"\u035e\3\2\2\2\u0360\u035f\3\2\2\2\u0361\u0363\3\2\2\2\u0362\u0364\5\u00dc"+
		"o\2\u0363\u0362\3\2\2\2\u0363\u0364\3\2\2\2\u0364\u0366\3\2\2\2\u0365"+
		"\u0367\t\16\2\2\u0366\u0365\3\2\2\2\u0366\u0367\3\2\2\2\u0367\u036a\3"+
		"\2\2\2\u0368\u0369\7\u0098\2\2\u0369\u036b\t\17\2\2\u036a\u0368\3\2\2"+
		"\2\u036a\u036b\3\2\2\2\u036bU\3\2\2\2\u036c\u036d\7\u00f1\2\2\u036dW\3"+
		"\2\2\2\u036e\u036f\7\u00f1\2\2\u036fY\3\2\2\2\u0370\u0371\7\u00f1\2\2"+
		"\u0371[\3\2\2\2\u0372\u0373\t\20\2\2\u0373]\3\2\2\2\u0374\u0375\7\u00f1"+
		"\2\2\u0375_\3\2\2\2\u0376\u0377\7\u00f1\2\2\u0377a\3\2\2\2\u0378\u037e"+
		"\7\u00e4\2\2\u0379\u037c\7\u00f3\2\2\u037a\u037b\7\u00ea\2\2\u037b\u037d"+
		"\7\u00f3\2\2\u037c\u037a\3\2\2\2\u037c\u037d\3\2\2\2\u037d\u037f\3\2\2"+
		"\2\u037e\u0379\3\2\2\2\u037e\u037f\3\2\2\2\u037f\u0380\3\2\2\2\u0380\u0381"+
		"\7\u00e5\2\2\u0381c\3\2\2\2\u0382\u0384\7\"\2\2\u0383\u0382\3\2\2\2\u0383"+
		"\u0384\3\2\2\2\u0384\u0385\3\2\2\2\u0385\u0386\7\30\2\2\u0386e\3\2\2\2"+
		"\u0387\u0388\7\u00e4\2\2\u0388\u038d\5Z.\2\u0389\u038a\7\u00ea\2\2\u038a"+
		"\u038c\5Z.\2\u038b\u0389\3\2\2\2\u038c\u038f\3\2\2\2\u038d\u038b\3\2\2"+
		"\2\u038d\u038e\3\2\2\2\u038e\u0390\3\2\2\2\u038f\u038d\3\2\2\2\u0390\u0391"+
		"\7\u00e5\2\2\u0391g\3\2\2\2\u0392\u0397\5l\67\2\u0393\u0394\7\u00ea\2"+
		"\2\u0394\u0396\5l\67\2\u0395\u0393\3\2\2\2\u0396\u0399\3\2\2\2\u0397\u0395"+
		"\3\2\2\2\u0397\u0398\3\2\2\2\u0398i\3\2\2\2\u0399\u0397\3\2\2\2\u039a"+
		"\u039b\7\u00e4\2\2\u039b\u039c\5h\65\2\u039c\u039d\7\u00e5\2\2\u039dk"+
		"\3\2\2\2\u039e\u039f\b\67\1\2\u039f\u03a0\7\u00e4\2\2\u03a0\u03a1\5l\67"+
		"\2\u03a1\u03a2\7\u00e5\2\2\u03a2\u03aa\3\2\2\2\u03a3\u03a4\7\34\2\2\u03a4"+
		"\u03aa\5l\67\b\u03a5\u03a6\7\u00cb\2\2\u03a6\u03aa\5l\67\7\u03a7\u03aa"+
		"\5p9\2\u03a8\u03aa\5n8\2\u03a9\u039e\3\2\2\2\u03a9\u03a3\3\2\2\2\u03a9"+
		"\u03a5\3\2\2\2\u03a9\u03a7\3\2\2\2\u03a9\u03a8\3\2\2\2\u03aa\u03bc\3\2"+
		"\2\2\u03ab\u03ac\f\f\2\2\u03ac\u03ad\7\6\2\2\u03ad\u03bb\5l\67\r\u03ae"+
		"\u03af\f\13\2\2\u03af\u03b0\7\u00c9\2\2\u03b0\u03bb\5l\67\f\u03b1\u03b2"+
		"\f\n\2\2\u03b2\u03b3\7.\2\2\u03b3\u03bb\5l\67\13\u03b4\u03b5\f\6\2\2\u03b5"+
		"\u03b6\7\37\2\2\u03b6\u03bb\5l\67\7\u03b7\u03b8\f\5\2\2\u03b8\u03b9\7"+
		"\u00ca\2\2\u03b9\u03bb\5l\67\6\u03ba\u03ab\3\2\2\2\u03ba\u03ae\3\2\2\2"+
		"\u03ba\u03b1\3\2\2\2\u03ba\u03b4\3\2\2\2\u03ba\u03b7\3\2\2\2\u03bb\u03be"+
		"\3\2\2\2\u03bc\u03ba\3\2\2\2\u03bc\u03bd\3\2\2\2\u03bdm\3\2\2\2\u03be"+
		"\u03bc\3\2\2\2\u03bf\u03c0\5\u00e0q\2\u03c0o\3\2\2\2\u03c1\u03c2\b9\1"+
		"\2\u03c2\u03c3\5t;\2\u03c3\u03d8\3\2\2\2\u03c4\u03c5\f\7\2\2\u03c5\u03c7"+
		"\7\27\2\2\u03c6\u03c8\7\34\2\2\u03c7\u03c6\3\2\2\2\u03c7\u03c8\3\2\2\2"+
		"\u03c8\u03c9\3\2\2\2\u03c9\u03d7\t\21\2\2\u03ca\u03cb\f\6\2\2\u03cb\u03cc"+
		"\7\u00db\2\2\u03cc\u03d7\5t;\2\u03cd\u03ce\f\5\2\2\u03ce\u03cf\5r:\2\u03cf"+
		"\u03d0\5t;\2\u03d0\u03d7\3\2\2\2\u03d1\u03d2\f\4\2\2\u03d2\u03d3\5r:\2"+
		"\u03d3\u03d4\t\22\2\2\u03d4\u03d5\5\u008eH\2\u03d5\u03d7\3\2\2\2\u03d6"+
		"\u03c4\3\2\2\2\u03d6\u03ca\3\2\2\2\u03d6\u03cd\3\2\2\2\u03d6\u03d1\3\2"+
		"\2\2\u03d7\u03da\3\2\2\2\u03d8\u03d6\3\2\2\2\u03d8\u03d9\3\2\2\2\u03d9"+
		"q\3\2\2\2\u03da\u03d8\3\2\2\2\u03db\u03dc\t\23\2\2\u03dcs\3\2\2\2\u03dd"+
		"\u03df\5v<\2\u03de\u03e0\7\34\2\2\u03df\u03de\3\2\2\2\u03df\u03e0\3\2"+
		"\2\2\u03e0\u03e1\3\2\2\2\u03e1\u03e2\7\26\2\2\u03e2\u03e3\5\u008eH\2\u03e3"+
		"\u0418\3\2\2\2\u03e4\u03e6\5v<\2\u03e5\u03e7\7\34\2\2\u03e6\u03e5\3\2"+
		"\2\2\u03e6\u03e7\3\2\2\2\u03e7\u03e8\3\2\2\2\u03e8\u03e9\7\26\2\2\u03e9"+
		"\u03ea\7\u00e4\2\2\u03ea\u03ef\5x=\2\u03eb\u03ec\7\u00ea\2\2\u03ec\u03ee"+
		"\5x=\2\u03ed\u03eb\3\2\2\2\u03ee\u03f1\3\2\2\2\u03ef\u03ed\3\2\2\2\u03ef"+
		"\u03f0\3\2\2\2\u03f0\u03f2\3\2\2\2\u03f1\u03ef\3\2\2\2\u03f2\u03f3\7\u00e5"+
		"\2\2\u03f3\u0418\3\2\2\2\u03f4\u03f6\5v<\2\u03f5\u03f7\7\34\2\2\u03f6"+
		"\u03f5\3\2\2\2\u03f6\u03f7\3\2\2\2\u03f7\u03f8\3\2\2\2\u03f8\u03f9\7\n"+
		"\2\2\u03f9\u03fa\5x=\2\u03fa\u03fb\7\6\2\2\u03fb\u03fc\5t;\2\u03fc\u0418"+
		"\3\2\2\2\u03fd\u03fe\5v<\2\u03fe\u03ff\7&\2\2\u03ff\u0400\7\31\2\2\u0400"+
		"\u0401\5x=\2\u0401\u0418\3\2\2\2\u0402\u0404\5v<\2\u0403\u0405\7\34\2"+
		"\2\u0404\u0403\3\2\2\2\u0404\u0405\3\2\2\2\u0405\u0406\3\2\2\2\u0406\u0407"+
		"\7\31\2\2\u0407\u040c\5x=\2\u0408\u0409\7\20\2\2\u0409\u040b\5x=\2\u040a"+
		"\u0408\3\2\2\2\u040b\u040e\3\2\2\2\u040c\u040a\3\2\2\2\u040c\u040d\3\2"+
		"\2\2\u040d\u0418\3\2\2\2\u040e\u040c\3\2\2\2\u040f\u0411\5v<\2\u0410\u0412"+
		"\7\34\2\2\u0411\u0410\3\2\2\2\u0411\u0412\3\2\2\2\u0412\u0413\3\2\2\2"+
		"\u0413\u0414\7#\2\2\u0414\u0415\5x=\2\u0415\u0418\3\2\2\2\u0416\u0418"+
		"\5v<\2\u0417\u03dd\3\2\2\2\u0417\u03e4\3\2\2\2\u0417\u03f4\3\2\2\2\u0417"+
		"\u03fd\3\2\2\2\u0417\u0402\3\2\2\2\u0417\u040f\3\2\2\2\u0417\u0416\3\2"+
		"\2\2\u0418u\3\2\2\2\u0419\u041a\b<\1\2\u041a\u041b\5x=\2\u041b\u0445\3"+
		"\2\2\2\u041c\u041d\f\20\2\2\u041d\u041e\7\u00cd\2\2\u041e\u0444\5v<\21"+
		"\u041f\u0420\f\17\2\2\u0420\u0421\7\u00ce\2\2\u0421\u0444\5v<\20\u0422"+
		"\u0423\f\16\2\2\u0423\u0424\7\u00cf\2\2\u0424\u0444\5v<\17\u0425\u0426"+
		"\f\r\2\2\u0426\u0427\7\u00d0\2\2\u0427\u0444\5v<\16\u0428\u0429\f\f\2"+
		"\2\u0429\u042a\7\u00d4\2\2\u042a\u0444\5v<\r\u042b\u042c\f\13\2\2\u042c"+
		"\u042d\7\u00d5\2\2\u042d\u0444\5v<\f\u042e\u042f\f\n\2\2\u042f\u0430\7"+
		"\u00d6\2\2\u0430\u0444\5v<\13\u0431\u0432\f\t\2\2\u0432\u0433\7\u00d7"+
		"\2\2\u0433\u0444\5v<\n\u0434\u0435\f\b\2\2\u0435\u0436\7\33\2\2\u0436"+
		"\u0444\5v<\t\u0437\u0438\f\7\2\2\u0438\u0439\7\u00d2\2\2\u0439\u0444\5"+
		"v<\b\u043a\u043b\f\6\2\2\u043b\u043c\7\u00d1\2\2\u043c\u0444\5v<\7\u043d"+
		"\u043e\f\5\2\2\u043e\u043f\7\u00d4\2\2\u043f\u0444\5~@\2\u0440\u0441\f"+
		"\4\2\2\u0441\u0442\7\u00d5\2\2\u0442\u0444\5~@\2\u0443\u041c\3\2\2\2\u0443"+
		"\u041f\3\2\2\2\u0443\u0422\3\2\2\2\u0443\u0425\3\2\2\2\u0443\u0428\3\2"+
		"\2\2\u0443\u042b\3\2\2\2\u0443\u042e\3\2\2\2\u0443\u0431\3\2\2\2\u0443"+
		"\u0434\3\2\2\2\u0443\u0437\3\2\2\2\u0443\u043a\3\2\2\2\u0443\u043d\3\2"+
		"\2\2\u0443\u0440\3\2\2\2\u0444\u0447\3\2\2\2\u0445\u0443\3\2\2\2\u0445"+
		"\u0446\3\2\2\2\u0446w\3\2\2\2\u0447\u0445\3\2\2\2\u0448\u0449\b=\1\2\u0449"+
		"\u0461\5z>\2\u044a\u0461\5\u0086D\2\u044b\u0461\5Z.\2\u044c\u0461\5\u0084"+
		"C\2\u044d\u044e\7\u00d4\2\2\u044e\u0461\5x=\16\u044f\u0450\7\u00d5\2\2"+
		"\u0450\u0461\5x=\r\u0451\u0452\7\u00cc\2\2\u0452\u0461\5x=\f\u0453\u0454"+
		"\7\u00cb\2\2\u0454\u0461\5x=\13\u0455\u0456\7\13\2\2\u0456\u0461\5x=\n"+
		"\u0457\u0461\5j\66\2\u0458\u0459\7$\2\2\u0459\u0461\5j\66\2\u045a\u0461"+
		"\5\u008eH\2\u045b\u045c\7\21\2\2\u045c\u0461\5\u008eH\2\u045d\u0461\5"+
		"\u0080A\2\u045e\u0461\5~@\2\u045f\u0461\5\u0082B\2\u0460\u0448\3\2\2\2"+
		"\u0460\u044a\3\2\2\2\u0460\u044b\3\2\2\2\u0460\u044c\3\2\2\2\u0460\u044d"+
		"\3\2\2\2\u0460\u044f\3\2\2\2\u0460\u0451\3\2\2\2\u0460\u0453\3\2\2\2\u0460"+
		"\u0455\3\2\2\2\u0460\u0457\3\2\2\2\u0460\u0458\3\2\2\2\u0460\u045a\3\2"+
		"\2\2\u0460\u045b\3\2\2\2\u0460\u045d\3\2\2\2\u0460\u045e\3\2\2\2\u0460"+
		"\u045f\3\2\2\2\u0461\u0469\3\2\2\2\u0462\u0463\f\17\2\2\u0463\u0464\7"+
		"\u00c9\2\2\u0464\u0468\5x=\20\u0465\u0466\f\21\2\2\u0466\u0468\5\u0090"+
		"I\2\u0467\u0462\3\2\2\2\u0467\u0465\3\2\2\2\u0468\u046b\3\2\2\2\u0469"+
		"\u0467\3\2\2\2\u0469\u046a\3\2\2\2\u046ay\3\2\2\2\u046b\u0469\3\2\2\2"+
		"\u046c\u046d\7\u00f1\2\2\u046d\u046f\7\u00e4\2\2\u046e\u0470\5|?\2\u046f"+
		"\u046e\3\2\2\2\u046f\u0470\3\2\2\2\u0470\u0473\3\2\2\2\u0471\u0474\5h"+
		"\65\2\u0472\u0474\7\u00d6\2\2\u0473\u0471\3\2\2\2\u0473\u0472\3\2\2\2"+
		"\u0473\u0474\3\2\2\2\u0474\u0475\3\2\2\2\u0475\u0476\7\u00e5\2\2\u0476"+
		"{\3\2\2\2\u0477\u0478\7\17\2\2\u0478}\3\2\2\2\u0479\u047a\5\u00e0q\2\u047a"+
		"\177\3\2\2\2\u047b\u047c\5\u00e0q\2\u047c\u0081\3\2\2\2\u047d\u0489\5"+
		"\u00bc_\2\u047e\u0489\5\u00c2b\2\u047f\u0489\5\u00d6l\2\u0480\u0484\7"+
		"(\2\2\u0481\u0482\7-\2\2\u0482\u0483\7\'\2\2\u0483\u0485\7\u00c7\2\2\u0484"+
		"\u0481\3\2\2\2\u0484\u0485\3\2\2\2\u0485\u0486\3\2\2\2\u0486\u0489\7\u00f2"+
		"\2\2\u0487\u0489\5\u00dan\2\u0488\u047d\3\2\2\2\u0488\u047e\3\2\2\2\u0488"+
		"\u047f\3\2\2\2\u0488\u0480\3\2\2\2\u0488\u0487\3\2\2\2\u0489\u0083\3\2"+
		"\2\2\u048a\u048b\5\u00e0q\2\u048b\u0085\3\2\2\2\u048c\u04a6\5\u0088E\2"+
		"\u048d\u04a6\5\u008aF\2\u048e\u04a6\7)\2\2\u048f\u04a6\7\22\2\2\u0490"+
		"\u04a6\7\35\2\2\u0491\u0492\7\u00e6\2\2\u0492\u0493\7\u00f1\2\2\u0493"+
		"\u0494\7\u00f2\2\2\u0494\u04a6\7\u00e7\2\2\u0495\u04a6\7\u00f4\2\2\u0496"+
		"\u04a6\5\u008cG\2\u0497\u0498\7\u00f1\2\2\u0498\u049a\7\u00f2\2\2\u0499"+
		"\u049b\5\u0090I\2\u049a\u0499\3\2\2\2\u049a\u049b\3\2\2\2\u049b\u04a6"+
		"\3\2\2\2\u049c\u049d\t\24\2\2\u049d\u04a6\7\u00f2\2\2\u049e\u04a0\7\u00f1"+
		"\2\2\u049f\u049e\3\2\2\2\u049f\u04a0\3\2\2\2\u04a0\u04a1\3\2\2\2\u04a1"+
		"\u04a3\7\u00f5\2\2\u04a2\u04a4\5\u0090I\2\u04a3\u04a2\3\2\2\2\u04a3\u04a4"+
		"\3\2\2\2\u04a4\u04a6\3\2\2\2\u04a5\u048c\3\2\2\2\u04a5\u048d\3\2\2\2\u04a5"+
		"\u048e\3\2\2\2\u04a5\u048f\3\2\2\2\u04a5\u0490\3\2\2\2\u04a5\u0491\3\2"+
		"\2\2\u04a5\u0495\3\2\2\2\u04a5\u0496\3\2\2\2\u04a5\u0497\3\2\2\2\u04a5"+
		"\u049c\3\2\2\2\u04a5\u049f\3\2\2\2\u04a6\u0087\3\2\2\2\u04a7\u04a8\7\u00ee"+
		"\2\2\u04a8\u0089\3\2\2\2\u04a9\u04aa\7\u00f3\2\2\u04aa\u008b\3\2\2\2\u04ab"+
		"\u04ac\7\u00f2\2\2\u04ac\u008d\3\2\2\2\u04ad\u04ae\5\u00e0q\2\u04ae\u008f"+
		"\3\2\2\2\u04af\u04b0\7c\2\2\u04b0\u04b1\5\\/\2\u04b1\u0091\3\2\2\2\u04b2"+
		"\u04b3\7 \2\2\u04b3\u04b4\7\f\2\2\u04b4\u04b9\5l\67\2\u04b5\u04ba\7\b"+
		"\2\2\u04b6\u04ba\7\16\2\2\u04b7\u04b8\7\u00c2\2\2\u04b8\u04ba\5\u00c8"+
		"e\2\u04b9\u04b5\3\2\2\2\u04b9\u04b6\3\2\2\2\u04b9\u04b7\3\2\2\2\u04b9"+
		"\u04ba\3\2\2\2\u04ba\u04bd\3\2\2\2\u04bb\u04bc\7\u0098\2\2\u04bc\u04be"+
		"\t\17\2\2\u04bd\u04bb\3\2\2\2\u04bd\u04be\3\2\2\2\u04be\u0093\3\2\2\2"+
		"\u04bf\u04c3\5Z.\2\u04c0\u04c3\5\u008aF\2\u04c1\u04c3\5l\67\2\u04c2\u04bf"+
		"\3\2\2\2\u04c2\u04c0\3\2\2\2\u04c2\u04c1\3\2\2\2\u04c3\u04c5\3\2\2\2\u04c4"+
		"\u04c6\t\16\2\2\u04c5\u04c4\3\2\2\2\u04c5\u04c6\3\2\2\2\u04c6\u0095\3"+
		"\2\2\2\u04c7\u04c8\7\u00d6\2\2\u04c8\u0097\3\2\2\2\u04c9\u04ca\5Z.\2\u04ca"+
		"\u04cc\5\u00b2Z\2\u04cb\u04cd\5\u0090I\2\u04cc\u04cb\3\2\2\2\u04cc\u04cd"+
		"\3\2\2\2\u04cd\u04d1\3\2\2\2\u04ce\u04d0\5\u009aN\2\u04cf\u04ce\3\2\2"+
		"\2\u04d0\u04d3\3\2\2\2\u04d1\u04cf\3\2\2\2\u04d1\u04d2\3\2\2\2\u04d2\u0099"+
		"\3\2\2\2\u04d3\u04d1\3\2\2\2\u04d4\u04d6\5\u009cO\2\u04d5\u04d4\3\2\2"+
		"\2\u04d5\u04d6\3\2\2\2\u04d6\u04d7\3\2\2\2\u04d7\u04d8\5\u009eP\2\u04d8"+
		"\u04d9\5\u00b0Y\2\u04d9\u009b\3\2\2\2\u04da\u04db\7\67\2\2\u04db\u04dc"+
		"\5\u00dco\2\u04dc\u009d\3\2\2\2\u04dd\u04df\7\34\2\2\u04de\u04dd\3\2\2"+
		"\2\u04de\u04df\3\2\2\2\u04df\u04e0\3\2\2\2\u04e0\u0513\7\35\2\2\u04e1"+
		"\u0513\5\u00a0Q\2\u04e2\u04e3\7;\2\2\u04e3\u0513\5\u00a2R\2\u04e4\u04e8"+
		"\7C\2\2\u04e5\u04e9\7\61\2\2\u04e6\u04e7\7\f\2\2\u04e7\u04e9\7;\2\2\u04e8"+
		"\u04e5\3\2\2\2\u04e8\u04e6\3\2\2\2\u04e9\u04ea\3\2\2\2\u04ea\u04eb\7\62"+
		"\2\2\u04eb\u04f0\7\u0082\2\2\u04ec\u04ed\7\u00e4\2\2\u04ed\u04ee\5\u00a4"+
		"S\2\u04ee\u04ef\7\u00e5\2\2\u04ef\u04f1\3\2\2\2\u04f0\u04ec\3\2\2\2\u04f0"+
		"\u04f1\3\2\2\2\u04f1\u0513\3\2\2\2\u04f2\u04f3\7W\2\2\u04f3\u0513\5\u00a8"+
		"U\2\u04f4\u04f5\5d\63\2\u04f5\u04f6\5\u00a8U\2\u04f6\u0513\3\2\2\2\u04f7"+
		"\u04f8\7M\2\2\u04f8\u04fd\5X-\2\u04f9\u04fa\7\u00e4\2\2\u04fa\u04fb\5"+
		"Z.\2\u04fb\u04fc\7\u00e5\2\2\u04fc\u04fe\3\2\2\2\u04fd\u04f9\3\2\2\2\u04fd"+
		"\u04fe\3\2\2\2\u04fe\u0505\3\2\2\2\u04ff\u0500\7\u0092\2\2\u0500\u0506"+
		"\7|\2\2\u0501\u0502\7\u0092\2\2\u0502\u0506\7\u00a0\2\2\u0503\u0504\7"+
		"\u0092\2\2\u0504\u0506\7\u00b5\2\2\u0505\u04ff\3\2\2\2\u0505\u0501\3\2"+
		"\2\2\u0505\u0503\3\2\2\2\u0505\u0506\3\2\2\2\u0506\u050a\3\2\2\2\u0507"+
		"\u0508\7I\2\2\u0508\u0509\7<\2\2\u0509\u050b\5\u00aaV\2\u050a\u0507\3"+
		"\2\2\2\u050a\u050b\3\2\2\2\u050b\u050f\3\2\2\2\u050c\u050e\5\u00acW\2"+
		"\u050d\u050c\3\2\2\2\u050e\u0511\3\2\2\2\u050f\u050d\3\2\2\2\u050f\u0510"+
		"\3\2\2\2\u0510\u0513\3\2\2\2\u0511\u050f\3\2\2\2\u0512\u04de\3\2\2\2\u0512"+
		"\u04e1\3\2\2\2\u0512\u04e2\3\2\2\2\u0512\u04e4\3\2\2\2\u0512\u04f2\3\2"+
		"\2\2\u0512\u04f4\3\2\2\2\u0512\u04f7\3\2\2\2\u0513\u009f\3\2\2\2\u0514"+
		"\u0515\7\64\2\2\u0515\u0518\5l\67\2\u0516\u0517\7H\2\2\u0517\u0519\7\u0088"+
		"\2\2\u0518\u0516\3\2\2\2\u0518\u0519\3\2\2\2\u0519\u00a1\3\2\2\2\u051a"+
		"\u051d\7h\2\2\u051b\u051d\5l\67\2\u051c\u051a\3\2\2\2\u051c\u051b\3\2"+
		"\2\2\u051d\u00a3\3\2\2\2\u051e\u0520\5\u00a6T\2\u051f\u051e\3\2\2\2\u0520"+
		"\u0521\3\2\2\2\u0521\u051f\3\2\2\2\u0521\u0522\3\2\2\2\u0522\u00a5\3\2"+
		"\2\2\u0523\u0525\7R\2\2\u0524\u0526\7-\2\2\u0525\u0524\3\2\2\2\u0525\u0526"+
		"\3\2\2\2\u0526\u0527\3\2\2\2\u0527\u053b\7\u00f3\2\2\u0528\u052a\7\u0086"+
		"\2\2\u0529\u052b\7\f\2\2\u052a\u0529\3\2\2\2\u052a\u052b\3\2\2\2\u052b"+
		"\u052c\3\2\2\2\u052c\u053b\7\u00f3\2\2\u052d\u052e\7\u0093\2\2\u052e\u053b"+
		"\7\u00f3\2\2\u052f\u0530\7H\2\2\u0530\u053b\7\u0093\2\2\u0531\u0532\7"+
		"\u0095\2\2\u0532\u053b\7\u00f3\2\2\u0533\u0534\7H\2\2\u0534\u053b\7\u0095"+
		"\2\2\u0535\u053b\7j\2\2\u0536\u0537\7H\2\2\u0537\u053b\7j\2\2\u0538\u0539"+
		"\7_\2\2\u0539\u053b\7\u00f3\2\2\u053a\u0523\3\2\2\2\u053a\u0528\3\2\2"+
		"\2\u053a\u052d\3\2\2\2\u053a\u052f\3\2\2\2\u053a\u0531\3\2\2\2\u053a\u0533"+
		"\3\2\2\2\u053a\u0535\3\2\2\2\u053a\u0536\3\2\2\2\u053a\u0538\3\2\2\2\u053b"+
		"\u00a7\3\2\2\2\u053c\u053d\7\u00c2\2\2\u053d\u053e\7E\2\2\u053e\u053f"+
		"\7\u00b9\2\2\u053f\u0541\5\u00dco\2\u0540\u053c\3\2\2\2\u0540\u0541\3"+
		"\2\2\2\u0541\u00a9\3\2\2\2\u0542\u0543\7H\2\2\u0543\u0549\7Z\2\2\u0544"+
		"\u0549\7\u00a9\2\2\u0545\u0549\7\63\2\2\u0546\u0547\7%\2\2\u0547\u0549"+
		"\t\25\2\2\u0548\u0542\3\2\2\2\u0548\u0544\3\2\2\2\u0548\u0545\3\2\2\2"+
		"\u0548\u0546\3\2\2\2\u0549\u00ab\3\2\2\2\u054a\u054f\7I\2\2\u054b\u054c"+
		"\7\u00c0\2\2\u054c\u0550\5\u00aeX\2\u054d\u054e\7<\2\2\u054e\u0550\5\u00ae"+
		"X\2\u054f\u054b\3\2\2\2\u054f\u054d\3\2\2\2\u0550\u00ad\3\2\2\2\u0551"+
		"\u055a\7\u00a9\2\2\u0552\u055a\7\63\2\2\u0553\u0554\7%\2\2\u0554\u055a"+
		"\7\35\2\2\u0555\u0556\7H\2\2\u0556\u055a\7Z\2\2\u0557\u0558\7%\2\2\u0558"+
		"\u055a\7;\2\2\u0559\u0551\3\2\2\2\u0559\u0552\3\2\2\2\u0559\u0553\3\2"+
		"\2\2\u0559\u0555\3\2\2\2\u0559\u0557\3\2\2\2\u055a\u00af\3\2\2\2\u055b"+
		"\u055d\7\34\2\2\u055c\u055b\3\2\2\2\u055c\u055d\3\2\2\2\u055d\u055e\3"+
		"\2\2\2\u055e\u0560\7n\2\2\u055f\u055c\3\2\2\2\u055f\u0560\3\2\2\2\u0560"+
		"\u0563\3\2\2\2\u0561\u0562\7\u008a\2\2\u0562\u0564\t\26\2\2\u0563\u0561"+
		"\3\2\2\2\u0563\u0564\3\2\2\2\u0564\u00b1\3\2\2\2\u0565\u0567\5\u00b4["+
		"\2\u0566\u0568\5\u00b6\\\2\u0567\u0566\3\2\2\2\u0567\u0568\3\2\2\2\u0568"+
		"\u056a\3\2\2\2\u0569\u056b\5b\62\2\u056a\u0569\3\2\2\2\u056a\u056b\3\2"+
		"\2\2\u056b\u0572\3\2\2\2\u056c\u056d\7\u00c6\2\2\u056d\u056e\7\'\2\2\u056e"+
		"\u0573\7\u00c7\2\2\u056f\u0570\7-\2\2\u0570\u0571\7\'\2\2\u0571\u0573"+
		"\7\u00c7\2\2\u0572\u056c\3\2\2\2\u0572\u056f\3\2\2\2\u0572\u0573\3\2\2"+
		"\2\u0573\u0578\3\2\2\2\u0574\u0575\7\u00e8\2\2\u0575\u0577\7\u00e9\2\2"+
		"\u0576\u0574\3\2\2\2\u0577\u057a\3\2\2\2\u0578\u0576\3\2\2\2\u0578\u0579"+
		"\3\2\2\2\u0579\u057d\3\2\2\2\u057a\u0578\3\2\2\2\u057b\u057d\7\u00f1\2"+
		"\2\u057c\u0565\3\2\2\2\u057c\u057b\3\2\2\2\u057d\u00b3\3\2\2\2\u057e\u057f"+
		"\7\u00f1\2\2\u057f\u0582\7\u00f1\2\2\u0580\u0582\7\u00f1\2\2\u0581\u057e"+
		"\3\2\2\2\u0581\u0580\3\2\2\2\u0582\u00b5\3\2\2\2\u0583\u0586\5\u00b8]"+
		"\2\u0584\u0585\7T\2\2\u0585\u0587\5\u00b8]\2\u0586\u0584\3\2\2\2\u0586"+
		"\u0587\3\2\2\2\u0587\u00b7\3\2\2\2\u0588\u0589\t\27\2\2\u0589\u00b9\3"+
		"\2\2\2\u058a\u058e\5\u00d0i\2\u058b\u058e\5\u00d4k\2\u058c\u058e\5l\67"+
		"\2\u058d\u058a\3\2\2\2\u058d\u058b\3\2\2\2\u058d\u058c\3\2\2\2\u058e\u00bb"+
		"\3\2\2\2\u058f\u0590\7\u00f1\2\2\u0590\u0592\7\u00e4\2\2\u0591\u0593\t"+
		"\30\2\2\u0592\u0591\3\2\2\2\u0592\u0593\3\2\2\2\u0593\u0594\3\2\2\2\u0594"+
		"\u0596\5h\65\2\u0595\u0597\5\u0092J\2\u0596\u0595\3\2\2\2\u0596\u0597"+
		"\3\2\2\2\u0597\u0598\3\2\2\2\u0598\u0599\7\u00e5\2\2\u0599\u059a\3\2\2"+
		"\2\u059a\u059b\5\u00c0a\2\u059b\u059c\7\u00e4\2\2\u059c\u059d\5h\65\2"+
		"\u059d\u059e\7\u00e5\2\2\u059e\u059f\7\u00c5\2\2\u059f\u05a0\7\24\2\2"+
		"\u05a0\u05a1\7\u00e4\2\2\u05a1\u05a2\5\u0092J\2\u05a2\u05a3\7\u00e5\2"+
		"\2\u05a3\u05a5\3\2\2\2\u05a4\u05a6\5\u00be`\2\u05a5\u05a4\3\2\2\2\u05a5"+
		"\u05a6\3\2\2\2\u05a6\u00bd\3\2\2\2\u05a7\u05a8\7x\2\2\u05a8\u05a9\7\u00e4"+
		"\2\2\u05a9\u05aa\7,\2\2\u05aa\u05ab\5p9\2\u05ab\u05ac\7\u00e5\2\2\u05ac"+
		"\u00bf\3\2\2\2\u05ad\u05ae\7\u00e4\2\2\u05ae\u05af\7\u00d6\2\2\u05af\u05b0"+
		"\7\u00e5\2\2\u05b0\u00c1\3\2\2\2\u05b1\u05b4\7\u00f1\2\2\u05b2\u05b5\5"+
		"j\66\2\u05b3\u05b5\5\u00c0a\2\u05b4\u05b2\3\2\2\2\u05b4\u05b3\3\2\2\2"+
		"\u05b5\u05b7\3\2\2\2\u05b6\u05b8\5\u00be`\2\u05b7\u05b6\3\2\2\2\u05b7"+
		"\u05b8\3\2\2\2\u05b8\u05b9\3\2\2\2\u05b9\u05ba\5\u00c4c\2\u05ba\u00c3"+
		"\3\2\2\2\u05bb\u05c1\7\u009d\2\2\u05bc\u05c2\7\u00f1\2\2\u05bd\u05be\7"+
		"\u00e4\2\2\u05be\u05bf\5\u00c6d\2\u05bf\u05c0\7\u00e5\2\2\u05c0\u05c2"+
		"\3\2\2\2\u05c1\u05bc\3\2\2\2\u05c1\u05bd\3\2\2\2\u05c2\u00c5\3\2\2\2\u05c3"+
		"\u05c5\7\u00f1\2\2\u05c4\u05c3\3\2\2\2\u05c4\u05c5\3\2\2\2\u05c5\u05c9"+
		"\3\2\2\2\u05c6\u05c7\7!\2\2\u05c7\u05c8\7\f\2\2\u05c8\u05ca\5h\65\2\u05c9"+
		"\u05c6\3\2\2\2\u05c9\u05ca\3\2\2\2\u05ca\u05d3\3\2\2\2\u05cb\u05d0\5\u0092"+
		"J\2\u05cc\u05cd\7\u00ea\2\2\u05cd\u05cf\5\u0092J\2\u05ce\u05cc\3\2\2\2"+
		"\u05cf\u05d2\3\2\2\2\u05d0\u05ce\3\2\2\2\u05d0\u05d1\3\2\2\2\u05d1\u05d4"+
		"\3\2\2\2\u05d2\u05d0\3\2\2\2\u05d3\u05cb\3\2\2\2\u05d3\u05d4\3\2\2\2\u05d4"+
		"\u05d6\3\2\2\2\u05d5\u05d7\5\u00caf\2\u05d6\u05d5\3\2\2\2\u05d6\u05d7"+
		"\3\2\2\2\u05d7\u00c7\3\2\2\2\u05d8\u05d9\t\31\2\2\u05d9\u00c9\3\2\2\2"+
		"\u05da\u05db\t\32\2\2\u05db\u05e3\5\u00ccg\2\u05dc\u05dd\t\32\2\2\u05dd"+
		"\u05de\7\n\2\2\u05de\u05df\5\u00ccg\2\u05df\u05e0\7\6\2\2\u05e0\u05e1"+
		"\5\u00ceh\2\u05e1\u05e3\3\2\2\2\u05e2\u05da\3\2\2\2\u05e2\u05dc\3\2\2"+
		"\2\u05e3\u00cb\3\2\2\2\u05e4\u05e5\7\u00be\2\2\u05e5\u05ef\7\u00a2\2\2"+
		"\u05e6\u05e7\7\u00f3\2\2\u05e7\u05ef\7\u00a2\2\2\u05e8\u05e9\79\2\2\u05e9"+
		"\u05ef\7$\2\2\u05ea\u05eb\7\u00f3\2\2\u05eb\u05ef\7z\2\2\u05ec\u05ed\7"+
		"\u00be\2\2\u05ed\u05ef\7z\2\2\u05ee\u05e4\3\2\2\2\u05ee\u05e6\3\2\2\2"+
		"\u05ee\u05e8\3\2\2\2\u05ee\u05ea\3\2\2\2\u05ee\u05ec\3\2\2\2\u05ef\u00cd"+
		"\3\2\2\2\u05f0\u05f1\5\u00ccg\2\u05f1\u00cf\3\2\2\2\u05f2\u05f3\7`\2\2"+
		"\u05f3\u05f4\7\u00e4\2\2\u05f4\u05f5\5l\67\2\u05f5\u05f6\7\62\2\2\u05f6"+
		"\u05f7\5\u00b2Z\2\u05f7\u05f8\7\u00e5\2\2\u05f8\u05ff\3\2\2\2\u05f9\u05fa"+
		"\5l\67\2\u05fa\u05fb\7\u00d3\2\2\u05fb\u05fc\7\u00d3\2\2\u05fc\u05fd\5"+
		"\u00b2Z\2\u05fd\u05ff\3\2\2\2\u05fe\u05f2\3\2\2\2\u05fe\u05f9\3\2\2\2"+
		"\u05ff\u00d1\3\2\2\2\u0600\u0601\7\u00d3\2\2\u0601\u0602\7\u00d3\2\2\u0602"+
		"\u0607\5\u00b2Z\2\u0603\u0604\7\u00e8\2\2\u0604\u0606\7\u00e9\2\2\u0605"+
		"\u0603\3\2\2\2\u0606\u0609\3\2\2\2\u0607\u0605\3\2\2\2\u0607\u0608\3\2"+
		"\2\2\u0608\u00d3\3\2\2\2\u0609\u0607\3\2\2\2\u060a\u060b\5l\67\2\u060b"+
		"\u060c\7c\2\2\u060c\u060d\5l\67\2\u060d\u00d5\3\2\2\2\u060e\u0610\5\u00d8"+
		"m\2\u060f\u0611\5\u00d2j\2\u0610\u060f\3\2\2\2\u0610\u0611\3\2\2\2\u0611"+
		"\u0617\3\2\2\2\u0612\u0613\7[\2\2\u0613\u0614\7\u00e8\2\2\u0614\u0615"+
		"\7\u00e9\2\2\u0615\u0617\5\u00d2j\2\u0616\u060e\3\2\2\2\u0616\u0612\3"+
		"\2\2\2\u0617\u00d7\3\2\2\2\u0618\u0619\7[\2\2\u0619\u061a\7\u00e8\2\2"+
		"\u061a\u061b\5h\65\2\u061b\u061c\7\u00e9\2\2\u061c\u062a\3\2\2\2\u061d"+
		"\u061e\7[\2\2\u061e\u061f\7\u00e8\2\2\u061f\u0624\5\u00d8m\2\u0620\u0621"+
		"\7\u00ea\2\2\u0621\u0623\5\u00d8m\2\u0622\u0620\3\2\2\2\u0623\u0626\3"+
		"\2\2\2\u0624\u0622\3\2\2\2\u0624\u0625\3\2\2\2\u0625\u0627\3\2\2\2\u0626"+
		"\u0624\3\2\2\2\u0627\u0628\7\u00e9\2\2\u0628\u062a\3\2\2\2\u0629\u0618"+
		"\3\2\2\2\u0629\u061d\3\2\2\2\u062a\u00d9\3\2\2\2\u062b\u062c\7w\2\2\u062c"+
		"\u062d\7\u00e4\2\2\u062d\u062e\7\u00f1\2\2\u062e\u062f\7\23\2\2\u062f"+
		"\u0630\7\u00f1\2\2\u0630\u0631\7\u00e5\2\2\u0631\u00db\3\2\2\2\u0632\u0633"+
		"\7\u00f1\2\2\u0633\u00dd\3\2\2\2\u0634\u0639\5\u00dco\2\u0635\u0636\7"+
		"\u00ea\2\2\u0636\u0638\5\u00dco\2\u0637\u0635\3\2\2\2\u0638\u063b\3\2"+
		"\2\2\u0639\u0637\3\2\2\2\u0639\u063a\3\2\2\2\u063a\u00df\3\2\2\2\u063b"+
		"\u0639\3\2\2\2\u063c\u063d\7\3\2\2\u063d\u00e1\3\2\2\2\u063e\u0642\7%"+
		"\2\2\u063f\u0640\7\u00b2\2\2\u0640\u0641\7a\2\2\u0641\u0643\7\62\2\2\u0642"+
		"\u063f\3\2\2\2\u0642\u0643\3\2\2\2\u0643\u0644\3\2\2\2\u0644\u0645\7U"+
		"\2\2\u0645\u00e3\3\2\2\2\u0646\u064a\7\\\2\2\u0647\u0648\7R\2\2\u0648"+
		"\u064a\7U\2\2\u0649\u0646\3\2\2\2\u0649\u0647\3\2\2\2\u064a\u00e5\3\2"+
		"\2\2\u064b\u064c\7\66\2\2\u064c\u00e7\3\2\2\2\u064d\u064e\7P\2\2\u064e"+
		"\u00e9\3\2\2\2\u064f\u0650\7\u00ac\2\2\u0650\u00eb\3\2\2\2\u0651\u0654"+
		"\7D\2\2\u0652\u0655\5\u00f0y\2\u0653\u0655\5\u00f2z\2\u0654\u0652\3\2"+
		"\2\2\u0654\u0653\3\2\2\2\u0655\u00ed\3\2\2\2\u0656\u0658\7N\2\2\u0657"+
		"\u0659\5\u00f4{\2\u0658\u0657\3\2\2\2\u0658\u0659\3\2\2\2\u0659\u065c"+
		"\3\2\2\2\u065a\u065d\5\u00f0y\2\u065b\u065d\5\u00f2z\2\u065c\u065a\3\2"+
		"\2\2\u065c\u065b\3\2\2\2\u065d\u00ef\3\2\2\2\u065e\u065f\5\u00f6|\2\u065f"+
		"\u0660\7I\2\2\u0660\u0661\5\u00fa~\2\u0661\u00f1\3\2\2\2\u0662\u0663\5"+
		"\u00dep\2\u0663\u00f3\3\2\2\2\u0664\u0665\t\33\2\2\u0665\u0666\7J\2\2"+
		"\u0666\u0667\7@\2\2\u0667\u00f5\3\2\2\2\u0668\u066a\5\u00f8}\2\u0669\u066b"+
		"\5f\64\2\u066a\u0669\3\2\2\2\u066a\u066b\3\2\2\2\u066b\u0673\3\2\2\2\u066c"+
		"\u066d\7\u00ea\2\2\u066d\u066f\5\u00f8}\2\u066e\u0670\5f\64\2\u066f\u066e"+
		"\3\2\2\2\u066f\u0670\3\2\2\2\u0670\u0672\3\2\2\2\u0671\u066c\3\2\2\2\u0672"+
		"\u0675\3\2\2\2\u0673\u0671\3\2\2\2\u0673\u0674\3\2\2\2\u0674\u00f7\3\2"+
		"\2\2\u0675\u0673\3\2\2\2\u0676\u0688\7\u00b0\2\2\u0677\u0688\7\u008b\2"+
		"\2\u0678\u0688\7\u00c0\2\2\u0679\u0688\7<\2\2\u067a\u0688\7V\2\2\u067b"+
		"\u0688\7M\2\2\u067c\u0688\7\u00bc\2\2\u067d\u0688\78\2\2\u067e\u0688\7"+
		"f\2\2\u067f\u0688\7\u00bb\2\2\u0680\u0688\7\u00ba\2\2\u0681\u0688\7s\2"+
		"\2\u0682\u0688\7\u00c1\2\2\u0683\u0685\7\5\2\2\u0684\u0686\7K\2\2\u0685"+
		"\u0684\3\2\2\2\u0685\u0686\3\2\2\2\u0686\u0688\3\2\2\2\u0687\u0676\3\2"+
		"\2\2\u0687\u0677\3\2\2\2\u0687\u0678\3\2\2\2\u0687\u0679\3\2\2\2\u0687"+
		"\u067a\3\2\2\2\u0687\u067b\3\2\2\2\u0687\u067c\3\2\2\2\u0687\u067d\3\2"+
		"\2\2\u0687\u067e\3\2\2\2\u0687\u067f\3\2\2\2\u0687\u0680\3\2\2\2\u0687"+
		"\u0681\3\2\2\2\u0687\u0682\3\2\2\2\u0687\u0683\3\2\2\2\u0688\u00f9\3\2"+
		"\2\2\u0689\u068b\7S\2\2\u068a\u0689\3\2\2\2\u068a\u068b\3\2\2\2\u068b"+
		"\u068c\3\2\2\2\u068c\u0691\5X-\2\u068d\u068e\7\u00ea\2\2\u068e\u0690\5"+
		"X-\2\u068f\u068d\3\2\2\2\u0690\u0693\3\2\2\2\u0691\u068f\3\2\2\2\u0691"+
		"\u0692\3\2\2\2\u0692\u06a3\3\2\2\2\u0693\u0691\3\2\2\2\u0694\u06a3\7l"+
		"\2\2\u0695\u06a3\7\u00ad\2\2\u0696\u06a3\7q\2\2\u0697\u06a3\7A\2\2\u0698"+
		"\u06a3\7B\2\2\u0699\u06a3\7\u00a3\2\2\u069a\u06a3\7\u00aa\2\2\u069b\u06a3"+
		"\7\5\2\2\u069c\u06a3\7\u008c\2\2\u069d\u069e\7\u008d\2\2\u069e\u06a3\7"+
		"\u0099\2\2\u069f\u06a3\7\u00b9\2\2\u06a0\u06a3\7\u00bd\2\2\u06a1\u06a3"+
		"\7\u00b1\2\2\u06a2\u068a\3\2\2\2\u06a2\u0694\3\2\2\2\u06a2\u0695\3\2\2"+
		"\2\u06a2\u0696\3\2\2\2\u06a2\u0697\3\2\2\2\u06a2\u0698\3\2\2\2\u06a2\u0699"+
		"\3\2\2\2\u06a2\u069a\3\2\2\2\u06a2\u069b\3\2\2\2\u06a2\u069c\3\2\2\2\u06a2"+
		"\u069d\3\2\2\2\u06a2\u069f\3\2\2\2\u06a2\u06a0\3\2\2\2\u06a2\u06a1\3\2"+
		"\2\2\u06a3\u00fb\3\2\2\2\u06a4\u06a5\78\2\2\u06a5\u06a6\7X\2\2\u06a6\u00fd"+
		"\3\2\2\2\u06a7\u06a8\7>\2\2\u06a8\u06a9\7X\2\2\u06a9\u00ff\3\2\2\2\u06aa"+
		"\u06ab\7\60\2\2\u06ab\u06ac\7X\2\2\u06ac\u0101\3\2\2\2\u06ad\u06ae\78"+
		"\2\2\u06ae\u06af\7O\2\2\u06af\u0103\3\2\2\2\u06b0\u06b1\7>\2\2\u06b1\u06b2"+
		"\7O\2\2\u06b2\u0105\3\2\2\2\u06b3\u06b4\7\60\2\2\u06b4\u06b5\7O\2\2\u06b5"+
		"\u0107\3\2\2\2\u06b6\u06bc\7\u00b4\2\2\u06b7\u06bd\7\5\2\2\u06b8\u06bd"+
		"\7\u00f1\2\2\u06b9\u06ba\7U\2\2\u06ba\u06bb\7F\2\2\u06bb\u06bd\7G\2\2"+
		"\u06bc\u06b7\3\2\2\2\u06bc\u06b8\3\2\2\2\u06bc\u06b9\3\2\2\2\u06bd\u0109"+
		"\3\2\2\2\u06be\u06c0\7%\2\2\u06bf\u06c1\5\u010c\u0087\2\u06c0\u06bf\3"+
		"\2\2\2\u06c0\u06c1\3\2\2\2\u06c1\u06c2\3\2\2\2\u06c2\u06c3\5\u010e\u0088"+
		"\2\u06c3\u010b\3\2\2\2\u06c4\u06c5\t\34\2\2\u06c5\u010d\3\2\2\2\u06c6"+
		"\u06c7\7\'\2\2\u06c7\u06c8\7\u00c7\2\2\u06c8\u06cd\5\u0110\u0089\2\u06c9"+
		"\u06ca\7\u00f1\2\2\u06ca\u06cb\t\35\2\2\u06cb\u06cd\t\36\2\2\u06cc\u06c6"+
		"\3\2\2\2\u06cc\u06c9\3\2\2\2\u06cd\u010f\3\2\2\2\u06ce\u06cf\t\37\2\2"+
		"\u06cf\u0111\3\2\2\2\u06d0\u06d1\7\u00a7\2\2\u06d1\u06d2\t \2\2\u06d2"+
		"\u0113\3\2\2\2\u00b7\u012b\u012e\u0132\u0136\u013b\u013e\u0146\u014a\u0151"+
		"\u0159\u015e\u0164\u0169\u016d\u0170\u0178\u017f\u0186\u019f\u01a6\u01ab"+
		"\u01af\u01b3\u01b9\u01c3\u01c6\u01d1\u01d4\u01e0\u01e9\u01ec\u01f0\u01f7"+
		"\u020a\u020e\u0215\u0225\u0228\u0242\u024e\u0261\u026b\u026d\u0271\u0275"+
		"\u027e\u0283\u0289\u028d\u0291\u0296\u029b\u029f\u02b5\u02bd\u02c4\u02cc"+
		"\u02e4\u02e8\u02f1\u02f4\u02f8\u02fb\u02fd\u0304\u030f\u0312\u0316\u032c"+
		"\u033a\u0354\u0359\u035c\u0360\u0363\u0366\u036a\u037c\u037e\u0383\u038d"+
		"\u0397\u03a9\u03ba\u03bc\u03c7\u03d6\u03d8\u03df\u03e6\u03ef\u03f6\u0404"+
		"\u040c\u0411\u0417\u0443\u0445\u0460\u0467\u0469\u046f\u0473\u0484\u0488"+
		"\u049a\u049f\u04a3\u04a5\u04b9\u04bd\u04c2\u04c5\u04cc\u04d1\u04d5\u04de"+
		"\u04e8\u04f0\u04fd\u0505\u050a\u050f\u0512\u0518\u051c\u0521\u0525\u052a"+
		"\u053a\u0540\u0548\u054f\u0559\u055c\u055f\u0563\u0567\u056a\u0572\u0578"+
		"\u057c\u0581\u0586\u058d\u0592\u0596\u05a5\u05b4\u05b7\u05c1\u05c4\u05c9"+
		"\u05d0\u05d3\u05d6\u05e2\u05ee\u05fe\u0607\u0610\u0616\u0624\u0629\u0639"+
		"\u0642\u0649\u0654\u0658\u065c\u066a\u066f\u0673\u0685\u0687\u068a\u0691"+
		"\u06a2\u06bc\u06c0\u06cc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}