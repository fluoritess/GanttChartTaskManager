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
/******/ 	return __webpack_require__(__webpack_require__.s = "./sources/locale/locale_sv.js");
/******/ })
/************************************************************************/
/******/ ({

/***/ "./sources/locale/locale_sv.js":
/*!*************************************!*\
  !*** ./sources/locale/locale_sv.js ***!
  \*************************************/
/*! no static exports found */
/***/ (function(module, exports) {

/*
	Translation by Peter Eriksson
 */
gantt.locale = {
	date: {
		month_full: ["Januari", "Februari", "Mars", "April", "Maj", "Juni", "Juli", "Augusti", "September", "Oktober", "November", "December"],
		month_short: ["Jan", "Feb", "Mar", "Apr", "Maj", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dec"],
		day_full: ["Söndag", "Måndag", "Tisdag", "Onsdag", "Torsdag", "Fredag", "Lördag"],
		day_short: ["Sön", "Mån", "Tis", "Ons", "Tor", "Fre", "Lör"]
	},
	labels: {
		new_task: "Ny uppgift",
		dhx_cal_today_button: "Idag",
		day_tab: "Dag",
		week_tab: "Vecka",
		month_tab: "Månad",
		new_event: "Ny händelse",
		icon_save: "Spara",
		icon_cancel: "Avbryt",
		icon_details: "Detajer",
		icon_edit: "Ändra",
		icon_delete: "Ta bort",
		confirm_closing: "",
		confirm_deleting: "Är du säker på att du vill ta bort händelsen permanent?",
		section_description: "Beskrivning",
		section_time: "Tid",
		section_type: "Typ",

		/* grid columns */

		column_wbs : "WBS",
		column_text: "Uppgiftsnamn",
		column_start_date: "Starttid",
		column_duration: "Varaktighet",
		column_add: "",

		/* link confirmation */

		link: "Länk",
		confirm_link_deleting: "kommer tas bort",
		link_start: " (start)",
		link_end: " (slut)",
		type_task: "Uppgift",
		type_project: "Projekt",
		type_milestone: "Milstolpe",

		minutes: "Minuter",
		hours: "Timmar",
		days: "Dagar",
		weeks: "Veckor",
		months: "Månader",
		years: "År",

		/* message popup */
		message_ok: "OK",
		message_cancel: "Avbryt"
	}
};

/***/ })

/******/ });