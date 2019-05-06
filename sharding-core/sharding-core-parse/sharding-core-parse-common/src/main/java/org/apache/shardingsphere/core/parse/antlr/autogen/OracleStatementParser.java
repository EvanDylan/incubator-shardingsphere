// Generated from org\apache\shardingsphere\core\parse\antlr\autogen\OracleStatement.g4 by ANTLR 4.7.1
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
public class OracleStatementParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, WS=2, ALL=3, AND=4, ANY=5, ASC=6, BETWEEN=7, BINARY=8, BY=9, DATE=10, 
		DESC=11, DISTINCT=12, ESCAPE=13, EXISTS=14, FALSE=15, FROM=16, GROUP=17, 
		HAVING=18, IN=19, IS=20, KEY=21, LIKE=22, LIMIT=23, MOD=24, NOT=25, NULL=26, 
		OR=27, ORDER=28, PRIMARY=29, REGEXP=30, ROW=31, SET=32, SOUNDS=33, TIME=34, 
		TIMESTAMP=35, TRUE=36, UNION=37, UNKNOWN=38, WHERE=39, WITH=40, XOR=41, 
		ADD=42, ALTER=43, ALWAYS=44, AS=45, CASCADE=46, CHECK=47, COLUMN=48, COMMIT=49, 
		CONSTRAINT=50, CREATE=51, DAY=52, DEFAULT=53, DELETE=54, DISABLE=55, DROP=56, 
		ENABLE=57, FOR=58, FOREIGN=59, FUNCTION=60, GENERATED=61, GRANT=62, INDEX=63, 
		NO=64, ON=65, PRIVILEGES=66, READ=67, REFERENCES=68, REVOKE=69, ROLE=70, 
		ROLLBACK=71, ROWS=72, START=73, TABLE=74, TO=75, TRANSACTION=76, TRUNCATE=77, 
		UNIQUE=78, USER=79, YEAR=80, SELECT=81, INSERT=82, UPDATE=83, WRITE=84, 
		EXECUTE=85, USE=86, DEBUG=87, UNDER=88, FLASHBACK=89, ARCHIVE=90, REFRESH=91, 
		QUERY=92, REWRITE=93, KEEP=94, SEQUENCE=95, INHERIT=96, TRANSLATE=97, 
		SQL=98, MERGE=99, VIEW=100, AT=101, BITMAP=102, CACHE=103, CASE=104, CHECKPOINT=105, 
		CONNECT=106, CONSTRAINTS=107, CYCLE=108, DBTIMEZONE=109, DECRYPT=110, 
		DEFERRABLE=111, DEFERRED=112, DIRECTORY=113, EDITION=114, ELEMENT=115, 
		ELSE=116, ENCRYPT=117, END=118, EXCEPTIONS=119, FORCE=120, GLOBAL=121, 
		IDENTIFIED=122, IDENTITY=123, IMMEDIATE=124, INCREMENT=125, INITIALLY=126, 
		INTO=127, INVALIDATE=128, JAVA=129, LEVELS=130, LOCAL=131, MAXVALUE=132, 
		MINING=133, MINVALUE=134, MODEL=135, MODIFY=136, MONTH=137, NATIONAL=138, 
		NEW=139, NOCACHE=140, NOCYCLE=141, NOMAXVALUE=142, NOMINVALUE=143, NOORDER=144, 
		NORELY=145, NOVALIDATE=146, OF=147, ONLY=148, PRESERVE=149, PRIOR=150, 
		PROFILE=151, REF=152, REKEY=153, RELY=154, RENAME=155, REPLACE=156, RESOURCE=157, 
		ROWID=158, SALT=159, SAVEPOINT=160, SCOPE=161, SECOND=162, SORT=163, SOURCE=164, 
		SUBSTITUTABLE=165, TABLESPACE=166, TEMPORARY=167, THEN=168, TRANSLATION=169, 
		TREAT=170, TYPE=171, UNUSED=172, USING=173, VALIDATE=174, VALUE=175, VARYING=176, 
		VIRTUAL=177, WHEN=178, ZONE=179, FOR_GENERATOR=180, AND_=181, OR_=182, 
		NOT_=183, TILDE_=184, VERTICAL_BAR_=185, AMPERSAND_=186, SIGNED_LEFT_SHIFT_=187, 
		SIGNED_RIGHT_SHIFT_=188, CARET_=189, MOD_=190, COLON_=191, PLUS_=192, 
		MINUS_=193, ASTERISK_=194, SLASH_=195, BACKSLASH_=196, DOT_=197, DOT_ASTERISK_=198, 
		SAFE_EQ_=199, DEQ_=200, EQ_=201, NEQ_=202, GT_=203, GTE_=204, LT_=205, 
		LTE_=206, POUND_=207, LP_=208, RP_=209, LBE_=210, RBE_=211, LBT_=212, 
		RBT_=213, COMMA_=214, DQ_=215, SQ_=216, BQ_=217, QUESTION_=218, AT_=219, 
		SEMI_=220, IDENTIFIER_=221, STRING_=222, NUMBER_=223, HEX_DIGIT_=224, 
		BIT_NUM_=225;
	public static final int
		RULE_execute = 0, RULE_createTable = 1, RULE_alterTable = 2, RULE_dropTable = 3, 
		RULE_truncateTable = 4, RULE_tablespaceClauseWithParen = 5, RULE_tablespaceClause = 6, 
		RULE_domainIndexClause = 7, RULE_relationalTable = 8, RULE_relationalProperties = 9, 
		RULE_relationalProperty = 10, RULE_tableProperties = 11, RULE_unionSelect = 12, 
		RULE_alterTableProperties = 13, RULE_renameTableSpecification_ = 14, RULE_newTableName = 15, 
		RULE_columnClauses = 16, RULE_opColumnClause = 17, RULE_addColumnSpecification = 18, 
		RULE_columnOrVirtualDefinitions = 19, RULE_columnOrVirtualDefinition = 20, 
		RULE_modifyColumnSpecification = 21, RULE_modifyColProperties = 22, RULE_modifyColSubstitutable = 23, 
		RULE_dropColumnClause = 24, RULE_dropColumnSpecification = 25, RULE_columnOrColumnList = 26, 
		RULE_cascadeOrInvalidate = 27, RULE_checkpointNumber = 28, RULE_renameColumnSpecification = 29, 
		RULE_constraintClauses = 30, RULE_addConstraintSpecification = 31, RULE_modifyConstraintClause = 32, 
		RULE_constraintWithName = 33, RULE_constraintOption = 34, RULE_constraintPrimaryOrUnique = 35, 
		RULE_renameConstraintClause = 36, RULE_dropConstraintClause = 37, RULE_alterExternalTable = 38, 
		RULE_columnDefinition = 39, RULE_identityClause = 40, RULE_identityOptions = 41, 
		RULE_virtualColumnDefinition = 42, RULE_inlineConstraint = 43, RULE_referencesClause = 44, 
		RULE_constraintState = 45, RULE_notDeferrable = 46, RULE_initiallyClause = 47, 
		RULE_exceptionsClause = 48, RULE_usingIndexClause = 49, RULE_inlineRefConstraint = 50, 
		RULE_outOfLineConstraint = 51, RULE_outOfLineRefConstraint = 52, RULE_encryptionSpec = 53, 
		RULE_objectProperties = 54, RULE_objectProperty = 55, RULE_columnProperties = 56, 
		RULE_columnProperty = 57, RULE_objectTypeColProperties = 58, RULE_substitutableColumnClause = 59, 
		RULE_createIndex = 60, RULE_tableIndexClause_ = 61, RULE_indexExpr_ = 62, 
		RULE_bitmapJoinIndexClause_ = 63, RULE_columnSortClause_ = 64, RULE_dropIndex = 65, 
		RULE_alterIndex = 66, RULE_schemaName = 67, RULE_tableName = 68, RULE_columnName = 69, 
		RULE_indexName = 70, RULE_oracleId = 71, RULE_collationName = 72, RULE_alias = 73, 
		RULE_dataTypeLength = 74, RULE_primaryKey = 75, RULE_columnNames = 76, 
		RULE_exprs = 77, RULE_exprList = 78, RULE_expr = 79, RULE_exprRecursive = 80, 
		RULE_booleanPrimary = 81, RULE_comparisonOperator = 82, RULE_predicate = 83, 
		RULE_bitExpr = 84, RULE_simpleExpr = 85, RULE_functionCall = 86, RULE_distinct = 87, 
		RULE_intervalExpr = 88, RULE_caseExpress = 89, RULE_privateExprOfDb = 90, 
		RULE_variable = 91, RULE_literal = 92, RULE_question = 93, RULE_number = 94, 
		RULE_string = 95, RULE_subquery = 96, RULE_collateClause = 97, RULE_orderByClause = 98, 
		RULE_orderByItem = 99, RULE_asterisk = 100, RULE_attributeName = 101, 
		RULE_indexTypeName = 102, RULE_simpleExprsWithParen = 103, RULE_simpleExprs = 104, 
		RULE_lobItem = 105, RULE_lobItems = 106, RULE_lobItemList = 107, RULE_dataType = 108, 
		RULE_specialDatatype = 109, RULE_dataTypeName_ = 110, RULE_datetimeTypeSuffix = 111, 
		RULE_treatFunction = 112, RULE_caseExpr = 113, RULE_simpleCaseExpr = 114, 
		RULE_searchedCaseExpr = 115, RULE_elseClause = 116, RULE_dateTimeExpr = 117, 
		RULE_intervalExpression = 118, RULE_objectAccessExpression = 119, RULE_constructorExpr = 120, 
		RULE_ignoredIdentifier_ = 121, RULE_ignoredIdentifiers_ = 122, RULE_matchNone = 123, 
		RULE_setTransaction = 124, RULE_commit = 125, RULE_rollback = 126, RULE_savepoint = 127, 
		RULE_grant = 128, RULE_revoke = 129, RULE_objectPrivilegeClause_ = 130, 
		RULE_systemPrivilegeClause_ = 131, RULE_roleClause_ = 132, RULE_objectPrivileges_ = 133, 
		RULE_objectPrivilegeType_ = 134, RULE_onObjectClause_ = 135, RULE_systemPrivilege_ = 136, 
		RULE_createUser = 137, RULE_dropUser = 138, RULE_alterUser = 139, RULE_createRole = 140, 
		RULE_dropRole = 141, RULE_alterRole = 142;
	public static final String[] ruleNames = {
		"execute", "createTable", "alterTable", "dropTable", "truncateTable", 
		"tablespaceClauseWithParen", "tablespaceClause", "domainIndexClause", 
		"relationalTable", "relationalProperties", "relationalProperty", "tableProperties", 
		"unionSelect", "alterTableProperties", "renameTableSpecification_", "newTableName", 
		"columnClauses", "opColumnClause", "addColumnSpecification", "columnOrVirtualDefinitions", 
		"columnOrVirtualDefinition", "modifyColumnSpecification", "modifyColProperties", 
		"modifyColSubstitutable", "dropColumnClause", "dropColumnSpecification", 
		"columnOrColumnList", "cascadeOrInvalidate", "checkpointNumber", "renameColumnSpecification", 
		"constraintClauses", "addConstraintSpecification", "modifyConstraintClause", 
		"constraintWithName", "constraintOption", "constraintPrimaryOrUnique", 
		"renameConstraintClause", "dropConstraintClause", "alterExternalTable", 
		"columnDefinition", "identityClause", "identityOptions", "virtualColumnDefinition", 
		"inlineConstraint", "referencesClause", "constraintState", "notDeferrable", 
		"initiallyClause", "exceptionsClause", "usingIndexClause", "inlineRefConstraint", 
		"outOfLineConstraint", "outOfLineRefConstraint", "encryptionSpec", "objectProperties", 
		"objectProperty", "columnProperties", "columnProperty", "objectTypeColProperties", 
		"substitutableColumnClause", "createIndex", "tableIndexClause_", "indexExpr_", 
		"bitmapJoinIndexClause_", "columnSortClause_", "dropIndex", "alterIndex", 
		"schemaName", "tableName", "columnName", "indexName", "oracleId", "collationName", 
		"alias", "dataTypeLength", "primaryKey", "columnNames", "exprs", "exprList", 
		"expr", "exprRecursive", "booleanPrimary", "comparisonOperator", "predicate", 
		"bitExpr", "simpleExpr", "functionCall", "distinct", "intervalExpr", "caseExpress", 
		"privateExprOfDb", "variable", "literal", "question", "number", "string", 
		"subquery", "collateClause", "orderByClause", "orderByItem", "asterisk", 
		"attributeName", "indexTypeName", "simpleExprsWithParen", "simpleExprs", 
		"lobItem", "lobItems", "lobItemList", "dataType", "specialDatatype", "dataTypeName_", 
		"datetimeTypeSuffix", "treatFunction", "caseExpr", "simpleCaseExpr", "searchedCaseExpr", 
		"elseClause", "dateTimeExpr", "intervalExpression", "objectAccessExpression", 
		"constructorExpr", "ignoredIdentifier_", "ignoredIdentifiers_", "matchNone", 
		"setTransaction", "commit", "rollback", "savepoint", "grant", "revoke", 
		"objectPrivilegeClause_", "systemPrivilegeClause_", "roleClause_", "objectPrivileges_", 
		"objectPrivilegeType_", "onObjectClause_", "systemPrivilege_", "createUser", 
		"dropUser", "alterUser", "createRole", "dropRole", "alterRole"
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
		null, null, null, null, null, "'DO NOT MATCH ANY THING, JUST FOR GENERATOR'", 
		"'&&'", "'||'", "'!'", "'~'", "'|'", "'&'", "'<<'", "'>>'", "'^'", "'%'", 
		"':'", "'+'", "'-'", "'*'", "'/'", "'\\'", "'.'", "'.*'", "'<=>'", "'=='", 
		"'='", null, "'>'", "'>='", "'<'", "'<='", "'#'", "'('", "')'", "'{'", 
		"'}'", "'['", "']'", "','", "'\"'", "'''", "'`'", "'?'", "'@'", "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "WS", "ALL", "AND", "ANY", "ASC", "BETWEEN", "BINARY", "BY", 
		"DATE", "DESC", "DISTINCT", "ESCAPE", "EXISTS", "FALSE", "FROM", "GROUP", 
		"HAVING", "IN", "IS", "KEY", "LIKE", "LIMIT", "MOD", "NOT", "NULL", "OR", 
		"ORDER", "PRIMARY", "REGEXP", "ROW", "SET", "SOUNDS", "TIME", "TIMESTAMP", 
		"TRUE", "UNION", "UNKNOWN", "WHERE", "WITH", "XOR", "ADD", "ALTER", "ALWAYS", 
		"AS", "CASCADE", "CHECK", "COLUMN", "COMMIT", "CONSTRAINT", "CREATE", 
		"DAY", "DEFAULT", "DELETE", "DISABLE", "DROP", "ENABLE", "FOR", "FOREIGN", 
		"FUNCTION", "GENERATED", "GRANT", "INDEX", "NO", "ON", "PRIVILEGES", "READ", 
		"REFERENCES", "REVOKE", "ROLE", "ROLLBACK", "ROWS", "START", "TABLE", 
		"TO", "TRANSACTION", "TRUNCATE", "UNIQUE", "USER", "YEAR", "SELECT", "INSERT", 
		"UPDATE", "WRITE", "EXECUTE", "USE", "DEBUG", "UNDER", "FLASHBACK", "ARCHIVE", 
		"REFRESH", "QUERY", "REWRITE", "KEEP", "SEQUENCE", "INHERIT", "TRANSLATE", 
		"SQL", "MERGE", "VIEW", "AT", "BITMAP", "CACHE", "CASE", "CHECKPOINT", 
		"CONNECT", "CONSTRAINTS", "CYCLE", "DBTIMEZONE", "DECRYPT", "DEFERRABLE", 
		"DEFERRED", "DIRECTORY", "EDITION", "ELEMENT", "ELSE", "ENCRYPT", "END", 
		"EXCEPTIONS", "FORCE", "GLOBAL", "IDENTIFIED", "IDENTITY", "IMMEDIATE", 
		"INCREMENT", "INITIALLY", "INTO", "INVALIDATE", "JAVA", "LEVELS", "LOCAL", 
		"MAXVALUE", "MINING", "MINVALUE", "MODEL", "MODIFY", "MONTH", "NATIONAL", 
		"NEW", "NOCACHE", "NOCYCLE", "NOMAXVALUE", "NOMINVALUE", "NOORDER", "NORELY", 
		"NOVALIDATE", "OF", "ONLY", "PRESERVE", "PRIOR", "PROFILE", "REF", "REKEY", 
		"RELY", "RENAME", "REPLACE", "RESOURCE", "ROWID", "SALT", "SAVEPOINT", 
		"SCOPE", "SECOND", "SORT", "SOURCE", "SUBSTITUTABLE", "TABLESPACE", "TEMPORARY", 
		"THEN", "TRANSLATION", "TREAT", "TYPE", "UNUSED", "USING", "VALIDATE", 
		"VALUE", "VARYING", "VIRTUAL", "WHEN", "ZONE", "FOR_GENERATOR", "AND_", 
		"OR_", "NOT_", "TILDE_", "VERTICAL_BAR_", "AMPERSAND_", "SIGNED_LEFT_SHIFT_", 
		"SIGNED_RIGHT_SHIFT_", "CARET_", "MOD_", "COLON_", "PLUS_", "MINUS_", 
		"ASTERISK_", "SLASH_", "BACKSLASH_", "DOT_", "DOT_ASTERISK_", "SAFE_EQ_", 
		"DEQ_", "EQ_", "NEQ_", "GT_", "GTE_", "LT_", "LTE_", "POUND_", "LP_", 
		"RP_", "LBE_", "RBE_", "LBT_", "RBT_", "COMMA_", "DQ_", "SQ_", "BQ_", 
		"QUESTION_", "AT_", "SEMI_", "IDENTIFIER_", "STRING_", "NUMBER_", "HEX_DIGIT_", 
		"BIT_NUM_"
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
	public String getGrammarFileName() { return "OracleStatement.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public OracleStatementParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ExecuteContext extends ParserRuleContext {
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
		public AlterIndexContext alterIndex() {
			return getRuleContext(AlterIndexContext.class,0);
		}
		public CommitContext commit() {
			return getRuleContext(CommitContext.class,0);
		}
		public RollbackContext rollback() {
			return getRuleContext(RollbackContext.class,0);
		}
		public SetTransactionContext setTransaction() {
			return getRuleContext(SetTransactionContext.class,0);
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
		public TerminalNode SEMI_() { return getToken(OracleStatementParser.SEMI_, 0); }
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
			setState(305);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(286);
				createTable();
				}
				break;
			case 2:
				{
				setState(287);
				alterTable();
				}
				break;
			case 3:
				{
				setState(288);
				dropTable();
				}
				break;
			case 4:
				{
				setState(289);
				truncateTable();
				}
				break;
			case 5:
				{
				setState(290);
				createIndex();
				}
				break;
			case 6:
				{
				setState(291);
				dropIndex();
				}
				break;
			case 7:
				{
				setState(292);
				alterIndex();
				}
				break;
			case 8:
				{
				setState(293);
				commit();
				}
				break;
			case 9:
				{
				setState(294);
				rollback();
				}
				break;
			case 10:
				{
				setState(295);
				setTransaction();
				}
				break;
			case 11:
				{
				setState(296);
				savepoint();
				}
				break;
			case 12:
				{
				setState(297);
				grant();
				}
				break;
			case 13:
				{
				setState(298);
				revoke();
				}
				break;
			case 14:
				{
				setState(299);
				createUser();
				}
				break;
			case 15:
				{
				setState(300);
				dropUser();
				}
				break;
			case 16:
				{
				setState(301);
				alterUser();
				}
				break;
			case 17:
				{
				setState(302);
				createRole();
				}
				break;
			case 18:
				{
				setState(303);
				dropRole();
				}
				break;
			case 19:
				{
				setState(304);
				alterRole();
				}
				break;
			}
			setState(308);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI_) {
				{
				setState(307);
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

	public static class CreateTableContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(OracleStatementParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(OracleStatementParser.TABLE, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public RelationalTableContext relationalTable() {
			return getRuleContext(RelationalTableContext.class,0);
		}
		public TerminalNode GLOBAL() { return getToken(OracleStatementParser.GLOBAL, 0); }
		public TerminalNode TEMPORARY() { return getToken(OracleStatementParser.TEMPORARY, 0); }
		public CreateTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTable; }
	}

	public final CreateTableContext createTable() throws RecognitionException {
		CreateTableContext _localctx = new CreateTableContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_createTable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			match(CREATE);
			setState(313);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GLOBAL) {
				{
				setState(311);
				match(GLOBAL);
				setState(312);
				match(TEMPORARY);
				}
			}

			setState(315);
			match(TABLE);
			setState(316);
			tableName();
			setState(317);
			relationalTable();
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode ALTER() { return getToken(OracleStatementParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(OracleStatementParser.TABLE, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public AlterTablePropertiesContext alterTableProperties() {
			return getRuleContext(AlterTablePropertiesContext.class,0);
		}
		public ColumnClausesContext columnClauses() {
			return getRuleContext(ColumnClausesContext.class,0);
		}
		public ConstraintClausesContext constraintClauses() {
			return getRuleContext(ConstraintClausesContext.class,0);
		}
		public AlterExternalTableContext alterExternalTable() {
			return getRuleContext(AlterExternalTableContext.class,0);
		}
		public AlterTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterTable; }
	}

	public final AlterTableContext alterTable() throws RecognitionException {
		AlterTableContext _localctx = new AlterTableContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_alterTable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			match(ALTER);
			setState(320);
			match(TABLE);
			setState(321);
			tableName();
			setState(326);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(322);
				alterTableProperties();
				}
				break;
			case 2:
				{
				setState(323);
				columnClauses();
				}
				break;
			case 3:
				{
				setState(324);
				constraintClauses();
				}
				break;
			case 4:
				{
				setState(325);
				alterExternalTable();
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

	public static class DropTableContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(OracleStatementParser.DROP, 0); }
		public TerminalNode TABLE() { return getToken(OracleStatementParser.TABLE, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public DropTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropTable; }
	}

	public final DropTableContext dropTable() throws RecognitionException {
		DropTableContext _localctx = new DropTableContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_dropTable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			match(DROP);
			setState(329);
			match(TABLE);
			setState(330);
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

	public static class TruncateTableContext extends ParserRuleContext {
		public TerminalNode TRUNCATE() { return getToken(OracleStatementParser.TRUNCATE, 0); }
		public TerminalNode TABLE() { return getToken(OracleStatementParser.TABLE, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TruncateTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_truncateTable; }
	}

	public final TruncateTableContext truncateTable() throws RecognitionException {
		TruncateTableContext _localctx = new TruncateTableContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_truncateTable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			match(TRUNCATE);
			setState(333);
			match(TABLE);
			setState(334);
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

	public static class TablespaceClauseWithParenContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public TablespaceClauseContext tablespaceClause() {
			return getRuleContext(TablespaceClauseContext.class,0);
		}
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public TablespaceClauseWithParenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablespaceClauseWithParen; }
	}

	public final TablespaceClauseWithParenContext tablespaceClauseWithParen() throws RecognitionException {
		TablespaceClauseWithParenContext _localctx = new TablespaceClauseWithParenContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_tablespaceClauseWithParen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			match(LP_);
			setState(337);
			tablespaceClause();
			setState(338);
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

	public static class TablespaceClauseContext extends ParserRuleContext {
		public TerminalNode TABLESPACE() { return getToken(OracleStatementParser.TABLESPACE, 0); }
		public IgnoredIdentifier_Context ignoredIdentifier_() {
			return getRuleContext(IgnoredIdentifier_Context.class,0);
		}
		public TablespaceClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablespaceClause; }
	}

	public final TablespaceClauseContext tablespaceClause() throws RecognitionException {
		TablespaceClauseContext _localctx = new TablespaceClauseContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_tablespaceClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			match(TABLESPACE);
			setState(341);
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

	public static class DomainIndexClauseContext extends ParserRuleContext {
		public IndexTypeNameContext indexTypeName() {
			return getRuleContext(IndexTypeNameContext.class,0);
		}
		public DomainIndexClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_domainIndexClause; }
	}

	public final DomainIndexClauseContext domainIndexClause() throws RecognitionException {
		DomainIndexClauseContext _localctx = new DomainIndexClauseContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_domainIndexClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			indexTypeName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationalTableContext extends ParserRuleContext {
		public TablePropertiesContext tableProperties() {
			return getRuleContext(TablePropertiesContext.class,0);
		}
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public RelationalPropertiesContext relationalProperties() {
			return getRuleContext(RelationalPropertiesContext.class,0);
		}
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public TerminalNode ON() { return getToken(OracleStatementParser.ON, 0); }
		public TerminalNode COMMIT() { return getToken(OracleStatementParser.COMMIT, 0); }
		public TerminalNode ROWS() { return getToken(OracleStatementParser.ROWS, 0); }
		public TerminalNode DELETE() { return getToken(OracleStatementParser.DELETE, 0); }
		public TerminalNode PRESERVE() { return getToken(OracleStatementParser.PRESERVE, 0); }
		public RelationalTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalTable; }
	}

	public final RelationalTableContext relationalTable() throws RecognitionException {
		RelationalTableContext _localctx = new RelationalTableContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_relationalTable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP_) {
				{
				setState(345);
				match(LP_);
				setState(346);
				relationalProperties();
				setState(347);
				match(RP_);
				}
			}

			setState(355);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(351);
				match(ON);
				setState(352);
				match(COMMIT);
				setState(353);
				_la = _input.LA(1);
				if ( !(_la==DELETE || _la==PRESERVE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(354);
				match(ROWS);
				}
			}

			setState(357);
			tableProperties();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationalPropertiesContext extends ParserRuleContext {
		public List<RelationalPropertyContext> relationalProperty() {
			return getRuleContexts(RelationalPropertyContext.class);
		}
		public RelationalPropertyContext relationalProperty(int i) {
			return getRuleContext(RelationalPropertyContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(OracleStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(OracleStatementParser.COMMA_, i);
		}
		public RelationalPropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalProperties; }
	}

	public final RelationalPropertiesContext relationalProperties() throws RecognitionException {
		RelationalPropertiesContext _localctx = new RelationalPropertiesContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_relationalProperties);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			relationalProperty();
			setState(364);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(360);
				match(COMMA_);
				setState(361);
				relationalProperty();
				}
				}
				setState(366);
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

	public static class RelationalPropertyContext extends ParserRuleContext {
		public ColumnDefinitionContext columnDefinition() {
			return getRuleContext(ColumnDefinitionContext.class,0);
		}
		public VirtualColumnDefinitionContext virtualColumnDefinition() {
			return getRuleContext(VirtualColumnDefinitionContext.class,0);
		}
		public OutOfLineConstraintContext outOfLineConstraint() {
			return getRuleContext(OutOfLineConstraintContext.class,0);
		}
		public OutOfLineRefConstraintContext outOfLineRefConstraint() {
			return getRuleContext(OutOfLineRefConstraintContext.class,0);
		}
		public RelationalPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalProperty; }
	}

	public final RelationalPropertyContext relationalProperty() throws RecognitionException {
		RelationalPropertyContext _localctx = new RelationalPropertyContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_relationalProperty);
		try {
			setState(371);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(367);
				columnDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(368);
				virtualColumnDefinition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(369);
				outOfLineConstraint();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(370);
				outOfLineRefConstraint();
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

	public static class TablePropertiesContext extends ParserRuleContext {
		public ColumnPropertiesContext columnProperties() {
			return getRuleContext(ColumnPropertiesContext.class,0);
		}
		public TerminalNode AS() { return getToken(OracleStatementParser.AS, 0); }
		public UnionSelectContext unionSelect() {
			return getRuleContext(UnionSelectContext.class,0);
		}
		public TablePropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableProperties; }
	}

	public final TablePropertiesContext tableProperties() throws RecognitionException {
		TablePropertiesContext _localctx = new TablePropertiesContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_tableProperties);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLUMN) {
				{
				setState(373);
				columnProperties();
				}
			}

			setState(378);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(376);
				match(AS);
				setState(377);
				unionSelect();
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

	public static class UnionSelectContext extends ParserRuleContext {
		public MatchNoneContext matchNone() {
			return getRuleContext(MatchNoneContext.class,0);
		}
		public UnionSelectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unionSelect; }
	}

	public final UnionSelectContext unionSelect() throws RecognitionException {
		UnionSelectContext _localctx = new UnionSelectContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_unionSelect);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
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

	public static class AlterTablePropertiesContext extends ParserRuleContext {
		public RenameTableSpecification_Context renameTableSpecification_() {
			return getRuleContext(RenameTableSpecification_Context.class,0);
		}
		public TerminalNode REKEY() { return getToken(OracleStatementParser.REKEY, 0); }
		public EncryptionSpecContext encryptionSpec() {
			return getRuleContext(EncryptionSpecContext.class,0);
		}
		public AlterTablePropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterTableProperties; }
	}

	public final AlterTablePropertiesContext alterTableProperties() throws RecognitionException {
		AlterTablePropertiesContext _localctx = new AlterTablePropertiesContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_alterTableProperties);
		try {
			setState(385);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RENAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(382);
				renameTableSpecification_();
				}
				break;
			case REKEY:
				enterOuterAlt(_localctx, 2);
				{
				setState(383);
				match(REKEY);
				setState(384);
				encryptionSpec();
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

	public static class RenameTableSpecification_Context extends ParserRuleContext {
		public TerminalNode RENAME() { return getToken(OracleStatementParser.RENAME, 0); }
		public TerminalNode TO() { return getToken(OracleStatementParser.TO, 0); }
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
		enterRule(_localctx, 28, RULE_renameTableSpecification_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			match(RENAME);
			setState(388);
			match(TO);
			setState(389);
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
		public TerminalNode IDENTIFIER_() { return getToken(OracleStatementParser.IDENTIFIER_, 0); }
		public NewTableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newTableName; }
	}

	public final NewTableNameContext newTableName() throws RecognitionException {
		NewTableNameContext _localctx = new NewTableNameContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_newTableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
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

	public static class ColumnClausesContext extends ParserRuleContext {
		public List<OpColumnClauseContext> opColumnClause() {
			return getRuleContexts(OpColumnClauseContext.class);
		}
		public OpColumnClauseContext opColumnClause(int i) {
			return getRuleContext(OpColumnClauseContext.class,i);
		}
		public RenameColumnSpecificationContext renameColumnSpecification() {
			return getRuleContext(RenameColumnSpecificationContext.class,0);
		}
		public ColumnClausesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnClauses; }
	}

	public final ColumnClausesContext columnClauses() throws RecognitionException {
		ColumnClausesContext _localctx = new ColumnClausesContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_columnClauses);
		int _la;
		try {
			setState(399);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SET:
			case ADD:
			case DROP:
			case MODIFY:
				enterOuterAlt(_localctx, 1);
				{
				setState(394); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(393);
					opColumnClause();
					}
					}
					setState(396); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SET) | (1L << ADD) | (1L << DROP))) != 0) || _la==MODIFY );
				}
				break;
			case RENAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(398);
				renameColumnSpecification();
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

	public static class OpColumnClauseContext extends ParserRuleContext {
		public AddColumnSpecificationContext addColumnSpecification() {
			return getRuleContext(AddColumnSpecificationContext.class,0);
		}
		public ModifyColumnSpecificationContext modifyColumnSpecification() {
			return getRuleContext(ModifyColumnSpecificationContext.class,0);
		}
		public DropColumnClauseContext dropColumnClause() {
			return getRuleContext(DropColumnClauseContext.class,0);
		}
		public OpColumnClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opColumnClause; }
	}

	public final OpColumnClauseContext opColumnClause() throws RecognitionException {
		OpColumnClauseContext _localctx = new OpColumnClauseContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_opColumnClause);
		try {
			setState(404);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
				enterOuterAlt(_localctx, 1);
				{
				setState(401);
				addColumnSpecification();
				}
				break;
			case MODIFY:
				enterOuterAlt(_localctx, 2);
				{
				setState(402);
				modifyColumnSpecification();
				}
				break;
			case SET:
			case DROP:
				enterOuterAlt(_localctx, 3);
				{
				setState(403);
				dropColumnClause();
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
		public TerminalNode ADD() { return getToken(OracleStatementParser.ADD, 0); }
		public ColumnOrVirtualDefinitionsContext columnOrVirtualDefinitions() {
			return getRuleContext(ColumnOrVirtualDefinitionsContext.class,0);
		}
		public ColumnPropertiesContext columnProperties() {
			return getRuleContext(ColumnPropertiesContext.class,0);
		}
		public AddColumnSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addColumnSpecification; }
	}

	public final AddColumnSpecificationContext addColumnSpecification() throws RecognitionException {
		AddColumnSpecificationContext _localctx = new AddColumnSpecificationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_addColumnSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406);
			match(ADD);
			setState(407);
			columnOrVirtualDefinitions();
			setState(409);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLUMN) {
				{
				setState(408);
				columnProperties();
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

	public static class ColumnOrVirtualDefinitionsContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public List<ColumnOrVirtualDefinitionContext> columnOrVirtualDefinition() {
			return getRuleContexts(ColumnOrVirtualDefinitionContext.class);
		}
		public ColumnOrVirtualDefinitionContext columnOrVirtualDefinition(int i) {
			return getRuleContext(ColumnOrVirtualDefinitionContext.class,i);
		}
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(OracleStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(OracleStatementParser.COMMA_, i);
		}
		public ColumnOrVirtualDefinitionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnOrVirtualDefinitions; }
	}

	public final ColumnOrVirtualDefinitionsContext columnOrVirtualDefinitions() throws RecognitionException {
		ColumnOrVirtualDefinitionsContext _localctx = new ColumnOrVirtualDefinitionsContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_columnOrVirtualDefinitions);
		int _la;
		try {
			setState(423);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LP_:
				enterOuterAlt(_localctx, 1);
				{
				setState(411);
				match(LP_);
				setState(412);
				columnOrVirtualDefinition();
				setState(417);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(413);
					match(COMMA_);
					setState(414);
					columnOrVirtualDefinition();
					}
					}
					setState(419);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(420);
				match(RP_);
				}
				break;
			case IDENTIFIER_:
			case STRING_:
				enterOuterAlt(_localctx, 2);
				{
				setState(422);
				columnOrVirtualDefinition();
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

	public static class ColumnOrVirtualDefinitionContext extends ParserRuleContext {
		public ColumnDefinitionContext columnDefinition() {
			return getRuleContext(ColumnDefinitionContext.class,0);
		}
		public VirtualColumnDefinitionContext virtualColumnDefinition() {
			return getRuleContext(VirtualColumnDefinitionContext.class,0);
		}
		public ColumnOrVirtualDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnOrVirtualDefinition; }
	}

	public final ColumnOrVirtualDefinitionContext columnOrVirtualDefinition() throws RecognitionException {
		ColumnOrVirtualDefinitionContext _localctx = new ColumnOrVirtualDefinitionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_columnOrVirtualDefinition);
		try {
			setState(427);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(425);
				columnDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(426);
				virtualColumnDefinition();
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

	public static class ModifyColumnSpecificationContext extends ParserRuleContext {
		public TerminalNode MODIFY() { return getToken(OracleStatementParser.MODIFY, 0); }
		public List<ModifyColPropertiesContext> modifyColProperties() {
			return getRuleContexts(ModifyColPropertiesContext.class);
		}
		public ModifyColPropertiesContext modifyColProperties(int i) {
			return getRuleContext(ModifyColPropertiesContext.class,i);
		}
		public ModifyColSubstitutableContext modifyColSubstitutable() {
			return getRuleContext(ModifyColSubstitutableContext.class,0);
		}
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(OracleStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(OracleStatementParser.COMMA_, i);
		}
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public ModifyColumnSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifyColumnSpecification; }
	}

	public final ModifyColumnSpecificationContext modifyColumnSpecification() throws RecognitionException {
		ModifyColumnSpecificationContext _localctx = new ModifyColumnSpecificationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_modifyColumnSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			match(MODIFY);
			setState(445);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LP_:
			case IDENTIFIER_:
			case STRING_:
				{
				setState(431);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LP_) {
					{
					setState(430);
					match(LP_);
					}
				}

				setState(433);
				modifyColProperties();
				setState(438);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(434);
					match(COMMA_);
					setState(435);
					modifyColProperties();
					}
					}
					setState(440);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(442);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RP_) {
					{
					setState(441);
					match(RP_);
					}
				}

				}
				break;
			case COLUMN:
				{
				setState(444);
				modifyColSubstitutable();
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

	public static class ModifyColPropertiesContext extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(OracleStatementParser.DEFAULT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ENCRYPT() { return getToken(OracleStatementParser.ENCRYPT, 0); }
		public EncryptionSpecContext encryptionSpec() {
			return getRuleContext(EncryptionSpecContext.class,0);
		}
		public TerminalNode DECRYPT() { return getToken(OracleStatementParser.DECRYPT, 0); }
		public List<InlineConstraintContext> inlineConstraint() {
			return getRuleContexts(InlineConstraintContext.class);
		}
		public InlineConstraintContext inlineConstraint(int i) {
			return getRuleContext(InlineConstraintContext.class,i);
		}
		public ModifyColPropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifyColProperties; }
	}

	public final ModifyColPropertiesContext modifyColProperties() throws RecognitionException {
		ModifyColPropertiesContext _localctx = new ModifyColPropertiesContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_modifyColProperties);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(447);
			columnName();
			setState(449);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NATIONAL || _la==IDENTIFIER_) {
				{
				setState(448);
				dataType();
				}
			}

			setState(453);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(451);
				match(DEFAULT);
				setState(452);
				expr(0);
				}
			}

			setState(458);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENCRYPT:
				{
				setState(455);
				match(ENCRYPT);
				setState(456);
				encryptionSpec();
				}
				break;
			case DECRYPT:
				{
				setState(457);
				match(DECRYPT);
				}
				break;
			case EOF:
			case KEY:
			case NOT:
			case NULL:
			case PRIMARY:
			case SET:
			case ADD:
			case CHECK:
			case CONSTRAINT:
			case DROP:
			case REFERENCES:
			case UNIQUE:
			case MODIFY:
			case RP_:
			case COMMA_:
			case SEMI_:
				break;
			default:
				break;
			}
			setState(463);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 21)) & ~0x3f) == 0 && ((1L << (_la - 21)) & ((1L << (KEY - 21)) | (1L << (NOT - 21)) | (1L << (NULL - 21)) | (1L << (PRIMARY - 21)) | (1L << (CHECK - 21)) | (1L << (CONSTRAINT - 21)) | (1L << (REFERENCES - 21)) | (1L << (UNIQUE - 21)))) != 0)) {
				{
				{
				setState(460);
				inlineConstraint();
				}
				}
				setState(465);
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

	public static class ModifyColSubstitutableContext extends ParserRuleContext {
		public TerminalNode COLUMN() { return getToken(OracleStatementParser.COLUMN, 0); }
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public TerminalNode SUBSTITUTABLE() { return getToken(OracleStatementParser.SUBSTITUTABLE, 0); }
		public TerminalNode AT() { return getToken(OracleStatementParser.AT, 0); }
		public TerminalNode ALL() { return getToken(OracleStatementParser.ALL, 0); }
		public TerminalNode LEVELS() { return getToken(OracleStatementParser.LEVELS, 0); }
		public TerminalNode NOT() { return getToken(OracleStatementParser.NOT, 0); }
		public TerminalNode FORCE() { return getToken(OracleStatementParser.FORCE, 0); }
		public ModifyColSubstitutableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifyColSubstitutable; }
	}

	public final ModifyColSubstitutableContext modifyColSubstitutable() throws RecognitionException {
		ModifyColSubstitutableContext _localctx = new ModifyColSubstitutableContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_modifyColSubstitutable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(466);
			match(COLUMN);
			setState(467);
			columnName();
			setState(469);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(468);
				match(NOT);
				}
			}

			setState(471);
			match(SUBSTITUTABLE);
			setState(472);
			match(AT);
			setState(473);
			match(ALL);
			setState(474);
			match(LEVELS);
			setState(476);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FORCE) {
				{
				setState(475);
				match(FORCE);
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

	public static class DropColumnClauseContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(OracleStatementParser.SET, 0); }
		public TerminalNode UNUSED() { return getToken(OracleStatementParser.UNUSED, 0); }
		public ColumnOrColumnListContext columnOrColumnList() {
			return getRuleContext(ColumnOrColumnListContext.class,0);
		}
		public List<CascadeOrInvalidateContext> cascadeOrInvalidate() {
			return getRuleContexts(CascadeOrInvalidateContext.class);
		}
		public CascadeOrInvalidateContext cascadeOrInvalidate(int i) {
			return getRuleContext(CascadeOrInvalidateContext.class,i);
		}
		public DropColumnSpecificationContext dropColumnSpecification() {
			return getRuleContext(DropColumnSpecificationContext.class,0);
		}
		public DropColumnClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropColumnClause; }
	}

	public final DropColumnClauseContext dropColumnClause() throws RecognitionException {
		DropColumnClauseContext _localctx = new DropColumnClauseContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_dropColumnClause);
		int _la;
		try {
			setState(488);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SET:
				enterOuterAlt(_localctx, 1);
				{
				setState(478);
				match(SET);
				setState(479);
				match(UNUSED);
				setState(480);
				columnOrColumnList();
				setState(484);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CASCADE || _la==INVALIDATE) {
					{
					{
					setState(481);
					cascadeOrInvalidate();
					}
					}
					setState(486);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case DROP:
				enterOuterAlt(_localctx, 2);
				{
				setState(487);
				dropColumnSpecification();
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

	public static class DropColumnSpecificationContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(OracleStatementParser.DROP, 0); }
		public ColumnOrColumnListContext columnOrColumnList() {
			return getRuleContext(ColumnOrColumnListContext.class,0);
		}
		public List<CascadeOrInvalidateContext> cascadeOrInvalidate() {
			return getRuleContexts(CascadeOrInvalidateContext.class);
		}
		public CascadeOrInvalidateContext cascadeOrInvalidate(int i) {
			return getRuleContext(CascadeOrInvalidateContext.class,i);
		}
		public CheckpointNumberContext checkpointNumber() {
			return getRuleContext(CheckpointNumberContext.class,0);
		}
		public DropColumnSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropColumnSpecification; }
	}

	public final DropColumnSpecificationContext dropColumnSpecification() throws RecognitionException {
		DropColumnSpecificationContext _localctx = new DropColumnSpecificationContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_dropColumnSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(490);
			match(DROP);
			setState(491);
			columnOrColumnList();
			setState(495);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASCADE || _la==INVALIDATE) {
				{
				{
				setState(492);
				cascadeOrInvalidate();
				}
				}
				setState(497);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(499);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CHECKPOINT) {
				{
				setState(498);
				checkpointNumber();
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

	public static class ColumnOrColumnListContext extends ParserRuleContext {
		public TerminalNode COLUMN() { return getToken(OracleStatementParser.COLUMN, 0); }
		public List<ColumnNameContext> columnName() {
			return getRuleContexts(ColumnNameContext.class);
		}
		public ColumnNameContext columnName(int i) {
			return getRuleContext(ColumnNameContext.class,i);
		}
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(OracleStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(OracleStatementParser.COMMA_, i);
		}
		public ColumnOrColumnListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnOrColumnList; }
	}

	public final ColumnOrColumnListContext columnOrColumnList() throws RecognitionException {
		ColumnOrColumnListContext _localctx = new ColumnOrColumnListContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_columnOrColumnList);
		int _la;
		try {
			setState(514);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COLUMN:
				enterOuterAlt(_localctx, 1);
				{
				setState(501);
				match(COLUMN);
				setState(502);
				columnName();
				}
				break;
			case LP_:
				enterOuterAlt(_localctx, 2);
				{
				setState(503);
				match(LP_);
				setState(504);
				columnName();
				setState(509);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(505);
					match(COMMA_);
					setState(506);
					columnName();
					}
					}
					setState(511);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(512);
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

	public static class CascadeOrInvalidateContext extends ParserRuleContext {
		public TerminalNode CASCADE() { return getToken(OracleStatementParser.CASCADE, 0); }
		public TerminalNode CONSTRAINTS() { return getToken(OracleStatementParser.CONSTRAINTS, 0); }
		public TerminalNode INVALIDATE() { return getToken(OracleStatementParser.INVALIDATE, 0); }
		public CascadeOrInvalidateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cascadeOrInvalidate; }
	}

	public final CascadeOrInvalidateContext cascadeOrInvalidate() throws RecognitionException {
		CascadeOrInvalidateContext _localctx = new CascadeOrInvalidateContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_cascadeOrInvalidate);
		try {
			setState(519);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASCADE:
				enterOuterAlt(_localctx, 1);
				{
				setState(516);
				match(CASCADE);
				setState(517);
				match(CONSTRAINTS);
				}
				break;
			case INVALIDATE:
				enterOuterAlt(_localctx, 2);
				{
				setState(518);
				match(INVALIDATE);
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

	public static class CheckpointNumberContext extends ParserRuleContext {
		public TerminalNode CHECKPOINT() { return getToken(OracleStatementParser.CHECKPOINT, 0); }
		public TerminalNode NUMBER_() { return getToken(OracleStatementParser.NUMBER_, 0); }
		public CheckpointNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_checkpointNumber; }
	}

	public final CheckpointNumberContext checkpointNumber() throws RecognitionException {
		CheckpointNumberContext _localctx = new CheckpointNumberContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_checkpointNumber);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(521);
			match(CHECKPOINT);
			setState(522);
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

	public static class RenameColumnSpecificationContext extends ParserRuleContext {
		public TerminalNode RENAME() { return getToken(OracleStatementParser.RENAME, 0); }
		public TerminalNode COLUMN() { return getToken(OracleStatementParser.COLUMN, 0); }
		public List<ColumnNameContext> columnName() {
			return getRuleContexts(ColumnNameContext.class);
		}
		public ColumnNameContext columnName(int i) {
			return getRuleContext(ColumnNameContext.class,i);
		}
		public TerminalNode TO() { return getToken(OracleStatementParser.TO, 0); }
		public RenameColumnSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_renameColumnSpecification; }
	}

	public final RenameColumnSpecificationContext renameColumnSpecification() throws RecognitionException {
		RenameColumnSpecificationContext _localctx = new RenameColumnSpecificationContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_renameColumnSpecification);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(524);
			match(RENAME);
			setState(525);
			match(COLUMN);
			setState(526);
			columnName();
			setState(527);
			match(TO);
			setState(528);
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

	public static class ConstraintClausesContext extends ParserRuleContext {
		public AddConstraintSpecificationContext addConstraintSpecification() {
			return getRuleContext(AddConstraintSpecificationContext.class,0);
		}
		public ModifyConstraintClauseContext modifyConstraintClause() {
			return getRuleContext(ModifyConstraintClauseContext.class,0);
		}
		public RenameConstraintClauseContext renameConstraintClause() {
			return getRuleContext(RenameConstraintClauseContext.class,0);
		}
		public List<DropConstraintClauseContext> dropConstraintClause() {
			return getRuleContexts(DropConstraintClauseContext.class);
		}
		public DropConstraintClauseContext dropConstraintClause(int i) {
			return getRuleContext(DropConstraintClauseContext.class,i);
		}
		public ConstraintClausesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraintClauses; }
	}

	public final ConstraintClausesContext constraintClauses() throws RecognitionException {
		ConstraintClausesContext _localctx = new ConstraintClausesContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_constraintClauses);
		int _la;
		try {
			setState(538);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
				enterOuterAlt(_localctx, 1);
				{
				setState(530);
				addConstraintSpecification();
				}
				break;
			case MODIFY:
				enterOuterAlt(_localctx, 2);
				{
				setState(531);
				modifyConstraintClause();
				}
				break;
			case RENAME:
				enterOuterAlt(_localctx, 3);
				{
				setState(532);
				renameConstraintClause();
				}
				break;
			case DROP:
				enterOuterAlt(_localctx, 4);
				{
				setState(534); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(533);
					dropConstraintClause();
					}
					}
					setState(536); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==DROP );
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

	public static class AddConstraintSpecificationContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(OracleStatementParser.ADD, 0); }
		public OutOfLineRefConstraintContext outOfLineRefConstraint() {
			return getRuleContext(OutOfLineRefConstraintContext.class,0);
		}
		public List<OutOfLineConstraintContext> outOfLineConstraint() {
			return getRuleContexts(OutOfLineConstraintContext.class);
		}
		public OutOfLineConstraintContext outOfLineConstraint(int i) {
			return getRuleContext(OutOfLineConstraintContext.class,i);
		}
		public AddConstraintSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addConstraintSpecification; }
	}

	public final AddConstraintSpecificationContext addConstraintSpecification() throws RecognitionException {
		AddConstraintSpecificationContext _localctx = new AddConstraintSpecificationContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_addConstraintSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(540);
			match(ADD);
			setState(547);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(542); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(541);
					outOfLineConstraint();
					}
					}
					setState(544); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 21)) & ~0x3f) == 0 && ((1L << (_la - 21)) & ((1L << (KEY - 21)) | (1L << (PRIMARY - 21)) | (1L << (CHECK - 21)) | (1L << (CONSTRAINT - 21)) | (1L << (FOREIGN - 21)) | (1L << (UNIQUE - 21)))) != 0) );
				}
				break;
			case 2:
				{
				setState(546);
				outOfLineRefConstraint();
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

	public static class ModifyConstraintClauseContext extends ParserRuleContext {
		public TerminalNode MODIFY() { return getToken(OracleStatementParser.MODIFY, 0); }
		public ConstraintOptionContext constraintOption() {
			return getRuleContext(ConstraintOptionContext.class,0);
		}
		public List<ConstraintStateContext> constraintState() {
			return getRuleContexts(ConstraintStateContext.class);
		}
		public ConstraintStateContext constraintState(int i) {
			return getRuleContext(ConstraintStateContext.class,i);
		}
		public TerminalNode CASCADE() { return getToken(OracleStatementParser.CASCADE, 0); }
		public ModifyConstraintClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifyConstraintClause; }
	}

	public final ModifyConstraintClauseContext modifyConstraintClause() throws RecognitionException {
		ModifyConstraintClauseContext _localctx = new ModifyConstraintClauseContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_modifyConstraintClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(549);
			match(MODIFY);
			setState(550);
			constraintOption();
			setState(552); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(551);
				constraintState();
				}
				}
				setState(554); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << DISABLE) | (1L << ENABLE))) != 0) || ((((_la - 111)) & ~0x3f) == 0 && ((1L << (_la - 111)) & ((1L << (DEFERRABLE - 111)) | (1L << (EXCEPTIONS - 111)) | (1L << (INITIALLY - 111)) | (1L << (NORELY - 111)) | (1L << (NOVALIDATE - 111)) | (1L << (RELY - 111)) | (1L << (USING - 111)) | (1L << (VALIDATE - 111)))) != 0) );
			setState(557);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CASCADE) {
				{
				setState(556);
				match(CASCADE);
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

	public static class ConstraintWithNameContext extends ParserRuleContext {
		public TerminalNode CONSTRAINT() { return getToken(OracleStatementParser.CONSTRAINT, 0); }
		public IgnoredIdentifier_Context ignoredIdentifier_() {
			return getRuleContext(IgnoredIdentifier_Context.class,0);
		}
		public ConstraintWithNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraintWithName; }
	}

	public final ConstraintWithNameContext constraintWithName() throws RecognitionException {
		ConstraintWithNameContext _localctx = new ConstraintWithNameContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_constraintWithName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(559);
			match(CONSTRAINT);
			setState(560);
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

	public static class ConstraintOptionContext extends ParserRuleContext {
		public ConstraintWithNameContext constraintWithName() {
			return getRuleContext(ConstraintWithNameContext.class,0);
		}
		public ConstraintPrimaryOrUniqueContext constraintPrimaryOrUnique() {
			return getRuleContext(ConstraintPrimaryOrUniqueContext.class,0);
		}
		public ConstraintOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraintOption; }
	}

	public final ConstraintOptionContext constraintOption() throws RecognitionException {
		ConstraintOptionContext _localctx = new ConstraintOptionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_constraintOption);
		try {
			setState(564);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONSTRAINT:
				enterOuterAlt(_localctx, 1);
				{
				setState(562);
				constraintWithName();
				}
				break;
			case KEY:
			case PRIMARY:
			case UNIQUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(563);
				constraintPrimaryOrUnique();
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

	public static class ConstraintPrimaryOrUniqueContext extends ParserRuleContext {
		public PrimaryKeyContext primaryKey() {
			return getRuleContext(PrimaryKeyContext.class,0);
		}
		public TerminalNode UNIQUE() { return getToken(OracleStatementParser.UNIQUE, 0); }
		public ColumnNamesContext columnNames() {
			return getRuleContext(ColumnNamesContext.class,0);
		}
		public ConstraintPrimaryOrUniqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraintPrimaryOrUnique; }
	}

	public final ConstraintPrimaryOrUniqueContext constraintPrimaryOrUnique() throws RecognitionException {
		ConstraintPrimaryOrUniqueContext _localctx = new ConstraintPrimaryOrUniqueContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_constraintPrimaryOrUnique);
		try {
			setState(569);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KEY:
			case PRIMARY:
				enterOuterAlt(_localctx, 1);
				{
				setState(566);
				primaryKey();
				}
				break;
			case UNIQUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(567);
				match(UNIQUE);
				setState(568);
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

	public static class RenameConstraintClauseContext extends ParserRuleContext {
		public TerminalNode RENAME() { return getToken(OracleStatementParser.RENAME, 0); }
		public ConstraintWithNameContext constraintWithName() {
			return getRuleContext(ConstraintWithNameContext.class,0);
		}
		public TerminalNode TO() { return getToken(OracleStatementParser.TO, 0); }
		public IgnoredIdentifier_Context ignoredIdentifier_() {
			return getRuleContext(IgnoredIdentifier_Context.class,0);
		}
		public RenameConstraintClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_renameConstraintClause; }
	}

	public final RenameConstraintClauseContext renameConstraintClause() throws RecognitionException {
		RenameConstraintClauseContext _localctx = new RenameConstraintClauseContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_renameConstraintClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(571);
			match(RENAME);
			setState(572);
			constraintWithName();
			setState(573);
			match(TO);
			setState(574);
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

	public static class DropConstraintClauseContext extends ParserRuleContext {
		public List<TerminalNode> DROP() { return getTokens(OracleStatementParser.DROP); }
		public TerminalNode DROP(int i) {
			return getToken(OracleStatementParser.DROP, i);
		}
		public ConstraintPrimaryOrUniqueContext constraintPrimaryOrUnique() {
			return getRuleContext(ConstraintPrimaryOrUniqueContext.class,0);
		}
		public TerminalNode CONSTRAINT() { return getToken(OracleStatementParser.CONSTRAINT, 0); }
		public IgnoredIdentifier_Context ignoredIdentifier_() {
			return getRuleContext(IgnoredIdentifier_Context.class,0);
		}
		public TerminalNode CASCADE() { return getToken(OracleStatementParser.CASCADE, 0); }
		public TerminalNode INDEX() { return getToken(OracleStatementParser.INDEX, 0); }
		public TerminalNode KEEP() { return getToken(OracleStatementParser.KEEP, 0); }
		public DropConstraintClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropConstraintClause; }
	}

	public final DropConstraintClauseContext dropConstraintClause() throws RecognitionException {
		DropConstraintClauseContext _localctx = new DropConstraintClauseContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_dropConstraintClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(576);
			match(DROP);
			setState(590);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KEY:
			case PRIMARY:
			case UNIQUE:
				{
				setState(577);
				constraintPrimaryOrUnique();
				setState(579);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CASCADE) {
					{
					setState(578);
					match(CASCADE);
					}
				}

				setState(583);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
				case 1:
					{
					setState(581);
					_la = _input.LA(1);
					if ( !(_la==DROP || _la==KEEP) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(582);
					match(INDEX);
					}
					break;
				}
				}
				break;
			case CONSTRAINT:
				{
				{
				setState(585);
				match(CONSTRAINT);
				setState(586);
				ignoredIdentifier_();
				setState(588);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CASCADE) {
					{
					setState(587);
					match(CASCADE);
					}
				}

				}
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

	public static class AlterExternalTableContext extends ParserRuleContext {
		public List<AddColumnSpecificationContext> addColumnSpecification() {
			return getRuleContexts(AddColumnSpecificationContext.class);
		}
		public AddColumnSpecificationContext addColumnSpecification(int i) {
			return getRuleContext(AddColumnSpecificationContext.class,i);
		}
		public List<ModifyColumnSpecificationContext> modifyColumnSpecification() {
			return getRuleContexts(ModifyColumnSpecificationContext.class);
		}
		public ModifyColumnSpecificationContext modifyColumnSpecification(int i) {
			return getRuleContext(ModifyColumnSpecificationContext.class,i);
		}
		public List<DropColumnSpecificationContext> dropColumnSpecification() {
			return getRuleContexts(DropColumnSpecificationContext.class);
		}
		public DropColumnSpecificationContext dropColumnSpecification(int i) {
			return getRuleContext(DropColumnSpecificationContext.class,i);
		}
		public AlterExternalTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterExternalTable; }
	}

	public final AlterExternalTableContext alterExternalTable() throws RecognitionException {
		AlterExternalTableContext _localctx = new AlterExternalTableContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_alterExternalTable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(595); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(595);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ADD:
					{
					setState(592);
					addColumnSpecification();
					}
					break;
				case MODIFY:
					{
					setState(593);
					modifyColumnSpecification();
					}
					break;
				case DROP:
					{
					setState(594);
					dropColumnSpecification();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(597); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ADD || _la==DROP || _la==MODIFY );
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode SORT() { return getToken(OracleStatementParser.SORT, 0); }
		public TerminalNode DEFAULT() { return getToken(OracleStatementParser.DEFAULT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public IdentityClauseContext identityClause() {
			return getRuleContext(IdentityClauseContext.class,0);
		}
		public TerminalNode ENCRYPT() { return getToken(OracleStatementParser.ENCRYPT, 0); }
		public EncryptionSpecContext encryptionSpec() {
			return getRuleContext(EncryptionSpecContext.class,0);
		}
		public InlineRefConstraintContext inlineRefConstraint() {
			return getRuleContext(InlineRefConstraintContext.class,0);
		}
		public TerminalNode ON() { return getToken(OracleStatementParser.ON, 0); }
		public TerminalNode NULL() { return getToken(OracleStatementParser.NULL, 0); }
		public List<InlineConstraintContext> inlineConstraint() {
			return getRuleContexts(InlineConstraintContext.class);
		}
		public InlineConstraintContext inlineConstraint(int i) {
			return getRuleContext(InlineConstraintContext.class,i);
		}
		public ColumnDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnDefinition; }
	}

	public final ColumnDefinitionContext columnDefinition() throws RecognitionException {
		ColumnDefinitionContext _localctx = new ColumnDefinitionContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_columnDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(599);
			columnName();
			setState(600);
			dataType();
			setState(602);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SORT) {
				{
				setState(601);
				match(SORT);
				}
			}

			setState(611);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DEFAULT:
				{
				setState(604);
				match(DEFAULT);
				setState(607);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(605);
					match(ON);
					setState(606);
					match(NULL);
					}
				}

				setState(609);
				expr(0);
				}
				break;
			case GENERATED:
				{
				setState(610);
				identityClause();
				}
				break;
			case EOF:
			case KEY:
			case NOT:
			case NULL:
			case PRIMARY:
			case SET:
			case WITH:
			case ADD:
			case CHECK:
			case COLUMN:
			case CONSTRAINT:
			case DROP:
			case REFERENCES:
			case UNIQUE:
			case ENCRYPT:
			case MODIFY:
			case SCOPE:
			case RP_:
			case COMMA_:
			case SEMI_:
				break;
			default:
				break;
			}
			setState(615);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ENCRYPT) {
				{
				setState(613);
				match(ENCRYPT);
				setState(614);
				encryptionSpec();
				}
			}

			setState(623);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(618); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(617);
					inlineConstraint();
					}
					}
					setState(620); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 21)) & ~0x3f) == 0 && ((1L << (_la - 21)) & ((1L << (KEY - 21)) | (1L << (NOT - 21)) | (1L << (NULL - 21)) | (1L << (PRIMARY - 21)) | (1L << (CHECK - 21)) | (1L << (CONSTRAINT - 21)) | (1L << (REFERENCES - 21)) | (1L << (UNIQUE - 21)))) != 0) );
				}
				break;
			case 2:
				{
				setState(622);
				inlineRefConstraint();
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

	public static class IdentityClauseContext extends ParserRuleContext {
		public TerminalNode GENERATED() { return getToken(OracleStatementParser.GENERATED, 0); }
		public TerminalNode AS() { return getToken(OracleStatementParser.AS, 0); }
		public TerminalNode IDENTITY() { return getToken(OracleStatementParser.IDENTITY, 0); }
		public TerminalNode ALWAYS() { return getToken(OracleStatementParser.ALWAYS, 0); }
		public TerminalNode BY() { return getToken(OracleStatementParser.BY, 0); }
		public TerminalNode DEFAULT() { return getToken(OracleStatementParser.DEFAULT, 0); }
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public TerminalNode ON() { return getToken(OracleStatementParser.ON, 0); }
		public TerminalNode NULL() { return getToken(OracleStatementParser.NULL, 0); }
		public List<IdentityOptionsContext> identityOptions() {
			return getRuleContexts(IdentityOptionsContext.class);
		}
		public IdentityOptionsContext identityOptions(int i) {
			return getRuleContext(IdentityOptionsContext.class,i);
		}
		public IdentityClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identityClause; }
	}

	public final IdentityClauseContext identityClause() throws RecognitionException {
		IdentityClauseContext _localctx = new IdentityClauseContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_identityClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(625);
			match(GENERATED);
			setState(633);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALWAYS:
				{
				setState(626);
				match(ALWAYS);
				}
				break;
			case BY:
				{
				setState(627);
				match(BY);
				setState(628);
				match(DEFAULT);
				setState(631);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(629);
					match(ON);
					setState(630);
					match(NULL);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(635);
			match(AS);
			setState(636);
			match(IDENTITY);
			setState(638);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP_) {
				{
				setState(637);
				match(LP_);
				}
			}

			setState(645);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER || _la==START || ((((_la - 103)) & ~0x3f) == 0 && ((1L << (_la - 103)) & ((1L << (CACHE - 103)) | (1L << (CYCLE - 103)) | (1L << (INCREMENT - 103)) | (1L << (MAXVALUE - 103)) | (1L << (MINVALUE - 103)) | (1L << (NOCACHE - 103)) | (1L << (NOCYCLE - 103)) | (1L << (NOMAXVALUE - 103)) | (1L << (NOMINVALUE - 103)) | (1L << (NOORDER - 103)))) != 0)) {
				{
				setState(641); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(640);
					identityOptions();
					}
					}
					setState(643); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ORDER || _la==START || ((((_la - 103)) & ~0x3f) == 0 && ((1L << (_la - 103)) & ((1L << (CACHE - 103)) | (1L << (CYCLE - 103)) | (1L << (INCREMENT - 103)) | (1L << (MAXVALUE - 103)) | (1L << (MINVALUE - 103)) | (1L << (NOCACHE - 103)) | (1L << (NOCYCLE - 103)) | (1L << (NOMAXVALUE - 103)) | (1L << (NOMINVALUE - 103)) | (1L << (NOORDER - 103)))) != 0) );
				}
			}

			setState(648);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				{
				setState(647);
				match(RP_);
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

	public static class IdentityOptionsContext extends ParserRuleContext {
		public TerminalNode START() { return getToken(OracleStatementParser.START, 0); }
		public TerminalNode WITH() { return getToken(OracleStatementParser.WITH, 0); }
		public TerminalNode NUMBER_() { return getToken(OracleStatementParser.NUMBER_, 0); }
		public TerminalNode LIMIT() { return getToken(OracleStatementParser.LIMIT, 0); }
		public TerminalNode VALUE() { return getToken(OracleStatementParser.VALUE, 0); }
		public TerminalNode INCREMENT() { return getToken(OracleStatementParser.INCREMENT, 0); }
		public TerminalNode BY() { return getToken(OracleStatementParser.BY, 0); }
		public TerminalNode MAXVALUE() { return getToken(OracleStatementParser.MAXVALUE, 0); }
		public TerminalNode NOMAXVALUE() { return getToken(OracleStatementParser.NOMAXVALUE, 0); }
		public TerminalNode MINVALUE() { return getToken(OracleStatementParser.MINVALUE, 0); }
		public TerminalNode NOMINVALUE() { return getToken(OracleStatementParser.NOMINVALUE, 0); }
		public TerminalNode CYCLE() { return getToken(OracleStatementParser.CYCLE, 0); }
		public TerminalNode NOCYCLE() { return getToken(OracleStatementParser.NOCYCLE, 0); }
		public TerminalNode CACHE() { return getToken(OracleStatementParser.CACHE, 0); }
		public TerminalNode NOCACHE() { return getToken(OracleStatementParser.NOCACHE, 0); }
		public TerminalNode ORDER() { return getToken(OracleStatementParser.ORDER, 0); }
		public TerminalNode NOORDER() { return getToken(OracleStatementParser.NOORDER, 0); }
		public IdentityOptionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identityOptions; }
	}

	public final IdentityOptionsContext identityOptions() throws RecognitionException {
		IdentityOptionsContext _localctx = new IdentityOptionsContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_identityOptions);
		try {
			setState(673);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case START:
				enterOuterAlt(_localctx, 1);
				{
				setState(650);
				match(START);
				setState(651);
				match(WITH);
				setState(655);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NUMBER_:
					{
					setState(652);
					match(NUMBER_);
					}
					break;
				case LIMIT:
					{
					setState(653);
					match(LIMIT);
					setState(654);
					match(VALUE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case INCREMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(657);
				match(INCREMENT);
				setState(658);
				match(BY);
				setState(659);
				match(NUMBER_);
				}
				break;
			case MAXVALUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(660);
				match(MAXVALUE);
				setState(661);
				match(NUMBER_);
				}
				break;
			case NOMAXVALUE:
				enterOuterAlt(_localctx, 4);
				{
				setState(662);
				match(NOMAXVALUE);
				}
				break;
			case MINVALUE:
				enterOuterAlt(_localctx, 5);
				{
				setState(663);
				match(MINVALUE);
				setState(664);
				match(NUMBER_);
				}
				break;
			case NOMINVALUE:
				enterOuterAlt(_localctx, 6);
				{
				setState(665);
				match(NOMINVALUE);
				}
				break;
			case CYCLE:
				enterOuterAlt(_localctx, 7);
				{
				setState(666);
				match(CYCLE);
				}
				break;
			case NOCYCLE:
				enterOuterAlt(_localctx, 8);
				{
				setState(667);
				match(NOCYCLE);
				}
				break;
			case CACHE:
				enterOuterAlt(_localctx, 9);
				{
				setState(668);
				match(CACHE);
				setState(669);
				match(NUMBER_);
				}
				break;
			case NOCACHE:
				enterOuterAlt(_localctx, 10);
				{
				setState(670);
				match(NOCACHE);
				}
				break;
			case ORDER:
				enterOuterAlt(_localctx, 11);
				{
				setState(671);
				match(ORDER);
				}
				break;
			case NOORDER:
				enterOuterAlt(_localctx, 12);
				{
				setState(672);
				match(NOORDER);
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

	public static class VirtualColumnDefinitionContext extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public TerminalNode AS() { return getToken(OracleStatementParser.AS, 0); }
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode GENERATED() { return getToken(OracleStatementParser.GENERATED, 0); }
		public TerminalNode ALWAYS() { return getToken(OracleStatementParser.ALWAYS, 0); }
		public TerminalNode VIRTUAL() { return getToken(OracleStatementParser.VIRTUAL, 0); }
		public List<InlineConstraintContext> inlineConstraint() {
			return getRuleContexts(InlineConstraintContext.class);
		}
		public InlineConstraintContext inlineConstraint(int i) {
			return getRuleContext(InlineConstraintContext.class,i);
		}
		public VirtualColumnDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_virtualColumnDefinition; }
	}

	public final VirtualColumnDefinitionContext virtualColumnDefinition() throws RecognitionException {
		VirtualColumnDefinitionContext _localctx = new VirtualColumnDefinitionContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_virtualColumnDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(675);
			columnName();
			setState(677);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NATIONAL || _la==IDENTIFIER_) {
				{
				setState(676);
				dataType();
				}
			}

			setState(681);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GENERATED) {
				{
				setState(679);
				match(GENERATED);
				setState(680);
				match(ALWAYS);
				}
			}

			setState(683);
			match(AS);
			setState(684);
			match(LP_);
			setState(685);
			expr(0);
			setState(686);
			match(RP_);
			setState(688);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VIRTUAL) {
				{
				setState(687);
				match(VIRTUAL);
				}
			}

			setState(693);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 21)) & ~0x3f) == 0 && ((1L << (_la - 21)) & ((1L << (KEY - 21)) | (1L << (NOT - 21)) | (1L << (NULL - 21)) | (1L << (PRIMARY - 21)) | (1L << (CHECK - 21)) | (1L << (CONSTRAINT - 21)) | (1L << (REFERENCES - 21)) | (1L << (UNIQUE - 21)))) != 0)) {
				{
				{
				setState(690);
				inlineConstraint();
				}
				}
				setState(695);
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

	public static class InlineConstraintContext extends ParserRuleContext {
		public TerminalNode NULL() { return getToken(OracleStatementParser.NULL, 0); }
		public TerminalNode UNIQUE() { return getToken(OracleStatementParser.UNIQUE, 0); }
		public PrimaryKeyContext primaryKey() {
			return getRuleContext(PrimaryKeyContext.class,0);
		}
		public ReferencesClauseContext referencesClause() {
			return getRuleContext(ReferencesClauseContext.class,0);
		}
		public TerminalNode CHECK() { return getToken(OracleStatementParser.CHECK, 0); }
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public TerminalNode CONSTRAINT() { return getToken(OracleStatementParser.CONSTRAINT, 0); }
		public IgnoredIdentifier_Context ignoredIdentifier_() {
			return getRuleContext(IgnoredIdentifier_Context.class,0);
		}
		public List<ConstraintStateContext> constraintState() {
			return getRuleContexts(ConstraintStateContext.class);
		}
		public ConstraintStateContext constraintState(int i) {
			return getRuleContext(ConstraintStateContext.class,i);
		}
		public TerminalNode NOT() { return getToken(OracleStatementParser.NOT, 0); }
		public InlineConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inlineConstraint; }
	}

	public final InlineConstraintContext inlineConstraint() throws RecognitionException {
		InlineConstraintContext _localctx = new InlineConstraintContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_inlineConstraint);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(698);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONSTRAINT) {
				{
				setState(696);
				match(CONSTRAINT);
				setState(697);
				ignoredIdentifier_();
				}
			}

			setState(712);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
			case NULL:
				{
				setState(701);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(700);
					match(NOT);
					}
				}

				setState(703);
				match(NULL);
				}
				break;
			case UNIQUE:
				{
				setState(704);
				match(UNIQUE);
				}
				break;
			case KEY:
			case PRIMARY:
				{
				setState(705);
				primaryKey();
				}
				break;
			case REFERENCES:
				{
				setState(706);
				referencesClause();
				}
				break;
			case CHECK:
				{
				setState(707);
				match(CHECK);
				setState(708);
				match(LP_);
				setState(709);
				expr(0);
				setState(710);
				match(RP_);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(717);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(714);
					constraintState();
					}
					} 
				}
				setState(719);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
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

	public static class ReferencesClauseContext extends ParserRuleContext {
		public TerminalNode REFERENCES() { return getToken(OracleStatementParser.REFERENCES, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public ColumnNamesContext columnNames() {
			return getRuleContext(ColumnNamesContext.class,0);
		}
		public TerminalNode ON() { return getToken(OracleStatementParser.ON, 0); }
		public TerminalNode DELETE() { return getToken(OracleStatementParser.DELETE, 0); }
		public TerminalNode CASCADE() { return getToken(OracleStatementParser.CASCADE, 0); }
		public TerminalNode SET() { return getToken(OracleStatementParser.SET, 0); }
		public TerminalNode NULL() { return getToken(OracleStatementParser.NULL, 0); }
		public ReferencesClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_referencesClause; }
	}

	public final ReferencesClauseContext referencesClause() throws RecognitionException {
		ReferencesClauseContext _localctx = new ReferencesClauseContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_referencesClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(720);
			match(REFERENCES);
			setState(721);
			tableName();
			setState(723);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP_) {
				{
				setState(722);
				columnNames();
				}
			}

			setState(732);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(725);
				match(ON);
				setState(726);
				match(DELETE);
				setState(730);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CASCADE:
					{
					setState(727);
					match(CASCADE);
					}
					break;
				case SET:
					{
					setState(728);
					match(SET);
					setState(729);
					match(NULL);
					}
					break;
				default:
					throw new NoViableAltException(this);
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

	public static class ConstraintStateContext extends ParserRuleContext {
		public NotDeferrableContext notDeferrable() {
			return getRuleContext(NotDeferrableContext.class,0);
		}
		public InitiallyClauseContext initiallyClause() {
			return getRuleContext(InitiallyClauseContext.class,0);
		}
		public TerminalNode RELY() { return getToken(OracleStatementParser.RELY, 0); }
		public TerminalNode NORELY() { return getToken(OracleStatementParser.NORELY, 0); }
		public UsingIndexClauseContext usingIndexClause() {
			return getRuleContext(UsingIndexClauseContext.class,0);
		}
		public TerminalNode ENABLE() { return getToken(OracleStatementParser.ENABLE, 0); }
		public TerminalNode DISABLE() { return getToken(OracleStatementParser.DISABLE, 0); }
		public TerminalNode VALIDATE() { return getToken(OracleStatementParser.VALIDATE, 0); }
		public TerminalNode NOVALIDATE() { return getToken(OracleStatementParser.NOVALIDATE, 0); }
		public ExceptionsClauseContext exceptionsClause() {
			return getRuleContext(ExceptionsClauseContext.class,0);
		}
		public ConstraintStateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraintState; }
	}

	public final ConstraintStateContext constraintState() throws RecognitionException {
		ConstraintStateContext _localctx = new ConstraintStateContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_constraintState);
		try {
			setState(744);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
			case DEFERRABLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(734);
				notDeferrable();
				}
				break;
			case INITIALLY:
				enterOuterAlt(_localctx, 2);
				{
				setState(735);
				initiallyClause();
				}
				break;
			case RELY:
				enterOuterAlt(_localctx, 3);
				{
				setState(736);
				match(RELY);
				}
				break;
			case NORELY:
				enterOuterAlt(_localctx, 4);
				{
				setState(737);
				match(NORELY);
				}
				break;
			case USING:
				enterOuterAlt(_localctx, 5);
				{
				setState(738);
				usingIndexClause();
				}
				break;
			case ENABLE:
				enterOuterAlt(_localctx, 6);
				{
				setState(739);
				match(ENABLE);
				}
				break;
			case DISABLE:
				enterOuterAlt(_localctx, 7);
				{
				setState(740);
				match(DISABLE);
				}
				break;
			case VALIDATE:
				enterOuterAlt(_localctx, 8);
				{
				setState(741);
				match(VALIDATE);
				}
				break;
			case NOVALIDATE:
				enterOuterAlt(_localctx, 9);
				{
				setState(742);
				match(NOVALIDATE);
				}
				break;
			case EXCEPTIONS:
				enterOuterAlt(_localctx, 10);
				{
				setState(743);
				exceptionsClause();
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

	public static class NotDeferrableContext extends ParserRuleContext {
		public TerminalNode DEFERRABLE() { return getToken(OracleStatementParser.DEFERRABLE, 0); }
		public TerminalNode NOT() { return getToken(OracleStatementParser.NOT, 0); }
		public NotDeferrableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notDeferrable; }
	}

	public final NotDeferrableContext notDeferrable() throws RecognitionException {
		NotDeferrableContext _localctx = new NotDeferrableContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_notDeferrable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(747);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(746);
				match(NOT);
				}
			}

			setState(749);
			match(DEFERRABLE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitiallyClauseContext extends ParserRuleContext {
		public TerminalNode INITIALLY() { return getToken(OracleStatementParser.INITIALLY, 0); }
		public TerminalNode IMMEDIATE() { return getToken(OracleStatementParser.IMMEDIATE, 0); }
		public TerminalNode DEFERRED() { return getToken(OracleStatementParser.DEFERRED, 0); }
		public InitiallyClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initiallyClause; }
	}

	public final InitiallyClauseContext initiallyClause() throws RecognitionException {
		InitiallyClauseContext _localctx = new InitiallyClauseContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_initiallyClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(751);
			match(INITIALLY);
			setState(752);
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
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExceptionsClauseContext extends ParserRuleContext {
		public TerminalNode EXCEPTIONS() { return getToken(OracleStatementParser.EXCEPTIONS, 0); }
		public TerminalNode INTO() { return getToken(OracleStatementParser.INTO, 0); }
		public ExceptionsClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exceptionsClause; }
	}

	public final ExceptionsClauseContext exceptionsClause() throws RecognitionException {
		ExceptionsClauseContext _localctx = new ExceptionsClauseContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_exceptionsClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(754);
			match(EXCEPTIONS);
			setState(755);
			match(INTO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UsingIndexClauseContext extends ParserRuleContext {
		public TerminalNode USING() { return getToken(OracleStatementParser.USING, 0); }
		public TerminalNode INDEX() { return getToken(OracleStatementParser.INDEX, 0); }
		public IndexNameContext indexName() {
			return getRuleContext(IndexNameContext.class,0);
		}
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public CreateIndexContext createIndex() {
			return getRuleContext(CreateIndexContext.class,0);
		}
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public UsingIndexClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_usingIndexClause; }
	}

	public final UsingIndexClauseContext usingIndexClause() throws RecognitionException {
		UsingIndexClauseContext _localctx = new UsingIndexClauseContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_usingIndexClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(757);
			match(USING);
			setState(758);
			match(INDEX);
			setState(764);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER_:
			case STRING_:
				{
				setState(759);
				indexName();
				}
				break;
			case LP_:
				{
				setState(760);
				match(LP_);
				setState(761);
				createIndex();
				setState(762);
				match(RP_);
				}
				break;
			case EOF:
			case KEY:
			case NOT:
			case NULL:
			case PRIMARY:
			case SET:
			case ADD:
			case CASCADE:
			case CHECK:
			case COLUMN:
			case CONSTRAINT:
			case DISABLE:
			case DROP:
			case ENABLE:
			case FOREIGN:
			case REFERENCES:
			case UNIQUE:
			case DEFERRABLE:
			case EXCEPTIONS:
			case INITIALLY:
			case MODIFY:
			case NORELY:
			case NOVALIDATE:
			case RELY:
			case USING:
			case VALIDATE:
			case RP_:
			case COMMA_:
			case SEMI_:
				break;
			default:
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

	public static class InlineRefConstraintContext extends ParserRuleContext {
		public TerminalNode SCOPE() { return getToken(OracleStatementParser.SCOPE, 0); }
		public TerminalNode IS() { return getToken(OracleStatementParser.IS, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode WITH() { return getToken(OracleStatementParser.WITH, 0); }
		public TerminalNode ROWID() { return getToken(OracleStatementParser.ROWID, 0); }
		public ReferencesClauseContext referencesClause() {
			return getRuleContext(ReferencesClauseContext.class,0);
		}
		public TerminalNode CONSTRAINT() { return getToken(OracleStatementParser.CONSTRAINT, 0); }
		public IgnoredIdentifier_Context ignoredIdentifier_() {
			return getRuleContext(IgnoredIdentifier_Context.class,0);
		}
		public List<ConstraintStateContext> constraintState() {
			return getRuleContexts(ConstraintStateContext.class);
		}
		public ConstraintStateContext constraintState(int i) {
			return getRuleContext(ConstraintStateContext.class,i);
		}
		public InlineRefConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inlineRefConstraint; }
	}

	public final InlineRefConstraintContext inlineRefConstraint() throws RecognitionException {
		InlineRefConstraintContext _localctx = new InlineRefConstraintContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_inlineRefConstraint);
		int _la;
		try {
			setState(782);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SCOPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(766);
				match(SCOPE);
				setState(767);
				match(IS);
				setState(768);
				tableName();
				}
				break;
			case WITH:
				enterOuterAlt(_localctx, 2);
				{
				setState(769);
				match(WITH);
				setState(770);
				match(ROWID);
				}
				break;
			case CONSTRAINT:
			case REFERENCES:
				enterOuterAlt(_localctx, 3);
				{
				setState(773);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CONSTRAINT) {
					{
					setState(771);
					match(CONSTRAINT);
					setState(772);
					ignoredIdentifier_();
					}
				}

				setState(775);
				referencesClause();
				setState(779);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << DISABLE) | (1L << ENABLE))) != 0) || ((((_la - 111)) & ~0x3f) == 0 && ((1L << (_la - 111)) & ((1L << (DEFERRABLE - 111)) | (1L << (EXCEPTIONS - 111)) | (1L << (INITIALLY - 111)) | (1L << (NORELY - 111)) | (1L << (NOVALIDATE - 111)) | (1L << (RELY - 111)) | (1L << (USING - 111)) | (1L << (VALIDATE - 111)))) != 0)) {
					{
					{
					setState(776);
					constraintState();
					}
					}
					setState(781);
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

	public static class OutOfLineConstraintContext extends ParserRuleContext {
		public TerminalNode UNIQUE() { return getToken(OracleStatementParser.UNIQUE, 0); }
		public ColumnNamesContext columnNames() {
			return getRuleContext(ColumnNamesContext.class,0);
		}
		public PrimaryKeyContext primaryKey() {
			return getRuleContext(PrimaryKeyContext.class,0);
		}
		public TerminalNode FOREIGN() { return getToken(OracleStatementParser.FOREIGN, 0); }
		public TerminalNode KEY() { return getToken(OracleStatementParser.KEY, 0); }
		public ReferencesClauseContext referencesClause() {
			return getRuleContext(ReferencesClauseContext.class,0);
		}
		public TerminalNode CHECK() { return getToken(OracleStatementParser.CHECK, 0); }
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public TerminalNode CONSTRAINT() { return getToken(OracleStatementParser.CONSTRAINT, 0); }
		public IgnoredIdentifier_Context ignoredIdentifier_() {
			return getRuleContext(IgnoredIdentifier_Context.class,0);
		}
		public List<ConstraintStateContext> constraintState() {
			return getRuleContexts(ConstraintStateContext.class);
		}
		public ConstraintStateContext constraintState(int i) {
			return getRuleContext(ConstraintStateContext.class,i);
		}
		public OutOfLineConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outOfLineConstraint; }
	}

	public final OutOfLineConstraintContext outOfLineConstraint() throws RecognitionException {
		OutOfLineConstraintContext _localctx = new OutOfLineConstraintContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_outOfLineConstraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(786);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONSTRAINT) {
				{
				setState(784);
				match(CONSTRAINT);
				setState(785);
				ignoredIdentifier_();
				}
			}

			setState(803);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UNIQUE:
				{
				setState(788);
				match(UNIQUE);
				setState(789);
				columnNames();
				}
				break;
			case KEY:
			case PRIMARY:
				{
				setState(790);
				primaryKey();
				setState(791);
				columnNames();
				}
				break;
			case FOREIGN:
				{
				setState(793);
				match(FOREIGN);
				setState(794);
				match(KEY);
				setState(795);
				columnNames();
				setState(796);
				referencesClause();
				}
				break;
			case CHECK:
				{
				setState(798);
				match(CHECK);
				setState(799);
				match(LP_);
				setState(800);
				expr(0);
				setState(801);
				match(RP_);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(808);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << DISABLE) | (1L << ENABLE))) != 0) || ((((_la - 111)) & ~0x3f) == 0 && ((1L << (_la - 111)) & ((1L << (DEFERRABLE - 111)) | (1L << (EXCEPTIONS - 111)) | (1L << (INITIALLY - 111)) | (1L << (NORELY - 111)) | (1L << (NOVALIDATE - 111)) | (1L << (RELY - 111)) | (1L << (USING - 111)) | (1L << (VALIDATE - 111)))) != 0)) {
				{
				{
				setState(805);
				constraintState();
				}
				}
				setState(810);
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

	public static class OutOfLineRefConstraintContext extends ParserRuleContext {
		public TerminalNode SCOPE() { return getToken(OracleStatementParser.SCOPE, 0); }
		public TerminalNode FOR() { return getToken(OracleStatementParser.FOR, 0); }
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public LobItemContext lobItem() {
			return getRuleContext(LobItemContext.class,0);
		}
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public TerminalNode IS() { return getToken(OracleStatementParser.IS, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode REF() { return getToken(OracleStatementParser.REF, 0); }
		public TerminalNode WITH() { return getToken(OracleStatementParser.WITH, 0); }
		public TerminalNode ROWID() { return getToken(OracleStatementParser.ROWID, 0); }
		public TerminalNode FOREIGN() { return getToken(OracleStatementParser.FOREIGN, 0); }
		public TerminalNode KEY() { return getToken(OracleStatementParser.KEY, 0); }
		public LobItemListContext lobItemList() {
			return getRuleContext(LobItemListContext.class,0);
		}
		public ReferencesClauseContext referencesClause() {
			return getRuleContext(ReferencesClauseContext.class,0);
		}
		public TerminalNode CONSTRAINT() { return getToken(OracleStatementParser.CONSTRAINT, 0); }
		public IgnoredIdentifier_Context ignoredIdentifier_() {
			return getRuleContext(IgnoredIdentifier_Context.class,0);
		}
		public List<ConstraintStateContext> constraintState() {
			return getRuleContexts(ConstraintStateContext.class);
		}
		public ConstraintStateContext constraintState(int i) {
			return getRuleContext(ConstraintStateContext.class,i);
		}
		public OutOfLineRefConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outOfLineRefConstraint; }
	}

	public final OutOfLineRefConstraintContext outOfLineRefConstraint() throws RecognitionException {
		OutOfLineRefConstraintContext _localctx = new OutOfLineRefConstraintContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_outOfLineRefConstraint);
		int _la;
		try {
			setState(840);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SCOPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(811);
				match(SCOPE);
				setState(812);
				match(FOR);
				setState(813);
				match(LP_);
				setState(814);
				lobItem();
				setState(815);
				match(RP_);
				setState(816);
				match(IS);
				setState(817);
				tableName();
				}
				break;
			case REF:
				enterOuterAlt(_localctx, 2);
				{
				setState(819);
				match(REF);
				setState(820);
				match(LP_);
				setState(821);
				lobItem();
				setState(822);
				match(RP_);
				setState(823);
				match(WITH);
				setState(824);
				match(ROWID);
				}
				break;
			case CONSTRAINT:
			case FOREIGN:
				enterOuterAlt(_localctx, 3);
				{
				setState(828);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CONSTRAINT) {
					{
					setState(826);
					match(CONSTRAINT);
					setState(827);
					ignoredIdentifier_();
					}
				}

				setState(830);
				match(FOREIGN);
				setState(831);
				match(KEY);
				setState(832);
				lobItemList();
				setState(833);
				referencesClause();
				setState(837);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << DISABLE) | (1L << ENABLE))) != 0) || ((((_la - 111)) & ~0x3f) == 0 && ((1L << (_la - 111)) & ((1L << (DEFERRABLE - 111)) | (1L << (EXCEPTIONS - 111)) | (1L << (INITIALLY - 111)) | (1L << (NORELY - 111)) | (1L << (NOVALIDATE - 111)) | (1L << (RELY - 111)) | (1L << (USING - 111)) | (1L << (VALIDATE - 111)))) != 0)) {
					{
					{
					setState(834);
					constraintState();
					}
					}
					setState(839);
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

	public static class EncryptionSpecContext extends ParserRuleContext {
		public TerminalNode USING() { return getToken(OracleStatementParser.USING, 0); }
		public List<TerminalNode> STRING_() { return getTokens(OracleStatementParser.STRING_); }
		public TerminalNode STRING_(int i) {
			return getToken(OracleStatementParser.STRING_, i);
		}
		public TerminalNode IDENTIFIED() { return getToken(OracleStatementParser.IDENTIFIED, 0); }
		public TerminalNode BY() { return getToken(OracleStatementParser.BY, 0); }
		public TerminalNode SALT() { return getToken(OracleStatementParser.SALT, 0); }
		public TerminalNode NO() { return getToken(OracleStatementParser.NO, 0); }
		public EncryptionSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_encryptionSpec; }
	}

	public final EncryptionSpecContext encryptionSpec() throws RecognitionException {
		EncryptionSpecContext _localctx = new EncryptionSpecContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_encryptionSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(844);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==USING) {
				{
				setState(842);
				match(USING);
				setState(843);
				match(STRING_);
				}
			}

			setState(849);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIED) {
				{
				setState(846);
				match(IDENTIFIED);
				setState(847);
				match(BY);
				setState(848);
				match(STRING_);
				}
			}

			setState(852);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING_) {
				{
				setState(851);
				match(STRING_);
				}
			}

			setState(858);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NO || _la==SALT) {
				{
				setState(855);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NO) {
					{
					setState(854);
					match(NO);
					}
				}

				setState(857);
				match(SALT);
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

	public static class ObjectPropertiesContext extends ParserRuleContext {
		public List<ObjectPropertyContext> objectProperty() {
			return getRuleContexts(ObjectPropertyContext.class);
		}
		public ObjectPropertyContext objectProperty(int i) {
			return getRuleContext(ObjectPropertyContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(OracleStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(OracleStatementParser.COMMA_, i);
		}
		public ObjectPropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectProperties; }
	}

	public final ObjectPropertiesContext objectProperties() throws RecognitionException {
		ObjectPropertiesContext _localctx = new ObjectPropertiesContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_objectProperties);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(860);
			objectProperty();
			setState(865);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(861);
				match(COMMA_);
				setState(862);
				objectProperty();
				}
				}
				setState(867);
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

	public static class ObjectPropertyContext extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public AttributeNameContext attributeName() {
			return getRuleContext(AttributeNameContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(OracleStatementParser.DEFAULT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<InlineConstraintContext> inlineConstraint() {
			return getRuleContexts(InlineConstraintContext.class);
		}
		public InlineConstraintContext inlineConstraint(int i) {
			return getRuleContext(InlineConstraintContext.class,i);
		}
		public InlineRefConstraintContext inlineRefConstraint() {
			return getRuleContext(InlineRefConstraintContext.class,0);
		}
		public OutOfLineConstraintContext outOfLineConstraint() {
			return getRuleContext(OutOfLineConstraintContext.class,0);
		}
		public OutOfLineRefConstraintContext outOfLineRefConstraint() {
			return getRuleContext(OutOfLineRefConstraintContext.class,0);
		}
		public ObjectPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectProperty; }
	}

	public final ObjectPropertyContext objectProperty() throws RecognitionException {
		ObjectPropertyContext _localctx = new ObjectPropertyContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_objectProperty);
		int _la;
		try {
			setState(889);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(870);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
				case 1:
					{
					setState(868);
					columnName();
					}
					break;
				case 2:
					{
					setState(869);
					attributeName();
					}
					break;
				}
				setState(874);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DEFAULT) {
					{
					setState(872);
					match(DEFAULT);
					setState(873);
					expr(0);
					}
				}

				setState(885);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
				case 1:
					{
					setState(879);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (((((_la - 21)) & ~0x3f) == 0 && ((1L << (_la - 21)) & ((1L << (KEY - 21)) | (1L << (NOT - 21)) | (1L << (NULL - 21)) | (1L << (PRIMARY - 21)) | (1L << (CHECK - 21)) | (1L << (CONSTRAINT - 21)) | (1L << (REFERENCES - 21)) | (1L << (UNIQUE - 21)))) != 0)) {
						{
						{
						setState(876);
						inlineConstraint();
						}
						}
						setState(881);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(883);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (((((_la - 40)) & ~0x3f) == 0 && ((1L << (_la - 40)) & ((1L << (WITH - 40)) | (1L << (CONSTRAINT - 40)) | (1L << (REFERENCES - 40)))) != 0) || _la==SCOPE) {
						{
						setState(882);
						inlineRefConstraint();
						}
					}

					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(887);
				outOfLineConstraint();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(888);
				outOfLineRefConstraint();
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

	public static class ColumnPropertiesContext extends ParserRuleContext {
		public List<ColumnPropertyContext> columnProperty() {
			return getRuleContexts(ColumnPropertyContext.class);
		}
		public ColumnPropertyContext columnProperty(int i) {
			return getRuleContext(ColumnPropertyContext.class,i);
		}
		public ColumnPropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnProperties; }
	}

	public final ColumnPropertiesContext columnProperties() throws RecognitionException {
		ColumnPropertiesContext _localctx = new ColumnPropertiesContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_columnProperties);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(892); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(891);
				columnProperty();
				}
				}
				setState(894); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==COLUMN );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnPropertyContext extends ParserRuleContext {
		public ObjectTypeColPropertiesContext objectTypeColProperties() {
			return getRuleContext(ObjectTypeColPropertiesContext.class,0);
		}
		public ColumnPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnProperty; }
	}

	public final ColumnPropertyContext columnProperty() throws RecognitionException {
		ColumnPropertyContext _localctx = new ColumnPropertyContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_columnProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(896);
			objectTypeColProperties();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObjectTypeColPropertiesContext extends ParserRuleContext {
		public TerminalNode COLUMN() { return getToken(OracleStatementParser.COLUMN, 0); }
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public SubstitutableColumnClauseContext substitutableColumnClause() {
			return getRuleContext(SubstitutableColumnClauseContext.class,0);
		}
		public ObjectTypeColPropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectTypeColProperties; }
	}

	public final ObjectTypeColPropertiesContext objectTypeColProperties() throws RecognitionException {
		ObjectTypeColPropertiesContext _localctx = new ObjectTypeColPropertiesContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_objectTypeColProperties);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(898);
			match(COLUMN);
			setState(899);
			columnName();
			setState(900);
			substitutableColumnClause();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubstitutableColumnClauseContext extends ParserRuleContext {
		public TerminalNode IS() { return getToken(OracleStatementParser.IS, 0); }
		public TerminalNode OF() { return getToken(OracleStatementParser.OF, 0); }
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public DataTypeName_Context dataTypeName_() {
			return getRuleContext(DataTypeName_Context.class,0);
		}
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public TerminalNode ELEMENT() { return getToken(OracleStatementParser.ELEMENT, 0); }
		public TerminalNode TYPE() { return getToken(OracleStatementParser.TYPE, 0); }
		public TerminalNode ONLY() { return getToken(OracleStatementParser.ONLY, 0); }
		public TerminalNode SUBSTITUTABLE() { return getToken(OracleStatementParser.SUBSTITUTABLE, 0); }
		public TerminalNode AT() { return getToken(OracleStatementParser.AT, 0); }
		public TerminalNode ALL() { return getToken(OracleStatementParser.ALL, 0); }
		public TerminalNode LEVELS() { return getToken(OracleStatementParser.LEVELS, 0); }
		public TerminalNode NOT() { return getToken(OracleStatementParser.NOT, 0); }
		public SubstitutableColumnClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_substitutableColumnClause; }
	}

	public final SubstitutableColumnClauseContext substitutableColumnClause() throws RecognitionException {
		SubstitutableColumnClauseContext _localctx = new SubstitutableColumnClauseContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_substitutableColumnClause);
		int _la;
		try {
			setState(924);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IS:
			case ELEMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(903);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELEMENT) {
					{
					setState(902);
					match(ELEMENT);
					}
				}

				setState(905);
				match(IS);
				setState(906);
				match(OF);
				setState(908);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TYPE) {
					{
					setState(907);
					match(TYPE);
					}
				}

				setState(910);
				match(LP_);
				setState(912);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ONLY) {
					{
					setState(911);
					match(ONLY);
					}
				}

				setState(914);
				dataTypeName_();
				setState(915);
				match(RP_);
				}
				break;
			case NOT:
			case SUBSTITUTABLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(918);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(917);
					match(NOT);
					}
				}

				setState(920);
				match(SUBSTITUTABLE);
				setState(921);
				match(AT);
				setState(922);
				match(ALL);
				setState(923);
				match(LEVELS);
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

	public static class CreateIndexContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(OracleStatementParser.CREATE, 0); }
		public TerminalNode INDEX() { return getToken(OracleStatementParser.INDEX, 0); }
		public IndexNameContext indexName() {
			return getRuleContext(IndexNameContext.class,0);
		}
		public TerminalNode ON() { return getToken(OracleStatementParser.ON, 0); }
		public TableIndexClause_Context tableIndexClause_() {
			return getRuleContext(TableIndexClause_Context.class,0);
		}
		public BitmapJoinIndexClause_Context bitmapJoinIndexClause_() {
			return getRuleContext(BitmapJoinIndexClause_Context.class,0);
		}
		public TerminalNode UNIQUE() { return getToken(OracleStatementParser.UNIQUE, 0); }
		public TerminalNode BITMAP() { return getToken(OracleStatementParser.BITMAP, 0); }
		public CreateIndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createIndex; }
	}

	public final CreateIndexContext createIndex() throws RecognitionException {
		CreateIndexContext _localctx = new CreateIndexContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_createIndex);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(926);
			match(CREATE);
			setState(928);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==UNIQUE || _la==BITMAP) {
				{
				setState(927);
				_la = _input.LA(1);
				if ( !(_la==UNIQUE || _la==BITMAP) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(930);
			match(INDEX);
			setState(931);
			indexName();
			setState(932);
			match(ON);
			setState(935);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
			case 1:
				{
				setState(933);
				tableIndexClause_();
				}
				break;
			case 2:
				{
				setState(934);
				bitmapJoinIndexClause_();
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

	public static class TableIndexClause_Context extends ParserRuleContext {
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public List<IndexExpr_Context> indexExpr_() {
			return getRuleContexts(IndexExpr_Context.class);
		}
		public IndexExpr_Context indexExpr_(int i) {
			return getRuleContext(IndexExpr_Context.class,i);
		}
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public List<TerminalNode> COMMA_() { return getTokens(OracleStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(OracleStatementParser.COMMA_, i);
		}
		public TableIndexClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableIndexClause_; }
	}

	public final TableIndexClause_Context tableIndexClause_() throws RecognitionException {
		TableIndexClause_Context _localctx = new TableIndexClause_Context(_ctx, getState());
		enterRule(_localctx, 122, RULE_tableIndexClause_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(937);
			tableName();
			setState(939);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER_) {
				{
				setState(938);
				alias();
				}
			}

			setState(941);
			match(LP_);
			setState(942);
			indexExpr_();
			setState(947);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(943);
				match(COMMA_);
				setState(944);
				indexExpr_();
				}
				}
				setState(949);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(950);
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

	public static class IndexExpr_Context extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ASC() { return getToken(OracleStatementParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(OracleStatementParser.DESC, 0); }
		public IndexExpr_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexExpr_; }
	}

	public final IndexExpr_Context indexExpr_() throws RecognitionException {
		IndexExpr_Context _localctx = new IndexExpr_Context(_ctx, getState());
		enterRule(_localctx, 124, RULE_indexExpr_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(954);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				{
				setState(952);
				columnName();
				}
				break;
			case 2:
				{
				setState(953);
				expr(0);
				}
				break;
			}
			setState(957);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(956);
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

	public static class BitmapJoinIndexClause_Context extends ParserRuleContext {
		public List<TableNameContext> tableName() {
			return getRuleContexts(TableNameContext.class);
		}
		public TableNameContext tableName(int i) {
			return getRuleContext(TableNameContext.class,i);
		}
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public List<ColumnSortClause_Context> columnSortClause_() {
			return getRuleContexts(ColumnSortClause_Context.class);
		}
		public ColumnSortClause_Context columnSortClause_(int i) {
			return getRuleContext(ColumnSortClause_Context.class,i);
		}
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public TerminalNode FROM() { return getToken(OracleStatementParser.FROM, 0); }
		public TerminalNode WHERE() { return getToken(OracleStatementParser.WHERE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> COMMA_() { return getTokens(OracleStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(OracleStatementParser.COMMA_, i);
		}
		public List<AliasContext> alias() {
			return getRuleContexts(AliasContext.class);
		}
		public AliasContext alias(int i) {
			return getRuleContext(AliasContext.class,i);
		}
		public BitmapJoinIndexClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitmapJoinIndexClause_; }
	}

	public final BitmapJoinIndexClause_Context bitmapJoinIndexClause_() throws RecognitionException {
		BitmapJoinIndexClause_Context _localctx = new BitmapJoinIndexClause_Context(_ctx, getState());
		enterRule(_localctx, 126, RULE_bitmapJoinIndexClause_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(959);
			tableName();
			setState(960);
			match(LP_);
			setState(961);
			columnSortClause_();
			setState(966);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(962);
				match(COMMA_);
				setState(963);
				columnSortClause_();
				}
				}
				setState(968);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(969);
			match(RP_);
			setState(970);
			match(FROM);
			setState(971);
			tableName();
			setState(973);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER_) {
				{
				setState(972);
				alias();
				}
			}

			setState(982);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(975);
				match(COMMA_);
				setState(976);
				tableName();
				setState(978);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER_) {
					{
					setState(977);
					alias();
					}
				}

				}
				}
				setState(984);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(985);
			match(WHERE);
			setState(986);
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

	public static class ColumnSortClause_Context extends ParserRuleContext {
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public TerminalNode ASC() { return getToken(OracleStatementParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(OracleStatementParser.DESC, 0); }
		public ColumnSortClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnSortClause_; }
	}

	public final ColumnSortClause_Context columnSortClause_() throws RecognitionException {
		ColumnSortClause_Context _localctx = new ColumnSortClause_Context(_ctx, getState());
		enterRule(_localctx, 128, RULE_columnSortClause_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(988);
			tableName();
			setState(990);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
			case 1:
				{
				setState(989);
				alias();
				}
				break;
			}
			setState(992);
			columnName();
			setState(994);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(993);
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

	public static class DropIndexContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(OracleStatementParser.DROP, 0); }
		public TerminalNode INDEX() { return getToken(OracleStatementParser.INDEX, 0); }
		public IndexNameContext indexName() {
			return getRuleContext(IndexNameContext.class,0);
		}
		public DropIndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropIndex; }
	}

	public final DropIndexContext dropIndex() throws RecognitionException {
		DropIndexContext _localctx = new DropIndexContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_dropIndex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(996);
			match(DROP);
			setState(997);
			match(INDEX);
			setState(998);
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

	public static class AlterIndexContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(OracleStatementParser.ALTER, 0); }
		public TerminalNode INDEX() { return getToken(OracleStatementParser.INDEX, 0); }
		public List<IndexNameContext> indexName() {
			return getRuleContexts(IndexNameContext.class);
		}
		public IndexNameContext indexName(int i) {
			return getRuleContext(IndexNameContext.class,i);
		}
		public TerminalNode RENAME() { return getToken(OracleStatementParser.RENAME, 0); }
		public TerminalNode TO() { return getToken(OracleStatementParser.TO, 0); }
		public AlterIndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterIndex; }
	}

	public final AlterIndexContext alterIndex() throws RecognitionException {
		AlterIndexContext _localctx = new AlterIndexContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_alterIndex);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1000);
			match(ALTER);
			setState(1001);
			match(INDEX);
			setState(1002);
			indexName();
			setState(1006);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RENAME) {
				{
				setState(1003);
				match(RENAME);
				setState(1004);
				match(TO);
				setState(1005);
				indexName();
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
		public TerminalNode IDENTIFIER_() { return getToken(OracleStatementParser.IDENTIFIER_, 0); }
		public SchemaNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_schemaName; }
	}

	public final SchemaNameContext schemaName() throws RecognitionException {
		SchemaNameContext _localctx = new SchemaNameContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_schemaName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1008);
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
		public OracleIdContext oracleId() {
			return getRuleContext(OracleIdContext.class,0);
		}
		public TableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableName; }
	}

	public final TableNameContext tableName() throws RecognitionException {
		TableNameContext _localctx = new TableNameContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_tableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1010);
			oracleId();
			}
		}
		catch (RecognitionException re) {
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
		public OracleIdContext oracleId() {
			return getRuleContext(OracleIdContext.class,0);
		}
		public ColumnNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnName; }
	}

	public final ColumnNameContext columnName() throws RecognitionException {
		ColumnNameContext _localctx = new ColumnNameContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_columnName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1012);
			oracleId();
			}
		}
		catch (RecognitionException re) {
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
		public OracleIdContext oracleId() {
			return getRuleContext(OracleIdContext.class,0);
		}
		public IndexNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexName; }
	}

	public final IndexNameContext indexName() throws RecognitionException {
		IndexNameContext _localctx = new IndexNameContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_indexName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1014);
			oracleId();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OracleIdContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER_() { return getToken(OracleStatementParser.IDENTIFIER_, 0); }
		public List<TerminalNode> STRING_() { return getTokens(OracleStatementParser.STRING_); }
		public TerminalNode STRING_(int i) {
			return getToken(OracleStatementParser.STRING_, i);
		}
		public List<TerminalNode> DOT_() { return getTokens(OracleStatementParser.DOT_); }
		public TerminalNode DOT_(int i) {
			return getToken(OracleStatementParser.DOT_, i);
		}
		public OracleIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oracleId; }
	}

	public final OracleIdContext oracleId() throws RecognitionException {
		OracleIdContext _localctx = new OracleIdContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_oracleId);
		try {
			int _alt;
			setState(1025);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER_:
				enterOuterAlt(_localctx, 1);
				{
				setState(1016);
				match(IDENTIFIER_);
				}
				break;
			case STRING_:
				enterOuterAlt(_localctx, 2);
				{
				setState(1021);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,117,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1017);
						match(STRING_);
						setState(1018);
						match(DOT_);
						}
						} 
					}
					setState(1023);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,117,_ctx);
				}
				setState(1024);
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

	public static class CollationNameContext extends ParserRuleContext {
		public TerminalNode STRING_() { return getToken(OracleStatementParser.STRING_, 0); }
		public TerminalNode IDENTIFIER_() { return getToken(OracleStatementParser.IDENTIFIER_, 0); }
		public CollationNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collationName; }
	}

	public final CollationNameContext collationName() throws RecognitionException {
		CollationNameContext _localctx = new CollationNameContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_collationName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1027);
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

	public static class AliasContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER_() { return getToken(OracleStatementParser.IDENTIFIER_, 0); }
		public AliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alias; }
	}

	public final AliasContext alias() throws RecognitionException {
		AliasContext _localctx = new AliasContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1029);
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
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public List<TerminalNode> NUMBER_() { return getTokens(OracleStatementParser.NUMBER_); }
		public TerminalNode NUMBER_(int i) {
			return getToken(OracleStatementParser.NUMBER_, i);
		}
		public TerminalNode COMMA_() { return getToken(OracleStatementParser.COMMA_, 0); }
		public DataTypeLengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataTypeLength; }
	}

	public final DataTypeLengthContext dataTypeLength() throws RecognitionException {
		DataTypeLengthContext _localctx = new DataTypeLengthContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_dataTypeLength);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1031);
			match(LP_);
			setState(1037);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NUMBER_) {
				{
				setState(1032);
				match(NUMBER_);
				setState(1035);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA_) {
					{
					setState(1033);
					match(COMMA_);
					setState(1034);
					match(NUMBER_);
					}
				}

				}
			}

			setState(1039);
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
		public TerminalNode KEY() { return getToken(OracleStatementParser.KEY, 0); }
		public TerminalNode PRIMARY() { return getToken(OracleStatementParser.PRIMARY, 0); }
		public PrimaryKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryKey; }
	}

	public final PrimaryKeyContext primaryKey() throws RecognitionException {
		PrimaryKeyContext _localctx = new PrimaryKeyContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_primaryKey);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1042);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PRIMARY) {
				{
				setState(1041);
				match(PRIMARY);
				}
			}

			setState(1044);
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
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public List<ColumnNameContext> columnName() {
			return getRuleContexts(ColumnNameContext.class);
		}
		public ColumnNameContext columnName(int i) {
			return getRuleContext(ColumnNameContext.class,i);
		}
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(OracleStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(OracleStatementParser.COMMA_, i);
		}
		public ColumnNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnNames; }
	}

	public final ColumnNamesContext columnNames() throws RecognitionException {
		ColumnNamesContext _localctx = new ColumnNamesContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_columnNames);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1046);
			match(LP_);
			setState(1047);
			columnName();
			setState(1052);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(1048);
				match(COMMA_);
				setState(1049);
				columnName();
				}
				}
				setState(1054);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1055);
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
		public List<TerminalNode> COMMA_() { return getTokens(OracleStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(OracleStatementParser.COMMA_, i);
		}
		public ExprsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprs; }
	}

	public final ExprsContext exprs() throws RecognitionException {
		ExprsContext _localctx = new ExprsContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_exprs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1057);
			expr(0);
			setState(1062);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(1058);
				match(COMMA_);
				setState(1059);
				expr(0);
				}
				}
				setState(1064);
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
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public ExprsContext exprs() {
			return getRuleContext(ExprsContext.class,0);
		}
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public ExprListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprList; }
	}

	public final ExprListContext exprList() throws RecognitionException {
		ExprListContext _localctx = new ExprListContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_exprList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1065);
			match(LP_);
			setState(1066);
			exprs();
			setState(1067);
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
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public TerminalNode NOT() { return getToken(OracleStatementParser.NOT, 0); }
		public TerminalNode NOT_() { return getToken(OracleStatementParser.NOT_, 0); }
		public BooleanPrimaryContext booleanPrimary() {
			return getRuleContext(BooleanPrimaryContext.class,0);
		}
		public ExprRecursiveContext exprRecursive() {
			return getRuleContext(ExprRecursiveContext.class,0);
		}
		public TerminalNode AND() { return getToken(OracleStatementParser.AND, 0); }
		public TerminalNode AND_() { return getToken(OracleStatementParser.AND_, 0); }
		public TerminalNode XOR() { return getToken(OracleStatementParser.XOR, 0); }
		public TerminalNode OR() { return getToken(OracleStatementParser.OR, 0); }
		public TerminalNode OR_() { return getToken(OracleStatementParser.OR_, 0); }
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
		int _startState = 158;
		enterRecursionRule(_localctx, 158, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1080);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
			case 1:
				{
				setState(1070);
				match(LP_);
				setState(1071);
				expr(0);
				setState(1072);
				match(RP_);
				}
				break;
			case 2:
				{
				setState(1074);
				match(NOT);
				setState(1075);
				expr(6);
				}
				break;
			case 3:
				{
				setState(1076);
				match(NOT_);
				setState(1077);
				expr(5);
				}
				break;
			case 4:
				{
				setState(1078);
				booleanPrimary(0);
				}
				break;
			case 5:
				{
				setState(1079);
				exprRecursive();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1099);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,126,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1097);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1082);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1083);
						match(AND);
						setState(1084);
						expr(11);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1085);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1086);
						match(AND_);
						setState(1087);
						expr(10);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1088);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1089);
						match(XOR);
						setState(1090);
						expr(9);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1091);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1092);
						match(OR);
						setState(1093);
						expr(5);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1094);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1095);
						match(OR_);
						setState(1096);
						expr(4);
						}
						break;
					}
					} 
				}
				setState(1101);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,126,_ctx);
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
		public TerminalNode PRIOR() { return getToken(OracleStatementParser.PRIOR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprRecursiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprRecursive; }
	}

	public final ExprRecursiveContext exprRecursive() throws RecognitionException {
		ExprRecursiveContext _localctx = new ExprRecursiveContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_exprRecursive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1102);
			match(PRIOR);
			setState(1103);
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

	public static class BooleanPrimaryContext extends ParserRuleContext {
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public BooleanPrimaryContext booleanPrimary() {
			return getRuleContext(BooleanPrimaryContext.class,0);
		}
		public TerminalNode IS() { return getToken(OracleStatementParser.IS, 0); }
		public TerminalNode TRUE() { return getToken(OracleStatementParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(OracleStatementParser.FALSE, 0); }
		public TerminalNode UNKNOWN() { return getToken(OracleStatementParser.UNKNOWN, 0); }
		public TerminalNode NULL() { return getToken(OracleStatementParser.NULL, 0); }
		public TerminalNode NOT() { return getToken(OracleStatementParser.NOT, 0); }
		public TerminalNode SAFE_EQ_() { return getToken(OracleStatementParser.SAFE_EQ_, 0); }
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public TerminalNode ALL() { return getToken(OracleStatementParser.ALL, 0); }
		public TerminalNode ANY() { return getToken(OracleStatementParser.ANY, 0); }
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
		int _startState = 162;
		enterRecursionRule(_localctx, 162, RULE_booleanPrimary, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1106);
			predicate();
			}
			_ctx.stop = _input.LT(-1);
			setState(1128);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,129,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1126);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
					case 1:
						{
						_localctx = new BooleanPrimaryContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_booleanPrimary);
						setState(1108);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1109);
						match(IS);
						setState(1111);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(1110);
							match(NOT);
							}
						}

						setState(1113);
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
						setState(1114);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1115);
						match(SAFE_EQ_);
						setState(1116);
						predicate();
						}
						break;
					case 3:
						{
						_localctx = new BooleanPrimaryContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_booleanPrimary);
						setState(1117);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1118);
						comparisonOperator();
						setState(1119);
						predicate();
						}
						break;
					case 4:
						{
						_localctx = new BooleanPrimaryContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_booleanPrimary);
						setState(1121);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1122);
						comparisonOperator();
						setState(1123);
						_la = _input.LA(1);
						if ( !(_la==ALL || _la==ANY) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1124);
						subquery();
						}
						break;
					}
					} 
				}
				setState(1130);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,129,_ctx);
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
		public TerminalNode EQ_() { return getToken(OracleStatementParser.EQ_, 0); }
		public TerminalNode GTE_() { return getToken(OracleStatementParser.GTE_, 0); }
		public TerminalNode GT_() { return getToken(OracleStatementParser.GT_, 0); }
		public TerminalNode LTE_() { return getToken(OracleStatementParser.LTE_, 0); }
		public TerminalNode LT_() { return getToken(OracleStatementParser.LT_, 0); }
		public TerminalNode NEQ_() { return getToken(OracleStatementParser.NEQ_, 0); }
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1131);
			_la = _input.LA(1);
			if ( !(((((_la - 201)) & ~0x3f) == 0 && ((1L << (_la - 201)) & ((1L << (EQ_ - 201)) | (1L << (NEQ_ - 201)) | (1L << (GT_ - 201)) | (1L << (GTE_ - 201)) | (1L << (LT_ - 201)) | (1L << (LTE_ - 201)))) != 0)) ) {
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
		public TerminalNode IN() { return getToken(OracleStatementParser.IN, 0); }
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public TerminalNode NOT() { return getToken(OracleStatementParser.NOT, 0); }
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public List<SimpleExprContext> simpleExpr() {
			return getRuleContexts(SimpleExprContext.class);
		}
		public SimpleExprContext simpleExpr(int i) {
			return getRuleContext(SimpleExprContext.class,i);
		}
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(OracleStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(OracleStatementParser.COMMA_, i);
		}
		public TerminalNode BETWEEN() { return getToken(OracleStatementParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(OracleStatementParser.AND, 0); }
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public TerminalNode SOUNDS() { return getToken(OracleStatementParser.SOUNDS, 0); }
		public TerminalNode LIKE() { return getToken(OracleStatementParser.LIKE, 0); }
		public List<TerminalNode> ESCAPE() { return getTokens(OracleStatementParser.ESCAPE); }
		public TerminalNode ESCAPE(int i) {
			return getToken(OracleStatementParser.ESCAPE, i);
		}
		public TerminalNode REGEXP() { return getToken(OracleStatementParser.REGEXP, 0); }
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_predicate);
		int _la;
		try {
			int _alt;
			setState(1191);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1133);
				bitExpr(0);
				setState(1135);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1134);
					match(NOT);
					}
				}

				setState(1137);
				match(IN);
				setState(1138);
				subquery();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1140);
				bitExpr(0);
				setState(1142);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1141);
					match(NOT);
					}
				}

				setState(1144);
				match(IN);
				setState(1145);
				match(LP_);
				setState(1146);
				simpleExpr(0);
				setState(1151);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(1147);
					match(COMMA_);
					setState(1148);
					simpleExpr(0);
					}
					}
					setState(1153);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1154);
				match(RP_);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1156);
				bitExpr(0);
				setState(1158);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1157);
					match(NOT);
					}
				}

				setState(1160);
				match(BETWEEN);
				setState(1161);
				simpleExpr(0);
				setState(1162);
				match(AND);
				setState(1163);
				predicate();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1165);
				bitExpr(0);
				setState(1166);
				match(SOUNDS);
				setState(1167);
				match(LIKE);
				setState(1168);
				simpleExpr(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1170);
				bitExpr(0);
				setState(1172);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1171);
					match(NOT);
					}
				}

				setState(1174);
				match(LIKE);
				setState(1175);
				simpleExpr(0);
				setState(1180);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,135,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1176);
						match(ESCAPE);
						setState(1177);
						simpleExpr(0);
						}
						} 
					}
					setState(1182);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,135,_ctx);
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1183);
				bitExpr(0);
				setState(1185);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1184);
					match(NOT);
					}
				}

				setState(1187);
				match(REGEXP);
				setState(1188);
				simpleExpr(0);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1190);
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
		public TerminalNode VERTICAL_BAR_() { return getToken(OracleStatementParser.VERTICAL_BAR_, 0); }
		public TerminalNode AMPERSAND_() { return getToken(OracleStatementParser.AMPERSAND_, 0); }
		public TerminalNode SIGNED_LEFT_SHIFT_() { return getToken(OracleStatementParser.SIGNED_LEFT_SHIFT_, 0); }
		public TerminalNode SIGNED_RIGHT_SHIFT_() { return getToken(OracleStatementParser.SIGNED_RIGHT_SHIFT_, 0); }
		public TerminalNode PLUS_() { return getToken(OracleStatementParser.PLUS_, 0); }
		public TerminalNode MINUS_() { return getToken(OracleStatementParser.MINUS_, 0); }
		public TerminalNode ASTERISK_() { return getToken(OracleStatementParser.ASTERISK_, 0); }
		public TerminalNode SLASH_() { return getToken(OracleStatementParser.SLASH_, 0); }
		public TerminalNode MOD() { return getToken(OracleStatementParser.MOD, 0); }
		public TerminalNode MOD_() { return getToken(OracleStatementParser.MOD_, 0); }
		public TerminalNode CARET_() { return getToken(OracleStatementParser.CARET_, 0); }
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
		int _startState = 168;
		enterRecursionRule(_localctx, 168, RULE_bitExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1194);
			simpleExpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(1237);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,139,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1235);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
					case 1:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1196);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1197);
						match(VERTICAL_BAR_);
						setState(1198);
						bitExpr(15);
						}
						break;
					case 2:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1199);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1200);
						match(AMPERSAND_);
						setState(1201);
						bitExpr(14);
						}
						break;
					case 3:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1202);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1203);
						match(SIGNED_LEFT_SHIFT_);
						setState(1204);
						bitExpr(13);
						}
						break;
					case 4:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1205);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1206);
						match(SIGNED_RIGHT_SHIFT_);
						setState(1207);
						bitExpr(12);
						}
						break;
					case 5:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1208);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1209);
						match(PLUS_);
						setState(1210);
						bitExpr(11);
						}
						break;
					case 6:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1211);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1212);
						match(MINUS_);
						setState(1213);
						bitExpr(10);
						}
						break;
					case 7:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1214);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1215);
						match(ASTERISK_);
						setState(1216);
						bitExpr(9);
						}
						break;
					case 8:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1217);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1218);
						match(SLASH_);
						setState(1219);
						bitExpr(8);
						}
						break;
					case 9:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1220);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1221);
						match(MOD);
						setState(1222);
						bitExpr(7);
						}
						break;
					case 10:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1223);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1224);
						match(MOD_);
						setState(1225);
						bitExpr(6);
						}
						break;
					case 11:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1226);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1227);
						match(CARET_);
						setState(1228);
						bitExpr(5);
						}
						break;
					case 12:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1229);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1230);
						match(PLUS_);
						setState(1231);
						intervalExpr();
						}
						break;
					case 13:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1232);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1233);
						match(MINUS_);
						setState(1234);
						intervalExpr();
						}
						break;
					}
					} 
				}
				setState(1239);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,139,_ctx);
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
		public TerminalNode PLUS_() { return getToken(OracleStatementParser.PLUS_, 0); }
		public List<SimpleExprContext> simpleExpr() {
			return getRuleContexts(SimpleExprContext.class);
		}
		public SimpleExprContext simpleExpr(int i) {
			return getRuleContext(SimpleExprContext.class,i);
		}
		public TerminalNode MINUS_() { return getToken(OracleStatementParser.MINUS_, 0); }
		public TerminalNode TILDE_() { return getToken(OracleStatementParser.TILDE_, 0); }
		public TerminalNode NOT_() { return getToken(OracleStatementParser.NOT_, 0); }
		public TerminalNode BINARY() { return getToken(OracleStatementParser.BINARY, 0); }
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public TerminalNode ROW() { return getToken(OracleStatementParser.ROW, 0); }
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public TerminalNode EXISTS() { return getToken(OracleStatementParser.EXISTS, 0); }
		public CaseExpressContext caseExpress() {
			return getRuleContext(CaseExpressContext.class,0);
		}
		public IntervalExprContext intervalExpr() {
			return getRuleContext(IntervalExprContext.class,0);
		}
		public PrivateExprOfDbContext privateExprOfDb() {
			return getRuleContext(PrivateExprOfDbContext.class,0);
		}
		public TerminalNode AND_() { return getToken(OracleStatementParser.AND_, 0); }
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
		int _startState = 170;
		enterRecursionRule(_localctx, 170, RULE_simpleExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1264);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
			case 1:
				{
				setState(1241);
				functionCall();
				}
				break;
			case 2:
				{
				setState(1242);
				literal();
				}
				break;
			case 3:
				{
				setState(1243);
				columnName();
				}
				break;
			case 4:
				{
				setState(1244);
				variable();
				}
				break;
			case 5:
				{
				setState(1245);
				match(PLUS_);
				setState(1246);
				simpleExpr(12);
				}
				break;
			case 6:
				{
				setState(1247);
				match(MINUS_);
				setState(1248);
				simpleExpr(11);
				}
				break;
			case 7:
				{
				setState(1249);
				match(TILDE_);
				setState(1250);
				simpleExpr(10);
				}
				break;
			case 8:
				{
				setState(1251);
				match(NOT_);
				setState(1252);
				simpleExpr(9);
				}
				break;
			case 9:
				{
				setState(1253);
				match(BINARY);
				setState(1254);
				simpleExpr(8);
				}
				break;
			case 10:
				{
				setState(1255);
				exprList();
				}
				break;
			case 11:
				{
				setState(1256);
				match(ROW);
				setState(1257);
				exprList();
				}
				break;
			case 12:
				{
				setState(1258);
				subquery();
				}
				break;
			case 13:
				{
				setState(1259);
				match(EXISTS);
				setState(1260);
				subquery();
				}
				break;
			case 14:
				{
				setState(1261);
				caseExpress();
				}
				break;
			case 15:
				{
				setState(1262);
				intervalExpr();
				}
				break;
			case 16:
				{
				setState(1263);
				privateExprOfDb();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1273);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,142,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1271);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
					case 1:
						{
						_localctx = new SimpleExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_simpleExpr);
						setState(1266);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1267);
						match(AND_);
						setState(1268);
						simpleExpr(14);
						}
						break;
					case 2:
						{
						_localctx = new SimpleExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_simpleExpr);
						setState(1269);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(1270);
						collateClause();
						}
						break;
					}
					} 
				}
				setState(1275);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,142,_ctx);
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
		public TerminalNode IDENTIFIER_() { return getToken(OracleStatementParser.IDENTIFIER_, 0); }
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public DistinctContext distinct() {
			return getRuleContext(DistinctContext.class,0);
		}
		public ExprsContext exprs() {
			return getRuleContext(ExprsContext.class,0);
		}
		public TerminalNode ASTERISK_() { return getToken(OracleStatementParser.ASTERISK_, 0); }
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1276);
			match(IDENTIFIER_);
			setState(1277);
			match(LP_);
			setState(1279);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DISTINCT) {
				{
				setState(1278);
				distinct();
				}
			}

			setState(1283);
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
			case CASE:
			case NEW:
			case PRIOR:
			case TREAT:
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
				setState(1281);
				exprs();
				}
				break;
			case ASTERISK_:
				{
				setState(1282);
				match(ASTERISK_);
				}
				break;
			case RP_:
				break;
			default:
				break;
			}
			setState(1285);
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
		public TerminalNode DISTINCT() { return getToken(OracleStatementParser.DISTINCT, 0); }
		public DistinctContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_distinct; }
	}

	public final DistinctContext distinct() throws RecognitionException {
		DistinctContext _localctx = new DistinctContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_distinct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1287);
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
		enterRule(_localctx, 176, RULE_intervalExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1289);
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
		enterRule(_localctx, 178, RULE_caseExpress);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1291);
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
		public TreatFunctionContext treatFunction() {
			return getRuleContext(TreatFunctionContext.class,0);
		}
		public CaseExprContext caseExpr() {
			return getRuleContext(CaseExprContext.class,0);
		}
		public IntervalExpressionContext intervalExpression() {
			return getRuleContext(IntervalExpressionContext.class,0);
		}
		public ObjectAccessExpressionContext objectAccessExpression() {
			return getRuleContext(ObjectAccessExpressionContext.class,0);
		}
		public ConstructorExprContext constructorExpr() {
			return getRuleContext(ConstructorExprContext.class,0);
		}
		public PrivateExprOfDbContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_privateExprOfDb; }
	}

	public final PrivateExprOfDbContext privateExprOfDb() throws RecognitionException {
		PrivateExprOfDbContext _localctx = new PrivateExprOfDbContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_privateExprOfDb);
		try {
			setState(1298);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1293);
				treatFunction();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1294);
				caseExpr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1295);
				intervalExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1296);
				objectAccessExpression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1297);
				constructorExpr();
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
		enterRule(_localctx, 182, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1300);
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
		public TerminalNode TRUE() { return getToken(OracleStatementParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(OracleStatementParser.FALSE, 0); }
		public TerminalNode NULL() { return getToken(OracleStatementParser.NULL, 0); }
		public TerminalNode LBE_() { return getToken(OracleStatementParser.LBE_, 0); }
		public TerminalNode IDENTIFIER_() { return getToken(OracleStatementParser.IDENTIFIER_, 0); }
		public TerminalNode STRING_() { return getToken(OracleStatementParser.STRING_, 0); }
		public TerminalNode RBE_() { return getToken(OracleStatementParser.RBE_, 0); }
		public TerminalNode HEX_DIGIT_() { return getToken(OracleStatementParser.HEX_DIGIT_, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public CollateClauseContext collateClause() {
			return getRuleContext(CollateClauseContext.class,0);
		}
		public TerminalNode DATE() { return getToken(OracleStatementParser.DATE, 0); }
		public TerminalNode TIME() { return getToken(OracleStatementParser.TIME, 0); }
		public TerminalNode TIMESTAMP() { return getToken(OracleStatementParser.TIMESTAMP, 0); }
		public TerminalNode BIT_NUM_() { return getToken(OracleStatementParser.BIT_NUM_, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_literal);
		int _la;
		try {
			setState(1327);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1302);
				question();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1303);
				number();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1304);
				match(TRUE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1305);
				match(FALSE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1306);
				match(NULL);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1307);
				match(LBE_);
				setState(1308);
				match(IDENTIFIER_);
				setState(1309);
				match(STRING_);
				setState(1310);
				match(RBE_);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1311);
				match(HEX_DIGIT_);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1312);
				string();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1313);
				match(IDENTIFIER_);
				setState(1314);
				match(STRING_);
				setState(1316);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
				case 1:
					{
					setState(1315);
					collateClause();
					}
					break;
				}
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1318);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DATE) | (1L << TIME) | (1L << TIMESTAMP))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1319);
				match(STRING_);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1321);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER_) {
					{
					setState(1320);
					match(IDENTIFIER_);
					}
				}

				setState(1323);
				match(BIT_NUM_);
				setState(1325);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
				case 1:
					{
					setState(1324);
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
		public TerminalNode QUESTION_() { return getToken(OracleStatementParser.QUESTION_, 0); }
		public QuestionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_question; }
	}

	public final QuestionContext question() throws RecognitionException {
		QuestionContext _localctx = new QuestionContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_question);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1329);
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
		public TerminalNode NUMBER_() { return getToken(OracleStatementParser.NUMBER_, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1331);
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
		public TerminalNode STRING_() { return getToken(OracleStatementParser.STRING_, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1333);
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
		enterRule(_localctx, 192, RULE_subquery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1335);
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
		public MatchNoneContext matchNone() {
			return getRuleContext(MatchNoneContext.class,0);
		}
		public CollateClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collateClause; }
	}

	public final CollateClauseContext collateClause() throws RecognitionException {
		CollateClauseContext _localctx = new CollateClauseContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_collateClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1337);
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

	public static class OrderByClauseContext extends ParserRuleContext {
		public TerminalNode ORDER() { return getToken(OracleStatementParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(OracleStatementParser.BY, 0); }
		public List<OrderByItemContext> orderByItem() {
			return getRuleContexts(OrderByItemContext.class);
		}
		public OrderByItemContext orderByItem(int i) {
			return getRuleContext(OrderByItemContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(OracleStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(OracleStatementParser.COMMA_, i);
		}
		public OrderByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderByClause; }
	}

	public final OrderByClauseContext orderByClause() throws RecognitionException {
		OrderByClauseContext _localctx = new OrderByClauseContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_orderByClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1339);
			match(ORDER);
			setState(1340);
			match(BY);
			setState(1341);
			orderByItem();
			setState(1346);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(1342);
				match(COMMA_);
				setState(1343);
				orderByItem();
				}
				}
				setState(1348);
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
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ASC() { return getToken(OracleStatementParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(OracleStatementParser.DESC, 0); }
		public OrderByItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderByItem; }
	}

	public final OrderByItemContext orderByItem() throws RecognitionException {
		OrderByItemContext _localctx = new OrderByItemContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_orderByItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1352);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
			case 1:
				{
				setState(1349);
				columnName();
				}
				break;
			case 2:
				{
				setState(1350);
				number();
				}
				break;
			case 3:
				{
				setState(1351);
				expr(0);
				}
				break;
			}
			setState(1355);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(1354);
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
		public TerminalNode ASTERISK_() { return getToken(OracleStatementParser.ASTERISK_, 0); }
		public AsteriskContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asterisk; }
	}

	public final AsteriskContext asterisk() throws RecognitionException {
		AsteriskContext _localctx = new AsteriskContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_asterisk);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1357);
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

	public static class AttributeNameContext extends ParserRuleContext {
		public OracleIdContext oracleId() {
			return getRuleContext(OracleIdContext.class,0);
		}
		public AttributeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeName; }
	}

	public final AttributeNameContext attributeName() throws RecognitionException {
		AttributeNameContext _localctx = new AttributeNameContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_attributeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1359);
			oracleId();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IndexTypeNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER_() { return getToken(OracleStatementParser.IDENTIFIER_, 0); }
		public IndexTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexTypeName; }
	}

	public final IndexTypeNameContext indexTypeName() throws RecognitionException {
		IndexTypeNameContext _localctx = new IndexTypeNameContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_indexTypeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1361);
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

	public static class SimpleExprsWithParenContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public SimpleExprsContext simpleExprs() {
			return getRuleContext(SimpleExprsContext.class,0);
		}
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public SimpleExprsWithParenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleExprsWithParen; }
	}

	public final SimpleExprsWithParenContext simpleExprsWithParen() throws RecognitionException {
		SimpleExprsWithParenContext _localctx = new SimpleExprsWithParenContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_simpleExprsWithParen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1363);
			match(LP_);
			setState(1364);
			simpleExprs();
			setState(1365);
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

	public static class SimpleExprsContext extends ParserRuleContext {
		public List<SimpleExprContext> simpleExpr() {
			return getRuleContexts(SimpleExprContext.class);
		}
		public SimpleExprContext simpleExpr(int i) {
			return getRuleContext(SimpleExprContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(OracleStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(OracleStatementParser.COMMA_, i);
		}
		public SimpleExprsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleExprs; }
	}

	public final SimpleExprsContext simpleExprs() throws RecognitionException {
		SimpleExprsContext _localctx = new SimpleExprsContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_simpleExprs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1367);
			simpleExpr(0);
			setState(1372);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(1368);
				match(COMMA_);
				setState(1369);
				simpleExpr(0);
				}
				}
				setState(1374);
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

	public static class LobItemContext extends ParserRuleContext {
		public AttributeNameContext attributeName() {
			return getRuleContext(AttributeNameContext.class,0);
		}
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public LobItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lobItem; }
	}

	public final LobItemContext lobItem() throws RecognitionException {
		LobItemContext _localctx = new LobItemContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_lobItem);
		try {
			setState(1377);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,154,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1375);
				attributeName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1376);
				columnName();
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

	public static class LobItemsContext extends ParserRuleContext {
		public List<LobItemContext> lobItem() {
			return getRuleContexts(LobItemContext.class);
		}
		public LobItemContext lobItem(int i) {
			return getRuleContext(LobItemContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(OracleStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(OracleStatementParser.COMMA_, i);
		}
		public LobItemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lobItems; }
	}

	public final LobItemsContext lobItems() throws RecognitionException {
		LobItemsContext _localctx = new LobItemsContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_lobItems);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1379);
			lobItem();
			setState(1384);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(1380);
				match(COMMA_);
				setState(1381);
				lobItem();
				}
				}
				setState(1386);
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

	public static class LobItemListContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public LobItemsContext lobItems() {
			return getRuleContext(LobItemsContext.class,0);
		}
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public LobItemListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lobItemList; }
	}

	public final LobItemListContext lobItemList() throws RecognitionException {
		LobItemListContext _localctx = new LobItemListContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_lobItemList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1387);
			match(LP_);
			setState(1388);
			lobItems();
			setState(1389);
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

	public static class DataTypeContext extends ParserRuleContext {
		public DataTypeName_Context dataTypeName_() {
			return getRuleContext(DataTypeName_Context.class,0);
		}
		public DataTypeLengthContext dataTypeLength() {
			return getRuleContext(DataTypeLengthContext.class,0);
		}
		public SpecialDatatypeContext specialDatatype() {
			return getRuleContext(SpecialDatatypeContext.class,0);
		}
		public DatetimeTypeSuffixContext datetimeTypeSuffix() {
			return getRuleContext(DatetimeTypeSuffixContext.class,0);
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
			setState(1402);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1391);
				dataTypeName_();
				setState(1393);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LP_) {
					{
					setState(1392);
					dataTypeLength();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1395);
				specialDatatype();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1396);
				dataTypeName_();
				setState(1398);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LP_) {
					{
					setState(1397);
					dataTypeLength();
					}
				}

				setState(1400);
				datetimeTypeSuffix();
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

	public static class SpecialDatatypeContext extends ParserRuleContext {
		public DataTypeName_Context dataTypeName_() {
			return getRuleContext(DataTypeName_Context.class,0);
		}
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public TerminalNode NUMBER_() { return getToken(OracleStatementParser.NUMBER_, 0); }
		public TerminalNode IDENTIFIER_() { return getToken(OracleStatementParser.IDENTIFIER_, 0); }
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public TerminalNode NATIONAL() { return getToken(OracleStatementParser.NATIONAL, 0); }
		public TerminalNode VARYING() { return getToken(OracleStatementParser.VARYING, 0); }
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public SpecialDatatypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specialDatatype; }
	}

	public final SpecialDatatypeContext specialDatatype() throws RecognitionException {
		SpecialDatatypeContext _localctx = new SpecialDatatypeContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_specialDatatype);
		int _la;
		try {
			setState(1427);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1404);
				dataTypeName_();
				{
				setState(1405);
				match(LP_);
				setState(1406);
				match(NUMBER_);
				setState(1407);
				match(IDENTIFIER_);
				setState(1408);
				match(RP_);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1410);
				match(NATIONAL);
				setState(1411);
				dataTypeName_();
				setState(1413);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VARYING) {
					{
					setState(1412);
					match(VARYING);
					}
				}

				setState(1415);
				match(LP_);
				setState(1416);
				match(NUMBER_);
				setState(1417);
				match(RP_);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1419);
				dataTypeName_();
				setState(1421);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LP_) {
					{
					setState(1420);
					match(LP_);
					}
				}

				setState(1423);
				columnName();
				setState(1425);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
				case 1:
					{
					setState(1424);
					match(RP_);
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
		public List<TerminalNode> IDENTIFIER_() { return getTokens(OracleStatementParser.IDENTIFIER_); }
		public TerminalNode IDENTIFIER_(int i) {
			return getToken(OracleStatementParser.IDENTIFIER_, i);
		}
		public DataTypeName_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataTypeName_; }
	}

	public final DataTypeName_Context dataTypeName_() throws RecognitionException {
		DataTypeName_Context _localctx = new DataTypeName_Context(_ctx, getState());
		enterRule(_localctx, 220, RULE_dataTypeName_);
		try {
			setState(1432);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1429);
				match(IDENTIFIER_);
				setState(1430);
				match(IDENTIFIER_);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1431);
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

	public static class DatetimeTypeSuffixContext extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(OracleStatementParser.WITH, 0); }
		public TerminalNode TIME() { return getToken(OracleStatementParser.TIME, 0); }
		public TerminalNode ZONE() { return getToken(OracleStatementParser.ZONE, 0); }
		public TerminalNode LOCAL() { return getToken(OracleStatementParser.LOCAL, 0); }
		public TerminalNode TO() { return getToken(OracleStatementParser.TO, 0); }
		public TerminalNode MONTH() { return getToken(OracleStatementParser.MONTH, 0); }
		public TerminalNode SECOND() { return getToken(OracleStatementParser.SECOND, 0); }
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public TerminalNode NUMBER_() { return getToken(OracleStatementParser.NUMBER_, 0); }
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public DatetimeTypeSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datetimeTypeSuffix; }
	}

	public final DatetimeTypeSuffixContext datetimeTypeSuffix() throws RecognitionException {
		DatetimeTypeSuffixContext _localctx = new DatetimeTypeSuffixContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_datetimeTypeSuffix);
		int _la;
		try {
			setState(1451);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1440);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
				case 1:
					{
					setState(1434);
					match(WITH);
					setState(1436);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LOCAL) {
						{
						setState(1435);
						match(LOCAL);
						}
					}

					setState(1438);
					match(TIME);
					setState(1439);
					match(ZONE);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1442);
				match(TO);
				setState(1443);
				match(MONTH);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1444);
				match(TO);
				setState(1445);
				match(SECOND);
				setState(1449);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LP_) {
					{
					setState(1446);
					match(LP_);
					setState(1447);
					match(NUMBER_);
					setState(1448);
					match(RP_);
					}
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

	public static class TreatFunctionContext extends ParserRuleContext {
		public TerminalNode TREAT() { return getToken(OracleStatementParser.TREAT, 0); }
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode AS() { return getToken(OracleStatementParser.AS, 0); }
		public DataTypeName_Context dataTypeName_() {
			return getRuleContext(DataTypeName_Context.class,0);
		}
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public TerminalNode REF() { return getToken(OracleStatementParser.REF, 0); }
		public TreatFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_treatFunction; }
	}

	public final TreatFunctionContext treatFunction() throws RecognitionException {
		TreatFunctionContext _localctx = new TreatFunctionContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_treatFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1453);
			match(TREAT);
			setState(1454);
			match(LP_);
			setState(1455);
			expr(0);
			setState(1456);
			match(AS);
			setState(1458);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==REF) {
				{
				setState(1457);
				match(REF);
				}
			}

			setState(1460);
			dataTypeName_();
			setState(1461);
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

	public static class CaseExprContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(OracleStatementParser.CASE, 0); }
		public TerminalNode END() { return getToken(OracleStatementParser.END, 0); }
		public SimpleCaseExprContext simpleCaseExpr() {
			return getRuleContext(SimpleCaseExprContext.class,0);
		}
		public SearchedCaseExprContext searchedCaseExpr() {
			return getRuleContext(SearchedCaseExprContext.class,0);
		}
		public ElseClauseContext elseClause() {
			return getRuleContext(ElseClauseContext.class,0);
		}
		public CaseExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseExpr; }
	}

	public final CaseExprContext caseExpr() throws RecognitionException {
		CaseExprContext _localctx = new CaseExprContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_caseExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1463);
			match(CASE);
			setState(1466);
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
			case CASE:
			case NEW:
			case PRIOR:
			case TREAT:
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
				setState(1464);
				simpleCaseExpr();
				}
				break;
			case WHEN:
				{
				setState(1465);
				searchedCaseExpr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1469);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(1468);
				elseClause();
				}
			}

			setState(1471);
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

	public static class SimpleCaseExprContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<SearchedCaseExprContext> searchedCaseExpr() {
			return getRuleContexts(SearchedCaseExprContext.class);
		}
		public SearchedCaseExprContext searchedCaseExpr(int i) {
			return getRuleContext(SearchedCaseExprContext.class,i);
		}
		public SimpleCaseExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleCaseExpr; }
	}

	public final SimpleCaseExprContext simpleCaseExpr() throws RecognitionException {
		SimpleCaseExprContext _localctx = new SimpleCaseExprContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_simpleCaseExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1473);
			expr(0);
			setState(1475); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1474);
				searchedCaseExpr();
				}
				}
				setState(1477); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WHEN );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SearchedCaseExprContext extends ParserRuleContext {
		public TerminalNode WHEN() { return getToken(OracleStatementParser.WHEN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode THEN() { return getToken(OracleStatementParser.THEN, 0); }
		public SimpleExprContext simpleExpr() {
			return getRuleContext(SimpleExprContext.class,0);
		}
		public SearchedCaseExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_searchedCaseExpr; }
	}

	public final SearchedCaseExprContext searchedCaseExpr() throws RecognitionException {
		SearchedCaseExprContext _localctx = new SearchedCaseExprContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_searchedCaseExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1479);
			match(WHEN);
			setState(1480);
			expr(0);
			setState(1481);
			match(THEN);
			setState(1482);
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

	public static class ElseClauseContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(OracleStatementParser.ELSE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ElseClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseClause; }
	}

	public final ElseClauseContext elseClause() throws RecognitionException {
		ElseClauseContext _localctx = new ElseClauseContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_elseClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1484);
			match(ELSE);
			setState(1485);
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

	public static class DateTimeExprContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode AT() { return getToken(OracleStatementParser.AT, 0); }
		public TerminalNode LOCAL() { return getToken(OracleStatementParser.LOCAL, 0); }
		public TerminalNode TIME() { return getToken(OracleStatementParser.TIME, 0); }
		public TerminalNode ZONE() { return getToken(OracleStatementParser.ZONE, 0); }
		public TerminalNode STRING_() { return getToken(OracleStatementParser.STRING_, 0); }
		public TerminalNode DBTIMEZONE() { return getToken(OracleStatementParser.DBTIMEZONE, 0); }
		public DateTimeExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dateTimeExpr; }
	}

	public final DateTimeExprContext dateTimeExpr() throws RecognitionException {
		DateTimeExprContext _localctx = new DateTimeExprContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_dateTimeExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1487);
			expr(0);
			setState(1488);
			match(AT);
			setState(1497);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LOCAL:
				{
				setState(1489);
				match(LOCAL);
				}
				break;
			case TIME:
				{
				setState(1490);
				match(TIME);
				setState(1491);
				match(ZONE);
				setState(1495);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
				case 1:
					{
					setState(1492);
					match(STRING_);
					}
					break;
				case 2:
					{
					setState(1493);
					match(DBTIMEZONE);
					}
					break;
				case 3:
					{
					setState(1494);
					expr(0);
					}
					break;
				}
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

	public static class IntervalExpressionContext extends ParserRuleContext {
		public List<TerminalNode> LP_() { return getTokens(OracleStatementParser.LP_); }
		public TerminalNode LP_(int i) {
			return getToken(OracleStatementParser.LP_, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MINUS_() { return getToken(OracleStatementParser.MINUS_, 0); }
		public List<TerminalNode> RP_() { return getTokens(OracleStatementParser.RP_); }
		public TerminalNode RP_(int i) {
			return getToken(OracleStatementParser.RP_, i);
		}
		public TerminalNode DAY() { return getToken(OracleStatementParser.DAY, 0); }
		public TerminalNode TO() { return getToken(OracleStatementParser.TO, 0); }
		public TerminalNode SECOND() { return getToken(OracleStatementParser.SECOND, 0); }
		public TerminalNode YEAR() { return getToken(OracleStatementParser.YEAR, 0); }
		public TerminalNode MONTH() { return getToken(OracleStatementParser.MONTH, 0); }
		public List<TerminalNode> NUMBER_() { return getTokens(OracleStatementParser.NUMBER_); }
		public TerminalNode NUMBER_(int i) {
			return getToken(OracleStatementParser.NUMBER_, i);
		}
		public IntervalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intervalExpression; }
	}

	public final IntervalExpressionContext intervalExpression() throws RecognitionException {
		IntervalExpressionContext _localctx = new IntervalExpressionContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_intervalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1499);
			match(LP_);
			setState(1500);
			expr(0);
			setState(1501);
			match(MINUS_);
			setState(1502);
			expr(0);
			setState(1503);
			match(RP_);
			setState(1525);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DAY:
				{
				setState(1504);
				match(DAY);
				setState(1508);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LP_) {
					{
					setState(1505);
					match(LP_);
					setState(1506);
					match(NUMBER_);
					setState(1507);
					match(RP_);
					}
				}

				setState(1510);
				match(TO);
				setState(1511);
				match(SECOND);
				setState(1515);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,175,_ctx) ) {
				case 1:
					{
					setState(1512);
					match(LP_);
					setState(1513);
					match(NUMBER_);
					setState(1514);
					match(RP_);
					}
					break;
				}
				}
				break;
			case YEAR:
				{
				setState(1517);
				match(YEAR);
				setState(1521);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LP_) {
					{
					setState(1518);
					match(LP_);
					setState(1519);
					match(NUMBER_);
					setState(1520);
					match(RP_);
					}
				}

				setState(1523);
				match(TO);
				setState(1524);
				match(MONTH);
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

	public static class ObjectAccessExpressionContext extends ParserRuleContext {
		public List<TerminalNode> DOT_() { return getTokens(OracleStatementParser.DOT_); }
		public TerminalNode DOT_(int i) {
			return getToken(OracleStatementParser.DOT_, i);
		}
		public TerminalNode LP_() { return getToken(OracleStatementParser.LP_, 0); }
		public SimpleExprContext simpleExpr() {
			return getRuleContext(SimpleExprContext.class,0);
		}
		public TerminalNode RP_() { return getToken(OracleStatementParser.RP_, 0); }
		public TreatFunctionContext treatFunction() {
			return getRuleContext(TreatFunctionContext.class,0);
		}
		public List<AttributeNameContext> attributeName() {
			return getRuleContexts(AttributeNameContext.class);
		}
		public AttributeNameContext attributeName(int i) {
			return getRuleContext(AttributeNameContext.class,i);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public ObjectAccessExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectAccessExpression; }
	}

	public final ObjectAccessExpressionContext objectAccessExpression() throws RecognitionException {
		ObjectAccessExpressionContext _localctx = new ObjectAccessExpressionContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_objectAccessExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1532);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LP_:
				{
				setState(1527);
				match(LP_);
				setState(1528);
				simpleExpr(0);
				setState(1529);
				match(RP_);
				}
				break;
			case TREAT:
				{
				setState(1531);
				treatFunction();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1534);
			match(DOT_);
			setState(1548);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
			case 1:
				{
				setState(1535);
				attributeName();
				setState(1540);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,179,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1536);
						match(DOT_);
						setState(1537);
						attributeName();
						}
						} 
					}
					setState(1542);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,179,_ctx);
				}
				setState(1545);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,180,_ctx) ) {
				case 1:
					{
					setState(1543);
					match(DOT_);
					setState(1544);
					functionCall();
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(1547);
				functionCall();
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

	public static class ConstructorExprContext extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(OracleStatementParser.NEW, 0); }
		public DataTypeName_Context dataTypeName_() {
			return getRuleContext(DataTypeName_Context.class,0);
		}
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public ConstructorExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorExpr; }
	}

	public final ConstructorExprContext constructorExpr() throws RecognitionException {
		ConstructorExprContext _localctx = new ConstructorExprContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_constructorExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1550);
			match(NEW);
			setState(1551);
			dataTypeName_();
			setState(1552);
			exprList();
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode IDENTIFIER_() { return getToken(OracleStatementParser.IDENTIFIER_, 0); }
		public IgnoredIdentifier_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ignoredIdentifier_; }
	}

	public final IgnoredIdentifier_Context ignoredIdentifier_() throws RecognitionException {
		IgnoredIdentifier_Context _localctx = new IgnoredIdentifier_Context(_ctx, getState());
		enterRule(_localctx, 242, RULE_ignoredIdentifier_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1554);
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
		public List<TerminalNode> COMMA_() { return getTokens(OracleStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(OracleStatementParser.COMMA_, i);
		}
		public IgnoredIdentifiers_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ignoredIdentifiers_; }
	}

	public final IgnoredIdentifiers_Context ignoredIdentifiers_() throws RecognitionException {
		IgnoredIdentifiers_Context _localctx = new IgnoredIdentifiers_Context(_ctx, getState());
		enterRule(_localctx, 244, RULE_ignoredIdentifiers_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1556);
			ignoredIdentifier_();
			setState(1561);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(1557);
				match(COMMA_);
				setState(1558);
				ignoredIdentifier_();
				}
				}
				setState(1563);
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
		enterRule(_localctx, 246, RULE_matchNone);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1564);
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
		public TerminalNode SET() { return getToken(OracleStatementParser.SET, 0); }
		public TerminalNode TRANSACTION() { return getToken(OracleStatementParser.TRANSACTION, 0); }
		public SetTransactionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setTransaction; }
	}

	public final SetTransactionContext setTransaction() throws RecognitionException {
		SetTransactionContext _localctx = new SetTransactionContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_setTransaction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1566);
			match(SET);
			setState(1567);
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

	public static class CommitContext extends ParserRuleContext {
		public TerminalNode COMMIT() { return getToken(OracleStatementParser.COMMIT, 0); }
		public CommitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commit; }
	}

	public final CommitContext commit() throws RecognitionException {
		CommitContext _localctx = new CommitContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_commit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1569);
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
		public TerminalNode ROLLBACK() { return getToken(OracleStatementParser.ROLLBACK, 0); }
		public RollbackContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rollback; }
	}

	public final RollbackContext rollback() throws RecognitionException {
		RollbackContext _localctx = new RollbackContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_rollback);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1571);
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
		public TerminalNode SAVEPOINT() { return getToken(OracleStatementParser.SAVEPOINT, 0); }
		public SavepointContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_savepoint; }
	}

	public final SavepointContext savepoint() throws RecognitionException {
		SavepointContext _localctx = new SavepointContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_savepoint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1573);
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
		public TerminalNode GRANT() { return getToken(OracleStatementParser.GRANT, 0); }
		public ObjectPrivilegeClause_Context objectPrivilegeClause_() {
			return getRuleContext(ObjectPrivilegeClause_Context.class,0);
		}
		public SystemPrivilegeClause_Context systemPrivilegeClause_() {
			return getRuleContext(SystemPrivilegeClause_Context.class,0);
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
		enterRule(_localctx, 256, RULE_grant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1575);
			match(GRANT);
			setState(1579);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,183,_ctx) ) {
			case 1:
				{
				setState(1576);
				objectPrivilegeClause_();
				}
				break;
			case 2:
				{
				setState(1577);
				systemPrivilegeClause_();
				}
				break;
			case 3:
				{
				setState(1578);
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
		public TerminalNode REVOKE() { return getToken(OracleStatementParser.REVOKE, 0); }
		public ObjectPrivilegeClause_Context objectPrivilegeClause_() {
			return getRuleContext(ObjectPrivilegeClause_Context.class,0);
		}
		public SystemPrivilegeClause_Context systemPrivilegeClause_() {
			return getRuleContext(SystemPrivilegeClause_Context.class,0);
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
		enterRule(_localctx, 258, RULE_revoke);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1581);
			match(REVOKE);
			setState(1585);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,184,_ctx) ) {
			case 1:
				{
				setState(1582);
				objectPrivilegeClause_();
				}
				break;
			case 2:
				{
				setState(1583);
				systemPrivilegeClause_();
				}
				break;
			case 3:
				{
				setState(1584);
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

	public static class ObjectPrivilegeClause_Context extends ParserRuleContext {
		public ObjectPrivileges_Context objectPrivileges_() {
			return getRuleContext(ObjectPrivileges_Context.class,0);
		}
		public TerminalNode ON() { return getToken(OracleStatementParser.ON, 0); }
		public OnObjectClause_Context onObjectClause_() {
			return getRuleContext(OnObjectClause_Context.class,0);
		}
		public ObjectPrivilegeClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectPrivilegeClause_; }
	}

	public final ObjectPrivilegeClause_Context objectPrivilegeClause_() throws RecognitionException {
		ObjectPrivilegeClause_Context _localctx = new ObjectPrivilegeClause_Context(_ctx, getState());
		enterRule(_localctx, 260, RULE_objectPrivilegeClause_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1587);
			objectPrivileges_();
			setState(1588);
			match(ON);
			setState(1589);
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

	public static class SystemPrivilegeClause_Context extends ParserRuleContext {
		public SystemPrivilege_Context systemPrivilege_() {
			return getRuleContext(SystemPrivilege_Context.class,0);
		}
		public SystemPrivilegeClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_systemPrivilegeClause_; }
	}

	public final SystemPrivilegeClause_Context systemPrivilegeClause_() throws RecognitionException {
		SystemPrivilegeClause_Context _localctx = new SystemPrivilegeClause_Context(_ctx, getState());
		enterRule(_localctx, 262, RULE_systemPrivilegeClause_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1591);
			systemPrivilege_();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 264, RULE_roleClause_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1593);
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

	public static class ObjectPrivileges_Context extends ParserRuleContext {
		public List<ObjectPrivilegeType_Context> objectPrivilegeType_() {
			return getRuleContexts(ObjectPrivilegeType_Context.class);
		}
		public ObjectPrivilegeType_Context objectPrivilegeType_(int i) {
			return getRuleContext(ObjectPrivilegeType_Context.class,i);
		}
		public List<ColumnNamesContext> columnNames() {
			return getRuleContexts(ColumnNamesContext.class);
		}
		public ColumnNamesContext columnNames(int i) {
			return getRuleContext(ColumnNamesContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(OracleStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(OracleStatementParser.COMMA_, i);
		}
		public ObjectPrivileges_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectPrivileges_; }
	}

	public final ObjectPrivileges_Context objectPrivileges_() throws RecognitionException {
		ObjectPrivileges_Context _localctx = new ObjectPrivileges_Context(_ctx, getState());
		enterRule(_localctx, 266, RULE_objectPrivileges_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1595);
			objectPrivilegeType_();
			setState(1597);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP_) {
				{
				setState(1596);
				columnNames();
				}
			}

			setState(1606);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(1599);
				match(COMMA_);
				setState(1600);
				objectPrivilegeType_();
				setState(1602);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LP_) {
					{
					setState(1601);
					columnNames();
					}
				}

				}
				}
				setState(1608);
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

	public static class ObjectPrivilegeType_Context extends ParserRuleContext {
		public TerminalNode ALL() { return getToken(OracleStatementParser.ALL, 0); }
		public TerminalNode PRIVILEGES() { return getToken(OracleStatementParser.PRIVILEGES, 0); }
		public TerminalNode SELECT() { return getToken(OracleStatementParser.SELECT, 0); }
		public TerminalNode INSERT() { return getToken(OracleStatementParser.INSERT, 0); }
		public TerminalNode DELETE() { return getToken(OracleStatementParser.DELETE, 0); }
		public TerminalNode UPDATE() { return getToken(OracleStatementParser.UPDATE, 0); }
		public TerminalNode ALTER() { return getToken(OracleStatementParser.ALTER, 0); }
		public TerminalNode READ() { return getToken(OracleStatementParser.READ, 0); }
		public TerminalNode WRITE() { return getToken(OracleStatementParser.WRITE, 0); }
		public TerminalNode EXECUTE() { return getToken(OracleStatementParser.EXECUTE, 0); }
		public TerminalNode USE() { return getToken(OracleStatementParser.USE, 0); }
		public TerminalNode INDEX() { return getToken(OracleStatementParser.INDEX, 0); }
		public TerminalNode REFERENCES() { return getToken(OracleStatementParser.REFERENCES, 0); }
		public TerminalNode DEBUG() { return getToken(OracleStatementParser.DEBUG, 0); }
		public TerminalNode UNDER() { return getToken(OracleStatementParser.UNDER, 0); }
		public TerminalNode FLASHBACK() { return getToken(OracleStatementParser.FLASHBACK, 0); }
		public TerminalNode ARCHIVE() { return getToken(OracleStatementParser.ARCHIVE, 0); }
		public TerminalNode ON() { return getToken(OracleStatementParser.ON, 0); }
		public TerminalNode COMMIT() { return getToken(OracleStatementParser.COMMIT, 0); }
		public TerminalNode REFRESH() { return getToken(OracleStatementParser.REFRESH, 0); }
		public TerminalNode QUERY() { return getToken(OracleStatementParser.QUERY, 0); }
		public TerminalNode REWRITE() { return getToken(OracleStatementParser.REWRITE, 0); }
		public TerminalNode KEEP() { return getToken(OracleStatementParser.KEEP, 0); }
		public TerminalNode SEQUENCE() { return getToken(OracleStatementParser.SEQUENCE, 0); }
		public TerminalNode INHERIT() { return getToken(OracleStatementParser.INHERIT, 0); }
		public TerminalNode TRANSLATE() { return getToken(OracleStatementParser.TRANSLATE, 0); }
		public TerminalNode SQL() { return getToken(OracleStatementParser.SQL, 0); }
		public TerminalNode MERGE() { return getToken(OracleStatementParser.MERGE, 0); }
		public TerminalNode VIEW() { return getToken(OracleStatementParser.VIEW, 0); }
		public ObjectPrivilegeType_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectPrivilegeType_; }
	}

	public final ObjectPrivilegeType_Context objectPrivilegeType_() throws RecognitionException {
		ObjectPrivilegeType_Context _localctx = new ObjectPrivilegeType_Context(_ctx, getState());
		enterRule(_localctx, 268, RULE_objectPrivilegeType_);
		int _la;
		try {
			setState(1641);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1609);
				match(ALL);
				setState(1611);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PRIVILEGES) {
					{
					setState(1610);
					match(PRIVILEGES);
					}
				}

				}
				break;
			case SELECT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1613);
				match(SELECT);
				}
				break;
			case INSERT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1614);
				match(INSERT);
				}
				break;
			case DELETE:
				enterOuterAlt(_localctx, 4);
				{
				setState(1615);
				match(DELETE);
				}
				break;
			case UPDATE:
				enterOuterAlt(_localctx, 5);
				{
				setState(1616);
				match(UPDATE);
				}
				break;
			case ALTER:
				enterOuterAlt(_localctx, 6);
				{
				setState(1617);
				match(ALTER);
				}
				break;
			case READ:
				enterOuterAlt(_localctx, 7);
				{
				setState(1618);
				match(READ);
				}
				break;
			case WRITE:
				enterOuterAlt(_localctx, 8);
				{
				setState(1619);
				match(WRITE);
				}
				break;
			case EXECUTE:
				enterOuterAlt(_localctx, 9);
				{
				setState(1620);
				match(EXECUTE);
				}
				break;
			case USE:
				enterOuterAlt(_localctx, 10);
				{
				setState(1621);
				match(USE);
				}
				break;
			case INDEX:
				enterOuterAlt(_localctx, 11);
				{
				setState(1622);
				match(INDEX);
				}
				break;
			case REFERENCES:
				enterOuterAlt(_localctx, 12);
				{
				setState(1623);
				match(REFERENCES);
				}
				break;
			case DEBUG:
				enterOuterAlt(_localctx, 13);
				{
				setState(1624);
				match(DEBUG);
				}
				break;
			case UNDER:
				enterOuterAlt(_localctx, 14);
				{
				setState(1625);
				match(UNDER);
				}
				break;
			case FLASHBACK:
				enterOuterAlt(_localctx, 15);
				{
				setState(1626);
				match(FLASHBACK);
				setState(1627);
				match(ARCHIVE);
				}
				break;
			case ON:
				enterOuterAlt(_localctx, 16);
				{
				setState(1628);
				match(ON);
				setState(1629);
				match(COMMIT);
				setState(1630);
				match(REFRESH);
				}
				break;
			case QUERY:
				enterOuterAlt(_localctx, 17);
				{
				setState(1631);
				match(QUERY);
				setState(1632);
				match(REWRITE);
				}
				break;
			case KEEP:
				enterOuterAlt(_localctx, 18);
				{
				setState(1633);
				match(KEEP);
				setState(1634);
				match(SEQUENCE);
				}
				break;
			case INHERIT:
				enterOuterAlt(_localctx, 19);
				{
				setState(1635);
				match(INHERIT);
				setState(1636);
				match(PRIVILEGES);
				}
				break;
			case TRANSLATE:
				enterOuterAlt(_localctx, 20);
				{
				setState(1637);
				match(TRANSLATE);
				setState(1638);
				match(SQL);
				}
				break;
			case MERGE:
				enterOuterAlt(_localctx, 21);
				{
				setState(1639);
				match(MERGE);
				setState(1640);
				match(VIEW);
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
		public TerminalNode USER() { return getToken(OracleStatementParser.USER, 0); }
		public TerminalNode DIRECTORY() { return getToken(OracleStatementParser.DIRECTORY, 0); }
		public TerminalNode EDITION() { return getToken(OracleStatementParser.EDITION, 0); }
		public TerminalNode MINING() { return getToken(OracleStatementParser.MINING, 0); }
		public TerminalNode MODEL() { return getToken(OracleStatementParser.MODEL, 0); }
		public TerminalNode SQL() { return getToken(OracleStatementParser.SQL, 0); }
		public TerminalNode TRANSLATION() { return getToken(OracleStatementParser.TRANSLATION, 0); }
		public TerminalNode PROFILE() { return getToken(OracleStatementParser.PROFILE, 0); }
		public TerminalNode JAVA() { return getToken(OracleStatementParser.JAVA, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode SOURCE() { return getToken(OracleStatementParser.SOURCE, 0); }
		public TerminalNode RESOURCE() { return getToken(OracleStatementParser.RESOURCE, 0); }
		public OnObjectClause_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onObjectClause_; }
	}

	public final OnObjectClause_Context onObjectClause_() throws RecognitionException {
		OnObjectClause_Context _localctx = new OnObjectClause_Context(_ctx, getState());
		enterRule(_localctx, 270, RULE_onObjectClause_);
		int _la;
		try {
			setState(1655);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case USER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1643);
				match(USER);
				}
				break;
			case DIRECTORY:
				enterOuterAlt(_localctx, 2);
				{
				setState(1644);
				match(DIRECTORY);
				}
				break;
			case EDITION:
				enterOuterAlt(_localctx, 3);
				{
				setState(1645);
				match(EDITION);
				}
				break;
			case MINING:
				enterOuterAlt(_localctx, 4);
				{
				setState(1646);
				match(MINING);
				setState(1647);
				match(MODEL);
				}
				break;
			case SQL:
				enterOuterAlt(_localctx, 5);
				{
				setState(1648);
				match(SQL);
				setState(1649);
				match(TRANSLATION);
				setState(1650);
				match(PROFILE);
				}
				break;
			case JAVA:
				enterOuterAlt(_localctx, 6);
				{
				setState(1651);
				match(JAVA);
				setState(1652);
				_la = _input.LA(1);
				if ( !(_la==RESOURCE || _la==SOURCE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1653);
				tableName();
				}
				break;
			case IDENTIFIER_:
			case STRING_:
				enterOuterAlt(_localctx, 7);
				{
				setState(1654);
				tableName();
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

	public static class SystemPrivilege_Context extends ParserRuleContext {
		public TerminalNode ALL() { return getToken(OracleStatementParser.ALL, 0); }
		public TerminalNode PRIVILEGES() { return getToken(OracleStatementParser.PRIVILEGES, 0); }
		public IgnoredIdentifiers_Context ignoredIdentifiers_() {
			return getRuleContext(IgnoredIdentifiers_Context.class,0);
		}
		public SystemPrivilege_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_systemPrivilege_; }
	}

	public final SystemPrivilege_Context systemPrivilege_() throws RecognitionException {
		SystemPrivilege_Context _localctx = new SystemPrivilege_Context(_ctx, getState());
		enterRule(_localctx, 272, RULE_systemPrivilege_);
		try {
			setState(1660);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1657);
				match(ALL);
				setState(1658);
				match(PRIVILEGES);
				}
				break;
			case IDENTIFIER_:
				enterOuterAlt(_localctx, 2);
				{
				setState(1659);
				ignoredIdentifiers_();
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
		public TerminalNode CREATE() { return getToken(OracleStatementParser.CREATE, 0); }
		public TerminalNode USER() { return getToken(OracleStatementParser.USER, 0); }
		public CreateUserContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createUser; }
	}

	public final CreateUserContext createUser() throws RecognitionException {
		CreateUserContext _localctx = new CreateUserContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_createUser);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1662);
			match(CREATE);
			setState(1663);
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
		public TerminalNode DROP() { return getToken(OracleStatementParser.DROP, 0); }
		public TerminalNode USER() { return getToken(OracleStatementParser.USER, 0); }
		public DropUserContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropUser; }
	}

	public final DropUserContext dropUser() throws RecognitionException {
		DropUserContext _localctx = new DropUserContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_dropUser);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1665);
			match(DROP);
			setState(1666);
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
		public TerminalNode ALTER() { return getToken(OracleStatementParser.ALTER, 0); }
		public TerminalNode USER() { return getToken(OracleStatementParser.USER, 0); }
		public AlterUserContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterUser; }
	}

	public final AlterUserContext alterUser() throws RecognitionException {
		AlterUserContext _localctx = new AlterUserContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_alterUser);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1668);
			match(ALTER);
			setState(1669);
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
		public TerminalNode CREATE() { return getToken(OracleStatementParser.CREATE, 0); }
		public TerminalNode ROLE() { return getToken(OracleStatementParser.ROLE, 0); }
		public CreateRoleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createRole; }
	}

	public final CreateRoleContext createRole() throws RecognitionException {
		CreateRoleContext _localctx = new CreateRoleContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_createRole);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1671);
			match(CREATE);
			setState(1672);
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
		public TerminalNode DROP() { return getToken(OracleStatementParser.DROP, 0); }
		public TerminalNode ROLE() { return getToken(OracleStatementParser.ROLE, 0); }
		public DropRoleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropRole; }
	}

	public final DropRoleContext dropRole() throws RecognitionException {
		DropRoleContext _localctx = new DropRoleContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_dropRole);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1674);
			match(DROP);
			setState(1675);
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
		public TerminalNode ALTER() { return getToken(OracleStatementParser.ALTER, 0); }
		public TerminalNode ROLE() { return getToken(OracleStatementParser.ROLE, 0); }
		public AlterRoleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterRole; }
	}

	public final AlterRoleContext alterRole() throws RecognitionException {
		AlterRoleContext _localctx = new AlterRoleContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_alterRole);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1677);
			match(ALTER);
			setState(1678);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 79:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 81:
			return booleanPrimary_sempred((BooleanPrimaryContext)_localctx, predIndex);
		case 84:
			return bitExpr_sempred((BitExprContext)_localctx, predIndex);
		case 85:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00e3\u0693\4\2\t"+
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
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\u0134\n\2\3\2\5\2\u0137"+
		"\n\2\3\3\3\3\3\3\5\3\u013c\n\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\5\4\u0149\n\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b"+
		"\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\5\n\u0160\n\n\3\n\3\n\3\n\3\n\5\n\u0166"+
		"\n\n\3\n\3\n\3\13\3\13\3\13\7\13\u016d\n\13\f\13\16\13\u0170\13\13\3\f"+
		"\3\f\3\f\3\f\5\f\u0176\n\f\3\r\5\r\u0179\n\r\3\r\3\r\5\r\u017d\n\r\3\16"+
		"\3\16\3\17\3\17\3\17\5\17\u0184\n\17\3\20\3\20\3\20\3\20\3\21\3\21\3\22"+
		"\6\22\u018d\n\22\r\22\16\22\u018e\3\22\5\22\u0192\n\22\3\23\3\23\3\23"+
		"\5\23\u0197\n\23\3\24\3\24\3\24\5\24\u019c\n\24\3\25\3\25\3\25\3\25\7"+
		"\25\u01a2\n\25\f\25\16\25\u01a5\13\25\3\25\3\25\3\25\5\25\u01aa\n\25\3"+
		"\26\3\26\5\26\u01ae\n\26\3\27\3\27\5\27\u01b2\n\27\3\27\3\27\3\27\7\27"+
		"\u01b7\n\27\f\27\16\27\u01ba\13\27\3\27\5\27\u01bd\n\27\3\27\5\27\u01c0"+
		"\n\27\3\30\3\30\5\30\u01c4\n\30\3\30\3\30\5\30\u01c8\n\30\3\30\3\30\3"+
		"\30\5\30\u01cd\n\30\3\30\7\30\u01d0\n\30\f\30\16\30\u01d3\13\30\3\31\3"+
		"\31\3\31\5\31\u01d8\n\31\3\31\3\31\3\31\3\31\3\31\5\31\u01df\n\31\3\32"+
		"\3\32\3\32\3\32\7\32\u01e5\n\32\f\32\16\32\u01e8\13\32\3\32\5\32\u01eb"+
		"\n\32\3\33\3\33\3\33\7\33\u01f0\n\33\f\33\16\33\u01f3\13\33\3\33\5\33"+
		"\u01f6\n\33\3\34\3\34\3\34\3\34\3\34\3\34\7\34\u01fe\n\34\f\34\16\34\u0201"+
		"\13\34\3\34\3\34\5\34\u0205\n\34\3\35\3\35\3\35\5\35\u020a\n\35\3\36\3"+
		"\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \6 \u0219\n \r \16 "+
		"\u021a\5 \u021d\n \3!\3!\6!\u0221\n!\r!\16!\u0222\3!\5!\u0226\n!\3\"\3"+
		"\"\3\"\6\"\u022b\n\"\r\"\16\"\u022c\3\"\5\"\u0230\n\"\3#\3#\3#\3$\3$\5"+
		"$\u0237\n$\3%\3%\3%\5%\u023c\n%\3&\3&\3&\3&\3&\3\'\3\'\3\'\5\'\u0246\n"+
		"\'\3\'\3\'\5\'\u024a\n\'\3\'\3\'\3\'\5\'\u024f\n\'\5\'\u0251\n\'\3(\3"+
		"(\3(\6(\u0256\n(\r(\16(\u0257\3)\3)\3)\5)\u025d\n)\3)\3)\3)\5)\u0262\n"+
		")\3)\3)\5)\u0266\n)\3)\3)\5)\u026a\n)\3)\6)\u026d\n)\r)\16)\u026e\3)\5"+
		")\u0272\n)\3*\3*\3*\3*\3*\3*\5*\u027a\n*\5*\u027c\n*\3*\3*\3*\5*\u0281"+
		"\n*\3*\6*\u0284\n*\r*\16*\u0285\5*\u0288\n*\3*\5*\u028b\n*\3+\3+\3+\3"+
		"+\3+\5+\u0292\n+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\5+\u02a4"+
		"\n+\3,\3,\5,\u02a8\n,\3,\3,\5,\u02ac\n,\3,\3,\3,\3,\3,\5,\u02b3\n,\3,"+
		"\7,\u02b6\n,\f,\16,\u02b9\13,\3-\3-\5-\u02bd\n-\3-\5-\u02c0\n-\3-\3-\3"+
		"-\3-\3-\3-\3-\3-\3-\5-\u02cb\n-\3-\7-\u02ce\n-\f-\16-\u02d1\13-\3.\3."+
		"\3.\5.\u02d6\n.\3.\3.\3.\3.\3.\5.\u02dd\n.\5.\u02df\n.\3/\3/\3/\3/\3/"+
		"\3/\3/\3/\3/\3/\5/\u02eb\n/\3\60\5\60\u02ee\n\60\3\60\3\60\3\61\3\61\3"+
		"\61\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\5\63\u02ff\n\63"+
		"\3\64\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u0308\n\64\3\64\3\64\7\64\u030c"+
		"\n\64\f\64\16\64\u030f\13\64\5\64\u0311\n\64\3\65\3\65\5\65\u0315\n\65"+
		"\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\5\65\u0326\n\65\3\65\7\65\u0329\n\65\f\65\16\65\u032c\13\65\3\66"+
		"\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66"+
		"\3\66\3\66\5\66\u033f\n\66\3\66\3\66\3\66\3\66\3\66\7\66\u0346\n\66\f"+
		"\66\16\66\u0349\13\66\5\66\u034b\n\66\3\67\3\67\5\67\u034f\n\67\3\67\3"+
		"\67\3\67\5\67\u0354\n\67\3\67\5\67\u0357\n\67\3\67\5\67\u035a\n\67\3\67"+
		"\5\67\u035d\n\67\38\38\38\78\u0362\n8\f8\168\u0365\138\39\39\59\u0369"+
		"\n9\39\39\59\u036d\n9\39\79\u0370\n9\f9\169\u0373\139\39\59\u0376\n9\5"+
		"9\u0378\n9\39\39\59\u037c\n9\3:\6:\u037f\n:\r:\16:\u0380\3;\3;\3<\3<\3"+
		"<\3<\3=\5=\u038a\n=\3=\3=\3=\5=\u038f\n=\3=\3=\5=\u0393\n=\3=\3=\3=\3"+
		"=\5=\u0399\n=\3=\3=\3=\3=\5=\u039f\n=\3>\3>\5>\u03a3\n>\3>\3>\3>\3>\3"+
		">\5>\u03aa\n>\3?\3?\5?\u03ae\n?\3?\3?\3?\3?\7?\u03b4\n?\f?\16?\u03b7\13"+
		"?\3?\3?\3@\3@\5@\u03bd\n@\3@\5@\u03c0\n@\3A\3A\3A\3A\3A\7A\u03c7\nA\f"+
		"A\16A\u03ca\13A\3A\3A\3A\3A\5A\u03d0\nA\3A\3A\3A\5A\u03d5\nA\7A\u03d7"+
		"\nA\fA\16A\u03da\13A\3A\3A\3A\3B\3B\5B\u03e1\nB\3B\3B\5B\u03e5\nB\3C\3"+
		"C\3C\3C\3D\3D\3D\3D\3D\3D\5D\u03f1\nD\3E\3E\3F\3F\3G\3G\3H\3H\3I\3I\3"+
		"I\7I\u03fe\nI\fI\16I\u0401\13I\3I\5I\u0404\nI\3J\3J\3K\3K\3L\3L\3L\3L"+
		"\5L\u040e\nL\5L\u0410\nL\3L\3L\3M\5M\u0415\nM\3M\3M\3N\3N\3N\3N\7N\u041d"+
		"\nN\fN\16N\u0420\13N\3N\3N\3O\3O\3O\7O\u0427\nO\fO\16O\u042a\13O\3P\3"+
		"P\3P\3P\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\5Q\u043b\nQ\3Q\3Q\3Q\3Q\3Q\3"+
		"Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\7Q\u044c\nQ\fQ\16Q\u044f\13Q\3R\3R\3R\3S"+
		"\3S\3S\3S\3S\3S\5S\u045a\nS\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\7S"+
		"\u0469\nS\fS\16S\u046c\13S\3T\3T\3U\3U\5U\u0472\nU\3U\3U\3U\3U\3U\5U\u0479"+
		"\nU\3U\3U\3U\3U\3U\7U\u0480\nU\fU\16U\u0483\13U\3U\3U\3U\3U\5U\u0489\n"+
		"U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\5U\u0497\nU\3U\3U\3U\3U\7U\u049d"+
		"\nU\fU\16U\u04a0\13U\3U\3U\5U\u04a4\nU\3U\3U\3U\3U\5U\u04aa\nU\3V\3V\3"+
		"V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3"+
		"V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\7V\u04d6\nV\fV\16V\u04d9"+
		"\13V\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3"+
		"W\3W\3W\5W\u04f3\nW\3W\3W\3W\3W\3W\7W\u04fa\nW\fW\16W\u04fd\13W\3X\3X"+
		"\3X\5X\u0502\nX\3X\3X\5X\u0506\nX\3X\3X\3Y\3Y\3Z\3Z\3[\3[\3\\\3\\\3\\"+
		"\3\\\3\\\5\\\u0515\n\\\3]\3]\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3"+
		"^\5^\u0527\n^\3^\3^\3^\5^\u052c\n^\3^\3^\5^\u0530\n^\5^\u0532\n^\3_\3"+
		"_\3`\3`\3a\3a\3b\3b\3c\3c\3d\3d\3d\3d\3d\7d\u0543\nd\fd\16d\u0546\13d"+
		"\3e\3e\3e\5e\u054b\ne\3e\5e\u054e\ne\3f\3f\3g\3g\3h\3h\3i\3i\3i\3i\3j"+
		"\3j\3j\7j\u055d\nj\fj\16j\u0560\13j\3k\3k\5k\u0564\nk\3l\3l\3l\7l\u0569"+
		"\nl\fl\16l\u056c\13l\3m\3m\3m\3m\3n\3n\5n\u0574\nn\3n\3n\3n\5n\u0579\n"+
		"n\3n\3n\5n\u057d\nn\3o\3o\3o\3o\3o\3o\3o\3o\3o\5o\u0588\no\3o\3o\3o\3"+
		"o\3o\3o\5o\u0590\no\3o\3o\5o\u0594\no\5o\u0596\no\3p\3p\3p\5p\u059b\n"+
		"p\3q\3q\5q\u059f\nq\3q\3q\5q\u05a3\nq\3q\3q\3q\3q\3q\3q\3q\5q\u05ac\n"+
		"q\5q\u05ae\nq\3r\3r\3r\3r\3r\5r\u05b5\nr\3r\3r\3r\3s\3s\3s\5s\u05bd\n"+
		"s\3s\5s\u05c0\ns\3s\3s\3t\3t\6t\u05c6\nt\rt\16t\u05c7\3u\3u\3u\3u\3u\3"+
		"v\3v\3v\3w\3w\3w\3w\3w\3w\3w\3w\5w\u05da\nw\5w\u05dc\nw\3x\3x\3x\3x\3"+
		"x\3x\3x\3x\3x\5x\u05e7\nx\3x\3x\3x\3x\3x\5x\u05ee\nx\3x\3x\3x\3x\5x\u05f4"+
		"\nx\3x\3x\5x\u05f8\nx\3y\3y\3y\3y\3y\5y\u05ff\ny\3y\3y\3y\3y\7y\u0605"+
		"\ny\fy\16y\u0608\13y\3y\3y\5y\u060c\ny\3y\5y\u060f\ny\3z\3z\3z\3z\3{\3"+
		"{\3|\3|\3|\7|\u061a\n|\f|\16|\u061d\13|\3}\3}\3~\3~\3~\3\177\3\177\3\u0080"+
		"\3\u0080\3\u0081\3\u0081\3\u0082\3\u0082\3\u0082\3\u0082\5\u0082\u062e"+
		"\n\u0082\3\u0083\3\u0083\3\u0083\3\u0083\5\u0083\u0634\n\u0083\3\u0084"+
		"\3\u0084\3\u0084\3\u0084\3\u0085\3\u0085\3\u0086\3\u0086\3\u0087\3\u0087"+
		"\5\u0087\u0640\n\u0087\3\u0087\3\u0087\3\u0087\5\u0087\u0645\n\u0087\7"+
		"\u0087\u0647\n\u0087\f\u0087\16\u0087\u064a\13\u0087\3\u0088\3\u0088\5"+
		"\u0088\u064e\n\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3"+
		"\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088"+
		"\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088"+
		"\3\u0088\3\u0088\3\u0088\3\u0088\5\u0088\u066c\n\u0088\3\u0089\3\u0089"+
		"\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089"+
		"\3\u0089\5\u0089\u067a\n\u0089\3\u008a\3\u008a\3\u008a\5\u008a\u067f\n"+
		"\u008a\3\u008b\3\u008b\3\u008b\3\u008c\3\u008c\3\u008c\3\u008d\3\u008d"+
		"\3\u008d\3\u008e\3\u008e\3\u008e\3\u008f\3\u008f\3\u008f\3\u0090\3\u0090"+
		"\3\u0090\3\u0090\2\6\u00a0\u00a4\u00aa\u00ac\u0091\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnp"+
		"rtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094"+
		"\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac"+
		"\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4"+
		"\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc"+
		"\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4"+
		"\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108\u010a\u010c"+
		"\u010e\u0110\u0112\u0114\u0116\u0118\u011a\u011c\u011e\2\r\4\288\u0097"+
		"\u0097\4\2::``\4\2rr~~\4\2PPhh\4\2\b\b\r\r\3\2\u00df\u00e0\6\2\21\21\34"+
		"\34&&((\4\2\5\5\7\7\3\2\u00cb\u00d0\4\2\f\f$%\4\2\u009f\u009f\u00a6\u00a6"+
		"\2\u074d\2\u0133\3\2\2\2\4\u0138\3\2\2\2\6\u0141\3\2\2\2\b\u014a\3\2\2"+
		"\2\n\u014e\3\2\2\2\f\u0152\3\2\2\2\16\u0156\3\2\2\2\20\u0159\3\2\2\2\22"+
		"\u015f\3\2\2\2\24\u0169\3\2\2\2\26\u0175\3\2\2\2\30\u0178\3\2\2\2\32\u017e"+
		"\3\2\2\2\34\u0183\3\2\2\2\36\u0185\3\2\2\2 \u0189\3\2\2\2\"\u0191\3\2"+
		"\2\2$\u0196\3\2\2\2&\u0198\3\2\2\2(\u01a9\3\2\2\2*\u01ad\3\2\2\2,\u01af"+
		"\3\2\2\2.\u01c1\3\2\2\2\60\u01d4\3\2\2\2\62\u01ea\3\2\2\2\64\u01ec\3\2"+
		"\2\2\66\u0204\3\2\2\28\u0209\3\2\2\2:\u020b\3\2\2\2<\u020e\3\2\2\2>\u021c"+
		"\3\2\2\2@\u021e\3\2\2\2B\u0227\3\2\2\2D\u0231\3\2\2\2F\u0236\3\2\2\2H"+
		"\u023b\3\2\2\2J\u023d\3\2\2\2L\u0242\3\2\2\2N\u0255\3\2\2\2P\u0259\3\2"+
		"\2\2R\u0273\3\2\2\2T\u02a3\3\2\2\2V\u02a5\3\2\2\2X\u02bc\3\2\2\2Z\u02d2"+
		"\3\2\2\2\\\u02ea\3\2\2\2^\u02ed\3\2\2\2`\u02f1\3\2\2\2b\u02f4\3\2\2\2"+
		"d\u02f7\3\2\2\2f\u0310\3\2\2\2h\u0314\3\2\2\2j\u034a\3\2\2\2l\u034e\3"+
		"\2\2\2n\u035e\3\2\2\2p\u037b\3\2\2\2r\u037e\3\2\2\2t\u0382\3\2\2\2v\u0384"+
		"\3\2\2\2x\u039e\3\2\2\2z\u03a0\3\2\2\2|\u03ab\3\2\2\2~\u03bc\3\2\2\2\u0080"+
		"\u03c1\3\2\2\2\u0082\u03de\3\2\2\2\u0084\u03e6\3\2\2\2\u0086\u03ea\3\2"+
		"\2\2\u0088\u03f2\3\2\2\2\u008a\u03f4\3\2\2\2\u008c\u03f6\3\2\2\2\u008e"+
		"\u03f8\3\2\2\2\u0090\u0403\3\2\2\2\u0092\u0405\3\2\2\2\u0094\u0407\3\2"+
		"\2\2\u0096\u0409\3\2\2\2\u0098\u0414\3\2\2\2\u009a\u0418\3\2\2\2\u009c"+
		"\u0423\3\2\2\2\u009e\u042b\3\2\2\2\u00a0\u043a\3\2\2\2\u00a2\u0450\3\2"+
		"\2\2\u00a4\u0453\3\2\2\2\u00a6\u046d\3\2\2\2\u00a8\u04a9\3\2\2\2\u00aa"+
		"\u04ab\3\2\2\2\u00ac\u04f2\3\2\2\2\u00ae\u04fe\3\2\2\2\u00b0\u0509\3\2"+
		"\2\2\u00b2\u050b\3\2\2\2\u00b4\u050d\3\2\2\2\u00b6\u0514\3\2\2\2\u00b8"+
		"\u0516\3\2\2\2\u00ba\u0531\3\2\2\2\u00bc\u0533\3\2\2\2\u00be\u0535\3\2"+
		"\2\2\u00c0\u0537\3\2\2\2\u00c2\u0539\3\2\2\2\u00c4\u053b\3\2\2\2\u00c6"+
		"\u053d\3\2\2\2\u00c8\u054a\3\2\2\2\u00ca\u054f\3\2\2\2\u00cc\u0551\3\2"+
		"\2\2\u00ce\u0553\3\2\2\2\u00d0\u0555\3\2\2\2\u00d2\u0559\3\2\2\2\u00d4"+
		"\u0563\3\2\2\2\u00d6\u0565\3\2\2\2\u00d8\u056d\3\2\2\2\u00da\u057c\3\2"+
		"\2\2\u00dc\u0595\3\2\2\2\u00de\u059a\3\2\2\2\u00e0\u05ad\3\2\2\2\u00e2"+
		"\u05af\3\2\2\2\u00e4\u05b9\3\2\2\2\u00e6\u05c3\3\2\2\2\u00e8\u05c9\3\2"+
		"\2\2\u00ea\u05ce\3\2\2\2\u00ec\u05d1\3\2\2\2\u00ee\u05dd\3\2\2\2\u00f0"+
		"\u05fe\3\2\2\2\u00f2\u0610\3\2\2\2\u00f4\u0614\3\2\2\2\u00f6\u0616\3\2"+
		"\2\2\u00f8\u061e\3\2\2\2\u00fa\u0620\3\2\2\2\u00fc\u0623\3\2\2\2\u00fe"+
		"\u0625\3\2\2\2\u0100\u0627\3\2\2\2\u0102\u0629\3\2\2\2\u0104\u062f\3\2"+
		"\2\2\u0106\u0635\3\2\2\2\u0108\u0639\3\2\2\2\u010a\u063b\3\2\2\2\u010c"+
		"\u063d\3\2\2\2\u010e\u066b\3\2\2\2\u0110\u0679\3\2\2\2\u0112\u067e\3\2"+
		"\2\2\u0114\u0680\3\2\2\2\u0116\u0683\3\2\2\2\u0118\u0686\3\2\2\2\u011a"+
		"\u0689\3\2\2\2\u011c\u068c\3\2\2\2\u011e\u068f\3\2\2\2\u0120\u0134\5\4"+
		"\3\2\u0121\u0134\5\6\4\2\u0122\u0134\5\b\5\2\u0123\u0134\5\n\6\2\u0124"+
		"\u0134\5z>\2\u0125\u0134\5\u0084C\2\u0126\u0134\5\u0086D\2\u0127\u0134"+
		"\5\u00fc\177\2\u0128\u0134\5\u00fe\u0080\2\u0129\u0134\5\u00fa~\2\u012a"+
		"\u0134\5\u0100\u0081\2\u012b\u0134\5\u0102\u0082\2\u012c\u0134\5\u0104"+
		"\u0083\2\u012d\u0134\5\u0114\u008b\2\u012e\u0134\5\u0116\u008c\2\u012f"+
		"\u0134\5\u0118\u008d\2\u0130\u0134\5\u011a\u008e\2\u0131\u0134\5\u011c"+
		"\u008f\2\u0132\u0134\5\u011e\u0090\2\u0133\u0120\3\2\2\2\u0133\u0121\3"+
		"\2\2\2\u0133\u0122\3\2\2\2\u0133\u0123\3\2\2\2\u0133\u0124\3\2\2\2\u0133"+
		"\u0125\3\2\2\2\u0133\u0126\3\2\2\2\u0133\u0127\3\2\2\2\u0133\u0128\3\2"+
		"\2\2\u0133\u0129\3\2\2\2\u0133\u012a\3\2\2\2\u0133\u012b\3\2\2\2\u0133"+
		"\u012c\3\2\2\2\u0133\u012d\3\2\2\2\u0133\u012e\3\2\2\2\u0133\u012f\3\2"+
		"\2\2\u0133\u0130\3\2\2\2\u0133\u0131\3\2\2\2\u0133\u0132\3\2\2\2\u0134"+
		"\u0136\3\2\2\2\u0135\u0137\7\u00de\2\2\u0136\u0135\3\2\2\2\u0136\u0137"+
		"\3\2\2\2\u0137\3\3\2\2\2\u0138\u013b\7\65\2\2\u0139\u013a\7{\2\2\u013a"+
		"\u013c\7\u00a9\2\2\u013b\u0139\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013d"+
		"\3\2\2\2\u013d\u013e\7L\2\2\u013e\u013f\5\u008aF\2\u013f\u0140\5\22\n"+
		"\2\u0140\5\3\2\2\2\u0141\u0142\7-\2\2\u0142\u0143\7L\2\2\u0143\u0148\5"+
		"\u008aF\2\u0144\u0149\5\34\17\2\u0145\u0149\5\"\22\2\u0146\u0149\5> \2"+
		"\u0147\u0149\5N(\2\u0148\u0144\3\2\2\2\u0148\u0145\3\2\2\2\u0148\u0146"+
		"\3\2\2\2\u0148\u0147\3\2\2\2\u0148\u0149\3\2\2\2\u0149\7\3\2\2\2\u014a"+
		"\u014b\7:\2\2\u014b\u014c\7L\2\2\u014c\u014d\5\u008aF\2\u014d\t\3\2\2"+
		"\2\u014e\u014f\7O\2\2\u014f\u0150\7L\2\2\u0150\u0151\5\u008aF\2\u0151"+
		"\13\3\2\2\2\u0152\u0153\7\u00d2\2\2\u0153\u0154\5\16\b\2\u0154\u0155\7"+
		"\u00d3\2\2\u0155\r\3\2\2\2\u0156\u0157\7\u00a8\2\2\u0157\u0158\5\u00f4"+
		"{\2\u0158\17\3\2\2\2\u0159\u015a\5\u00ceh\2\u015a\21\3\2\2\2\u015b\u015c"+
		"\7\u00d2\2\2\u015c\u015d\5\24\13\2\u015d\u015e\7\u00d3\2\2\u015e\u0160"+
		"\3\2\2\2\u015f\u015b\3\2\2\2\u015f\u0160\3\2\2\2\u0160\u0165\3\2\2\2\u0161"+
		"\u0162\7C\2\2\u0162\u0163\7\63\2\2\u0163\u0164\t\2\2\2\u0164\u0166\7J"+
		"\2\2\u0165\u0161\3\2\2\2\u0165\u0166\3\2\2\2\u0166\u0167\3\2\2\2\u0167"+
		"\u0168\5\30\r\2\u0168\23\3\2\2\2\u0169\u016e\5\26\f\2\u016a\u016b\7\u00d8"+
		"\2\2\u016b\u016d\5\26\f\2\u016c\u016a\3\2\2\2\u016d\u0170\3\2\2\2\u016e"+
		"\u016c\3\2\2\2\u016e\u016f\3\2\2\2\u016f\25\3\2\2\2\u0170\u016e\3\2\2"+
		"\2\u0171\u0176\5P)\2\u0172\u0176\5V,\2\u0173\u0176\5h\65\2\u0174\u0176"+
		"\5j\66\2\u0175\u0171\3\2\2\2\u0175\u0172\3\2\2\2\u0175\u0173\3\2\2\2\u0175"+
		"\u0174\3\2\2\2\u0176\27\3\2\2\2\u0177\u0179\5r:\2\u0178\u0177\3\2\2\2"+
		"\u0178\u0179\3\2\2\2\u0179\u017c\3\2\2\2\u017a\u017b\7/\2\2\u017b\u017d"+
		"\5\32\16\2\u017c\u017a\3\2\2\2\u017c\u017d\3\2\2\2\u017d\31\3\2\2\2\u017e"+
		"\u017f\5\u00f8}\2\u017f\33\3\2\2\2\u0180\u0184\5\36\20\2\u0181\u0182\7"+
		"\u009b\2\2\u0182\u0184\5l\67\2\u0183\u0180\3\2\2\2\u0183\u0181\3\2\2\2"+
		"\u0184\35\3\2\2\2\u0185\u0186\7\u009d\2\2\u0186\u0187\7M\2\2\u0187\u0188"+
		"\5 \21\2\u0188\37\3\2\2\2\u0189\u018a\7\u00df\2\2\u018a!\3\2\2\2\u018b"+
		"\u018d\5$\23\2\u018c\u018b\3\2\2\2\u018d\u018e\3\2\2\2\u018e\u018c\3\2"+
		"\2\2\u018e\u018f\3\2\2\2\u018f\u0192\3\2\2\2\u0190\u0192\5<\37\2\u0191"+
		"\u018c\3\2\2\2\u0191\u0190\3\2\2\2\u0192#\3\2\2\2\u0193\u0197\5&\24\2"+
		"\u0194\u0197\5,\27\2\u0195\u0197\5\62\32\2\u0196\u0193\3\2\2\2\u0196\u0194"+
		"\3\2\2\2\u0196\u0195\3\2\2\2\u0197%\3\2\2\2\u0198\u0199\7,\2\2\u0199\u019b"+
		"\5(\25\2\u019a\u019c\5r:\2\u019b\u019a\3\2\2\2\u019b\u019c\3\2\2\2\u019c"+
		"\'\3\2\2\2\u019d\u019e\7\u00d2\2\2\u019e\u01a3\5*\26\2\u019f\u01a0\7\u00d8"+
		"\2\2\u01a0\u01a2\5*\26\2\u01a1\u019f\3\2\2\2\u01a2\u01a5\3\2\2\2\u01a3"+
		"\u01a1\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a6\3\2\2\2\u01a5\u01a3\3\2"+
		"\2\2\u01a6\u01a7\7\u00d3\2\2\u01a7\u01aa\3\2\2\2\u01a8\u01aa\5*\26\2\u01a9"+
		"\u019d\3\2\2\2\u01a9\u01a8\3\2\2\2\u01aa)\3\2\2\2\u01ab\u01ae\5P)\2\u01ac"+
		"\u01ae\5V,\2\u01ad\u01ab\3\2\2\2\u01ad\u01ac\3\2\2\2\u01ae+\3\2\2\2\u01af"+
		"\u01bf\7\u008a\2\2\u01b0\u01b2\7\u00d2\2\2\u01b1\u01b0\3\2\2\2\u01b1\u01b2"+
		"\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3\u01b8\5.\30\2\u01b4\u01b5\7\u00d8\2"+
		"\2\u01b5\u01b7\5.\30\2\u01b6\u01b4\3\2\2\2\u01b7\u01ba\3\2\2\2\u01b8\u01b6"+
		"\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9\u01bc\3\2\2\2\u01ba\u01b8\3\2\2\2\u01bb"+
		"\u01bd\7\u00d3\2\2\u01bc\u01bb\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01c0"+
		"\3\2\2\2\u01be\u01c0\5\60\31\2\u01bf\u01b1\3\2\2\2\u01bf\u01be\3\2\2\2"+
		"\u01c0-\3\2\2\2\u01c1\u01c3\5\u008cG\2\u01c2\u01c4\5\u00dan\2\u01c3\u01c2"+
		"\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4\u01c7\3\2\2\2\u01c5\u01c6\7\67\2\2"+
		"\u01c6\u01c8\5\u00a0Q\2\u01c7\u01c5\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8"+
		"\u01cc\3\2\2\2\u01c9\u01ca\7w\2\2\u01ca\u01cd\5l\67\2\u01cb\u01cd\7p\2"+
		"\2\u01cc\u01c9\3\2\2\2\u01cc\u01cb\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd\u01d1"+
		"\3\2\2\2\u01ce\u01d0\5X-\2\u01cf\u01ce\3\2\2\2\u01d0\u01d3\3\2\2\2\u01d1"+
		"\u01cf\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2/\3\2\2\2\u01d3\u01d1\3\2\2\2"+
		"\u01d4\u01d5\7\62\2\2\u01d5\u01d7\5\u008cG\2\u01d6\u01d8\7\33\2\2\u01d7"+
		"\u01d6\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9\u01da\7\u00a7"+
		"\2\2\u01da\u01db\7g\2\2\u01db\u01dc\7\5\2\2\u01dc\u01de\7\u0084\2\2\u01dd"+
		"\u01df\7z\2\2\u01de\u01dd\3\2\2\2\u01de\u01df\3\2\2\2\u01df\61\3\2\2\2"+
		"\u01e0\u01e1\7\"\2\2\u01e1\u01e2\7\u00ae\2\2\u01e2\u01e6\5\66\34\2\u01e3"+
		"\u01e5\58\35\2\u01e4\u01e3\3\2\2\2\u01e5\u01e8\3\2\2\2\u01e6\u01e4\3\2"+
		"\2\2\u01e6\u01e7\3\2\2\2\u01e7\u01eb\3\2\2\2\u01e8\u01e6\3\2\2\2\u01e9"+
		"\u01eb\5\64\33\2\u01ea\u01e0\3\2\2\2\u01ea\u01e9\3\2\2\2\u01eb\63\3\2"+
		"\2\2\u01ec\u01ed\7:\2\2\u01ed\u01f1\5\66\34\2\u01ee\u01f0\58\35\2\u01ef"+
		"\u01ee\3\2\2\2\u01f0\u01f3\3\2\2\2\u01f1\u01ef\3\2\2\2\u01f1\u01f2\3\2"+
		"\2\2\u01f2\u01f5\3\2\2\2\u01f3\u01f1\3\2\2\2\u01f4\u01f6\5:\36\2\u01f5"+
		"\u01f4\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6\65\3\2\2\2\u01f7\u01f8\7\62\2"+
		"\2\u01f8\u0205\5\u008cG\2\u01f9\u01fa\7\u00d2\2\2\u01fa\u01ff\5\u008c"+
		"G\2\u01fb\u01fc\7\u00d8\2\2\u01fc\u01fe\5\u008cG\2\u01fd\u01fb\3\2\2\2"+
		"\u01fe\u0201\3\2\2\2\u01ff\u01fd\3\2\2\2\u01ff\u0200\3\2\2\2\u0200\u0202"+
		"\3\2\2\2\u0201\u01ff\3\2\2\2\u0202\u0203\7\u00d3\2\2\u0203\u0205\3\2\2"+
		"\2\u0204\u01f7\3\2\2\2\u0204\u01f9\3\2\2\2\u0205\67\3\2\2\2\u0206\u0207"+
		"\7\60\2\2\u0207\u020a\7m\2\2\u0208\u020a\7\u0082\2\2\u0209\u0206\3\2\2"+
		"\2\u0209\u0208\3\2\2\2\u020a9\3\2\2\2\u020b\u020c\7k\2\2\u020c\u020d\7"+
		"\u00e1\2\2\u020d;\3\2\2\2\u020e\u020f\7\u009d\2\2\u020f\u0210\7\62\2\2"+
		"\u0210\u0211\5\u008cG\2\u0211\u0212\7M\2\2\u0212\u0213\5\u008cG\2\u0213"+
		"=\3\2\2\2\u0214\u021d\5@!\2\u0215\u021d\5B\"\2\u0216\u021d\5J&\2\u0217"+
		"\u0219\5L\'\2\u0218\u0217\3\2\2\2\u0219\u021a\3\2\2\2\u021a\u0218\3\2"+
		"\2\2\u021a\u021b\3\2\2\2\u021b\u021d\3\2\2\2\u021c\u0214\3\2\2\2\u021c"+
		"\u0215\3\2\2\2\u021c\u0216\3\2\2\2\u021c\u0218\3\2\2\2\u021d?\3\2\2\2"+
		"\u021e\u0225\7,\2\2\u021f\u0221\5h\65\2\u0220\u021f\3\2\2\2\u0221\u0222"+
		"\3\2\2\2\u0222\u0220\3\2\2\2\u0222\u0223\3\2\2\2\u0223\u0226\3\2\2\2\u0224"+
		"\u0226\5j\66\2\u0225\u0220\3\2\2\2\u0225\u0224\3\2\2\2\u0226A\3\2\2\2"+
		"\u0227\u0228\7\u008a\2\2\u0228\u022a\5F$\2\u0229\u022b\5\\/\2\u022a\u0229"+
		"\3\2\2\2\u022b\u022c\3\2\2\2\u022c\u022a\3\2\2\2\u022c\u022d\3\2\2\2\u022d"+
		"\u022f\3\2\2\2\u022e\u0230\7\60\2\2\u022f\u022e\3\2\2\2\u022f\u0230\3"+
		"\2\2\2\u0230C\3\2\2\2\u0231\u0232\7\64\2\2\u0232\u0233\5\u00f4{\2\u0233"+
		"E\3\2\2\2\u0234\u0237\5D#\2\u0235\u0237\5H%\2\u0236\u0234\3\2\2\2\u0236"+
		"\u0235\3\2\2\2\u0237G\3\2\2\2\u0238\u023c\5\u0098M\2\u0239\u023a\7P\2"+
		"\2\u023a\u023c\5\u009aN\2\u023b\u0238\3\2\2\2\u023b\u0239\3\2\2\2\u023c"+
		"I\3\2\2\2\u023d\u023e\7\u009d\2\2\u023e\u023f\5D#\2\u023f\u0240\7M\2\2"+
		"\u0240\u0241\5\u00f4{\2\u0241K\3\2\2\2\u0242\u0250\7:\2\2\u0243\u0245"+
		"\5H%\2\u0244\u0246\7\60\2\2\u0245\u0244\3\2\2\2\u0245\u0246\3\2\2\2\u0246"+
		"\u0249\3\2\2\2\u0247\u0248\t\3\2\2\u0248\u024a\7A\2\2\u0249\u0247\3\2"+
		"\2\2\u0249\u024a\3\2\2\2\u024a\u0251\3\2\2\2\u024b\u024c\7\64\2\2\u024c"+
		"\u024e\5\u00f4{\2\u024d\u024f\7\60\2\2\u024e\u024d\3\2\2\2\u024e\u024f"+
		"\3\2\2\2\u024f\u0251\3\2\2\2\u0250\u0243\3\2\2\2\u0250\u024b\3\2\2\2\u0251"+
		"M\3\2\2\2\u0252\u0256\5&\24\2\u0253\u0256\5,\27\2\u0254\u0256\5\64\33"+
		"\2\u0255\u0252\3\2\2\2\u0255\u0253\3\2\2\2\u0255\u0254\3\2\2\2\u0256\u0257"+
		"\3\2\2\2\u0257\u0255\3\2\2\2\u0257\u0258\3\2\2\2\u0258O\3\2\2\2\u0259"+
		"\u025a\5\u008cG\2\u025a\u025c\5\u00dan\2\u025b\u025d\7\u00a5\2\2\u025c"+
		"\u025b\3\2\2\2\u025c\u025d\3\2\2\2\u025d\u0265\3\2\2\2\u025e\u0261\7\67"+
		"\2\2\u025f\u0260\7C\2\2\u0260\u0262\7\34\2\2\u0261\u025f\3\2\2\2\u0261"+
		"\u0262\3\2\2\2\u0262\u0263\3\2\2\2\u0263\u0266\5\u00a0Q\2\u0264\u0266"+
		"\5R*\2\u0265\u025e\3\2\2\2\u0265\u0264\3\2\2\2\u0265\u0266\3\2\2\2\u0266"+
		"\u0269\3\2\2\2\u0267\u0268\7w\2\2\u0268\u026a\5l\67\2\u0269\u0267\3\2"+
		"\2\2\u0269\u026a\3\2\2\2\u026a\u0271\3\2\2\2\u026b\u026d\5X-\2\u026c\u026b"+
		"\3\2\2\2\u026d\u026e\3\2\2\2\u026e\u026c\3\2\2\2\u026e\u026f\3\2\2\2\u026f"+
		"\u0272\3\2\2\2\u0270\u0272\5f\64\2\u0271\u026c\3\2\2\2\u0271\u0270\3\2"+
		"\2\2\u0271\u0272\3\2\2\2\u0272Q\3\2\2\2\u0273\u027b\7?\2\2\u0274\u027c"+
		"\7.\2\2\u0275\u0276\7\13\2\2\u0276\u0279\7\67\2\2\u0277\u0278\7C\2\2\u0278"+
		"\u027a\7\34\2\2\u0279\u0277\3\2\2\2\u0279\u027a\3\2\2\2\u027a\u027c\3"+
		"\2\2\2\u027b\u0274\3\2\2\2\u027b\u0275\3\2\2\2\u027c\u027d\3\2\2\2\u027d"+
		"\u027e\7/\2\2\u027e\u0280\7}\2\2\u027f\u0281\7\u00d2\2\2\u0280\u027f\3"+
		"\2\2\2\u0280\u0281\3\2\2\2\u0281\u0287\3\2\2\2\u0282\u0284\5T+\2\u0283"+
		"\u0282\3\2\2\2\u0284\u0285\3\2\2\2\u0285\u0283\3\2\2\2\u0285\u0286\3\2"+
		"\2\2\u0286\u0288\3\2\2\2\u0287\u0283\3\2\2\2\u0287\u0288\3\2\2\2\u0288"+
		"\u028a\3\2\2\2\u0289\u028b\7\u00d3\2\2\u028a\u0289\3\2\2\2\u028a\u028b"+
		"\3\2\2\2\u028bS\3\2\2\2\u028c\u028d\7K\2\2\u028d\u0291\7*\2\2\u028e\u0292"+
		"\7\u00e1\2\2\u028f\u0290\7\31\2\2\u0290\u0292\7\u00b1\2\2\u0291\u028e"+
		"\3\2\2\2\u0291\u028f\3\2\2\2\u0292\u02a4\3\2\2\2\u0293\u0294\7\177\2\2"+
		"\u0294\u0295\7\13\2\2\u0295\u02a4\7\u00e1\2\2\u0296\u0297\7\u0086\2\2"+
		"\u0297\u02a4\7\u00e1\2\2\u0298\u02a4\7\u0090\2\2\u0299\u029a\7\u0088\2"+
		"\2\u029a\u02a4\7\u00e1\2\2\u029b\u02a4\7\u0091\2\2\u029c\u02a4\7n\2\2"+
		"\u029d\u02a4\7\u008f\2\2\u029e\u029f\7i\2\2\u029f\u02a4\7\u00e1\2\2\u02a0"+
		"\u02a4\7\u008e\2\2\u02a1\u02a4\7\36\2\2\u02a2\u02a4\7\u0092\2\2\u02a3"+
		"\u028c\3\2\2\2\u02a3\u0293\3\2\2\2\u02a3\u0296\3\2\2\2\u02a3\u0298\3\2"+
		"\2\2\u02a3\u0299\3\2\2\2\u02a3\u029b\3\2\2\2\u02a3\u029c\3\2\2\2\u02a3"+
		"\u029d\3\2\2\2\u02a3\u029e\3\2\2\2\u02a3\u02a0\3\2\2\2\u02a3\u02a1\3\2"+
		"\2\2\u02a3\u02a2\3\2\2\2\u02a4U\3\2\2\2\u02a5\u02a7\5\u008cG\2\u02a6\u02a8"+
		"\5\u00dan\2\u02a7\u02a6\3\2\2\2\u02a7\u02a8\3\2\2\2\u02a8\u02ab\3\2\2"+
		"\2\u02a9\u02aa\7?\2\2\u02aa\u02ac\7.\2\2\u02ab\u02a9\3\2\2\2\u02ab\u02ac"+
		"\3\2\2\2\u02ac\u02ad\3\2\2\2\u02ad\u02ae\7/\2\2\u02ae\u02af\7\u00d2\2"+
		"\2\u02af\u02b0\5\u00a0Q\2\u02b0\u02b2\7\u00d3\2\2\u02b1\u02b3\7\u00b3"+
		"\2\2\u02b2\u02b1\3\2\2\2\u02b2\u02b3\3\2\2\2\u02b3\u02b7\3\2\2\2\u02b4"+
		"\u02b6\5X-\2\u02b5\u02b4\3\2\2\2\u02b6\u02b9\3\2\2\2\u02b7\u02b5\3\2\2"+
		"\2\u02b7\u02b8\3\2\2\2\u02b8W\3\2\2\2\u02b9\u02b7\3\2\2\2\u02ba\u02bb"+
		"\7\64\2\2\u02bb\u02bd\5\u00f4{\2\u02bc\u02ba\3\2\2\2\u02bc\u02bd\3\2\2"+
		"\2\u02bd\u02ca\3\2\2\2\u02be\u02c0\7\33\2\2\u02bf\u02be\3\2\2\2\u02bf"+
		"\u02c0\3\2\2\2\u02c0\u02c1\3\2\2\2\u02c1\u02cb\7\34\2\2\u02c2\u02cb\7"+
		"P\2\2\u02c3\u02cb\5\u0098M\2\u02c4\u02cb\5Z.\2\u02c5\u02c6\7\61\2\2\u02c6"+
		"\u02c7\7\u00d2\2\2\u02c7\u02c8\5\u00a0Q\2\u02c8\u02c9\7\u00d3\2\2\u02c9"+
		"\u02cb\3\2\2\2\u02ca\u02bf\3\2\2\2\u02ca\u02c2\3\2\2\2\u02ca\u02c3\3\2"+
		"\2\2\u02ca\u02c4\3\2\2\2\u02ca\u02c5\3\2\2\2\u02cb\u02cf\3\2\2\2\u02cc"+
		"\u02ce\5\\/\2\u02cd\u02cc\3\2\2\2\u02ce\u02d1\3\2\2\2\u02cf\u02cd\3\2"+
		"\2\2\u02cf\u02d0\3\2\2\2\u02d0Y\3\2\2\2\u02d1\u02cf\3\2\2\2\u02d2\u02d3"+
		"\7F\2\2\u02d3\u02d5\5\u008aF\2\u02d4\u02d6\5\u009aN\2\u02d5\u02d4\3\2"+
		"\2\2\u02d5\u02d6\3\2\2\2\u02d6\u02de\3\2\2\2\u02d7\u02d8\7C\2\2\u02d8"+
		"\u02dc\78\2\2\u02d9\u02dd\7\60\2\2\u02da\u02db\7\"\2\2\u02db\u02dd\7\34"+
		"\2\2\u02dc\u02d9\3\2\2\2\u02dc\u02da\3\2\2\2\u02dd\u02df\3\2\2\2\u02de"+
		"\u02d7\3\2\2\2\u02de\u02df\3\2\2\2\u02df[\3\2\2\2\u02e0\u02eb\5^\60\2"+
		"\u02e1\u02eb\5`\61\2\u02e2\u02eb\7\u009c\2\2\u02e3\u02eb\7\u0093\2\2\u02e4"+
		"\u02eb\5d\63\2\u02e5\u02eb\7;\2\2\u02e6\u02eb\79\2\2\u02e7\u02eb\7\u00b0"+
		"\2\2\u02e8\u02eb\7\u0094\2\2\u02e9\u02eb\5b\62\2\u02ea\u02e0\3\2\2\2\u02ea"+
		"\u02e1\3\2\2\2\u02ea\u02e2\3\2\2\2\u02ea\u02e3\3\2\2\2\u02ea\u02e4\3\2"+
		"\2\2\u02ea\u02e5\3\2\2\2\u02ea\u02e6\3\2\2\2\u02ea\u02e7\3\2\2\2\u02ea"+
		"\u02e8\3\2\2\2\u02ea\u02e9\3\2\2\2\u02eb]\3\2\2\2\u02ec\u02ee\7\33\2\2"+
		"\u02ed\u02ec\3\2\2\2\u02ed\u02ee\3\2\2\2\u02ee\u02ef\3\2\2\2\u02ef\u02f0"+
		"\7q\2\2\u02f0_\3\2\2\2\u02f1\u02f2\7\u0080\2\2\u02f2\u02f3\t\4\2\2\u02f3"+
		"a\3\2\2\2\u02f4\u02f5\7y\2\2\u02f5\u02f6\7\u0081\2\2\u02f6c\3\2\2\2\u02f7"+
		"\u02f8\7\u00af\2\2\u02f8\u02fe\7A\2\2\u02f9\u02ff\5\u008eH\2\u02fa\u02fb"+
		"\7\u00d2\2\2\u02fb\u02fc\5z>\2\u02fc\u02fd\7\u00d3\2\2\u02fd\u02ff\3\2"+
		"\2\2\u02fe\u02f9\3\2\2\2\u02fe\u02fa\3\2\2\2\u02fe\u02ff\3\2\2\2\u02ff"+
		"e\3\2\2\2\u0300\u0301\7\u00a3\2\2\u0301\u0302\7\26\2\2\u0302\u0311\5\u008a"+
		"F\2\u0303\u0304\7*\2\2\u0304\u0311\7\u00a0\2\2\u0305\u0306\7\64\2\2\u0306"+
		"\u0308\5\u00f4{\2\u0307\u0305\3\2\2\2\u0307\u0308\3\2\2\2\u0308\u0309"+
		"\3\2\2\2\u0309\u030d\5Z.\2\u030a\u030c\5\\/\2\u030b\u030a\3\2\2\2\u030c"+
		"\u030f\3\2\2\2\u030d\u030b\3\2\2\2\u030d\u030e\3\2\2\2\u030e\u0311\3\2"+
		"\2\2\u030f\u030d\3\2\2\2\u0310\u0300\3\2\2\2\u0310\u0303\3\2\2\2\u0310"+
		"\u0307\3\2\2\2\u0311g\3\2\2\2\u0312\u0313\7\64\2\2\u0313\u0315\5\u00f4"+
		"{\2\u0314\u0312\3\2\2\2\u0314\u0315\3\2\2\2\u0315\u0325\3\2\2\2\u0316"+
		"\u0317\7P\2\2\u0317\u0326\5\u009aN\2\u0318\u0319\5\u0098M\2\u0319\u031a"+
		"\5\u009aN\2\u031a\u0326\3\2\2\2\u031b\u031c\7=\2\2\u031c\u031d\7\27\2"+
		"\2\u031d\u031e\5\u009aN\2\u031e\u031f\5Z.\2\u031f\u0326\3\2\2\2\u0320"+
		"\u0321\7\61\2\2\u0321\u0322\7\u00d2\2\2\u0322\u0323\5\u00a0Q\2\u0323\u0324"+
		"\7\u00d3\2\2\u0324\u0326\3\2\2\2\u0325\u0316\3\2\2\2\u0325\u0318\3\2\2"+
		"\2\u0325\u031b\3\2\2\2\u0325\u0320\3\2\2\2\u0326\u032a\3\2\2\2\u0327\u0329"+
		"\5\\/\2\u0328\u0327\3\2\2\2\u0329\u032c\3\2\2\2\u032a\u0328\3\2\2\2\u032a"+
		"\u032b\3\2\2\2\u032bi\3\2\2\2\u032c\u032a\3\2\2\2\u032d\u032e\7\u00a3"+
		"\2\2\u032e\u032f\7<\2\2\u032f\u0330\7\u00d2\2\2\u0330\u0331\5\u00d4k\2"+
		"\u0331\u0332\7\u00d3\2\2\u0332\u0333\7\26\2\2\u0333\u0334\5\u008aF\2\u0334"+
		"\u034b\3\2\2\2\u0335\u0336\7\u009a\2\2\u0336\u0337\7\u00d2\2\2\u0337\u0338"+
		"\5\u00d4k\2\u0338\u0339\7\u00d3\2\2\u0339\u033a\7*\2\2\u033a\u033b\7\u00a0"+
		"\2\2\u033b\u034b\3\2\2\2\u033c\u033d\7\64\2\2\u033d\u033f\5\u00f4{\2\u033e"+
		"\u033c\3\2\2\2\u033e\u033f\3\2\2\2\u033f\u0340\3\2\2\2\u0340\u0341\7="+
		"\2\2\u0341\u0342\7\27\2\2\u0342\u0343\5\u00d8m\2\u0343\u0347\5Z.\2\u0344"+
		"\u0346\5\\/\2\u0345\u0344\3\2\2\2\u0346\u0349\3\2\2\2\u0347\u0345\3\2"+
		"\2\2\u0347\u0348\3\2\2\2\u0348\u034b\3\2\2\2\u0349\u0347\3\2\2\2\u034a"+
		"\u032d\3\2\2\2\u034a\u0335\3\2\2\2\u034a\u033e\3\2\2\2\u034bk\3\2\2\2"+
		"\u034c\u034d\7\u00af\2\2\u034d\u034f\7\u00e0\2\2\u034e\u034c\3\2\2\2\u034e"+
		"\u034f\3\2\2\2\u034f\u0353\3\2\2\2\u0350\u0351\7|\2\2\u0351\u0352\7\13"+
		"\2\2\u0352\u0354\7\u00e0\2\2\u0353\u0350\3\2\2\2\u0353\u0354\3\2\2\2\u0354"+
		"\u0356\3\2\2\2\u0355\u0357\7\u00e0\2\2\u0356\u0355\3\2\2\2\u0356\u0357"+
		"\3\2\2\2\u0357\u035c\3\2\2\2\u0358\u035a\7B\2\2\u0359\u0358\3\2\2\2\u0359"+
		"\u035a\3\2\2\2\u035a\u035b\3\2\2\2\u035b\u035d\7\u00a1\2\2\u035c\u0359"+
		"\3\2\2\2\u035c\u035d\3\2\2\2\u035dm\3\2\2\2\u035e\u0363\5p9\2\u035f\u0360"+
		"\7\u00d8\2\2\u0360\u0362\5p9\2\u0361\u035f\3\2\2\2\u0362\u0365\3\2\2\2"+
		"\u0363\u0361\3\2\2\2\u0363\u0364\3\2\2\2\u0364o\3\2\2\2\u0365\u0363\3"+
		"\2\2\2\u0366\u0369\5\u008cG\2\u0367\u0369\5\u00ccg\2\u0368\u0366\3\2\2"+
		"\2\u0368\u0367\3\2\2\2\u0369\u036c\3\2\2\2\u036a\u036b\7\67\2\2\u036b"+
		"\u036d\5\u00a0Q\2\u036c\u036a\3\2\2\2\u036c\u036d\3\2\2\2\u036d\u0377"+
		"\3\2\2\2\u036e\u0370\5X-\2\u036f\u036e\3\2\2\2\u0370\u0373\3\2\2\2\u0371"+
		"\u036f\3\2\2\2\u0371\u0372\3\2\2\2\u0372\u0378\3\2\2\2\u0373\u0371\3\2"+
		"\2\2\u0374\u0376\5f\64\2\u0375\u0374\3\2\2\2\u0375\u0376\3\2\2\2\u0376"+
		"\u0378\3\2\2\2\u0377\u0371\3\2\2\2\u0377\u0375\3\2\2\2\u0378\u037c\3\2"+
		"\2\2\u0379\u037c\5h\65\2\u037a\u037c\5j\66\2\u037b\u0368\3\2\2\2\u037b"+
		"\u0379\3\2\2\2\u037b\u037a\3\2\2\2\u037cq\3\2\2\2\u037d\u037f\5t;\2\u037e"+
		"\u037d\3\2\2\2\u037f\u0380\3\2\2\2\u0380\u037e\3\2\2\2\u0380\u0381\3\2"+
		"\2\2\u0381s\3\2\2\2\u0382\u0383\5v<\2\u0383u\3\2\2\2\u0384\u0385\7\62"+
		"\2\2\u0385\u0386\5\u008cG\2\u0386\u0387\5x=\2\u0387w\3\2\2\2\u0388\u038a"+
		"\7u\2\2\u0389\u0388\3\2\2\2\u0389\u038a\3\2\2\2\u038a\u038b\3\2\2\2\u038b"+
		"\u038c\7\26\2\2\u038c\u038e\7\u0095\2\2\u038d\u038f\7\u00ad\2\2\u038e"+
		"\u038d\3\2\2\2\u038e\u038f\3\2\2\2\u038f\u0390\3\2\2\2\u0390\u0392\7\u00d2"+
		"\2\2\u0391\u0393\7\u0096\2\2\u0392\u0391\3\2\2\2\u0392\u0393\3\2\2\2\u0393"+
		"\u0394\3\2\2\2\u0394\u0395\5\u00dep\2\u0395\u0396\7\u00d3\2\2\u0396\u039f"+
		"\3\2\2\2\u0397\u0399\7\33\2\2\u0398\u0397\3\2\2\2\u0398\u0399\3\2\2\2"+
		"\u0399\u039a\3\2\2\2\u039a\u039b\7\u00a7\2\2\u039b\u039c\7g\2\2\u039c"+
		"\u039d\7\5\2\2\u039d\u039f\7\u0084\2\2\u039e\u0389\3\2\2\2\u039e\u0398"+
		"\3\2\2\2\u039fy\3\2\2\2\u03a0\u03a2\7\65\2\2\u03a1\u03a3\t\5\2\2\u03a2"+
		"\u03a1\3\2\2\2\u03a2\u03a3\3\2\2\2\u03a3\u03a4\3\2\2\2\u03a4\u03a5\7A"+
		"\2\2\u03a5\u03a6\5\u008eH\2\u03a6\u03a9\7C\2\2\u03a7\u03aa\5|?\2\u03a8"+
		"\u03aa\5\u0080A\2\u03a9\u03a7\3\2\2\2\u03a9\u03a8\3\2\2\2\u03aa{\3\2\2"+
		"\2\u03ab\u03ad\5\u008aF\2\u03ac\u03ae\5\u0094K\2\u03ad\u03ac\3\2\2\2\u03ad"+
		"\u03ae\3\2\2\2\u03ae\u03af\3\2\2\2\u03af\u03b0\7\u00d2\2\2\u03b0\u03b5"+
		"\5~@\2\u03b1\u03b2\7\u00d8\2\2\u03b2\u03b4\5~@\2\u03b3\u03b1\3\2\2\2\u03b4"+
		"\u03b7\3\2\2\2\u03b5\u03b3\3\2\2\2\u03b5\u03b6\3\2\2\2\u03b6\u03b8\3\2"+
		"\2\2\u03b7\u03b5\3\2\2\2\u03b8\u03b9\7\u00d3\2\2\u03b9}\3\2\2\2\u03ba"+
		"\u03bd\5\u008cG\2\u03bb\u03bd\5\u00a0Q\2\u03bc\u03ba\3\2\2\2\u03bc\u03bb"+
		"\3\2\2\2\u03bd\u03bf\3\2\2\2\u03be\u03c0\t\6\2\2\u03bf\u03be\3\2\2\2\u03bf"+
		"\u03c0\3\2\2\2\u03c0\177\3\2\2\2\u03c1\u03c2\5\u008aF\2\u03c2\u03c3\7"+
		"\u00d2\2\2\u03c3\u03c8\5\u0082B\2\u03c4\u03c5\7\u00d8\2\2\u03c5\u03c7"+
		"\5\u0082B\2\u03c6\u03c4\3\2\2\2\u03c7\u03ca\3\2\2\2\u03c8\u03c6\3\2\2"+
		"\2\u03c8\u03c9\3\2\2\2\u03c9\u03cb\3\2\2\2\u03ca\u03c8\3\2\2\2\u03cb\u03cc"+
		"\7\u00d3\2\2\u03cc\u03cd\7\22\2\2\u03cd\u03cf\5\u008aF\2\u03ce\u03d0\5"+
		"\u0094K\2\u03cf\u03ce\3\2\2\2\u03cf\u03d0\3\2\2\2\u03d0\u03d8\3\2\2\2"+
		"\u03d1\u03d2\7\u00d8\2\2\u03d2\u03d4\5\u008aF\2\u03d3\u03d5\5\u0094K\2"+
		"\u03d4\u03d3\3\2\2\2\u03d4\u03d5\3\2\2\2\u03d5\u03d7\3\2\2\2\u03d6\u03d1"+
		"\3\2\2\2\u03d7\u03da\3\2\2\2\u03d8\u03d6\3\2\2\2\u03d8\u03d9\3\2\2\2\u03d9"+
		"\u03db\3\2\2\2\u03da\u03d8\3\2\2\2\u03db\u03dc\7)\2\2\u03dc\u03dd\5\u00a0"+
		"Q\2\u03dd\u0081\3\2\2\2\u03de\u03e0\5\u008aF\2\u03df\u03e1\5\u0094K\2"+
		"\u03e0\u03df\3\2\2\2\u03e0\u03e1\3\2\2\2\u03e1\u03e2\3\2\2\2\u03e2\u03e4"+
		"\5\u008cG\2\u03e3\u03e5\t\6\2\2\u03e4\u03e3\3\2\2\2\u03e4\u03e5\3\2\2"+
		"\2\u03e5\u0083\3\2\2\2\u03e6\u03e7\7:\2\2\u03e7\u03e8\7A\2\2\u03e8\u03e9"+
		"\5\u008eH\2\u03e9\u0085\3\2\2\2\u03ea\u03eb\7-\2\2\u03eb\u03ec\7A\2\2"+
		"\u03ec\u03f0\5\u008eH\2\u03ed\u03ee\7\u009d\2\2\u03ee\u03ef\7M\2\2\u03ef"+
		"\u03f1\5\u008eH\2\u03f0\u03ed\3\2\2\2\u03f0\u03f1\3\2\2\2\u03f1\u0087"+
		"\3\2\2\2\u03f2\u03f3\7\u00df\2\2\u03f3\u0089\3\2\2\2\u03f4\u03f5\5\u0090"+
		"I\2\u03f5\u008b\3\2\2\2\u03f6\u03f7\5\u0090I\2\u03f7\u008d\3\2\2\2\u03f8"+
		"\u03f9\5\u0090I\2\u03f9\u008f\3\2\2\2\u03fa\u0404\7\u00df\2\2\u03fb\u03fc"+
		"\7\u00e0\2\2\u03fc\u03fe\7\u00c7\2\2\u03fd\u03fb\3\2\2\2\u03fe\u0401\3"+
		"\2\2\2\u03ff\u03fd\3\2\2\2\u03ff\u0400\3\2\2\2\u0400\u0402\3\2\2\2\u0401"+
		"\u03ff\3\2\2\2\u0402\u0404\7\u00e0\2\2\u0403\u03fa\3\2\2\2\u0403\u03ff"+
		"\3\2\2\2\u0404\u0091\3\2\2\2\u0405\u0406\t\7\2\2\u0406\u0093\3\2\2\2\u0407"+
		"\u0408\7\u00df\2\2\u0408\u0095\3\2\2\2\u0409\u040f\7\u00d2\2\2\u040a\u040d"+
		"\7\u00e1\2\2\u040b\u040c\7\u00d8\2\2\u040c\u040e\7\u00e1\2\2\u040d\u040b"+
		"\3\2\2\2\u040d\u040e\3\2\2\2\u040e\u0410\3\2\2\2\u040f\u040a\3\2\2\2\u040f"+
		"\u0410\3\2\2\2\u0410\u0411\3\2\2\2\u0411\u0412\7\u00d3\2\2\u0412\u0097"+
		"\3\2\2\2\u0413\u0415\7\37\2\2\u0414\u0413\3\2\2\2\u0414\u0415\3\2\2\2"+
		"\u0415\u0416\3\2\2\2\u0416\u0417\7\27\2\2\u0417\u0099\3\2\2\2\u0418\u0419"+
		"\7\u00d2\2\2\u0419\u041e\5\u008cG\2\u041a\u041b\7\u00d8\2\2\u041b\u041d"+
		"\5\u008cG\2\u041c\u041a\3\2\2\2\u041d\u0420\3\2\2\2\u041e\u041c\3\2\2"+
		"\2\u041e\u041f\3\2\2\2\u041f\u0421\3\2\2\2\u0420\u041e\3\2\2\2\u0421\u0422"+
		"\7\u00d3\2\2\u0422\u009b\3\2\2\2\u0423\u0428\5\u00a0Q\2\u0424\u0425\7"+
		"\u00d8\2\2\u0425\u0427\5\u00a0Q\2\u0426\u0424\3\2\2\2\u0427\u042a\3\2"+
		"\2\2\u0428\u0426\3\2\2\2\u0428\u0429\3\2\2\2\u0429\u009d\3\2\2\2\u042a"+
		"\u0428\3\2\2\2\u042b\u042c\7\u00d2\2\2\u042c\u042d\5\u009cO\2\u042d\u042e"+
		"\7\u00d3\2\2\u042e\u009f\3\2\2\2\u042f\u0430\bQ\1\2\u0430\u0431\7\u00d2"+
		"\2\2\u0431\u0432\5\u00a0Q\2\u0432\u0433\7\u00d3\2\2\u0433\u043b\3\2\2"+
		"\2\u0434\u0435\7\33\2\2\u0435\u043b\5\u00a0Q\b\u0436\u0437\7\u00b9\2\2"+
		"\u0437\u043b\5\u00a0Q\7\u0438\u043b\5\u00a4S\2\u0439\u043b\5\u00a2R\2"+
		"\u043a\u042f\3\2\2\2\u043a\u0434\3\2\2\2\u043a\u0436\3\2\2\2\u043a\u0438"+
		"\3\2\2\2\u043a\u0439\3\2\2\2\u043b\u044d\3\2\2\2\u043c\u043d\f\f\2\2\u043d"+
		"\u043e\7\6\2\2\u043e\u044c\5\u00a0Q\r\u043f\u0440\f\13\2\2\u0440\u0441"+
		"\7\u00b7\2\2\u0441\u044c\5\u00a0Q\f\u0442\u0443\f\n\2\2\u0443\u0444\7"+
		"+\2\2\u0444\u044c\5\u00a0Q\13\u0445\u0446\f\6\2\2\u0446\u0447\7\35\2\2"+
		"\u0447\u044c\5\u00a0Q\7\u0448\u0449\f\5\2\2\u0449\u044a\7\u00b8\2\2\u044a"+
		"\u044c\5\u00a0Q\6\u044b\u043c\3\2\2\2\u044b\u043f\3\2\2\2\u044b\u0442"+
		"\3\2\2\2\u044b\u0445\3\2\2\2\u044b\u0448\3\2\2\2\u044c\u044f\3\2\2\2\u044d"+
		"\u044b\3\2\2\2\u044d\u044e\3\2\2\2\u044e\u00a1\3\2\2\2\u044f\u044d\3\2"+
		"\2\2\u0450\u0451\7\u0098\2\2\u0451\u0452\5\u00a0Q\2\u0452\u00a3\3\2\2"+
		"\2\u0453\u0454\bS\1\2\u0454\u0455\5\u00a8U\2\u0455\u046a\3\2\2\2\u0456"+
		"\u0457\f\7\2\2\u0457\u0459\7\26\2\2\u0458\u045a\7\33\2\2\u0459\u0458\3"+
		"\2\2\2\u0459\u045a\3\2\2\2\u045a\u045b\3\2\2\2\u045b\u0469\t\b\2\2\u045c"+
		"\u045d\f\6\2\2\u045d\u045e\7\u00c9\2\2\u045e\u0469\5\u00a8U\2\u045f\u0460"+
		"\f\5\2\2\u0460\u0461\5\u00a6T\2\u0461\u0462\5\u00a8U\2\u0462\u0469\3\2"+
		"\2\2\u0463\u0464\f\4\2\2\u0464\u0465\5\u00a6T\2\u0465\u0466\t\t\2\2\u0466"+
		"\u0467\5\u00c2b\2\u0467\u0469\3\2\2\2\u0468\u0456\3\2\2\2\u0468\u045c"+
		"\3\2\2\2\u0468\u045f\3\2\2\2\u0468\u0463\3\2\2\2\u0469\u046c\3\2\2\2\u046a"+
		"\u0468\3\2\2\2\u046a\u046b\3\2\2\2\u046b\u00a5\3\2\2\2\u046c\u046a\3\2"+
		"\2\2\u046d\u046e\t\n\2\2\u046e\u00a7\3\2\2\2\u046f\u0471\5\u00aaV\2\u0470"+
		"\u0472\7\33\2\2\u0471\u0470\3\2\2\2\u0471\u0472\3\2\2\2\u0472\u0473\3"+
		"\2\2\2\u0473\u0474\7\25\2\2\u0474\u0475\5\u00c2b\2\u0475\u04aa\3\2\2\2"+
		"\u0476\u0478\5\u00aaV\2\u0477\u0479\7\33\2\2\u0478\u0477\3\2\2\2\u0478"+
		"\u0479\3\2\2\2\u0479\u047a\3\2\2\2\u047a\u047b\7\25\2\2\u047b\u047c\7"+
		"\u00d2\2\2\u047c\u0481\5\u00acW\2\u047d\u047e\7\u00d8\2\2\u047e\u0480"+
		"\5\u00acW\2\u047f\u047d\3\2\2\2\u0480\u0483\3\2\2\2\u0481\u047f\3\2\2"+
		"\2\u0481\u0482\3\2\2\2\u0482\u0484\3\2\2\2\u0483\u0481\3\2\2\2\u0484\u0485"+
		"\7\u00d3\2\2\u0485\u04aa\3\2\2\2\u0486\u0488\5\u00aaV\2\u0487\u0489\7"+
		"\33\2\2\u0488\u0487\3\2\2\2\u0488\u0489\3\2\2\2\u0489\u048a\3\2\2\2\u048a"+
		"\u048b\7\t\2\2\u048b\u048c\5\u00acW\2\u048c\u048d\7\6\2\2\u048d\u048e"+
		"\5\u00a8U\2\u048e\u04aa\3\2\2\2\u048f\u0490\5\u00aaV\2\u0490\u0491\7#"+
		"\2\2\u0491\u0492\7\30\2\2\u0492\u0493\5\u00acW\2\u0493\u04aa\3\2\2\2\u0494"+
		"\u0496\5\u00aaV\2\u0495\u0497\7\33\2\2\u0496\u0495\3\2\2\2\u0496\u0497"+
		"\3\2\2\2\u0497\u0498\3\2\2\2\u0498\u0499\7\30\2\2\u0499\u049e\5\u00ac"+
		"W\2\u049a\u049b\7\17\2\2\u049b\u049d\5\u00acW\2\u049c\u049a\3\2\2\2\u049d"+
		"\u04a0\3\2\2\2\u049e\u049c\3\2\2\2\u049e\u049f\3\2\2\2\u049f\u04aa\3\2"+
		"\2\2\u04a0\u049e\3\2\2\2\u04a1\u04a3\5\u00aaV\2\u04a2\u04a4\7\33\2\2\u04a3"+
		"\u04a2\3\2\2\2\u04a3\u04a4\3\2\2\2\u04a4\u04a5\3\2\2\2\u04a5\u04a6\7 "+
		"\2\2\u04a6\u04a7\5\u00acW\2\u04a7\u04aa\3\2\2\2\u04a8\u04aa\5\u00aaV\2"+
		"\u04a9\u046f\3\2\2\2\u04a9\u0476\3\2\2\2\u04a9\u0486\3\2\2\2\u04a9\u048f"+
		"\3\2\2\2\u04a9\u0494\3\2\2\2\u04a9\u04a1\3\2\2\2\u04a9\u04a8\3\2\2\2\u04aa"+
		"\u00a9\3\2\2\2\u04ab\u04ac\bV\1\2\u04ac\u04ad\5\u00acW\2\u04ad\u04d7\3"+
		"\2\2\2\u04ae\u04af\f\20\2\2\u04af\u04b0\7\u00bb\2\2\u04b0\u04d6\5\u00aa"+
		"V\21\u04b1\u04b2\f\17\2\2\u04b2\u04b3\7\u00bc\2\2\u04b3\u04d6\5\u00aa"+
		"V\20\u04b4\u04b5\f\16\2\2\u04b5\u04b6\7\u00bd\2\2\u04b6\u04d6\5\u00aa"+
		"V\17\u04b7\u04b8\f\r\2\2\u04b8\u04b9\7\u00be\2\2\u04b9\u04d6\5\u00aaV"+
		"\16\u04ba\u04bb\f\f\2\2\u04bb\u04bc\7\u00c2\2\2\u04bc\u04d6\5\u00aaV\r"+
		"\u04bd\u04be\f\13\2\2\u04be\u04bf\7\u00c3\2\2\u04bf\u04d6\5\u00aaV\f\u04c0"+
		"\u04c1\f\n\2\2\u04c1\u04c2\7\u00c4\2\2\u04c2\u04d6\5\u00aaV\13\u04c3\u04c4"+
		"\f\t\2\2\u04c4\u04c5\7\u00c5\2\2\u04c5\u04d6\5\u00aaV\n\u04c6\u04c7\f"+
		"\b\2\2\u04c7\u04c8\7\32\2\2\u04c8\u04d6\5\u00aaV\t\u04c9\u04ca\f\7\2\2"+
		"\u04ca\u04cb\7\u00c0\2\2\u04cb\u04d6\5\u00aaV\b\u04cc\u04cd\f\6\2\2\u04cd"+
		"\u04ce\7\u00bf\2\2\u04ce\u04d6\5\u00aaV\7\u04cf\u04d0\f\5\2\2\u04d0\u04d1"+
		"\7\u00c2\2\2\u04d1\u04d6\5\u00b2Z\2\u04d2\u04d3\f\4\2\2\u04d3\u04d4\7"+
		"\u00c3\2\2\u04d4\u04d6\5\u00b2Z\2\u04d5\u04ae\3\2\2\2\u04d5\u04b1\3\2"+
		"\2\2\u04d5\u04b4\3\2\2\2\u04d5\u04b7\3\2\2\2\u04d5\u04ba\3\2\2\2\u04d5"+
		"\u04bd\3\2\2\2\u04d5\u04c0\3\2\2\2\u04d5\u04c3\3\2\2\2\u04d5\u04c6\3\2"+
		"\2\2\u04d5\u04c9\3\2\2\2\u04d5\u04cc\3\2\2\2\u04d5\u04cf\3\2\2\2\u04d5"+
		"\u04d2\3\2\2\2\u04d6\u04d9\3\2\2\2\u04d7\u04d5\3\2\2\2\u04d7\u04d8\3\2"+
		"\2\2\u04d8\u00ab\3\2\2\2\u04d9\u04d7\3\2\2\2\u04da\u04db\bW\1\2\u04db"+
		"\u04f3\5\u00aeX\2\u04dc\u04f3\5\u00ba^\2\u04dd\u04f3\5\u008cG\2\u04de"+
		"\u04f3\5\u00b8]\2\u04df\u04e0\7\u00c2\2\2\u04e0\u04f3\5\u00acW\16\u04e1"+
		"\u04e2\7\u00c3\2\2\u04e2\u04f3\5\u00acW\r\u04e3\u04e4\7\u00ba\2\2\u04e4"+
		"\u04f3\5\u00acW\f\u04e5\u04e6\7\u00b9\2\2\u04e6\u04f3\5\u00acW\13\u04e7"+
		"\u04e8\7\n\2\2\u04e8\u04f3\5\u00acW\n\u04e9\u04f3\5\u009eP\2\u04ea\u04eb"+
		"\7!\2\2\u04eb\u04f3\5\u009eP\2\u04ec\u04f3\5\u00c2b\2\u04ed\u04ee\7\20"+
		"\2\2\u04ee\u04f3\5\u00c2b\2\u04ef\u04f3\5\u00b4[\2\u04f0\u04f3\5\u00b2"+
		"Z\2\u04f1\u04f3\5\u00b6\\\2\u04f2\u04da\3\2\2\2\u04f2\u04dc\3\2\2\2\u04f2"+
		"\u04dd\3\2\2\2\u04f2\u04de\3\2\2\2\u04f2\u04df\3\2\2\2\u04f2\u04e1\3\2"+
		"\2\2\u04f2\u04e3\3\2\2\2\u04f2\u04e5\3\2\2\2\u04f2\u04e7\3\2\2\2\u04f2"+
		"\u04e9\3\2\2\2\u04f2\u04ea\3\2\2\2\u04f2\u04ec\3\2\2\2\u04f2\u04ed\3\2"+
		"\2\2\u04f2\u04ef\3\2\2\2\u04f2\u04f0\3\2\2\2\u04f2\u04f1\3\2\2\2\u04f3"+
		"\u04fb\3\2\2\2\u04f4\u04f5\f\17\2\2\u04f5\u04f6\7\u00b7\2\2\u04f6\u04fa"+
		"\5\u00acW\20\u04f7\u04f8\f\21\2\2\u04f8\u04fa\5\u00c4c\2\u04f9\u04f4\3"+
		"\2\2\2\u04f9\u04f7\3\2\2\2\u04fa\u04fd\3\2\2\2\u04fb\u04f9\3\2\2\2\u04fb"+
		"\u04fc\3\2\2\2\u04fc\u00ad\3\2\2\2\u04fd\u04fb\3\2\2\2\u04fe\u04ff\7\u00df"+
		"\2\2\u04ff\u0501\7\u00d2\2\2\u0500\u0502\5\u00b0Y\2\u0501\u0500\3\2\2"+
		"\2\u0501\u0502\3\2\2\2\u0502\u0505\3\2\2\2\u0503\u0506\5\u009cO\2\u0504"+
		"\u0506\7\u00c4\2\2\u0505\u0503\3\2\2\2\u0505\u0504\3\2\2\2\u0505\u0506"+
		"\3\2\2\2\u0506\u0507\3\2\2\2\u0507\u0508\7\u00d3\2\2\u0508\u00af\3\2\2"+
		"\2\u0509\u050a\7\16\2\2\u050a\u00b1\3\2\2\2\u050b\u050c\5\u00f8}\2\u050c"+
		"\u00b3\3\2\2\2\u050d\u050e\5\u00f8}\2\u050e\u00b5\3\2\2\2\u050f\u0515"+
		"\5\u00e2r\2\u0510\u0515\5\u00e4s\2\u0511\u0515\5\u00eex\2\u0512\u0515"+
		"\5\u00f0y\2\u0513\u0515\5\u00f2z\2\u0514\u050f\3\2\2\2\u0514\u0510\3\2"+
		"\2\2\u0514\u0511\3\2\2\2\u0514\u0512\3\2\2\2\u0514\u0513\3\2\2\2\u0515"+
		"\u00b7\3\2\2\2\u0516\u0517\5\u00f8}\2\u0517\u00b9\3\2\2\2\u0518\u0532"+
		"\5\u00bc_\2\u0519\u0532\5\u00be`\2\u051a\u0532\7&\2\2\u051b\u0532\7\21"+
		"\2\2\u051c\u0532\7\34\2\2\u051d\u051e\7\u00d4\2\2\u051e\u051f\7\u00df"+
		"\2\2\u051f\u0520\7\u00e0\2\2\u0520\u0532\7\u00d5\2\2\u0521\u0532\7\u00e2"+
		"\2\2\u0522\u0532\5\u00c0a\2\u0523\u0524\7\u00df\2\2\u0524\u0526\7\u00e0"+
		"\2\2\u0525\u0527\5\u00c4c\2\u0526\u0525\3\2\2\2\u0526\u0527\3\2\2\2\u0527"+
		"\u0532\3\2\2\2\u0528\u0529\t\13\2\2\u0529\u0532\7\u00e0\2\2\u052a\u052c"+
		"\7\u00df\2\2\u052b\u052a\3\2\2\2\u052b\u052c\3\2\2\2\u052c\u052d\3\2\2"+
		"\2\u052d\u052f\7\u00e3\2\2\u052e\u0530\5\u00c4c\2\u052f\u052e\3\2\2\2"+
		"\u052f\u0530\3\2\2\2\u0530\u0532\3\2\2\2\u0531\u0518\3\2\2\2\u0531\u0519"+
		"\3\2\2\2\u0531\u051a\3\2\2\2\u0531\u051b\3\2\2\2\u0531\u051c\3\2\2\2\u0531"+
		"\u051d\3\2\2\2\u0531\u0521\3\2\2\2\u0531\u0522\3\2\2\2\u0531\u0523\3\2"+
		"\2\2\u0531\u0528\3\2\2\2\u0531\u052b\3\2\2\2\u0532\u00bb\3\2\2\2\u0533"+
		"\u0534\7\u00dc\2\2\u0534\u00bd\3\2\2\2\u0535\u0536\7\u00e1\2\2\u0536\u00bf"+
		"\3\2\2\2\u0537\u0538\7\u00e0\2\2\u0538\u00c1\3\2\2\2\u0539\u053a\5\u00f8"+
		"}\2\u053a\u00c3\3\2\2\2\u053b\u053c\5\u00f8}\2\u053c\u00c5\3\2\2\2\u053d"+
		"\u053e\7\36\2\2\u053e\u053f\7\13\2\2\u053f\u0544\5\u00c8e\2\u0540\u0541"+
		"\7\u00d8\2\2\u0541\u0543\5\u00c8e\2\u0542\u0540\3\2\2\2\u0543\u0546\3"+
		"\2\2\2\u0544\u0542\3\2\2\2\u0544\u0545\3\2\2\2\u0545\u00c7\3\2\2\2\u0546"+
		"\u0544\3\2\2\2\u0547\u054b\5\u008cG\2\u0548\u054b\5\u00be`\2\u0549\u054b"+
		"\5\u00a0Q\2\u054a\u0547\3\2\2\2\u054a\u0548\3\2\2\2\u054a\u0549\3\2\2"+
		"\2\u054b\u054d\3\2\2\2\u054c\u054e\t\6\2\2\u054d\u054c\3\2\2\2\u054d\u054e"+
		"\3\2\2\2\u054e\u00c9\3\2\2\2\u054f\u0550\7\u00c4\2\2\u0550\u00cb\3\2\2"+
		"\2\u0551\u0552\5\u0090I\2\u0552\u00cd\3\2\2\2\u0553\u0554\7\u00df\2\2"+
		"\u0554\u00cf\3\2\2\2\u0555\u0556\7\u00d2\2\2\u0556\u0557\5\u00d2j\2\u0557"+
		"\u0558\7\u00d3\2\2\u0558\u00d1\3\2\2\2\u0559\u055e\5\u00acW\2\u055a\u055b"+
		"\7\u00d8\2\2\u055b\u055d\5\u00acW\2\u055c\u055a\3\2\2\2\u055d\u0560\3"+
		"\2\2\2\u055e\u055c\3\2\2\2\u055e\u055f\3\2\2\2\u055f\u00d3\3\2\2\2\u0560"+
		"\u055e\3\2\2\2\u0561\u0564\5\u00ccg\2\u0562\u0564\5\u008cG\2\u0563\u0561"+
		"\3\2\2\2\u0563\u0562\3\2\2\2\u0564\u00d5\3\2\2\2\u0565\u056a\5\u00d4k"+
		"\2\u0566\u0567\7\u00d8\2\2\u0567\u0569\5\u00d4k\2\u0568\u0566\3\2\2\2"+
		"\u0569\u056c\3\2\2\2\u056a\u0568\3\2\2\2\u056a\u056b\3\2\2\2\u056b\u00d7"+
		"\3\2\2\2\u056c\u056a\3\2\2\2\u056d\u056e\7\u00d2\2\2\u056e\u056f\5\u00d6"+
		"l\2\u056f\u0570\7\u00d3\2\2\u0570\u00d9\3\2\2\2\u0571\u0573\5\u00dep\2"+
		"\u0572\u0574\5\u0096L\2\u0573\u0572\3\2\2\2\u0573\u0574\3\2\2\2\u0574"+
		"\u057d\3\2\2\2\u0575\u057d\5\u00dco\2\u0576\u0578\5\u00dep\2\u0577\u0579"+
		"\5\u0096L\2\u0578\u0577\3\2\2\2\u0578\u0579\3\2\2\2\u0579\u057a\3\2\2"+
		"\2\u057a\u057b\5\u00e0q\2\u057b\u057d\3\2\2\2\u057c\u0571\3\2\2\2\u057c"+
		"\u0575\3\2\2\2\u057c\u0576\3\2\2\2\u057d\u00db\3\2\2\2\u057e\u057f\5\u00de"+
		"p\2\u057f\u0580\7\u00d2\2\2\u0580\u0581\7\u00e1\2\2\u0581\u0582\7\u00df"+
		"\2\2\u0582\u0583\7\u00d3\2\2\u0583\u0596\3\2\2\2\u0584\u0585\7\u008c\2"+
		"\2\u0585\u0587\5\u00dep\2\u0586\u0588\7\u00b2\2\2\u0587\u0586\3\2\2\2"+
		"\u0587\u0588\3\2\2\2\u0588\u0589\3\2\2\2\u0589\u058a\7\u00d2\2\2\u058a"+
		"\u058b\7\u00e1\2\2\u058b\u058c\7\u00d3\2\2\u058c\u0596\3\2\2\2\u058d\u058f"+
		"\5\u00dep\2\u058e\u0590\7\u00d2\2\2\u058f\u058e\3\2\2\2\u058f\u0590\3"+
		"\2\2\2\u0590\u0591\3\2\2\2\u0591\u0593\5\u008cG\2\u0592\u0594\7\u00d3"+
		"\2\2\u0593\u0592\3\2\2\2\u0593\u0594\3\2\2\2\u0594\u0596\3\2\2\2\u0595"+
		"\u057e\3\2\2\2\u0595\u0584\3\2\2\2\u0595\u058d\3\2\2\2\u0596\u00dd\3\2"+
		"\2\2\u0597\u0598\7\u00df\2\2\u0598\u059b\7\u00df\2\2\u0599\u059b\7\u00df"+
		"\2\2\u059a\u0597\3\2\2\2\u059a\u0599\3\2\2\2\u059b\u00df\3\2\2\2\u059c"+
		"\u059e\7*\2\2\u059d\u059f\7\u0085\2\2\u059e\u059d\3\2\2\2\u059e\u059f"+
		"\3\2\2\2\u059f\u05a0\3\2\2\2\u05a0\u05a1\7$\2\2\u05a1\u05a3\7\u00b5\2"+
		"\2\u05a2\u059c\3\2\2\2\u05a2\u05a3\3\2\2\2\u05a3\u05ae\3\2\2\2\u05a4\u05a5"+
		"\7M\2\2\u05a5\u05ae\7\u008b\2\2\u05a6\u05a7\7M\2\2\u05a7\u05ab\7\u00a4"+
		"\2\2\u05a8\u05a9\7\u00d2\2\2\u05a9\u05aa\7\u00e1\2\2\u05aa\u05ac\7\u00d3"+
		"\2\2\u05ab\u05a8\3\2\2\2\u05ab\u05ac\3\2\2\2\u05ac\u05ae\3\2\2\2\u05ad"+
		"\u05a2\3\2\2\2\u05ad\u05a4\3\2\2\2\u05ad\u05a6\3\2\2\2\u05ae\u00e1\3\2"+
		"\2\2\u05af\u05b0\7\u00ac\2\2\u05b0\u05b1\7\u00d2\2\2\u05b1\u05b2\5\u00a0"+
		"Q\2\u05b2\u05b4\7/\2\2\u05b3\u05b5\7\u009a\2\2\u05b4\u05b3\3\2\2\2\u05b4"+
		"\u05b5\3\2\2\2\u05b5\u05b6\3\2\2\2\u05b6\u05b7\5\u00dep\2\u05b7\u05b8"+
		"\7\u00d3\2\2\u05b8\u00e3\3\2\2\2\u05b9\u05bc\7j\2\2\u05ba\u05bd\5\u00e6"+
		"t\2\u05bb\u05bd\5\u00e8u\2\u05bc\u05ba\3\2\2\2\u05bc\u05bb\3\2\2\2\u05bd"+
		"\u05bf\3\2\2\2\u05be\u05c0\5\u00eav\2\u05bf\u05be\3\2\2\2\u05bf\u05c0"+
		"\3\2\2\2\u05c0\u05c1\3\2\2\2\u05c1\u05c2\7x\2\2\u05c2\u00e5\3\2\2\2\u05c3"+
		"\u05c5\5\u00a0Q\2\u05c4\u05c6\5\u00e8u\2\u05c5\u05c4\3\2\2\2\u05c6\u05c7"+
		"\3\2\2\2\u05c7\u05c5\3\2\2\2\u05c7\u05c8\3\2\2\2\u05c8\u00e7\3\2\2\2\u05c9"+
		"\u05ca\7\u00b4\2\2\u05ca\u05cb\5\u00a0Q\2\u05cb\u05cc\7\u00aa\2\2\u05cc"+
		"\u05cd\5\u00acW\2\u05cd\u00e9\3\2\2\2\u05ce\u05cf\7v\2\2\u05cf\u05d0\5"+
		"\u00a0Q\2\u05d0\u00eb\3\2\2\2\u05d1\u05d2\5\u00a0Q\2\u05d2\u05db\7g\2"+
		"\2\u05d3\u05dc\7\u0085\2\2\u05d4\u05d5\7$\2\2\u05d5\u05d9\7\u00b5\2\2"+
		"\u05d6\u05da\7\u00e0\2\2\u05d7\u05da\7o\2\2\u05d8\u05da\5\u00a0Q\2\u05d9"+
		"\u05d6\3\2\2\2\u05d9\u05d7\3\2\2\2\u05d9\u05d8\3\2\2\2\u05da\u05dc\3\2"+
		"\2\2\u05db\u05d3\3\2\2\2\u05db\u05d4\3\2\2\2\u05dc\u00ed\3\2\2\2\u05dd"+
		"\u05de\7\u00d2\2\2\u05de\u05df\5\u00a0Q\2\u05df\u05e0\7\u00c3\2\2\u05e0"+
		"\u05e1\5\u00a0Q\2\u05e1\u05f7\7\u00d3\2\2\u05e2\u05e6\7\66\2\2\u05e3\u05e4"+
		"\7\u00d2\2\2\u05e4\u05e5\7\u00e1\2\2\u05e5\u05e7\7\u00d3\2\2\u05e6\u05e3"+
		"\3\2\2\2\u05e6\u05e7\3\2\2\2\u05e7\u05e8\3\2\2\2\u05e8\u05e9\7M\2\2\u05e9"+
		"\u05ed\7\u00a4\2\2\u05ea\u05eb\7\u00d2\2\2\u05eb\u05ec\7\u00e1\2\2\u05ec"+
		"\u05ee\7\u00d3\2\2\u05ed\u05ea\3\2\2\2\u05ed\u05ee\3\2\2\2\u05ee\u05f8"+
		"\3\2\2\2\u05ef\u05f3\7R\2\2\u05f0\u05f1\7\u00d2\2\2\u05f1\u05f2\7\u00e1"+
		"\2\2\u05f2\u05f4\7\u00d3\2\2\u05f3\u05f0\3\2\2\2\u05f3\u05f4\3\2\2\2\u05f4"+
		"\u05f5\3\2\2\2\u05f5\u05f6\7M\2\2\u05f6\u05f8\7\u008b\2\2\u05f7\u05e2"+
		"\3\2\2\2\u05f7\u05ef\3\2\2\2\u05f8\u00ef\3\2\2\2\u05f9\u05fa\7\u00d2\2"+
		"\2\u05fa\u05fb\5\u00acW\2\u05fb\u05fc\7\u00d3\2\2\u05fc\u05ff\3\2\2\2"+
		"\u05fd\u05ff\5\u00e2r\2\u05fe\u05f9\3\2\2\2\u05fe\u05fd\3\2\2\2\u05ff"+
		"\u0600\3\2\2\2\u0600\u060e\7\u00c7\2\2\u0601\u0606\5\u00ccg\2\u0602\u0603"+
		"\7\u00c7\2\2\u0603\u0605\5\u00ccg\2\u0604\u0602\3\2\2\2\u0605\u0608\3"+
		"\2\2\2\u0606\u0604\3\2\2\2\u0606\u0607\3\2\2\2\u0607\u060b\3\2\2\2\u0608"+
		"\u0606\3\2\2\2\u0609\u060a\7\u00c7\2\2\u060a\u060c\5\u00aeX\2\u060b\u0609"+
		"\3\2\2\2\u060b\u060c\3\2\2\2\u060c\u060f\3\2\2\2\u060d\u060f\5\u00aeX"+
		"\2\u060e\u0601\3\2\2\2\u060e\u060d\3\2\2\2\u060f\u00f1\3\2\2\2\u0610\u0611"+
		"\7\u008d\2\2\u0611\u0612\5\u00dep\2\u0612\u0613\5\u009eP\2\u0613\u00f3"+
		"\3\2\2\2\u0614\u0615\7\u00df\2\2\u0615\u00f5\3\2\2\2\u0616\u061b\5\u00f4"+
		"{\2\u0617\u0618\7\u00d8\2\2\u0618\u061a\5\u00f4{\2\u0619\u0617\3\2\2\2"+
		"\u061a\u061d\3\2\2\2\u061b\u0619\3\2\2\2\u061b\u061c\3\2\2\2\u061c\u00f7"+
		"\3\2\2\2\u061d\u061b\3\2\2\2\u061e\u061f\7\3\2\2\u061f\u00f9\3\2\2\2\u0620"+
		"\u0621\7\"\2\2\u0621\u0622\7N\2\2\u0622\u00fb\3\2\2\2\u0623\u0624\7\63"+
		"\2\2\u0624\u00fd\3\2\2\2\u0625\u0626\7I\2\2\u0626\u00ff\3\2\2\2\u0627"+
		"\u0628\7\u00a2\2\2\u0628\u0101\3\2\2\2\u0629\u062d\7@\2\2\u062a\u062e"+
		"\5\u0106\u0084\2\u062b\u062e\5\u0108\u0085\2\u062c\u062e\5\u010a\u0086"+
		"\2\u062d\u062a\3\2\2\2\u062d\u062b\3\2\2\2\u062d\u062c\3\2\2\2\u062e\u0103"+
		"\3\2\2\2\u062f\u0633\7G\2\2\u0630\u0634\5\u0106\u0084\2\u0631\u0634\5"+
		"\u0108\u0085\2\u0632\u0634\5\u010a\u0086\2\u0633\u0630\3\2\2\2\u0633\u0631"+
		"\3\2\2\2\u0633\u0632\3\2\2\2\u0634\u0105\3\2\2\2\u0635\u0636\5\u010c\u0087"+
		"\2\u0636\u0637\7C\2\2\u0637\u0638\5\u0110\u0089\2\u0638\u0107\3\2\2\2"+
		"\u0639\u063a\5\u0112\u008a\2\u063a\u0109\3\2\2\2\u063b\u063c\5\u00f6|"+
		"\2\u063c\u010b\3\2\2\2\u063d\u063f\5\u010e\u0088\2\u063e\u0640\5\u009a"+
		"N\2\u063f\u063e\3\2\2\2\u063f\u0640\3\2\2\2\u0640\u0648\3\2\2\2\u0641"+
		"\u0642\7\u00d8\2\2\u0642\u0644\5\u010e\u0088\2\u0643\u0645\5\u009aN\2"+
		"\u0644\u0643\3\2\2\2\u0644\u0645\3\2\2\2\u0645\u0647\3\2\2\2\u0646\u0641"+
		"\3\2\2\2\u0647\u064a\3\2\2\2\u0648\u0646\3\2\2\2\u0648\u0649\3\2\2\2\u0649"+
		"\u010d\3\2\2\2\u064a\u0648\3\2\2\2\u064b\u064d\7\5\2\2\u064c\u064e\7D"+
		"\2\2\u064d\u064c\3\2\2\2\u064d\u064e\3\2\2\2\u064e\u066c\3\2\2\2\u064f"+
		"\u066c\7S\2\2\u0650\u066c\7T\2\2\u0651\u066c\78\2\2\u0652\u066c\7U\2\2"+
		"\u0653\u066c\7-\2\2\u0654\u066c\7E\2\2\u0655\u066c\7V\2\2\u0656\u066c"+
		"\7W\2\2\u0657\u066c\7X\2\2\u0658\u066c\7A\2\2\u0659\u066c\7F\2\2\u065a"+
		"\u066c\7Y\2\2\u065b\u066c\7Z\2\2\u065c\u065d\7[\2\2\u065d\u066c\7\\\2"+
		"\2\u065e\u065f\7C\2\2\u065f\u0660\7\63\2\2\u0660\u066c\7]\2\2\u0661\u0662"+
		"\7^\2\2\u0662\u066c\7_\2\2\u0663\u0664\7`\2\2\u0664\u066c\7a\2\2\u0665"+
		"\u0666\7b\2\2\u0666\u066c\7D\2\2\u0667\u0668\7c\2\2\u0668\u066c\7d\2\2"+
		"\u0669\u066a\7e\2\2\u066a\u066c\7f\2\2\u066b\u064b\3\2\2\2\u066b\u064f"+
		"\3\2\2\2\u066b\u0650\3\2\2\2\u066b\u0651\3\2\2\2\u066b\u0652\3\2\2\2\u066b"+
		"\u0653\3\2\2\2\u066b\u0654\3\2\2\2\u066b\u0655\3\2\2\2\u066b\u0656\3\2"+
		"\2\2\u066b\u0657\3\2\2\2\u066b\u0658\3\2\2\2\u066b\u0659\3\2\2\2\u066b"+
		"\u065a\3\2\2\2\u066b\u065b\3\2\2\2\u066b\u065c\3\2\2\2\u066b\u065e\3\2"+
		"\2\2\u066b\u0661\3\2\2\2\u066b\u0663\3\2\2\2\u066b\u0665\3\2\2\2\u066b"+
		"\u0667\3\2\2\2\u066b\u0669\3\2\2\2\u066c\u010f\3\2\2\2\u066d\u067a\7Q"+
		"\2\2\u066e\u067a\7s\2\2\u066f\u067a\7t\2\2\u0670\u0671\7\u0087\2\2\u0671"+
		"\u067a\7\u0089\2\2\u0672\u0673\7d\2\2\u0673\u0674\7\u00ab\2\2\u0674\u067a"+
		"\7\u0099\2\2\u0675\u0676\7\u0083\2\2\u0676\u0677\t\f\2\2\u0677\u067a\5"+
		"\u008aF\2\u0678\u067a\5\u008aF\2\u0679\u066d\3\2\2\2\u0679\u066e\3\2\2"+
		"\2\u0679\u066f\3\2\2\2\u0679\u0670\3\2\2\2\u0679\u0672\3\2\2\2\u0679\u0675"+
		"\3\2\2\2\u0679\u0678\3\2\2\2\u067a\u0111\3\2\2\2\u067b\u067c\7\5\2\2\u067c"+
		"\u067f\7D\2\2\u067d\u067f\5\u00f6|\2\u067e\u067b\3\2\2\2\u067e\u067d\3"+
		"\2\2\2\u067f\u0113\3\2\2\2\u0680\u0681\7\65\2\2\u0681\u0682\7Q\2\2\u0682"+
		"\u0115\3\2\2\2\u0683\u0684\7:\2\2\u0684\u0685\7Q\2\2\u0685\u0117\3\2\2"+
		"\2\u0686\u0687\7-\2\2\u0687\u0688\7Q\2\2\u0688\u0119\3\2\2\2\u0689\u068a"+
		"\7\65\2\2\u068a\u068b\7H\2\2\u068b\u011b\3\2\2\2\u068c\u068d\7:\2\2\u068d"+
		"\u068e\7H\2\2\u068e\u011d\3\2\2\2\u068f\u0690\7-\2\2\u0690\u0691\7H\2"+
		"\2\u0691\u011f\3\2\2\2\u00c2\u0133\u0136\u013b\u0148\u015f\u0165\u016e"+
		"\u0175\u0178\u017c\u0183\u018e\u0191\u0196\u019b\u01a3\u01a9\u01ad\u01b1"+
		"\u01b8\u01bc\u01bf\u01c3\u01c7\u01cc\u01d1\u01d7\u01de\u01e6\u01ea\u01f1"+
		"\u01f5\u01ff\u0204\u0209\u021a\u021c\u0222\u0225\u022c\u022f\u0236\u023b"+
		"\u0245\u0249\u024e\u0250\u0255\u0257\u025c\u0261\u0265\u0269\u026e\u0271"+
		"\u0279\u027b\u0280\u0285\u0287\u028a\u0291\u02a3\u02a7\u02ab\u02b2\u02b7"+
		"\u02bc\u02bf\u02ca\u02cf\u02d5\u02dc\u02de\u02ea\u02ed\u02fe\u0307\u030d"+
		"\u0310\u0314\u0325\u032a\u033e\u0347\u034a\u034e\u0353\u0356\u0359\u035c"+
		"\u0363\u0368\u036c\u0371\u0375\u0377\u037b\u0380\u0389\u038e\u0392\u0398"+
		"\u039e\u03a2\u03a9\u03ad\u03b5\u03bc\u03bf\u03c8\u03cf\u03d4\u03d8\u03e0"+
		"\u03e4\u03f0\u03ff\u0403\u040d\u040f\u0414\u041e\u0428\u043a\u044b\u044d"+
		"\u0459\u0468\u046a\u0471\u0478\u0481\u0488\u0496\u049e\u04a3\u04a9\u04d5"+
		"\u04d7\u04f2\u04f9\u04fb\u0501\u0505\u0514\u0526\u052b\u052f\u0531\u0544"+
		"\u054a\u054d\u055e\u0563\u056a\u0573\u0578\u057c\u0587\u058f\u0593\u0595"+
		"\u059a\u059e\u05a2\u05ab\u05ad\u05b4\u05bc\u05bf\u05c7\u05d9\u05db\u05e6"+
		"\u05ed\u05f3\u05f7\u05fe\u0606\u060b\u060e\u061b\u062d\u0633\u063f\u0644"+
		"\u0648\u064d\u066b\u0679\u067e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}