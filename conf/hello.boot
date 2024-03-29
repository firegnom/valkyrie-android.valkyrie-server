###################################################
#
# SGS Bootup configuration
#
# This file is used to configure system environment
# information for booting up the Project Darkstar
# Server.  Unless otherwise stated, the commented
# out value for each property is equal to its
# default value.
#
###################################################

# This property denotes the installation directory
# for the Project Darkstar server.  If not set,
# this is automatically determined based on the
# location of the boot jar
#
#SGS_HOME = 

# Set this property if you wish to change the default
# directory where the Project Darkstar server searches
# for application jar files.
#
#SGS_DEPLOY = ${SGS_HOME}/deploy

# Set this property if you wish to change the default
# directory where the Project Darkstar server searches
# for extension jar files.
#
#SGS_EXT = ${SGS_HOME}/ext

# Set this property to change the default properties
# file used to configure the Project Darkstar Kernel.  The
# SGS_PROPERTIES defines a set of default configuration
# properties that can be overridden by the application's
# specific properties file.
#
#SGS_PROPERTIES = ${SGS_HOME}/conf/sgs-server.properties

# Set this property to change the logging
# properties file used when running the Project Darkstar
# Server.
#
#SGS_LOGGING = ${SGS_HOME}/conf/sgs-logging.properties

# Set this property to configure a filename that the server
# will redirect standard output to.  If this is left
# blank, standard output will be printed directly to the
# console.  By default, this property is blank.
#
#SGS_OUTPUT = 

# Set this property to configure the flavor of BerkeleyDB
# that is to be used when running the Project Darkstar Server.
# Valid values for this property are:
#  db - To denote using the BerkeleyDB Native edition
#  je - To denote using the BerkeleyDB Java edition
#  custom - To denote using neither
# The default value for this property is db.  If the value of
# this property is set to custom, neither the db nor je jar
# files from the ${SGS_HOME}/lib directory will be included
# on the classpath.
#
BDB_TYPE = je

# Set this property to change the location of the 
# BerkeleyDB native libraries to use when running the 
# Project Darkstar server.  By default this will be
# automatically set by detecting platform and architecture
# type.
#
#BDB_NATIVES = 

# Set this property to include additional native library paths.
# If this property is set, it will be combined with the value
# of ${BDB_NATIVES} to form the java.library.path passed to 
# the JVM at runtime.
#
#CUSTOM_NATIVES =

# Set this property to include additional jar files on the 
# classpath to be used when running the Project Darkstar JVM.
# The use of this property is typically not necessary unless:
#   * the value of ${BDB_TYPE} is set to custom AND
#   * the custom bdb type being used is included in a jar
#     whose filename begins with "db-" or "je-"
# In most other cases, dropping additional jar files into the
# ${SGS_DEPLOY} or ${SGS_HOME}/lib directory is sufficient
# for them to be included on the classpath.
#
#CUSTOM_CLASSPATH_ADD =

# Set this property to change the port used to listen for JMX
# connections. This value is passed to the server VM as the value
# for the standard com.sun.management.jmxremote.port property.
#
#JMX_PORT = 62974

# Set this property to false to enable JMX security. By default
# the com.sun.management.jmxremote.authenticate and the
# com.sun.management.jmxremote.ssl properties are set to false
# so that JMX connections are available with no further
# configuration.
#
#DISABLE_JMX_SECURITY = true

# Set this property to change the JDK used
#
#JAVA_HOME = 

# This property will be used to pass additional command line
# options to the JVM at runtime.  In order to include options that
# include spaces, the ENTIRE token must be surrounded by double 
# quotes.  For example, this is a valid configuration:
#
#    JAVA_OPTS = "-Dfoo=foo bar"
#
# while this is invalid:
#
#    JAVA_OPTS = -Dfoo="foo bar"
#
# By default, the JAVA_OPTS property is empty and is NOT equal
# to the value shown below.
#
# System properties used to enable JMX remote monitoring should be included in
# these additional command line options.  In order to enable remote JMX 
# monitoring, the port on which JMX will be listening must be specified with
# -Dcom.sun.management.jmxremote.port=XXXX.  All remote monitoring solutions
# should use the built-in JMX security, but for testing it is convenient to
# disable all security, using -Dcom.sun.management.jmxremote.authenticate=false
# and -Dcom.sun.management.jmxremote.ssl=false.
#    
#JAVA_OPTS = -server -XX:+AggressiveOpts -Xmx768M -XX:NewRatio=1