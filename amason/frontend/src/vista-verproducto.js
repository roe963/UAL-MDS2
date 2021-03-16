import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@polymer/iron-icon/iron-icon.js';
import '@polymer/iron-iconset-svg/iron-iconset-svg.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

class VistaVerproducto extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%;">
 <vaadin-horizontal-layout class="header" style="width: 100%; flex-basis: var(--lumo-size-l); flex-shrink: 0; background-color: var(--lumo-contrast-10pct);">
  <vaadin-vertical-layout theme="spacing" style="padding-right: var(--lumo-space-m); padding-left: var(--lumo-space-m); align-self: center;">
   <h2 style="align-self: center;">Amason</h2>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="align-self: center;">
   <vaadin-button id="button-inicio">
     🏠 
   </vaadin-button>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="flex-grow: 1; align-self: center; padding-left: var(--lumo-space-xl); padding-bottom: var(--lumo-space-xs); padding-right: var(--lumo-space-xs); padding-top: var(--lumo-space-xs);">
   <vaadin-text-field style="align-self: stretch;" id="textfield-buscar"></vaadin-text-field>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="align-self: center;">
   <vaadin-button id="button-buscar">
     🔍 
   </vaadin-button>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="align-self: center; padding-right: var(--lumo-space-m); padding-left: var(--lumo-space-m);">
   <vaadin-button id="button-carrito">
     🛒 
   </vaadin-button>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="align-self: center; padding-right: var(--lumo-space-m);">
   <vaadin-button id="button-usuario">
     Usuario 
   </vaadin-button>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="flex-grow: 1; align-self: stretch; padding: var(--lumo-space-xl);">
  <vaadin-horizontal-layout theme="spacing">
   <vaadin-vertical-layout theme="spacing">
    <img style="flex-grow: 0; height: 40%; width: 80%; align-self: center;" id="img1-producto">
    <vaadin-horizontal-layout theme="spacing">
     <img style="padding: var(--lumo-space-xl); flex-grow: 0;" id="img2-producto">
     <img style="padding: var(--lumo-space-xl); flex-grow: 0;" id="img3-producto">
     <img style="padding: var(--lumo-space-xl); flex-grow: 0;" id="img4-producto">
     <img style="padding: var(--lumo-space-xl); flex-grow: 0;" id="img5-producto">
    </vaadin-horizontal-layout>
   </vaadin-vertical-layout>
  </vaadin-horizontal-layout>
  <vaadin-vertical-layout theme="spacing">
   <vaadin-horizontal-layout theme="spacing">
    <h4>Nombre</h4>
    <label style="align-self: center;" id="label-nombre">Label</label>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing">
    <h4>Categoría</h4>
    <label style="align-self: center;" id="label-categoria">Label</label>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing">
    <h4>Precio</h4>
    <label style="align-self: center;" id="label-precio">Label</label>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing">
    <h4>Valoración</h4>
    <iron-icon></iron-icon>
    <iron-iconset-svg></iron-iconset-svg>
    <label style="align-self: center;" id="label-nopiniones">0 opiniones</label>
   </vaadin-horizontal-layout>
   <vaadin-button>
     Comprar 
   </vaadin-button>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
 <vaadin-vertical-layout theme="spacing">
  <vaadin-horizontal-layout theme="spacing"></vaadin-horizontal-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-verproducto';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaVerproducto.is, VistaVerproducto);
