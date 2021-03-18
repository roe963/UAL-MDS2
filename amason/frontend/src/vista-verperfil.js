import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-radio-button/src/vaadin-radio-group.js';
import '@vaadin/vaadin-radio-button/src/vaadin-radio-button.js';
import './vista-datosdecompra.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

class VistaVerperfil extends PolymerElement {

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
  <vaadin-vertical-layout theme="spacing" style="align-self: center; flex-grow: 1; flex-shrink: 1;">
   <vaadin-text-field style="flex-grow: 0; flex-shrink: 1; align-self: stretch; padding-top: var(--lumo-space-xs); padding-bottom: var(--lumo-space-xs); padding-left: var(--lumo-space-xl); padding-right: var(--lumo-space-xs);" id="textfield-buscar"></vaadin-text-field>
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
 <vaadin-vertical-layout theme="spacing" style="padding: var(--lumo-space-xl); align-self: stretch; flex-grow: 1;">
  <h4>Mi cuenta</h4>
  <vaadin-horizontal-layout theme="spacing" style="padding: var(--lumo-space-xl); padding-top: var(--lumo-space-xs); align-self: center; flex-grow: 0; padding-bottom: var(--lumo-space-xs);">
   <vaadin-vertical-layout theme="spacing" style="padding: var(--lumo-space-xl); padding-top: var(--lumo-space-xs); padding-bottom: var(--lumo-space-xs);">
    <vaadin-text-field label="Nombre y Apellidos" id="textfield-nombre" style="flex-shrink: 1;"></vaadin-text-field>
    <vaadin-text-field label="Correo electrónico" name="textfield-email"></vaadin-text-field>
   </vaadin-vertical-layout>
   <vaadin-radio-group theme="vertical" id="radio-estado" style="padding: var(--lumo-space-xl); padding-top: var(--lumo-space-xs); padding-bottom: var(--lumo-space-xs);">
    <label>Estado</label>
    <vaadin-radio-button>
     <div>
      Operativo
     </div>
    </vaadin-radio-button>
    <vaadin-radio-button>
     <div>
      No operativo
     </div>
    </vaadin-radio-button>
   </vaadin-radio-group>
   <vista-datosdecompra style="padding: var(--lumo-space-xl); padding-top: var(--lumo-space-xs); padding-bottom: var(--lumo-space-xs);"></vista-datosdecompra>
   <vaadin-vertical-layout theme="spacing" style="padding: var(--lumo-space-xl); padding-top: var(--lumo-space-xs); padding-bottom: var(--lumo-space-xs);">
    <img id="img-fotousuario" style="padding: var(--lumo-space-xl); align-self: center;">
    <vaadin-text-field label="Foto de usuario" id="textfield-fotousuario"></vaadin-text-field>
   </vaadin-vertical-layout>
  </vaadin-horizontal-layout>
  <vaadin-button id="button-guardar" style="align-self: center;">
   Guardar
  </vaadin-button>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-verperfil';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaVerperfil.is, VistaVerperfil);
