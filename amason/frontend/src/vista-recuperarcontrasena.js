import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-recuperarcontrasena`
 *
 * VistaRecuperarcontrasena element.
 *
 * @customElement
 * @polymer
 */
class VistaRecuperarcontrasena extends PolymerElement {

    static get template() {
        return html`
            <style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
        `;
    }

    static get is() {
        return 'vista-recuperarcontrasena';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaRecuperarcontrasena.is, VistaRecuperarcontrasena);
