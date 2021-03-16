import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-login/src/vaadin-login-form.js';

class VistaIniciarsesion extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-login-form id="login"></vaadin-login-form>
`;
    }

    static get is() {
        return 'vista-iniciarsesion';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaIniciarsesion.is, VistaIniciarsesion);
