/*
@license

dhtmlxGantt v.6.0.4 Standard
This software is covered by GPL license. You also can obtain Commercial or Enterprise license to use it in non-GPL project - please contact sales@dhtmlx.com. Usage without proper license is prohibited.

(c) Dinamenta, UAB.

*/
/******/ (function(modules) { // webpackBootstrap
/******/ 	// The module cache
/******/ 	var installedModules = {};
/******/
/******/ 	// The require function
/******/ 	function __webpack_require__(moduleId) {
/******/
/******/ 		// Check if module is in cache
/******/ 		if(installedModules[moduleId]) {
/******/ 			return installedModules[moduleId].exports;
/******/ 		}
/******/ 		// Create a new module (and put it into the cache)
/******/ 		var module = installedModules[moduleId] = {
/******/ 			i: moduleId,
/******/ 			l: false,
/******/ 			exports: {}
/******/ 		};
/******/
/******/ 		// Execute the module function
/******/ 		modules[moduleId].call(module.exports, module, module.exports, __webpack_require__);
/******/
/******/ 		// Flag the module as loaded
/******/ 		module.l = true;
/******/
/******/ 		// Return the exports of the module
/******/ 		return module.exports;
/******/ 	}
/******/
/******/
/******/ 	// expose the modules object (__webpack_modules__)
/******/ 	__webpack_require__.m = modules;
/******/
/******/ 	// expose the module cache
/******/ 	__webpack_require__.c = installedModules;
/******/
/******/ 	// define getter function for harmony exports
/******/ 	__webpack_require__.d = function(exports, name, getter) {
/******/ 		if(!__webpack_require__.o(exports, name)) {
/******/ 			Object.defineProperty(exports, name, { enumerable: true, get: getter });
/******/ 		}
/******/ 	};
/******/
/******/ 	// define __esModule on exports
/******/ 	__webpack_require__.r = function(exports) {
/******/ 		if(typeof Symbol !== 'undefined' && Symbol.toStringTag) {
/******/ 			Object.defineProperty(exports, Symbol.toStringTag, { value: 'Module' });
/******/ 		}
/******/ 		Object.defineProperty(exports, '__esModule', { value: true });
/******/ 	};
/******/
/******/ 	// create a fake namespace object
/******/ 	// mode & 1: value is a module id, require it
/******/ 	// mode & 2: merge all properties of value into the ns
/******/ 	// mode & 4: return value when already ns object
/******/ 	// mode & 8|1: behave like require
/******/ 	__webpack_require__.t = function(value, mode) {
/******/ 		if(mode & 1) value = __webpack_require__(value);
/******/ 		if(mode & 8) return value;
/******/ 		if((mode & 4) && typeof value === 'object' && value && value.__esModule) return value;
/******/ 		var ns = Object.create(null);
/******/ 		__webpack_require__.r(ns);
/******/ 		Object.defineProperty(ns, 'default', { enumerable: true, value: value });
/******/ 		if(mode & 2 && typeof value != 'string') for(var key in value) __webpack_require__.d(ns, key, function(key) { return value[key]; }.bind(null, key));
/******/ 		return ns;
/******/ 	};
/******/
/******/ 	// getDefaultExport function for compatibility with non-harmony modules
/******/ 	__webpack_require__.n = function(module) {
/******/ 		var getter = module && module.__esModule ?
/******/ 			function getDefault() { return module['default']; } :
/******/ 			function getModuleExports() { return module; };
/******/ 		__webpack_require__.d(getter, 'a', getter);
/******/ 		return getter;
/******/ 	};
/******/
/******/ 	// Object.prototype.hasOwnProperty.call
/******/ 	__webpack_require__.o = function(object, property) { return Object.prototype.hasOwnProperty.call(object, property); };
/******/
/******/ 	// __webpack_public_path__
/******/ 	__webpack_require__.p = "/codebase/sources/";
/******/
/******/
/******/ 	// Load entry module and return exports
/******/ 	return __webpack_require__(__webpack_require__.s = "./sources/locale/locale_de.js");
/******/ })
/************************************************************************/
/******/ ({

/***/ "./sources/locale/locale_de.js":
/*!*************************************!*\
  !*** ./sources/locale/locale_de.js ***!
  \*************************************/
/*! no static exports found */
/***/ (function(module, exports) {

gantt.locale = {
	date: {
		month_full: [" Januar", " Februar", " März ", " April", " Mai", " Juni", " Juli", " August", " September ", " Oktober", " November ", " Dezember"],
		month_short: ["Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez"],
		day_full: [ "Sonntag", "Montag", "Dienstag", " Mittwoch", " Donnerstag", "Freitag", "Samstag"],
		day_short: ["So", "Mo", "Di", "Mi", "Do", "Fr", "Sa"]
	},
	labels: {
		new_task: "Neue Aufgabe",
		dhx_cal_today_button: "Heute",
		day_tab: "Tag",
		week_tab: "Woche",
		month_tab: "Monat",
		new_event: "Neuer eintrag",
		icon_save: "Speichern",
		icon_cancel: "Abbrechen",
		icon_details: "Details",
		icon_edit: "Ändern",
		icon_delete: "Löschen",
		confirm_closing: "", //"Ihre Veränderungen werden verloren sein, wollen Sie ergänzen? "
		confirm_deleting: "Der Eintrag wird gelöscht",
		section_description: "Beschreibung",
		section_time: "Zeitspanne",
		section_type:"Type",
		/* grid columns */

		column_wbs : "PSP",
		column_text : "Task-Namen",
		column_start_date : "Startzeit",
		column_duration : "Dauer",
		column_add : "",

		/* link confirmation */
		link: "Link",
		confirm_link_deleting:"werden gelöscht",
		link_start: "(starten)",
		link_end: "(ende)",

		type_task: "Task",
		type_project: "Project",
		type_milestone: "Milestone",


		minutes: "Minuten",
		hours: "Stunden",
		days: "Tage",
		weeks: "Wochen",
		months: "Monate",
		years: "Jahre",

		/* message popup */
		message_ok: "OK",
		message_cancel: "Abbrechen"
	}
};



/***/ })

/******/ });