/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.file.remote;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class SftpEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private static final Map<String, Object> ALL_OPTIONS;
    static {
        Map<String, Object> map = new CaseInsensitiveMap();
        map.put("host", java.lang.String.class);
        map.put("port", int.class);
        map.put("directoryName", java.lang.String.class);
        map.put("binary", boolean.class);
        map.put("charset", java.lang.String.class);
        map.put("disconnect", boolean.class);
        map.put("doneFileName", java.lang.String.class);
        map.put("fileName", java.lang.String.class);
        map.put("jschLoggingLevel", org.apache.camel.LoggingLevel.class);
        map.put("passiveMode", boolean.class);
        map.put("separator", org.apache.camel.component.file.remote.RemoteFileConfiguration.PathSeparator.class);
        map.put("fastExistsCheck", boolean.class);
        map.put("bridgeErrorHandler", boolean.class);
        map.put("delete", boolean.class);
        map.put("moveFailed", java.lang.String.class);
        map.put("noop", boolean.class);
        map.put("preMove", java.lang.String.class);
        map.put("preSort", boolean.class);
        map.put("recursive", boolean.class);
        map.put("sendEmptyMessageWhenIdle", boolean.class);
        map.put("streamDownload", boolean.class);
        map.put("download", boolean.class);
        map.put("exceptionHandler", org.apache.camel.spi.ExceptionHandler.class);
        map.put("exchangePattern", org.apache.camel.ExchangePattern.class);
        map.put("ignoreFileNotFoundOrPermissionError", boolean.class);
        map.put("inProgressRepository", org.apache.camel.spi.IdempotentRepository.class);
        map.put("localWorkDirectory", java.lang.String.class);
        map.put("onCompletionExceptionHandler", org.apache.camel.spi.ExceptionHandler.class);
        map.put("pollStrategy", org.apache.camel.spi.PollingConsumerPollStrategy.class);
        map.put("processStrategy", org.apache.camel.component.file.GenericFileProcessStrategy.class);
        map.put("useList", boolean.class);
        map.put("fileExist", org.apache.camel.component.file.GenericFileExist.class);
        map.put("flatten", boolean.class);
        map.put("jailStartingDirectory", boolean.class);
        map.put("lazyStartProducer", boolean.class);
        map.put("moveExisting", java.lang.String.class);
        map.put("tempFileName", java.lang.String.class);
        map.put("tempPrefix", java.lang.String.class);
        map.put("allowNullBody", boolean.class);
        map.put("chmod", java.lang.String.class);
        map.put("disconnectOnBatchComplete", boolean.class);
        map.put("eagerDeleteTargetFile", boolean.class);
        map.put("keepLastModified", boolean.class);
        map.put("moveExistingFileStrategy", org.apache.camel.component.file.strategy.FileMoveExistingStrategy.class);
        map.put("sendNoop", boolean.class);
        map.put("autoCreate", boolean.class);
        map.put("basicPropertyBinding", boolean.class);
        map.put("bindAddress", java.lang.String.class);
        map.put("bulkRequests", java.lang.Integer.class);
        map.put("compression", int.class);
        map.put("connectTimeout", int.class);
        map.put("existDirCheckUsingLs", boolean.class);
        map.put("maximumReconnectAttempts", int.class);
        map.put("proxy", com.jcraft.jsch.Proxy.class);
        map.put("reconnectDelay", long.class);
        map.put("serverAliveCountMax", int.class);
        map.put("serverAliveInterval", int.class);
        map.put("soTimeout", int.class);
        map.put("stepwise", boolean.class);
        map.put("synchronous", boolean.class);
        map.put("throwExceptionOnConnectFailed", boolean.class);
        map.put("timeout", int.class);
        map.put("antExclude", java.lang.String.class);
        map.put("antFilterCaseSensitive", boolean.class);
        map.put("antInclude", java.lang.String.class);
        map.put("eagerMaxMessagesPerPoll", boolean.class);
        map.put("exclude", java.lang.String.class);
        map.put("filter", org.apache.camel.component.file.GenericFileFilter.class);
        map.put("filterDirectory", java.lang.String.class);
        map.put("filterFile", java.lang.String.class);
        map.put("idempotent", java.lang.Boolean.class);
        map.put("idempotentKey", java.lang.String.class);
        map.put("idempotentRepository", org.apache.camel.spi.IdempotentRepository.class);
        map.put("include", java.lang.String.class);
        map.put("maxDepth", int.class);
        map.put("maxMessagesPerPoll", int.class);
        map.put("minDepth", int.class);
        map.put("move", java.lang.String.class);
        map.put("exclusiveReadLockStrategy", org.apache.camel.component.file.GenericFileExclusiveReadLockStrategy.class);
        map.put("readLock", java.lang.String.class);
        map.put("readLockCheckInterval", long.class);
        map.put("readLockDeleteOrphanLockFiles", boolean.class);
        map.put("readLockIdempotentReleaseAsync", boolean.class);
        map.put("readLockIdempotentReleaseAsyncPoolSize", int.class);
        map.put("readLockIdempotentReleaseDelay", int.class);
        map.put("readLockIdempotentReleaseExecutorService", java.util.concurrent.ScheduledExecutorService.class);
        map.put("readLockLoggingLevel", org.apache.camel.LoggingLevel.class);
        map.put("readLockMarkerFile", boolean.class);
        map.put("readLockMinAge", long.class);
        map.put("readLockMinLength", long.class);
        map.put("readLockRemoveOnCommit", boolean.class);
        map.put("readLockRemoveOnRollback", boolean.class);
        map.put("readLockTimeout", long.class);
        map.put("backoffErrorThreshold", int.class);
        map.put("backoffIdleThreshold", int.class);
        map.put("backoffMultiplier", int.class);
        map.put("delay", long.class);
        map.put("greedy", boolean.class);
        map.put("initialDelay", long.class);
        map.put("repeatCount", long.class);
        map.put("runLoggingLevel", org.apache.camel.LoggingLevel.class);
        map.put("scheduledExecutorService", java.util.concurrent.ScheduledExecutorService.class);
        map.put("scheduler", java.lang.Object.class);
        map.put("schedulerProperties", java.util.Map.class);
        map.put("startScheduler", boolean.class);
        map.put("timeUnit", java.util.concurrent.TimeUnit.class);
        map.put("useFixedDelay", boolean.class);
        map.put("ciphers", java.lang.String.class);
        map.put("keyPair", java.security.KeyPair.class);
        map.put("knownHosts", byte[].class);
        map.put("knownHostsFile", java.lang.String.class);
        map.put("knownHostsUri", java.lang.String.class);
        map.put("password", java.lang.String.class);
        map.put("preferredAuthentications", java.lang.String.class);
        map.put("privateKey", byte[].class);
        map.put("privateKeyFile", java.lang.String.class);
        map.put("privateKeyPassphrase", java.lang.String.class);
        map.put("privateKeyUri", java.lang.String.class);
        map.put("strictHostKeyChecking", java.lang.String.class);
        map.put("username", java.lang.String.class);
        map.put("useUserKnownHostsFile", boolean.class);
        map.put("shuffle", boolean.class);
        map.put("sortBy", java.lang.String.class);
        map.put("sorter", java.util.Comparator.class);
        ALL_OPTIONS = map;
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        SftpEndpoint target = (SftpEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "allownullbody":
        case "allowNullBody": target.setAllowNullBody(property(camelContext, boolean.class, value)); return true;
        case "antexclude":
        case "antExclude": target.setAntExclude(property(camelContext, java.lang.String.class, value)); return true;
        case "antfiltercasesensitive":
        case "antFilterCaseSensitive": target.setAntFilterCaseSensitive(property(camelContext, boolean.class, value)); return true;
        case "antinclude":
        case "antInclude": target.setAntInclude(property(camelContext, java.lang.String.class, value)); return true;
        case "autocreate":
        case "autoCreate": target.setAutoCreate(property(camelContext, boolean.class, value)); return true;
        case "backofferrorthreshold":
        case "backoffErrorThreshold": target.setBackoffErrorThreshold(property(camelContext, int.class, value)); return true;
        case "backoffidlethreshold":
        case "backoffIdleThreshold": target.setBackoffIdleThreshold(property(camelContext, int.class, value)); return true;
        case "backoffmultiplier":
        case "backoffMultiplier": target.setBackoffMultiplier(property(camelContext, int.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "binary": target.getConfiguration().setBinary(property(camelContext, boolean.class, value)); return true;
        case "bindaddress":
        case "bindAddress": target.getConfiguration().setBindAddress(property(camelContext, java.lang.String.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "bulkrequests":
        case "bulkRequests": target.getConfiguration().setBulkRequests(property(camelContext, java.lang.Integer.class, value)); return true;
        case "charset": target.setCharset(property(camelContext, java.lang.String.class, value)); return true;
        case "chmod": target.getConfiguration().setChmod(property(camelContext, java.lang.String.class, value)); return true;
        case "ciphers": target.getConfiguration().setCiphers(property(camelContext, java.lang.String.class, value)); return true;
        case "compression": target.getConfiguration().setCompression(property(camelContext, int.class, value)); return true;
        case "connecttimeout":
        case "connectTimeout": target.getConfiguration().setConnectTimeout(property(camelContext, int.class, value)); return true;
        case "delay": target.setDelay(property(camelContext, long.class, value)); return true;
        case "delete": target.setDelete(property(camelContext, boolean.class, value)); return true;
        case "disconnect": target.setDisconnect(property(camelContext, boolean.class, value)); return true;
        case "disconnectonbatchcomplete":
        case "disconnectOnBatchComplete": target.setDisconnectOnBatchComplete(property(camelContext, boolean.class, value)); return true;
        case "donefilename":
        case "doneFileName": target.setDoneFileName(property(camelContext, java.lang.String.class, value)); return true;
        case "download": target.setDownload(property(camelContext, boolean.class, value)); return true;
        case "eagerdeletetargetfile":
        case "eagerDeleteTargetFile": target.setEagerDeleteTargetFile(property(camelContext, boolean.class, value)); return true;
        case "eagermaxmessagesperpoll":
        case "eagerMaxMessagesPerPoll": target.setEagerMaxMessagesPerPoll(property(camelContext, boolean.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "exclude": target.setExclude(property(camelContext, java.lang.String.class, value)); return true;
        case "exclusivereadlockstrategy":
        case "exclusiveReadLockStrategy": target.setExclusiveReadLockStrategy(property(camelContext, org.apache.camel.component.file.GenericFileExclusiveReadLockStrategy.class, value)); return true;
        case "existdircheckusingls":
        case "existDirCheckUsingLs": target.getConfiguration().setExistDirCheckUsingLs(property(camelContext, boolean.class, value)); return true;
        case "fastexistscheck":
        case "fastExistsCheck": target.setFastExistsCheck(property(camelContext, boolean.class, value)); return true;
        case "fileexist":
        case "fileExist": target.setFileExist(property(camelContext, org.apache.camel.component.file.GenericFileExist.class, value)); return true;
        case "filename":
        case "fileName": target.setFileName(property(camelContext, java.lang.String.class, value)); return true;
        case "filter": target.setFilter(property(camelContext, org.apache.camel.component.file.GenericFileFilter.class, value)); return true;
        case "filterdirectory":
        case "filterDirectory": target.setFilterDirectory(property(camelContext, java.lang.String.class, value)); return true;
        case "filterfile":
        case "filterFile": target.setFilterFile(property(camelContext, java.lang.String.class, value)); return true;
        case "flatten": target.setFlatten(property(camelContext, boolean.class, value)); return true;
        case "greedy": target.setGreedy(property(camelContext, boolean.class, value)); return true;
        case "idempotent": target.setIdempotent(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "idempotentkey":
        case "idempotentKey": target.setIdempotentKey(property(camelContext, java.lang.String.class, value)); return true;
        case "idempotentrepository":
        case "idempotentRepository": target.setIdempotentRepository(property(camelContext, org.apache.camel.spi.IdempotentRepository.class, value)); return true;
        case "ignorefilenotfoundorpermissionerror":
        case "ignoreFileNotFoundOrPermissionError": target.getConfiguration().setIgnoreFileNotFoundOrPermissionError(property(camelContext, boolean.class, value)); return true;
        case "inprogressrepository":
        case "inProgressRepository": target.setInProgressRepository(property(camelContext, org.apache.camel.spi.IdempotentRepository.class, value)); return true;
        case "include": target.setInclude(property(camelContext, java.lang.String.class, value)); return true;
        case "initialdelay":
        case "initialDelay": target.setInitialDelay(property(camelContext, long.class, value)); return true;
        case "jailstartingdirectory":
        case "jailStartingDirectory": target.setJailStartingDirectory(property(camelContext, boolean.class, value)); return true;
        case "jschlogginglevel":
        case "jschLoggingLevel": target.getConfiguration().setJschLoggingLevel(property(camelContext, org.apache.camel.LoggingLevel.class, value)); return true;
        case "keeplastmodified":
        case "keepLastModified": target.setKeepLastModified(property(camelContext, boolean.class, value)); return true;
        case "keypair":
        case "keyPair": target.getConfiguration().setKeyPair(property(camelContext, java.security.KeyPair.class, value)); return true;
        case "knownhosts":
        case "knownHosts": target.getConfiguration().setKnownHosts(property(camelContext, byte[].class, value)); return true;
        case "knownhostsfile":
        case "knownHostsFile": target.getConfiguration().setKnownHostsFile(property(camelContext, java.lang.String.class, value)); return true;
        case "knownhostsuri":
        case "knownHostsUri": target.getConfiguration().setKnownHostsUri(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "localworkdirectory":
        case "localWorkDirectory": target.setLocalWorkDirectory(property(camelContext, java.lang.String.class, value)); return true;
        case "maxdepth":
        case "maxDepth": target.setMaxDepth(property(camelContext, int.class, value)); return true;
        case "maxmessagesperpoll":
        case "maxMessagesPerPoll": target.setMaxMessagesPerPoll(property(camelContext, int.class, value)); return true;
        case "maximumreconnectattempts":
        case "maximumReconnectAttempts": target.setMaximumReconnectAttempts(property(camelContext, int.class, value)); return true;
        case "mindepth":
        case "minDepth": target.setMinDepth(property(camelContext, int.class, value)); return true;
        case "move": target.setMove(property(camelContext, java.lang.String.class, value)); return true;
        case "moveexisting":
        case "moveExisting": target.setMoveExisting(property(camelContext, java.lang.String.class, value)); return true;
        case "moveexistingfilestrategy":
        case "moveExistingFileStrategy": target.setMoveExistingFileStrategy(property(camelContext, org.apache.camel.component.file.strategy.FileMoveExistingStrategy.class, value)); return true;
        case "movefailed":
        case "moveFailed": target.setMoveFailed(property(camelContext, java.lang.String.class, value)); return true;
        case "noop": target.setNoop(property(camelContext, boolean.class, value)); return true;
        case "oncompletionexceptionhandler":
        case "onCompletionExceptionHandler": target.setOnCompletionExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "passivemode":
        case "passiveMode": target.getConfiguration().setPassiveMode(property(camelContext, boolean.class, value)); return true;
        case "password": target.getConfiguration().setPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "pollstrategy":
        case "pollStrategy": target.setPollStrategy(property(camelContext, org.apache.camel.spi.PollingConsumerPollStrategy.class, value)); return true;
        case "premove":
        case "preMove": target.setPreMove(property(camelContext, java.lang.String.class, value)); return true;
        case "presort":
        case "preSort": target.setPreSort(property(camelContext, boolean.class, value)); return true;
        case "preferredauthentications":
        case "preferredAuthentications": target.getConfiguration().setPreferredAuthentications(property(camelContext, java.lang.String.class, value)); return true;
        case "privatekey":
        case "privateKey": target.getConfiguration().setPrivateKey(property(camelContext, byte[].class, value)); return true;
        case "privatekeyfile":
        case "privateKeyFile": target.getConfiguration().setPrivateKeyFile(property(camelContext, java.lang.String.class, value)); return true;
        case "privatekeypassphrase":
        case "privateKeyPassphrase": target.getConfiguration().setPrivateKeyPassphrase(property(camelContext, java.lang.String.class, value)); return true;
        case "privatekeyuri":
        case "privateKeyUri": target.getConfiguration().setPrivateKeyUri(property(camelContext, java.lang.String.class, value)); return true;
        case "processstrategy":
        case "processStrategy": target.setProcessStrategy(property(camelContext, org.apache.camel.component.file.GenericFileProcessStrategy.class, value)); return true;
        case "proxy": target.setProxy(property(camelContext, com.jcraft.jsch.Proxy.class, value)); return true;
        case "readlock":
        case "readLock": target.setReadLock(property(camelContext, java.lang.String.class, value)); return true;
        case "readlockcheckinterval":
        case "readLockCheckInterval": target.setReadLockCheckInterval(property(camelContext, long.class, value)); return true;
        case "readlockdeleteorphanlockfiles":
        case "readLockDeleteOrphanLockFiles": target.setReadLockDeleteOrphanLockFiles(property(camelContext, boolean.class, value)); return true;
        case "readlockidempotentreleaseasync":
        case "readLockIdempotentReleaseAsync": target.setReadLockIdempotentReleaseAsync(property(camelContext, boolean.class, value)); return true;
        case "readlockidempotentreleaseasyncpoolsize":
        case "readLockIdempotentReleaseAsyncPoolSize": target.setReadLockIdempotentReleaseAsyncPoolSize(property(camelContext, int.class, value)); return true;
        case "readlockidempotentreleasedelay":
        case "readLockIdempotentReleaseDelay": target.setReadLockIdempotentReleaseDelay(property(camelContext, int.class, value)); return true;
        case "readlockidempotentreleaseexecutorservice":
        case "readLockIdempotentReleaseExecutorService": target.setReadLockIdempotentReleaseExecutorService(property(camelContext, java.util.concurrent.ScheduledExecutorService.class, value)); return true;
        case "readlocklogginglevel":
        case "readLockLoggingLevel": target.setReadLockLoggingLevel(property(camelContext, org.apache.camel.LoggingLevel.class, value)); return true;
        case "readlockmarkerfile":
        case "readLockMarkerFile": target.setReadLockMarkerFile(property(camelContext, boolean.class, value)); return true;
        case "readlockminage":
        case "readLockMinAge": target.setReadLockMinAge(property(camelContext, long.class, value)); return true;
        case "readlockminlength":
        case "readLockMinLength": target.setReadLockMinLength(property(camelContext, long.class, value)); return true;
        case "readlockremoveoncommit":
        case "readLockRemoveOnCommit": target.setReadLockRemoveOnCommit(property(camelContext, boolean.class, value)); return true;
        case "readlockremoveonrollback":
        case "readLockRemoveOnRollback": target.setReadLockRemoveOnRollback(property(camelContext, boolean.class, value)); return true;
        case "readlocktimeout":
        case "readLockTimeout": target.setReadLockTimeout(property(camelContext, long.class, value)); return true;
        case "reconnectdelay":
        case "reconnectDelay": target.setReconnectDelay(property(camelContext, java.time.Duration.class, value).toMillis()); return true;
        case "recursive": target.setRecursive(property(camelContext, boolean.class, value)); return true;
        case "repeatcount":
        case "repeatCount": target.setRepeatCount(property(camelContext, long.class, value)); return true;
        case "runlogginglevel":
        case "runLoggingLevel": target.setRunLoggingLevel(property(camelContext, org.apache.camel.LoggingLevel.class, value)); return true;
        case "scheduledexecutorservice":
        case "scheduledExecutorService": target.setScheduledExecutorService(property(camelContext, java.util.concurrent.ScheduledExecutorService.class, value)); return true;
        case "scheduler": target.setScheduler(property(camelContext, java.lang.Object.class, value)); return true;
        case "schedulerproperties":
        case "schedulerProperties": target.setSchedulerProperties(property(camelContext, java.util.Map.class, value)); return true;
        case "sendemptymessagewhenidle":
        case "sendEmptyMessageWhenIdle": target.setSendEmptyMessageWhenIdle(property(camelContext, boolean.class, value)); return true;
        case "sendnoop":
        case "sendNoop": target.getConfiguration().setSendNoop(property(camelContext, boolean.class, value)); return true;
        case "separator": target.getConfiguration().setSeparator(property(camelContext, org.apache.camel.component.file.remote.RemoteFileConfiguration.PathSeparator.class, value)); return true;
        case "serveralivecountmax":
        case "serverAliveCountMax": target.getConfiguration().setServerAliveCountMax(property(camelContext, int.class, value)); return true;
        case "serveraliveinterval":
        case "serverAliveInterval": target.getConfiguration().setServerAliveInterval(property(camelContext, int.class, value)); return true;
        case "shuffle": target.setShuffle(property(camelContext, boolean.class, value)); return true;
        case "sotimeout":
        case "soTimeout": target.getConfiguration().setSoTimeout(property(camelContext, int.class, value)); return true;
        case "sortby":
        case "sortBy": target.setSortBy(property(camelContext, java.lang.String.class, value)); return true;
        case "sorter": target.setSorter(property(camelContext, java.util.Comparator.class, value)); return true;
        case "startscheduler":
        case "startScheduler": target.setStartScheduler(property(camelContext, boolean.class, value)); return true;
        case "stepwise": target.getConfiguration().setStepwise(property(camelContext, boolean.class, value)); return true;
        case "streamdownload":
        case "streamDownload": target.getConfiguration().setStreamDownload(property(camelContext, boolean.class, value)); return true;
        case "stricthostkeychecking":
        case "strictHostKeyChecking": target.getConfiguration().setStrictHostKeyChecking(property(camelContext, java.lang.String.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "tempfilename":
        case "tempFileName": target.setTempFileName(property(camelContext, java.lang.String.class, value)); return true;
        case "tempprefix":
        case "tempPrefix": target.setTempPrefix(property(camelContext, java.lang.String.class, value)); return true;
        case "throwexceptiononconnectfailed":
        case "throwExceptionOnConnectFailed": target.getConfiguration().setThrowExceptionOnConnectFailed(property(camelContext, boolean.class, value)); return true;
        case "timeunit":
        case "timeUnit": target.setTimeUnit(property(camelContext, java.util.concurrent.TimeUnit.class, value)); return true;
        case "timeout": target.getConfiguration().setTimeout(property(camelContext, int.class, value)); return true;
        case "usefixeddelay":
        case "useFixedDelay": target.setUseFixedDelay(property(camelContext, boolean.class, value)); return true;
        case "uselist":
        case "useList": target.getConfiguration().setUseList(property(camelContext, boolean.class, value)); return true;
        case "useuserknownhostsfile":
        case "useUserKnownHostsFile": target.getConfiguration().setUseUserKnownHostsFile(property(camelContext, boolean.class, value)); return true;
        case "username": target.getConfiguration().setUsername(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        return ALL_OPTIONS;
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        SftpEndpoint target = (SftpEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "allownullbody":
        case "allowNullBody": return target.isAllowNullBody();
        case "antexclude":
        case "antExclude": return target.getAntExclude();
        case "antfiltercasesensitive":
        case "antFilterCaseSensitive": return target.isAntFilterCaseSensitive();
        case "antinclude":
        case "antInclude": return target.getAntInclude();
        case "autocreate":
        case "autoCreate": return target.isAutoCreate();
        case "backofferrorthreshold":
        case "backoffErrorThreshold": return target.getBackoffErrorThreshold();
        case "backoffidlethreshold":
        case "backoffIdleThreshold": return target.getBackoffIdleThreshold();
        case "backoffmultiplier":
        case "backoffMultiplier": return target.getBackoffMultiplier();
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "binary": return target.getConfiguration().isBinary();
        case "bindaddress":
        case "bindAddress": return target.getConfiguration().getBindAddress();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "bulkrequests":
        case "bulkRequests": return target.getConfiguration().getBulkRequests();
        case "charset": return target.getCharset();
        case "chmod": return target.getConfiguration().getChmod();
        case "ciphers": return target.getConfiguration().getCiphers();
        case "compression": return target.getConfiguration().getCompression();
        case "connecttimeout":
        case "connectTimeout": return target.getConfiguration().getConnectTimeout();
        case "delay": return target.getDelay();
        case "delete": return target.isDelete();
        case "disconnect": return target.isDisconnect();
        case "disconnectonbatchcomplete":
        case "disconnectOnBatchComplete": return target.isDisconnectOnBatchComplete();
        case "donefilename":
        case "doneFileName": return target.getDoneFileName();
        case "download": return target.isDownload();
        case "eagerdeletetargetfile":
        case "eagerDeleteTargetFile": return target.isEagerDeleteTargetFile();
        case "eagermaxmessagesperpoll":
        case "eagerMaxMessagesPerPoll": return target.isEagerMaxMessagesPerPoll();
        case "exceptionhandler":
        case "exceptionHandler": return target.getExceptionHandler();
        case "exchangepattern":
        case "exchangePattern": return target.getExchangePattern();
        case "exclude": return target.getExclude();
        case "exclusivereadlockstrategy":
        case "exclusiveReadLockStrategy": return target.getExclusiveReadLockStrategy();
        case "existdircheckusingls":
        case "existDirCheckUsingLs": return target.getConfiguration().isExistDirCheckUsingLs();
        case "fastexistscheck":
        case "fastExistsCheck": return target.isFastExistsCheck();
        case "fileexist":
        case "fileExist": return target.getFileExist();
        case "filename":
        case "fileName": return target.getFileName();
        case "filter": return target.getFilter();
        case "filterdirectory":
        case "filterDirectory": return target.getFilterDirectory();
        case "filterfile":
        case "filterFile": return target.getFilterFile();
        case "flatten": return target.isFlatten();
        case "greedy": return target.isGreedy();
        case "idempotent": return target.getIdempotent();
        case "idempotentkey":
        case "idempotentKey": return target.getIdempotentKey();
        case "idempotentrepository":
        case "idempotentRepository": return target.getIdempotentRepository();
        case "ignorefilenotfoundorpermissionerror":
        case "ignoreFileNotFoundOrPermissionError": return target.getConfiguration().isIgnoreFileNotFoundOrPermissionError();
        case "inprogressrepository":
        case "inProgressRepository": return target.getInProgressRepository();
        case "include": return target.getInclude();
        case "initialdelay":
        case "initialDelay": return target.getInitialDelay();
        case "jailstartingdirectory":
        case "jailStartingDirectory": return target.isJailStartingDirectory();
        case "jschlogginglevel":
        case "jschLoggingLevel": return target.getConfiguration().getJschLoggingLevel();
        case "keeplastmodified":
        case "keepLastModified": return target.isKeepLastModified();
        case "keypair":
        case "keyPair": return target.getConfiguration().getKeyPair();
        case "knownhosts":
        case "knownHosts": return target.getConfiguration().getKnownHosts();
        case "knownhostsfile":
        case "knownHostsFile": return target.getConfiguration().getKnownHostsFile();
        case "knownhostsuri":
        case "knownHostsUri": return target.getConfiguration().getKnownHostsUri();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "localworkdirectory":
        case "localWorkDirectory": return target.getLocalWorkDirectory();
        case "maxdepth":
        case "maxDepth": return target.getMaxDepth();
        case "maxmessagesperpoll":
        case "maxMessagesPerPoll": return target.getMaxMessagesPerPoll();
        case "maximumreconnectattempts":
        case "maximumReconnectAttempts": return target.getMaximumReconnectAttempts();
        case "mindepth":
        case "minDepth": return target.getMinDepth();
        case "move": return target.getMove();
        case "moveexisting":
        case "moveExisting": return target.getMoveExisting();
        case "moveexistingfilestrategy":
        case "moveExistingFileStrategy": return target.getMoveExistingFileStrategy();
        case "movefailed":
        case "moveFailed": return target.getMoveFailed();
        case "noop": return target.isNoop();
        case "oncompletionexceptionhandler":
        case "onCompletionExceptionHandler": return target.getOnCompletionExceptionHandler();
        case "passivemode":
        case "passiveMode": return target.getConfiguration().isPassiveMode();
        case "password": return target.getConfiguration().getPassword();
        case "pollstrategy":
        case "pollStrategy": return target.getPollStrategy();
        case "premove":
        case "preMove": return target.getPreMove();
        case "presort":
        case "preSort": return target.isPreSort();
        case "preferredauthentications":
        case "preferredAuthentications": return target.getConfiguration().getPreferredAuthentications();
        case "privatekey":
        case "privateKey": return target.getConfiguration().getPrivateKey();
        case "privatekeyfile":
        case "privateKeyFile": return target.getConfiguration().getPrivateKeyFile();
        case "privatekeypassphrase":
        case "privateKeyPassphrase": return target.getConfiguration().getPrivateKeyPassphrase();
        case "privatekeyuri":
        case "privateKeyUri": return target.getConfiguration().getPrivateKeyUri();
        case "processstrategy":
        case "processStrategy": return target.getProcessStrategy();
        case "proxy": return target.getProxy();
        case "readlock":
        case "readLock": return target.getReadLock();
        case "readlockcheckinterval":
        case "readLockCheckInterval": return target.getReadLockCheckInterval();
        case "readlockdeleteorphanlockfiles":
        case "readLockDeleteOrphanLockFiles": return target.isReadLockDeleteOrphanLockFiles();
        case "readlockidempotentreleaseasync":
        case "readLockIdempotentReleaseAsync": return target.isReadLockIdempotentReleaseAsync();
        case "readlockidempotentreleaseasyncpoolsize":
        case "readLockIdempotentReleaseAsyncPoolSize": return target.getReadLockIdempotentReleaseAsyncPoolSize();
        case "readlockidempotentreleasedelay":
        case "readLockIdempotentReleaseDelay": return target.getReadLockIdempotentReleaseDelay();
        case "readlockidempotentreleaseexecutorservice":
        case "readLockIdempotentReleaseExecutorService": return target.getReadLockIdempotentReleaseExecutorService();
        case "readlocklogginglevel":
        case "readLockLoggingLevel": return target.getReadLockLoggingLevel();
        case "readlockmarkerfile":
        case "readLockMarkerFile": return target.isReadLockMarkerFile();
        case "readlockminage":
        case "readLockMinAge": return target.getReadLockMinAge();
        case "readlockminlength":
        case "readLockMinLength": return target.getReadLockMinLength();
        case "readlockremoveoncommit":
        case "readLockRemoveOnCommit": return target.isReadLockRemoveOnCommit();
        case "readlockremoveonrollback":
        case "readLockRemoveOnRollback": return target.isReadLockRemoveOnRollback();
        case "readlocktimeout":
        case "readLockTimeout": return target.getReadLockTimeout();
        case "reconnectdelay":
        case "reconnectDelay": return target.getReconnectDelay();
        case "recursive": return target.isRecursive();
        case "repeatcount":
        case "repeatCount": return target.getRepeatCount();
        case "runlogginglevel":
        case "runLoggingLevel": return target.getRunLoggingLevel();
        case "scheduledexecutorservice":
        case "scheduledExecutorService": return target.getScheduledExecutorService();
        case "scheduler": return target.getScheduler();
        case "schedulerproperties":
        case "schedulerProperties": return target.getSchedulerProperties();
        case "sendemptymessagewhenidle":
        case "sendEmptyMessageWhenIdle": return target.isSendEmptyMessageWhenIdle();
        case "sendnoop":
        case "sendNoop": return target.getConfiguration().isSendNoop();
        case "separator": return target.getConfiguration().getSeparator();
        case "serveralivecountmax":
        case "serverAliveCountMax": return target.getConfiguration().getServerAliveCountMax();
        case "serveraliveinterval":
        case "serverAliveInterval": return target.getConfiguration().getServerAliveInterval();
        case "shuffle": return target.isShuffle();
        case "sotimeout":
        case "soTimeout": return target.getConfiguration().getSoTimeout();
        case "sortby":
        case "sortBy": return target.getSortBy();
        case "sorter": return target.getSorter();
        case "startscheduler":
        case "startScheduler": return target.isStartScheduler();
        case "stepwise": return target.getConfiguration().isStepwise();
        case "streamdownload":
        case "streamDownload": return target.getConfiguration().isStreamDownload();
        case "stricthostkeychecking":
        case "strictHostKeyChecking": return target.getConfiguration().getStrictHostKeyChecking();
        case "synchronous": return target.isSynchronous();
        case "tempfilename":
        case "tempFileName": return target.getTempFileName();
        case "tempprefix":
        case "tempPrefix": return target.getTempPrefix();
        case "throwexceptiononconnectfailed":
        case "throwExceptionOnConnectFailed": return target.getConfiguration().isThrowExceptionOnConnectFailed();
        case "timeunit":
        case "timeUnit": return target.getTimeUnit();
        case "timeout": return target.getConfiguration().getTimeout();
        case "usefixeddelay":
        case "useFixedDelay": return target.isUseFixedDelay();
        case "uselist":
        case "useList": return target.getConfiguration().isUseList();
        case "useuserknownhostsfile":
        case "useUserKnownHostsFile": return target.getConfiguration().isUseUserKnownHostsFile();
        case "username": return target.getConfiguration().getUsername();
        default: return null;
        }
    }
}

