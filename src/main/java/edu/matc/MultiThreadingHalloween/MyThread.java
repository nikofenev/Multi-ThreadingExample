package edu.matc.MultiThreadingHalloween;import org.apache.log4j.Logger;public class MyThread extends Thread {    private final Logger logger = Logger.getLogger(this.getClass());    public final void run() {        logger.info("In edu.matc.MultiThreadingHalloween.MyThread");    }}