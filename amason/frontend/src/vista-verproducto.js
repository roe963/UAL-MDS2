import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@polymer/iron-icon/iron-icon.js';
import '@vaadin/vaadin-tabs/src/vaadin-tabs.js';
import '@vaadin/vaadin-tabs/src/vaadin-tab.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import './vista-valoraciones.js';

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
 <vaadin-horizontal-layout class="header" style="width: 100%; flex-basis: var(--lumo-size-l); flex-shrink: 0;">
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
 <vaadin-horizontal-layout theme="spacing" style="flex-grow: 0; align-self: stretch; padding: var(--lumo-space-xl); background-color: var(--lumo-contrast-10pct); margin: var(--lumo-space-xl); margin-top: var(--lumo-space-xs); margin-bottom: var(--lumo-space-xs);">
  <vaadin-horizontal-layout theme="spacing">
   <vaadin-vertical-layout theme="spacing">
    <img style="flex-grow: 0; height: 100%; width: 80%; align-self: center;" id="img1-producto">
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
    <iron-icon icon="vaadin:star" style="align-self: center;" id="icon1-valoracion"></iron-icon>
    <iron-icon icon="vaadin:star-o" style="align-self: center;" id="icon2-valoracion"></iron-icon>
    <iron-icon icon="vaadin:star-half-left-o" style="align-self: center;" id="icon3-valoracion"></iron-icon>
    <iron-icon icon="vaadin:star-half-right-o" style="align-self: center;" id="icon4-valoracion"></iron-icon>
    <iron-icon icon="vaadin:star" style="align-self: center;" id="icon5-valoracion"></iron-icon>
    <label style="align-self: center;" id="label-nopiniones">0 opiniones</label>
   </vaadin-horizontal-layout>
   <vaadin-button id="button-comprar">
     Comprar 
   </vaadin-button>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
 <vaadin-vertical-layout theme="spacing" style="align-self: stretch; flex-grow: 1; margin: var(--lumo-space-xl); margin-top: var(--lumo-space-xs); margin-bottom: var(--lumo-space-xs);">
  <vaadin-tabs style="align-self: stretch;" orientation="horizontal" selected="0">
   <vaadin-tab selected>
    Descripción
   </vaadin-tab>
   <vaadin-tab>
    Valoraciones
   </vaadin-tab>
  </vaadin-tabs>
  <vaadin-vertical-layout theme="spacing" style="align-self: stretch; flex-grow: 1;">
   <label id="label-descripcion">Descripción</label>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="align-self: stretch; flex-grow: 1;">
   <vista-valoraciones></vista-valoraciones>
  </vaadin-vertical-layout>
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
